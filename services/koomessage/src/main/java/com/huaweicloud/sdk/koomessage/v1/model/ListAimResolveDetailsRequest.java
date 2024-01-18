package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListAimResolveDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_id")

    private String tplId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tpl_name")

    private String tplName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cust_flag")

    private String custFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_sign")

    private String smsSign;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aim_url")

    private String aimUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolved_status")

    private String resolvedStatus;

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

    public ListAimResolveDetailsRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 解析任务ID或者发送任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ListAimResolveDetailsRequest withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ListAimResolveDetailsRequest withTplId(String tplId) {
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

    public ListAimResolveDetailsRequest withTplName(String tplName) {
        this.tplName = tplName;
        return this;
    }

    /**
     * 智能信息模板名称。
     * @return tplName
     */
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    public ListAimResolveDetailsRequest withCustFlag(String custFlag) {
        this.custFlag = custFlag;
        return this;
    }

    /**
     * 创建解析任务时填写用户唯一标识，手机号码或者任何的唯一标识，唯一标识不超过64个字符。发送智能信息时则必须填客户的手机号码。此处为手机号。样例为：130****0001。
     * @return custFlag
     */
    public String getCustFlag() {
        return custFlag;
    }

    public void setCustFlag(String custFlag) {
        this.custFlag = custFlag;
    }

    public ListAimResolveDetailsRequest withSmsSign(String smsSign) {
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

    public ListAimResolveDetailsRequest withAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
        return this;
    }

    /**
     * 智能信息短链，通过自己的短信渠道发送时，需要把该短链添加到短信模板中，并确保发送短信时的签名与创建短链时的签名保持一致。
     * @return aimUrl
     */
    public String getAimUrl() {
        return aimUrl;
    }

    public void setAimUrl(String aimUrl) {
        this.aimUrl = aimUrl;
    }

    public ListAimResolveDetailsRequest withResolvedStatus(String resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
        return this;
    }

    /**
     * 解析状态。 - success：解析成功  - fail：解析失败  - unresolved：未解析
     * @return resolvedStatus
     */
    public String getResolvedStatus() {
        return resolvedStatus;
    }

    public void setResolvedStatus(String resolvedStatus) {
        this.resolvedStatus = resolvedStatus;
    }

    public ListAimResolveDetailsRequest withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 短链创建开始时间。格式为：2019-10-12T07:20:50Z。  > 需同时传入end_time才能生效，单独传begin_time不会作为过滤条件。缺省：查询最近二十四小时数据。 > > 仅支持查询最近1年内创建的短链。 
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListAimResolveDetailsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 短链创建结束时间。格式为：2019-10-12T07:20:50Z。  > 需同时传入begin_time才能生效，单独传end_time不会作为过滤条件。缺省：查询最近二十四小时数据。 
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListAimResolveDetailsRequest withOffset(Integer offset) {
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

    public ListAimResolveDetailsRequest withLimit(Integer limit) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAimResolveDetailsRequest that = (ListAimResolveDetailsRequest) obj;
        return Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskName, that.taskName)
            && Objects.equals(this.tplId, that.tplId) && Objects.equals(this.tplName, that.tplName)
            && Objects.equals(this.custFlag, that.custFlag) && Objects.equals(this.smsSign, that.smsSign)
            && Objects.equals(this.aimUrl, that.aimUrl) && Objects.equals(this.resolvedStatus, that.resolvedStatus)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskId,
            taskName,
            tplId,
            tplName,
            custFlag,
            smsSign,
            aimUrl,
            resolvedStatus,
            beginTime,
            endTime,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAimResolveDetailsRequest {\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    tplId: ").append(toIndentedString(tplId)).append("\n");
        sb.append("    tplName: ").append(toIndentedString(tplName)).append("\n");
        sb.append("    custFlag: ").append(toIndentedString(custFlag)).append("\n");
        sb.append("    smsSign: ").append(toIndentedString(smsSign)).append("\n");
        sb.append("    aimUrl: ").append(toIndentedString(aimUrl)).append("\n");
        sb.append("    resolvedStatus: ").append(toIndentedString(resolvedStatus)).append("\n");
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
