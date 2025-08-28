package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VulHostAppsResponseInfoPaths
 */
public class VulHostAppsResponseInfoPaths {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public VulHostAppsResponseInfoPaths withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * **参数解释**: 存在漏洞的软件路径 **取值范围**: 字符长度1-512位 
     * @return appPath
     */
    public String getAppPath() {
        return appPath;
    }

    public void setAppPath(String appPath) {
        this.appPath = appPath;
    }

    public VulHostAppsResponseInfoPaths withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * **参数解释**: 软件版本 **取值范围**: 字符长度1-64位 
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public VulHostAppsResponseInfoPaths withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 漏洞状态 **取值范围**: - vul_status_unfix：未处理 - vul_status_ignored：已忽略 - vul_status_verified：验证中 - vul_status_fixing：修复中 - vul_status_fixed：修复成功 - vul_status_reboot：修复成功待重启 - vul_status_failed：修复失败 - vul_status_fix_after_reboot：请重启主机再次修复 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VulHostAppsResponseInfoPaths that = (VulHostAppsResponseInfoPaths) obj;
        return Objects.equals(this.appPath, that.appPath) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appPath, appVersion, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulHostAppsResponseInfoPaths {\n");
        sb.append("    appPath: ").append(toIndentedString(appPath)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
