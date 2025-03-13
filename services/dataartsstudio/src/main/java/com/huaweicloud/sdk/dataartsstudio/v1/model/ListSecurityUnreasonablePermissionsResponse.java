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
public class ListSecurityUnreasonablePermissionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unreasonable_permissions")

    private List<DiagnosePermissionDetail> unreasonablePermissions = null;

    public ListSecurityUnreasonablePermissionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 不合理权限配置总条数。
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

    public ListSecurityUnreasonablePermissionsResponse withUnreasonablePermissions(
        List<DiagnosePermissionDetail> unreasonablePermissions) {
        this.unreasonablePermissions = unreasonablePermissions;
        return this;
    }

    public ListSecurityUnreasonablePermissionsResponse addUnreasonablePermissionsItem(
        DiagnosePermissionDetail unreasonablePermissionsItem) {
        if (this.unreasonablePermissions == null) {
            this.unreasonablePermissions = new ArrayList<>();
        }
        this.unreasonablePermissions.add(unreasonablePermissionsItem);
        return this;
    }

    public ListSecurityUnreasonablePermissionsResponse withUnreasonablePermissions(
        Consumer<List<DiagnosePermissionDetail>> unreasonablePermissionsSetter) {
        if (this.unreasonablePermissions == null) {
            this.unreasonablePermissions = new ArrayList<>();
        }
        unreasonablePermissionsSetter.accept(this.unreasonablePermissions);
        return this;
    }

    /**
     * 不合理权限配置列表。
     * @return unreasonablePermissions
     */
    public List<DiagnosePermissionDetail> getUnreasonablePermissions() {
        return unreasonablePermissions;
    }

    public void setUnreasonablePermissions(List<DiagnosePermissionDetail> unreasonablePermissions) {
        this.unreasonablePermissions = unreasonablePermissions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityUnreasonablePermissionsResponse that = (ListSecurityUnreasonablePermissionsResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.unreasonablePermissions, that.unreasonablePermissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, unreasonablePermissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityUnreasonablePermissionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    unreasonablePermissions: ").append(toIndentedString(unreasonablePermissions)).append("\n");
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
