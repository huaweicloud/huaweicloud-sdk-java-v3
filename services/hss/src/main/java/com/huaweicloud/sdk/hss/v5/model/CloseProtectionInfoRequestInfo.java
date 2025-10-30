package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CloseProtectionInfoRequestInfo
 */
public class CloseProtectionInfoRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "close_protection_type")

    private String closeProtectionType;

    public CloseProtectionInfoRequestInfo withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public CloseProtectionInfoRequestInfo addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public CloseProtectionInfoRequestInfo withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 需要关闭勒索防护的主机ID列表，您可以通过[查询勒索防护服务器列表](ListProtectionServer.xml)接口获取HostID。 **约束限制**: 不涉及 **取值范围**: 列表条数0-64 **默认取值**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public CloseProtectionInfoRequestInfo withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public CloseProtectionInfoRequestInfo addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public CloseProtectionInfoRequestInfo withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * **参数解释**: 需要关闭勒索防护的agentID列表，您可以通过[查询勒索防护服务器列表](ListProtectionServer.xml)接口获取AgentID。 **约束限制**: 不涉及 **取值范围**: 列表条数0-64 **默认取值**: 不涉及 
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public CloseProtectionInfoRequestInfo withCloseProtectionType(String closeProtectionType) {
        this.closeProtectionType = closeProtectionType;
        return this;
    }

    /**
     * **参数解释**: 关闭防护类型 **约束限制**: 不涉及 **取值范围**: - close_anti : 关闭勒索防护；暂不支持关闭备份防护，若需要解绑存储库，请前往cbr服务进行操作。 **默认取值**: 不涉及
     * @return closeProtectionType
     */
    public String getCloseProtectionType() {
        return closeProtectionType;
    }

    public void setCloseProtectionType(String closeProtectionType) {
        this.closeProtectionType = closeProtectionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CloseProtectionInfoRequestInfo that = (CloseProtectionInfoRequestInfo) obj;
        return Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.closeProtectionType, that.closeProtectionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIdList, agentIdList, closeProtectionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CloseProtectionInfoRequestInfo {\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    closeProtectionType: ").append(toIndentedString(closeProtectionType)).append("\n");
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
