package com.huaweicloud.sdk.nat.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleRequestBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNatGatewayDnatRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="dnat_rule_id")
    
    private String dnatRuleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateNatGatewayDnatRuleRequestBody body;

    public UpdateNatGatewayDnatRuleRequest withDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
        return this;
    }

    


    /**
     * DNAT规则的ID。
     * @return dnatRuleId
     */
    public String getDnatRuleId() {
        return dnatRuleId;
    }

    public void setDnatRuleId(String dnatRuleId) {
        this.dnatRuleId = dnatRuleId;
    }

    

    public UpdateNatGatewayDnatRuleRequest withBody(UpdateNatGatewayDnatRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateNatGatewayDnatRuleRequest withBody(Consumer<UpdateNatGatewayDnatRuleRequestBody> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateNatGatewayDnatRuleRequestBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateNatGatewayDnatRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateNatGatewayDnatRuleRequestBody body) {
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
        UpdateNatGatewayDnatRuleRequest updateNatGatewayDnatRuleRequest = (UpdateNatGatewayDnatRuleRequest) o;
        return Objects.equals(this.dnatRuleId, updateNatGatewayDnatRuleRequest.dnatRuleId) &&
            Objects.equals(this.body, updateNatGatewayDnatRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(dnatRuleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewayDnatRuleRequest {\n");
        sb.append("    dnatRuleId: ").append(toIndentedString(dnatRuleId)).append("\n");
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

