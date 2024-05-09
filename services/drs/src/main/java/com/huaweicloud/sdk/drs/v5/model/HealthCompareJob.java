package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 健康对比任务。
 */
public class HealthCompareJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compute_type")

    private String computeType;

    public HealthCompareJob withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 对比任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HealthCompareJob withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 对比类型： - object_comparison：对象对比。 - lines：行对比。 - account：用户对比。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public HealthCompareJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态。 - WAITING_FOR_RUNNING：等待启动中 - RUNNING：运行中 - SUCCESSFUL：完成 - FAILED：失败 - CANCELLED：已取消 - TIMEOUT_INTERRUPT：超时中断 - FULL_DOING：全量校验中 - INCRE_DOING：增量校验中
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HealthCompareJob withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 对比开始时间，UTC时间。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HealthCompareJob withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 对比结束时间，UTC时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public HealthCompareJob withComputeType(String computeType) {
        this.computeType = computeType;
        return this;
    }

    /**
     * 对比计算资源。
     * @return computeType
     */
    public String getComputeType() {
        return computeType;
    }

    public void setComputeType(String computeType) {
        this.computeType = computeType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthCompareJob that = (HealthCompareJob) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.status, that.status) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.computeType, that.computeType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, status, startTime, endTime, computeType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCompareJob {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
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
