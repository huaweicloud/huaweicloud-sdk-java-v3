package com.huaweicloud.sdk.roma.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.AppUsersUsers;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CheckAuthUsersOfAppResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<AppUsersUsers> users = null;
    
    public CheckAuthUsersOfAppResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 应用的总成员数量
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public CheckAuthUsersOfAppResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 应用ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public CheckAuthUsersOfAppResponse withUsers(List<AppUsersUsers> users) {
        this.users = users;
        return this;
    }

    
    public CheckAuthUsersOfAppResponse addUsersItem(AppUsersUsers usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CheckAuthUsersOfAppResponse withUsers(Consumer<List<AppUsersUsers>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户成员列表
     * @return users
     */
    public List<AppUsersUsers> getUsers() {
        return users;
    }

    public void setUsers(List<AppUsersUsers> users) {
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
        CheckAuthUsersOfAppResponse checkAuthUsersOfAppResponse = (CheckAuthUsersOfAppResponse) o;
        return Objects.equals(this.total, checkAuthUsersOfAppResponse.total) &&
            Objects.equals(this.id, checkAuthUsersOfAppResponse.id) &&
            Objects.equals(this.users, checkAuthUsersOfAppResponse.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, id, users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckAuthUsersOfAppResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

