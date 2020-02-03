package org.nipu.po.order.clients;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HystrixClientFallback implements ProductSpecificationRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);
    @Override
    public Object existsById(String specificationId) {
        LOGGER.error("Error during getting specificationId = {} from PC", specificationId);
        return null;
    }
}
