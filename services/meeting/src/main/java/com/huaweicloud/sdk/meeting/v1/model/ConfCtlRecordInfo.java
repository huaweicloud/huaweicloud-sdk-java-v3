package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 会控操作信息
 */
public class ConfCtlRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateTime")

    private Long operateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateSource")

    private String operateSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator")

    private String operator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateCode")

    private String operateCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operationObject")

    private String operationObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operateResult")

    private String operateResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    public ConfCtlRecordInfo withOperateTime(Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * 操作时间（UTC时间，单位毫秒）。
     * @return operateTime
     */
    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(Long operateTime) {
        this.operateTime = operateTime;
    }

    public ConfCtlRecordInfo withOperateSource(String operateSource) {
        this.operateSource = operateSource;
        return this;
    }

    /**
     * 操作来源。
     * @return operateSource
     */
    public String getOperateSource() {
        return operateSource;
    }

    public void setOperateSource(String operateSource) {
        this.operateSource = operateSource;
    }

    public ConfCtlRecordInfo withOperator(String operator) {
        this.operator = operator;
        return this;
    }

    /**
     * 操作者。
     * @return operator
     */
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public ConfCtlRecordInfo withOperateCode(String operateCode) {
        this.operateCode = operateCode;
        return this;
    }

    /**
     * 操作描述。
     * @return operateCode
     */
    public String getOperateCode() {
        return operateCode;
    }

    public void setOperateCode(String operateCode) {
        this.operateCode = operateCode;
    }

    public ConfCtlRecordInfo withOperationObject(String operationObject) {
        this.operationObject = operationObject;
        return this;
    }

    /**
     * 被操作对象。
     * @return operationObject
     */
    public String getOperationObject() {
        return operationObject;
    }

    public void setOperationObject(String operationObject) {
        this.operationObject = operationObject;
    }

    public ConfCtlRecordInfo withOperateResult(String operateResult) {
        this.operateResult = operateResult;
        return this;
    }

    /**
     * 操作结果。
     * @return operateResult
     */
    public String getOperateResult() {
        return operateResult;
    }

    public void setOperateResult(String operateResult) {
        this.operateResult = operateResult;
    }

    public ConfCtlRecordInfo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 详情。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfCtlRecordInfo confCtlRecordInfo = (ConfCtlRecordInfo) o;
        return Objects.equals(this.operateTime, confCtlRecordInfo.operateTime)
            && Objects.equals(this.operateSource, confCtlRecordInfo.operateSource)
            && Objects.equals(this.operator, confCtlRecordInfo.operator)
            && Objects.equals(this.operateCode, confCtlRecordInfo.operateCode)
            && Objects.equals(this.operationObject, confCtlRecordInfo.operationObject)
            && Objects.equals(this.operateResult, confCtlRecordInfo.operateResult)
            && Objects.equals(this.detail, confCtlRecordInfo.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateTime, operateSource, operator, operateCode, operationObject, operateResult, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfCtlRecordInfo {\n");
        sb.append("    operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("    operateSource: ").append(toIndentedString(operateSource)).append("\n");
        sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
        sb.append("    operateCode: ").append(toIndentedString(operateCode)).append("\n");
        sb.append("    operationObject: ").append(toIndentedString(operationObject)).append("\n");
        sb.append("    operateResult: ").append(toIndentedString(operateResult)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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
