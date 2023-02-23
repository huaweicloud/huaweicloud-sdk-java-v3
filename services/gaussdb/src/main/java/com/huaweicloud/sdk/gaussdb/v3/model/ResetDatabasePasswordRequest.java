package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ResetDatabasePassword;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改数据库用户密码请求体。
 */
public class ResetDatabasePasswordRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<ResetDatabasePassword> users = null;
    
    public ResetDatabasePasswordRequest withUsers(List<ResetDatabasePassword> users) {
        this.users = users;
        return this;
    }

    
    public ResetDatabasePasswordRequest addUsersItem(ResetDatabasePassword usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ResetDatabasePasswordRequest withUsers(Consumer<List<ResetDatabasePassword>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 准备修改密码的数据库用户列表，列表最大长度为50。
     * @return users
     */
    public List<ResetDatabasePassword> getUsers() {
        return users;
    }

    public void setUsers(List<ResetDatabasePassword> users) {
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
        ResetDatabasePasswordRequest resetDatabasePasswordRequest = (ResetDatabasePasswordRequest) o;
        return Objects.equals(this.users, resetDatabasePasswordRequest.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResetDatabasePasswordRequest {\n");
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

