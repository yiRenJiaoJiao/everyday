package com.everyDayUse.action;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.util.logging.Logger;
import com.opensymphony.xwork2.util.logging.LoggerFactory;

/**
 * action 的父类用来存放action的通用代码
 * 使用反省保证代码的通用性
 * @author Administrator
 *
 * @param <T>
 */
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {

	/**
	 * 使用protect修饰的变量或者方法，子类和自身可以使用
	 */
	protected T model;

	@Override
	/**
	 * 给model进行赋值
	 */
	public T getModel() {
		return model;
	}
	/**
	 * 使用反射获取模型实例
	 */
	public BaseAction() {
		//通过反射获取当前对象的字节码对象
		Type superclass = this.getClass().getGenericSuperclass();
		//将父类的字节码对象强转成参数化类型，及所需要的泛型的类型
		ParameterizedType parameterizedType = (ParameterizedType) superclass;
		//获取参数的第一个参数类型类
		Class<T> modelClass = (Class<T>) parameterizedType
				.getActualTypeArguments()[0];
		try {
			//实例化对象
			model = modelClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}

	}
	//将数据压入root栈
	/**
	 * 将结果压入root栈栈顶
	 * @param obj
	 */
	public void pushToValueSatackroot(Object  obj){
		ActionContext.getContext().getValueStack().push(obj);
	}
	//将数据存入root站中的map中
	/**
	 * 将结果放入root栈中的map中
	 * @param key
	 * @param value
	 */
	public void setToValueStackMap(String key , Object value){
		ActionContext.getContext().getValueStack().set(key, value);
	}
	//将数据放入put站
	/**
	 * 将结果放入map栈中
	 * @param key
	 * @param value
	 */
	public void putToValueStackMap(String key , Object value){
		ActionContext.getContext().put(key, value);
	}
	
	//使用action 的属性将数据压入栈顶
	
	protected Object result;
	/**
	 * action被加载时，会将action被压入栈顶，同时action中的所有set方法的被做为action的属性一起压入栈顶。
	 * @return resource
	 */
	public Object setResource(){ //action被加载时，会将action被压入栈顶，同时action中的所有set方法的被做为action的属性一起压入栈顶。
		return result;
	}

	// 日志记录器——抽取
	protected final Logger LOG = LoggerFactory.getLogger(BaseAction.class);
}
