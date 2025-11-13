package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSecurityReportHistoryPeriodResponseItems
 */
public class ListSecurityReportHistoryPeriodResponseItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private ListSecurityReportHistoryPeriodResponseStatPeriod statPeriod;

    public ListSecurityReportHistoryPeriodResponseItems withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释：** 报告ID，唯一标识历史统计周期对应的安全报告。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ListSecurityReportHistoryPeriodResponseItems withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释：** 订阅ID，关联历史统计周期所属的安全报告订阅。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ListSecurityReportHistoryPeriodResponseItems withStatPeriod(
        ListSecurityReportHistoryPeriodResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public ListSecurityReportHistoryPeriodResponseItems withStatPeriod(
        Consumer<ListSecurityReportHistoryPeriodResponseStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new ListSecurityReportHistoryPeriodResponseStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public ListSecurityReportHistoryPeriodResponseStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(ListSecurityReportHistoryPeriodResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityReportHistoryPeriodResponseItems that = (ListSecurityReportHistoryPeriodResponseItems) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.statPeriod, that.statPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, subscriptionId, statPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityReportHistoryPeriodResponseItems {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
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
