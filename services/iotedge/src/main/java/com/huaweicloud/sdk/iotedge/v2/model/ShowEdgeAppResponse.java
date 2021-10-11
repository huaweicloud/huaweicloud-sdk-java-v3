package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEdgeAppResponse extends SdkResponse {



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

    public ShowEdgeAppResponse withEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
        return this;
    }

    


    /**
     * 应用名称
     * @return edgeAppId
     */
    public String getEdgeAppId() {
        return edgeAppId;
    }

    public void setEdgeAppId(String edgeAppId) {
        this.edgeAppId = edgeAppId;
    }

    

    public ShowEdgeAppResponse withDescription(String description) {
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

    

    public ShowEdgeAppResponse withCreateTime(String createTime) {
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

    

    public ShowEdgeAppResponse withUpdateTime(String updateTime) {
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

    

    public ShowEdgeAppResponse withLastPublishedVersion(String lastPublishedVersion) {
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

    

    public ShowEdgeAppResponse withAppType(String appType) {
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

    

    public ShowEdgeAppResponse withFunctionType(String functionType) {
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

    

    public ShowEdgeAppResponse withDeployType(String deployType) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEdgeAppResponse showEdgeAppResponse = (ShowEdgeAppResponse) o;
        return Objects.equals(this.edgeAppId, showEdgeAppResponse.edgeAppId) &&
            Objects.equals(this.description, showEdgeAppResponse.description) &&
            Objects.equals(this.createTime, showEdgeAppResponse.createTime) &&
            Objects.equals(this.updateTime, showEdgeAppResponse.updateTime) &&
            Objects.equals(this.lastPublishedVersion, showEdgeAppResponse.lastPublishedVersion) &&
            Objects.equals(this.appType, showEdgeAppResponse.appType) &&
            Objects.equals(this.functionType, showEdgeAppResponse.functionType) &&
            Objects.equals(this.deployType, showEdgeAppResponse.deployType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeAppId, description, createTime, updateTime, lastPublishedVersion, appType, functionType, deployType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeAppResponse {\n");
        sb.append("    edgeAppId: ").append(toIndentedString(edgeAppId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    lastPublishedVersion: ").append(toIndentedString(lastPublishedVersion)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    functionType: ").append(toIndentedString(functionType)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
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

