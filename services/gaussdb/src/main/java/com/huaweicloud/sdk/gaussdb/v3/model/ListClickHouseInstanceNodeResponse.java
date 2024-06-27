package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListClickHouseInstanceNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<ClickHouseNodeInfoResponseBodyNodeList> nodeList = null;

    public ListClickHouseInstanceNodeResponse withNodeList(List<ClickHouseNodeInfoResponseBodyNodeList> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ListClickHouseInstanceNodeResponse addNodeListItem(ClickHouseNodeInfoResponseBodyNodeList nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ListClickHouseInstanceNodeResponse withNodeList(
        Consumer<List<ClickHouseNodeInfoResponseBodyNodeList>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * ClickHouse实例节点列表。
     * @return nodeList
     */
    public List<ClickHouseNodeInfoResponseBodyNodeList> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<ClickHouseNodeInfoResponseBodyNodeList> nodeList) {
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
        ListClickHouseInstanceNodeResponse that = (ListClickHouseInstanceNodeResponse) obj;
        return Objects.equals(this.nodeList, that.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClickHouseInstanceNodeResponse {\n");
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
