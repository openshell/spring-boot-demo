package cn.caiqz.controller;

import cn.caiqz.service.CacheableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *
 * </p>
 *
 * @author openshell
 * @since 2023/12/30
 */
@RestController
public class CacheableController {
    @Resource
    private CacheableService cacheableService;


    @GetMapping("/api/cache/demo1")
    public ResponseEntity<String> demo1(){
    return ResponseEntity.ok(cacheableService.demo1());
    }
}
