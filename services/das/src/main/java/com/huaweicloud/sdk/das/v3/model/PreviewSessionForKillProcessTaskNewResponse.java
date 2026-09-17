package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PreviewSessionForKillProcessTaskNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<ProcessSessionInfo> processes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_time")

    private Long dataSyncTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public PreviewSessionForKillProcessTaskNewResponse withProcesses(List<ProcessSessionInfo> processes) {
        this.processes = processes;
        return this;
    }

    public PreviewSessionForKillProcessTaskNewResponse addProcessesItem(ProcessSessionInfo processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public PreviewSessionForKillProcessTaskNewResponse withProcesses(
        Consumer<List<ProcessSessionInfo>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * SQL限流信息列表
     * @return processes
     */
    public List<ProcessSessionInfo> getProcesses() {
        return processes;
    }

    public void setProcesses(List<ProcessSessionInfo> processes) {
        this.processes = processes;
    }

    public PreviewSessionForKillProcessTaskNewResponse withDataSyncTime(Long dataSyncTime) {
        this.dataSyncTime = dataSyncTime;
        return this;
    }

    /**
     * 数据同步的时间
     * @return dataSyncTime
     */
    public Long getDataSyncTime() {
        return dataSyncTime;
    }

    public void setDataSyncTime(Long dataSyncTime) {
        this.dataSyncTime = dataSyncTime;
    }

    public PreviewSessionForKillProcessTaskNewResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 会话总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreviewSessionForKillProcessTaskNewResponse that = (PreviewSessionForKillProcessTaskNewResponse) obj;
        return Objects.equals(this.processes, that.processes) && Objects.equals(this.dataSyncTime, that.dataSyncTime)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processes, dataSyncTime, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreviewSessionForKillProcessTaskNewResponse {\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
        sb.append("    dataSyncTime: ").append(toIndentedString(dataSyncTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
