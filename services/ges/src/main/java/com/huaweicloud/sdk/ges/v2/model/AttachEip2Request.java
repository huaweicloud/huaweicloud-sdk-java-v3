package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.AttachEipReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class AttachEip2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    
    
    private String graphId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private AttachEipReq body;

    public AttachEip2Request withGraphId(String graphId) {
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

    

    public AttachEip2Request withBody(AttachEipReq body) {
        this.body = body;
        return this;
    }

    public AttachEip2Request withBody(Consumer<AttachEipReq> bodySetter) {
        if(this.body == null ){
            this.body = new AttachEipReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AttachEipReq getBody() {
        return body;
    }

    public void setBody(AttachEipReq body) {
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
        AttachEip2Request attachEip2Request = (AttachEip2Request) o;
        return Objects.equals(this.graphId, attachEip2Request.graphId) &&
            Objects.equals(this.body, attachEip2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachEip2Request {\n");
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

