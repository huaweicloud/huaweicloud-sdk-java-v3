package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAimSendDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_sign")

    private String smsSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListAimSendDetailsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListAimSendDetailsRequest withTplId(String tplId) {
        this.tplId = tplId;
        return this;
    }

    /**
     * 智能信息模板ID。
     * @return tplId
     */
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    public ListAimSendDetailsRequest withSmsSign(String smsSign) {
        this.smsSign = smsSign;
        return this;
    }

    /**
     * 签名。
     * @return smsSign
     */
    public String getSmsSign() {
        return smsSign;
    }

    public void setSmsSign(String smsSign) {
        this.smsSign = smsSign;
    }

    public ListAimSendDetailsRequest withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识。  > 手机号码或者任何的唯一标识，唯一标识不超过64个字符。发送智能信息时则必须填客户的手机号码。此处为手机号。样例为：130****0001。 
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public ListAimSendDetailsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     *  发送开始时间。格式为：2019-10-12T07:20:50Z。  > 需同时传入end_time才能生效，单独传begin_time不会作为过滤条件。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListAimSendDetailsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 发送结束时间。格式为：2019-10-12T07:20:50Z。  > 需同时传入begin_time才能生效，单独传end_time不会作为过滤条件。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAimSendDetailsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量，表示从此偏移量开始查询，offset大于等于0。  >为提高查询效率，offset+limit须小于等于10000，超出范围查询为空。 
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListAimSendDetailsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量。 
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAimSendDetailsRequest listAimSendDetailsRequest = (ListAimSendDetailsRequest) o;
        return Objects.equals(this.taskId, listAimSendDetailsRequest.taskId)
            && Objects.equals(this.tplId, listAimSendDetailsRequest.tplId)
            && Objects.equals(this.smsSign, listAimSendDetailsRequest.smsSign)
            && Objects.equals(this.custFlag, listAimSendDetailsRequest.custFlag)
            && Objects.equals(this.beginTime, listAimSendDetailsRequest.beginTime)
            && Objects.equals(this.endTime, listAimSendDetailsRequest.endTime)
            && Objects.equals(this.offset, listAimSendDetailsRequest.offset)
            && Objects.equals(this.limit, listAimSendDetailsRequest.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId, tplId, smsSign, custFlag, beginTime, endTime, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimSendDetailsRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    smsSign: ").append(toIndentedString(smsSign)).append("\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
