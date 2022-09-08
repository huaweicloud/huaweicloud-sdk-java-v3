package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceSpc
 */
public class InstanceSpc {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "org_peer_max_num")

    private Long orgPeerMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "orderer_max_num")

    private Long ordererMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_max_num")

    private Integer memberMaxNum;

    public InstanceSpc withOrgPeerMaxNum(Long orgPeerMaxNum) {
        this.orgPeerMaxNum = orgPeerMaxNum;
        return this;
    }

    /**
     * 单个组织支持的最大peer节点数量
     * @return orgPeerMaxNum
     */
    public Long getOrgPeerMaxNum() {
        return orgPeerMaxNum;
    }

    public void setOrgPeerMaxNum(Long orgPeerMaxNum) {
        this.orgPeerMaxNum = orgPeerMaxNum;
    }

    public InstanceSpc withOrdererMaxNum(Long ordererMaxNum) {
        this.ordererMaxNum = ordererMaxNum;
        return this;
    }

    /**
     * 单个联盟链支持的最大order节点数量
     * @return ordererMaxNum
     */
    public Long getOrdererMaxNum() {
        return ordererMaxNum;
    }

    public void setOrdererMaxNum(Long ordererMaxNum) {
        this.ordererMaxNum = ordererMaxNum;
    }

    public InstanceSpc withMemberMaxNum(Integer memberMaxNum) {
        this.memberMaxNum = memberMaxNum;
        return this;
    }

    /**
     * 单个联盟链支持的最大租户数量
     * @return memberMaxNum
     */
    public Integer getMemberMaxNum() {
        return memberMaxNum;
    }

    public void setMemberMaxNum(Integer memberMaxNum) {
        this.memberMaxNum = memberMaxNum;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstanceSpc instanceSpc = (InstanceSpc) o;
        return Objects.equals(this.orgPeerMaxNum, instanceSpc.orgPeerMaxNum)
            && Objects.equals(this.ordererMaxNum, instanceSpc.ordererMaxNum)
            && Objects.equals(this.memberMaxNum, instanceSpc.memberMaxNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orgPeerMaxNum, ordererMaxNum, memberMaxNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceSpc {\n");
        sb.append("    orgPeerMaxNum: ").append(toIndentedString(orgPeerMaxNum)).append("\n");
        sb.append("    ordererMaxNum: ").append(toIndentedString(ordererMaxNum)).append("\n");
        sb.append("    memberMaxNum: ").append(toIndentedString(memberMaxNum)).append("\n");
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
