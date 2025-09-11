package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AlarmLevelStatisticsResult
 */
public class AlarmLevelStatisticsResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level_name")

    private String levelName;

    public AlarmLevelStatisticsResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**: 告警数量。 **取值范围**: 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public AlarmLevelStatisticsResult withLevelName(String levelName) {
        this.levelName = levelName;
        return this;
    }

    /**
     * **参数解释**: 告警级别名称。 **取值范围**: - critical - major - minor - notice
     * @return levelName
     */
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AlarmLevelStatisticsResult that = (AlarmLevelStatisticsResult) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.levelName, that.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, levelName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AlarmLevelStatisticsResult {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    levelName: ").append(toIndentedString(levelName)).append("\n");
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
