package com.huaweicloud.sdk.cloudide.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cloudide.v2.model.RoleAction;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Role
 */
public class Role  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="c_role")
    
    private String cRole;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private String role;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_actionses")
    
    private List<RoleAction> roleActionses = null;
    
    public Role withCRole(String cRole) {
        this.cRole = cRole;
        return this;
    }

    


    /**
     * 子角色
     * @return cRole
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="c_role")
    public String getCRole() {
        return cRole;
    }

    public void setCRole(String cRole) {
        this.cRole = cRole;
    }

    public Role withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Role withRole(String role) {
        this.role = role;
        return this;
    }

    


    /**
     * 角色
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Role withRoleActionses(List<RoleAction> roleActionses) {
        this.roleActionses = roleActionses;
        return this;
    }

    
    public Role addRoleActionsesItem(RoleAction roleActionsesItem) {
        if (this.roleActionses == null) {
            this.roleActionses = new ArrayList<>();
        }
        this.roleActionses.add(roleActionsesItem);
        return this;
    }

    public Role withRoleActionses(Consumer<List<RoleAction>> roleActionsesSetter) {
        if(this.roleActionses == null ){
            this.roleActionses = new ArrayList<>();
        }
        roleActionsesSetter.accept(this.roleActionses);
        return this;
    }

    /**
     * 角色执行操作列表
     * @return roleActionses
     */
    public List<RoleAction> getRoleActionses() {
        return roleActionses;
    }

    public void setRoleActionses(List<RoleAction> roleActionses) {
        this.roleActionses = roleActionses;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Role role = (Role) o;
        return Objects.equals(this.cRole, role.cRole) &&
            Objects.equals(this.id, role.id) &&
            Objects.equals(this.role, role.role) &&
            Objects.equals(this.roleActionses, role.roleActionses);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cRole, id, role, roleActionses);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Role {\n");
        sb.append("    cRole: ").append(toIndentedString(cRole)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    roleActionses: ").append(toIndentedString(roleActionses)).append("\n");
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

