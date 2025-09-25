package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReduceCnRequestBody
 */
public class ReduceCnRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id_list")

    private List<String> nodeIdList = null;

    public ReduceCnRequestBody withNodeIdList(List<String> nodeIdList) {
        this.nodeIdList = nodeIdList;
        return this;
    }

    public ReduceCnRequestBody addNodeIdListItem(String nodeIdListItem) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        this.nodeIdList.add(nodeIdListItem);
        return this;
    }

    public ReduceCnRequestBody withNodeIdList(Consumer<List<String>> nodeIdListSetter) {
        if (this.nodeIdList == null) {
            this.nodeIdList = new ArrayList<>();
        }
        nodeIdListSetter.accept(this.nodeIdList);
        return this;
    }

    /**
     * **参数解释**： 缩容节点ID集合。 **约束限制**： 不涉及。
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
        ReduceCnRequestBody that = (ReduceCnRequestBody) obj;
        return Objects.equals(this.nodeIdList, that.nodeIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceCnRequestBody {\n");
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
