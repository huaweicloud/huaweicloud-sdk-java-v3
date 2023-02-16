package com.huaweicloud.sdk.mrs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.CreateClusterReqV11;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateClusterRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private CreateClusterReqV11 body;

    public CreateClusterRequest withBody(CreateClusterReqV11 body) {
        this.body = body;
        return this;
    }

    public CreateClusterRequest withBody(Consumer<CreateClusterReqV11> bodySetter) {
        if(this.body == null ){
            this.body = new CreateClusterReqV11();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateClusterReqV11 getBody() {
        return body;
    }

    public void setBody(CreateClusterReqV11 body) {
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
        CreateClusterRequest createClusterRequest = (CreateClusterRequest) o;
        return Objects.equals(this.body, createClusterRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterRequest {\n");
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

