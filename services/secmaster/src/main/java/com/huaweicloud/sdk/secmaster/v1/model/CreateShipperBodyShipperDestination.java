package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 投递目标
 */
public class CreateShipperBodyShipperDestination {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_param")

    private String dataParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_dataspace")

    private String destinationDataspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_dataspace_name")

    private String destinationDataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_identity_role")

    private String destinationIdentityRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_table")

    private String destinationTable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_table_name")

    private String destinationTableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_pipe")

    private String destinationPipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_pipe_name")

    private String destinationPipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_region")

    private String destinationRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_shipper_type")

    private Integer destinationShipperType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workspace")

    private String destinationWorkspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_workspace_name")

    private String destinationWorkspaceName;

    public CreateShipperBodyShipperDestination withDataParam(String dataParam) {
        this.dataParam = dataParam;
        return this;
    }

    /**
     * 数据参数
     * @return dataParam
     */
    public String getDataParam() {
        return dataParam;
    }

    public void setDataParam(String dataParam) {
        this.dataParam = dataParam;
    }

    public CreateShipperBodyShipperDestination withDestinationDataspace(String destinationDataspace) {
        this.destinationDataspace = destinationDataspace;
        return this;
    }

    /**
     * 目标数据空间ID
     * @return destinationDataspace
     */
    public String getDestinationDataspace() {
        return destinationDataspace;
    }

    public void setDestinationDataspace(String destinationDataspace) {
        this.destinationDataspace = destinationDataspace;
    }

    public CreateShipperBodyShipperDestination withDestinationDataspaceName(String destinationDataspaceName) {
        this.destinationDataspaceName = destinationDataspaceName;
        return this;
    }

    /**
     * 目标数据空间名称
     * @return destinationDataspaceName
     */
    public String getDestinationDataspaceName() {
        return destinationDataspaceName;
    }

    public void setDestinationDataspaceName(String destinationDataspaceName) {
        this.destinationDataspaceName = destinationDataspaceName;
    }

    public CreateShipperBodyShipperDestination withDestinationIdentityRole(String destinationIdentityRole) {
        this.destinationIdentityRole = destinationIdentityRole;
        return this;
    }

    /**
     * 目标身份角色
     * @return destinationIdentityRole
     */
    public String getDestinationIdentityRole() {
        return destinationIdentityRole;
    }

    public void setDestinationIdentityRole(String destinationIdentityRole) {
        this.destinationIdentityRole = destinationIdentityRole;
    }

    public CreateShipperBodyShipperDestination withDestinationTable(String destinationTable) {
        this.destinationTable = destinationTable;
        return this;
    }

    /**
     * 目标表ID
     * @return destinationTable
     */
    public String getDestinationTable() {
        return destinationTable;
    }

    public void setDestinationTable(String destinationTable) {
        this.destinationTable = destinationTable;
    }

    public CreateShipperBodyShipperDestination withDestinationTableName(String destinationTableName) {
        this.destinationTableName = destinationTableName;
        return this;
    }

    /**
     * 目标表名称
     * @return destinationTableName
     */
    public String getDestinationTableName() {
        return destinationTableName;
    }

    public void setDestinationTableName(String destinationTableName) {
        this.destinationTableName = destinationTableName;
    }

    public CreateShipperBodyShipperDestination withDestinationPipe(String destinationPipe) {
        this.destinationPipe = destinationPipe;
        return this;
    }

    /**
     * 目标管道ID
     * @return destinationPipe
     */
    public String getDestinationPipe() {
        return destinationPipe;
    }

    public void setDestinationPipe(String destinationPipe) {
        this.destinationPipe = destinationPipe;
    }

    public CreateShipperBodyShipperDestination withDestinationPipeName(String destinationPipeName) {
        this.destinationPipeName = destinationPipeName;
        return this;
    }

    /**
     * 目标管道名称
     * @return destinationPipeName
     */
    public String getDestinationPipeName() {
        return destinationPipeName;
    }

    public void setDestinationPipeName(String destinationPipeName) {
        this.destinationPipeName = destinationPipeName;
    }

