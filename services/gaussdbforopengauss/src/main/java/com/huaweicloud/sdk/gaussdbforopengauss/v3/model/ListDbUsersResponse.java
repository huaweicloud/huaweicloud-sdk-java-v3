package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.GaussDBforOpenGaussUserForList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListDbUsersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    
    private List<GaussDBforOpenGaussUserForList> users = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListDbUsersResponse withUsers(List<GaussDBforOpenGaussUserForList> users) {
        this.users = users;
        return this;
    }

    
    public ListDbUsersResponse addUsersItem(GaussDBforOpenGaussUserForList usersItem) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public ListDbUsersResponse withUsers(Consumer<List<GaussDBforOpenGaussUserForList>> usersSetter) {
        if(this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 列表中每个元素表示一个数据库用户。
     * @return users
     */
    public List<GaussDBforOpenGaussUserForList> getUsers() {
        return users;
    }

    public void setUsers(List<GaussDBforOpenGaussUserForList> users) {
        this.users = users;
    }

    

    public ListDbUsersResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 数据库用户总数。
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
        ListDbUsersResponse listDbUsersResponse = (ListDbUsersResponse) o;
        return Objects.equals(this.users, listDbUsersResponse.users) &&
            Objects.equals(this.totalCount, listDbUsersResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbUsersResponse {\n");
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

