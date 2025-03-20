package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateMessageV2Req
 */
public class CreateMessageV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private CreateMessageDoV2 message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    public CreateMessageV2Req withMessage(CreateMessageDoV2 message) {
        this.message = message;
        return this;
    }

    public CreateMessageV2Req withMessage(Consumer<CreateMessageDoV2> messageSetter) {
        if (this.message == null) {
            this.message = new CreateMessageDoV2();
            messageSetter.accept(this.message);
        }

        return this;
    }

    /**
     * Get message
     * @return message
     */
    public CreateMessageDoV2 getMessage() {
        return message;
    }

    public void setMessage(CreateMessageDoV2 message) {
        this.message = message;
    }

    public CreateMessageV2Req withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 华为云IAM组id，操作查询同组其他工单时，该id必传
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMessageV2Req that = (CreateMessageV2Req) obj;
        return Objects.equals(this.message, that.message) && Objects.equals(this.groupId, that.groupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, groupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageV2Req {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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
