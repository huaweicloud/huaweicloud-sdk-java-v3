package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：巡检压测用例信息。 **约束限制**：不涉及。
 */
public class ReqInspectionItemConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval_time")

    private Long intervalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_type")

    private ReqInspectionItemType itemType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "times")

    private Integer times;

    public ReqInspectionItemConfig withIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
        return this;
    }

    /**
     * **参数解释**：执行轮次时间间隔。 **约束限制**：不涉及。 **取值范围**：[0,100000]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 100000
     * @return intervalTime
     */
    public Long getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Long intervalTime) {
        this.intervalTime = intervalTime;
    }

    public ReqInspectionItemConfig withItemType(ReqInspectionItemType itemType) {
        this.itemType = itemType;
        return this;
    }

    /**
     * Get itemType
     * @return itemType
     */
    public ReqInspectionItemType getItemType() {
        return itemType;
    }

    public void setItemType(ReqInspectionItemType itemType) {
        this.itemType = itemType;
    }

    public ReqInspectionItemConfig withTimes(Integer times) {
        this.times = times;
        return this;
    }

    /**
     * **参数解释**：执行轮次。 **约束限制**：不涉及。 **取值范围**：[0,100]。 **默认取值**：不涉及。
     * minimum: 0
     * maximum: 100
     * @return times
     */
    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqInspectionItemConfig that = (ReqInspectionItemConfig) obj;
        return Objects.equals(this.intervalTime, that.intervalTime) && Objects.equals(this.itemType, that.itemType)
            && Objects.equals(this.times, that.times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intervalTime, itemType, times);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqInspectionItemConfig {\n");
        sb.append("    intervalTime: ").append(toIndentedString(intervalTime)).append("\n");
        sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
        sb.append("    times: ").append(toIndentedString(times)).append("\n");
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
