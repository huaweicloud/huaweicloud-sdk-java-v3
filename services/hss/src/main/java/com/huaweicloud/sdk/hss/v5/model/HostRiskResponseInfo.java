package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HostRiskResponseInfo
 */
public class HostRiskResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private String agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_result_code")

    private String installResultCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private String protectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detect_result")

    private String detectResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset")

    private Integer asset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerability")

    private Integer vulnerability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private Integer baseline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion")

    private Integer intrusion;

    public HostRiskResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 服务器ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public HostRiskResponseInfo withAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * Agent状态，包含如下5种。   - not_installed ：未安装。   - online ：在线。   - offline ：离线。   - install_failed ：安装失败。   - installing ：安装中。
     * @return agentStatus
     */
    public String getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
    }

    public HostRiskResponseInfo withInstallResultCode(String installResultCode) {
        this.installResultCode = installResultCode;
        return this;
    }

    /**
     * 安装结果，包含如下12种。   - install_succeed ：安装成功。   - network_access_timeout ：网络不通，访问超时。   - invalid_port ：无效端口。   - auth_failed ：认证错误，口令不正确。   - permission_denied ：权限错误，被拒绝。   - no_available_vpc ：没有相同VPC的agent在线虚拟机。   - install_exception ：安装异常。   - invalid_param ：参数错误。   - install_failed ：安装失败。   - package_unavailable ：安装包失效。   - os_type_not_support ：系统类型错误。   - os_arch_not_support ：架构类型错误。
     * @return installResultCode
     */
    public String getInstallResultCode() {
        return installResultCode;
    }

    public void setInstallResultCode(String installResultCode) {
        this.installResultCode = installResultCode;
    }

    public HostRiskResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 主机开通的版本，包含如下7种输入。   - hss.version.null ：无。   - hss.version.basic ：基础版。   - hss.version.advanced ：专业版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。   - hss.version.container.enterprise ：容器版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public HostRiskResponseInfo withProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * 防护状态，包含如下2种。 - closed ：未防护。 - opened ：防护中。
     * @return protectStatus
     */
    public String getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(String protectStatus) {
        this.protectStatus = protectStatus;
    }

    public HostRiskResponseInfo withDetectResult(String detectResult) {
        this.detectResult = detectResult;
        return this;
    }

    /**
     * 云主机安全检测结果，包含如下4种。 - undetected ：未检测。 - clean ：无风险。 - risk ：有风险。 - scanning ：检测中。
     * @return detectResult
     */
    public String getDetectResult() {
        return detectResult;
    }

    public void setDetectResult(String detectResult) {
        this.detectResult = detectResult;
    }

    public HostRiskResponseInfo withAsset(Integer asset) {
        this.asset = asset;
        return this;
    }

    /**
     * 资产风险
     * minimum: 0
     * maximum: 2097152
     * @return asset
     */
    public Integer getAsset() {
        return asset;
    }

    public void setAsset(Integer asset) {
        this.asset = asset;
    }

    public HostRiskResponseInfo withVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
        return this;
    }

    /**
     * 漏洞风险
     * minimum: 0
     * maximum: 2097152
     * @return vulnerability
     */
    public Integer getVulnerability() {
        return vulnerability;
    }

    public void setVulnerability(Integer vulnerability) {
        this.vulnerability = vulnerability;
    }

    public HostRiskResponseInfo withBaseline(Integer baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 基线风险
     * minimum: 0
     * maximum: 2097152
     * @return baseline
     */
    public Integer getBaseline() {
        return baseline;
    }

    public void setBaseline(Integer baseline) {
        this.baseline = baseline;
    }

    public HostRiskResponseInfo withIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
        return this;
    }

    /**
     * 入侵风险
     * minimum: 0
     * maximum: 2097152
     * @return intrusion
     */
    public Integer getIntrusion() {
        return intrusion;
    }

    public void setIntrusion(Integer intrusion) {
        this.intrusion = intrusion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostRiskResponseInfo that = (HostRiskResponseInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.installResultCode, that.installResultCode)
            && Objects.equals(this.version, that.version) && Objects.equals(this.protectStatus, that.protectStatus)
            && Objects.equals(this.detectResult, that.detectResult) && Objects.equals(this.asset, that.asset)
            && Objects.equals(this.vulnerability, that.vulnerability) && Objects.equals(this.baseline, that.baseline)
            && Objects.equals(this.intrusion, that.intrusion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            agentStatus,
            installResultCode,
            version,
            protectStatus,
            detectResult,
            asset,
            vulnerability,
            baseline,
            intrusion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HostRiskResponseInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    installResultCode: ").append(toIndentedString(installResultCode)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
        sb.append("    detectResult: ").append(toIndentedString(detectResult)).append("\n");
        sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
        sb.append("    vulnerability: ").append(toIndentedString(vulnerability)).append("\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
        sb.append("    intrusion: ").append(toIndentedString(intrusion)).append("\n");
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
