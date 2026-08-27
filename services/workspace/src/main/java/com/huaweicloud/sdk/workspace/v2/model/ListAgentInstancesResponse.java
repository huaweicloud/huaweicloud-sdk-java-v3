package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListAgentInstancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_instances")

    private List<AgentInstanceInfo> agentInstances = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAgentInstancesResponse withAgentInstances(List<AgentInstanceInfo> agentInstances) {
        this.agentInstances = agentInstances;
        return this;
    }

    public ListAgentInstancesResponse addAgentInstancesItem(AgentInstanceInfo agentInstancesItem) {
        if (this.agentInstances == null) {
            this.agentInstances = new ArrayList<>();
        }
        this.agentInstances.add(agentInstancesItem);
        return this;
    }

    public ListAgentInstancesResponse withAgentInstances(Consumer<List<AgentInstanceInfo>> agentInstancesSetter) {
        if (this.agentInstances == null) {
            this.agentInstances = new ArrayList<>();
        }
        agentInstancesSetter.accept(this.agentInstances);
        return this;
    }

    /**
     * Agent 示例信息
     * @return agentInstances
     */
    public List<AgentInstanceInfo> getAgentInstances() {
        return agentInstances;
    }

    public void setAgentInstances(List<AgentInstanceInfo> agentInstances) {
        this.agentInstances = agentInstances;
    }

    public ListAgentInstancesResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 100000
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
        ListAgentInstancesResponse that = (ListAgentInstancesResponse) obj;
        return Objects.equals(this.agentInstances, that.agentInstances)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentInstances, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInstancesResponse {\n");
        sb.append("    agentInstances: ").append(toIndentedString(agentInstances)).append("\n");
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
