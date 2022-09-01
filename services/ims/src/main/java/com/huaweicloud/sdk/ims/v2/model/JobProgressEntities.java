package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class JobProgressEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    @JacksonXmlProperty(localName = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_task")

    @JacksonXmlProperty(localName = "current_task")

    private String currentTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    @JacksonXmlProperty(localName = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_percent")

    @JacksonXmlProperty(localName = "process_percent")

    private Double processPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobId")

    @JacksonXmlProperty(localName = "subJobId")

    private String subJobId;

    public JobProgressEntities withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * 镜像ID
     * @return imageId
     */
    public String getImageId() {
        return imageId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public JobProgressEntities withCurrentTask(String currentTask) {
        this.currentTask = currentTask;
        return this;
    }

    /**
     * 当前任务名称
     * @return currentTask
     */
    public String getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(String currentTask) {
        this.currentTask = currentTask;
    }

    public JobProgressEntities withImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * 镜像名称
     * @return imageName
     */
    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public JobProgressEntities withProcessPercent(Double processPercent) {
        this.processPercent = processPercent;
        return this;
    }

    /**
     * 任务执行进度
     * @return processPercent
     */
    public Double getProcessPercent() {
        return processPercent;
    }

    public void setProcessPercent(Double processPercent) {
        this.processPercent = processPercent;
    }

    public JobProgressEntities withSubJobId(String subJobId) {
        this.subJobId = subJobId;
        return this;
    }

    /**
     * 子任务ID
     * @return subJobId
     */
    public String getSubJobId() {
        return subJobId;
    }

    public void setSubJobId(String subJobId) {
        this.subJobId = subJobId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobProgressEntities jobProgressEntities = (JobProgressEntities) o;
        return Objects.equals(this.imageId, jobProgressEntities.imageId)
            && Objects.equals(this.currentTask, jobProgressEntities.currentTask)
            && Objects.equals(this.imageName, jobProgressEntities.imageName)
            && Objects.equals(this.processPercent, jobProgressEntities.processPercent)
            && Objects.equals(this.subJobId, jobProgressEntities.subJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, currentTask, imageName, processPercent, subJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobProgressEntities {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    currentTask: ").append(toIndentedString(currentTask)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    processPercent: ").append(toIndentedString(processPercent)).append("\n");
        sb.append("    subJobId: ").append(toIndentedString(subJobId)).append("\n");
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
