package com.huaweicloud.sdk.cloudpipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipelineLatestRunStageStatusList
 */
public class PipelineLatestRunStageStatusList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public PipelineLatestRunStageStatusList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 阶段名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineLatestRunStageStatusList withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * 阶段序列号
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public PipelineLatestRunStageStatusList withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 阶段状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PipelineLatestRunStageStatusList withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 阶段开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PipelineLatestRunStageStatusList withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 阶段结束时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PipelineLatestRunStageStatusList pipelineLatestRunStageStatusList = (PipelineLatestRunStageStatusList) o;
        return Objects.equals(this.name, pipelineLatestRunStageStatusList.name)
            && Objects.equals(this.sequence, pipelineLatestRunStageStatusList.sequence)
            && Objects.equals(this.status, pipelineLatestRunStageStatusList.status)
            && Objects.equals(this.startTime, pipelineLatestRunStageStatusList.startTime)
            && Objects.equals(this.endTime, pipelineLatestRunStageStatusList.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sequence, status, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineLatestRunStageStatusList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
