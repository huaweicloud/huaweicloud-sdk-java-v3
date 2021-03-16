package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.LoadbalancerResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowLoadbalancerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private LoadbalancerResp loadbalancer;

    public ShowLoadbalancerResponse withLoadbalancer(LoadbalancerResp loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public ShowLoadbalancerResponse withLoadbalancer(Consumer<LoadbalancerResp> loadbalancerSetter) {
        if(this.loadbalancer == null ){
            this.loadbalancer = new LoadbalancerResp();
            loadbalancerSetter.accept(this.loadbalancer);
        }
        
        return this;
    }


    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public LoadbalancerResp getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadbalancerResp loadbalancer) {
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
        ShowLoadbalancerResponse showLoadbalancerResponse = (ShowLoadbalancerResponse) o;
        return Objects.equals(this.loadbalancer, showLoadbalancerResponse.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadbalancerResponse {\n");
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

