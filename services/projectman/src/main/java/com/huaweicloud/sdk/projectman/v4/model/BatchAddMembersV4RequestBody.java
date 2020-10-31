package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.projectman.v4.model.BatchAddMemberRequestV4;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchAddMembersV4RequestBody
 */
public class BatchAddMembersV4RequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="users")
    
    private List<BatchAddMemberRequestV4> users = new ArrayList<>();
    
    public BatchAddMembersV4RequestBody withUsers(List<BatchAddMemberRequestV4> users) {
        this.users = users;
        return this;
    }

    
    public BatchAddMembersV4RequestBody addUsersItem(BatchAddMemberRequestV4 usersItem) {
        this.users.add(usersItem);
        return this;
    }

    public BatchAddMembersV4RequestBody withUsers(Consumer<List<BatchAddMemberRequestV4>> usersSetter) {
        if(this.users == null ){
            this.users = new ArrayList<>();
        }
        usersSetter.accept(this.users);
        return this;
    }

    /**
     * 添加的用户信息
     * @return users
     */
    public List<BatchAddMemberRequestV4> getUsers() {
        return users;
    }

    public void setUsers(List<BatchAddMemberRequestV4> users) {
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
        BatchAddMembersV4RequestBody batchAddMembersV4RequestBody = (BatchAddMembersV4RequestBody) o;
        return Objects.equals(this.users, batchAddMembersV4RequestBody.users);
    }
    @Override
    public int hashCode() {
        return Objects.hash(users);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddMembersV4RequestBody {\n");
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

