package com.kitchen.cook;

import com.kitchen.persist.mapper.KtRegionMapper;
import com.kitchen.persist.model.KtRegion;
import com.kitchen.persist.model.KtRegionExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User：lianggl
 * Date：2016/8/19
 * Time：16:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-test.xml")
public class MybatisSpringTest extends AbstractJUnit4SpringContextTests {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private KtRegionMapper regionMapper;

    @Test
    public void testEnvironment() {
        KtRegionExample regionExample = new KtRegionExample();
        List<KtRegion> regionList = regionMapper.selectByExample(regionExample);
        for(int i = 0; i < 10; i++) {
            logger.info(regionList.get(i).getName());
        }
    }
}
