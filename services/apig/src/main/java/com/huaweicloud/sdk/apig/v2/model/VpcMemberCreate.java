package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** VpcMemberCreate */
public class VpcMemberCreate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<MemberInfo> members = null;

    public VpcMemberCreate withMembers(List<MemberInfo> members) {
        this.members = members;
        return this;
    }

    public VpcMemberCreate addMembersItem(MemberInfo membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public VpcMemberCreate withMembers(Consumer<List<MemberInfo>> membersSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcMemberCreate vpcMemberCreate = (VpcMemberCreate) o;
        return Objects.equals(this.members, vpcMemberCreate.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcMemberCreate {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
