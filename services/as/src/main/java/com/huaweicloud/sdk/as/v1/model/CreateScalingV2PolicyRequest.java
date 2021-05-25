package com.huaweicloud.sdk.as.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.as.v1.model.CreateScalingPolicyV2Option;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateScalingV2PolicyRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private CreateScalingPolicyV2Option body;

    public CreateScalingV2PolicyRequest withBody(CreateScalingPolicyV2Option body) {
        this.body = body;
        return this;
    }

    public CreateScalingV2PolicyRequest withBody(Consumer<CreateScalingPolicyV2Option> bodySetter) {
        if(this.body == null ){
            this.body = new CreateScalingPolicyV2Option();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateScalingPolicyV2Option getBody() {
        return body;
    }

    public void setBody(CreateScalingPolicyV2Option body) {
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
        CreateScalingV2PolicyRequest createScalingV2PolicyRequest = (CreateScalingV2PolicyRequest) o;
        return Objects.equals(this.body, createScalingV2PolicyRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateScalingV2PolicyRequest {\n");
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

