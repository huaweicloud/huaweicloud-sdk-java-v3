package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ShowKillProcessHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<KillProcessHistoryItem> processes = null;

    public ShowKillProcessHistoryResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  历史记录总数。  **取值范围**：  不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowKillProcessHistoryResponse withProcesses(List<KillProcessHistoryItem> processes) {
        this.processes = processes;
        return this;
    }

    public ShowKillProcessHistoryResponse addProcessesItem(KillProcessHistoryItem processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public ShowKillProcessHistoryResponse withProcesses(Consumer<List<KillProcessHistoryItem>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * **参数解释**：  历史记录列表。
     * @return processes
     */
    public List<KillProcessHistoryItem> getProcesses() {
        return processes;
    }

    public void setProcesses(List<KillProcessHistoryItem> processes) {
        this.processes = processes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKillProcessHistoryResponse that = (ShowKillProcessHistoryResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.processes, that.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, processes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKillProcessHistoryResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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
