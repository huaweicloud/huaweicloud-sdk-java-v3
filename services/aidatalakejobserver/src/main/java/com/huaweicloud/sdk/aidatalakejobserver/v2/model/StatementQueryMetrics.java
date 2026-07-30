package com.huaweicloud.sdk.aidatalakejobserver.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * **参数解释**：语句监控详情。
 */
public class StatementQueryMetrics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_id")

    private String sessionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statement_id")

    private String statementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_plan")

    private String queryPlan;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_total_time")

    private Long estimateTotalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_left_time")

    private Long estimateLeftTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_coordinator_duration")

    private Long startupCoordinatorDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_session_duration")

    private Long createSessionDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enqueue_statement_duration")

    private Long enqueueStatementDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_duration")

    private Long queueDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "write_resultset_duration")

    private Long writeResultsetDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parse_time")

    private Long parseTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_memory")

    private Integer estimateMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private String errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_time_skew_percent")

    private Integer dnTimeSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_max_peak_memory")

    private Integer dnMaxPeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_average_peak_memory")

    private Integer dnAveragePeakMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_spill_skew_percent")

    private Integer dnSpillSkewPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_write_disk_total_size")

    private Long dnWriteDiskTotalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dn_spill_obs_total_size")

    private Long dnSpillObsTotalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cn_spill_obs_size")

    private Long cnSpillObsSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_cache_hit_ratio")

    private BigDecimal diskCacheHitRatio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_io_req_avg_latency")

    private Long obsIoReqAvgLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_io_req_latency_gt_1s")

    private Long obsIoReqLatencyGt1s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_io_req_latency_gt_10s")

    private Long obsIoReqLatencyGt10s;

    public StatementQueryMetrics withSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }

    /**
     * **参数解释**：会话ID。 **取值范围**：长度为1~36个字符，支持大小写英文字母、数字、连字符。
     * @return sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public StatementQueryMetrics withStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }

    /**
     * **参数解释**：语句ID。 **取值范围**：不涉及。
     * @return statementId
     */
    public String getStatementId() {
        return statementId;
    }

    public void setStatementId(String statementId) {
        this.statementId = statementId;
    }

    public StatementQueryMetrics withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：语句开始时间。 **取值范围**：不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public StatementQueryMetrics withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * **参数解释**：语句运行时长（单位：ms）。 **取值范围**：不涉及。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public StatementQueryMetrics withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**：语句执行时的Schema名称。 **取值范围**：不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public StatementQueryMetrics withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**：查询语句。 **取值范围**：不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public StatementQueryMetrics withQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
        return this;
    }

    /**
     * **参数解释**：语句计划信息。 **取值范围**：不涉及。
     * @return queryPlan
     */
    public String getQueryPlan() {
        return queryPlan;
    }

    public void setQueryPlan(String queryPlan) {
        this.queryPlan = queryPlan;
    }

    public StatementQueryMetrics withEstimateTotalTime(Long estimateTotalTime) {
        this.estimateTotalTime = estimateTotalTime;
        return this;
    }

    /**
     * **参数解释**：预计语句运行时长（单位：ms）。 **取值范围**：不涉及。
     * @return estimateTotalTime
     */
    public Long getEstimateTotalTime() {
        return estimateTotalTime;
    }

    public void setEstimateTotalTime(Long estimateTotalTime) {
        this.estimateTotalTime = estimateTotalTime;
    }

    public StatementQueryMetrics withEstimateLeftTime(Long estimateLeftTime) {
        this.estimateLeftTime = estimateLeftTime;
        return this;
    }

    /**
     * **参数解释**：预计语句剩余时长（单位：ms）。 **取值范围**：不涉及。
     * @return estimateLeftTime
     */
    public Long getEstimateLeftTime() {
        return estimateLeftTime;
    }

    public void setEstimateLeftTime(Long estimateLeftTime) {
        this.estimateLeftTime = estimateLeftTime;
    }

    public StatementQueryMetrics withStartupCoordinatorDuration(Long startupCoordinatorDuration) {
        this.startupCoordinatorDuration = startupCoordinatorDuration;
        return this;
    }

    /**
     * **参数解释**：cn启动时长（单位：ms）。 **取值范围**：不涉及。
     * @return startupCoordinatorDuration
     */
    public Long getStartupCoordinatorDuration() {
        return startupCoordinatorDuration;
    }

    public void setStartupCoordinatorDuration(Long startupCoordinatorDuration) {
        this.startupCoordinatorDuration = startupCoordinatorDuration;
    }

    public StatementQueryMetrics withCreateSessionDuration(Long createSessionDuration) {
        this.createSessionDuration = createSessionDuration;
        return this;
    }

    /**
     * **参数解释**：创建会话时长（单位：ms）。 **取值范围**：不涉及。
     * @return createSessionDuration
     */
    public Long getCreateSessionDuration() {
        return createSessionDuration;
    }

    public void setCreateSessionDuration(Long createSessionDuration) {
        this.createSessionDuration = createSessionDuration;
    }

    public StatementQueryMetrics withEnqueueStatementDuration(Long enqueueStatementDuration) {
        this.enqueueStatementDuration = enqueueStatementDuration;
        return this;
    }

    /**
     * **参数解释**：语句加入任务队列时长（单位：ms）。 **取值范围**：不涉及。
     * @return enqueueStatementDuration
     */
    public Long getEnqueueStatementDuration() {
        return enqueueStatementDuration;
    }

    public void setEnqueueStatementDuration(Long enqueueStatementDuration) {
        this.enqueueStatementDuration = enqueueStatementDuration;
    }

    public StatementQueryMetrics withQueueDuration(Long queueDuration) {
        this.queueDuration = queueDuration;
        return this;
    }

    /**
     * **参数解释**：语句排队时长（单位：ms）。 **取值范围**：不涉及。
     * @return queueDuration
     */
    public Long getQueueDuration() {
        return queueDuration;
    }

    public void setQueueDuration(Long queueDuration) {
        this.queueDuration = queueDuration;
    }

    public StatementQueryMetrics withWriteResultsetDuration(Long writeResultsetDuration) {
        this.writeResultsetDuration = writeResultsetDuration;
        return this;
    }

    /**
     * **参数解释**：语句写结果集时长（单位：ms）。 **取值范围**：不涉及。
     * @return writeResultsetDuration
     */
    public Long getWriteResultsetDuration() {
        return writeResultsetDuration;
    }

    public void setWriteResultsetDuration(Long writeResultsetDuration) {
        this.writeResultsetDuration = writeResultsetDuration;
    }

    public StatementQueryMetrics withParseTime(Long parseTime) {
        this.parseTime = parseTime;
        return this;
    }

    /**
     * **参数解释**：执行前解析时间（单位：ms）。 **取值范围**：不涉及。
     * @return parseTime
     */
    public Long getParseTime() {
        return parseTime;
    }

    public void setParseTime(Long parseTime) {
        this.parseTime = parseTime;
    }

    public StatementQueryMetrics withEstimateMemory(Integer estimateMemory) {
        this.estimateMemory = estimateMemory;
        return this;
    }

    /**
     * **参数解释**：预计使用内存（单位：MB）。 **取值范围**：不涉及。
     * @return estimateMemory
     */
    public Integer getEstimateMemory() {
        return estimateMemory;
    }

    public void setEstimateMemory(Integer estimateMemory) {
        this.estimateMemory = estimateMemory;
    }

    public StatementQueryMetrics withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：语句状态，WLM状态。 **取值范围**：不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public StatementQueryMetrics withErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * **参数解释**：语句报错信息。 **取值范围**：不涉及。
     * @return errorInfo
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public StatementQueryMetrics withDnTimeSkewPercent(Integer dnTimeSkewPercent) {
        this.dnTimeSkewPercent = dnTimeSkewPercent;
        return this;
    }

    /**
     * **参数解释**：DN时长偏斜百分比（单位：%）。 **取值范围**：不涉及。
     * @return dnTimeSkewPercent
     */
    public Integer getDnTimeSkewPercent() {
        return dnTimeSkewPercent;
    }

    public void setDnTimeSkewPercent(Integer dnTimeSkewPercent) {
        this.dnTimeSkewPercent = dnTimeSkewPercent;
    }

    public StatementQueryMetrics withDnMaxPeakMemory(Integer dnMaxPeakMemory) {
        this.dnMaxPeakMemory = dnMaxPeakMemory;
        return this;
    }

    /**
     * **参数解释**：DN最大峰值内存（单位：MB）。 **取值范围**：不涉及。
     * @return dnMaxPeakMemory
     */
    public Integer getDnMaxPeakMemory() {
        return dnMaxPeakMemory;
    }

    public void setDnMaxPeakMemory(Integer dnMaxPeakMemory) {
        this.dnMaxPeakMemory = dnMaxPeakMemory;
    }

    public StatementQueryMetrics withDnAveragePeakMemory(Integer dnAveragePeakMemory) {
        this.dnAveragePeakMemory = dnAveragePeakMemory;
        return this;
    }

    /**
     * **参数解释**：DN平均峰值内存（单位：MB）。 **取值范围**：不涉及。
     * @return dnAveragePeakMemory
     */
    public Integer getDnAveragePeakMemory() {
        return dnAveragePeakMemory;
    }

    public void setDnAveragePeakMemory(Integer dnAveragePeakMemory) {
        this.dnAveragePeakMemory = dnAveragePeakMemory;
    }

    public StatementQueryMetrics withDnSpillSkewPercent(Integer dnSpillSkewPercent) {
        this.dnSpillSkewPercent = dnSpillSkewPercent;
        return this;
    }

    /**
     * **参数解释**：dn下盘倾斜率（单位：%）。 **取值范围**：不涉及。
     * @return dnSpillSkewPercent
     */
    public Integer getDnSpillSkewPercent() {
        return dnSpillSkewPercent;
    }

    public void setDnSpillSkewPercent(Integer dnSpillSkewPercent) {
        this.dnSpillSkewPercent = dnSpillSkewPercent;
    }

    public StatementQueryMetrics withDnWriteDiskTotalSize(Long dnWriteDiskTotalSize) {
        this.dnWriteDiskTotalSize = dnWriteDiskTotalSize;
        return this;
    }

    /**
     * **参数解释**：dn落盘总大小（单位：MB）。 **取值范围**：不涉及。
     * @return dnWriteDiskTotalSize
     */
    public Long getDnWriteDiskTotalSize() {
        return dnWriteDiskTotalSize;
    }

    public void setDnWriteDiskTotalSize(Long dnWriteDiskTotalSize) {
        this.dnWriteDiskTotalSize = dnWriteDiskTotalSize;
    }

    public StatementQueryMetrics withDnSpillObsTotalSize(Long dnSpillObsTotalSize) {
        this.dnSpillObsTotalSize = dnSpillObsTotalSize;
        return this;
    }

    /**
     * **参数解释**：dn溢写OBS总大小（单位：MB）。 **取值范围**：不涉及。
     * @return dnSpillObsTotalSize
     */
    public Long getDnSpillObsTotalSize() {
        return dnSpillObsTotalSize;
    }

    public void setDnSpillObsTotalSize(Long dnSpillObsTotalSize) {
        this.dnSpillObsTotalSize = dnSpillObsTotalSize;
    }

    public StatementQueryMetrics withCnSpillObsSize(Long cnSpillObsSize) {
        this.cnSpillObsSize = cnSpillObsSize;
        return this;
    }

    /**
     * **参数解释**：cn溢写OBS大小（单位：MB）。 **取值范围**：不涉及。
     * @return cnSpillObsSize
     */
    public Long getCnSpillObsSize() {
        return cnSpillObsSize;
    }

    public void setCnSpillObsSize(Long cnSpillObsSize) {
        this.cnSpillObsSize = cnSpillObsSize;
    }

    public StatementQueryMetrics withDiskCacheHitRatio(BigDecimal diskCacheHitRatio) {
        this.diskCacheHitRatio = diskCacheHitRatio;
        return this;
    }

    /**
     * **参数解释**：磁盘缓存命中率。 **取值范围**：不涉及。
     * @return diskCacheHitRatio
     */
    public BigDecimal getDiskCacheHitRatio() {
        return diskCacheHitRatio;
    }

    public void setDiskCacheHitRatio(BigDecimal diskCacheHitRatio) {
        this.diskCacheHitRatio = diskCacheHitRatio;
    }

    public StatementQueryMetrics withObsIoReqAvgLatency(Long obsIoReqAvgLatency) {
        this.obsIoReqAvgLatency = obsIoReqAvgLatency;
        return this;
    }

    /**
     * **参数解释**：OBS IO请求平均延迟（单位：us）。 **取值范围**：不涉及。
     * @return obsIoReqAvgLatency
     */
    public Long getObsIoReqAvgLatency() {
        return obsIoReqAvgLatency;
    }

    public void setObsIoReqAvgLatency(Long obsIoReqAvgLatency) {
        this.obsIoReqAvgLatency = obsIoReqAvgLatency;
    }

    public StatementQueryMetrics withObsIoReqLatencyGt1s(Long obsIoReqLatencyGt1s) {
        this.obsIoReqLatencyGt1s = obsIoReqLatencyGt1s;
        return this;
    }

    /**
     * **参数解释**：OBS IO请求延迟大于1秒的次数。 **取值范围**：不涉及。
     * @return obsIoReqLatencyGt1s
     */
    public Long getObsIoReqLatencyGt1s() {
        return obsIoReqLatencyGt1s;
    }

    public void setObsIoReqLatencyGt1s(Long obsIoReqLatencyGt1s) {
        this.obsIoReqLatencyGt1s = obsIoReqLatencyGt1s;
    }

    public StatementQueryMetrics withObsIoReqLatencyGt10s(Long obsIoReqLatencyGt10s) {
        this.obsIoReqLatencyGt10s = obsIoReqLatencyGt10s;
        return this;
    }

    /**
     * **参数解释**：OBS IO请求延迟大于10秒的次数。 **取值范围**：不涉及。
     * @return obsIoReqLatencyGt10s
     */
    public Long getObsIoReqLatencyGt10s() {
        return obsIoReqLatencyGt10s;
    }

    public void setObsIoReqLatencyGt10s(Long obsIoReqLatencyGt10s) {
        this.obsIoReqLatencyGt10s = obsIoReqLatencyGt10s;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StatementQueryMetrics that = (StatementQueryMetrics) obj;
        return Objects.equals(this.sessionId, that.sessionId) && Objects.equals(this.statementId, that.statementId)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.query, that.query)
            && Objects.equals(this.queryPlan, that.queryPlan)
            && Objects.equals(this.estimateTotalTime, that.estimateTotalTime)
            && Objects.equals(this.estimateLeftTime, that.estimateLeftTime)
            && Objects.equals(this.startupCoordinatorDuration, that.startupCoordinatorDuration)
            && Objects.equals(this.createSessionDuration, that.createSessionDuration)
            && Objects.equals(this.enqueueStatementDuration, that.enqueueStatementDuration)
            && Objects.equals(this.queueDuration, that.queueDuration)
            && Objects.equals(this.writeResultsetDuration, that.writeResultsetDuration)
            && Objects.equals(this.parseTime, that.parseTime)
            && Objects.equals(this.estimateMemory, that.estimateMemory) && Objects.equals(this.status, that.status)
            && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.dnTimeSkewPercent, that.dnTimeSkewPercent)
            && Objects.equals(this.dnMaxPeakMemory, that.dnMaxPeakMemory)
            && Objects.equals(this.dnAveragePeakMemory, that.dnAveragePeakMemory)
            && Objects.equals(this.dnSpillSkewPercent, that.dnSpillSkewPercent)
            && Objects.equals(this.dnWriteDiskTotalSize, that.dnWriteDiskTotalSize)
            && Objects.equals(this.dnSpillObsTotalSize, that.dnSpillObsTotalSize)
            && Objects.equals(this.cnSpillObsSize, that.cnSpillObsSize)
            && Objects.equals(this.diskCacheHitRatio, that.diskCacheHitRatio)
            && Objects.equals(this.obsIoReqAvgLatency, that.obsIoReqAvgLatency)
            && Objects.equals(this.obsIoReqLatencyGt1s, that.obsIoReqLatencyGt1s)
            && Objects.equals(this.obsIoReqLatencyGt10s, that.obsIoReqLatencyGt10s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId,
            statementId,
            startTime,
            duration,
            schemaName,
            query,
            queryPlan,
            estimateTotalTime,
            estimateLeftTime,
            startupCoordinatorDuration,
            createSessionDuration,
            enqueueStatementDuration,
            queueDuration,
            writeResultsetDuration,
            parseTime,
            estimateMemory,
            status,
            errorInfo,
            dnTimeSkewPercent,
            dnMaxPeakMemory,
            dnAveragePeakMemory,
            dnSpillSkewPercent,
            dnWriteDiskTotalSize,
            dnSpillObsTotalSize,
            cnSpillObsSize,
            diskCacheHitRatio,
            obsIoReqAvgLatency,
            obsIoReqLatencyGt1s,
            obsIoReqLatencyGt10s);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatementQueryMetrics {\n");
        sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
        sb.append("    statementId: ").append(toIndentedString(statementId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryPlan: ").append(toIndentedString(queryPlan)).append("\n");
        sb.append("    estimateTotalTime: ").append(toIndentedString(estimateTotalTime)).append("\n");
        sb.append("    estimateLeftTime: ").append(toIndentedString(estimateLeftTime)).append("\n");
        sb.append("    startupCoordinatorDuration: ").append(toIndentedString(startupCoordinatorDuration)).append("\n");
        sb.append("    createSessionDuration: ").append(toIndentedString(createSessionDuration)).append("\n");
        sb.append("    enqueueStatementDuration: ").append(toIndentedString(enqueueStatementDuration)).append("\n");
        sb.append("    queueDuration: ").append(toIndentedString(queueDuration)).append("\n");
        sb.append("    writeResultsetDuration: ").append(toIndentedString(writeResultsetDuration)).append("\n");
        sb.append("    parseTime: ").append(toIndentedString(parseTime)).append("\n");
        sb.append("    estimateMemory: ").append(toIndentedString(estimateMemory)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    dnTimeSkewPercent: ").append(toIndentedString(dnTimeSkewPercent)).append("\n");
        sb.append("    dnMaxPeakMemory: ").append(toIndentedString(dnMaxPeakMemory)).append("\n");
        sb.append("    dnAveragePeakMemory: ").append(toIndentedString(dnAveragePeakMemory)).append("\n");
        sb.append("    dnSpillSkewPercent: ").append(toIndentedString(dnSpillSkewPercent)).append("\n");
        sb.append("    dnWriteDiskTotalSize: ").append(toIndentedString(dnWriteDiskTotalSize)).append("\n");
        sb.append("    dnSpillObsTotalSize: ").append(toIndentedString(dnSpillObsTotalSize)).append("\n");
        sb.append("    cnSpillObsSize: ").append(toIndentedString(cnSpillObsSize)).append("\n");
        sb.append("    diskCacheHitRatio: ").append(toIndentedString(diskCacheHitRatio)).append("\n");
        sb.append("    obsIoReqAvgLatency: ").append(toIndentedString(obsIoReqAvgLatency)).append("\n");
        sb.append("    obsIoReqLatencyGt1s: ").append(toIndentedString(obsIoReqLatencyGt1s)).append("\n");
        sb.append("    obsIoReqLatencyGt10s: ").append(toIndentedString(obsIoReqLatencyGt10s)).append("\n");
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
