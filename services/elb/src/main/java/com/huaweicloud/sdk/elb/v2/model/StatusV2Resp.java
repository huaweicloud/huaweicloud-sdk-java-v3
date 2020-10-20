package com.huaweicloud.sdk.elb.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.LoadbalancerV2InStatusResp;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 负载均衡器状态树对象
 */
public class StatusV2Resp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancer")
    
    private LoadbalancerV2InStatusResp loadbalancer = null;

    public StatusV2Resp withLoadbalancer(LoadbalancerV2InStatusResp loadbalancer) {
        this.loadbalancer = loadbalancer;
        return this;
    }

    public StatusV2Resp withLoadbalancer(Consumer<LoadbalancerV2InStatusResp> loadbalancerSetter) {
        if(this.loadbalancer == null ){
            this.loadbalancer = new LoadbalancerV2InStatusResp();
            loadbalancerSetter.accept(this.loadbalancer);
        }
        
        return this;
    }


    /**
     * Get loadbalancer
     * @return loadbalancer
     */
    public LoadbalancerV2InStatusResp getLoadbalancer() {
        return loadbalancer;
    }

    public void setLoadbalancer(LoadbalancerV2InStatusResp loadbalancer) {
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
        StatusV2Resp statusV2Resp = (StatusV2Resp) o;
        return Objects.equals(this.loadbalancer, statusV2Resp.loadbalancer);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancer);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StatusV2Resp {\n");
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

