package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.CreateDatabaseUserList;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建数据库用户的请求信息。
 */
public class CreateDatabaseUserRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    @JacksonXmlProperty(localName = "users")
    
    private List<CreateDatabaseUserList> users = null;
    
    public CreateDatabaseUserRequest withUsers(List<CreateDatabaseUserList> users) {
        this.users = users;
        return this;
    }

    
    public CreateDatabaseUserRequest addUsersItem(CreateDatabaseUserList usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CreateDatabaseUserRequest withUsers(Consumer<List<CreateDatabaseUserList>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * Get users
     * @return users
     */
    public List<CreateDatabaseUserList> getUsers() {
        return users;
    }

    public void setUsers(List<CreateDatabaseUserList> users) {
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
        CreateDatabaseUserRequest createDatabaseUserRequest = (CreateDatabaseUserRequest) o;
        return Objects.equals(this.users, createDatabaseUserRequest.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDatabaseUserRequest {\n");
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

