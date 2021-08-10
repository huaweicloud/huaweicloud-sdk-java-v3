package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** 操作进度信息 */
public class ProcessInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_name")

    private String stepName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_steps")

    private Map<String, SubDetail> subSteps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serial_num")

    private Long serialNum;

    public ProcessInfo withStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    /** 操作名
     * 
     * @return stepName */
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public ProcessInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /** 操作状态
     * 
     * @return status */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ProcessInfo withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /** 操作详情
     * 
     * @return detail */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ProcessInfo withSubSteps(Map<String, SubDetail> subSteps) {
        this.subSteps = subSteps;
        return this;
    }

    public ProcessInfo putSubStepsItem(String key, SubDetail subStepsItem) {
        if (this.subSteps == null) {
            this.subSteps = new HashMap<>();
        }
        this.subSteps.put(key, subStepsItem);
        return this;
    }

    public ProcessInfo withSubSteps(Consumer<Map<String, SubDetail>> subStepsSetter) {
        if (this.subSteps == null) {
            this.subSteps = new HashMap<>();
        }
        subStepsSetter.accept(this.subSteps);
        return this;
    }

    /** 子操作, \"map[string][SubDetail] key:子操作名 value:子操作结果\"
     * 
     * @return subSteps */
    public Map<String, SubDetail> getSubSteps() {
        return subSteps;
    }

    public void setSubSteps(Map<String, SubDetail> subSteps) {
        this.subSteps = subSteps;
    }

    public ProcessInfo withSerialNum(Long serialNum) {
        this.serialNum = serialNum;
        return this;
    }

    /** 序列号
     * 
     * @return serialNum */
    public Long getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(Long serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProcessInfo processInfo = (ProcessInfo) o;
        return Objects.equals(this.stepName, processInfo.stepName) && Objects.equals(this.status, processInfo.status)
            && Objects.equals(this.detail, processInfo.detail) && Objects.equals(this.subSteps, processInfo.subSteps)
            && Objects.equals(this.serialNum, processInfo.serialNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepName, status, detail, subSteps, serialNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProcessInfo {\n");
        sb.append("    stepName: ").append(toIndentedString(stepName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    subSteps: ").append(toIndentedString(subSteps)).append("\n");
        sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
