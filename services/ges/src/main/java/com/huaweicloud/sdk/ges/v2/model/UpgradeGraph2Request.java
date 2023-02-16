package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.UpgradeGraphReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpgradeGraph2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    
    
    private String graphId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private UpgradeGraphReq body;

    public UpgradeGraph2Request withGraphId(String graphId) {
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

    

    public UpgradeGraph2Request withBody(UpgradeGraphReq body) {
        this.body = body;
        return this;
    }

    public UpgradeGraph2Request withBody(Consumer<UpgradeGraphReq> bodySetter) {
        if(this.body == null ){
            this.body = new UpgradeGraphReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpgradeGraphReq getBody() {
        return body;
    }

    public void setBody(UpgradeGraphReq body) {
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
        UpgradeGraph2Request upgradeGraph2Request = (UpgradeGraph2Request) o;
        return Objects.equals(this.graphId, upgradeGraph2Request.graphId) &&
            Objects.equals(this.body, upgradeGraph2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(graphId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeGraph2Request {\n");
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

