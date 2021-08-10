package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ShrinkInstanceNodeRequestBody */
public class ShrinkInstanceNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private Integer num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_list")

    private List<String> nodeList = null;

    public ShrinkInstanceNodeRequestBody withNum(Integer num) {
        this.num = num;
        return this;
    }

    /** 随机缩减的节点数量。该字段取值为1。说明：如果客户端采用直连节点方式，不推荐使用随机节点缩容。
     * 
     * @return num */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public ShrinkInstanceNodeRequestBody withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public ShrinkInstanceNodeRequestBody addNodeListItem(String nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public ShrinkInstanceNodeRequestBody withNodeList(Consumer<List<String>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /** 指定缩容节点的ID，且该节点必须支持节点缩容。如果该字段不传指定缩减的节点ID，将根据系统内部策略缩减指定个数的节点。说明： - num与node_list必须有一个字段传值。 - 如果num传值时，取值必须为1。 -
     * 如果node_list传值时，其长度必须为1。 - 如果num与node_list同时传值时，则以node_list的值为主。 -
     * 如果node_list取值为空时，缩容以随机节点缩容进行；node_list字段取值不为空，缩容以指定节点ID进行。 - 节点缩容前，请避免直连节点，以防该节点缩容导致业务中断。
     * 
     * @return nodeList */
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShrinkInstanceNodeRequestBody shrinkInstanceNodeRequestBody = (ShrinkInstanceNodeRequestBody) o;
        return Objects.equals(this.num, shrinkInstanceNodeRequestBody.num)
            && Objects.equals(this.nodeList, shrinkInstanceNodeRequestBody.nodeList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, nodeList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShrinkInstanceNodeRequestBody {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
