package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNextflowWorkflowResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_file")

    private String workflowFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_file_url")

    private String workflowFileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_file")

    private String mainFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params_file")

    private String paramsFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private List<NextflowParamsDto> params = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_resource_id")

    private String sourceResourceId;

    public ShowNextflowWorkflowResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流程id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNextflowWorkflowResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流程名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNextflowWorkflowResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 流程描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowNextflowWorkflowResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowNextflowWorkflowResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowNextflowWorkflowResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 流程标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowNextflowWorkflowResponse withWorkflowFile(String workflowFile) {
        this.workflowFile = workflowFile;
        return this;
    }

    /**
     * 流程的文件名
     * @return workflowFile
     */
    public String getWorkflowFile() {
        return workflowFile;
    }

    public void setWorkflowFile(String workflowFile) {
        this.workflowFile = workflowFile;
    }

    public ShowNextflowWorkflowResponse withWorkflowFileUrl(String workflowFileUrl) {
        this.workflowFileUrl = workflowFileUrl;
        return this;
    }

    /**
     * 流程的文件名下载地址
     * @return workflowFileUrl
     */
    public String getWorkflowFileUrl() {
        return workflowFileUrl;
    }

    public void setWorkflowFileUrl(String workflowFileUrl) {
        this.workflowFileUrl = workflowFileUrl;
    }

    public ShowNextflowWorkflowResponse withMainFile(String mainFile) {
        this.mainFile = mainFile;
        return this;
    }

    /**
     * 主文件名
     * @return mainFile
     */
    public String getMainFile() {
        return mainFile;
    }

    public void setMainFile(String mainFile) {
        this.mainFile = mainFile;
    }

    public ShowNextflowWorkflowResponse withParamsFile(String paramsFile) {
        this.paramsFile = paramsFile;
        return this;
    }

    /**
     * 用户上传时使用的参数文件名
     * @return paramsFile
     */
    public String getParamsFile() {
        return paramsFile;
    }

    public void setParamsFile(String paramsFile) {
        this.paramsFile = paramsFile;
    }

    public ShowNextflowWorkflowResponse withParams(List<NextflowParamsDto> params) {
        this.params = params;
        return this;
    }

    public ShowNextflowWorkflowResponse addParamsItem(NextflowParamsDto paramsItem) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        this.params.add(paramsItem);
        return this;
    }

    public ShowNextflowWorkflowResponse withParams(Consumer<List<NextflowParamsDto>> paramsSetter) {
        if (this.params == null) {
            this.params = new ArrayList<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * 流程参数列表
     * @return params
     */
    public List<NextflowParamsDto> getParams() {
        return params;
    }

    public void setParams(List<NextflowParamsDto> params) {
        this.params = params;
    }

    public ShowNextflowWorkflowResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 流程的创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowNextflowWorkflowResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 流程的更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowNextflowWorkflowResponse withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源项目名称
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public ShowNextflowWorkflowResponse withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * 源资源id
     * @return sourceResourceId
     */
    public String getSourceResourceId() {
        return sourceResourceId;
    }

    public void setSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowNextflowWorkflowResponse showNextflowWorkflowResponse = (ShowNextflowWorkflowResponse) o;
        return Objects.equals(this.id, showNextflowWorkflowResponse.id)
            && Objects.equals(this.name, showNextflowWorkflowResponse.name)
            && Objects.equals(this.description, showNextflowWorkflowResponse.description)
            && Objects.equals(this.labels, showNextflowWorkflowResponse.labels)
            && Objects.equals(this.workflowFile, showNextflowWorkflowResponse.workflowFile)
            && Objects.equals(this.workflowFileUrl, showNextflowWorkflowResponse.workflowFileUrl)
            && Objects.equals(this.mainFile, showNextflowWorkflowResponse.mainFile)
            && Objects.equals(this.paramsFile, showNextflowWorkflowResponse.paramsFile)
            && Objects.equals(this.params, showNextflowWorkflowResponse.params)
            && Objects.equals(this.createTime, showNextflowWorkflowResponse.createTime)
            && Objects.equals(this.updateTime, showNextflowWorkflowResponse.updateTime)
            && Objects.equals(this.sourceProjectName, showNextflowWorkflowResponse.sourceProjectName)
            && Objects.equals(this.sourceResourceId, showNextflowWorkflowResponse.sourceResourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            labels,
            workflowFile,
            workflowFileUrl,
            mainFile,
            paramsFile,
            params,
            createTime,
            updateTime,
            sourceProjectName,
            sourceResourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNextflowWorkflowResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    workflowFile: ").append(toIndentedString(workflowFile)).append("\n");
        sb.append("    workflowFileUrl: ").append(toIndentedString(workflowFileUrl)).append("\n");
        sb.append("    mainFile: ").append(toIndentedString(mainFile)).append("\n");
        sb.append("    paramsFile: ").append(toIndentedString(paramsFile)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    sourceResourceId: ").append(toIndentedString(sourceResourceId)).append("\n");
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
