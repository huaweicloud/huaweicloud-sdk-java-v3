package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MemberGroupCreate
 */
public class MemberGroupCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_remark")

    private String memberGroupRemark;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_weight")

    private Integer memberGroupWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dict_code")

    private String dictCode;

    public MemberGroupCreate withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /**
     * VPC通道后端服务器组名称
     * @return memberGroupName
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public MemberGroupCreate withMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
        return this;
    }

    /**
     * VPC通道后端服务器组描述
     * @return memberGroupRemark
     */
    public String getMemberGroupRemark() {
        return memberGroupRemark;
    }

    public void setMemberGroupRemark(String memberGroupRemark) {
        this.memberGroupRemark = memberGroupRemark;
    }

    public MemberGroupCreate withMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
        return this;
    }

    /**
     * VPC通道后端服务器组权重值。  当前服务器组存在服务器且此权重值存在时，自动使用此权重值分配权重。
     * minimum: 0
     * maximum: 100
     * @return memberGroupWeight
     */
    public Integer getMemberGroupWeight() {
        return memberGroupWeight;
    }

    public void setMemberGroupWeight(Integer memberGroupWeight) {
        this.memberGroupWeight = memberGroupWeight;
    }

    public MemberGroupCreate withDictCode(String dictCode) {
        this.dictCode = dictCode;
        return this;
    }

    /**
     * VPC通道后端服务器组的字典编码  支持英文，数字，特殊字符（-_.）  暂不支持
     * @return dictCode
     */
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberGroupCreate that = (MemberGroupCreate) obj;
        return Objects.equals(this.memberGroupName, that.memberGroupName)
            && Objects.equals(this.memberGroupRemark, that.memberGroupRemark)
            && Objects.equals(this.memberGroupWeight, that.memberGroupWeight)
            && Objects.equals(this.dictCode, that.dictCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberGroupName, memberGroupRemark, memberGroupWeight, dictCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupCreate {\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    memberGroupRemark: ").append(toIndentedString(memberGroupRemark)).append("\n");
        sb.append("    memberGroupWeight: ").append(toIndentedString(memberGroupWeight)).append("\n");
        sb.append("    dictCode: ").append(toIndentedString(dictCode)).append("\n");
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
