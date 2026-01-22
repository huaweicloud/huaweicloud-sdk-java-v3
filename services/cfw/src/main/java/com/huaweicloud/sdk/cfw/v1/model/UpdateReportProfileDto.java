package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateReportProfileDto
 */
public class UpdateReportProfileDto {

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

    /**
     * **参数解释**： 启用状态 **约束限制**： 不涉及 **取值范围**： 0 关闭 1 启用 **默认取值**： 不涉及
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    /**
     * **参数解释**： 通知方式 **约束限制**： 不涉及 **取值范围**： 0 SMN通知方式 1 不需要通知 **默认取值**： 不涉及
     */
    public static final class SubscriptionTypeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final SubscriptionTypeEnum NUMBER_0 = new SubscriptionTypeEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final SubscriptionTypeEnum NUMBER_1 = new SubscriptionTypeEnum(1);

        private static final Map<Integer, SubscriptionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, SubscriptionTypeEnum> createStaticFields() {
            Map<Integer, SubscriptionTypeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        SubscriptionTypeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SubscriptionTypeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubscriptionTypeEnum(value));
        }

        public static SubscriptionTypeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubscriptionTypeEnum) {
                return this.value.equals(((SubscriptionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subscription_type")

    private SubscriptionTypeEnum subscriptionType;

    public UpdateReportProfileDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 模板描述 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateReportProfileDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 模板名称 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateReportProfileDto withSendPeriod(Integer sendPeriod) {
        this.sendPeriod = sendPeriod;
        return this;
    }

    /**
     * **参数解释**： 发送时间，日报和周报需要设置 **约束限制**： 不涉及 **取值范围**： 0-23 **默认取值**： 不涉及
     * minimum: 0
     * maximum: 23
     * @return sendPeriod
     */
    public Integer getSendPeriod() {
        return sendPeriod;
    }

    public void setSendPeriod(Integer sendPeriod) {
        this.sendPeriod = sendPeriod;
    }

    public UpdateReportProfileDto withSendWeekDay(Integer sendWeekDay) {
        this.sendWeekDay = sendWeekDay;
        return this;
    }

    /**
     * **参数解释**： 发送星期，周报需要设置 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * minimum: 1
     * maximum: 7
     * @return sendWeekDay
     */
    public Integer getSendWeekDay() {
        return sendWeekDay;
    }

    public void setSendWeekDay(Integer sendWeekDay) {
        this.sendWeekDay = sendWeekDay;
    }

    public UpdateReportProfileDto withStatisticPeriod(StatisticPeriod statisticPeriod) {
        this.statisticPeriod = statisticPeriod;
        return this;
    }

    public UpdateReportProfileDto withStatisticPeriod(Consumer<StatisticPeriod> statisticPeriodSetter) {
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

    public UpdateReportProfileDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 启用状态 **约束限制**： 不涉及 **取值范围**： 0 关闭 1 启用 **默认取值**： 不涉及
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public UpdateReportProfileDto withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * **参数解释**： 通知群组 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public UpdateReportProfileDto withSubscriptionType(SubscriptionTypeEnum subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    /**
     * **参数解释**： 通知方式 **约束限制**： 不涉及 **取值范围**： 0 SMN通知方式 1 不需要通知 **默认取值**： 不涉及
     * @return subscriptionType
     */
    public SubscriptionTypeEnum getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(SubscriptionTypeEnum subscriptionType) {
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
        UpdateReportProfileDto that = (UpdateReportProfileDto) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sendPeriod, that.sendPeriod) && Objects.equals(this.sendWeekDay, that.sendWeekDay)
            && Objects.equals(this.statisticPeriod, that.statisticPeriod) && Objects.equals(this.status, that.status)
            && Objects.equals(this.topicUrn, that.topicUrn)
            && Objects.equals(this.subscriptionType, that.subscriptionType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(description, name, sendPeriod, sendWeekDay, statisticPeriod, status, topicUrn, subscriptionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateReportProfileDto {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sendPeriod: ").append(toIndentedString(sendPeriod)).append("\n");
        sb.append("    sendWeekDay: ").append(toIndentedString(sendWeekDay)).append("\n");
        sb.append("    statisticPeriod: ").append(toIndentedString(statisticPeriod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
