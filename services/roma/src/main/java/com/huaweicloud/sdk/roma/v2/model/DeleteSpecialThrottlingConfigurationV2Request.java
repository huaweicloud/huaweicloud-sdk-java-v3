package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSpecialThrottlingConfigurationV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_id")
    
    private String throttleId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="strategy_id")
    
    private String strategyId;

    public DeleteSpecialThrottlingConfigurationV2Request withInstanceId(String instanceId) {
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

    

    public DeleteSpecialThrottlingConfigurationV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    


    /**
     * Get throttleId
     * @return throttleId
     */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    

    public DeleteSpecialThrottlingConfigurationV2Request withStrategyId(String strategyId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSpecialThrottlingConfigurationV2Request deleteSpecialThrottlingConfigurationV2Request = (DeleteSpecialThrottlingConfigurationV2Request) o;
        return Objects.equals(this.instanceId, deleteSpecialThrottlingConfigurationV2Request.instanceId) &&
            Objects.equals(this.throttleId, deleteSpecialThrottlingConfigurationV2Request.throttleId) &&
            Objects.equals(this.strategyId, deleteSpecialThrottlingConfigurationV2Request.strategyId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleId, strategyId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSpecialThrottlingConfigurationV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    strategyId: ").append(toIndentedString(strategyId)).append("\n");
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

