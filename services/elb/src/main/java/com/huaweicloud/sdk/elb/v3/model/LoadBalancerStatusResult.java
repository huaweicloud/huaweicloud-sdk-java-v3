package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatus;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoadBalancerStatusResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private LoadBalancerStatus loadbalancer = null;

    public LoadBalancerStatusResult withLoadbalancer(LoadBalancerStatus loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public LoadBalancerStatusResult withLoadbalancer(Consumer<LoadBalancerStatus> loadbalancerSetter) {
        if(this.loadbalancer == null ){
            this.loadbalancer = new LoadBalancerStatus();
            loadbalancerSetter.accept(this.loadbalancer);
        }
        
        return this;
    }


    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public LoadBalancerStatus getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadBalancerStatus loadbalancer) {
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
        LoadBalancerStatusResult loadBalancerStatusResult = (LoadBalancerStatusResult) o;
        return Objects.equals(this.loadbalancer, loadBalancerStatusResult.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatusResult {\n");
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

