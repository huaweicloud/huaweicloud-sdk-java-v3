package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 终止TaurusDB节点用户会话线程请求
 */
public class DeleteTaurusDbNodeProcessesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<Long> processes = null;

    public DeleteTaurusDbNodeProcessesRequestBody withProcesses(List<Long> processes) {
        this.processes = processes;
        return this;
    }

    public DeleteTaurusDbNodeProcessesRequestBody addProcessesItem(Long processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public DeleteTaurusDbNodeProcessesRequestBody withProcesses(Consumer<List<Long>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * **参数解释**：  待终止用户会话线程ID列表。  通过查询节点用户会话线程接口，或show processlist命令获取。
     * @return processes
     */
    public List<Long> getProcesses() {
        return processes;
    }

    public void setProcesses(List<Long> processes) {
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
        DeleteTaurusDbNodeProcessesRequestBody that = (DeleteTaurusDbNodeProcessesRequestBody) obj;
        return Objects.equals(this.processes, that.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTaurusDbNodeProcessesRequestBody {\n");
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
