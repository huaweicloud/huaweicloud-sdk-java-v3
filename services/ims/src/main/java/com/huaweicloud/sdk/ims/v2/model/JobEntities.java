package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class JobEntities {

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
    @JsonProperty(value = "results")

    @JacksonXmlProperty(localName = "results")

    private List<JobEntitiesResult> results = null;

    public JobEntities withImageId(String imageId) {
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

    public JobEntities withCurrentTask(String currentTask) {
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

    public JobEntities withImageName(String imageName) {
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

    public JobEntities withProcessPercent(Double processPercent) {
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

    public JobEntities withResults(List<JobEntitiesResult> results) {
        this.results = results;
        return this;
    }

    public JobEntities addResultsItem(JobEntitiesResult resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public JobEntities withResults(Consumer<List<JobEntitiesResult>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * 批量任务执行结果
     * @return results
     */
    public List<JobEntitiesResult> getResults() {
        return results;
    }

    public void setResults(List<JobEntitiesResult> results) {
        this.results = results;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobEntities jobEntities = (JobEntities) o;
        return Objects.equals(this.imageId, jobEntities.imageId)
            && Objects.equals(this.currentTask, jobEntities.currentTask)
            && Objects.equals(this.imageName, jobEntities.imageName)
            && Objects.equals(this.processPercent, jobEntities.processPercent)
            && Objects.equals(this.results, jobEntities.results);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, currentTask, imageName, processPercent, results);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    currentTask: ").append(toIndentedString(currentTask)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    processPercent: ").append(toIndentedString(processPercent)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
