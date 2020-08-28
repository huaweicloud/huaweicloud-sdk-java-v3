package com.huaweicloud.sdk.elb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatusResult;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowLoadBalancerStatusResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="statuses")
    
    private LoadBalancerStatusResult statuses = null;

    public ShowLoadBalancerStatusResponse withStatuses(LoadBalancerStatusResult statuses) {
        this.statuses = statuses;
        return this;
    }

    public ShowLoadBalancerStatusResponse withStatuses(Consumer<LoadBalancerStatusResult> statusesSetter) {
        if(this.statuses == null ){
            this.statuses = new LoadBalancerStatusResult();
            statusesSetter.accept(this.statuses);
        }
        
        return this;
    }


    /**
     * Get statuses
     * @return statuses
     */
    public LoadBalancerStatusResult getStatuses() {
        return statuses;
    }

    public void setStatuses(LoadBalancerStatusResult statuses) {
        this.statuses = statuses;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowLoadBalancerStatusResponse showLoadBalancerStatusResponse = (ShowLoadBalancerStatusResponse) o;
        return Objects.equals(this.statuses, showLoadBalancerStatusResponse.statuses);
    }
    @Override
    public int hashCode() {
        return Objects.hash(statuses);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadBalancerStatusResponse {\n");
        sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

