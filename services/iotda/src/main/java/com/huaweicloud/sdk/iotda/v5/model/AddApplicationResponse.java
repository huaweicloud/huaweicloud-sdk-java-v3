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
public class AddApplicationResponse extends SdkResponse {



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

    public AddApplicationResponse withAppId(String appId) {
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

    

    public AddApplicationResponse withAppName(String appName) {
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

    

    public AddApplicationResponse withCreateTime(String createTime) {
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

    

    public AddApplicationResponse withDefaultApp(Boolean defaultApp) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddApplicationResponse addApplicationResponse = (AddApplicationResponse) o;
        return Objects.equals(this.appId, addApplicationResponse.appId) &&
            Objects.equals(this.appName, addApplicationResponse.appName) &&
            Objects.equals(this.createTime, addApplicationResponse.createTime) &&
            Objects.equals(this.defaultApp, addApplicationResponse.defaultApp);
    }
    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, createTime, defaultApp);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddApplicationResponse {\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    defaultApp: ").append(toIndentedString(defaultApp)).append("\n");
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

