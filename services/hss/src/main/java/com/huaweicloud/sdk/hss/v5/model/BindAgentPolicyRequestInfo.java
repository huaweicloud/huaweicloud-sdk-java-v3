package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BindAgentPolicyRequestInfo
 */
public class BindAgentPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    public BindAgentPolicyRequestInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 策略组ID **约束限制**： 必填 **取值范围**： 字符长度1-20位 **默认取值**： 不涉及 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public BindAgentPolicyRequestInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public BindAgentPolicyRequestInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public BindAgentPolicyRequestInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * **参数解释**： 智能体ID列表 **约束限制**： 必填 **取值范围**： 1-2000个策略组ID **默认取值**： 不涉及 
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindAgentPolicyRequestInfo that = (BindAgentPolicyRequestInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.agentIdList, that.agentIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, agentIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindAgentPolicyRequestInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
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
