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
public class ListTaurusDbNodeProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes")

    private List<TaurusDbProcessInfo> processes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListTaurusDbNodeProcessesResponse withProcesses(List<TaurusDbProcessInfo> processes) {
        this.processes = processes;
        return this;
    }

    public ListTaurusDbNodeProcessesResponse addProcessesItem(TaurusDbProcessInfo processesItem) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        this.processes.add(processesItem);
        return this;
    }

    public ListTaurusDbNodeProcessesResponse withProcesses(Consumer<List<TaurusDbProcessInfo>> processesSetter) {
        if (this.processes == null) {
            this.processes = new ArrayList<>();
        }
        processesSetter.accept(this.processes);
        return this;
    }

    /**
     * **参数解释**：  用户会话线程信息列表。
     * @return processes
     */
    public List<TaurusDbProcessInfo> getProcesses() {
        return processes;
    }

    public void setProcesses(List<TaurusDbProcessInfo> processes) {
        this.processes = processes;
    }

    public ListTaurusDbNodeProcessesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**：  节点中的用户会话线程总数。  **取值范围**：  ≥0 
     * minimum: 0
     * maximum: 2147483647
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
        ListTaurusDbNodeProcessesResponse that = (ListTaurusDbNodeProcessesResponse) obj;
        return Objects.equals(this.processes, that.processes) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processes, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaurusDbNodeProcessesResponse {\n");
        sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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
