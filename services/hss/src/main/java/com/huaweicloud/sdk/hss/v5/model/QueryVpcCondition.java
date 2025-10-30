package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryVpcCondition
 */
public class QueryVpcCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id_list")

    private List<String> hostIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id_list")

    private List<String> vpcIdList = null;

    public QueryVpcCondition withHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
        return this;
    }

    public QueryVpcCondition addHostIdListItem(String hostIdListItem) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        this.hostIdList.add(hostIdListItem);
        return this;
    }

    public QueryVpcCondition withHostIdList(Consumer<List<String>> hostIdListSetter) {
        if (this.hostIdList == null) {
            this.hostIdList = new ArrayList<>();
        }
        hostIdListSetter.accept(this.hostIdList);
        return this;
    }

    /**
     * **参数解释**: 主机id列表 **取值范围**: 字符长度1-64位 
     * @return hostIdList
     */
    public List<String> getHostIdList() {
        return hostIdList;
    }

    public void setHostIdList(List<String> hostIdList) {
        this.hostIdList = hostIdList;
    }

    public QueryVpcCondition withVpcIdList(List<String> vpcIdList) {
        this.vpcIdList = vpcIdList;
        return this;
    }

    public QueryVpcCondition addVpcIdListItem(String vpcIdListItem) {
        if (this.vpcIdList == null) {
            this.vpcIdList = new ArrayList<>();
        }
        this.vpcIdList.add(vpcIdListItem);
        return this;
    }

    public QueryVpcCondition withVpcIdList(Consumer<List<String>> vpcIdListSetter) {
        if (this.vpcIdList == null) {
            this.vpcIdList = new ArrayList<>();
        }
        vpcIdListSetter.accept(this.vpcIdList);
        return this;
    }

    /**
     * **参数解释**: VpcId列表 **取值范围**: 字符长度1-64位 
     * @return vpcIdList
     */
    public List<String> getVpcIdList() {
        return vpcIdList;
    }

    public void setVpcIdList(List<String> vpcIdList) {
        this.vpcIdList = vpcIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryVpcCondition that = (QueryVpcCondition) obj;
        return Objects.equals(this.hostIdList, that.hostIdList) && Objects.equals(this.vpcIdList, that.vpcIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIdList, vpcIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryVpcCondition {\n");
        sb.append("    hostIdList: ").append(toIndentedString(hostIdList)).append("\n");
        sb.append("    vpcIdList: ").append(toIndentedString(vpcIdList)).append("\n");
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
