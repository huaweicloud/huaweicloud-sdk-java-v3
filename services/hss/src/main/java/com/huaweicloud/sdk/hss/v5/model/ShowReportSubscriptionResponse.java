package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowReportSubscriptionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private Integer reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_period")

    private String sendingPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_category")

    private String reportCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_type")

    private String logoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_id")

    private String logoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_subscriptions")

    private OverviewSubscriptionRes overviewSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scans_subscriptions")

    private ScansSubscriptionRes scansSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion_subscriptions")

    private IntrusionSubscriptionRes intrusionSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private StatPeriodRes statPeriod;

    public ShowReportSubscriptionResponse withReportId(Integer reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释**: 报告ID **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return reportId
     */
    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public ShowReportSubscriptionResponse withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释**: 报告名称 **取值范围**: 字符长度1-32位 
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ShowReportSubscriptionResponse withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释**: 报告发送的时间段 **取值范围**: - morning：0点到6点 - noon：6点到12点 - afternoon：12点到18点 - evening：18点到24点 
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public ShowReportSubscriptionResponse withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释**: 报告类别 **取值范围**: - daily_report：安全日报 - weekly_report：安全周报 - monthly_report：安全月报 - custom_report：自定义报告 
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public ShowReportSubscriptionResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**: 主题urn **取值范围**: 字符长度0-256位 
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ShowReportSubscriptionResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**: 主题的显示名 **取值范围**: 字符长度0-256位 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowReportSubscriptionResponse withLogoType(String logoType) {
        this.logoType = logoType;
        return this;
    }

    /**
     * **参数解释**: 报告logo类型 **取值范围**: - default：华为logo - customize：自定义logo 
     * @return logoType
     */
    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public ShowReportSubscriptionResponse withLogoId(String logoId) {
        this.logoId = logoId;
        return this;
    }

    /**
     * **参数解释**: 自定义logo的文件id **取值范围**: 字符长度0-256位 
     * @return logoId
     */
    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    public ShowReportSubscriptionResponse withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释**: 订阅的方式 **取值范围**: - smn_topic：SMN主题 - message_center：消息中心 - silent：无需发送到邮箱 
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public ShowReportSubscriptionResponse withOverviewSubscriptions(OverviewSubscriptionRes overviewSubscriptions) {
        this.overviewSubscriptions = overviewSubscriptions;
        return this;
    }

    public ShowReportSubscriptionResponse withOverviewSubscriptions(
        Consumer<OverviewSubscriptionRes> overviewSubscriptionsSetter) {
        if (this.overviewSubscriptions == null) {
            this.overviewSubscriptions = new OverviewSubscriptionRes();
            overviewSubscriptionsSetter.accept(this.overviewSubscriptions);
        }

        return this;
    }

    /**
     * Get overviewSubscriptions
     * @return overviewSubscriptions
     */
    public OverviewSubscriptionRes getOverviewSubscriptions() {
        return overviewSubscriptions;
    }

    public void setOverviewSubscriptions(OverviewSubscriptionRes overviewSubscriptions) {
        this.overviewSubscriptions = overviewSubscriptions;
    }

    public ShowReportSubscriptionResponse withScansSubscriptions(ScansSubscriptionRes scansSubscriptions) {
        this.scansSubscriptions = scansSubscriptions;
        return this;
    }

    public ShowReportSubscriptionResponse withScansSubscriptions(
        Consumer<ScansSubscriptionRes> scansSubscriptionsSetter) {
        if (this.scansSubscriptions == null) {
            this.scansSubscriptions = new ScansSubscriptionRes();
            scansSubscriptionsSetter.accept(this.scansSubscriptions);
        }

        return this;
    }

    /**
     * Get scansSubscriptions
     * @return scansSubscriptions
     */
    public ScansSubscriptionRes getScansSubscriptions() {
        return scansSubscriptions;
    }

    public void setScansSubscriptions(ScansSubscriptionRes scansSubscriptions) {
        this.scansSubscriptions = scansSubscriptions;
    }

    public ShowReportSubscriptionResponse withIntrusionSubscriptions(IntrusionSubscriptionRes intrusionSubscriptions) {
        this.intrusionSubscriptions = intrusionSubscriptions;
        return this;
    }

    public ShowReportSubscriptionResponse withIntrusionSubscriptions(
        Consumer<IntrusionSubscriptionRes> intrusionSubscriptionsSetter) {
        if (this.intrusionSubscriptions == null) {
            this.intrusionSubscriptions = new IntrusionSubscriptionRes();
            intrusionSubscriptionsSetter.accept(this.intrusionSubscriptions);
        }

        return this;
    }

    /**
     * Get intrusionSubscriptions
     * @return intrusionSubscriptions
     */
    public IntrusionSubscriptionRes getIntrusionSubscriptions() {
        return intrusionSubscriptions;
    }

    public void setIntrusionSubscriptions(IntrusionSubscriptionRes intrusionSubscriptions) {
        this.intrusionSubscriptions = intrusionSubscriptions;
    }

    public ShowReportSubscriptionResponse withStatPeriod(StatPeriodRes statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public ShowReportSubscriptionResponse withStatPeriod(Consumer<StatPeriodRes> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new StatPeriodRes();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public StatPeriodRes getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(StatPeriodRes statPeriod) {
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
        ShowReportSubscriptionResponse that = (ShowReportSubscriptionResponse) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.logoType, that.logoType)
            && Objects.equals(this.logoId, that.logoId) && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.overviewSubscriptions, that.overviewSubscriptions)
            && Objects.equals(this.scansSubscriptions, that.scansSubscriptions)
            && Objects.equals(this.intrusionSubscriptions, that.intrusionSubscriptions)
            && Objects.equals(this.statPeriod, that.statPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            reportName,
            sendingPeriod,
            reportCategory,
            topicUrn,
            displayName,
            logoType,
            logoId,
            subscriptionType,
            overviewSubscriptions,
            scansSubscriptions,
            intrusionSubscriptions,
            statPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowReportSubscriptionResponse {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    logoType: ").append(toIndentedString(logoType)).append("\n");
        sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    overviewSubscriptions: ").append(toIndentedString(overviewSubscriptions)).append("\n");
        sb.append("    scansSubscriptions: ").append(toIndentedString(scansSubscriptions)).append("\n");
        sb.append("    intrusionSubscriptions: ").append(toIndentedString(intrusionSubscriptions)).append("\n");
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
