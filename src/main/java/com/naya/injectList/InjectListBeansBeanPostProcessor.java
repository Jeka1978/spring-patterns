package com.naya.injectList;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import java.beans.Introspector;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Evgeny Borisov
 */
@Component
public class InjectListBeansBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    private ApplicationContext context;

    @SneakyThrows
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Set<Field> fields = ReflectionUtils.getAllFields(bean.getClass(), field -> field.isAnnotationPresent(InjectListOfBeans.class));
        for (Field field : fields) {
            InjectListOfBeans annotation = field.getAnnotation(InjectListOfBeans.class);
            Stream.Builder<Object> builder = Stream.builder();
            Class<?>[] classes = annotation.value();
            for (Class<?> aClass : classes) {

                builder.add(context.getBean(Introspector.decapitalize(aClass.getSimpleName())));
            }
            List<Object> list = builder.build().collect(Collectors.toList());
            field.setAccessible(true);
            field.set(bean, list);
        }
        return bean;
    }
}
