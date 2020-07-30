package com.huaweicloud.sdk.apig.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ThrottleSpecialUpdateReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateSpecialThrottlingConfigurationV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_id")
    
    private String strategyId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ThrottleSpecialUpdateReq body = null;

    public UpdateSpecialThrottlingConfigurationV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public UpdateSpecialThrottlingConfigurationV2Request withStrategyId(String strategyId) {
        this.strategyId = strategyId;
        return this;
    }

    


    /**
     * Get strategyId
     * @return strategyId
     */
    public String getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(String strategyId) {
        this.strategyId = strategyId;
    }

    public UpdateSpecialThrottlingConfigurationV2Request withBody(ThrottleSpecialUpdateReq body) {
        this.body = body;
        return this;
    }

    public UpdateSpecialThrottlingConfigurationV2Request withBody(Consumer<ThrottleSpecialUpdateReq> bodySetter) {
        if(this.body == null ){
            this.body = new ThrottleSpecialUpdateReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ThrottleSpecialUpdateReq getBody() {
        return body;
    }

    public void setBody(ThrottleSpecialUpdateReq body) {
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
        UpdateSpecialThrottlingConfigurationV2Request updateSpecialThrottlingConfigurationV2Request = (UpdateSpecialThrottlingConfigurationV2Request) o;
        return Objects.equals(this.instanceId, updateSpecialThrottlingConfigurationV2Request.instanceId) &&
            Objects.equals(this.strategyId, updateSpecialThrottlingConfigurationV2Request.strategyId) &&
            Objects.equals(this.body, updateSpecialThrottlingConfigurationV2Request.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, strategyId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSpecialThrottlingConfigurationV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
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

