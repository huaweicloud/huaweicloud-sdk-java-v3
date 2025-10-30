package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateVpcCondition
 */
public class CreateVpcCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_list")

    private List<VpcAndSubNet> vpcList = null;

    public CreateVpcCondition withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public CreateVpcCondition addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public CreateVpcCondition withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释** 主机id列表 **约束限制**: 不涉及 **取值范围** 字符长度1-256位 **默认取值**: 不涉及 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public CreateVpcCondition withVpcList(List<VpcAndSubNet> vpcList) {
        this.vpcList = vpcList;
        return this;
    }

    public CreateVpcCondition addVpcListItem(VpcAndSubNet vpcListItem) {
        if (this.vpcList == null) {
            this.vpcList = new ArrayList<>();
        }
        this.vpcList.add(vpcListItem);
        return this;
    }

    public CreateVpcCondition withVpcList(Consumer<List<VpcAndSubNet>> vpcListSetter) {
        if (this.vpcList == null) {
            this.vpcList = new ArrayList<>();
        }
        vpcListSetter.accept(this.vpcList);
        return this;
    }

    /**
     * **参数解释** vpc列表 **约束限制**: 不涉及 **取值范围** 字符长度1-256位 **默认取值**: 不涉及 
     * @return vpcList
     */
    public List<VpcAndSubNet> getVpcList() {
        return vpcList;
    }

    public void setVpcList(List<VpcAndSubNet> vpcList) {
        this.vpcList = vpcList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVpcCondition that = (CreateVpcCondition) obj;
        return Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.vpcList, that.vpcList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIdList, vpcList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVpcCondition {\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    vpcList: ").append(toIndentedString(vpcList)).append("\n");
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
