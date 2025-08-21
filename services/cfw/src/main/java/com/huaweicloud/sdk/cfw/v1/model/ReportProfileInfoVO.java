package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReportProfileInfoVO
 */
public class ReportProfileInfoVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_period")

    private Integer sendPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_week_day")

    private Integer sendWeekDay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic_period")

    private StatisticPeriod statisticPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_name")

    private String topicName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private Integer subscriptionType;

    public ReportProfileInfoVO withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**： 报告类型 **取值范围**： daily 日报 weekly 周报 custom 自定义报告
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ReportProfileInfoVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 描述信息 **取值范围**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ReportProfileInfoVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模板名称 **取值范围**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReportProfileInfoVO withSendPeriod(Integer sendPeriod) {
        this.sendPeriod = sendPeriod;
        return this;
    }

    /**
     * **参数解释**： 发送时间 **取值范围**： 不涉及
     * @return sendPeriod
     */
    public Integer getSendPeriod() {
        return sendPeriod;
    }

    public void setSendPeriod(Integer sendPeriod) {
        this.sendPeriod = sendPeriod;
    }

    public ReportProfileInfoVO withSendWeekDay(Integer sendWeekDay) {
        this.sendWeekDay = sendWeekDay;
        return this;
    }

    /**
     * **参数解释**： 发送星期 **取值范围**： 不涉及
     * @return sendWeekDay
     */
    public Integer getSendWeekDay() {
        return sendWeekDay;
    }

    public void setSendWeekDay(Integer sendWeekDay) {
        this.sendWeekDay = sendWeekDay;
    }

    public ReportProfileInfoVO withStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
        return this;
    }

    public ReportProfileInfoVO withStatisticPeriod(Consumer<StatisticPeriod> statisticPeriodSetter) {
        if (this.statisticPeriod == null) {
            this.statisticPeriod = new StatisticPeriod();
            statisticPeriodSetter.accept(this.statisticPeriod);
        }

        return this;
    }

    /**
     * Get statisticPeriod
     * @return statisticPeriod
     */
    public StatisticPeriod getStatisticPeriod() {
        return statisticPeriod;
    }

    public void setStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
    }

    public ReportProfileInfoVO withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 启用状态 **取值范围**：  0 关闭 1 启用
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ReportProfileInfoVO withTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }

    /**
     * **参数解释**： 通知主题名称 **取值范围**：  不涉及
     * @return topicName
     */
    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public ReportProfileInfoVO withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**： 通知主题urn **取值范围**：  不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ReportProfileInfoVO withSubscriptionType(Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释**： 通知方式 **取值范围**： 0 SMN通知方式 1 不需要通知
     * @return subscriptionType
     */
    public Integer getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(Integer subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReportProfileInfoVO that = (ReportProfileInfoVO) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.description, that.description)
            && Objects.equals(this.name, that.name) && Objects.equals(this.sendPeriod, that.sendPeriod)
            && Objects.equals(this.sendWeekDay, that.sendWeekDay)
            && Objects.equals(this.statisticPeriod, that.statisticPeriod) && Objects.equals(this.status, that.status)
            && Objects.equals(this.topicName, that.topicName) && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.subscriptionType, that.subscriptionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category,
            description,
            name,
            sendPeriod,
            sendWeekDay,
            statisticPeriod,
            status,
            topicName,
            topicUrn,
            subscriptionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportProfileInfoVO {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sendPeriod: ").append(toIndentedString(sendPeriod)).append("\n");
        sb.append("    sendWeekDay: ").append(toIndentedString(sendWeekDay)).append("\n");
        sb.append("    statisticPeriod: ").append(toIndentedString(statisticPeriod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    subscriptionType: ").append(toIndentedString(subscriptionType)).append("\n");
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
