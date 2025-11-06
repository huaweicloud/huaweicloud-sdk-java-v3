package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 批量添加成员
 */
public class BatchCreateRepositoryMemberBodyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private List<CreateRepositoryMemberDto> users = null;

    public BatchCreateRepositoryMemberBodyDto withUsers(List<CreateRepositoryMemberDto> users) {
        this.users = users;
        return this;
    }

    public BatchCreateRepositoryMemberBodyDto addUsersItem(CreateRepositoryMemberDto usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    public BatchCreateRepositoryMemberBodyDto withUsers(Consumer<List<CreateRepositoryMemberDto>> usersSetter) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * **参数解释：** 成员信息列表。
     * @return users
     */
    public List<CreateRepositoryMemberDto> getUsers() {
        return users;
    }

    public void setUsers(List<CreateRepositoryMemberDto> users) {
        this.users = users;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateRepositoryMemberBodyDto that = (BatchCreateRepositoryMemberBodyDto) obj;
        return Objects.equals(this.users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateRepositoryMemberBodyDto {\n");
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
