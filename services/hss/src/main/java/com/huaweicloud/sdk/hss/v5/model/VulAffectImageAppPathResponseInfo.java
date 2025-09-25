package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 受漏洞影响镜像的软件路径
 */
public class VulAffectImageAppPathResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_version")

    private String appVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_path")

    private String appPath;

    public VulAffectImageAppPathResponseInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 处理状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public VulAffectImageAppPathResponseInfo withAppVersion(String appVersion) {
        this.appVersion = appVersion;
        return this;
    }

    /**
     * 软件版本
     * @return appVersion
     */
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public VulAffectImageAppPathResponseInfo withAppPath(String appPath) {
        this.appPath = appPath;
        return this;
    }

    /**
     * 软件路径
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
        VulAffectImageAppPathResponseInfo that = (VulAffectImageAppPathResponseInfo) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.appVersion, that.appVersion)
            && Objects.equals(this.appPath, that.appPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, appVersion, appPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VulAffectImageAppPathResponseInfo {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
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
