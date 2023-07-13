package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReduceInstanceNodeRequestBody
 */
public class ReduceInstanceNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<String> nodeList = null;

    public ReduceInstanceNodeRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    /**
     * 删除的节点数量。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public ReduceInstanceNodeRequestBody withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ReduceInstanceNodeRequestBody addNodeListItem(String nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ReduceInstanceNodeRequestBody withNodeList(Consumer<List<String>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * 指定删除节点的ID列表。 - num与node_list必须有一个字段传值 - 如果num与node_list同时传值时，则以node_list的值为主 - 删除的节点角色不能是Primary - 如果是多AZ实例，请确保删除节点后，每个AZ至少保留一个节点
     * @return nodeList
     */
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
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
        ReduceInstanceNodeRequestBody that = (ReduceInstanceNodeRequestBody) obj;
        return Objects.equals(this.num, that.num) && Objects.equals(this.nodeList, that.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReduceInstanceNodeRequestBody {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
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
