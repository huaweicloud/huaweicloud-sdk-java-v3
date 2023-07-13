package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ImportTemplateResultRsp
 */
public class ImportTemplateResultRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_template_id")

    private String sourceTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_template_id")

    private String destinationTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_template_name")

    private String destinationTemplateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public ImportTemplateResultRsp withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public ImportTemplateResultRsp withSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
        return this;
    }

    /**
     * 源模板id
     * @return sourceTemplateId
     */
    public String getSourceTemplateId() {
        return sourceTemplateId;
    }

    public void setSourceTemplateId(String sourceTemplateId) {
        this.sourceTemplateId = sourceTemplateId;
    }

    public ImportTemplateResultRsp withDestinationTemplateId(String destinationTemplateId) {
        this.destinationTemplateId = destinationTemplateId;
        return this;
    }

    /**
     * 导入后的模板id
     * @return destinationTemplateId
     */
    public String getDestinationTemplateId() {
        return destinationTemplateId;
    }

    public void setDestinationTemplateId(String destinationTemplateId) {
        this.destinationTemplateId = destinationTemplateId;
    }

    public ImportTemplateResultRsp withDestinationTemplateName(String destinationTemplateName) {
        this.destinationTemplateName = destinationTemplateName;
        return this;
    }

    /**
     * 导入后的模板名称
     * @return destinationTemplateName
     */
    public String getDestinationTemplateName() {
        return destinationTemplateName;
    }

    public void setDestinationTemplateName(String destinationTemplateName) {
        this.destinationTemplateName = destinationTemplateName;
    }

    public ImportTemplateResultRsp withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因，导入失败会返回
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ImportTemplateResultRsp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 导入结果
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportTemplateResultRsp that = (ImportTemplateResultRsp) obj;
        return Objects.equals(this.sourceProjectId, that.sourceProjectId)
            && Objects.equals(this.sourceTemplateId, that.sourceTemplateId)
            && Objects.equals(this.destinationTemplateId, that.destinationTemplateId)
            && Objects.equals(this.destinationTemplateName, that.destinationTemplateName)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId,
            sourceTemplateId,
            destinationTemplateId,
            destinationTemplateName,
            failedReason,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportTemplateResultRsp {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceTemplateId: ").append(toIndentedString(sourceTemplateId)).append("\n");
        sb.append("    destinationTemplateId: ").append(toIndentedString(destinationTemplateId)).append("\n");
        sb.append("    destinationTemplateName: ").append(toIndentedString(destinationTemplateName)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
