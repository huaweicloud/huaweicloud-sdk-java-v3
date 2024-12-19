package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowInstanceVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_minor_version")

    private String engineMinorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_engine_minor_version")

    private String latestEngineMinorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_minor_version")

    private String proxyMinorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_proxy_minor_version")

    private String latestProxyMinorVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_minor_version_upgradable")

    private Boolean engineMinorVersionUpgradable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_minor_version_upgradable")

    private Boolean proxyMinorVersionUpgradable;

    public ShowInstanceVersionResponse withEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
        return this;
    }

    /**
     * 当前实例内核小版本信息。
     * @return engineMinorVersion
     */
    public String getEngineMinorVersion() {
        return engineMinorVersion;
    }

    public void setEngineMinorVersion(String engineMinorVersion) {
        this.engineMinorVersion = engineMinorVersion;
    }

    public ShowInstanceVersionResponse withLatestEngineMinorVersion(String latestEngineMinorVersion) {
        this.latestEngineMinorVersion = latestEngineMinorVersion;
        return this;
    }

    /**
     * DCS实例最新的内核小版本信息。
     * @return latestEngineMinorVersion
     */
    public String getLatestEngineMinorVersion() {
        return latestEngineMinorVersion;
    }

    public void setLatestEngineMinorVersion(String latestEngineMinorVersion) {
        this.latestEngineMinorVersion = latestEngineMinorVersion;
    }

    public ShowInstanceVersionResponse withProxyMinorVersion(String proxyMinorVersion) {
        this.proxyMinorVersion = proxyMinorVersion;
        return this;
    }

    /**
     * 当前实例proxy代理节点版本信息。
     * @return proxyMinorVersion
     */
    public String getProxyMinorVersion() {
        return proxyMinorVersion;
    }

    public void setProxyMinorVersion(String proxyMinorVersion) {
        this.proxyMinorVersion = proxyMinorVersion;
    }

    public ShowInstanceVersionResponse withLatestProxyMinorVersion(String latestProxyMinorVersion) {
        this.latestProxyMinorVersion = latestProxyMinorVersion;
        return this;
    }

    /**
     * DCS实例最新的proxy代理节点版本信息。
     * @return latestProxyMinorVersion
     */
    public String getLatestProxyMinorVersion() {
        return latestProxyMinorVersion;
    }

    public void setLatestProxyMinorVersion(String latestProxyMinorVersion) {
        this.latestProxyMinorVersion = latestProxyMinorVersion;
    }

    public ShowInstanceVersionResponse withEngineMinorVersionUpgradable(Boolean engineMinorVersionUpgradable) {
        this.engineMinorVersionUpgradable = engineMinorVersionUpgradable;
        return this;
    }

    /**
     * 当前实例内核是否可以升级。
     * @return engineMinorVersionUpgradable
     */
    public Boolean getEngineMinorVersionUpgradable() {
        return engineMinorVersionUpgradable;
    }

    public void setEngineMinorVersionUpgradable(Boolean engineMinorVersionUpgradable) {
        this.engineMinorVersionUpgradable = engineMinorVersionUpgradable;
    }

    public ShowInstanceVersionResponse withProxyMinorVersionUpgradable(Boolean proxyMinorVersionUpgradable) {
        this.proxyMinorVersionUpgradable = proxyMinorVersionUpgradable;
        return this;
    }

    /**
     * 当前实例proxy代理节点是否可以升级。
     * @return proxyMinorVersionUpgradable
     */
    public Boolean getProxyMinorVersionUpgradable() {
        return proxyMinorVersionUpgradable;
    }

    public void setProxyMinorVersionUpgradable(Boolean proxyMinorVersionUpgradable) {
        this.proxyMinorVersionUpgradable = proxyMinorVersionUpgradable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceVersionResponse that = (ShowInstanceVersionResponse) obj;
        return Objects.equals(this.engineMinorVersion, that.engineMinorVersion)
            && Objects.equals(this.latestEngineMinorVersion, that.latestEngineMinorVersion)
            && Objects.equals(this.proxyMinorVersion, that.proxyMinorVersion)
            && Objects.equals(this.latestProxyMinorVersion, that.latestProxyMinorVersion)
            && Objects.equals(this.engineMinorVersionUpgradable, that.engineMinorVersionUpgradable)
            && Objects.equals(this.proxyMinorVersionUpgradable, that.proxyMinorVersionUpgradable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engineMinorVersion,
            latestEngineMinorVersion,
            proxyMinorVersion,
            latestProxyMinorVersion,
            engineMinorVersionUpgradable,
            proxyMinorVersionUpgradable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceVersionResponse {\n");
        sb.append("    engineMinorVersion: ").append(toIndentedString(engineMinorVersion)).append("\n");
        sb.append("    latestEngineMinorVersion: ").append(toIndentedString(latestEngineMinorVersion)).append("\n");
        sb.append("    proxyMinorVersion: ").append(toIndentedString(proxyMinorVersion)).append("\n");
        sb.append("    latestProxyMinorVersion: ").append(toIndentedString(latestProxyMinorVersion)).append("\n");
        sb.append("    engineMinorVersionUpgradable: ")
            .append(toIndentedString(engineMinorVersionUpgradable))
            .append("\n");
        sb.append("    proxyMinorVersionUpgradable: ")
            .append(toIndentedString(proxyMinorVersionUpgradable))
            .append("\n");
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
