package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** VpcMemberModify */
public class VpcMemberModify {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberInfo> members = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    public VpcMemberModify withMembers(List<MemberInfo> members) {
        this.members = members;
        return this;
    }

    public VpcMemberModify addMembersItem(MemberInfo membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public VpcMemberModify withMembers(Consumer<List<MemberInfo>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /** 后端实例列表
     * 
     * @return members */
    public List<MemberInfo> getMembers() {
        return members;
    }

    public void setMembers(List<MemberInfo> members) {
        this.members = members;
    }

    public VpcMemberModify withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /** 需要修改的后端服务器组 不传时使用members中的定义对VPC通道后端进行全量覆盖修改。
     * 传入时，只对members中对应后端服务器组的后端实例进行处理，其他后端服务器组的入参会被忽略。例如：member_group_name=primary时，只处理members中后端服务器组为105c6902457144a4820dff8b1ad63331的后端实例。
     * 
     * @return memberGroupName */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcMemberModify vpcMemberModify = (VpcMemberModify) o;
        return Objects.equals(this.members, vpcMemberModify.members)
            && Objects.equals(this.memberGroupName, vpcMemberModify.memberGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members, memberGroupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcMemberModify {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
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
