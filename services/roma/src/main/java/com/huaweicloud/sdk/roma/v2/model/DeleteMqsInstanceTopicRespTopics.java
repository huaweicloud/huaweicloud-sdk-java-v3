package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** DeleteMqsInstanceTopicRespTopics */
public class DeleteMqsInstanceTopicRespTopics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success")

    private Boolean success;

    public DeleteMqsInstanceTopicRespTopics withId(String id) {
        this.id = id;
        return this;
    }

    /** Topic名称。
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteMqsInstanceTopicRespTopics withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    /** 是否删除成功。
     * 
     * @return success */
    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteMqsInstanceTopicRespTopics deleteMqsInstanceTopicRespTopics = (DeleteMqsInstanceTopicRespTopics) o;
        return Objects.equals(this.id, deleteMqsInstanceTopicRespTopics.id)
            && Objects.equals(this.success, deleteMqsInstanceTopicRespTopics.success);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, success);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteMqsInstanceTopicRespTopics {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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
