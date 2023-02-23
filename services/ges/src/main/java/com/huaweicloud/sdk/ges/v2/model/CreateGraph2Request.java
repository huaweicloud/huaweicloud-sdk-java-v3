package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.CreateGraphReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateGraph2Request  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private CreateGraphReq body;

    public CreateGraph2Request withBody(CreateGraphReq body) {
        this.body = body;
        return this;
    }

    public CreateGraph2Request withBody(Consumer<CreateGraphReq> bodySetter) {
        if(this.body == null ){
            this.body = new CreateGraphReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateGraphReq getBody() {
        return body;
    }

    public void setBody(CreateGraphReq body) {
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
        CreateGraph2Request createGraph2Request = (CreateGraph2Request) o;
        return Objects.equals(this.body, createGraph2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGraph2Request {\n");
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

