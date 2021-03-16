package com.huaweicloud.sdk.smn.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.smn.v2.model.UpdateTopicAttributeRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateTopicAttributeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="topic_urn")
    
    private String topicUrn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateTopicAttributeRequestBody body;

    public UpdateTopicAttributeRequest withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    


    /**
     * Get topicUrn
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    

    public UpdateTopicAttributeRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public UpdateTopicAttributeRequest withBody(UpdateTopicAttributeRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateTopicAttributeRequest withBody(Consumer<UpdateTopicAttributeRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateTopicAttributeRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateTopicAttributeRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateTopicAttributeRequestBody body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTopicAttributeRequest updateTopicAttributeRequest = (UpdateTopicAttributeRequest) o;
        return Objects.equals(this.topicUrn, updateTopicAttributeRequest.topicUrn) &&
            Objects.equals(this.name, updateTopicAttributeRequest.name) &&
            Objects.equals(this.body, updateTopicAttributeRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, name, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTopicAttributeRequest {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

