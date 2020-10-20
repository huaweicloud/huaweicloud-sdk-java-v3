package com.huaweicloud.sdk.elb.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v2.model.LoadbalancerV2Resp;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLoadbalancersResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="loadbalancers")
    
    private List<LoadbalancerV2Resp> loadbalancers = null;
    
    public ListLoadbalancersResponse withLoadbalancers(List<LoadbalancerV2Resp> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    
    public ListLoadbalancersResponse addLoadbalancersItem(LoadbalancerV2Resp loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public ListLoadbalancersResponse withLoadbalancers(Consumer<List<LoadbalancerV2Resp>> loadbalancersSetter) {
        if(this.loadbalancers == null ){
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * 负载均衡器对象列表
     * @return loadbalancers
     */
    public List<LoadbalancerV2Resp> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadbalancerV2Resp> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLoadbalancersResponse listLoadbalancersResponse = (ListLoadbalancersResponse) o;
        return Objects.equals(this.loadbalancers, listLoadbalancersResponse.loadbalancers);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loadbalancers);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLoadbalancersResponse {\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
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

