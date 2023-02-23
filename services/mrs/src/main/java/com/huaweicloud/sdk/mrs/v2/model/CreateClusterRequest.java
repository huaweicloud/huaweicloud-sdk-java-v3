package com.huaweicloud.sdk.mrs.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v2.model.CreateClusterReqV2;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class CreateClusterRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private CreateClusterReqV2 body;

    public CreateClusterRequest withBody(CreateClusterReqV2 body) {
        this.body = body;
        return this;
    }

    public CreateClusterRequest withBody(Consumer<CreateClusterReqV2> bodySetter) {
        if(this.body == null ){
            this.body = new CreateClusterReqV2();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public CreateClusterReqV2 getBody() {
        return body;
    }

    public void setBody(CreateClusterReqV2 body) {
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

