package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 子任务详情
 */
public class SubStepDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_step_id")

    private String subStepId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_step_name")

    private String subStepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_step_status")

    private String subStepStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    public SubStepDetail withSubStepId(String subStepId) {
        this.subStepId = subStepId;
        return this;
    }

    /**
     * 任务id
     * @return subStepId
     */
    public String getSubStepId() {
        return subStepId;
    }

    public void setSubStepId(String subStepId) {
        this.subStepId = subStepId;
    }

    public SubStepDetail withSubStepName(String subStepName) {
        this.subStepName = subStepName;
        return this;
    }

    /**
     * 任务名
     * @return subStepName
     */
    public String getSubStepName() {
        return subStepName;
    }

    public void setSubStepName(String subStepName) {
        this.subStepName = subStepName;
    }

    public SubStepDetail withSubStepStatus(String subStepStatus) {
        this.subStepStatus = subStepStatus;
        return this;
    }

    /**
     * 任务状态
     * @return subStepStatus
     */
    public String getSubStepStatus() {
        return subStepStatus;
    }

    public void setSubStepStatus(String subStepStatus) {
        this.subStepStatus = subStepStatus;
    }

    public SubStepDetail withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务启动时间，格式为2020-06-17T07:38:42.503Z
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public SubStepDetail withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务结束时间，格式为2020-06-17T07:38:42.503Z
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public SubStepDetail withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 子任务的附加属性详情
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public SubStepDetail withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubStepDetail that = (SubStepDetail) obj;
        return Objects.equals(this.subStepId, that.subStepId) && Objects.equals(this.subStepName, that.subStepName)
            && Objects.equals(this.subStepStatus, that.subStepStatus) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.errorCode, that.errorCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subStepId, subStepName, subStepStatus, beginTime, endTime, detail, errorCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubStepDetail {\n");
        sb.append("    subStepId: ").append(toIndentedString(subStepId)).append("\n");
        sb.append("    subStepName: ").append(toIndentedString(subStepName)).append("\n");
        sb.append("    subStepStatus: ").append(toIndentedString(subStepStatus)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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
