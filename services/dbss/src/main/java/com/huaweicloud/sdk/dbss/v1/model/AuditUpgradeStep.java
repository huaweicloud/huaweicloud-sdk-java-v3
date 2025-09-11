package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuditUpgradeStep
 */
public class AuditUpgradeStep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_code")

    private String resultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    public AuditUpgradeStep withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 消息
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public AuditUpgradeStep withResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }

    /**
     * 结果码
     * @return resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public AuditUpgradeStep withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /**
     * 步骤名称
     * @return stepName
     */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public AuditUpgradeStep withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 升级时间
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditUpgradeStep that = (AuditUpgradeStep) obj;
        return Objects.equals(this.msg, that.msg) && Objects.equals(this.resultCode, that.resultCode)
            && Objects.equals(this.stepName, that.stepName) && Objects.equals(this.time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(msg, resultCode, stepName, time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditUpgradeStep {\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
