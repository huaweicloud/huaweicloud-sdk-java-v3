package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：算子监控信息。 **取值范围**：不涉及。
 */
public class OperatorMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_id")

    private Long queryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_node_id")

    private Integer planNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_node_name")

    private String planNodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_dop")

    private Integer queryDop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_rows")

    private Long estimatedRows;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuple_processed")

    private Long tupleProcessed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_peak_memory")

    private Integer minPeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_peak_memory")

    private Integer maxPeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_peak_memory")

    private Integer averagePeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_skew_percent")

    private Integer memorySkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_spill_size")

    private Integer minSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_spill_size")

    private Integer maxSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "average_spill_size")

    private Integer averageSpillSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spill_skew_percent")

    private String spillSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loops")

    private Integer loops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private String progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_read_size")

    private Long totalReadSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_write_size")

    private Long totalWriteSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_operator_metrics")

    private List<OperatorMetric> subOperatorMetrics = null;

    public OperatorMetric withQueryId(Long queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * **参数解释**：查询ID。 **取值范围**：1~9223372036854775807。
     * @return queryId
     */
    public Long getQueryId() {
        return queryId;
    }

    public void setQueryId(Long queryId) {
        this.queryId = queryId;
    }

    public OperatorMetric withPlanNodeId(Integer planNodeId) {
        this.planNodeId = planNodeId;
        return this;
    }

    /**
     * **参数解释**：节点ID。 **取值范围**：1~2147483647。
     * @return planNodeId
     */
    public Integer getPlanNodeId() {
        return planNodeId;
    }

    public void setPlanNodeId(Integer planNodeId) {
        this.planNodeId = planNodeId;
    }

    public OperatorMetric withPlanNodeName(String planNodeName) {
        this.planNodeName = planNodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称。 **取值范围**：长度为1~64个字符，支持大小写英文字母、数字、连字符。
     * @return planNodeName
     */
    public String getPlanNodeName() {
        return planNodeName;
    }

    public void setPlanNodeName(String planNodeName) {
        this.planNodeName = planNodeName;
    }

    public OperatorMetric withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：开始时间，格式为：YYYY-MM-DD HH:MM:SS。 **取值范围**：时间范围：1000-01-01 00:00:00/9999-12-31 23:59:59。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public OperatorMetric withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：执行时长。 **取值范围**：1~9223372036854775807。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public OperatorMetric withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：算子当前执行状态。 **取值范围**：   - init：初始化。   - waiting：等待中。   - finished：已结束。   - running：运行中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public OperatorMetric withQueryDop(Integer queryDop) {
        this.queryDop = queryDop;
        return this;
    }

    /**
     * **参数解释**：查询的并行度。 **取值范围**：1~2147483647。
     * @return queryDop
     */
    public Integer getQueryDop() {
        return queryDop;
    }

    public void setQueryDop(Integer queryDop) {
        this.queryDop = queryDop;
    }

    public OperatorMetric withEstimatedRows(Long estimatedRows) {
        this.estimatedRows = estimatedRows;
        return this;
    }

    /**
     * **参数解释**：预估的行数。 **取值范围**：1~9223372036854775807。
     * @return estimatedRows
     */
    public Long getEstimatedRows() {
        return estimatedRows;
    }

    public void setEstimatedRows(Long estimatedRows) {
        this.estimatedRows = estimatedRows;
    }

    public OperatorMetric withTupleProcessed(Long tupleProcessed) {
        this.tupleProcessed = tupleProcessed;
        return this;
    }

    /**
     * **参数解释**：当前已经处理完成的行数。 **取值范围**：1~9223372036854775807。
     * @return tupleProcessed
     */
    public Long getTupleProcessed() {
        return tupleProcessed;
    }

    public void setTupleProcessed(Long tupleProcessed) {
        this.tupleProcessed = tupleProcessed;
    }

    public OperatorMetric withMinPeakMemory(Integer minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
        return this;
    }

    /**
     * **参数解释**：内存使用的最小峰值。 **取值范围**：1~2147483647。
     * @return minPeakMemory
     */
    public Integer getMinPeakMemory() {
        return minPeakMemory;
    }

    public void setMinPeakMemory(Integer minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
    }

    public OperatorMetric withMaxPeakMemory(Integer maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
        return this;
    }

    /**
     * **参数解释**：内存使用的最大峰值。 **取值范围**：1~2147483647。
     * @return maxPeakMemory
     */
    public Integer getMaxPeakMemory() {
        return maxPeakMemory;
    }

    public void setMaxPeakMemory(Integer maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
    }

    public OperatorMetric withAveragePeakMemory(Integer averagePeakMemory) {
        this.averagePeakMemory = averagePeakMemory;
        return this;
    }

    /**
     * **参数解释**：内存使用的平均峰值。 **取值范围**：1~2147483647。
     * @return averagePeakMemory
     */
    public Integer getAveragePeakMemory() {
        return averagePeakMemory;
    }

    public void setAveragePeakMemory(Integer averagePeakMemory) {
        this.averagePeakMemory = averagePeakMemory;
    }

    public OperatorMetric withMemorySkewPercent(Integer memorySkewPercent) {
        this.memorySkewPercent = memorySkewPercent;
        return this;
    }

    /**
     * **参数解释**：内存使用倾斜百分比。 **取值范围**：1~2147483647。
     * @return memorySkewPercent
     */
    public Integer getMemorySkewPercent() {
        return memorySkewPercent;
    }

    public void setMemorySkewPercent(Integer memorySkewPercent) {
        this.memorySkewPercent = memorySkewPercent;
    }

    public OperatorMetric withMinSpillSize(Integer minSpillSize) {
        this.minSpillSize = minSpillSize;
        return this;
    }

    /**
     * **参数解释**：下盘的最小数据量。 **取值范围**：1~2147483647。
     * @return minSpillSize
     */
    public Integer getMinSpillSize() {
        return minSpillSize;
    }

    public void setMinSpillSize(Integer minSpillSize) {
        this.minSpillSize = minSpillSize;
    }

    public OperatorMetric withMaxSpillSize(Integer maxSpillSize) {
        this.maxSpillSize = maxSpillSize;
        return this;
    }

    /**
     * **参数解释**：下盘的最大数据量。 **取值范围**：1~2147483647。
     * @return maxSpillSize
     */
    public Integer getMaxSpillSize() {
        return maxSpillSize;
    }

    public void setMaxSpillSize(Integer maxSpillSize) {
        this.maxSpillSize = maxSpillSize;
    }

    public OperatorMetric withAverageSpillSize(Integer averageSpillSize) {
        this.averageSpillSize = averageSpillSize;
        return this;
    }

    /**
     * **参数解释**：下盘的平均数据量。 **取值范围**：1~2147483647。
     * @return averageSpillSize
     */
    public Integer getAverageSpillSize() {
        return averageSpillSize;
    }

    public void setAverageSpillSize(Integer averageSpillSize) {
        this.averageSpillSize = averageSpillSize;
    }

    public OperatorMetric withSpillSkewPercent(String spillSkewPercent) {
        this.spillSkewPercent = spillSkewPercent;
        return this;
    }

    /**
     * **参数解释**：下盘数据的倾斜百分比。 **取值范围**：不涉及。
     * @return spillSkewPercent
     */
    public String getSpillSkewPercent() {
        return spillSkewPercent;
    }

    public void setSpillSkewPercent(String spillSkewPercent) {
        this.spillSkewPercent = spillSkewPercent;
    }

    public OperatorMetric withLoops(Integer loops) {
        this.loops = loops;
        return this;
    }

    /**
     * **参数解释**：算子执行迭代次数。 **取值范围**：1~2147483647。
     * @return loops
     */
    public Integer getLoops() {
        return loops;
    }

    public void setLoops(Integer loops) {
        this.loops = loops;
    }

    public OperatorMetric withProgress(String progress) {
        this.progress = progress;
        return this;
    }

    /**
     * **参数解释**：执行进度百分比。 **取值范围**：不涉及。
     * @return progress
     */
    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public OperatorMetric withTotalReadSize(Long totalReadSize) {
        this.totalReadSize = totalReadSize;
        return this;
    }

    /**
     * **参数解释**：所有节点读取的总数据量。 **取值范围**：1~9223372036854775807。
     * @return totalReadSize
     */
    public Long getTotalReadSize() {
        return totalReadSize;
    }

    public void setTotalReadSize(Long totalReadSize) {
        this.totalReadSize = totalReadSize;
    }

    public OperatorMetric withTotalWriteSize(Long totalWriteSize) {
        this.totalWriteSize = totalWriteSize;
        return this;
    }

    /**
     * **参数解释**：所有节点写入的总数据量。 **取值范围**：1~9223372036854775807。
     * @return totalWriteSize
     */
    public Long getTotalWriteSize() {
        return totalWriteSize;
    }

    public void setTotalWriteSize(Long totalWriteSize) {
        this.totalWriteSize = totalWriteSize;
    }

    public OperatorMetric withSubOperatorMetrics(List<OperatorMetric> subOperatorMetrics) {
        this.subOperatorMetrics = subOperatorMetrics;
        return this;
    }

    public OperatorMetric addSubOperatorMetricsItem(OperatorMetric subOperatorMetricsItem) {
        if (this.subOperatorMetrics == null) {
            this.subOperatorMetrics = new ArrayList<>();
        }
        this.subOperatorMetrics.add(subOperatorMetricsItem);
        return this;
    }

    public OperatorMetric withSubOperatorMetrics(Consumer<List<OperatorMetric>> subOperatorMetricsSetter) {
        if (this.subOperatorMetrics == null) {
            this.subOperatorMetrics = new ArrayList<>();
        }
        subOperatorMetricsSetter.accept(this.subOperatorMetrics);
        return this;
    }

    /**
     * **参数解释**：子节点。 **取值范围**：不涉及。
     * @return subOperatorMetrics
     */
    public List<OperatorMetric> getSubOperatorMetrics() {
        return subOperatorMetrics;
    }

    public void setSubOperatorMetrics(List<OperatorMetric> subOperatorMetrics) {
        this.subOperatorMetrics = subOperatorMetrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperatorMetric that = (OperatorMetric) obj;
        return Objects.equals(this.queryId, that.queryId) && Objects.equals(this.planNodeId, that.planNodeId)
            && Objects.equals(this.planNodeName, that.planNodeName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.status, that.status)
            && Objects.equals(this.queryDop, that.queryDop) && Objects.equals(this.estimatedRows, that.estimatedRows)
            && Objects.equals(this.tupleProcessed, that.tupleProcessed)
            && Objects.equals(this.minPeakMemory, that.minPeakMemory)
            && Objects.equals(this.maxPeakMemory, that.maxPeakMemory)
            && Objects.equals(this.averagePeakMemory, that.averagePeakMemory)
            && Objects.equals(this.memorySkewPercent, that.memorySkewPercent)
            && Objects.equals(this.minSpillSize, that.minSpillSize)
            && Objects.equals(this.maxSpillSize, that.maxSpillSize)
            && Objects.equals(this.averageSpillSize, that.averageSpillSize)
            && Objects.equals(this.spillSkewPercent, that.spillSkewPercent) && Objects.equals(this.loops, that.loops)
            && Objects.equals(this.progress, that.progress) && Objects.equals(this.totalReadSize, that.totalReadSize)
            && Objects.equals(this.totalWriteSize, that.totalWriteSize)
            && Objects.equals(this.subOperatorMetrics, that.subOperatorMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(queryId,
            planNodeId,
            planNodeName,
            startTime,
            duration,
            status,
            queryDop,
            estimatedRows,
            tupleProcessed,
            minPeakMemory,
            maxPeakMemory,
            averagePeakMemory,
            memorySkewPercent,
            minSpillSize,
            maxSpillSize,
            averageSpillSize,
            spillSkewPercent,
            loops,
            progress,
            totalReadSize,
            totalWriteSize,
            subOperatorMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperatorMetric {\n");
        sb.append("    queryId: ").append(toIndentedString(queryId)).append("\n");
        sb.append("    planNodeId: ").append(toIndentedString(planNodeId)).append("\n");
        sb.append("    planNodeName: ").append(toIndentedString(planNodeName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    queryDop: ").append(toIndentedString(queryDop)).append("\n");
        sb.append("    estimatedRows: ").append(toIndentedString(estimatedRows)).append("\n");
        sb.append("    tupleProcessed: ").append(toIndentedString(tupleProcessed)).append("\n");
        sb.append("    minPeakMemory: ").append(toIndentedString(minPeakMemory)).append("\n");
        sb.append("    maxPeakMemory: ").append(toIndentedString(maxPeakMemory)).append("\n");
        sb.append("    averagePeakMemory: ").append(toIndentedString(averagePeakMemory)).append("\n");
        sb.append("    memorySkewPercent: ").append(toIndentedString(memorySkewPercent)).append("\n");
        sb.append("    minSpillSize: ").append(toIndentedString(minSpillSize)).append("\n");
        sb.append("    maxSpillSize: ").append(toIndentedString(maxSpillSize)).append("\n");
        sb.append("    averageSpillSize: ").append(toIndentedString(averageSpillSize)).append("\n");
        sb.append("    spillSkewPercent: ").append(toIndentedString(spillSkewPercent)).append("\n");
        sb.append("    loops: ").append(toIndentedString(loops)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    totalReadSize: ").append(toIndentedString(totalReadSize)).append("\n");
        sb.append("    totalWriteSize: ").append(toIndentedString(totalWriteSize)).append("\n");
        sb.append("    subOperatorMetrics: ").append(toIndentedString(subOperatorMetrics)).append("\n");
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
