package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 投递目的
 */
public class ShowShipperResponseBodyDataShipperDestination {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_param")

    private String dataParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_type")

    private Integer dataType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace")

    private String dataspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataspace_name")

    private String dataspaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination_info")

    private String destinationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity")

    private String identity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe")

    private String pipe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_name")

    private String pipeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_name")

    private String workspaceName;

    public ShowShipperResponseBodyDataShipperDestination withDataParam(String dataParam) {
        this.dataParam = dataParam;
        return this;
    }

    /**
     * 目的参数
     * @return dataParam
     */
    public String getDataParam() {
        return dataParam;
    }

    public void setDataParam(String dataParam) {
        this.dataParam = dataParam;
    }

    public ShowShipperResponseBodyDataShipperDestination withDataType(Integer dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * 数据类型
     * @return dataType
     */
    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public ShowShipperResponseBodyDataShipperDestination withDataspace(String dataspace) {
        this.dataspace = dataspace;
        return this;
    }

    /**
     * 数据空间
     * @return dataspace
     */
    public String getDataspace() {
        return dataspace;
    }

    public void setDataspace(String dataspace) {
        this.dataspace = dataspace;
    }

    public ShowShipperResponseBodyDataShipperDestination withDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
        return this;
    }

    /**
     * 数据空间名称
     * @return dataspaceName
     */
    public String getDataspaceName() {
        return dataspaceName;
    }

    public void setDataspaceName(String dataspaceName) {
        this.dataspaceName = dataspaceName;
    }

    public ShowShipperResponseBodyDataShipperDestination withDestinationInfo(String destinationInfo) {
        this.destinationInfo = destinationInfo;
        return this;
    }

    /**
     * 目的信息
     * @return destinationInfo
     */
    public String getDestinationInfo() {
        return destinationInfo;
    }

    public void setDestinationInfo(String destinationInfo) {
        this.destinationInfo = destinationInfo;
    }

    public ShowShipperResponseBodyDataShipperDestination withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 目的ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowShipperResponseBodyDataShipperDestination withIdentity(String identity) {
        this.identity = identity;
        return this;
    }

    /**
     * 标识
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public ShowShipperResponseBodyDataShipperDestination withPipe(String pipe) {
        this.pipe = pipe;
        return this;
    }

    /**
     * 管道ID
     * @return pipe
     */
    public String getPipe() {
        return pipe;
    }

    public void setPipe(String pipe) {
        this.pipe = pipe;
    }

    public ShowShipperResponseBodyDataShipperDestination withPipeName(String pipeName) {
        this.pipeName = pipeName;
        return this;
    }

    /**
     * 管道名称
     * @return pipeName
     */
    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public ShowShipperResponseBodyDataShipperDestination withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 区域
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowShipperResponseBodyDataShipperDestination withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 类型
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public ShowShipperResponseBodyDataShipperDestination withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ShowShipperResponseBodyDataShipperDestination withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    /**
     * 工作空间名称
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowShipperResponseBodyDataShipperDestination that = (ShowShipperResponseBodyDataShipperDestination) obj;
        return Objects.equals(this.dataParam, that.dataParam) && Objects.equals(this.dataType, that.dataType)
            && Objects.equals(this.dataspace, that.dataspace) && Objects.equals(this.dataspaceName, that.dataspaceName)
            && Objects.equals(this.destinationInfo, that.destinationInfo) && Objects.equals(this.id, that.id)
            && Objects.equals(this.identity, that.identity) && Objects.equals(this.pipe, that.pipe)
            && Objects.equals(this.pipeName, that.pipeName) && Objects.equals(this.region, that.region)
            && Objects.equals(this.type, that.type) && Objects.equals(this.workspace, that.workspace)
            && Objects.equals(this.workspaceName, that.workspaceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataParam,
            dataType,
            dataspace,
            dataspaceName,
            destinationInfo,
            id,
            identity,
            pipe,
            pipeName,
            region,
            type,
            workspace,
            workspaceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowShipperResponseBodyDataShipperDestination {\n");
        sb.append("    dataParam: ").append(toIndentedString(dataParam)).append("\n");
        sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
        sb.append("    dataspace: ").append(toIndentedString(dataspace)).append("\n");
        sb.append("    dataspaceName: ").append(toIndentedString(dataspaceName)).append("\n");
        sb.append("    destinationInfo: ").append(toIndentedString(destinationInfo)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    identity: ").append(toIndentedString(identity)).append("\n");
        sb.append("    pipe: ").append(toIndentedString(pipe)).append("\n");
        sb.append("    pipeName: ").append(toIndentedString(pipeName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    workspaceName: ").append(toIndentedString(workspaceName)).append("\n");
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
