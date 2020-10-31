package com.huaweicloud.sdk.projectman.v4.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchDeleteMembersV4RequestBody
 */
public class BatchDeleteMembersV4RequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_ids")
    
    private List<String> userIds = new ArrayList<>();
    
    public BatchDeleteMembersV4RequestBody withUserIds(List<String> userIds) {
        this.userIds = userIds;
        return this;
    }

    
    public BatchDeleteMembersV4RequestBody addUserIdsItem(String userIdsItem) {
        this.userIds.add(userIdsItem);
        return this;
    }

    public BatchDeleteMembersV4RequestBody withUserIds(Consumer<List<String>> userIdsSetter) {
        if(this.userIds == null ){
            this.userIds = new ArrayList<>();
        }
        userIdsSetter.accept(this.userIds);
        return this;
    }

    /**
     * 用户id
     * @return userIds
     */
    public List<String> getUserIds() {
        return userIds;
    }

    public void setUserIds(List<String> userIds) {
        this.userIds = userIds;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchDeleteMembersV4RequestBody batchDeleteMembersV4RequestBody = (BatchDeleteMembersV4RequestBody) o;
        return Objects.equals(this.userIds, batchDeleteMembersV4RequestBody.userIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(userIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMembersV4RequestBody {\n");
        sb.append("    userIds: ").append(toIndentedString(userIds)).append("\n");
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

