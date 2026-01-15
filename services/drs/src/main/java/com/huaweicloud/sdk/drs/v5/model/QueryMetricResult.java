package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Node节点指标项。
 */
public class QueryMetricResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_stamp")

    private LocalDate timeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_util")

    private String cpuUtil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_util")

    private String memUtil;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_incoming_bytes_rate")

    private String networkIncomingBytesRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_outgoing_bytes_rate")

    private String networkOutgoingBytesRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_read_bytes_rate")

    private String diskReadBytesRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_write_bytes_rate")

    private String diskWriteBytesRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_rows_rate")

    private String applyRowsRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_transactions_rate")

    private String applyTransactionsRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_ddl_rate")

    private String applyDdlRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_average_execute_time")

    private String applyAverageExecuteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_average_commit_time")

    private String applyAverageCommitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_current_state")

    private String applyCurrentState;

    public QueryMetricResult withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public QueryMetricResult withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 实例ID。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public QueryMetricResult withTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    /**
     * 上报时间。
     * @return timeStamp
     */
    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public QueryMetricResult withCpuUtil(String cpuUtil) {
        this.cpuUtil = cpuUtil;
        return this;
    }

    /**
     * CPU使用率。
     * @return cpuUtil
     */
    public String getCpuUtil() {
        return cpuUtil;
    }

    public void setCpuUtil(String cpuUtil) {
        this.cpuUtil = cpuUtil;
    }

    public QueryMetricResult withMemUtil(String memUtil) {
        this.memUtil = memUtil;
        return this;
    }

    /**
     * 内存使用率。
     * @return memUtil
     */
    public String getMemUtil() {
        return memUtil;
    }

    public void setMemUtil(String memUtil) {
        this.memUtil = memUtil;
    }

    public QueryMetricResult withNetworkIncomingBytesRate(String networkIncomingBytesRate) {
        this.networkIncomingBytesRate = networkIncomingBytesRate;
        return this;
    }

    /**
     * 网络输入吞吐量。
     * @return networkIncomingBytesRate
     */
    public String getNetworkIncomingBytesRate() {
        return networkIncomingBytesRate;
    }

    public void setNetworkIncomingBytesRate(String networkIncomingBytesRate) {
        this.networkIncomingBytesRate = networkIncomingBytesRate;
    }

    public QueryMetricResult withNetworkOutgoingBytesRate(String networkOutgoingBytesRate) {
        this.networkOutgoingBytesRate = networkOutgoingBytesRate;
        return this;
    }

    /**
     * 网络输出吞吐量。
     * @return networkOutgoingBytesRate
     */
    public String getNetworkOutgoingBytesRate() {
        return networkOutgoingBytesRate;
    }

    public void setNetworkOutgoingBytesRate(String networkOutgoingBytesRate) {
        this.networkOutgoingBytesRate = networkOutgoingBytesRate;
    }

    public QueryMetricResult withDiskReadBytesRate(String diskReadBytesRate) {
        this.diskReadBytesRate = diskReadBytesRate;
        return this;
    }

    /**
     * 磁盘读吞吐量。
     * @return diskReadBytesRate
     */
    public String getDiskReadBytesRate() {
        return diskReadBytesRate;
    }

    public void setDiskReadBytesRate(String diskReadBytesRate) {
        this.diskReadBytesRate = diskReadBytesRate;
    }

    public QueryMetricResult withDiskWriteBytesRate(String diskWriteBytesRate) {
        this.diskWriteBytesRate = diskWriteBytesRate;
        return this;
    }

    /**
     * 磁盘写吞吐量。
     * @return diskWriteBytesRate
     */
    public String getDiskWriteBytesRate() {
        return diskWriteBytesRate;
    }

    public void setDiskWriteBytesRate(String diskWriteBytesRate) {
        this.diskWriteBytesRate = diskWriteBytesRate;
    }

    public QueryMetricResult withApplyRowsRate(String applyRowsRate) {
        this.applyRowsRate = applyRowsRate;
        return this;
    }

    /**
     * 写目标库频率。
     * @return applyRowsRate
     */
    public String getApplyRowsRate() {
        return applyRowsRate;
    }

    public void setApplyRowsRate(String applyRowsRate) {
        this.applyRowsRate = applyRowsRate;
    }

    public QueryMetricResult withApplyTransactionsRate(String applyTransactionsRate) {
        this.applyTransactionsRate = applyTransactionsRate;
        return this;
    }

    /**
     * DML TPS。
     * @return applyTransactionsRate
     */
    public String getApplyTransactionsRate() {
        return applyTransactionsRate;
    }

    public void setApplyTransactionsRate(String applyTransactionsRate) {
        this.applyTransactionsRate = applyTransactionsRate;
    }

    public QueryMetricResult withApplyDdlRate(String applyDdlRate) {
        this.applyDdlRate = applyDdlRate;
        return this;
    }

    /**
     * DDL TPS。
     * @return applyDdlRate
     */
    public String getApplyDdlRate() {
        return applyDdlRate;
    }

    public void setApplyDdlRate(String applyDdlRate) {
        this.applyDdlRate = applyDdlRate;
    }

    public QueryMetricResult withApplyAverageExecuteTime(String applyAverageExecuteTime) {
        this.applyAverageExecuteTime = applyAverageExecuteTime;
        return this;
    }

    /**
     * 事务平均执行时间。
     * @return applyAverageExecuteTime
     */
    public String getApplyAverageExecuteTime() {
        return applyAverageExecuteTime;
    }

    public void setApplyAverageExecuteTime(String applyAverageExecuteTime) {
        this.applyAverageExecuteTime = applyAverageExecuteTime;
    }

    public QueryMetricResult withApplyAverageCommitTime(String applyAverageCommitTime) {
        this.applyAverageCommitTime = applyAverageCommitTime;
        return this;
    }

    /**
     * 事务平均提交时间。
     * @return applyAverageCommitTime
     */
    public String getApplyAverageCommitTime() {
        return applyAverageCommitTime;
    }

    public void setApplyAverageCommitTime(String applyAverageCommitTime) {
        this.applyAverageCommitTime = applyAverageCommitTime;
    }

    public QueryMetricResult withApplyCurrentState(String applyCurrentState) {
        this.applyCurrentState = applyCurrentState;
        return this;
    }

    /**
     * 同步状态。 succeed：同步成功，failed：同步失败，processing：同步中，waiting：等待中
     * @return applyCurrentState
     */
    public String getApplyCurrentState() {
        return applyCurrentState;
    }

    public void setApplyCurrentState(String applyCurrentState) {
        this.applyCurrentState = applyCurrentState;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryMetricResult that = (QueryMetricResult) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.timeStamp, that.timeStamp) && Objects.equals(this.cpuUtil, that.cpuUtil)
            && Objects.equals(this.memUtil, that.memUtil)
            && Objects.equals(this.networkIncomingBytesRate, that.networkIncomingBytesRate)
            && Objects.equals(this.networkOutgoingBytesRate, that.networkOutgoingBytesRate)
            && Objects.equals(this.diskReadBytesRate, that.diskReadBytesRate)
            && Objects.equals(this.diskWriteBytesRate, that.diskWriteBytesRate)
            && Objects.equals(this.applyRowsRate, that.applyRowsRate)
            && Objects.equals(this.applyTransactionsRate, that.applyTransactionsRate)
            && Objects.equals(this.applyDdlRate, that.applyDdlRate)
            && Objects.equals(this.applyAverageExecuteTime, that.applyAverageExecuteTime)
            && Objects.equals(this.applyAverageCommitTime, that.applyAverageCommitTime)
            && Objects.equals(this.applyCurrentState, that.applyCurrentState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            nodeId,
            timeStamp,
            cpuUtil,
            memUtil,
            networkIncomingBytesRate,
            networkOutgoingBytesRate,
            diskReadBytesRate,
            diskWriteBytesRate,
            applyRowsRate,
            applyTransactionsRate,
            applyDdlRate,
            applyAverageExecuteTime,
            applyAverageCommitTime,
            applyCurrentState);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryMetricResult {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
        sb.append("    cpuUtil: ").append(toIndentedString(cpuUtil)).append("\n");
        sb.append("    memUtil: ").append(toIndentedString(memUtil)).append("\n");
        sb.append("    networkIncomingBytesRate: ").append(toIndentedString(networkIncomingBytesRate)).append("\n");
        sb.append("    networkOutgoingBytesRate: ").append(toIndentedString(networkOutgoingBytesRate)).append("\n");
        sb.append("    diskReadBytesRate: ").append(toIndentedString(diskReadBytesRate)).append("\n");
        sb.append("    diskWriteBytesRate: ").append(toIndentedString(diskWriteBytesRate)).append("\n");
        sb.append("    applyRowsRate: ").append(toIndentedString(applyRowsRate)).append("\n");
        sb.append("    applyTransactionsRate: ").append(toIndentedString(applyTransactionsRate)).append("\n");
        sb.append("    applyDdlRate: ").append(toIndentedString(applyDdlRate)).append("\n");
        sb.append("    applyAverageExecuteTime: ").append(toIndentedString(applyAverageExecuteTime)).append("\n");
        sb.append("    applyAverageCommitTime: ").append(toIndentedString(applyAverageCommitTime)).append("\n");
        sb.append("    applyCurrentState: ").append(toIndentedString(applyCurrentState)).append("\n");
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
