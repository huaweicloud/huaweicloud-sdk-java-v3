package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpcAndSubNet
 */
public class VpcAndSubNet {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id_list")

    private List<String> subnetIdList = null;

    public VpcAndSubNet withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * **参数解释** Vpc标识ID **约束限制**: 不涉及 **取值范围** 字符长度1-256位 **默认取值**: 不涉及 
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public VpcAndSubNet withSubnetIdList(List<String> subnetIdList) {
        this.subnetIdList = subnetIdList;
        return this;
    }

    public VpcAndSubNet addSubnetIdListItem(String subnetIdListItem) {
        if (this.subnetIdList == null) {
            this.subnetIdList = new ArrayList<>();
        }
        this.subnetIdList.add(subnetIdListItem);
        return this;
    }

    public VpcAndSubNet withSubnetIdList(Consumer<List<String>> subnetIdListSetter) {
        if (this.subnetIdList == null) {
            this.subnetIdList = new ArrayList<>();
        }
        subnetIdListSetter.accept(this.subnetIdList);
        return this;
    }

    /**
     * **参数解释** 子网id的列表 **约束限制**: 不涉及 
     * @return subnetIdList
     */
    public List<String> getSubnetIdList() {
        return subnetIdList;
    }

    public void setSubnetIdList(List<String> subnetIdList) {
        this.subnetIdList = subnetIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VpcAndSubNet that = (VpcAndSubNet) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.subnetIdList, that.subnetIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, subnetIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcAndSubNet {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetIdList: ").append(toIndentedString(subnetIdList)).append("\n");
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
