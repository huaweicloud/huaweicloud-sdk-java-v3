package com.huaweicloud.sdk.apig.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.apig.v2.model.ThrottleBindingResp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class AssociateRequestThrottlingPolicyV2Response extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="throttle_applys")
    
    private List<ThrottleBindingResp> throttleApplys = null;
    
    public AssociateRequestThrottlingPolicyV2Response withThrottleApplys(List<ThrottleBindingResp> throttleApplys) {
        this.throttleApplys = throttleApplys;
        return this;
    }

    
    public AssociateRequestThrottlingPolicyV2Response addThrottleApplysItem(ThrottleBindingResp throttleApplysItem) {
        this.throttleApplys.add(throttleApplysItem);
        return this;
    }

    public AssociateRequestThrottlingPolicyV2Response withThrottleApplys(Consumer<List<ThrottleBindingResp>> throttleApplysSetter) {
        if(this.throttleApplys == null ){
            this.throttleApplys = new ArrayList<>();
        }
        throttleApplysSetter.accept(this.throttleApplys);
        return this;
    }

    /**
     * API与流控策略的绑定关系列表
     * @return throttleApplys
     */
    public List<ThrottleBindingResp> getThrottleApplys() {
        return throttleApplys;
    }

    public void setThrottleApplys(List<ThrottleBindingResp> throttleApplys) {
        this.throttleApplys = throttleApplys;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2Response = (AssociateRequestThrottlingPolicyV2Response) o;
        return Objects.equals(this.throttleApplys, associateRequestThrottlingPolicyV2Response.throttleApplys);
    }
    @Override
    public int hashCode() {
        return Objects.hash(throttleApplys);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateRequestThrottlingPolicyV2Response {\n");
        sb.append("    throttleApplys: ").append(toIndentedString(throttleApplys)).append("\n");
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

