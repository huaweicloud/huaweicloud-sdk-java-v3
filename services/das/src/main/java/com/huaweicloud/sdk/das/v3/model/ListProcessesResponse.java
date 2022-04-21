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
public class ListProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<Process> processes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ListProcessesResponse withProcesses(List<Process> processes) {
        this.processes = processes;
        return this;
    }

    public ListProcessesResponse addProcessesItem(Process processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public ListProcessesResponse withProcesses(Consumer<List<Process>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * 会话列表
     * @return processes
     */
    public List<Process> getProcesses() {
        return processes;
    }

    public void setProcesses(List<Process> processes) {
        this.processes = processes;
    }

    public ListProcessesResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProcessesResponse listProcessesResponse = (ListProcessesResponse) o;
        return Objects.equals(this.processes, listProcessesResponse.processes)
            && Objects.equals(this.count, listProcessesResponse.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processes, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProcessesResponse {\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
