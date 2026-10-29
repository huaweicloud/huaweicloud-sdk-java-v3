package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * KeywordsAlarmConditions
 */
public class KeywordsAlarmConditions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private String condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_level")

    private String alarmLevel;

    public KeywordsAlarmConditions withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    /**
     * **参数解释：** 触发条件，即满足该条件时，会触发告警。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return condition
     */
    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public KeywordsAlarmConditions withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * **参数解释：** 匹配条数。当关键词搜索结果的日志条数达到设定的条数时，会触发告警。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public KeywordsAlarmConditions withAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
        return this;
    }

    /**
     * **参数解释：** 告警级别。 **约束限制：** 不涉及。 **取值范围：** -   Info：提示 -   Minor：次要 -   Major：重要 -   Critical：紧急 **默认取值：** 不涉及。
     * @return alarmLevel
     */
    public String getAlarmLevel() {
        return alarmLevel;
    }

    public void setAlarmLevel(String alarmLevel) {
        this.alarmLevel = alarmLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeywordsAlarmConditions that = (KeywordsAlarmConditions) obj;
        return Objects.equals(this.condition, that.condition) && Objects.equals(this.number, that.number)
            && Objects.equals(this.alarmLevel, that.alarmLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition, number, alarmLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsAlarmConditions {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    alarmLevel: ").append(toIndentedString(alarmLevel)).append("\n");
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
