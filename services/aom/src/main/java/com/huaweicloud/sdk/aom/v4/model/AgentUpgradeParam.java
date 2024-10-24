package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgentUpgradeParam
 */
public class AgentUpgradeParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_list")

    private List<SingleAgentParam> agentList = null;

    public AgentUpgradeParam withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * UniAgent升级的版本号。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AgentUpgradeParam withAgentList(List<SingleAgentParam> agentList) {
        this.agentList = agentList;
        return this;
    }

    public AgentUpgradeParam addAgentListItem(SingleAgentParam agentListItem) {
        if (this.agentList == null) {
            this.agentList = new ArrayList<>();
        }
        this.agentList.add(agentListItem);
        return this;
    }

    public AgentUpgradeParam withAgentList(Consumer<List<SingleAgentParam>> agentListSetter) {
        if (this.agentList == null) {
            this.agentList = new ArrayList<>();
        }
        agentListSetter.accept(this.agentList);
        return this;
    }

    /**
     * UniAgent主机列表信息。
     * @return agentList
     */
    public List<SingleAgentParam> getAgentList() {
        return agentList;
    }

    public void setAgentList(List<SingleAgentParam> agentList) {
        this.agentList = agentList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentUpgradeParam that = (AgentUpgradeParam) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.agentList, that.agentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, agentList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentUpgradeParam {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agentList: ").append(toIndentedString(agentList)).append("\n");
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
