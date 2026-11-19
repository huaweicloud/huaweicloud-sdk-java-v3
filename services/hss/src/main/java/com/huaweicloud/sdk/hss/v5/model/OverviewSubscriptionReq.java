package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安全总览订阅信息
 */
public class OverviewSubscriptionReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dashboard_status")

    private Boolean dashboardStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_trend_status")

    private Boolean riskyTrendStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "risky_distribution_status")

    private Boolean riskyDistributionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_risky_host_status")

    private Boolean topRiskyHostStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_account_crack_status")

    private Boolean topAccountCrackStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info_status")

    private Boolean hostInfoStatus;

    public OverviewSubscriptionReq withDashboardStatus(Boolean dashboardStatus) {
        this.dashboardStatus = dashboardStatus;
        return this;
    }

    /**
     * **参数解释**： 安全总览是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return dashboardStatus
     */
    public Boolean getDashboardStatus() {
        return dashboardStatus;
    }

    public void setDashboardStatus(Boolean dashboardStatus) {
        this.dashboardStatus = dashboardStatus;
    }

    public OverviewSubscriptionReq withRiskyTrendStatus(Boolean riskyTrendStatus) {
        this.riskyTrendStatus = riskyTrendStatus;
        return this;
    }

    /**
     * **参数解释**： 风险趋势是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return riskyTrendStatus
     */
    public Boolean getRiskyTrendStatus() {
        return riskyTrendStatus;
    }

    public void setRiskyTrendStatus(Boolean riskyTrendStatus) {
        this.riskyTrendStatus = riskyTrendStatus;
    }

    public OverviewSubscriptionReq withRiskyDistributionStatus(Boolean riskyDistributionStatus) {
        this.riskyDistributionStatus = riskyDistributionStatus;
        return this;
    }

    /**
     * **参数解释**： 风险分布是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return riskyDistributionStatus
     */
    public Boolean getRiskyDistributionStatus() {
        return riskyDistributionStatus;
    }

    public void setRiskyDistributionStatus(Boolean riskyDistributionStatus) {
        this.riskyDistributionStatus = riskyDistributionStatus;
    }

    public OverviewSubscriptionReq withTopRiskyHostStatus(Boolean topRiskyHostStatus) {
        this.topRiskyHostStatus = topRiskyHostStatus;
        return this;
    }

    /**
     * **参数解释**： top5风险主机是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return topRiskyHostStatus
     */
    public Boolean getTopRiskyHostStatus() {
        return topRiskyHostStatus;
    }

    public void setTopRiskyHostStatus(Boolean topRiskyHostStatus) {
        this.topRiskyHostStatus = topRiskyHostStatus;
    }

    public OverviewSubscriptionReq withTopAccountCrackStatus(Boolean topAccountCrackStatus) {
        this.topAccountCrackStatus = topAccountCrackStatus;
        return this;
    }

    /**
     * **参数解释**： top5暴力破解来源是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return topAccountCrackStatus
     */
    public Boolean getTopAccountCrackStatus() {
        return topAccountCrackStatus;
    }

    public void setTopAccountCrackStatus(Boolean topAccountCrackStatus) {
        this.topAccountCrackStatus = topAccountCrackStatus;
    }

    public OverviewSubscriptionReq withHostInfoStatus(Boolean hostInfoStatus) {
        this.hostInfoStatus = hostInfoStatus;
        return this;
    }

    /**
     * **参数解释**： 服务器列表是否订阅 **约束限制**： 不涉及 **取值范围**： - true：是 - false：否  **默认取值**： 不涉及 
     * @return hostInfoStatus
     */
    public Boolean getHostInfoStatus() {
        return hostInfoStatus;
    }

    public void setHostInfoStatus(Boolean hostInfoStatus) {
        this.hostInfoStatus = hostInfoStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OverviewSubscriptionReq that = (OverviewSubscriptionReq) obj;
        return Objects.equals(this.dashboardStatus, that.dashboardStatus)
            && Objects.equals(this.riskyTrendStatus, that.riskyTrendStatus)
            && Objects.equals(this.riskyDistributionStatus, that.riskyDistributionStatus)
            && Objects.equals(this.topRiskyHostStatus, that.topRiskyHostStatus)
            && Objects.equals(this.topAccountCrackStatus, that.topAccountCrackStatus)
            && Objects.equals(this.hostInfoStatus, that.hostInfoStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dashboardStatus,
            riskyTrendStatus,
            riskyDistributionStatus,
            topRiskyHostStatus,
            topAccountCrackStatus,
            hostInfoStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OverviewSubscriptionReq {\n");
        sb.append("    dashboardStatus: ").append(toIndentedString(dashboardStatus)).append("\n");
        sb.append("    riskyTrendStatus: ").append(toIndentedString(riskyTrendStatus)).append("\n");
        sb.append("    riskyDistributionStatus: ").append(toIndentedString(riskyDistributionStatus)).append("\n");
        sb.append("    topRiskyHostStatus: ").append(toIndentedString(topRiskyHostStatus)).append("\n");
        sb.append("    topAccountCrackStatus: ").append(toIndentedString(topAccountCrackStatus)).append("\n");
        sb.append("    hostInfoStatus: ").append(toIndentedString(hostInfoStatus)).append("\n");
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
