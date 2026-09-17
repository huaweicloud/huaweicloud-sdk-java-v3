package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RoleMember
 */
public class RoleMember {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission")

    private Boolean permission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "grant_with")

    private Boolean grantWith;

    public RoleMember withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 角色名。 **取值范围**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleMember withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * **参数解释**： 角色描述。 **取值范围**： 不涉及。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public RoleMember withPermission(Boolean permission) {
        this.permission = permission;
        return this;
    }

    /**
     * **参数解释**： 是否允许授予某个角色特定的权限。 **取值范围**： 不涉及。
     * @return permission
     */
    public Boolean getPermission() {
        return permission;
    }

    public void setPermission(Boolean permission) {
        this.permission = permission;
    }

    public RoleMember withGrantWith(Boolean grantWith) {
        this.grantWith = grantWith;
        return this;
    }

    /**
     * **参数解释**： 是否允许该角色将已获得的权限再转授给其他角色。 **取值范围**： 不涉及。
     * @return grantWith
     */
    public Boolean getGrantWith() {
        return grantWith;
    }

    public void setGrantWith(Boolean grantWith) {
        this.grantWith = grantWith;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleMember that = (RoleMember) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.permission, that.permission) && Objects.equals(this.grantWith, that.grantWith);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, desc, permission, grantWith);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleMember {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    grantWith: ").append(toIndentedString(grantWith)).append("\n");
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
