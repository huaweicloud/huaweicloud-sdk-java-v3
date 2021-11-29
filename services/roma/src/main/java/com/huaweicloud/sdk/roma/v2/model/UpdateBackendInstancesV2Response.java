package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class UpdateBackendInstancesV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Integer size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<VpcMemberInfo> members = null;

    public UpdateBackendInstancesV2Response withSize(Integer size) {
        this.size = size;
        return this;
    }

    /** 本次返回的列表长度
     * 
     * @return size */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public UpdateBackendInstancesV2Response withTotal(Long total) {
        this.total = total;
        return this;
    }

    /** 满足条件的记录数
     * 
     * @return total */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public UpdateBackendInstancesV2Response withMembers(List<VpcMemberInfo> members) {
        this.members = members;
        return this;
    }

    public UpdateBackendInstancesV2Response addMembersItem(VpcMemberInfo membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public UpdateBackendInstancesV2Response withMembers(Consumer<List<VpcMemberInfo>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /** 本次查询到的云服务器列表
     * 
     * @return members */
    public List<VpcMemberInfo> getMembers() {
        return members;
    }

    public void setMembers(List<VpcMemberInfo> members) {
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
        UpdateBackendInstancesV2Response updateBackendInstancesV2Response = (UpdateBackendInstancesV2Response) o;
        return Objects.equals(this.size, updateBackendInstancesV2Response.size)
            && Objects.equals(this.total, updateBackendInstancesV2Response.total)
            && Objects.equals(this.members, updateBackendInstancesV2Response.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, total, members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackendInstancesV2Response {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
