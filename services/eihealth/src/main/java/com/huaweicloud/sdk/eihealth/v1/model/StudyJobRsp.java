package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 作业详情返回体
 */
public class StudyJobRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_job_id")

    private String workflowJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_path")

    private String relativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_type")

    private String outputFileType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_name")

    private String workflowName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public StudyJobRsp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * study作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public StudyJobRsp withWorkflowJobId(String workflowJobId) {
        this.workflowJobId = workflowJobId;
        return this;
    }

    /**
     * workflow作业id
     * @return workflowJobId
     */
    public String getWorkflowJobId() {
        return workflowJobId;
    }

    public void setWorkflowJobId(String workflowJobId) {
        this.workflowJobId = workflowJobId;
    }

    public StudyJobRsp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudyJobRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StudyJobRsp withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 生成study作业结果的模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public StudyJobRsp withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * study作业结果的数据库实例名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public StudyJobRsp withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * study作业结果的数据库实例id
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    public StudyJobRsp withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * 生成study作业结果的文件的相对路径
     * @return relativePath
     */
    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public StudyJobRsp withOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }

    /**
     * 生成study作业结果的文件的类型
     * @return outputFileType
     */
    public String getOutputFileType() {
        return outputFileType;
    }

    public void setOutputFileType(String outputFileType) {
        this.outputFileType = outputFileType;
    }

    public StudyJobRsp withWorkflowName(String workflowName) {
        this.workflowName = workflowName;
        return this;
    }

    /**
     * 使用的workflow名称
     * @return workflowName
     */
    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public StudyJobRsp withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 使用的workflow标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public StudyJobRsp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public StudyJobRsp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 作业更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StudyJobRsp studyJobRsp = (StudyJobRsp) o;
        return Objects.equals(this.id, studyJobRsp.id) && Objects.equals(this.workflowJobId, studyJobRsp.workflowJobId)
            && Objects.equals(this.name, studyJobRsp.name) && Objects.equals(this.status, studyJobRsp.status)
            && Objects.equals(this.templateId, studyJobRsp.templateId)
            && Objects.equals(this.databaseName, studyJobRsp.databaseName)
            && Objects.equals(this.databaseId, studyJobRsp.databaseId)
            && Objects.equals(this.relativePath, studyJobRsp.relativePath)
            && Objects.equals(this.outputFileType, studyJobRsp.outputFileType)
            && Objects.equals(this.workflowName, studyJobRsp.workflowName)
            && Objects.equals(this.label, studyJobRsp.label) && Objects.equals(this.createTime, studyJobRsp.createTime)
            && Objects.equals(this.updateTime, studyJobRsp.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            workflowJobId,
            name,
            status,
            templateId,
            databaseName,
            databaseId,
            relativePath,
            outputFileType,
            workflowName,
            label,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StudyJobRsp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workflowJobId: ").append(toIndentedString(workflowJobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
        sb.append("    outputFileType: ").append(toIndentedString(outputFileType)).append("\n");
        sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
