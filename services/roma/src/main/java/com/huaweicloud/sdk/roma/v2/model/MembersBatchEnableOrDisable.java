package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MembersBatchEnableOrDisable
 */
public class MembersBatchEnableOrDisable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_ids")

    private List<String> memberIds = null;

    public MembersBatchEnableOrDisable withMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
        return this;
    }

    public MembersBatchEnableOrDisable addMemberIdsItem(String memberIdsItem) {
        if (this.memberIds == null) {
            this.memberIds = new ArrayList<>();
        }
        this.memberIds.add(memberIdsItem);
        return this;
    }

    public MembersBatchEnableOrDisable withMemberIds(Consumer<List<String>> memberIdsSetter) {
        if (this.memberIds == null) {
            this.memberIds = new ArrayList<>();
        }
        memberIdsSetter.accept(this.memberIds);
        return this;
    }

    /**
     * 后端服务器编号列表。
     * @return memberIds
     */
    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MembersBatchEnableOrDisable membersBatchEnableOrDisable = (MembersBatchEnableOrDisable) o;
        return Objects.equals(this.memberIds, membersBatchEnableOrDisable.memberIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memberIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MembersBatchEnableOrDisable {\n");
        sb.append("    memberIds: ").append(toIndentedString(memberIds)).append("\n");
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
