package com.kitchen.persist.mapper;

import com.kitchen.persist.model.KtRegion;
import com.kitchen.persist.model.KtRegionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KtRegionMapper {
    int countByExample(KtRegionExample example);

    int deleteByExample(KtRegionExample example);

    int deleteByPrimaryKey(Long id);

    int insert(KtRegion record);

    int insertSelective(KtRegion record);

    List<KtRegion> selectByExample(KtRegionExample example);

    KtRegion selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") KtRegion record, @Param("example") KtRegionExample example);

    int updateByExample(@Param("record") KtRegion record, @Param("example") KtRegionExample example);

    int updateByPrimaryKeySelective(KtRegion record);

    int updateByPrimaryKey(KtRegion record);
}