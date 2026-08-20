package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：SparkSql作业的指标统计信息，包含读取数据量、输出数据量、计算资源使用情况等。 
 */
public class SparkSqlMetricStatisticsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bad_records")

    private Long badRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_bytes")

    private Long inputBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_records")

    private Long inputRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_bytes")

    private Long outputBytes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_records")

    private Long outputRecords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_time")

    private Long cpuTime;

    public SparkSqlMetricStatisticsResponse withBadRecords(Long badRecords) {
        this.badRecords = badRecords;
        return this;
    }

    /**
     * **参数解释**：脏数据行数，用于标识处理过程中发现的错误数据行数。 **取值范围**：大于等于0的整数。 
     * @return badRecords
     */
    public Long getBadRecords() {
        return badRecords;
    }

    public void setBadRecords(Long badRecords) {
        this.badRecords = badRecords;
    }

    public SparkSqlMetricStatisticsResponse withInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
        return this;
    }

    /**
     * **参数解释**：读取数据字节数，用于标识作业读取的数据量。 **取值范围**：大于等于0的整数，单位为字节。 
     * @return inputBytes
     */
    public Long getInputBytes() {
        return inputBytes;
    }

    public void setInputBytes(Long inputBytes) {
        this.inputBytes = inputBytes;
    }

    public SparkSqlMetricStatisticsResponse withInputRecords(Long inputRecords) {
        this.inputRecords = inputRecords;
        return this;
    }

    /**
     * **参数解释**：读取数据行数，用于标识作业读取的数据记录数。 **取值范围**：大于等于0的整数。 
     * @return inputRecords
     */
    public Long getInputRecords() {
        return inputRecords;
    }

    public void setInputRecords(Long inputRecords) {
        this.inputRecords = inputRecords;
    }

    public SparkSqlMetricStatisticsResponse withOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
        return this;
    }

    /**
     * **参数解释**：输出数据字节数，用于标识作业输出的数据量。 **取值范围**：大于等于0的整数，单位为字节。 
     * @return outputBytes
     */
    public Long getOutputBytes() {
        return outputBytes;
    }

    public void setOutputBytes(Long outputBytes) {
        this.outputBytes = outputBytes;
    }

    public SparkSqlMetricStatisticsResponse withOutputRecords(Long outputRecords) {
        this.outputRecords = outputRecords;
        return this;
    }

    /**
     * **参数解释**：输出数据行数，用于标识作业输出的数据记录数。 **取值范围**：大于等于0的整数。 
     * @return outputRecords
     */
    public Long getOutputRecords() {
        return outputRecords;
    }

    public void setOutputRecords(Long outputRecords) {
        this.outputRecords = outputRecords;
    }

    public SparkSqlMetricStatisticsResponse withCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
        return this;
    }

    /**
     * **参数解释**：计算使用CPU秒数，用于标识作业消耗的计算资源。 **取值范围**：大于等于0的整数，单位为秒。 
     * @return cpuTime
     */
    public Long getCpuTime() {
        return cpuTime;
    }

    public void setCpuTime(Long cpuTime) {
        this.cpuTime = cpuTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SparkSqlMetricStatisticsResponse that = (SparkSqlMetricStatisticsResponse) obj;
        return Objects.equals(this.badRecords, that.badRecords) && Objects.equals(this.inputBytes, that.inputBytes)
            && Objects.equals(this.inputRecords, that.inputRecords)
            && Objects.equals(this.outputBytes, that.outputBytes)
            && Objects.equals(this.outputRecords, that.outputRecords) && Objects.equals(this.cpuTime, that.cpuTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(badRecords, inputBytes, inputRecords, outputBytes, outputRecords, cpuTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SparkSqlMetricStatisticsResponse {\n");
        sb.append("    badRecords: ").append(toIndentedString(badRecords)).append("\n");
        sb.append("    inputBytes: ").append(toIndentedString(inputBytes)).append("\n");
        sb.append("    inputRecords: ").append(toIndentedString(inputRecords)).append("\n");
        sb.append("    outputBytes: ").append(toIndentedString(outputBytes)).append("\n");
        sb.append("    outputRecords: ").append(toIndentedString(outputRecords)).append("\n");
        sb.append("    cpuTime: ").append(toIndentedString(cpuTime)).append("\n");
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
