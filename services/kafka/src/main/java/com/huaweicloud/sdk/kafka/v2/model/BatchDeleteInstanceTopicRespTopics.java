package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BatchDeleteInstanceTopicRespTopics
 */
public class BatchDeleteInstanceTopicRespTopics  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="success")
    
    private Boolean success;

    public BatchDeleteInstanceTopicRespTopics withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Topic名称。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public BatchDeleteInstanceTopicRespTopics withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    


    /**
     * topic名称。
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
        BatchDeleteInstanceTopicRespTopics batchDeleteInstanceTopicRespTopics = (BatchDeleteInstanceTopicRespTopics) o;
        return Objects.equals(this.id, batchDeleteInstanceTopicRespTopics.id) &&
            Objects.equals(this.success, batchDeleteInstanceTopicRespTopics.success);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, success);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstanceTopicRespTopics {\n");
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

