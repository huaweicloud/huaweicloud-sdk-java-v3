package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LoadBalancerStatus
 */
public class LoadBalancerStatus {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private String provisioningStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<LoadBalancerStatusListener> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<LoadBalancerStatusPool> pools = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operating_status")

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
     * 负载均衡器的配置状态。  取值： - ACTIVE：使用中。 - PENDING_DELETE：删除中。
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
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public LoadBalancerStatus withListeners(Consumer<List<LoadBalancerStatusListener>> listenersSetter) {
        if (this.listeners == null) {
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
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public LoadBalancerStatus withPools(Consumer<List<LoadBalancerStatusPool>> poolsSetter) {
        if (this.pools == null) {
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
     * 负载均衡器ID。
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
     * 负载均衡器的操作状态。  取值： - ONLINE：创建时默认状态，表示负载均衡器正常运行。 - FROZEN：已冻结。 - DEGRADED：负载均衡器下存在member的operating_status为OFFLINE时返回这个状态。 - DISABLED：负载均衡器的admin_state_up属性值为false。  说明：DEGRADED和DISABLED状态仅在当前接口中返回，LB详情等其他接口不返回这两个状态值。
     * @return operatingStatus
     */
    public String getOperatingStatus() {
        return operatingStatus;
    }

    public void setOperatingStatus(String operatingStatus) {
        this.operatingStatus = operatingStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoadBalancerStatus that = (LoadBalancerStatus) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.provisioningStatus, that.provisioningStatus)
            && Objects.equals(this.listeners, that.listeners) && Objects.equals(this.pools, that.pools)
            && Objects.equals(this.id, that.id) && Objects.equals(this.operatingStatus, that.operatingStatus);
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
