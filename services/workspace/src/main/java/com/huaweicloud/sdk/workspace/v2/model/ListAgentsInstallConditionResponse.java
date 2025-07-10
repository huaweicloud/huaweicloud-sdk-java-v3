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
public class ListAgentsInstallConditionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agents_condition")

    private List<AgentsCondition> agentsCondition = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListAgentsInstallConditionResponse withAgentsCondition(List<AgentsCondition> agentsCondition) {
        this.agentsCondition = agentsCondition;
        return this;
    }

    public ListAgentsInstallConditionResponse addAgentsConditionItem(AgentsCondition agentsConditionItem) {
        if (this.agentsCondition == null) {
            this.agentsCondition = new ArrayList<>();
        }
        this.agentsCondition.add(agentsConditionItem);
        return this;
    }

    public ListAgentsInstallConditionResponse withAgentsCondition(
        Consumer<List<AgentsCondition>> agentsConditionSetter) {
        if (this.agentsCondition == null) {
            this.agentsCondition = new ArrayList<>();
        }
        agentsConditionSetter.accept(this.agentsCondition);
        return this;
    }

    /**
     * 桌面agent安装情况。
     * @return agentsCondition
     */
    public List<AgentsCondition> getAgentsCondition() {
        return agentsCondition;
    }

    public void setAgentsCondition(List<AgentsCondition> agentsCondition) {
        this.agentsCondition = agentsCondition;
    }

    public ListAgentsInstallConditionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总共条数。
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
        ListAgentsInstallConditionResponse that = (ListAgentsInstallConditionResponse) obj;
        return Objects.equals(this.agentsCondition, that.agentsCondition)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentsCondition, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentsInstallConditionResponse {\n");
        sb.append("    agentsCondition: ").append(toIndentedString(agentsCondition)).append("\n");
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
