package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshuoleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoleixingView;


/**
 * 小说类型
 *
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface XiaoshuoleixingService extends IService<XiaoshuoleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshuoleixingVO> selectListVO(Wrapper<XiaoshuoleixingEntity> wrapper);
   	
   	XiaoshuoleixingVO selectVO(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
   	
   	List<XiaoshuoleixingView> selectListView(Wrapper<XiaoshuoleixingEntity> wrapper);
   	
   	XiaoshuoleixingView selectView(@Param("ew") Wrapper<XiaoshuoleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshuoleixingEntity> wrapper);
   	
}

