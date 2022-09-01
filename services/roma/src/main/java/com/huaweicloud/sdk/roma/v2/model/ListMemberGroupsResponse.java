package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListMemberGroupsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_groups")

    @JacksonXmlProperty(localName = "member_groups")

    private List<MemberGroupInfo> memberGroups = null;

    public ListMemberGroupsResponse withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 本次返回的列表长度
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ListMemberGroupsResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 满足条件的记录数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public ListMemberGroupsResponse withMemberGroups(List<MemberGroupInfo> memberGroups) {
        this.memberGroups = memberGroups;
        return this;
    }

    public ListMemberGroupsResponse addMemberGroupsItem(MemberGroupInfo memberGroupsItem) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        this.memberGroups.add(memberGroupsItem);
        return this;
    }

    public ListMemberGroupsResponse withMemberGroups(Consumer<List<MemberGroupInfo>> memberGroupsSetter) {
        if (this.memberGroups == null) {
            this.memberGroups = new ArrayList<>();
        }
        memberGroupsSetter.accept(this.memberGroups);
        return this;
    }

    /**
     * VPC通道后端服务器组列表
     * @return memberGroups
     */
    public List<MemberGroupInfo> getMemberGroups() {
        return memberGroups;
    }

    public void setMemberGroups(List<MemberGroupInfo> memberGroups) {
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
        ListMemberGroupsResponse listMemberGroupsResponse = (ListMemberGroupsResponse) o;
        return Objects.equals(this.size, listMemberGroupsResponse.size)
            && Objects.equals(this.total, listMemberGroupsResponse.total)
            && Objects.equals(this.memberGroups, listMemberGroupsResponse.memberGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, memberGroups);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMemberGroupsResponse {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
