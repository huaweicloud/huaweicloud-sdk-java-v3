package com.huaweicloud.sdk.koophone.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceApplicationQueryRspDataResult
 */
public class InstanceApplicationQueryRspDataResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_pkg")

    private String appPkg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    public InstanceApplicationQueryRspDataResult withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public InstanceApplicationQueryRspDataResult withAppVersion(String appVersion) {
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

    public InstanceApplicationQueryRspDataResult withAppPkg(String appPkg) {
        this.appPkg = appPkg;
        return this;
    }

    /**
     * 应用包名
     * @return appPkg
     */
    public String getAppPkg() {
        return appPkg;
    }

    public void setAppPkg(String appPkg) {
        this.appPkg = appPkg;
    }

    public InstanceApplicationQueryRspDataResult withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * 图标地址
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceApplicationQueryRspDataResult that = (InstanceApplicationQueryRspDataResult) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.appPkg, that.appPkg) && Objects.equals(this.iconUrl, that.iconUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, appVersion, appPkg, iconUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceApplicationQueryRspDataResult {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    appPkg: ").append(toIndentedString(appPkg)).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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
