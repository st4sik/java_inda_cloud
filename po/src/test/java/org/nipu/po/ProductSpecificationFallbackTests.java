package org.nipu.po;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nipu.po.order.clients.ProductSpecificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.containsString;

@RunWith(SpringRunner.class)
@SpringBootTest(properties = {
        "feign.hystrix.enabled=true"
})
public class ProductSpecificationFallbackTests {
    @Autowired
    private ProductSpecificationRepository productSpecificationRepository;

    @Rule
    public final OutputCapture outputCapture = new OutputCapture();

    @Before
    public void setup() {
        outputCapture.reset();
    }

    @Test
    public void testExistsByIdWithFailFallback() {
        productSpecificationRepository.existsById("7777");
        outputCapture.expect(containsString("Error during getting specificationId = 7777 from PC"));
    }
}
