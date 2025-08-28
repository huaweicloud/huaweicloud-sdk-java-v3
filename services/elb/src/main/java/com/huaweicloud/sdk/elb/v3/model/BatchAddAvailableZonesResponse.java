package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class BatchAddAvailableZonesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer")

    private LoadBalancer loadbalancer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public BatchAddAvailableZonesResponse withLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public BatchAddAvailableZonesResponse withLoadbalancer(Consumer<LoadBalancer> loadbalancerSetter) {
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

    public BatchAddAvailableZonesResponse withRequestId(String requestId) {
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

    public BatchAddAvailableZonesResponse withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器的ID。[（包周期场景返回该字段）](tag:hws)  **取值范围**：不涉及  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,srg,fcs,fcs_vm,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,ct)
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public BatchAddAvailableZonesResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * **参数解释**：订单号。[（包周期规格变更场景返回该字段）](tag:hws)  **取值范围**：不涉及  [不支持该字段，请勿使用。](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,srg,fcs,fcs_vm,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,ct)
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddAvailableZonesResponse that = (BatchAddAvailableZonesResponse) obj;
        return Objects.equals(this.loadbalancer, that.loadbalancer) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.loadbalancerId, that.loadbalancerId) && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer, requestId, loadbalancerId, orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddAvailableZonesResponse {\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
