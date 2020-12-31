package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchDeleteMqsInstanceTopicRespTopics
 */
public class BatchDeleteMqsInstanceTopicRespTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private Boolean success;

    public BatchDeleteMqsInstanceTopicRespTopics withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * topic名称。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchDeleteMqsInstanceTopicRespTopics withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    


    /**
     * 是否删除成功。
     * @return success
     */
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
        BatchDeleteMqsInstanceTopicRespTopics batchDeleteMqsInstanceTopicRespTopics = (BatchDeleteMqsInstanceTopicRespTopics) o;
        return Objects.equals(this.id, batchDeleteMqsInstanceTopicRespTopics.id) &&
            Objects.equals(this.success, batchDeleteMqsInstanceTopicRespTopics.success);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, success);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteMqsInstanceTopicRespTopics {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
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

