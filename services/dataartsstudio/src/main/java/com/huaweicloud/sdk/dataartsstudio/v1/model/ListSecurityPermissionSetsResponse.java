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
public class ListSecurityPermissionSetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_sets")

    private List<PermissionSet> permissionSets = null;

    public ListSecurityPermissionSetsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSecurityPermissionSetsResponse withPermissionSets(List<PermissionSet> permissionSets) {
        this.permissionSets = permissionSets;
        return this;
    }

    public ListSecurityPermissionSetsResponse addPermissionSetsItem(PermissionSet permissionSetsItem) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        this.permissionSets.add(permissionSetsItem);
        return this;
    }

    public ListSecurityPermissionSetsResponse withPermissionSets(Consumer<List<PermissionSet>> permissionSetsSetter) {
        if (this.permissionSets == null) {
            this.permissionSets = new ArrayList<>();
        }
        permissionSetsSetter.accept(this.permissionSets);
        return this;
    }

    /**
     * 权限集列表
     * @return permissionSets
     */
    public List<PermissionSet> getPermissionSets() {
        return permissionSets;
    }

    public void setPermissionSets(List<PermissionSet> permissionSets) {
        this.permissionSets = permissionSets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityPermissionSetsResponse that = (ListSecurityPermissionSetsResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.permissionSets, that.permissionSets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, permissionSets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPermissionSetsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    permissionSets: ").append(toIndentedString(permissionSets)).append("\n");
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
