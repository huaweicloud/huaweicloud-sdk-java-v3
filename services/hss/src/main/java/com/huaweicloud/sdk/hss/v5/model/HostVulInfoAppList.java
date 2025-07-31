package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostVulInfoAppList
 */
public class HostVulInfoAppList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_version")

    private String upgradeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    public HostVulInfoAppList withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * **参数解释**: 软件名称 **取值范围**: 字符范围0-256位 
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public HostVulInfoAppList withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**: 软件版本 **取值范围**: 字符范围0-256位 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public HostVulInfoAppList withUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
        return this;
    }

    /**
     * **参数解释**: 修复漏洞软件需要升级到的版本 **取值范围**: 字符范围0-256位 
     * @return upgradeVersion
     */
    public String getUpgradeVersion() {
        return upgradeVersion;
    }

    public void setUpgradeVersion(String upgradeVersion) {
        this.upgradeVersion = upgradeVersion;
    }

    public HostVulInfoAppList withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * **参数解释**: 应用软件的路径（只有应用漏洞有该字段） **取值范围**: 字符范围1-512位 
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostVulInfoAppList that = (HostVulInfoAppList) obj;
        return Objects.equals(this.appName, that.appName) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.upgradeVersion, that.upgradeVersion) && Objects.equals(this.appPath, that.appPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appName, appVersion, upgradeVersion, appPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostVulInfoAppList {\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    upgradeVersion: ").append(toIndentedString(upgradeVersion)).append("\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
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
