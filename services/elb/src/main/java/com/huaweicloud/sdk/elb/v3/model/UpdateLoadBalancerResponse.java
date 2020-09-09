package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancer;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLoadBalancerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_id")
    
    private String requestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private LoadBalancer loadbalancer = null;

    public UpdateLoadBalancerResponse withRequestId(String requestId) {
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

    public UpdateLoadBalancerResponse withLoadbalancer(LoadBalancer loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public UpdateLoadBalancerResponse withLoadbalancer(Consumer<LoadBalancer> loadbalancerSetter) {
        if(this.loadbalancer == null ){
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoadBalancerResponse updateLoadBalancerResponse = (UpdateLoadBalancerResponse) o;
        return Objects.equals(this.requestId, updateLoadBalancerResponse.requestId) &&
            Objects.equals(this.loadbalancer, updateLoadBalancerResponse.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(requestId, loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadBalancerResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    loadbalancer: ").append(toIndentedString(loadbalancer)).append("\n");
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

