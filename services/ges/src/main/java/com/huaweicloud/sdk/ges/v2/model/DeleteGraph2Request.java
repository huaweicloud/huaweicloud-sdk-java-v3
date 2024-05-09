package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteGraph2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_id")

    private String graphId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_backup")

    private Boolean keepBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delete_eip")

    private Boolean deleteEip;

    public DeleteGraph2Request withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    /**
     * 图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    public DeleteGraph2Request withKeepBackup(Boolean keepBackup) {
        this.keepBackup = keepBackup;
        return this;
    }

    /**
     * 删除图后是否保留备份，默认保留1个自动备份和2个手动备份。该查询参数为空时，表示不保留。
     * @return keepBackup
     */
    public Boolean getKeepBackup() {
        return keepBackup;
    }

    public void setKeepBackup(Boolean keepBackup) {
        this.keepBackup = keepBackup;
    }

    public DeleteGraph2Request withDeleteEip(Boolean deleteEip) {
        this.deleteEip = deleteEip;
        return this;
    }

    /**
     * 是否同时删除EIP。
     * @return deleteEip
     */
    public Boolean getDeleteEip() {
        return deleteEip;
    }

    public void setDeleteEip(Boolean deleteEip) {
        this.deleteEip = deleteEip;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteGraph2Request that = (DeleteGraph2Request) obj;
        return Objects.equals(this.graphId, that.graphId) && Objects.equals(this.keepBackup, that.keepBackup)
            && Objects.equals(this.deleteEip, that.deleteEip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(graphId, keepBackup, deleteEip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteGraph2Request {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
        sb.append("    keepBackup: ").append(toIndentedString(keepBackup)).append("\n");
        sb.append("    deleteEip: ").append(toIndentedString(deleteEip)).append("\n");
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
