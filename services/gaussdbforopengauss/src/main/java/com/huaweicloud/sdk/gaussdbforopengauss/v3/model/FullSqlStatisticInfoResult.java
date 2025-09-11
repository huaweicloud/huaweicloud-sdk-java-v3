package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 全量SQL聚合统计信息。
 */
public class FullSqlStatisticInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private String template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_count")

    private Long sqlCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_db_time")

    private Long avgDbTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_cpu_time")

    private Long avgCpuTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_data_io_time")

    private Long avgDataIoTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_execution_time")

    private Long avgExecutionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avg_n_blocks_hit")

    private Long avgNBlocksHit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_stamp")

    private String startTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time_stamp")

    private String endTimeStamp;

    public FullSqlStatisticInfoResult withTemplate(String template) {
        this.template = template;
        return this;
    }

    /**
     * **参数解释**: SQL模板。未开启实例内核GUC参数（track_stmt_parameter）时，展示的是归一化SQL模板内容；开启该参数后，展示的是随机一条SQL记录中截断参数列表后的内容。 **取值范围**: 不涉及。
     * @return template
     */
    public String getTemplate() {
        return template;
    }

    public void setTemplate(String template) {
        this.template = template;
    }

    public FullSqlStatisticInfoResult withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID。 **取值范围**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public FullSqlStatisticInfoResult withSqlCount(Long sqlCount) {
        this.sqlCount = sqlCount;
        return this;
    }

    /**
     * **参数解释**: 汇总SQL条目数。 **取值范围**: 不涉及。
     * @return sqlCount
     */
    public Long getSqlCount() {
        return sqlCount;
    }

    public void setSqlCount(Long sqlCount) {
        this.sqlCount = sqlCount;
    }

    public FullSqlStatisticInfoResult withAvgDbTime(Long avgDbTime) {
        this.avgDbTime = avgDbTime;
        return this;
    }

    /**
     * **参数解释**: 平均有效DB耗时（微秒）。 **取值范围**: 不涉及。
     * @return avgDbTime
     */
    public Long getAvgDbTime() {
        return avgDbTime;
    }

    public void setAvgDbTime(Long avgDbTime) {
        this.avgDbTime = avgDbTime;
    }

    public FullSqlStatisticInfoResult withAvgCpuTime(Long avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
        return this;
    }

    /**
     * **参数解释**: 平均CPU执行耗时（微秒）。 **取值范围**: 不涉及。
     * @return avgCpuTime
     */
    public Long getAvgCpuTime() {
        return avgCpuTime;
    }

    public void setAvgCpuTime(Long avgCpuTime) {
        this.avgCpuTime = avgCpuTime;
    }

    public FullSqlStatisticInfoResult withAvgDataIoTime(Long avgDataIoTime) {
        this.avgDataIoTime = avgDataIoTime;
        return this;
    }

    /**
     * **参数解释**: 平均IO耗时（微秒）。 **取值范围**: 不涉及。
     * @return avgDataIoTime
     */
    public Long getAvgDataIoTime() {
        return avgDataIoTime;
    }

    public void setAvgDataIoTime(Long avgDataIoTime) {
        this.avgDataIoTime = avgDataIoTime;
    }

    public FullSqlStatisticInfoResult withAvgExecutionTime(Long avgExecutionTime) {
        this.avgExecutionTime = avgExecutionTime;
        return this;
    }

    /**
     * **参数解释**: 平均SQL执行器内执行时间（微秒）。 **取值范围**: 不涉及。
     * @return avgExecutionTime
     */
    public Long getAvgExecutionTime() {
        return avgExecutionTime;
    }

    public void setAvgExecutionTime(Long avgExecutionTime) {
        this.avgExecutionTime = avgExecutionTime;
    }

    public FullSqlStatisticInfoResult withAvgNBlocksHit(Long avgNBlocksHit) {
        this.avgNBlocksHit = avgNBlocksHit;
        return this;
    }

    /**
     * **参数解释**: 平均Buffer块命中次数。 **取值范围**: 不涉及。
     * @return avgNBlocksHit
     */
    public Long getAvgNBlocksHit() {
        return avgNBlocksHit;
    }

    public void setAvgNBlocksHit(Long avgNBlocksHit) {
        this.avgNBlocksHit = avgNBlocksHit;
    }

    public FullSqlStatisticInfoResult withStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
        return this;
    }

    /**
     * **参数解释**: 开始时间戳。 **取值范围**: 不涉及。
     * @return startTimeStamp
     */
    public String getStartTimeStamp() {
        return startTimeStamp;
    }

    public void setStartTimeStamp(String startTimeStamp) {
        this.startTimeStamp = startTimeStamp;
    }

    public FullSqlStatisticInfoResult withEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
        return this;
    }

    /**
     * **参数解释**: 结束时间戳。 **取值范围**: 不涉及。
     * @return endTimeStamp
     */
    public String getEndTimeStamp() {
        return endTimeStamp;
    }

    public void setEndTimeStamp(String endTimeStamp) {
        this.endTimeStamp = endTimeStamp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FullSqlStatisticInfoResult that = (FullSqlStatisticInfoResult) obj;
        return Objects.equals(this.template, that.template) && Objects.equals(this.sqlId, that.sqlId)
            && Objects.equals(this.sqlCount, that.sqlCount) && Objects.equals(this.avgDbTime, that.avgDbTime)
            && Objects.equals(this.avgCpuTime, that.avgCpuTime)
            && Objects.equals(this.avgDataIoTime, that.avgDataIoTime)
            && Objects.equals(this.avgExecutionTime, that.avgExecutionTime)
            && Objects.equals(this.avgNBlocksHit, that.avgNBlocksHit)
            && Objects.equals(this.startTimeStamp, that.startTimeStamp)
            && Objects.equals(this.endTimeStamp, that.endTimeStamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(template,
            sqlId,
            sqlCount,
            avgDbTime,
            avgCpuTime,
            avgDataIoTime,
            avgExecutionTime,
            avgNBlocksHit,
            startTimeStamp,
            endTimeStamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSqlStatisticInfoResult {\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlCount: ").append(toIndentedString(sqlCount)).append("\n");
        sb.append("    avgDbTime: ").append(toIndentedString(avgDbTime)).append("\n");
        sb.append("    avgCpuTime: ").append(toIndentedString(avgCpuTime)).append("\n");
        sb.append("    avgDataIoTime: ").append(toIndentedString(avgDataIoTime)).append("\n");
        sb.append("    avgExecutionTime: ").append(toIndentedString(avgExecutionTime)).append("\n");
        sb.append("    avgNBlocksHit: ").append(toIndentedString(avgNBlocksHit)).append("\n");
        sb.append("    startTimeStamp: ").append(toIndentedString(startTimeStamp)).append("\n");
        sb.append("    endTimeStamp: ").append(toIndentedString(endTimeStamp)).append("\n");
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
