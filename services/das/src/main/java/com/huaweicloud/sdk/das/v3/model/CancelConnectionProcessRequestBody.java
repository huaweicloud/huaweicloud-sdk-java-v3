package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Kill进程请求体
 */
public class CancelConnectionProcessRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_ids")

    private List<String> processIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kill_all")

    private Boolean killAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    private String nodeRole;

    public CancelConnectionProcessRequestBody withProcessIds(List<String> processIds) {
        this.processIds = processIds;
        return this;
    }

    public CancelConnectionProcessRequestBody addProcessIdsItem(String processIdsItem) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        this.processIds.add(processIdsItem);
        return this;
    }

    public CancelConnectionProcessRequestBody withProcessIds(Consumer<List<String>> processIdsSetter) {
        if (this.processIds == null) {
            this.processIds = new ArrayList<>();
        }
        processIdsSetter.accept(this.processIds);
        return this;
    }

    /**
     * 查杀会话的ID列表
     * @return processIds
     */
    public List<String> getProcessIds() {
        return processIds;
    }

    public void setProcessIds(List<String> processIds) {
        this.processIds = processIds;
    }

    public CancelConnectionProcessRequestBody withKillAll(Boolean killAll) {
        this.killAll = killAll;
        return this;
    }

    /**
     * 是否查杀全部会话
     * @return killAll
     */
    public Boolean getKillAll() {
        return killAll;
    }

    public void setKillAll(Boolean killAll) {
        this.killAll = killAll;
    }

    public CancelConnectionProcessRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 实例节点ID，实例节点的唯一标识
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CancelConnectionProcessRequestBody withNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 实例节点类型（master：主节点，slave：副节点，readreplica：只读节点）
     * @return nodeRole
     */
    public String getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CancelConnectionProcessRequestBody that = (CancelConnectionProcessRequestBody) obj;
        return Objects.equals(this.processIds, that.processIds) && Objects.equals(this.killAll, that.killAll)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeRole, that.nodeRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processIds, killAll, nodeId, nodeRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelConnectionProcessRequestBody {\n");
        sb.append("    processIds: ").append(toIndentedString(processIds)).append("\n");
        sb.append("    killAll: ").append(toIndentedString(killAll)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
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
