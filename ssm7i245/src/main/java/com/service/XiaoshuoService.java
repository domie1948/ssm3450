package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoshuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoshuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoshuoView;


/**
 * 小说
 *
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
public interface XiaoshuoService extends IService<XiaoshuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoshuoVO> selectListVO(Wrapper<XiaoshuoEntity> wrapper);
   	
   	XiaoshuoVO selectVO(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
   	
   	List<XiaoshuoView> selectListView(Wrapper<XiaoshuoEntity> wrapper);
   	
   	XiaoshuoView selectView(@Param("ew") Wrapper<XiaoshuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoshuoEntity> wrapper);
   	
}

