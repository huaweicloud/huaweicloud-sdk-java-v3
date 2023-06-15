package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 角色权限信息
 */
public class RoleAuthority {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "right_list")

    private List<String> rightList = null;

    public RoleAuthority withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * 角色名称
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public RoleAuthority withRightList(List<String> rightList) {
        this.rightList = rightList;
        return this;
    }

    public RoleAuthority addRightListItem(String rightListItem) {
        if (this.rightList == null) {
            this.rightList = new ArrayList<>();
        }
        this.rightList.add(rightListItem);
        return this;
    }

    public RoleAuthority withRightList(Consumer<List<String>> rightListSetter) {
        if (this.rightList == null) {
            this.rightList = new ArrayList<>();
        }
        rightListSetter.accept(this.rightList);
        return this;
    }

    /**
     * 权限列表
     * @return rightList
     */
    public List<String> getRightList() {
        return rightList;
    }

    public void setRightList(List<String> rightList) {
        this.rightList = rightList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RoleAuthority roleAuthority = (RoleAuthority) o;
        return Objects.equals(this.role, roleAuthority.role) && Objects.equals(this.rightList, roleAuthority.rightList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role, rightList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleAuthority {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    rightList: ").append(toIndentedString(rightList)).append("\n");
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
