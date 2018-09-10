package com.wemal.common.model;

import java.io.Serializable;
import java.util.List;

/**
 * 
 * 分页通用泛型类
 *
 * @ClassName PageData
 * @author pyc
 * @since 2016年8月20日
 * @version 
 * @param <T>
 */
public class PageData<T> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long totalElements;
	private List<T> content;
	
	public PageData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PageData(long totalElements, List<T> content) {
		super();
		this.totalElements = totalElements;
		this.content = content;
	}
	public long getTotalElements() {
		return totalElements;
	}
	public void setTotalElements(long totalElements) {
		this.totalElements = totalElements;
	}
	public List<T> getContent() {
		return content;
	}
	public void setContent(List<T> content) {
		this.content = content;
	}
	
	

}
