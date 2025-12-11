package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowProxyVersionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "can_upgrade")

    private Boolean canUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risk")

    private ProxyEngineRisk risk;

    public ShowProxyVersionResponse withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前代理版本
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public ShowProxyVersionResponse withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 最新代理版本
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ShowProxyVersionResponse withCanUpgrade(Boolean canUpgrade) {
        this.canUpgrade = canUpgrade;
        return this;
    }

    /**
     * 是否能升级
     * @return canUpgrade
     */
    public Boolean getCanUpgrade() {
        return canUpgrade;
    }

    public void setCanUpgrade(Boolean canUpgrade) {
        this.canUpgrade = canUpgrade;
    }

    public ShowProxyVersionResponse withRisk(ProxyEngineRisk risk) {
        this.risk = risk;
        return this;
    }

    public ShowProxyVersionResponse withRisk(Consumer<ProxyEngineRisk> riskSetter) {
        if (this.risk == null) {
            this.risk = new ProxyEngineRisk();
            riskSetter.accept(this.risk);
        }

        return this;
    }

    /**
     * Get risk
     * @return risk
     */
    public ProxyEngineRisk getRisk() {
        return risk;
    }

    public void setRisk(ProxyEngineRisk risk) {
        this.risk = risk;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowProxyVersionResponse that = (ShowProxyVersionResponse) obj;
        return Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.canUpgrade, that.canUpgrade) && Objects.equals(this.risk, that.risk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentVersion, latestVersion, canUpgrade, risk);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProxyVersionResponse {\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    canUpgrade: ").append(toIndentedString(canUpgrade)).append("\n");
        sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
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
