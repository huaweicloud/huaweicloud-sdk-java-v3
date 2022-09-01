package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 所有输入流。
 */
public class ShowJobMonitorInfoRespPayloadJobsMetricsSources {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "records")

    @JacksonXmlProperty(localName = "records")

    private Long records;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corrupted_records")

    @JacksonXmlProperty(localName = "corrupted_records")

    private Long corruptedRecords;

    public ShowJobMonitorInfoRespPayloadJobsMetricsSources withName(String name) {
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

    public ShowJobMonitorInfoRespPayloadJobsMetricsSources withRecords(Long records) {
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

    public ShowJobMonitorInfoRespPayloadJobsMetricsSources withCorruptedRecords(Long corruptedRecords) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowJobMonitorInfoRespPayloadJobsMetricsSources showJobMonitorInfoRespPayloadJobsMetricsSources =
            (ShowJobMonitorInfoRespPayloadJobsMetricsSources) o;
        return Objects.equals(this.name, showJobMonitorInfoRespPayloadJobsMetricsSources.name)
            && Objects.equals(this.records, showJobMonitorInfoRespPayloadJobsMetricsSources.records)
            && Objects.equals(this.corruptedRecords, showJobMonitorInfoRespPayloadJobsMetricsSources.corruptedRecords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, records, corruptedRecords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobMonitorInfoRespPayloadJobsMetricsSources {\n");
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
