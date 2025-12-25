package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 投递源
 */
public class CreateShipperBodyShipperSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_dataspace")

    private String sourceDataspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_dataspace_name")

    private String sourceDataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_identity_role")

    private String sourceIdentityRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table")

    private String sourceTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_table_name")

    private String sourceTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_pipe")

    private String sourcePipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_pipe_name")

    private String sourcePipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private Integer sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_workspace")

    private String sourceWorkspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_workspace_name")

    private String sourceWorkspaceName;

    public CreateShipperBodyShipperSource withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域信息
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public CreateShipperBodyShipperSource withSourceDataspace(String sourceDataspace) {
        this.sourceDataspace = sourceDataspace;
        return this;
    }

    /**
     * 源数据空间ID
     * @return sourceDataspace
     */
    public String getSourceDataspace() {
        return sourceDataspace;
    }

    public void setSourceDataspace(String sourceDataspace) {
        this.sourceDataspace = sourceDataspace;
    }

    public CreateShipperBodyShipperSource withSourceDataspaceName(String sourceDataspaceName) {
        this.sourceDataspaceName = sourceDataspaceName;
        return this;
    }

    /**
     * 源数据空间名称
     * @return sourceDataspaceName
     */
    public String getSourceDataspaceName() {
        return sourceDataspaceName;
    }

    public void setSourceDataspaceName(String sourceDataspaceName) {
        this.sourceDataspaceName = sourceDataspaceName;
    }

    public CreateShipperBodyShipperSource withSourceIdentityRole(String sourceIdentityRole) {
        this.sourceIdentityRole = sourceIdentityRole;
        return this;
    }

    /**
     * 源身份角色
     * @return sourceIdentityRole
     */
    public String getSourceIdentityRole() {
        return sourceIdentityRole;
    }

    public void setSourceIdentityRole(String sourceIdentityRole) {
        this.sourceIdentityRole = sourceIdentityRole;
    }

    public CreateShipperBodyShipperSource withSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
        return this;
    }

    /**
     * 源表ID
     * @return sourceTable
     */
    public String getSourceTable() {
        return sourceTable;
    }

    public void setSourceTable(String sourceTable) {
        this.sourceTable = sourceTable;
    }

    public CreateShipperBodyShipperSource withSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
        return this;
    }

    /**
     * 源表名称
     * @return sourceTableName
     */
    public String getSourceTableName() {
        return sourceTableName;
    }

    public void setSourceTableName(String sourceTableName) {
        this.sourceTableName = sourceTableName;
    }

    public CreateShipperBodyShipperSource withSourcePipe(String sourcePipe) {
        this.sourcePipe = sourcePipe;
        return this;
    }

    /**
     * 源管道ID
     * @return sourcePipe
     */
    public String getSourcePipe() {
        return sourcePipe;
    }

    public void setSourcePipe(String sourcePipe) {
        this.sourcePipe = sourcePipe;
    }

    public CreateShipperBodyShipperSource withSourcePipeName(String sourcePipeName) {
        this.sourcePipeName = sourcePipeName;
        return this;
    }

    /**
     * 源管道名称
     * @return sourcePipeName
     */
    public String getSourcePipeName() {
        return sourcePipeName;
    }

    public void setSourcePipeName(String sourcePipeName) {
        this.sourcePipeName = sourcePipeName;
    }

    public CreateShipperBodyShipperSource withSourceType(Integer sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * 源类型
     * @return sourceType
     */
    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public CreateShipperBodyShipperSource withSourceWorkspace(String sourceWorkspace) {
        this.sourceWorkspace = sourceWorkspace;
        return this;
    }

    /**
     * 源工作空间ID
     * @return sourceWorkspace
     */
    public String getSourceWorkspace() {
        return sourceWorkspace;
    }

    public void setSourceWorkspace(String sourceWorkspace) {
        this.sourceWorkspace = sourceWorkspace;
    }

    public CreateShipperBodyShipperSource withSourceWorkspaceName(String sourceWorkspaceName) {
        this.sourceWorkspaceName = sourceWorkspaceName;
        return this;
    }

    /**
     * 源工作空间名称
     * @return sourceWorkspaceName
     */
    public String getSourceWorkspaceName() {
        return sourceWorkspaceName;
    }

    public void setSourceWorkspaceName(String sourceWorkspaceName) {
        this.sourceWorkspaceName = sourceWorkspaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateShipperBodyShipperSource that = (CreateShipperBodyShipperSource) obj;
        return Objects.equals(this.region, that.region) && Objects.equals(this.sourceDataspace, that.sourceDataspace)
            && Objects.equals(this.sourceDataspaceName, that.sourceDataspaceName)
            && Objects.equals(this.sourceIdentityRole, that.sourceIdentityRole)
            && Objects.equals(this.sourceTable, that.sourceTable)
            && Objects.equals(this.sourceTableName, that.sourceTableName)
            && Objects.equals(this.sourcePipe, that.sourcePipe)
            && Objects.equals(this.sourcePipeName, that.sourcePipeName)
            && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.sourceWorkspace, that.sourceWorkspace)
            && Objects.equals(this.sourceWorkspaceName, that.sourceWorkspaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(region,
            sourceDataspace,
            sourceDataspaceName,
            sourceIdentityRole,
            sourceTable,
            sourceTableName,
            sourcePipe,
            sourcePipeName,
            sourceType,
            sourceWorkspace,
            sourceWorkspaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShipperBodyShipperSource {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    sourceDataspace: ").append(toIndentedString(sourceDataspace)).append("\n");
        sb.append("    sourceDataspaceName: ").append(toIndentedString(sourceDataspaceName)).append("\n");
        sb.append("    sourceIdentityRole: ").append(toIndentedString(sourceIdentityRole)).append("\n");
        sb.append("    sourceTable: ").append(toIndentedString(sourceTable)).append("\n");
        sb.append("    sourceTableName: ").append(toIndentedString(sourceTableName)).append("\n");
        sb.append("    sourcePipe: ").append(toIndentedString(sourcePipe)).append("\n");
        sb.append("    sourcePipeName: ").append(toIndentedString(sourcePipeName)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceWorkspace: ").append(toIndentedString(sourceWorkspace)).append("\n");
        sb.append("    sourceWorkspaceName: ").append(toIndentedString(sourceWorkspaceName)).append("\n");
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
