package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 对象权限信息
 */
public class ObjectAuthority {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role_authority")

    private List<RoleAuthority> roleAuthority = null;

    public ObjectAuthority withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 对象名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ObjectAuthority withRoleAuthority(List<RoleAuthority> roleAuthority) {
        this.roleAuthority = roleAuthority;
        return this;
    }

    public ObjectAuthority addRoleAuthorityItem(RoleAuthority roleAuthorityItem) {
        if (this.roleAuthority == null) {
            this.roleAuthority = new ArrayList<>();
        }
        this.roleAuthority.add(roleAuthorityItem);
        return this;
    }

    public ObjectAuthority withRoleAuthority(Consumer<List<RoleAuthority>> roleAuthoritySetter) {
        if (this.roleAuthority == null) {
            this.roleAuthority = new ArrayList<>();
        }
        roleAuthoritySetter.accept(this.roleAuthority);
        return this;
    }

    /**
     * 角色权限集合
     * @return roleAuthority
     */
    public List<RoleAuthority> getRoleAuthority() {
        return roleAuthority;
    }

    public void setRoleAuthority(List<RoleAuthority> roleAuthority) {
        this.roleAuthority = roleAuthority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectAuthority that = (ObjectAuthority) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.roleAuthority, that.roleAuthority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, roleAuthority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectAuthority {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    roleAuthority: ").append(toIndentedString(roleAuthority)).append("\n");
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
