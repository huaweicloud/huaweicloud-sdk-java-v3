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
public class JobEntities {

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
    @JsonProperty(value = "addition_error_code")

    private String additionErrorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addition_error_msg")

    private String additionErrorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error")

    private String error;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_code")

    private String alarmCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_percent")

    private Double processPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<JobEntitiesResult> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_result")

    private List<SubJobResult> subJobsResult = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_list")

    private List<String> subJobsList = null;

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

    public JobEntities withAdditionErrorCode(String additionErrorCode) {
        this.additionErrorCode = additionErrorCode;
        return this;
    }

    /**
     * 添加错误码
     * @return additionErrorCode
     */
    public String getAdditionErrorCode() {
        return additionErrorCode;
    }

    public void setAdditionErrorCode(String additionErrorCode) {
        this.additionErrorCode = additionErrorCode;
    }

    public JobEntities withAdditionErrorMsg(String additionErrorMsg) {
        this.additionErrorMsg = additionErrorMsg;
        return this;
    }

    /**
     * 添加错误消息
     * @return additionErrorMsg
     */
    public String getAdditionErrorMsg() {
        return additionErrorMsg;
    }

    public void setAdditionErrorMsg(String additionErrorMsg) {
        this.additionErrorMsg = additionErrorMsg;
    }

    public JobEntities withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public JobEntities withError(String error) {
        this.error = error;
        return this;
    }

    /**
     * 错误消息
     * @return error
     */
    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public JobEntities withAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
        return this;
    }

    /**
     * 告警代码
     * @return alarmCode
     */
    public String getAlarmCode() {
        return alarmCode;
    }

    public void setAlarmCode(String alarmCode) {
        this.alarmCode = alarmCode;
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

    public JobEntities withSubJobsResult(List<SubJobResult> subJobsResult) {
        this.subJobsResult = subJobsResult;
        return this;
    }

    public JobEntities addSubJobsResultItem(SubJobResult subJobsResultItem) {
        if (this.subJobsResult == null) {
            this.subJobsResult = new ArrayList<>();
        }
        this.subJobsResult.add(subJobsResultItem);
        return this;
    }

    public JobEntities withSubJobsResult(Consumer<List<SubJobResult>> subJobsResultSetter) {
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

    public JobEntities withSubJobsList(List<String> subJobsList) {
        this.subJobsList = subJobsList;
        return this;
    }

    public JobEntities addSubJobsListItem(String subJobsListItem) {
        if (this.subJobsList == null) {
            this.subJobsList = new ArrayList<>();
        }
        this.subJobsList.add(subJobsListItem);
        return this;
    }

    public JobEntities withSubJobsList(Consumer<List<String>> subJobsListSetter) {
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
        JobEntities that = (JobEntities) obj;
        return Objects.equals(this.imageId, that.imageId) && Objects.equals(this.currentTask, that.currentTask)
            && Objects.equals(this.imageName, that.imageName)
            && Objects.equals(this.additionErrorCode, that.additionErrorCode)
            && Objects.equals(this.additionErrorMsg, that.additionErrorMsg)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.error, that.error)
            && Objects.equals(this.alarmCode, that.alarmCode)
            && Objects.equals(this.processPercent, that.processPercent) && Objects.equals(this.results, that.results)
            && Objects.equals(this.subJobsResult, that.subJobsResult)
            && Objects.equals(this.subJobsList, that.subJobsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageId,
            currentTask,
            imageName,
            additionErrorCode,
            additionErrorMsg,
            errorCode,
            error,
            alarmCode,
            processPercent,
            results,
            subJobsResult,
            subJobsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobEntities {\n");
        sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
        sb.append("    currentTask: ").append(toIndentedString(currentTask)).append("\n");
        sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
        sb.append("    additionErrorCode: ").append(toIndentedString(additionErrorCode)).append("\n");
        sb.append("    additionErrorMsg: ").append(toIndentedString(additionErrorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
        sb.append("    alarmCode: ").append(toIndentedString(alarmCode)).append("\n");
        sb.append("    processPercent: ").append(toIndentedString(processPercent)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
