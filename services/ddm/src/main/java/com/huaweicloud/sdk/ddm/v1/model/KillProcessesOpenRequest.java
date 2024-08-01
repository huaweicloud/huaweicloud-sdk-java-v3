package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * KillProcessesOpenRequest
 */
public class KillProcessesOpenRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_ids")

    private List<String> processIds = null;

    public KillProcessesOpenRequest withProcessIds(List<String> processIds) {
        this.processIds = processIds;
        return this;
    }

    public KillProcessesOpenRequest addProcessIdsItem(String processIdsItem) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        this.processIds.add(processIdsItem);
        return this;
    }

    public KillProcessesOpenRequest withProcessIds(Consumer<List<String>> processIdsSetter) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        processIdsSetter.accept(this.processIds);
        return this;
    }

    /**
     * 会话id集合
     * @return processIds
     */
    public List<String> getProcessIds() {
        return processIds;
    }

    public void setProcessIds(List<String> processIds) {
        this.processIds = processIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KillProcessesOpenRequest that = (KillProcessesOpenRequest) obj;
        return Objects.equals(this.processIds, that.processIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KillProcessesOpenRequest {\n");
        sb.append("    processIds: ").append(toIndentedString(processIds)).append("\n");
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
