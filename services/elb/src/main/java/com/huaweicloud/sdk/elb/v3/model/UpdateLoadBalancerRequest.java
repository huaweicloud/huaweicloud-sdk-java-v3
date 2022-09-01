package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateLoadBalancerRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    @JacksonXmlProperty(localName = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    @JacksonXmlProperty(localName = "body")

    private UpdateLoadBalancerRequestBody body;

    public UpdateLoadBalancerRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * 负载均衡器ID。
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public UpdateLoadBalancerRequest withBody(UpdateLoadBalancerRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateLoadBalancerRequest withBody(Consumer<UpdateLoadBalancerRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateLoadBalancerRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateLoadBalancerRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateLoadBalancerRequestBody body) {
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
        UpdateLoadBalancerRequest updateLoadBalancerRequest = (UpdateLoadBalancerRequest) o;
        return Objects.equals(this.loadbalancerId, updateLoadBalancerRequest.loadbalancerId)
            && Objects.equals(this.body, updateLoadBalancerRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadBalancerRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
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
