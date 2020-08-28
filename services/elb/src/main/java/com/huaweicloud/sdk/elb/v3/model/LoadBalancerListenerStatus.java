package com.huaweicloud.sdk.elb.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerPolicyStatus;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerPoolStatus;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * lb状态树的监听器状态信息
 */
public class LoadBalancerListenerStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus = "ACTIVE";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<LoadBalancerPoolStatus> pools = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="l7policies")
    
    private List<LoadBalancerPolicyStatus> l7policies = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;

    public LoadBalancerListenerStatus withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器下监听器的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoadBalancerListenerStatus withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * provisioning状态。 可以为ACTIVE、PENDING_CREATE 或者ERROR。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public LoadBalancerListenerStatus withPools(List<LoadBalancerPoolStatus> pools) {
        this.pools = pools;
        return this;
    }

    
    public LoadBalancerListenerStatus addPoolsItem(LoadBalancerPoolStatus poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancerListenerStatus withPools(Consumer<List<LoadBalancerPoolStatus>> poolsSetter) {
        if(this.pools == null ){
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 挂载在监听器下的后端主机组。
     * @return pools
     */
    public List<LoadBalancerPoolStatus> getPools() {
        return pools;
    }

    public void setPools(List<LoadBalancerPoolStatus> pools) {
        this.pools = pools;
    }

    public LoadBalancerListenerStatus withL7policies(List<LoadBalancerPolicyStatus> l7policies) {
        this.l7policies = l7policies;
        return this;
    }

    
    public LoadBalancerListenerStatus addL7policiesItem(LoadBalancerPolicyStatus l7policiesItem) {
        if (this.l7policies == null) {
            this.l7policies = new ArrayList<>();
        }
        this.l7policies.add(l7policiesItem);
        return this;
    }

    public LoadBalancerListenerStatus withL7policies(Consumer<List<LoadBalancerPolicyStatus>> l7policiesSetter) {
        if(this.l7policies == null ){
            this.l7policies = new ArrayList<>();
        }
        l7policiesSetter.accept(this.l7policies);
        return this;
    }

    /**
     * 7层转发策略
     * @return l7policies
     */
    public List<LoadBalancerPolicyStatus> getL7policies() {
        return l7policies;
    }

    public void setL7policies(List<LoadBalancerPolicyStatus> l7policies) {
        this.l7policies = l7policies;
    }

    public LoadBalancerListenerStatus withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 监听器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LoadBalancerListenerStatus withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 操作状态。 可以为：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。说明：该字段为预留字段，暂未启用，默认为ONLINE。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoadBalancerListenerStatus loadBalancerListenerStatus = (LoadBalancerListenerStatus) o;
        return Objects.equals(this.name, loadBalancerListenerStatus.name) &&
            Objects.equals(this.provisioningStatus, loadBalancerListenerStatus.provisioningStatus) &&
            Objects.equals(this.pools, loadBalancerListenerStatus.pools) &&
            Objects.equals(this.l7policies, loadBalancerListenerStatus.l7policies) &&
            Objects.equals(this.id, loadBalancerListenerStatus.id) &&
            Objects.equals(this.operatingStatus, loadBalancerListenerStatus.operatingStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, provisioningStatus, pools, l7policies, id, operatingStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerListenerStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
        sb.append("    l7policies: ").append(toIndentedString(l7policies)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    operatingStatus: ").append(toIndentedString(operatingStatus)).append("\n");
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

