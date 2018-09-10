/**************************************************
 *
 *    AMNET Copyright (c) 2004-2017
 *
 *    Package:     org.am.modules.common.model.activiti
 *    Filename:    TaskDetailsModel.java
 *
 *    @author:     ln
 *    @since:      2016年8月13日
 *    @version:    
 *
 **************************************************/
package com.wemall.activiti.model;

import java.io.Serializable;
import java.util.Date;

/**
 * TODO
 *
 * @ClassName TaskDetailsModel
 * @author ln
 * @since 2016年8月13日
 * @version 
 */
public class TaskDetailsModel implements Serializable {
    /**
     * @Field @serialVersionUID : TODO(描述)
     */
    private static final long serialVersionUID = -3977593367328785200L;
    private String id;
    //发起者
    private String initiator;
    //发起时间
    private Date createTime;
    //提交者
    private String submitter;
    //接收者
    private String recipient;
    //状态
    private String state;
    //单号
    private String orderNo;
    //subject
    private String subject;
    public String getOrderNo() {
        return orderNo;
    }
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getInitiator() {
        return initiator;
    }
    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    public String getSubmitter() {
        return submitter;
    }
    public void setSubmitter(String submitter) {
        this.submitter = submitter;
    }
    public String getRecipient() {
        return recipient;
    }
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }

}
