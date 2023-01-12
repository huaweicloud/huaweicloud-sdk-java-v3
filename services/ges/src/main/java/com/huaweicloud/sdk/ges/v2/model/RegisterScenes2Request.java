package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.RegisterScenesReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class RegisterScenes2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    
    
    private String graphId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private RegisterScenesReq body;

    public RegisterScenes2Request withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    


    /**
     * 图ID。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    

    public RegisterScenes2Request withBody(RegisterScenesReq body) {
        this.body = body;
        return this;
    }

    public RegisterScenes2Request withBody(Consumer<RegisterScenesReq> bodySetter) {
        if(this.body == null ){
            this.body = new RegisterScenesReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RegisterScenesReq getBody() {
        return body;
    }

    public void setBody(RegisterScenesReq body) {
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
        RegisterScenes2Request registerScenes2Request = (RegisterScenes2Request) o;
        return Objects.equals(this.graphId, registerScenes2Request.graphId) &&
            Objects.equals(this.body, registerScenes2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterScenes2Request {\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
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

