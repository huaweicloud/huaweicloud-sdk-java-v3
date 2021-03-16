package com.huaweicloud.sdk.rds.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.rds.v3.model.PgUserForList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListPostgresqlDbUserPaginatedResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<PgUserForList> users = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;

    public ListPostgresqlDbUserPaginatedResponse withUsers(List<PgUserForList> users) {
        this.users = users;
        return this;
    }

    
    public ListPostgresqlDbUserPaginatedResponse addUsersItem(PgUserForList usersItem) {
        this.users.add(usersItem);
        return this;
    }

    public ListPostgresqlDbUserPaginatedResponse withUsers(Consumer<List<PgUserForList>> usersSetter) {
        if(this.users == null ){
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 用户信息。
     * @return users
     */
    public List<PgUserForList> getUsers() {
        return users;
    }

    public void setUsers(List<PgUserForList> users) {
        this.users = users;
    }

    

    public ListPostgresqlDbUserPaginatedResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总条数。
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
        ListPostgresqlDbUserPaginatedResponse listPostgresqlDbUserPaginatedResponse = (ListPostgresqlDbUserPaginatedResponse) o;
        return Objects.equals(this.users, listPostgresqlDbUserPaginatedResponse.users) &&
            Objects.equals(this.totalCount, listPostgresqlDbUserPaginatedResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPostgresqlDbUserPaginatedResponse {\n");
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

