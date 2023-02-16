package com.huaweicloud.sdk.gaussdb.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.ListGaussMySqlDatabaseUser;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListGaussMySqlDatabaseUserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    
    private List<ListGaussMySqlDatabaseUser> users = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListGaussMySqlDatabaseUserResponse withUsers(List<ListGaussMySqlDatabaseUser> users) {
        this.users = users;
        return this;
    }

    
    public ListGaussMySqlDatabaseUserResponse addUsersItem(ListGaussMySqlDatabaseUser usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListGaussMySqlDatabaseUserResponse withUsers(Consumer<List<ListGaussMySqlDatabaseUser>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 数据库用户列表。
     * @return users
     */
    public List<ListGaussMySqlDatabaseUser> getUsers() {
        return users;
    }

    public void setUsers(List<ListGaussMySqlDatabaseUser> users) {
        this.users = users;
    }

    

    public ListGaussMySqlDatabaseUserResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 实例的数据库用户总数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListGaussMySqlDatabaseUserResponse listGaussMySqlDatabaseUserResponse = (ListGaussMySqlDatabaseUserResponse) o;
        return Objects.equals(this.users, listGaussMySqlDatabaseUserResponse.users) &&
            Objects.equals(this.totalCount, listGaussMySqlDatabaseUserResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListGaussMySqlDatabaseUserResponse {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

