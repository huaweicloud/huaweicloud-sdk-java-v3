package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuoteDatabaseResultRsp
 */
public class QuoteDatabaseResultRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_database_id")

    private String sourceDatabaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_database_id")

    private String destinationDatabaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_database_name")

    private String destinationDatabaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public QuoteDatabaseResultRsp withSourceProjectId(String sourceProjectId) {
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

    public QuoteDatabaseResultRsp withSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
        return this;
    }

    /**
     * 源数据库id
     * @return sourceDatabaseId
     */
    public String getSourceDatabaseId() {
        return sourceDatabaseId;
    }

    public void setSourceDatabaseId(String sourceDatabaseId) {
        this.sourceDatabaseId = sourceDatabaseId;
    }

    public QuoteDatabaseResultRsp withDestinationDatabaseId(String destinationDatabaseId) {
        this.destinationDatabaseId = destinationDatabaseId;
        return this;
    }

    /**
     * 引用到项目后的数据库id
     * @return destinationDatabaseId
     */
    public String getDestinationDatabaseId() {
        return destinationDatabaseId;
    }

    public void setDestinationDatabaseId(String destinationDatabaseId) {
        this.destinationDatabaseId = destinationDatabaseId;
    }

    public QuoteDatabaseResultRsp withDestinationDatabaseName(String destinationDatabaseName) {
        this.destinationDatabaseName = destinationDatabaseName;
        return this;
    }

    /**
     * 引用到项目后的数据库名称
     * @return destinationDatabaseName
     */
    public String getDestinationDatabaseName() {
        return destinationDatabaseName;
    }

    public void setDestinationDatabaseName(String destinationDatabaseName) {
        this.destinationDatabaseName = destinationDatabaseName;
    }

    public QuoteDatabaseResultRsp withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public QuoteDatabaseResultRsp withStatus(String status) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuoteDatabaseResultRsp quoteDatabaseResultRsp = (QuoteDatabaseResultRsp) o;
        return Objects.equals(this.sourceProjectId, quoteDatabaseResultRsp.sourceProjectId)
            && Objects.equals(this.sourceDatabaseId, quoteDatabaseResultRsp.sourceDatabaseId)
            && Objects.equals(this.destinationDatabaseId, quoteDatabaseResultRsp.destinationDatabaseId)
            && Objects.equals(this.destinationDatabaseName, quoteDatabaseResultRsp.destinationDatabaseName)
            && Objects.equals(this.failedReason, quoteDatabaseResultRsp.failedReason)
            && Objects.equals(this.status, quoteDatabaseResultRsp.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceProjectId,
            sourceDatabaseId,
            destinationDatabaseId,
            destinationDatabaseName,
            failedReason,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuoteDatabaseResultRsp {\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceDatabaseId: ").append(toIndentedString(sourceDatabaseId)).append("\n");
        sb.append("    destinationDatabaseId: ").append(toIndentedString(destinationDatabaseId)).append("\n");
        sb.append("    destinationDatabaseName: ").append(toIndentedString(destinationDatabaseName)).append("\n");
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
