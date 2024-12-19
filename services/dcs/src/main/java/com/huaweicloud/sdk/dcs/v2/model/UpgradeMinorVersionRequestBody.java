package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 升级实例小版本请求体，proxy_minor_version和engine_minor_version不能同时为空
 */
public class UpgradeMinorVersionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_minor_version")

    private String proxyMinorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_minor_version")

    private String engineMinorVersion;

    public UpgradeMinorVersionRequestBody withProxyMinorVersion(String proxyMinorVersion) {
        this.proxyMinorVersion = proxyMinorVersion;
        return this;
    }

    /**
     * Proxy代理节点目标版本号，设置为latest时，即升级到最新版本。
     * @return proxyMinorVersion
     */
    public String getProxyMinorVersion() {
        return proxyMinorVersion;
    }

    public void setProxyMinorVersion(String proxyMinorVersion) {
        this.proxyMinorVersion = proxyMinorVersion;
    }

    public UpgradeMinorVersionRequestBody withEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }

    /**
     * 引擎目标小版本号，设置为latest时，即升级到最新版本。
     * @return engineMinorVersion
     */
    public String getEngineMinorVersion() {
        return engineMinorVersion;
    }

    public void setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeMinorVersionRequestBody that = (UpgradeMinorVersionRequestBody) obj;
        return Objects.equals(this.proxyMinorVersion, that.proxyMinorVersion)
            && Objects.equals(this.engineMinorVersion, that.engineMinorVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyMinorVersion, engineMinorVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeMinorVersionRequestBody {\n");
        sb.append("    proxyMinorVersion: ").append(toIndentedString(proxyMinorVersion)).append("\n");
        sb.append("    engineMinorVersion: ").append(toIndentedString(engineMinorVersion)).append("\n");
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
