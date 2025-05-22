package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 主网卡的描述信息。 **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class NodeSpecUpdateNodeNicSpecUpdatePrimaryNic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetId")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetList")

    private List<String> subnetList = null;

    public NodeSpecUpdateNodeNicSpecUpdatePrimaryNic withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * **参数解释**： 网卡所在子网的网络ID。 **约束限制**： 主网卡创建时若未指定subnetId,将使用集群子网。若节点池同时配置了subnetList，则节点池扩容子网以subnetList字段为准。扩展网卡创建时必须指定subnetId。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NodeSpecUpdateNodeNicSpecUpdatePrimaryNic withSubnetList(List<String> subnetList) {
        this.subnetList = subnetList;
        return this;
    }

    public NodeSpecUpdateNodeNicSpecUpdatePrimaryNic addSubnetListItem(String subnetListItem) {
        if (this.subnetList == null) {
            this.subnetList = new ArrayList<>();
        }
        this.subnetList.add(subnetListItem);
        return this;
    }

    public NodeSpecUpdateNodeNicSpecUpdatePrimaryNic withSubnetList(Consumer<List<String>> subnetListSetter) {
        if (this.subnetList == null) {
            this.subnetList = new ArrayList<>();
        }
        subnetListSetter.accept(this.subnetList);
        return this;
    }

    /**
     * **参数解释**： 网卡所在子网的网络ID列表，支持节点池配置多个子网。 **约束限制**： 最多支持配置20个子网。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return subnetList
     */
    public List<String> getSubnetList() {
        return subnetList;
    }

    public void setSubnetList(List<String> subnetList) {
        this.subnetList = subnetList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeSpecUpdateNodeNicSpecUpdatePrimaryNic that = (NodeSpecUpdateNodeNicSpecUpdatePrimaryNic) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.subnetList, that.subnetList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, subnetList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeSpecUpdateNodeNicSpecUpdatePrimaryNic {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    subnetList: ").append(toIndentedString(subnetList)).append("\n");
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
