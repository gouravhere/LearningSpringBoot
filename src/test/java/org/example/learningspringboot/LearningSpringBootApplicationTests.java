package org.example.learningspringboot;

import org.example.learningspringboot.services.PaymentSerive;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LearningSpringBootApplicationTests {

    @Autowired
    private PaymentSerive paymentSerive;
    @Test
    public void testDependencyInjection() {
        assertNotNull(paymentSerive);
    }

}
