package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryAppInstanceResp
 */
public class QueryAppInstanceResp  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="namespace")
    

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="version")
    

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_version")
    

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status_description")
    

    private String statusDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="values")
    

    private Object values;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    

    private String updateTime;

    public QueryAppInstanceResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 应用实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public QueryAppInstanceResp withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    


    /**
     * 边缘集群命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    

    public QueryAppInstanceResp withVersion(String version) {
        this.version = version;
        return this;
    }

    


    /**
     * 应用实例版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    

    public QueryAppInstanceResp withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用ID
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public QueryAppInstanceResp withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    


    /**
     * 应用版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    

    public QueryAppInstanceResp withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 应用实例状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public QueryAppInstanceResp withStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
        return this;
    }

    


    /**
     * 状态描述
     * @return statusDescription
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    

    public QueryAppInstanceResp withValues(Object values) {
        this.values = values;
        return this;
    }

    


    /**
     * 应用实例chart配置
     * @return values
     */
    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    

    public QueryAppInstanceResp withCreateTime(String createTime) {
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

    

    public QueryAppInstanceResp withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 最后一次更新时间
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
        QueryAppInstanceResp queryAppInstanceResp = (QueryAppInstanceResp) o;
        return Objects.equals(this.id, queryAppInstanceResp.id) &&
            Objects.equals(this.namespace, queryAppInstanceResp.namespace) &&
            Objects.equals(this.version, queryAppInstanceResp.version) &&
            Objects.equals(this.appId, queryAppInstanceResp.appId) &&
            Objects.equals(this.appVersion, queryAppInstanceResp.appVersion) &&
            Objects.equals(this.status, queryAppInstanceResp.status) &&
            Objects.equals(this.statusDescription, queryAppInstanceResp.statusDescription) &&
            Objects.equals(this.values, queryAppInstanceResp.values) &&
            Objects.equals(this.createTime, queryAppInstanceResp.createTime) &&
            Objects.equals(this.updateTime, queryAppInstanceResp.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, namespace, version, appId, appVersion, status, statusDescription, values, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryAppInstanceResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDescription: ").append(toIndentedString(statusDescription)).append("\n");
        sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

