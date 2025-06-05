package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class ShowKeystorePermissionResponseBodyResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_list")

    private List<AddKeystorePermissionResponseBody> permissionList = null;

    public ShowKeystorePermissionResponseBodyResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ShowKeystorePermissionResponseBodyResult withPermissionList(
        List<AddKeystorePermissionResponseBody> permissionList) {
        this.permissionList = permissionList;
        return this;
    }

    public ShowKeystorePermissionResponseBodyResult addPermissionListItem(
        AddKeystorePermissionResponseBody permissionListItem) {
        if (this.permissionList == null) {
            this.permissionList = new ArrayList<>();
        }
        this.permissionList.add(permissionListItem);
        return this;
    }

    public ShowKeystorePermissionResponseBodyResult withPermissionList(
        Consumer<List<AddKeystorePermissionResponseBody>> permissionListSetter) {
        if (this.permissionList == null) {
            this.permissionList = new ArrayList<>();
        }
        permissionListSetter.accept(this.permissionList);
        return this;
    }

    /**
     * 权限结集合
     * @return permissionList
     */
    public List<AddKeystorePermissionResponseBody> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<AddKeystorePermissionResponseBody> permissionList) {
        this.permissionList = permissionList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowKeystorePermissionResponseBodyResult that = (ShowKeystorePermissionResponseBodyResult) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.permissionList, that.permissionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, permissionList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowKeystorePermissionResponseBodyResult {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    permissionList: ").append(toIndentedString(permissionList)).append("\n");
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
