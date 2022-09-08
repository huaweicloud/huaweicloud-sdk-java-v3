package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class AssociateRequestThrottlingPolicyV2Response extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_applys")

    private List<ThrottleApiBinding> throttleApplys = null;

    public AssociateRequestThrottlingPolicyV2Response withThrottleApplys(List<ThrottleApiBinding> throttleApplys) {
        this.throttleApplys = throttleApplys;
        return this;
    }

    public AssociateRequestThrottlingPolicyV2Response addThrottleApplysItem(ThrottleApiBinding throttleApplysItem) {
        if (this.throttleApplys == null) {
            this.throttleApplys = new ArrayList<>();
        }
        this.throttleApplys.add(throttleApplysItem);
        return this;
    }

    public AssociateRequestThrottlingPolicyV2Response withThrottleApplys(
        Consumer<List<ThrottleApiBinding>> throttleApplysSetter) {
        if (this.throttleApplys == null) {
            this.throttleApplys = new ArrayList<>();
        }
        throttleApplysSetter.accept(this.throttleApplys);
        return this;
    }

    /**
     * API与流控策略的绑定关系列表
     * @return throttleApplys
     */
    public List<ThrottleApiBinding> getThrottleApplys() {
        return throttleApplys;
    }

    public void setThrottleApplys(List<ThrottleApiBinding> throttleApplys) {
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
        AssociateRequestThrottlingPolicyV2Response associateRequestThrottlingPolicyV2Response =
            (AssociateRequestThrottlingPolicyV2Response) o;
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
