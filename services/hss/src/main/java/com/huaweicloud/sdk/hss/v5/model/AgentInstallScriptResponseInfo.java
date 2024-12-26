package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * agent安装脚本
 */
public class AgentInstallScriptResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_type")

    private String packageType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_download_url")

    private String packageDownloadUrl;

    public AgentInstallScriptResponseInfo withPackageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * 包类型
     * @return packageType
     */
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public AgentInstallScriptResponseInfo withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * 命令
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public AgentInstallScriptResponseInfo withPackageDownloadUrl(String packageDownloadUrl) {
        this.packageDownloadUrl = packageDownloadUrl;
        return this;
    }

    /**
     * 包下载url
     * @return packageDownloadUrl
     */
    public String getPackageDownloadUrl() {
        return packageDownloadUrl;
    }

    public void setPackageDownloadUrl(String packageDownloadUrl) {
        this.packageDownloadUrl = packageDownloadUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInstallScriptResponseInfo that = (AgentInstallScriptResponseInfo) obj;
        return Objects.equals(this.packageType, that.packageType) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.packageDownloadUrl, that.packageDownloadUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageType, cmd, packageDownloadUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInstallScriptResponseInfo {\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    packageDownloadUrl: ").append(toIndentedString(packageDownloadUrl)).append("\n");
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
