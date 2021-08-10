package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NodePublicIP {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    private NodeEIPSpec eip;

    public NodePublicIP withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public NodePublicIP addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public NodePublicIP withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /** 已有的弹性IP的ID列表。数量不得大于待创建节点数 > 若已配置ids参数，则无需配置count和eip参数
     * 
     * @return ids */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public NodePublicIP withCount(Integer count) {
        this.count = count;
        return this;
    }

    /** 要动态创建的弹性IP个数。 > count参数与eip参数必须同时配置。
     * 
     * @return count */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public NodePublicIP withEip(NodeEIPSpec eip) {
        this.eip = eip;
        return this;
    }

    public NodePublicIP withEip(Consumer<NodeEIPSpec> eipSetter) {
        if (this.eip == null) {
            this.eip = new NodeEIPSpec();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /** Get eip
     * 
     * @return eip */
    public NodeEIPSpec getEip() {
        return eip;
    }

    public void setEip(NodeEIPSpec eip) {
        this.eip = eip;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodePublicIP nodePublicIP = (NodePublicIP) o;
        return Objects.equals(this.ids, nodePublicIP.ids) && Objects.equals(this.count, nodePublicIP.count)
            && Objects.equals(this.eip, nodePublicIP.eip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ids, count, eip);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePublicIP {\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
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
