package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建离线全量key分析请求体
 */
public class CreateOfflineKeyAnalysisRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_id")

    private String backupId;

    public CreateOfflineKeyAnalysisRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： 实例节点ID，可通过DCS控制台进入实例的节点管理界面查看。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public CreateOfflineKeyAnalysisRequestBody withBackupId(String backupId) {
        this.backupId = backupId;
        return this;
    }

    /**
     * **参数解释**： 实例备份ID，可通过DCS控制台进入实例的备份与恢复界面查看。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return backupId
     */
    public String getBackupId() {
        return backupId;
    }

    public void setBackupId(String backupId) {
        this.backupId = backupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOfflineKeyAnalysisRequestBody that = (CreateOfflineKeyAnalysisRequestBody) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.backupId, that.backupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, backupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOfflineKeyAnalysisRequestBody {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
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
