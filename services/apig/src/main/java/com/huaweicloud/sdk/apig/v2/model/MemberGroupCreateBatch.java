package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MemberGroupCreateBatch
 */
public class MemberGroupCreateBatch {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_groups")

    private List<MemberGroupCreate> memberGroups = null;

    public MemberGroupCreateBatch withMemberGroups(List<MemberGroupCreate> memberGroups) {
        this.memberGroups = memberGroups;
        return this;
    }

    public MemberGroupCreateBatch addMemberGroupsItem(MemberGroupCreate memberGroupsItem) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        this.memberGroups.add(memberGroupsItem);
        return this;
    }

    public MemberGroupCreateBatch withMemberGroups(Consumer<List<MemberGroupCreate>> memberGroupsSetter) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        memberGroupsSetter.accept(this.memberGroups);
        return this;
    }

    /**
     * 后端服务器组列表
     * @return memberGroups
     */
    public List<MemberGroupCreate> getMemberGroups() {
        return memberGroups;
    }

    public void setMemberGroups(List<MemberGroupCreate> memberGroups) {
        this.memberGroups = memberGroups;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberGroupCreateBatch memberGroupCreateBatch = (MemberGroupCreateBatch) o;
        return Objects.equals(this.memberGroups, memberGroupCreateBatch.memberGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberGroupCreateBatch {\n");
        sb.append("    memberGroups: ").append(toIndentedString(memberGroups)).append("\n");
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
