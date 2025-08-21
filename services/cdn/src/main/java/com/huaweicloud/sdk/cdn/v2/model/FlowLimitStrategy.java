package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 用量封顶配置 **约束限制：** 不涉及
 */
public class FlowLimitStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "strategy_type")

    private String strategyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private String itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_value")

    private String limitValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_percent_threshold")

    private String alarmPercentThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ban_time")

    private String banTime;

    public FlowLimitStrategy withStrategyType(String strategyType) {
        this.strategyType = strategyType;
        return this;
    }

    /**
     * **参数解释：**  用量统计类型 **约束限制：** 不涉及 **取值范围：** - instant: 瞬时用量 - hour: 累计用量（小时） - day: 累计用量（天） **默认取值：** 不涉及
     * @return strategyType
     */
    public String getStrategyType() {
        return strategyType;
    }

    public void setStrategyType(String strategyType) {
        this.strategyType = strategyType;
    }

    public FlowLimitStrategy withItemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * **参数解释：**  用量封顶类型 **约束限制：** 不涉及 **取值范围：** - bandwidth: 带宽封顶，单位: bit/s - traffic: 流量封顶，单位: bit **默认取值：** 不涉及
     * @return itemType
     */
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public FlowLimitStrategy withLimitValue(String limitValue) {
        this.limitValue = limitValue;
        return this;
    }

    /**
     * **参数解释：** 用量封顶阈值，域名用量达到该阈值后，将会停用域名 **约束限制：** 不涉及 **取值范围：** 必须为正整数 **默认取值：** 不涉及
     * @return limitValue
     */
    public String getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(String limitValue) {
        this.limitValue = limitValue;
    }

    public FlowLimitStrategy withAlarmPercentThreshold(String alarmPercentThreshold) {
        this.alarmPercentThreshold = alarmPercentThreshold;
        return this;
    }

    /**
     * **参数解释：** 用量告警阈值，域名用量达到该阈值后，将会发送告警 **约束限制：** 不涉及 **取值范围：** 1-90 **默认取值：** 不涉及
     * @return alarmPercentThreshold
     */
    public String getAlarmPercentThreshold() {
        return alarmPercentThreshold;
    }

    public void setAlarmPercentThreshold(String alarmPercentThreshold) {
        this.alarmPercentThreshold = alarmPercentThreshold;
    }

    public FlowLimitStrategy withBanTime(String banTime) {
        this.banTime = banTime;
        return this;
    }

    /**
     * **参数解释：** 域名封禁周期 **约束限制：** ban_time设置为0时，表示不自动解封，需要客户手动解封域名 **取值范围：** - 0: 不自动解封 - 60: 60分钟，即1个小时 - 720: 720分钟，即12个小时 - 1440: 1440分钟，即24个小时 - 4320: 4320分钟，即3天 **默认取值：** 不涉及
     * @return banTime
     */
    public String getBanTime() {
        return banTime;
    }

    public void setBanTime(String banTime) {
        this.banTime = banTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowLimitStrategy that = (FlowLimitStrategy) obj;
        return Objects.equals(this.strategyType, that.strategyType) && Objects.equals(this.itemType, that.itemType)
            && Objects.equals(this.limitValue, that.limitValue)
            && Objects.equals(this.alarmPercentThreshold, that.alarmPercentThreshold)
            && Objects.equals(this.banTime, that.banTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(strategyType, itemType, limitValue, alarmPercentThreshold, banTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowLimitStrategy {\n");
        sb.append("    strategyType: ").append(toIndentedString(strategyType)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    limitValue: ").append(toIndentedString(limitValue)).append("\n");
        sb.append("    alarmPercentThreshold: ").append(toIndentedString(alarmPercentThreshold)).append("\n");
        sb.append("    banTime: ").append(toIndentedString(banTime)).append("\n");
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
