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
    @JsonProperty(value = "console_url_prefix")

    private String consoleUrlPrefix;

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

    private CreateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private CreateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_status")

    private String reportStatus;

    public UpdateSecurityReportSubscriptionRequestBody withConsoleUrlPrefix(String consoleUrlPrefix) {
        this.consoleUrlPrefix = consoleUrlPrefix;
        return this;
    }

    /**
     * **参数解释：** 控制台URL前缀，用于拼接生成报告中相关资源的控制台访问链接 **格式要求：** 必须以http://或https://开头的有效URL格式 **约束限制：** 仅支持华为云控制台域名及路径 **默认取值：** https://console.huaweicloud.com/console/
     * @return consoleUrlPrefix
     */
    public String getConsoleUrlPrefix() {
        return consoleUrlPrefix;
    }

    public void setConsoleUrlPrefix(String consoleUrlPrefix) {
        this.consoleUrlPrefix = consoleUrlPrefix;
    }

    public UpdateSecurityReportSubscriptionRequestBody withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释：** 发送时间段，设置报告的预设发送时间（如morning表示早晨时段）。 **约束限制：** 不涉及 **取值范围：** - morning : 00:00~06:00 - noon : 06:00~12:00 - afternoon : 12:00~18:00 - evening : 12:00~18:00  **默认取值：** 不涉及
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
     * **参数解释：** 报告名称，设置订阅报告的名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
     * **参数解释：** 报告类别，设置订阅的报告类型（如daily_report表示安全日报）。 **约束限制：** 不涉及 **取值范围：** - daily_report : 日报 - weekly_report ： 周报 - monthly_report ： 月报 - custom_report ： 自定义  **默认取值：** 不涉及
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
     * **参数解释：** 主题urn，设置报告发送的SMN主题唯一标识。报告接收方式使用消息主题类型时需要填该参数。 查询可使用的主题，通过 云日志服务的“查询SMN主题”接口，返回体中的\"topic_urn\"字段 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
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
     * **参数解释：** 订阅类型，接收安全报告的订阅方式（如slient表示静默订阅）。 **约束限制：** 不涉及 **取值范围：** - smn_topic : 消息主题 - silent ： 静默 - message_center ： 消息中心  **默认取值：** 不涉及
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportContentSubscription(
        CreateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
        return this;
    }

    public UpdateSecurityReportSubscriptionRequestBody withReportContentSubscription(
        Consumer<CreateSecurityReportSubscriptionRequestBodyReportContentSubscription> reportContentSubscriptionSetter) {
        if (this.reportContentSubscription == null) {
            this.reportContentSubscription = new CreateSecurityReportSubscriptionRequestBodyReportContentSubscription();
            reportContentSubscriptionSetter.accept(this.reportContentSubscription);
        }

        return this;
    }

    /**
     * Get reportContentSubscription
     * @return reportContentSubscription
     */
    public CreateSecurityReportSubscriptionRequestBodyReportContentSubscription getReportContentSubscription() {
        return reportContentSubscription;
    }

    public void setReportContentSubscription(
        CreateSecurityReportSubscriptionRequestBodyReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
    }

    public UpdateSecurityReportSubscriptionRequestBody withStatPeriod(
        CreateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public UpdateSecurityReportSubscriptionRequestBody withStatPeriod(
        Consumer<CreateSecurityReportSubscriptionRequestBodyStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new CreateSecurityReportSubscriptionRequestBodyStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public CreateSecurityReportSubscriptionRequestBodyStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(CreateSecurityReportSubscriptionRequestBodyStatPeriod statPeriod) {
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
        return Objects.equals(this.consoleUrlPrefix, that.consoleUrlPrefix)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.reportContentSubscription, that.reportContentSubscription)
            && Objects.equals(this.statPeriod, that.statPeriod) && Objects.equals(this.reportStatus, that.reportStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(consoleUrlPrefix,
            sendingPeriod,
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
        sb.append("    consoleUrlPrefix: ").append(toIndentedString(consoleUrlPrefix)).append("\n");
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
