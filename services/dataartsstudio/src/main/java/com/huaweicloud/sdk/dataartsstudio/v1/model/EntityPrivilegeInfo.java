package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实体特权信息
 */
public class EntityPrivilegeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privileges")

    private List<String> privileges = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inherit_privileges")

    private List<String> inheritPrivileges = null;

    public EntityPrivilegeInfo withPrivileges(List<String> privileges) {
        this.privileges = privileges;
        return this;
    }

    public EntityPrivilegeInfo addPrivilegesItem(String privilegesItem) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        this.privileges.add(privilegesItem);
        return this;
    }

    public EntityPrivilegeInfo withPrivileges(Consumer<List<String>> privilegesSetter) {
        if (this.privileges == null) {
            this.privileges = new ArrayList<>();
        }
        privilegesSetter.accept(this.privileges);
        return this;
    }

    /**
     * 特权列表
     * @return privileges
     */
    public List<String> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<String> privileges) {
        this.privileges = privileges;
    }

    public EntityPrivilegeInfo withInheritPrivileges(List<String> inheritPrivileges) {
        this.inheritPrivileges = inheritPrivileges;
        return this;
    }

    public EntityPrivilegeInfo addInheritPrivilegesItem(String inheritPrivilegesItem) {
        if (this.inheritPrivileges == null) {
            this.inheritPrivileges = new ArrayList<>();
        }
        this.inheritPrivileges.add(inheritPrivilegesItem);
        return this;
    }

    public EntityPrivilegeInfo withInheritPrivileges(Consumer<List<String>> inheritPrivilegesSetter) {
        if (this.inheritPrivileges == null) {
            this.inheritPrivileges = new ArrayList<>();
        }
        inheritPrivilegesSetter.accept(this.inheritPrivileges);
        return this;
    }

    /**
     * 继承特权列表
     * @return inheritPrivileges
     */
    public List<String> getInheritPrivileges() {
        return inheritPrivileges;
    }

    public void setInheritPrivileges(List<String> inheritPrivileges) {
        this.inheritPrivileges = inheritPrivileges;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EntityPrivilegeInfo that = (EntityPrivilegeInfo) obj;
        return Objects.equals(this.privileges, that.privileges)
            && Objects.equals(this.inheritPrivileges, that.inheritPrivileges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(privileges, inheritPrivileges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EntityPrivilegeInfo {\n");
        sb.append("    privileges: ").append(toIndentedString(privileges)).append("\n");
        sb.append("    inheritPrivileges: ").append(toIndentedString(inheritPrivileges)).append("\n");
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
