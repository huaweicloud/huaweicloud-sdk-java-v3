package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 风险预防订阅的项目
 */
public class ScansSubscriptionRes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vulnerabilities_statistics_status")

    private Boolean vulnerabilitiesStatisticsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_change_history_status")

    private Boolean accountChangeHistoryStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "danger_ports_status")

    private Boolean dangerPortsStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weak_pwd_status")

    private Boolean weakPwdStatus;

    public ScansSubscriptionRes withVulnerabilitiesStatisticsStatus(Boolean vulnerabilitiesStatisticsStatus) {
        this.vulnerabilitiesStatisticsStatus = vulnerabilitiesStatisticsStatus;
        return this;
    }

    /**
     * **参数解释**: 漏洞统计 **取值范围**: - true：开启 - false：关闭 
     * @return vulnerabilitiesStatisticsStatus
     */
    public Boolean getVulnerabilitiesStatisticsStatus() {
        return vulnerabilitiesStatisticsStatus;
    }

    public void setVulnerabilitiesStatisticsStatus(Boolean vulnerabilitiesStatisticsStatus) {
        this.vulnerabilitiesStatisticsStatus = vulnerabilitiesStatisticsStatus;
    }

    public ScansSubscriptionRes withAccountChangeHistoryStatus(Boolean accountChangeHistoryStatus) {
        this.accountChangeHistoryStatus = accountChangeHistoryStatus;
        return this;
    }

    /**
     * **参数解释**: 资产账号变动记录 **取值范围**: - true：开启 - false：关闭 
     * @return accountChangeHistoryStatus
     */
    public Boolean getAccountChangeHistoryStatus() {
        return accountChangeHistoryStatus;
    }

    public void setAccountChangeHistoryStatus(Boolean accountChangeHistoryStatus) {
        this.accountChangeHistoryStatus = accountChangeHistoryStatus;
    }

    public ScansSubscriptionRes withDangerPortsStatus(Boolean dangerPortsStatus) {
        this.dangerPortsStatus = dangerPortsStatus;
        return this;
    }

    /**
     * **参数解释**: 危险开放端口 **取值范围**: - true：开启 - false：关闭 
     * @return dangerPortsStatus
     */
    public Boolean getDangerPortsStatus() {
        return dangerPortsStatus;
    }

    public void setDangerPortsStatus(Boolean dangerPortsStatus) {
        this.dangerPortsStatus = dangerPortsStatus;
    }

    public ScansSubscriptionRes withWeakPwdStatus(Boolean weakPwdStatus) {
        this.weakPwdStatus = weakPwdStatus;
        return this;
    }

    /**
     * **参数解释**: 弱口令 **取值范围**: - true：开启 - false：关闭 
     * @return weakPwdStatus
     */
    public Boolean getWeakPwdStatus() {
        return weakPwdStatus;
    }

    public void setWeakPwdStatus(Boolean weakPwdStatus) {
        this.weakPwdStatus = weakPwdStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ScansSubscriptionRes that = (ScansSubscriptionRes) obj;
        return Objects.equals(this.vulnerabilitiesStatisticsStatus, that.vulnerabilitiesStatisticsStatus)
            && Objects.equals(this.accountChangeHistoryStatus, that.accountChangeHistoryStatus)
            && Objects.equals(this.dangerPortsStatus, that.dangerPortsStatus)
            && Objects.equals(this.weakPwdStatus, that.weakPwdStatus);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(vulnerabilitiesStatisticsStatus, accountChangeHistoryStatus, dangerPortsStatus, weakPwdStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScansSubscriptionRes {\n");
        sb.append("    vulnerabilitiesStatisticsStatus: ")
            .append(toIndentedString(vulnerabilitiesStatisticsStatus))
            .append("\n");
        sb.append("    accountChangeHistoryStatus: ").append(toIndentedString(accountChangeHistoryStatus)).append("\n");
        sb.append("    dangerPortsStatus: ").append(toIndentedString(dangerPortsStatus)).append("\n");
        sb.append("    weakPwdStatus: ").append(toIndentedString(weakPwdStatus)).append("\n");
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
