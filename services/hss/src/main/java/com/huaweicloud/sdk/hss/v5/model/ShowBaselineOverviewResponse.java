package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowBaselineOverviewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scan_time")

    private Long scanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_num")

    private Integer hostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_host_num")

    private Integer failedHostNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_type_num")

    private Integer checkTypeNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_num")

    private Integer checkRuleNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_pass_rate")

    private Integer checkRulePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_standard_check_rule_pass_rate")

    private Integer cnStandardCheckRulePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hw_standard_check_rule_pass_rate")

    private Integer hwStandardCheckRulePassRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_failed_num")

    private Integer checkRuleFailedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_high_risk")

    private Integer checkRuleHighRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_medium_risk")

    private Integer checkRuleMediumRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_rule_low_risk")

    private Integer checkRuleLowRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_total_host")

    private Integer weakPwdTotalHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_risk")

    private Integer weakPwdRisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_normal")

    private Integer weakPwdNormal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_not_protected")

    private Integer weakPwdNotProtected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_risks")

    private List<HostRiskNumInfoResponseInfo> hostRisks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_risk_hosts")

    private List<HostWeakPwdRiskNumInfoResponseInfo> weakPwdRiskHosts = null;

    public ShowBaselineOverviewResponse withScanTime(Long scanTime) {
        this.scanTime = scanTime;
        return this;
    }

    /**
     * **参数解释**: 最新检测时间(ms)。 **取值范围**: 取值0-9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return scanTime
     */
    public Long getScanTime() {
        return scanTime;
    }

    public void setScanTime(Long scanTime) {
        this.scanTime = scanTime;
    }

    public ShowBaselineOverviewResponse withHostNum(Integer hostNum) {
        this.hostNum = hostNum;
        return this;
    }

    /**
     * **参数解释**: 检查服务器数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hostNum
     */
    public Integer getHostNum() {
        return hostNum;
    }

    public void setHostNum(Integer hostNum) {
        this.hostNum = hostNum;
    }

    public ShowBaselineOverviewResponse withFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
        return this;
    }

    /**
     * **参数解释**: 未通过主机数。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return failedHostNum
     */
    public Integer getFailedHostNum() {
        return failedHostNum;
    }

    public void setFailedHostNum(Integer failedHostNum) {
        this.failedHostNum = failedHostNum;
    }

    public ShowBaselineOverviewResponse withCheckTypeNum(Integer checkTypeNum) {
        this.checkTypeNum = checkTypeNum;
        return this;
    }

    /**
     * **参数解释**: 检测基线数量。例如共检测了SSH、CentOS 7这2个配置检测（基线）类型，值就是2。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkTypeNum
     */
    public Integer getCheckTypeNum() {
        return checkTypeNum;
    }

    public void setCheckTypeNum(Integer checkTypeNum) {
        this.checkTypeNum = checkTypeNum;
    }

    public ShowBaselineOverviewResponse withCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
        return this;
    }

    /**
     * **参数解释**: 基线检测项（检测规则）数量。例如SSH基线检测了17条规则，CentOS 7基线检测了60条规则，值就是17+60=77。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleNum
     */
    public Integer getCheckRuleNum() {
        return checkRuleNum;
    }

    public void setCheckRuleNum(Integer checkRuleNum) {
        this.checkRuleNum = checkRuleNum;
    }

    public ShowBaselineOverviewResponse withCheckRulePassRate(Integer checkRulePassRate) {
        this.checkRulePassRate = checkRulePassRate;
        return this;
    }

    /**
     * **参数解释**: 基线检查项通过率\"。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRulePassRate
     */
    public Integer getCheckRulePassRate() {
        return checkRulePassRate;
    }

    public void setCheckRulePassRate(Integer checkRulePassRate) {
        this.checkRulePassRate = checkRulePassRate;
    }

    public ShowBaselineOverviewResponse withCnStandardCheckRulePassRate(Integer cnStandardCheckRulePassRate) {
        this.cnStandardCheckRulePassRate = cnStandardCheckRulePassRate;
        return this;
    }

    /**
     * **参数解释**: 云安全实践基线检查项通过率。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return cnStandardCheckRulePassRate
     */
    public Integer getCnStandardCheckRulePassRate() {
        return cnStandardCheckRulePassRate;
    }

    public void setCnStandardCheckRulePassRate(Integer cnStandardCheckRulePassRate) {
        this.cnStandardCheckRulePassRate = cnStandardCheckRulePassRate;
    }

    public ShowBaselineOverviewResponse withHwStandardCheckRulePassRate(Integer hwStandardCheckRulePassRate) {
        this.hwStandardCheckRulePassRate = hwStandardCheckRulePassRate;
        return this;
    }

    /**
     * **参数解释**: 等保合规基线检查项通过率。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return hwStandardCheckRulePassRate
     */
    public Integer getHwStandardCheckRulePassRate() {
        return hwStandardCheckRulePassRate;
    }

    public void setHwStandardCheckRulePassRate(Integer hwStandardCheckRulePassRate) {
        this.hwStandardCheckRulePassRate = hwStandardCheckRulePassRate;
    }

    public ShowBaselineOverviewResponse withCheckRuleFailedNum(Integer checkRuleFailedNum) {
        this.checkRuleFailedNum = checkRuleFailedNum;
        return this;
    }

    /**
     * **参数解释**: 未通过的检查项数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleFailedNum
     */
    public Integer getCheckRuleFailedNum() {
        return checkRuleFailedNum;
    }

    public void setCheckRuleFailedNum(Integer checkRuleFailedNum) {
        this.checkRuleFailedNum = checkRuleFailedNum;
    }

    public ShowBaselineOverviewResponse withCheckRuleHighRisk(Integer checkRuleHighRisk) {
        this.checkRuleHighRisk = checkRuleHighRisk;
        return this;
    }

    /**
     * **参数解释**: 高危检查项数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleHighRisk
     */
    public Integer getCheckRuleHighRisk() {
        return checkRuleHighRisk;
    }

    public void setCheckRuleHighRisk(Integer checkRuleHighRisk) {
        this.checkRuleHighRisk = checkRuleHighRisk;
    }

    public ShowBaselineOverviewResponse withCheckRuleMediumRisk(Integer checkRuleMediumRisk) {
        this.checkRuleMediumRisk = checkRuleMediumRisk;
        return this;
    }

    /**
     * **参数解释**: 中危检查项数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleMediumRisk
     */
    public Integer getCheckRuleMediumRisk() {
        return checkRuleMediumRisk;
    }

    public void setCheckRuleMediumRisk(Integer checkRuleMediumRisk) {
        this.checkRuleMediumRisk = checkRuleMediumRisk;
    }

    public ShowBaselineOverviewResponse withCheckRuleLowRisk(Integer checkRuleLowRisk) {
        this.checkRuleLowRisk = checkRuleLowRisk;
        return this;
    }

    /**
     * **参数解释**: 低危检查项数量。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return checkRuleLowRisk
     */
    public Integer getCheckRuleLowRisk() {
        return checkRuleLowRisk;
    }

    public void setCheckRuleLowRisk(Integer checkRuleLowRisk) {
        this.checkRuleLowRisk = checkRuleLowRisk;
    }

    public ShowBaselineOverviewResponse withWeakPwdTotalHost(Integer weakPwdTotalHost) {
        this.weakPwdTotalHost = weakPwdTotalHost;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测主机总数。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return weakPwdTotalHost
     */
    public Integer getWeakPwdTotalHost() {
        return weakPwdTotalHost;
    }

    public void setWeakPwdTotalHost(Integer weakPwdTotalHost) {
        this.weakPwdTotalHost = weakPwdTotalHost;
    }

    public ShowBaselineOverviewResponse withWeakPwdRisk(Integer weakPwdRisk) {
        this.weakPwdRisk = weakPwdRisk;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测结果：有弱口令的主机数。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return weakPwdRisk
     */
    public Integer getWeakPwdRisk() {
        return weakPwdRisk;
    }

    public void setWeakPwdRisk(Integer weakPwdRisk) {
        this.weakPwdRisk = weakPwdRisk;
    }

    public ShowBaselineOverviewResponse withWeakPwdNormal(Integer weakPwdNormal) {
        this.weakPwdNormal = weakPwdNormal;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测结果：无弱口令的主机数。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return weakPwdNormal
     */
    public Integer getWeakPwdNormal() {
        return weakPwdNormal;
    }

    public void setWeakPwdNormal(Integer weakPwdNormal) {
        this.weakPwdNormal = weakPwdNormal;
    }

    public ShowBaselineOverviewResponse withWeakPwdNotProtected(Integer weakPwdNotProtected) {
        this.weakPwdNotProtected = weakPwdNotProtected;
        return this;
    }

    /**
     * **参数解释**: 弱口令检测结果：未开启防护的主机数。 **取值范围**: 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return weakPwdNotProtected
     */
    public Integer getWeakPwdNotProtected() {
        return weakPwdNotProtected;
    }

    public void setWeakPwdNotProtected(Integer weakPwdNotProtected) {
        this.weakPwdNotProtected = weakPwdNotProtected;
    }

    public ShowBaselineOverviewResponse withHostRisks(List<HostRiskNumInfoResponseInfo> hostRisks) {
        this.hostRisks = hostRisks;
        return this;
    }

    public ShowBaselineOverviewResponse addHostRisksItem(HostRiskNumInfoResponseInfo hostRisksItem) {
        if (this.hostRisks == null) {
            this.hostRisks = new ArrayList<>();
        }
        this.hostRisks.add(hostRisksItem);
        return this;
    }

    public ShowBaselineOverviewResponse withHostRisks(Consumer<List<HostRiskNumInfoResponseInfo>> hostRisksSetter) {
        if (this.hostRisks == null) {
            this.hostRisks = new ArrayList<>();
        }
        hostRisksSetter.accept(this.hostRisks);
        return this;
    }

    /**
     * 服务器风险TOP5列表
     * @return hostRisks
     */
    public List<HostRiskNumInfoResponseInfo> getHostRisks() {
        return hostRisks;
    }

    public void setHostRisks(List<HostRiskNumInfoResponseInfo> hostRisks) {
        this.hostRisks = hostRisks;
    }

    public ShowBaselineOverviewResponse withWeakPwdRiskHosts(
        List<HostWeakPwdRiskNumInfoResponseInfo> weakPwdRiskHosts) {
        this.weakPwdRiskHosts = weakPwdRiskHosts;
        return this;
    }

    public ShowBaselineOverviewResponse addWeakPwdRiskHostsItem(
        HostWeakPwdRiskNumInfoResponseInfo weakPwdRiskHostsItem) {
        if (this.weakPwdRiskHosts == null) {
            this.weakPwdRiskHosts = new ArrayList<>();
        }
        this.weakPwdRiskHosts.add(weakPwdRiskHostsItem);
        return this;
    }

    public ShowBaselineOverviewResponse withWeakPwdRiskHosts(
        Consumer<List<HostWeakPwdRiskNumInfoResponseInfo>> weakPwdRiskHostsSetter) {
        if (this.weakPwdRiskHosts == null) {
            this.weakPwdRiskHosts = new ArrayList<>();
        }
        weakPwdRiskHostsSetter.accept(this.weakPwdRiskHosts);
        return this;
    }

    /**
     * 主机弱口令风险TOP5列表
     * @return weakPwdRiskHosts
     */
    public List<HostWeakPwdRiskNumInfoResponseInfo> getWeakPwdRiskHosts() {
        return weakPwdRiskHosts;
    }

    public void setWeakPwdRiskHosts(List<HostWeakPwdRiskNumInfoResponseInfo> weakPwdRiskHosts) {
        this.weakPwdRiskHosts = weakPwdRiskHosts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBaselineOverviewResponse that = (ShowBaselineOverviewResponse) obj;
        return Objects.equals(this.scanTime, that.scanTime) && Objects.equals(this.hostNum, that.hostNum)
            && Objects.equals(this.failedHostNum, that.failedHostNum)
            && Objects.equals(this.checkTypeNum, that.checkTypeNum)
            && Objects.equals(this.checkRuleNum, that.checkRuleNum)
            && Objects.equals(this.checkRulePassRate, that.checkRulePassRate)
            && Objects.equals(this.cnStandardCheckRulePassRate, that.cnStandardCheckRulePassRate)
            && Objects.equals(this.hwStandardCheckRulePassRate, that.hwStandardCheckRulePassRate)
            && Objects.equals(this.checkRuleFailedNum, that.checkRuleFailedNum)
            && Objects.equals(this.checkRuleHighRisk, that.checkRuleHighRisk)
            && Objects.equals(this.checkRuleMediumRisk, that.checkRuleMediumRisk)
            && Objects.equals(this.checkRuleLowRisk, that.checkRuleLowRisk)
            && Objects.equals(this.weakPwdTotalHost, that.weakPwdTotalHost)
            && Objects.equals(this.weakPwdRisk, that.weakPwdRisk)
            && Objects.equals(this.weakPwdNormal, that.weakPwdNormal)
            && Objects.equals(this.weakPwdNotProtected, that.weakPwdNotProtected)
            && Objects.equals(this.hostRisks, that.hostRisks)
            && Objects.equals(this.weakPwdRiskHosts, that.weakPwdRiskHosts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scanTime,
            hostNum,
            failedHostNum,
            checkTypeNum,
            checkRuleNum,
            checkRulePassRate,
            cnStandardCheckRulePassRate,
            hwStandardCheckRulePassRate,
            checkRuleFailedNum,
            checkRuleHighRisk,
            checkRuleMediumRisk,
            checkRuleLowRisk,
            weakPwdTotalHost,
            weakPwdRisk,
            weakPwdNormal,
            weakPwdNotProtected,
            hostRisks,
            weakPwdRiskHosts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBaselineOverviewResponse {\n");
        sb.append("    scanTime: ").append(toIndentedString(scanTime)).append("\n");
        sb.append("    hostNum: ").append(toIndentedString(hostNum)).append("\n");
        sb.append("    failedHostNum: ").append(toIndentedString(failedHostNum)).append("\n");
        sb.append("    checkTypeNum: ").append(toIndentedString(checkTypeNum)).append("\n");
        sb.append("    checkRuleNum: ").append(toIndentedString(checkRuleNum)).append("\n");
        sb.append("    checkRulePassRate: ").append(toIndentedString(checkRulePassRate)).append("\n");
        sb.append("    cnStandardCheckRulePassRate: ")
            .append(toIndentedString(cnStandardCheckRulePassRate))
            .append("\n");
        sb.append("    hwStandardCheckRulePassRate: ")
            .append(toIndentedString(hwStandardCheckRulePassRate))
            .append("\n");
        sb.append("    checkRuleFailedNum: ").append(toIndentedString(checkRuleFailedNum)).append("\n");
        sb.append("    checkRuleHighRisk: ").append(toIndentedString(checkRuleHighRisk)).append("\n");
        sb.append("    checkRuleMediumRisk: ").append(toIndentedString(checkRuleMediumRisk)).append("\n");
        sb.append("    checkRuleLowRisk: ").append(toIndentedString(checkRuleLowRisk)).append("\n");
        sb.append("    weakPwdTotalHost: ").append(toIndentedString(weakPwdTotalHost)).append("\n");
        sb.append("    weakPwdRisk: ").append(toIndentedString(weakPwdRisk)).append("\n");
        sb.append("    weakPwdNormal: ").append(toIndentedString(weakPwdNormal)).append("\n");
        sb.append("    weakPwdNotProtected: ").append(toIndentedString(weakPwdNotProtected)).append("\n");
        sb.append("    hostRisks: ").append(toIndentedString(hostRisks)).append("\n");
        sb.append("    weakPwdRiskHosts: ").append(toIndentedString(weakPwdRiskHosts)).append("\n");
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
