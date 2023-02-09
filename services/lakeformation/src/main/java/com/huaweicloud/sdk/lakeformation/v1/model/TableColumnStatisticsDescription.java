package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 表列统计信息的描述信息
 */
public class TableColumnStatisticsDescription {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_analyzed_time")

    private OffsetDateTime lastAnalyzedTime;

    public TableColumnStatisticsDescription withLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
        return this;
    }

    /**
     * 最后统计时间
     * @return lastAnalyzedTime
     */
    public OffsetDateTime getLastAnalyzedTime() {
        return lastAnalyzedTime;
    }

    public void setLastAnalyzedTime(OffsetDateTime lastAnalyzedTime) {
        this.lastAnalyzedTime = lastAnalyzedTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TableColumnStatisticsDescription tableColumnStatisticsDescription = (TableColumnStatisticsDescription) o;
        return Objects.equals(this.lastAnalyzedTime, tableColumnStatisticsDescription.lastAnalyzedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastAnalyzedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TableColumnStatisticsDescription {\n");
        sb.append("    lastAnalyzedTime: ").append(toIndentedString(lastAnalyzedTime)).append("\n");
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
