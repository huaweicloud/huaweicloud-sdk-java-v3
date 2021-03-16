package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.UpdateLoadBalancerOption;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateLoadBalancerRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private UpdateLoadBalancerOption loadbalancer;

    public UpdateLoadBalancerRequestBody withLoadbalancer(UpdateLoadBalancerOption loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public UpdateLoadBalancerRequestBody withLoadbalancer(Consumer<UpdateLoadBalancerOption> loadbalancerSetter) {
        if(this.loadbalancer == null ){
            this.loadbalancer = new UpdateLoadBalancerOption();
            loadbalancerSetter.accept(this.loadbalancer);
        }
        
        return this;
    }


    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public UpdateLoadBalancerOption getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(UpdateLoadBalancerOption loadbalancer) {
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
        UpdateLoadBalancerRequestBody updateLoadBalancerRequestBody = (UpdateLoadBalancerRequestBody) o;
        return Objects.equals(this.loadbalancer, updateLoadBalancerRequestBody.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoadBalancerRequestBody {\n");
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

