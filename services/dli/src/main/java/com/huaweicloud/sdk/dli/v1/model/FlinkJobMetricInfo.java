package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 所有输入流。
 */
public class FlinkJobMetricInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    private Long records;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corrupted_records")

    private Long corruptedRecords;

    public FlinkJobMetricInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 输入流或输出流名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlinkJobMetricInfo withRecords(Long records) {
        this.records = records;
        return this;
    }

    /**
     * 总记录数。
     * @return records
     */
    public Long getRecords() {
        return records;
    }

    public void setRecords(Long records) {
        this.records = records;
    }

    public FlinkJobMetricInfo withCorruptedRecords(Long corruptedRecords) {
        this.corruptedRecords = corruptedRecords;
        return this;
    }

    /**
     * 脏数据记录数。
     * @return corruptedRecords
     */
    public Long getCorruptedRecords() {
        return corruptedRecords;
    }

    public void setCorruptedRecords(Long corruptedRecords) {
        this.corruptedRecords = corruptedRecords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobMetricInfo that = (FlinkJobMetricInfo) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.records, that.records)
            && Objects.equals(this.corruptedRecords, that.corruptedRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, records, corruptedRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobMetricInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    records: ").append(toIndentedString(records)).append("\n");
        sb.append("    corruptedRecords: ").append(toIndentedString(corruptedRecords)).append("\n");
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
