package com.huaweicloud.sdk.dds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.RolesOption;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateDatabaseRoleRequestBody
 */
public class CreateDatabaseRoleRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role_name")
    
    private String roleName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<RolesOption> roles = null;
    
    public CreateDatabaseRoleRequestBody withRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    


    /**
     * 创建角色名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、中划线、下划线和点。
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    

    public CreateDatabaseRoleRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 角色所在的数据库名称，默认admin。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、下划线。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public CreateDatabaseRoleRequestBody withRoles(List<RolesOption> roles) {
        this.roles = roles;
        return this;
    }

    
    public CreateDatabaseRoleRequestBody addRolesItem(RolesOption rolesItem) {
        if(this.roles == null) {
            this.roles = new ArrayList<>();
        }
        this.roles.add(rolesItem);
        return this;
    }

    public CreateDatabaseRoleRequestBody withRoles(Consumer<List<RolesOption>> rolesSetter) {
        if(this.roles == null) {
            this.roles = new ArrayList<>();
        }
        rolesSetter.accept(this.roles);
        return this;
    }

    /**
     * 新用户所拥有的角色。
     * @return roles
     */
    public List<RolesOption> getRoles() {
        return roles;
    }

    public void setRoles(List<RolesOption> roles) {
        this.roles = roles;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDatabaseRoleRequestBody createDatabaseRoleRequestBody = (CreateDatabaseRoleRequestBody) o;
        return Objects.equals(this.roleName, createDatabaseRoleRequestBody.roleName) &&
            Objects.equals(this.dbName, createDatabaseRoleRequestBody.dbName) &&
            Objects.equals(this.roles, createDatabaseRoleRequestBody.roles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(roleName, dbName, roles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseRoleRequestBody {\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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

