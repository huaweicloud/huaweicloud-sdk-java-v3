package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryApplicationBriefResponseDTO
 */
public class QueryApplicationBriefResponseDTO  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_id")
    

    private String edgeAppId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_published_version")
    

    private String lastPublishedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    

    private String appType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="function_type")
    

    private String functionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="deploy_type")
    

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_app_name")
    

    private String edgeAppName;

    public QueryApplicationBriefResponseDTO withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用id
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public QueryApplicationBriefResponseDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 应用描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public QueryApplicationBriefResponseDTO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public QueryApplicationBriefResponseDTO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    

    public QueryApplicationBriefResponseDTO withLastPublishedVersion(String lastPublishedVersion) {
        this.lastPublishedVersion = lastPublishedVersion;
        return this;
    }

    


    /**
     * 最新发布版本
     * @return lastPublishedVersion
     */
    public String getLastPublishedVersion() {
        return lastPublishedVersion;
    }

    public void setLastPublishedVersion(String lastPublishedVersion) {
        this.lastPublishedVersion = lastPublishedVersion;
    }

    

    public QueryApplicationBriefResponseDTO withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * 应用类型SYSTEM_REQUIRED|SYSTEM_OPTIONAL|USER
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    

    public QueryApplicationBriefResponseDTO withFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }

    


    /**
     * 应用类型DATA_PROCESSING|PROTOCOL_PARSING
     * @return functionType
     */
    public String getFunctionType() {
        return functionType;
    }

    public void setFunctionType(String functionType) {
        this.functionType = functionType;
    }

    

    public QueryApplicationBriefResponseDTO withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    


    /**
     * 部署类型docker|process
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    

    public QueryApplicationBriefResponseDTO withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    


    /**
     * 驱动协议类型OPCUA|Modbus-TCP
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    

    public QueryApplicationBriefResponseDTO withEdgeAppName(String edgeAppName) {
        this.edgeAppName = edgeAppName;
        return this;
    }

    


    /**
     * 应用名称
     * @return edgeAppName
     */
    public String getEdgeAppName() {
        return edgeAppName;
    }

    public void setEdgeAppName(String edgeAppName) {
        this.edgeAppName = edgeAppName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryApplicationBriefResponseDTO queryApplicationBriefResponseDTO = (QueryApplicationBriefResponseDTO) o;
        return Objects.equals(this.edgeAppId, queryApplicationBriefResponseDTO.edgeAppId) &&
            Objects.equals(this.description, queryApplicationBriefResponseDTO.description) &&
            Objects.equals(this.createTime, queryApplicationBriefResponseDTO.createTime) &&
            Objects.equals(this.updateTime, queryApplicationBriefResponseDTO.updateTime) &&
            Objects.equals(this.lastPublishedVersion, queryApplicationBriefResponseDTO.lastPublishedVersion) &&
            Objects.equals(this.appType, queryApplicationBriefResponseDTO.appType) &&
            Objects.equals(this.functionType, queryApplicationBriefResponseDTO.functionType) &&
            Objects.equals(this.deployType, queryApplicationBriefResponseDTO.deployType) &&
            Objects.equals(this.protocol, queryApplicationBriefResponseDTO.protocol) &&
            Objects.equals(this.edgeAppName, queryApplicationBriefResponseDTO.edgeAppName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, description, createTime, updateTime, lastPublishedVersion, appType, functionType, deployType, protocol, edgeAppName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryApplicationBriefResponseDTO {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastPublishedVersion: ").append(toIndentedString(lastPublishedVersion)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    edgeAppName: ").append(toIndentedString(edgeAppName)).append("\n");
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

