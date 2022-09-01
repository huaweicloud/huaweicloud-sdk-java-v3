package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.DeleteDatabasePermission;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 删除数据库用户的数据库权限
 */
public class DeleteDatabasePermissionRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    @JacksonXmlProperty(localName = "users")
    
    private List<DeleteDatabasePermission> users = null;
    
    public DeleteDatabasePermissionRequestBody withUsers(List<DeleteDatabasePermission> users) {
        this.users = users;
        return this;
    }

    
    public DeleteDatabasePermissionRequestBody addUsersItem(DeleteDatabasePermission usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public DeleteDatabasePermissionRequestBody withUsers(Consumer<List<DeleteDatabasePermission>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 数据库用户列表，列表最大长度为50。
     * @return users
     */
    public List<DeleteDatabasePermission> getUsers() {
        return users;
    }

    public void setUsers(List<DeleteDatabasePermission> users) {
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
        DeleteDatabasePermissionRequestBody deleteDatabasePermissionRequestBody = (DeleteDatabasePermissionRequestBody) o;
        return Objects.equals(this.users, deleteDatabasePermissionRequestBody.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteDatabasePermissionRequestBody {\n");
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

