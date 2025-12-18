package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BackupNodeInfoResult
 */
public class BackupNodeInfoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_list")

    private String azList;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private String nodeList;

    public BackupNodeInfoResult withAzList(String azList) {
        this.azList = azList;
        return this;
    }

    /**
     * **参数解释**: 选择指定az下的节点进行备份。 **取值范围**: 不涉及。
     * @return azList
     */
    public String getAzList() {
        return azList;
    }

    public void setAzList(String azList) {
        this.azList = azList;
    }

    public BackupNodeInfoResult withNodeList(String nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    /**
     * **参数解释**: 选择指定节点进行备份。 **取值范围**: 不涉及。
     * @return nodeList
     */
    public String getNodeList() {
        return nodeList;
    }

    public void setNodeList(String nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BackupNodeInfoResult that = (BackupNodeInfoResult) obj;
        return Objects.equals(this.azList, that.azList) && Objects.equals(this.nodeList, that.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(azList, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BackupNodeInfoResult {\n");
        sb.append("    azList: ").append(toIndentedString(azList)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
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
