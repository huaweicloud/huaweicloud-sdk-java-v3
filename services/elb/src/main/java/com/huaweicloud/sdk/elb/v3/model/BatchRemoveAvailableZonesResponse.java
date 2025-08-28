package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchRemoveAvailableZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadBalancer loadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public BatchRemoveAvailableZonesResponse withLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public BatchRemoveAvailableZonesResponse withLoadbalancer(Consumer<LoadBalancer> loadbalancerSetter) {
        if (this.loadbalancer == null) {
            this.loadbalancer = new LoadBalancer();
            loadbalancerSetter.accept(this.loadbalancer);
        }

        return this;
    }

    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public LoadBalancer getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
    }

    public BatchRemoveAvailableZonesResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * **参数解释**：请求ID。  **取值范围**：由数字、小写字母和中划线（-）组成的字符串，自动生成。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchRemoveAvailableZonesResponse that = (BatchRemoveAvailableZonesResponse) obj;
        return Objects.equals(this.loadbalancer, that.loadbalancer) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRemoveAvailableZonesResponse {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
