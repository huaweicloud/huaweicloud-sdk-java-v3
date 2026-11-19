package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AddSecurityReportRequestInfo
 */
public class AddSecurityReportRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sending_period")

    private String sendingPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_name")

    private String reportName;

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
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overview_subscriptions")

    private OverviewSubscriptionReq overviewSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scans_subscriptions")

    private ScansSubscriptionReq scansSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intrusion_subscriptions")

    private IntrusionSubscriptionReq intrusionSubscriptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private StatPeriodReq statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_type")

    private String logoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logo_id")

    private String logoId;

    public AddSecurityReportRequestInfo withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释**： 报告发送的时间段 **约束限制**： 不涉及 **取值范围**： 字符长度0-64位 **默认取值**： 不涉及 
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public AddSecurityReportRequestInfo withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释**： 报告名称 **约束限制**： 必填 **取值范围**： 字符长度1-32位 **默认取值**： 不涉及 
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public AddSecurityReportRequestInfo withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释**： 报告类别 **约束限制**： 不涉及 **取值范围**： 字符长度0-64位 **默认取值**： 不涉及 
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public AddSecurityReportRequestInfo withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**： 主题URN **约束限制**： 不涉及 **取值范围**： 字符长度0-256位 **默认取值**： 不涉及 
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public AddSecurityReportRequestInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 主题的显示名 **约束限制**： 不涉及 **取值范围**： 字符长度0-256位 **默认取值**： 不涉及 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public AddSecurityReportRequestInfo withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释**： 订阅的方式 **约束限制**： 不涉及 **取值范围**： 字符长度0-64位 **默认取值**： 不涉及 
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public AddSecurityReportRequestInfo withOverviewSubscriptions(OverviewSubscriptionReq overviewSubscriptions) {
        this.overviewSubscriptions = overviewSubscriptions;
        return this;
    }

    public AddSecurityReportRequestInfo withOverviewSubscriptions(
        Consumer<OverviewSubscriptionReq> overviewSubscriptionsSetter) {
        if (this.overviewSubscriptions == null) {
            this.overviewSubscriptions = new OverviewSubscriptionReq();
            overviewSubscriptionsSetter.accept(this.overviewSubscriptions);
        }

        return this;
    }

    /**
     * Get overviewSubscriptions
     * @return overviewSubscriptions
     */
    public OverviewSubscriptionReq getOverviewSubscriptions() {
        return overviewSubscriptions;
    }

    public void setOverviewSubscriptions(OverviewSubscriptionReq overviewSubscriptions) {
        this.overviewSubscriptions = overviewSubscriptions;
    }

    public AddSecurityReportRequestInfo withScansSubscriptions(ScansSubscriptionReq scansSubscriptions) {
        this.scansSubscriptions = scansSubscriptions;
        return this;
    }

    public AddSecurityReportRequestInfo withScansSubscriptions(
        Consumer<ScansSubscriptionReq> scansSubscriptionsSetter) {
        if (this.scansSubscriptions == null) {
            this.scansSubscriptions = new ScansSubscriptionReq();
            scansSubscriptionsSetter.accept(this.scansSubscriptions);
        }

        return this;
    }

    /**
     * Get scansSubscriptions
     * @return scansSubscriptions
     */
    public ScansSubscriptionReq getScansSubscriptions() {
        return scansSubscriptions;
    }

    public void setScansSubscriptions(ScansSubscriptionReq scansSubscriptions) {
        this.scansSubscriptions = scansSubscriptions;
    }

    public AddSecurityReportRequestInfo withIntrusionSubscriptions(IntrusionSubscriptionReq intrusionSubscriptions) {
        this.intrusionSubscriptions = intrusionSubscriptions;
        return this;
    }

    public AddSecurityReportRequestInfo withIntrusionSubscriptions(
        Consumer<IntrusionSubscriptionReq> intrusionSubscriptionsSetter) {
        if (this.intrusionSubscriptions == null) {
            this.intrusionSubscriptions = new IntrusionSubscriptionReq();
            intrusionSubscriptionsSetter.accept(this.intrusionSubscriptions);
        }

        return this;
    }

    /**
     * Get intrusionSubscriptions
     * @return intrusionSubscriptions
     */
    public IntrusionSubscriptionReq getIntrusionSubscriptions() {
        return intrusionSubscriptions;
    }

    public void setIntrusionSubscriptions(IntrusionSubscriptionReq intrusionSubscriptions) {
        this.intrusionSubscriptions = intrusionSubscriptions;
    }

    public AddSecurityReportRequestInfo withStatPeriod(StatPeriodReq statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public AddSecurityReportRequestInfo withStatPeriod(Consumer<StatPeriodReq> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new StatPeriodReq();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public StatPeriodReq getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(StatPeriodReq statPeriod) {
        this.statPeriod = statPeriod;
    }

    public AddSecurityReportRequestInfo withLogoType(String logoType) {
        this.logoType = logoType;
        return this;
    }

    /**
     * **参数解释**： 报告logo类型 **约束限制**： 不涉及 **取值范围**： - default：华为logo - customize：自定义logo  **默认取值**： 不涉及 
     * @return logoType
     */
    public String getLogoType() {
        return logoType;
    }

    public void setLogoType(String logoType) {
        this.logoType = logoType;
    }

    public AddSecurityReportRequestInfo withLogoId(String logoId) {
        this.logoId = logoId;
        return this;
    }

    /**
     * **参数解释**： 自定义logo的文件ID **约束限制**： 不涉及 **取值范围**： 字符长度0-256位 **默认取值**： 不涉及 
     * @return logoId
     */
    public String getLogoId() {
        return logoId;
    }

    public void setLogoId(String logoId) {
        this.logoId = logoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddSecurityReportRequestInfo that = (AddSecurityReportRequestInfo) obj;
        return Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.overviewSubscriptions, that.overviewSubscriptions)
            && Objects.equals(this.scansSubscriptions, that.scansSubscriptions)
            && Objects.equals(this.intrusionSubscriptions, that.intrusionSubscriptions)
            && Objects.equals(this.statPeriod, that.statPeriod) && Objects.equals(this.logoType, that.logoType)
            && Objects.equals(this.logoId, that.logoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendingPeriod,
            reportName,
            reportCategory,
            topicUrn,
            displayName,
            subscriptionType,
            overviewSubscriptions,
            scansSubscriptions,
            intrusionSubscriptions,
            statPeriod,
            logoType,
            logoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddSecurityReportRequestInfo {\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    overviewSubscriptions: ").append(toIndentedString(overviewSubscriptions)).append("\n");
        sb.append("    scansSubscriptions: ").append(toIndentedString(scansSubscriptions)).append("\n");
        sb.append("    intrusionSubscriptions: ").append(toIndentedString(intrusionSubscriptions)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
        sb.append("    logoType: ").append(toIndentedString(logoType)).append("\n");
        sb.append("    logoId: ").append(toIndentedString(logoId)).append("\n");
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
