package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListDbUsersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_users")

    private List<DbUser> dbUsers = null;

    public ListDbUsersResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 总数
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListDbUsersResponse withDbUsers(List<DbUser> dbUsers) {
        this.dbUsers = dbUsers;
        return this;
    }

    public ListDbUsersResponse addDbUsersItem(DbUser dbUsersItem) {
        if (this.dbUsers == null) {
            this.dbUsers = new ArrayList<>();
        }
        this.dbUsers.add(dbUsersItem);
        return this;
    }

    public ListDbUsersResponse withDbUsers(Consumer<List<DbUser>> dbUsersSetter) {
        if (this.dbUsers == null) {
            this.dbUsers = new ArrayList<>();
        }
        dbUsersSetter.accept(this.dbUsers);
        return this;
    }

    /** 数据库用户列表
     * 
     * @return dbUsers */
    public List<DbUser> getDbUsers() {
        return dbUsers;
    }

    public void setDbUsers(List<DbUser> dbUsers) {
        this.dbUsers = dbUsers;
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
        return Objects.equals(this.total, listDbUsersResponse.total)
            && Objects.equals(this.dbUsers, listDbUsersResponse.dbUsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, dbUsers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDbUsersResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    dbUsers: ").append(toIndentedString(dbUsers)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
