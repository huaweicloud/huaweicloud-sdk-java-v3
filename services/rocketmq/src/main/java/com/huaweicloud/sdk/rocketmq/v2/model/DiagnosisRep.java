package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DiagnosisRep
 */
public class DiagnosisRep {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_list")

    private List<String> nodeIdList = null;

    public DiagnosisRep withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 消费组名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public DiagnosisRep withNodeIdList(List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }

    public DiagnosisRep addNodeIdListItem(String nodeIdListItem) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        this.nodeIdList.add(nodeIdListItem);
        return this;
    }

    public DiagnosisRep withNodeIdList(Consumer<List<String>> nodeIdListSetter) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        nodeIdListSetter.accept(this.nodeIdList);
        return this;
    }

    /**
     * **参数解释**： 节点ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return nodeIdList
     */
    public List<String> getNodeIdList() {
        return nodeIdList;
    }

    public void setNodeIdList(List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DiagnosisRep that = (DiagnosisRep) obj;
        return Objects.equals(this.groupName, that.groupName) && Objects.equals(this.nodeIdList, that.nodeIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupName, nodeIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiagnosisRep {\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    nodeIdList: ").append(toIndentedString(nodeIdList)).append("\n");
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
