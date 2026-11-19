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
public class ShowKillProcessTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<KillProcessItem> processes = null;

    public ShowKillProcessTaskResponse withProcesses(List<KillProcessItem> processes) {
        this.processes = processes;
        return this;
    }

    public ShowKillProcessTaskResponse addProcessesItem(KillProcessItem processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public ShowKillProcessTaskResponse withProcesses(Consumer<List<KillProcessItem>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * **参数解释**  Kill会话任务列表。
     * @return processes
     */
    public List<KillProcessItem> getProcesses() {
        return processes;
    }

    public void setProcesses(List<KillProcessItem> processes) {
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
        ShowKillProcessTaskResponse that = (ShowKillProcessTaskResponse) obj;
        return Objects.equals(this.processes, that.processes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKillProcessTaskResponse {\n");
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
