package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowApplicationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    @JacksonXmlProperty(localName = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    @JacksonXmlProperty(localName = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_app")

    @JacksonXmlProperty(localName = "default_app")

    private Boolean defaultApp;

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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApplicationResponse showApplicationResponse = (ShowApplicationResponse) o;
        return Objects.equals(this.appId, showApplicationResponse.appId)
            && Objects.equals(this.appName, showApplicationResponse.appName)
            && Objects.equals(this.createTime, showApplicationResponse.createTime)
            && Objects.equals(this.defaultApp, showApplicationResponse.defaultApp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appId, appName, createTime, defaultApp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationResponse {\n");
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
