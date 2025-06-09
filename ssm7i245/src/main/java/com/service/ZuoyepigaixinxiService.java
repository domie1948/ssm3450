package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZuoyepigaixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZuoyepigaixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZuoyepigaixinxiView;


/**
 * 作业批改信息
 *
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface ZuoyepigaixinxiService extends IService<ZuoyepigaixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZuoyepigaixinxiVO> selectListVO(Wrapper<ZuoyepigaixinxiEntity> wrapper);
   	
   	ZuoyepigaixinxiVO selectVO(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
   	
   	List<ZuoyepigaixinxiView> selectListView(Wrapper<ZuoyepigaixinxiEntity> wrapper);
   	
   	ZuoyepigaixinxiView selectView(@Param("ew") Wrapper<ZuoyepigaixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZuoyepigaixinxiEntity> wrapper);
   	
}

