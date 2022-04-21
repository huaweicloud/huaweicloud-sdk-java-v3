package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CheckCanAuthUsersOfAppResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<CandidatesUser> users = null;

    public CheckCanAuthUsersOfAppResponse withUsers(List<CandidatesUser> users) {
        this.users = users;
        return this;
    }

    public CheckCanAuthUsersOfAppResponse addUsersItem(CandidatesUser usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public CheckCanAuthUsersOfAppResponse withUsers(Consumer<List<CandidatesUser>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 候选用户成员列表
     * @return users
     */
    public List<CandidatesUser> getUsers() {
        return users;
    }

    public void setUsers(List<CandidatesUser> users) {
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
        CheckCanAuthUsersOfAppResponse checkCanAuthUsersOfAppResponse = (CheckCanAuthUsersOfAppResponse) o;
        return Objects.equals(this.users, checkCanAuthUsersOfAppResponse.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckCanAuthUsersOfAppResponse {\n");
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
