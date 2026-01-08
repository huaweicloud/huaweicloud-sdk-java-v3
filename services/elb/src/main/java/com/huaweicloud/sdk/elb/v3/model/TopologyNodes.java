package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class TopologyNodes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancers")

    private List<LoadBalancerNode> loadbalancers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eips")

    private List<EipNode> eips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listeners")

    private List<ListenerNode> listeners = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pools")

    private List<PoolNode> pools = null;

    public TopologyNodes withLoadbalancers(List<LoadBalancerNode> loadbalancers) {
        this.loadbalancers = loadbalancers;
        return this;
    }

    public TopologyNodes addLoadbalancersItem(LoadBalancerNode loadbalancersItem) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        this.loadbalancers.add(loadbalancersItem);
        return this;
    }

    public TopologyNodes withLoadbalancers(Consumer<List<LoadBalancerNode>> loadbalancersSetter) {
        if (this.loadbalancers == null) {
            this.loadbalancers = new ArrayList<>();
        }
        loadbalancersSetter.accept(this.loadbalancers);
        return this;
    }

    /**
     * **取值范围**：拓扑LB节点信息。
     * @return loadbalancers
     */
    public List<LoadBalancerNode> getLoadbalancers() {
        return loadbalancers;
    }

    public void setLoadbalancers(List<LoadBalancerNode> loadbalancers) {
        this.loadbalancers = loadbalancers;
    }

    public TopologyNodes withEips(List<EipNode> eips) {
        this.eips = eips;
        return this;
    }

    public TopologyNodes addEipsItem(EipNode eipsItem) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        this.eips.add(eipsItem);
        return this;
    }

    public TopologyNodes withEips(Consumer<List<EipNode>> eipsSetter) {
        if (this.eips == null) {
            this.eips = new ArrayList<>();
        }
        eipsSetter.accept(this.eips);
        return this;
    }

    /**
     * **取值范围**：拓扑EIP节点信息。
     * @return eips
     */
    public List<EipNode> getEips() {
        return eips;
    }

    public void setEips(List<EipNode> eips) {
        this.eips = eips;
    }

    public TopologyNodes withListeners(List<ListenerNode> listeners) {
        this.listeners = listeners;
        return this;
    }

    public TopologyNodes addListenersItem(ListenerNode listenersItem) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        this.listeners.add(listenersItem);
        return this;
    }

    public TopologyNodes withListeners(Consumer<List<ListenerNode>> listenersSetter) {
        if (this.listeners == null) {
            this.listeners = new ArrayList<>();
        }
        listenersSetter.accept(this.listeners);
        return this;
    }

    /**
     * **取值范围**：拓扑监听器节点信息。
     * @return listeners
     */
    public List<ListenerNode> getListeners() {
        return listeners;
    }

    public void setListeners(List<ListenerNode> listeners) {
        this.listeners = listeners;
    }

    public TopologyNodes withPools(List<PoolNode> pools) {
        this.pools = pools;
        return this;
    }

    public TopologyNodes addPoolsItem(PoolNode poolsItem) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        this.pools.add(poolsItem);
        return this;
    }

    public TopologyNodes withPools(Consumer<List<PoolNode>> poolsSetter) {
        if (this.pools == null) {
            this.pools = new ArrayList<>();
        }
        poolsSetter.accept(this.pools);
        return this;
    }

    /**
     * **取值范围**：拓扑后端服务器组节点信息。
     * @return pools
     */
    public List<PoolNode> getPools() {
        return pools;
    }

    public void setPools(List<PoolNode> pools) {
        this.pools = pools;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopologyNodes that = (TopologyNodes) obj;
        return Objects.equals(this.loadbalancers, that.loadbalancers) && Objects.equals(this.eips, that.eips)
            && Objects.equals(this.listeners, that.listeners) && Objects.equals(this.pools, that.pools);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loadbalancers, eips, listeners, pools);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopologyNodes {\n");
        sb.append("    loadbalancers: ").append(toIndentedString(loadbalancers)).append("\n");
        sb.append("    eips: ").append(toIndentedString(eips)).append("\n");
        sb.append("    listeners: ").append(toIndentedString(listeners)).append("\n");
        sb.append("    pools: ").append(toIndentedString(pools)).append("\n");
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
