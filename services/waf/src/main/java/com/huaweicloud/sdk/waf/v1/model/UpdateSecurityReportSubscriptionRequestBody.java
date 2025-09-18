package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateSecurityReportSubscriptionRequestBody
 */
public class UpdateSecurityReportSubscriptionRequestBody {

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
    @JsonProperty(value = "report_content_subscription")

    private UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private UpdateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_status")

    private String reportStatus;

    public UpdateSecurityReportSubscriptionRequestBody withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释：** 报告发送的时间段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释：** 报告名称 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释：** 报告类别 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public UpdateSecurityReportSubscriptionRequestBody withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释：** 主题urn **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateSecurityReportSubscriptionRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释：** 主题的显示名 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UpdateSecurityReportSubscriptionRequestBody withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释：** 订阅类型 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportContentSubscription(
        UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
        return this;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportContentSubscription(
        Consumer<UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription> reportContentSubscriptionSetter) {
        if (this.reportContentSubscription == null) {
            this.reportContentSubscription = new UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription();
            reportContentSubscriptionSetter.accept(this.reportContentSubscription);
        }

        return this;
    }

    /**
     * Get reportContentSubscription
     * @return reportContentSubscription
     */
    public UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription getReportContentSubscription() {
        return reportContentSubscription;
    }

    public void setReportContentSubscription(
        UpdateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
    }

    public UpdateSecurityReportSubscriptionRequestBody withStatPeriod(
        UpdateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public UpdateSecurityReportSubscriptionRequestBody withStatPeriod(
        Consumer<UpdateSecurityReportSubscriptionRequestBodyStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new UpdateSecurityReportSubscriptionRequestBodyStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public UpdateSecurityReportSubscriptionRequestBodyStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(UpdateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
        return this;
    }

    /**
     * **参数解释：** 报告开启状态 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportStatus
     */
    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecurityReportSubscriptionRequestBody that = (UpdateSecurityReportSubscriptionRequestBody) obj;
        return Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.reportContentSubscription, that.reportContentSubscription)
            && Objects.equals(this.statPeriod, that.statPeriod) && Objects.equals(this.reportStatus, that.reportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sendingPeriod,
            reportName,
            reportCategory,
            topicUrn,
            displayName,
            subscriptionType,
            reportContentSubscription,
            statPeriod,
            reportStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityReportSubscriptionRequestBody {\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    reportContentSubscription: ").append(toIndentedString(reportContentSubscription)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
        sb.append("    reportStatus: ").append(toIndentedString(reportStatus)).append("\n");
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
