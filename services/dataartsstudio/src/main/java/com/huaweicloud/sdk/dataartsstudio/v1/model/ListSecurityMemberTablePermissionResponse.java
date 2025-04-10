package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSecurityMemberTablePermissionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_permission_list")

    private List<MemberPermission> memberPermissionList = null;

    public ListSecurityMemberTablePermissionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 权限总数
     * minimum: 0
     * maximum: 65535
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSecurityMemberTablePermissionResponse withMemberPermissionList(
        List<MemberPermission> memberPermissionList) {
        this.memberPermissionList = memberPermissionList;
        return this;
    }

    public ListSecurityMemberTablePermissionResponse addMemberPermissionListItem(
        MemberPermission memberPermissionListItem) {
        if (this.memberPermissionList == null) {
            this.memberPermissionList = new ArrayList<>();
        }
        this.memberPermissionList.add(memberPermissionListItem);
        return this;
    }

    public ListSecurityMemberTablePermissionResponse withMemberPermissionList(
        Consumer<List<MemberPermission>> memberPermissionListSetter) {
        if (this.memberPermissionList == null) {
            this.memberPermissionList = new ArrayList<>();
        }
        memberPermissionListSetter.accept(this.memberPermissionList);
        return this;
    }

    /**
     * 成员权限列表（包含权限集的和权限审批）
     * @return memberPermissionList
     */
    public List<MemberPermission> getMemberPermissionList() {
        return memberPermissionList;
    }

    public void setMemberPermissionList(List<MemberPermission> memberPermissionList) {
        this.memberPermissionList = memberPermissionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityMemberTablePermissionResponse that = (ListSecurityMemberTablePermissionResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.memberPermissionList, that.memberPermissionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, memberPermissionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityMemberTablePermissionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    memberPermissionList: ").append(toIndentedString(memberPermissionList)).append("\n");
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
