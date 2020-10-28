package com.naya.lazy_scanning;

import com.naya.check.OneService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Evgeny Borisov
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MockConf.class)

public class ConfTest {


    @Test
    public void name() {
        System.out.println(123);
    }
}