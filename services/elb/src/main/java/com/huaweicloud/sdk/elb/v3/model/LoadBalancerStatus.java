package com.huaweicloud.sdk.elb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatusListener;
import com.huaweicloud.sdk.elb.v3.model.LoadBalancerStatusPool;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class LoadBalancerStatus  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="provisioning_status")
    
    private String provisioningStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="listeners")
    
    private List<LoadBalancerStatusListener> listeners = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pools")
    
    private List<LoadBalancerStatusPool> pools = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="operating_status")
    
    private String operatingStatus;

    public LoadBalancerStatus withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 负载均衡器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public LoadBalancerStatus withProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    


    /**
     * 负载均衡器的配置状态。 可以为：ACTIVE、PENDING_CREATE 或者ERROR。说明：该字段为预留字段，暂未启用，默认为ACTIVE。
     * @return provisioningStatus
     */
    public String getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(String provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    

    public LoadBalancerStatus withListeners(List<LoadBalancerStatusListener> listeners) {
        this.listeners = listeners;
        return this;
    }

    
    public LoadBalancerStatus addListenersItem(LoadBalancerStatusListener listenersItem) {
        if(this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadBalancerStatus withListeners(Consumer<List<LoadBalancerStatusListener>> listenersSetter) {
        if(this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * 负载均衡器关联的监听器列表。
     * @return listeners
     */
    public List<LoadBalancerStatusListener> getListeners() {
        return listeners;
    }

    public void setListeners(List<LoadBalancerStatusListener> listeners) {
        this.listeners = listeners;
    }

    

    public LoadBalancerStatus withPools(List<LoadBalancerStatusPool> pools) {
        this.pools = pools;
        return this;
    }

    
    public LoadBalancerStatus addPoolsItem(LoadBalancerStatusPool poolsItem) {
        if(this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancerStatus withPools(Consumer<List<LoadBalancerStatusPool>> poolsSetter) {
        if(this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * 负载均衡器关联的后端云服务器组列表。
     * @return pools
     */
    public List<LoadBalancerStatusPool> getPools() {
        return pools;
    }

    public void setPools(List<LoadBalancerStatusPool> pools) {
        this.pools = pools;
    }

    

    public LoadBalancerStatus withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 负载均衡器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public LoadBalancerStatus withOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
        return this;
    }

    


    /**
     * 负载均衡器的操作状态。 可以为：ONLINE、OFFLINE、DEGRADED、DISABLED或NO_MONITOR。说明：该字段为预留字段，暂未启用，默认为ONLINE。
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
        LoadBalancerStatus loadBalancerStatus = (LoadBalancerStatus) o;
        return Objects.equals(this.name, loadBalancerStatus.name) &&
            Objects.equals(this.provisioningStatus, loadBalancerStatus.provisioningStatus) &&
            Objects.equals(this.listeners, loadBalancerStatus.listeners) &&
            Objects.equals(this.pools, loadBalancerStatus.pools) &&
            Objects.equals(this.id, loadBalancerStatus.id) &&
            Objects.equals(this.operatingStatus, loadBalancerStatus.operatingStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, provisioningStatus, listeners, pools, id, operatingStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoadBalancerStatus {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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

