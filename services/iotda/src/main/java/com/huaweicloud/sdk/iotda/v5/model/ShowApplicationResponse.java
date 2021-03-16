package com.huaweicloud.sdk.iotda.v5.model;




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
public class ShowApplicationResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    private String appId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_name")
    
    private String appName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_app")
    
    private Boolean defaultApp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_type")
    
    private String appType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="username")
    
    private String username;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="permission")
    
    private String permission;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_instance_id")
    
    private String lastInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="current_instance_id")
    
    private String currentInstanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="service_name")
    
    private String serviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="freezed")
    
    private Boolean freezed;

    public ShowApplicationResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 资源空间ID，唯一标识一个资源空间，由物联网平台在创建资源空间时分配。资源空间对应的是物联网平台原有的应用，在物联网平台的含义与应用一致，只是变更了名称。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    public ShowApplicationResponse withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    


    /**
     * 资源空间名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    

    public ShowApplicationResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 资源空间创建时间，格式：yyyyMMdd'T'HHmmss'Z'，如20151212T121212Z。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    

    public ShowApplicationResponse withDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
        return this;
    }

    


    /**
     * 是否为默认资源空间
     * @return defaultApp
     */
    public Boolean getDefaultApp() {
        return defaultApp;
    }

    public void setDefaultApp(Boolean defaultApp) {
        this.defaultApp = defaultApp;
    }

    

    public ShowApplicationResponse withAppType(String appType) {
        this.appType = appType;
        return this;
    }

    


    /**
     * app的类型，标准版：Junior | 高级版：Normal
     * @return appType
     */
    public String getAppType() {
        return appType;
    }

    public void setAppType(String appType) {
        this.appType = appType;
    }

    

    public ShowApplicationResponse withUsername(String username) {
        this.username = username;
        return this;
    }

    


    /**
     * 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    

    public ShowApplicationResponse withPermission(String permission) {
        this.permission = permission;
        return this;
    }

    


    /**
     * app与用户的授权关系时，响应为：all | bind | edit | query ，其中bind权限类似于ALL权限，属于子用户权限。
     * @return permission
     */
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    

    public ShowApplicationResponse withLastInstanceId(String lastInstanceId) {
        this.lastInstanceId = lastInstanceId;
        return this;
    }

    


    /**
     * 迁移前实例ID。
     * @return lastInstanceId
     */
    public String getLastInstanceId() {
        return lastInstanceId;
    }

    public void setLastInstanceId(String lastInstanceId) {
        this.lastInstanceId = lastInstanceId;
    }

    

    public ShowApplicationResponse withCurrentInstanceId(String currentInstanceId) {
        this.currentInstanceId = currentInstanceId;
        return this;
    }

    


    /**
     * 当前实例ID。
     * @return currentInstanceId
     */
    public String getCurrentInstanceId() {
        return currentInstanceId;
    }

    public void setCurrentInstanceId(String currentInstanceId) {
        this.currentInstanceId = currentInstanceId;
    }

    

    public ShowApplicationResponse withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    


    /**
     * 对接的服务名
     * @return serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    

    public ShowApplicationResponse withFreezed(Boolean freezed) {
        this.freezed = freezed;
        return this;
    }

    


    /**
     * 是否冻结
     * @return freezed
     */
    public Boolean getFreezed() {
        return freezed;
    }

    public void setFreezed(Boolean freezed) {
        this.freezed = freezed;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApplicationResponse showApplicationResponse = (ShowApplicationResponse) o;
        return Objects.equals(this.appId, showApplicationResponse.appId) &&
            Objects.equals(this.appName, showApplicationResponse.appName) &&
            Objects.equals(this.createTime, showApplicationResponse.createTime) &&
            Objects.equals(this.defaultApp, showApplicationResponse.defaultApp) &&
            Objects.equals(this.appType, showApplicationResponse.appType) &&
            Objects.equals(this.username, showApplicationResponse.username) &&
            Objects.equals(this.permission, showApplicationResponse.permission) &&
            Objects.equals(this.lastInstanceId, showApplicationResponse.lastInstanceId) &&
            Objects.equals(this.currentInstanceId, showApplicationResponse.currentInstanceId) &&
            Objects.equals(this.serviceName, showApplicationResponse.serviceName) &&
            Objects.equals(this.freezed, showApplicationResponse.freezed);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, createTime, defaultApp, appType, username, permission, lastInstanceId, currentInstanceId, serviceName, freezed);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    defaultApp: ").append(toIndentedString(defaultApp)).append("\n");
        sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    lastInstanceId: ").append(toIndentedString(lastInstanceId)).append("\n");
        sb.append("    currentInstanceId: ").append(toIndentedString(currentInstanceId)).append("\n");
        sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
        sb.append("    freezed: ").append(toIndentedString(freezed)).append("\n");
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

