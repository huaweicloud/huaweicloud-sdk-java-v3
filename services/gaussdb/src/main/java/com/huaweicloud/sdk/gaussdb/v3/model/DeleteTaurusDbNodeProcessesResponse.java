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
public class DeleteTaurusDbNodeProcessesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes_killed")

    private List<Long> processesKilled = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "processes_not_found")

    private List<Long> processesNotFound = null;

    public DeleteTaurusDbNodeProcessesResponse withProcessesKilled(List<Long> processesKilled) {
        this.processesKilled = processesKilled;
        return this;
    }

    public DeleteTaurusDbNodeProcessesResponse addProcessesKilledItem(Long processesKilledItem) {
        if (this.processesKilled == null) {
            this.processesKilled = new ArrayList<>();
        }
        this.processesKilled.add(processesKilledItem);
        return this;
    }

    public DeleteTaurusDbNodeProcessesResponse withProcessesKilled(Consumer<List<Long>> processesKilledSetter) {
        if (this.processesKilled == null) {
            this.processesKilled = new ArrayList<>();
        }
        processesKilledSetter.accept(this.processesKilled);
        return this;
    }

    /**
     * **参数解释**：  已终止的用户会话线程ID列表。
     * @return processesKilled
     */
    public List<Long> getProcessesKilled() {
        return processesKilled;
    }

    public void setProcessesKilled(List<Long> processesKilled) {
        this.processesKilled = processesKilled;
    }

    public DeleteTaurusDbNodeProcessesResponse withProcessesNotFound(List<Long> processesNotFound) {
        this.processesNotFound = processesNotFound;
        return this;
    }

    public DeleteTaurusDbNodeProcessesResponse addProcessesNotFoundItem(Long processesNotFoundItem) {
        if (this.processesNotFound == null) {
            this.processesNotFound = new ArrayList<>();
        }
        this.processesNotFound.add(processesNotFoundItem);
        return this;
    }

    public DeleteTaurusDbNodeProcessesResponse withProcessesNotFound(Consumer<List<Long>> processesNotFoundSetter) {
        if (this.processesNotFound == null) {
            this.processesNotFound = new ArrayList<>();
        }
        processesNotFoundSetter.accept(this.processesNotFound);
        return this;
    }

    /**
     * **参数解释**：  不存在的用户会话线程ID列表。
     * @return processesNotFound
     */
    public List<Long> getProcessesNotFound() {
        return processesNotFound;
    }

    public void setProcessesNotFound(List<Long> processesNotFound) {
        this.processesNotFound = processesNotFound;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteTaurusDbNodeProcessesResponse that = (DeleteTaurusDbNodeProcessesResponse) obj;
        return Objects.equals(this.processesKilled, that.processesKilled)
            && Objects.equals(this.processesNotFound, that.processesNotFound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processesKilled, processesNotFound);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteTaurusDbNodeProcessesResponse {\n");
        sb.append("    processesKilled: ").append(toIndentedString(processesKilled)).append("\n");
        sb.append("    processesNotFound: ").append(toIndentedString(processesNotFound)).append("\n");
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
