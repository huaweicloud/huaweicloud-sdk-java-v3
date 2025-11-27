package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UCSTaskSpec
 */
public class UCSTaskSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobID")

    private String jobID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private String target;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetType")

    private String targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waitTimeOut")

    private Integer waitTimeOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runway")

    private String runway;

    public UCSTaskSpec withJobID(String jobID) {
        this.jobID = jobID;
        return this;
    }

    /**
     * 所属job的ID
     * @return jobID
     */
    public String getJobID() {
        return jobID;
    }

    public void setJobID(String jobID) {
        this.jobID = jobID;
    }

    public UCSTaskSpec withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * 执行目标
     * @return target
     */
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public UCSTaskSpec withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 执行目标类型
     * @return targetType
     */
    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public UCSTaskSpec withWaitTimeOut(Integer waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
        return this;
    }

    /**
     * Task执行等待时间，单位：秒
     * @return waitTimeOut
     */
    public Integer getWaitTimeOut() {
        return waitTimeOut;
    }

    public void setWaitTimeOut(Integer waitTimeOut) {
        this.waitTimeOut = waitTimeOut;
    }

    public UCSTaskSpec withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Task类别
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UCSTaskSpec withRunway(String runway) {
        this.runway = runway;
        return this;
    }

    /**
     * 执行方式：parallel和serial二选一
     * @return runway
     */
    public String getRunway() {
        return runway;
    }

    public void setRunway(String runway) {
        this.runway = runway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UCSTaskSpec that = (UCSTaskSpec) obj;
        return Objects.equals(this.jobID, that.jobID) && Objects.equals(this.target, that.target)
            && Objects.equals(this.targetType, that.targetType) && Objects.equals(this.waitTimeOut, that.waitTimeOut)
            && Objects.equals(this.type, that.type) && Objects.equals(this.runway, that.runway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobID, target, targetType, waitTimeOut, type, runway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UCSTaskSpec {\n");
        sb.append("    jobID: ").append(toIndentedString(jobID)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    waitTimeOut: ").append(toIndentedString(waitTimeOut)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    runway: ").append(toIndentedString(runway)).append("\n");
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
