package com.huaweicloud.sdk.ims.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class JobProgressEntities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_id")

    private String imageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_task")

    private String currentTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_name")

    private String imageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_percent")

    private Double processPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subJobId")

    private String subJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_result")

    private List<SubJobResult> subJobsResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_list")

    private List<String> subJobsList = null;

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

    public JobProgressEntities withSubJobsResult(List<SubJobResult> subJobsResult) {
        this.subJobsResult = subJobsResult;
        return this;
    }

    public JobProgressEntities addSubJobsResultItem(SubJobResult subJobsResultItem) {
        if (this.subJobsResult == null) {
            this.subJobsResult = new ArrayList<>();
        }
        this.subJobsResult.add(subJobsResultItem);
        return this;
    }

    public JobProgressEntities withSubJobsResult(Consumer<List<SubJobResult>> subJobsResultSetter) {
        if (this.subJobsResult == null) {
            this.subJobsResult = new ArrayList<>();
        }
        subJobsResultSetter.accept(this.subJobsResult);
        return this;
    }

    /**
     * 子任务结果列表
     * @return subJobsResult
     */
    public List<SubJobResult> getSubJobsResult() {
        return subJobsResult;
    }

    public void setSubJobsResult(List<SubJobResult> subJobsResult) {
        this.subJobsResult = subJobsResult;
    }

    public JobProgressEntities withSubJobsList(List<String> subJobsList) {
        this.subJobsList = subJobsList;
        return this;
    }

    public JobProgressEntities addSubJobsListItem(String subJobsListItem) {
        if (this.subJobsList == null) {
            this.subJobsList = new ArrayList<>();
        }
        this.subJobsList.add(subJobsListItem);
        return this;
    }

    public JobProgressEntities withSubJobsList(Consumer<List<String>> subJobsListSetter) {
        if (this.subJobsList == null) {
            this.subJobsList = new ArrayList<>();
        }
        subJobsListSetter.accept(this.subJobsList);
        return this;
    }

    /**
     * 子任务ID列表
     * @return subJobsList
     */
    public List<String> getSubJobsList() {
        return subJobsList;
    }

    public void setSubJobsList(List<String> subJobsList) {
        this.subJobsList = subJobsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobProgressEntities that = (JobProgressEntities) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.currentTask, that.currentTask)
            && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.processPercent, that.processPercent) && Objects.equals(this.subJobId, that.subJobId)
            && Objects.equals(this.subJobsResult, that.subJobsResult)
            && Objects.equals(this.subJobsList, that.subJobsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId, currentTask, imageName, processPercent, subJobId, subJobsResult, subJobsList);
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
        sb.append("    subJobsResult: ").append(toIndentedString(subJobsResult)).append("\n");
        sb.append("    subJobsList: ").append(toIndentedString(subJobsList)).append("\n");
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
