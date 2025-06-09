package com.entity.view;

import com.entity.ZuoyewanchengxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业完成信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
@TableName("zuoyewanchengxinxi")
public class ZuoyewanchengxinxiView  extends ZuoyewanchengxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyewanchengxinxiView(){
	}
 
 	public ZuoyewanchengxinxiView(ZuoyewanchengxinxiEntity zuoyewanchengxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyewanchengxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
