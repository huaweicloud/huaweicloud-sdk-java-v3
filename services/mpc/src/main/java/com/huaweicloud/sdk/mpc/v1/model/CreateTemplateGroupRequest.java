package com.huaweicloud.sdk.mpc.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.TransTemplateGroup;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateTemplateGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private TransTemplateGroup body = null;

    public CreateTemplateGroupRequest withBody(TransTemplateGroup body) {
        this.body = body;
        return this;
    }

    public CreateTemplateGroupRequest withBody(Consumer<TransTemplateGroup> bodySetter) {
        if(this.body == null ){
            this.body = new TransTemplateGroup();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public TransTemplateGroup getBody() {
        return body;
    }

    public void setBody(TransTemplateGroup body) {
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
        CreateTemplateGroupRequest createTemplateGroupRequest = (CreateTemplateGroupRequest) o;
        return Objects.equals(this.body, createTemplateGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplateGroupRequest {\n");
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

