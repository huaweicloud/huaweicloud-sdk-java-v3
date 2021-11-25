package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListServicePermissionsDetailsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private List<Permission> permissions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListServicePermissionsDetailsResponse withPermissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public ListServicePermissionsDetailsResponse addPermissionsItem(Permission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    public ListServicePermissionsDetailsResponse withPermissions(Consumer<List<Permission>> permissionsSetter) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        permissionsSetter.accept(this.permissions);
        return this;
    }

    /** permission列表。
     * 
     * @return permissions */
    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public ListServicePermissionsDetailsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /** 满足查询条件的终端节点服务的白名单总条数，不受分页（即limit、offset参数）影响。
     * 
     * @return totalCount */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListServicePermissionsDetailsResponse listServicePermissionsDetailsResponse =
            (ListServicePermissionsDetailsResponse) o;
        return Objects.equals(this.permissions, listServicePermissionsDetailsResponse.permissions)
            && Objects.equals(this.totalCount, listServicePermissionsDetailsResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServicePermissionsDetailsResponse {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
