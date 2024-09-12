package com.entity.view;

import com.entity.FankuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 反馈信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-26 09:01:48
 */
@TableName("fankuixinxi")
public class FankuixinxiView  extends FankuixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public FankuixinxiView(){
	}
 
 	public FankuixinxiView(FankuixinxiEntity fankuixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, fankuixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
