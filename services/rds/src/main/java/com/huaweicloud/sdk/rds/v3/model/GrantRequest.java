package com.huaweicloud.sdk.rds.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.UserWithPrivilege;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * GrantRequest
 */
public class GrantRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="db_name")
    
    private String dbName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<UserWithPrivilege> users = null;
    
    public GrantRequest withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    


    /**
     * 数据库名称。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    

    public GrantRequest withUsers(List<UserWithPrivilege> users) {
        this.users = users;
        return this;
    }

    
    public GrantRequest addUsersItem(UserWithPrivilege usersItem) {
        this.users.add(usersItem);
        return this;
    }

    public GrantRequest withUsers(Consumer<List<UserWithPrivilege>> usersSetter) {
        if(this.users == null ){
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 每个元素都是与数据库相关联的帐号。单次请求最多支持50个元素。
     * @return users
     */
    public List<UserWithPrivilege> getUsers() {
        return users;
    }

    public void setUsers(List<UserWithPrivilege> users) {
        this.users = users;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GrantRequest grantRequest = (GrantRequest) o;
        return Objects.equals(this.dbName, grantRequest.dbName) &&
            Objects.equals(this.users, grantRequest.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dbName, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GrantRequest {\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

