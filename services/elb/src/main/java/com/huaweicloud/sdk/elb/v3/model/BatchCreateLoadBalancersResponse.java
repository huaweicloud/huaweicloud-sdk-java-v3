package com.huaweicloud.sdk.elb.v3.model;

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
public class BatchCreateLoadBalancersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_ids")

    private List<String> loadbalancerIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public BatchCreateLoadBalancersResponse withLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
        return this;
    }

    public BatchCreateLoadBalancersResponse addLoadbalancerIdsItem(String loadbalancerIdsItem) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        this.loadbalancerIds.add(loadbalancerIdsItem);
        return this;
    }

    public BatchCreateLoadBalancersResponse withLoadbalancerIds(Consumer<List<String>> loadbalancerIdsSetter) {
        if (this.loadbalancerIds == null) {
            this.loadbalancerIds = new ArrayList<>();
        }
        loadbalancerIdsSetter.accept(this.loadbalancerIds);
        return this;
    }

    /**
     * 批创负载均衡器ID（UUID）的列表。
     * @return loadbalancerIds
     */
    public List<String> getLoadbalancerIds() {
        return loadbalancerIds;
    }

    public void setLoadbalancerIds(List<String> loadbalancerIds) {
        this.loadbalancerIds = loadbalancerIds;
    }

    public BatchCreateLoadBalancersResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 批量创建负载均衡器的job ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public BatchCreateLoadBalancersResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号[（只有批量创建包周期实例的场景返回该字段）](tag:hws)  [不支持该字段，请勿使用](tag:hws_hk,hws_eu,hws_eu_wb,hws_test,srg,fcs,fcs_vm,dt,ctc,cmcc,tm,sbc,hk_sbc,hk_tm,hk_vdf,ct)
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public BatchCreateLoadBalancersResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。 注：自动生成 。
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
        BatchCreateLoadBalancersResponse that = (BatchCreateLoadBalancersResponse) obj;
        return Objects.equals(this.loadbalancerIds, that.loadbalancerIds) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancerIds, jobId, orderId, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateLoadBalancersResponse {\n");
        sb.append("    loadbalancerIds: ").append(toIndentedString(loadbalancerIds)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