    public CreateShipperBodyShipperDestination withDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
        return this;
    }

    /**
     * 目标区域信息
     * @return destinationRegion
     */
    public String getDestinationRegion() {
        return destinationRegion;
    }

    public void setDestinationRegion(String destinationRegion) {
        this.destinationRegion = destinationRegion;
    }

    public CreateShipperBodyShipperDestination withDestinationShipperType(Integer destinationShipperType) {
        this.destinationShipperType = destinationShipperType;
        return this;
    }

    /**
     * 目标投递类型
     * @return destinationShipperType
     */
    public Integer getDestinationShipperType() {
        return destinationShipperType;
    }

    public void setDestinationShipperType(Integer destinationShipperType) {
        this.destinationShipperType = destinationShipperType;
    }

    public CreateShipperBodyShipperDestination withDestinationWorkspace(String destinationWorkspace) {
        this.destinationWorkspace = destinationWorkspace;
        return this;
    }

    /**
     * 目标工作空间ID
     * @return destinationWorkspace
     */
    public String getDestinationWorkspace() {
        return destinationWorkspace;
    }

    public void setDestinationWorkspace(String destinationWorkspace) {
        this.destinationWorkspace = destinationWorkspace;
    }

    public CreateShipperBodyShipperDestination withDestinationWorkspaceName(String destinationWorkspaceName) {
        this.destinationWorkspaceName = destinationWorkspaceName;
        return this;
    }

    /**
     * 目标工作空间名称
     * @return destinationWorkspaceName
     */
    public String getDestinationWorkspaceName() {
        return destinationWorkspaceName;
    }

    public void setDestinationWorkspaceName(String destinationWorkspaceName) {
        this.destinationWorkspaceName = destinationWorkspaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateShipperBodyShipperDestination that = (CreateShipperBodyShipperDestination) obj;
        return Objects.equals(this.dataParam, that.dataParam)
            && Objects.equals(this.destinationDataspace, that.destinationDataspace)
            && Objects.equals(this.destinationDataspaceName, that.destinationDataspaceName)
            && Objects.equals(this.destinationIdentityRole, that.destinationIdentityRole)
            && Objects.equals(this.destinationTable, that.destinationTable)
            && Objects.equals(this.destinationTableName, that.destinationTableName)
            && Objects.equals(this.destinationPipe, that.destinationPipe)
            && Objects.equals(this.destinationPipeName, that.destinationPipeName)
            && Objects.equals(this.destinationRegion, that.destinationRegion)
            && Objects.equals(this.destinationShipperType, that.destinationShipperType)
            && Objects.equals(this.destinationWorkspace, that.destinationWorkspace)
            && Objects.equals(this.destinationWorkspaceName, that.destinationWorkspaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataParam,
            destinationDataspace,
            destinationDataspaceName,
            destinationIdentityRole,
            destinationTable,
            destinationTableName,
            destinationPipe,
            destinationPipeName,
            destinationRegion,
            destinationShipperType,
            destinationWorkspace,
            destinationWorkspaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateShipperBodyShipperDestination {\n");
        sb.append("    dataParam: ").append(toIndentedString(dataParam)).append("\n");
        sb.append("    destinationDataspace: ").append(toIndentedString(destinationDataspace)).append("\n");
        sb.append("    destinationDataspaceName: ").append(toIndentedString(destinationDataspaceName)).append("\n");
        sb.append("    destinationIdentityRole: ").append(toIndentedString(destinationIdentityRole)).append("\n");
        sb.append("    destinationTable: ").append(toIndentedString(destinationTable)).append("\n");
        sb.append("    destinationTableName: ").append(toIndentedString(destinationTableName)).append("\n");
        sb.append("    destinationPipe: ").append(toIndentedString(destinationPipe)).append("\n");
        sb.append("    destinationPipeName: ").append(toIndentedString(destinationPipeName)).append("\n");
        sb.append("    destinationRegion: ").append(toIndentedString(destinationRegion)).append("\n");
        sb.append("    destinationShipperType: ").append(toIndentedString(destinationShipperType)).append("\n");
        sb.append("    destinationWorkspace: ").append(toIndentedString(destinationWorkspace)).append("\n");
        sb.append("    destinationWorkspaceName: ").append(toIndentedString(destinationWorkspaceName)).append("\n");
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
