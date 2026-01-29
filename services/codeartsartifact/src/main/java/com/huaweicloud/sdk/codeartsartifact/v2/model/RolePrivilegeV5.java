package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RolePrivilegeV5
 */
public class RolePrivilegeV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<PrivilegeParam> privileges = null;

    public RolePrivilegeV5 withPrivileges(List<PrivilegeParam> privileges) {
        this.privileges = privileges;
        return this;
    }

    public RolePrivilegeV5 addPrivilegesItem(PrivilegeParam privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public RolePrivilegeV5 withPrivileges(Consumer<List<PrivilegeParam>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * **参数解释**: 权限信息。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 无。 
     * @return privileges
     */
    public List<PrivilegeParam> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<PrivilegeParam> privileges) {
        this.privileges = privileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RolePrivilegeV5 that = (RolePrivilegeV5) obj;
        return Objects.equals(this.privileges, that.privileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RolePrivilegeV5 {\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
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
