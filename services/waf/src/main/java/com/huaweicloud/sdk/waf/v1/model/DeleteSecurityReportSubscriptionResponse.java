package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeleteSecurityReportSubscriptionResponse extends SdkResponse {

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
    @JsonProperty(value = "report_content_subscription")

    private SecurityReportSubscriptionResponseReportContentSubscription reportContentSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_period")

    private SecurityReportSubscriptionResponseStatPeriod statPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_enterprise_project")

    private Boolean isAllEnterpriseProject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public DeleteSecurityReportSubscriptionResponse withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * **参数解释：** 订阅ID，唯一标识当前安全报告订阅。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public DeleteSecurityReportSubscriptionResponse withSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
        return this;
    }

    /**
     * **参数解释：** 发送时间段，标识报告的预设发送时间（如morning表示早晨时段）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return sendingPeriod
     */
    public String getSendingPeriod() {
        return sendingPeriod;
    }

    public void setSendingPeriod(String sendingPeriod) {
        this.sendingPeriod = sendingPeriod;
    }

    public DeleteSecurityReportSubscriptionResponse withReportName(String reportName) {
        this.reportName = reportName;
        return this;
    }

    /**
     * **参数解释：** 报告名称，当前安全报告订阅的报告名称。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportName
     */
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public DeleteSecurityReportSubscriptionResponse withReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
        return this;
    }

    /**
     * **参数解释：** 报告类别，标识订阅的报告类型（如daily_report表示安全日报）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return reportCategory
     */
    public String getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(String reportCategory) {
        this.reportCategory = reportCategory;
    }

    public DeleteSecurityReportSubscriptionResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释：** 主题urn，关联订阅报告发送的SMN主题唯一标识。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public DeleteSecurityReportSubscriptionResponse withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释：** 订阅类型，标识安全报告的订阅方式（如slient表示静默订阅）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subscriptionType
     */
    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public DeleteSecurityReportSubscriptionResponse withReportContentSubscription(
        SecurityReportSubscriptionResponseReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
        return this;
    }

    public DeleteSecurityReportSubscriptionResponse withReportContentSubscription(
        Consumer<SecurityReportSubscriptionResponseReportContentSubscription> reportContentSubscriptionSetter) {
        if (this.reportContentSubscription == null) {
            this.reportContentSubscription = new SecurityReportSubscriptionResponseReportContentSubscription();
            reportContentSubscriptionSetter.accept(this.reportContentSubscription);
        }

        return this;
    }

    /**
     * Get reportContentSubscription
     * @return reportContentSubscription
     */
    public SecurityReportSubscriptionResponseReportContentSubscription getReportContentSubscription() {
        return reportContentSubscription;
    }

    public void setReportContentSubscription(
        SecurityReportSubscriptionResponseReportContentSubscription reportContentSubscription) {
        this.reportContentSubscription = reportContentSubscription;
    }

    public DeleteSecurityReportSubscriptionResponse withStatPeriod(
        SecurityReportSubscriptionResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
        return this;
    }

    public DeleteSecurityReportSubscriptionResponse withStatPeriod(
        Consumer<SecurityReportSubscriptionResponseStatPeriod> statPeriodSetter) {
        if (this.statPeriod == null) {
            this.statPeriod = new SecurityReportSubscriptionResponseStatPeriod();
            statPeriodSetter.accept(this.statPeriod);
        }

        return this;
    }

    /**
     * Get statPeriod
     * @return statPeriod
     */
    public SecurityReportSubscriptionResponseStatPeriod getStatPeriod() {
        return statPeriod;
    }

    public void setStatPeriod(SecurityReportSubscriptionResponseStatPeriod statPeriod) {
        this.statPeriod = statPeriod;
    }

    public DeleteSecurityReportSubscriptionResponse withIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
        return this;
    }

    /**
     * **参数解释：** 是否是所有企业项目，标识订阅是否适用于当前租户的所有企业项目（true表示适用，false表示仅适用指定项目）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** false
     * @return isAllEnterpriseProject
     */
    public Boolean getIsAllEnterpriseProject() {
        return isAllEnterpriseProject;
    }

    public void setIsAllEnterpriseProject(Boolean isAllEnterpriseProject) {
        this.isAllEnterpriseProject = isAllEnterpriseProject;
    }

    public DeleteSecurityReportSubscriptionResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 企业项目ID，订阅关联的企业项目唯一标识（is_all_enterprise_project为false时生效）。 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteSecurityReportSubscriptionResponse that = (DeleteSecurityReportSubscriptionResponse) obj;
        return Objects.equals(this.subscriptionId, that.subscriptionId)
            && Objects.equals(this.sendingPeriod, that.sendingPeriod)
            && Objects.equals(this.reportName, that.reportName)
            && Objects.equals(this.reportCategory, that.reportCategory) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.subscriptionType, that.subscriptionType)
            && Objects.equals(this.reportContentSubscription, that.reportContentSubscription)
            && Objects.equals(this.statPeriod, that.statPeriod)
            && Objects.equals(this.isAllEnterpriseProject, that.isAllEnterpriseProject)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subscriptionId,
            sendingPeriod,
            reportName,
            reportCategory,
            topicUrn,
            subscriptionType,
            reportContentSubscription,
            statPeriod,
            isAllEnterpriseProject,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSecurityReportSubscriptionResponse {\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    sendingPeriod: ").append(toIndentedString(sendingPeriod)).append("\n");
        sb.append("    reportName: ").append(toIndentedString(reportName)).append("\n");
        sb.append("    reportCategory: ").append(toIndentedString(reportCategory)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
        sb.append("    reportContentSubscription: ").append(toIndentedString(reportContentSubscription)).append("\n");
        sb.append("    statPeriod: ").append(toIndentedString(statPeriod)).append("\n");
        sb.append("    isAllEnterpriseProject: ").append(toIndentedString(isAllEnterpriseProject)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
