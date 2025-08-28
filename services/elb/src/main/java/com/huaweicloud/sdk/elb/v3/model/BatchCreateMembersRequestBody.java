package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * This is a auto create Body Object
 */
public class BatchCreateMembersRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "members")

    private List<BatchCreateMembersOption> members = null;

    public BatchCreateMembersRequestBody withMembers(List<BatchCreateMembersOption> members) {
        this.members = members;
        return this;
    }

    public BatchCreateMembersRequestBody addMembersItem(BatchCreateMembersOption membersItem) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        this.members.add(membersItem);
        return this;
    }

    public BatchCreateMembersRequestBody withMembers(Consumer<List<BatchCreateMembersOption>> membersSetter) {
        if (this.members == null) {
            this.members = new ArrayList<>();
        }
        membersSetter.accept(this.members);
        return this;
    }

    /**
     * **参数解释**：批量添加member请求参数。  **约束限制**：不涉及
     * @return members
     */
    public List<BatchCreateMembersOption> getMembers() {
        return members;
    }

    public void setMembers(List<BatchCreateMembersOption> members) {
        this.members = members;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateMembersRequestBody that = (BatchCreateMembersRequestBody) obj;
        return Objects.equals(this.members, that.members);
    }

    @Override
    public int hashCode() {
        return Objects.hash(members);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateMembersRequestBody {\n");
        sb.append("    members: ").append(toIndentedString(members)).append("\n");
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
