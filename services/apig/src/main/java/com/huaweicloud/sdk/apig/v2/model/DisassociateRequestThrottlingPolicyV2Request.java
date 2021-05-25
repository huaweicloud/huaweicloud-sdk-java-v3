package com.huaweicloud.sdk.apig.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DisassociateRequestThrottlingPolicyV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_binding_id")
    
    private String throttleBindingId;

    public DisassociateRequestThrottlingPolicyV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例编号
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public DisassociateRequestThrottlingPolicyV2Request withThrottleBindingId(String throttleBindingId) {
        this.throttleBindingId = throttleBindingId;
        return this;
    }

    


    /**
     * API和流控策略绑定关系的ID。
     * @return throttleBindingId
     */
    public String getThrottleBindingId() {
        return throttleBindingId;
    }

    public void setThrottleBindingId(String throttleBindingId) {
        this.throttleBindingId = throttleBindingId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateRequestThrottlingPolicyV2Request disassociateRequestThrottlingPolicyV2Request = (DisassociateRequestThrottlingPolicyV2Request) o;
        return Objects.equals(this.instanceId, disassociateRequestThrottlingPolicyV2Request.instanceId) &&
            Objects.equals(this.throttleBindingId, disassociateRequestThrottlingPolicyV2Request.throttleBindingId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleBindingId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateRequestThrottlingPolicyV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleBindingId: ").append(toIndentedString(throttleBindingId)).append("\n");
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

