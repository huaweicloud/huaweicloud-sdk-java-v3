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
 * CreateDatabaseUserRequestBody
 */
public class CreateDatabaseUserRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_name")
    
    private String userName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_pwd")
    
    private String userPwd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roles")
    
    private List<RolesOption> roles = null;
    
    public CreateDatabaseUserRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    


    /**
     * 数据库用户名称。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、中划线、下划线和点。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    

    public CreateDatabaseUserRequestBody withUserPwd(String userPwd) {
        this.userPwd = userPwd;
        return this;
    }

    


    /**
     * 数据库用户密码。 - 长度为8~32位，必须是大写字母（A~Z）、小写字母（a~z）、数字（0~9）、特殊字符~!@#%^*-_=+?的组合。 - 建议您输入高强度密码，以提高安全性，防止出现密码被暴力破解等安全风险。
     * @return userPwd
     */
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    

    public CreateDatabaseUserRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 新用户所在的数据库，默认为“admin”。 - 长度为1~64位，可以包含大写字母（A~Z）、小写字母（a~z）、数字（0~9）、下划线。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public CreateDatabaseUserRequestBody withRoles(List<RolesOption> roles) {
        this.roles = roles;
        return this;
    }

    
    public CreateDatabaseUserRequestBody addRolesItem(RolesOption rolesItem) {
        this.roles.add(rolesItem);
        return this;
    }

    public CreateDatabaseUserRequestBody withRoles(Consumer<List<RolesOption>> rolesSetter) {
        if(this.roles == null ){
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
        CreateDatabaseUserRequestBody createDatabaseUserRequestBody = (CreateDatabaseUserRequestBody) o;
        return Objects.equals(this.userName, createDatabaseUserRequestBody.userName) &&
            Objects.equals(this.userPwd, createDatabaseUserRequestBody.userPwd) &&
            Objects.equals(this.dbName, createDatabaseUserRequestBody.dbName) &&
            Objects.equals(this.roles, createDatabaseUserRequestBody.roles);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userName, userPwd, dbName, roles);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseUserRequestBody {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPwd: ").append(toIndentedString(userPwd)).append("\n");
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

