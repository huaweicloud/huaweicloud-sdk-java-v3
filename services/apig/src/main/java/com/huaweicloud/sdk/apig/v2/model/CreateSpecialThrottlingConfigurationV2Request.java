package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class CreateSpecialThrottlingConfigurationV2Request {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "throttle_id")

    private String throttleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ThrottleSpecialCreate body;

    public CreateSpecialThrottlingConfigurationV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /** 实例ID
     * 
     * @return instanceId */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public CreateSpecialThrottlingConfigurationV2Request withThrottleId(String throttleId) {
        this.throttleId = throttleId;
        return this;
    }

    /** 流控策略的编号
     * 
     * @return throttleId */
    public String getThrottleId() {
        return throttleId;
    }

    public void setThrottleId(String throttleId) {
        this.throttleId = throttleId;
    }

    public CreateSpecialThrottlingConfigurationV2Request withBody(ThrottleSpecialCreate body) {
        this.body = body;
        return this;
    }

    public CreateSpecialThrottlingConfigurationV2Request withBody(Consumer<ThrottleSpecialCreate> bodySetter) {
        if (this.body == null) {
            this.body = new ThrottleSpecialCreate();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ThrottleSpecialCreate getBody() {
        return body;
    }

    public void setBody(ThrottleSpecialCreate body) {
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
        CreateSpecialThrottlingConfigurationV2Request createSpecialThrottlingConfigurationV2Request =
            (CreateSpecialThrottlingConfigurationV2Request) o;
        return Objects.equals(this.instanceId, createSpecialThrottlingConfigurationV2Request.instanceId)
            && Objects.equals(this.throttleId, createSpecialThrottlingConfigurationV2Request.throttleId)
            && Objects.equals(this.body, createSpecialThrottlingConfigurationV2Request.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, throttleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpecialThrottlingConfigurationV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    throttleId: ").append(toIndentedString(throttleId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
