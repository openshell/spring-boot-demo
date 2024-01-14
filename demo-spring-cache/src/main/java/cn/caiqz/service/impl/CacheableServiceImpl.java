package cn.caiqz.service.impl;

import cn.caiqz.service.CacheableService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <p>
 *
 * </p>
 *
 * @author openshell
 * @since 2023/12/30
 */
@Service
public class CacheableServiceImpl implements CacheableService {
    @Override
    @Cacheable(cacheNames = "test", cacheManager = "cacheManager")
    public String demo1() {
        System.out.println("执行demo1方法内部");
        return "demo1-value";
    }
}
