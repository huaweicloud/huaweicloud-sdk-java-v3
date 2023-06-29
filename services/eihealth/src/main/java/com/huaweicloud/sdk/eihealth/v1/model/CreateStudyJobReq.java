package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建study作业请求体
 */
public class CreateStudyJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workflow_job_id")

    private String workflowJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relative_path")

    private String relativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_file_type")

    private OutputFileType outputFileType;

    public CreateStudyJobReq withWorkflowJobId(String workflowJobId) {
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

    public CreateStudyJobReq withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 数据库模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public CreateStudyJobReq withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public CreateStudyJobReq withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * 生成数据库实例的文件相对路径
     * @return relativePath
     */
    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public CreateStudyJobReq withOutputFileType(OutputFileType outputFileType) {
        this.outputFileType = outputFileType;
        return this;
    }

    /**
     * Get outputFileType
     * @return outputFileType
     */
    public OutputFileType getOutputFileType() {
        return outputFileType;
    }

    public void setOutputFileType(OutputFileType outputFileType) {
        this.outputFileType = outputFileType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateStudyJobReq that = (CreateStudyJobReq) obj;
        return Objects.equals(this.workflowJobId, that.workflowJobId)
            && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.relativePath, that.relativePath)
            && Objects.equals(this.outputFileType, that.outputFileType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workflowJobId, templateId, databaseName, relativePath, outputFileType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateStudyJobReq {\n");
        sb.append("    workflowJobId: ").append(toIndentedString(workflowJobId)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
        sb.append("    outputFileType: ").append(toIndentedString(outputFileType)).append("\n");
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
