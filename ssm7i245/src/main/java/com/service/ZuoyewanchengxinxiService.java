package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyewanchengxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyewanchengxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyewanchengxinxiView;


/**
 * 作业完成信息
 *
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface ZuoyewanchengxinxiService extends IService<ZuoyewanchengxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyewanchengxinxiVO> selectListVO(Wrapper<ZuoyewanchengxinxiEntity> wrapper);
   	
   	ZuoyewanchengxinxiVO selectVO(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
   	
   	List<ZuoyewanchengxinxiView> selectListView(Wrapper<ZuoyewanchengxinxiEntity> wrapper);
   	
   	ZuoyewanchengxinxiView selectView(@Param("ew") Wrapper<ZuoyewanchengxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyewanchengxinxiEntity> wrapper);
   	
}

