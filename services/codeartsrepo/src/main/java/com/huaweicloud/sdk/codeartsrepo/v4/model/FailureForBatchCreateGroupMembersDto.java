package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联失败成员
 */
public class FailureForBatchCreateGroupMembersDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_id")

    private String iamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private List<String> message = null;

    public FailureForBatchCreateGroupMembersDto withIamId(String iamId) {
        this.iamId = iamId;
        return this;
    }

    /**
     * iam_id
     * @return iamId
     */
    public String getIamId() {
        return iamId;
    }

    public void setIamId(String iamId) {
        this.iamId = iamId;
    }

    public FailureForBatchCreateGroupMembersDto withMessage(List<String> message) {
        this.message = message;
        return this;
    }

    public FailureForBatchCreateGroupMembersDto addMessageItem(String messageItem) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        this.message.add(messageItem);
        return this;
    }

    public FailureForBatchCreateGroupMembersDto withMessage(Consumer<List<String>> messageSetter) {
        if (this.message == null) {
            this.message = new ArrayList<>();
        }
        messageSetter.accept(this.message);
        return this;
    }

    /**
     * 失败原因
     * @return message
     */
    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailureForBatchCreateGroupMembersDto that = (FailureForBatchCreateGroupMembersDto) obj;
        return Objects.equals(this.iamId, that.iamId) && Objects.equals(this.message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iamId, message);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailureForBatchCreateGroupMembersDto {\n");
        sb.append("    iamId: ").append(toIndentedString(iamId)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
