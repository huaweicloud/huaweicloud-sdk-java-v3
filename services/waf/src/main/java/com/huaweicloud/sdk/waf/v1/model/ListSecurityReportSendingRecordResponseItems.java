package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListSecurityReportSendingRecordResponseItems
 */
public class ListSecurityReportSendingRecordResponseItems {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private ListSecurityReportSendingRecordResponseStatPeriod statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_category")

    private String reportCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_time")

    private Long sendingTime;

    public ListSecurityReportSendingRecordResponseItems withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释：** 报告ID，唯一标识该发送记录对应的安全报告。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ListSecurityReportSendingRecordResponseItems withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释：** 订阅ID，关联该发送记录所属的安全报告订阅。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ListSecurityReportSendingRecordResponseItems withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释：** 报告名称，该发送记录对应的安全报告名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ListSecurityReportSendingRecordResponseItems withStatPeriod(
        ListSecurityReportSendingRecordResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public ListSecurityReportSendingRecordResponseItems withStatPeriod(
        Consumer<ListSecurityReportSendingRecordResponseStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new ListSecurityReportSendingRecordResponseStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public ListSecurityReportSendingRecordResponseStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(ListSecurityReportSendingRecordResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
    }

    public ListSecurityReportSendingRecordResponseItems withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释：** 报告类别，设置订阅的报告类型（如daily_report表示安全日报）。 **约束限制：** 不涉及 **取值范围：** - daily_report : 日报 - weekly_report ： 周报 - monthly_report ： 月报 - custom_report ： 自定义  **默认取值：** 不涉及
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public ListSecurityReportSendingRecordResponseItems withSendingTime(Long sendingTime) {
        this.sendingTime = sendingTime;
        return this;
    }

    /**
     * **参数解释：** 发送时间，该报告实际发送的时间戳（毫秒级）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sendingTime
     */
    public Long getSendingTime() {
        return sendingTime;
    }

    public void setSendingTime(Long sendingTime) {
        this.sendingTime = sendingTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityReportSendingRecordResponseItems that = (ListSecurityReportSendingRecordResponseItems) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.reportName, that.reportName) && Objects.equals(this.statPeriod, that.statPeriod)
            && Objects.equals(this.reportCategory, that.reportCategory)
            && Objects.equals(this.sendingTime, that.sendingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId, subscriptionId, reportName, statPeriod, reportCategory, sendingTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityReportSendingRecordResponseItems {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    sendingTime: ").append(toIndentedString(sendingTime)).append("\n");
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
