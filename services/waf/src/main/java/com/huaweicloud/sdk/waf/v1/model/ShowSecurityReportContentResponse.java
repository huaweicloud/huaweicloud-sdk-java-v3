package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityReportContentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_id")

    private String reportId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_id")

    private String subscriptionId;

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
    @JsonProperty(value = "subscription_type")

    private String subscriptionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "report_content_info")

    private SecurityReportContentResponseReportContentInfo reportContentInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private SecurityReportContentResponseStatPeriod statPeriod;

    public ShowSecurityReportContentResponse withReportId(String reportId) {
        this.reportId = reportId;
        return this;
    }

    /**
     * **参数解释：** 报告ID，唯一标识当前查询的安全报告。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportId
     */
    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public ShowSecurityReportContentResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释：** 订阅ID，关联当前报告所属的安全报告订阅记录。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public ShowSecurityReportContentResponse withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释：** 发送时间段，标识报告的预设发送时间（如morning表示早晨时段）。 **约束限制：** 不涉及 **取值范围：** - morning : 00:00~06:00 - noon : 06:00~12:00 - afternoon : 12:00~18:00 - evening : 12:00~18:00  **默认取值：** 不涉及
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public ShowSecurityReportContentResponse withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释：** 报告名称，用于标识当前安全报告的名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public ShowSecurityReportContentResponse withReportCategory(String reportCategory) {
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

    public ShowSecurityReportContentResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释：** 主题urn，关联报告发送的SMN主题唯一标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ShowSecurityReportContentResponse withSubscriptionType(String subscriptionType) {
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

    public ShowSecurityReportContentResponse withReportContentInfo(
        SecurityReportContentResponseReportContentInfo reportContentInfo) {
        this.reportContentInfo = reportContentInfo;
        return this;
    }

    public ShowSecurityReportContentResponse withReportContentInfo(
        Consumer<SecurityReportContentResponseReportContentInfo> reportContentInfoSetter) {
        if (this.reportContentInfo == null) {
            this.reportContentInfo = new SecurityReportContentResponseReportContentInfo();
            reportContentInfoSetter.accept(this.reportContentInfo);
        }

        return this;
    }

    /**
     * Get reportContentInfo
     * @return reportContentInfo
     */
    public SecurityReportContentResponseReportContentInfo getReportContentInfo() {
        return reportContentInfo;
    }

    public void setReportContentInfo(SecurityReportContentResponseReportContentInfo reportContentInfo) {
        this.reportContentInfo = reportContentInfo;
    }

    public ShowSecurityReportContentResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 创建时间，报告的创建时间。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSecurityReportContentResponse withStatPeriod(SecurityReportContentResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public ShowSecurityReportContentResponse withStatPeriod(
        Consumer<SecurityReportContentResponseStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new SecurityReportContentResponseStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public SecurityReportContentResponseStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(SecurityReportContentResponseStatPeriod statPeriod) {
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
        ShowSecurityReportContentResponse that = (ShowSecurityReportContentResponse) obj;
        return Objects.equals(this.reportId, that.reportId) && Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.reportContentInfo, that.reportContentInfo)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.statPeriod, that.statPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reportId,
            subscriptionId,
            sendingPeriod,
            reportName,
            reportCategory,
            topicUrn,
            subscriptionType,
            reportContentInfo,
            createTime,
            statPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityReportContentResponse {\n");
        sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    reportContentInfo: ").append(toIndentedString(reportContentInfo)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
