package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则条件结构体
 */
public class RuleCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_property_condition")

    private DeviceDataCondition devicePropertyCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "simple_timer_condition")

    private SimpleTimerType simpleTimerCondition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "daily_timer_condition")

    private DailyTimerType dailyTimerCondition;

    public RuleCondition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数说明**：规则条件的类型。 **取值范围**： - DEVICE_DATA：设备数据类型条件。 - SIMPLE_TIMER：简单定时类型条件。 - DAILY_TIMER：每日定时类型条件。 - DEVICE_STATUS：设备状态类型条件。 - DEVICE_LIFE_CYCLE：设备生命周期类型条件。 - DEVICE_MESSAGE：设备消息条件。 - MESSAGE_RESULTS：下行消息结果条件。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RuleCondition withDevicePropertyCondition(DeviceDataCondition devicePropertyCondition) {
        this.devicePropertyCondition = devicePropertyCondition;
        return this;
    }

    public RuleCondition withDevicePropertyCondition(Consumer<DeviceDataCondition> devicePropertyConditionSetter) {
        if (this.devicePropertyCondition == null) {
            this.devicePropertyCondition = new DeviceDataCondition();
            devicePropertyConditionSetter.accept(this.devicePropertyCondition);
        }

        return this;
    }

    /**
     * Get devicePropertyCondition
     * @return devicePropertyCondition
     */
    public DeviceDataCondition getDevicePropertyCondition() {
        return devicePropertyCondition;
    }

    public void setDevicePropertyCondition(DeviceDataCondition devicePropertyCondition) {
        this.devicePropertyCondition = devicePropertyCondition;
    }

    public RuleCondition withSimpleTimerCondition(SimpleTimerType simpleTimerCondition) {
        this.simpleTimerCondition = simpleTimerCondition;
        return this;
    }

    public RuleCondition withSimpleTimerCondition(Consumer<SimpleTimerType> simpleTimerConditionSetter) {
        if (this.simpleTimerCondition == null) {
            this.simpleTimerCondition = new SimpleTimerType();
            simpleTimerConditionSetter.accept(this.simpleTimerCondition);
        }

        return this;
    }

    /**
     * Get simpleTimerCondition
     * @return simpleTimerCondition
     */
    public SimpleTimerType getSimpleTimerCondition() {
        return simpleTimerCondition;
    }

    public void setSimpleTimerCondition(SimpleTimerType simpleTimerCondition) {
        this.simpleTimerCondition = simpleTimerCondition;
    }

    public RuleCondition withDailyTimerCondition(DailyTimerType dailyTimerCondition) {
        this.dailyTimerCondition = dailyTimerCondition;
        return this;
    }

    public RuleCondition withDailyTimerCondition(Consumer<DailyTimerType> dailyTimerConditionSetter) {
        if (this.dailyTimerCondition == null) {
            this.dailyTimerCondition = new DailyTimerType();
            dailyTimerConditionSetter.accept(this.dailyTimerCondition);
        }

        return this;
    }

    /**
     * Get dailyTimerCondition
     * @return dailyTimerCondition
     */
    public DailyTimerType getDailyTimerCondition() {
        return dailyTimerCondition;
    }

    public void setDailyTimerCondition(DailyTimerType dailyTimerCondition) {
        this.dailyTimerCondition = dailyTimerCondition;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleCondition ruleCondition = (RuleCondition) o;
        return Objects.equals(this.type, ruleCondition.type)
            && Objects.equals(this.devicePropertyCondition, ruleCondition.devicePropertyCondition)
            && Objects.equals(this.simpleTimerCondition, ruleCondition.simpleTimerCondition)
            && Objects.equals(this.dailyTimerCondition, ruleCondition.dailyTimerCondition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, devicePropertyCondition, simpleTimerCondition, dailyTimerCondition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleCondition {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    devicePropertyCondition: ").append(toIndentedString(devicePropertyCondition)).append("\n");
        sb.append("    simpleTimerCondition: ").append(toIndentedString(simpleTimerCondition)).append("\n");
        sb.append("    dailyTimerCondition: ").append(toIndentedString(dailyTimerCondition)).append("\n");
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
