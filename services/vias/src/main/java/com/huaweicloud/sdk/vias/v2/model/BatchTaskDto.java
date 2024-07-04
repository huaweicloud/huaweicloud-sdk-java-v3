package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchTaskDto
 */
public class BatchTaskDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_task_name")

    private String batchTaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_name")

    private String videoSourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_name")

    private String videoGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_name")

    private String algName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private String company;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_task")

    private Integer numTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_task_status_info")

    private BatchTaskStatusInfoDto batchTaskStatusInfo;

    public BatchTaskDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 批量作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchTaskDto withBatchTaskName(String batchTaskName) {
        this.batchTaskName = batchTaskName;
        return this;
    }

    /**
     * 批量作业名称
     * @return batchTaskName
     */
    public String getBatchTaskName() {
        return batchTaskName;
    }

    public void setBatchTaskName(String batchTaskName) {
        this.batchTaskName = batchTaskName;
    }

    public BatchTaskDto withVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
        return this;
    }

    /**
     * 视频源名称
     * @return videoSourceName
     */
    public String getVideoSourceName() {
        return videoSourceName;
    }

    public void setVideoSourceName(String videoSourceName) {
        this.videoSourceName = videoSourceName;
    }

    public BatchTaskDto withVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
        return this;
    }

    /**
     * 分组名称
     * @return videoGroupName
     */
    public String getVideoGroupName() {
        return videoGroupName;
    }

    public void setVideoGroupName(String videoGroupName) {
        this.videoGroupName = videoGroupName;
    }

    public BatchTaskDto withAlgName(String algName) {
        this.algName = algName;
        return this;
    }

    /**
     * 算法名称
     * @return algName
     */
    public String getAlgName() {
        return algName;
    }

    public void setAlgName(String algName) {
        this.algName = algName;
    }

    public BatchTaskDto withCompany(String company) {
        this.company = company;
        return this;
    }

    /**
     * 厂商名
     * @return company
     */
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public BatchTaskDto withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 作业类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BatchTaskDto withNumTask(Integer numTask) {
        this.numTask = numTask;
        return this;
    }

    /**
     * 批量作业总数
     * @return numTask
     */
    public Integer getNumTask() {
        return numTask;
    }

    public void setNumTask(Integer numTask) {
        this.numTask = numTask;
    }

    public BatchTaskDto withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public BatchTaskDto withBatchTaskStatusInfo(BatchTaskStatusInfoDto batchTaskStatusInfo) {
        this.batchTaskStatusInfo = batchTaskStatusInfo;
        return this;
    }

    public BatchTaskDto withBatchTaskStatusInfo(Consumer<BatchTaskStatusInfoDto> batchTaskStatusInfoSetter) {
        if (this.batchTaskStatusInfo == null) {
            this.batchTaskStatusInfo = new BatchTaskStatusInfoDto();
            batchTaskStatusInfoSetter.accept(this.batchTaskStatusInfo);
        }

        return this;
    }

    /**
     * Get batchTaskStatusInfo
     * @return batchTaskStatusInfo
     */
    public BatchTaskStatusInfoDto getBatchTaskStatusInfo() {
        return batchTaskStatusInfo;
    }

    public void setBatchTaskStatusInfo(BatchTaskStatusInfoDto batchTaskStatusInfo) {
        this.batchTaskStatusInfo = batchTaskStatusInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTaskDto that = (BatchTaskDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.batchTaskName, that.batchTaskName)
            && Objects.equals(this.videoSourceName, that.videoSourceName)
            && Objects.equals(this.videoGroupName, that.videoGroupName) && Objects.equals(this.algName, that.algName)
            && Objects.equals(this.company, that.company) && Objects.equals(this.type, that.type)
            && Objects.equals(this.numTask, that.numTask) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.batchTaskStatusInfo, that.batchTaskStatusInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            batchTaskName,
            videoSourceName,
            videoGroupName,
            algName,
            company,
            type,
            numTask,
            createdAt,
            batchTaskStatusInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    batchTaskName: ").append(toIndentedString(batchTaskName)).append("\n");
        sb.append("    videoSourceName: ").append(toIndentedString(videoSourceName)).append("\n");
        sb.append("    videoGroupName: ").append(toIndentedString(videoGroupName)).append("\n");
        sb.append("    algName: ").append(toIndentedString(algName)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    numTask: ").append(toIndentedString(numTask)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    batchTaskStatusInfo: ").append(toIndentedString(batchTaskStatusInfo)).append("\n");
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
