package com.entity.view;

import com.entity.ZuoyepigaixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作业批改信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 12:15:13
 */
@TableName("zuoyepigaixinxi")
public class ZuoyepigaixinxiView  extends ZuoyepigaixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuoyepigaixinxiView(){
	}
 
 	public ZuoyepigaixinxiView(ZuoyepigaixinxiEntity zuoyepigaixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zuoyepigaixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
