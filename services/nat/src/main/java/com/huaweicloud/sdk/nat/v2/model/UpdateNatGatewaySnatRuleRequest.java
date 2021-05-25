package com.huaweicloud.sdk.nat.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleRequestOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateNatGatewaySnatRuleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="snat_rule_id")
    
    private String snatRuleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateNatGatewaySnatRuleRequestOption body;

    public UpdateNatGatewaySnatRuleRequest withSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
        return this;
    }

    


    /**
     * SNAT规则的ID。
     * @return snatRuleId
     */
    public String getSnatRuleId() {
        return snatRuleId;
    }

    public void setSnatRuleId(String snatRuleId) {
        this.snatRuleId = snatRuleId;
    }

    

    public UpdateNatGatewaySnatRuleRequest withBody(UpdateNatGatewaySnatRuleRequestOption body) {
        this.body = body;
        return this;
    }

    public UpdateNatGatewaySnatRuleRequest withBody(Consumer<UpdateNatGatewaySnatRuleRequestOption> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateNatGatewaySnatRuleRequestOption();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateNatGatewaySnatRuleRequestOption getBody() {
        return body;
    }

    public void setBody(UpdateNatGatewaySnatRuleRequestOption body) {
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
        UpdateNatGatewaySnatRuleRequest updateNatGatewaySnatRuleRequest = (UpdateNatGatewaySnatRuleRequest) o;
        return Objects.equals(this.snatRuleId, updateNatGatewaySnatRuleRequest.snatRuleId) &&
            Objects.equals(this.body, updateNatGatewaySnatRuleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(snatRuleId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNatGatewaySnatRuleRequest {\n");
        sb.append("    snatRuleId: ").append(toIndentedString(snatRuleId)).append("\n");
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

