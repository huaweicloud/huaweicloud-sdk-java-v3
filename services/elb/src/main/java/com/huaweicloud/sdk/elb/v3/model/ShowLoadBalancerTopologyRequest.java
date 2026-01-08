package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowLoadBalancerTopologyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loadbalancer_id")

    private String loadbalancerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_name")

    private String listenerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_protocol")

    private String listenerProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_protocol_port")

    private Integer listenerProtocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    public ShowLoadBalancerTopologyRequest withLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
        return this;
    }

    /**
     * **参数解释**：负载均衡器ID。  **约束限制**：不涉及  **取值范围**：不涉及  **默认取值**：不涉及
     * @return loadbalancerId
     */
    public String getLoadbalancerId() {
        return loadbalancerId;
    }

    public void setLoadbalancerId(String loadbalancerId) {
        this.loadbalancerId = loadbalancerId;
    }

    public ShowLoadBalancerTopologyRequest withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 监听器的ID。  支持多值查询，查询条件格式：*listener_id=xxx&listener_id=xxx*。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public ShowLoadBalancerTopologyRequest withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 后端服务器组的ID。  支持多值查询，查询条件格式：*pool_id=xxx&pool_id=xxx*。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ShowLoadBalancerTopologyRequest withListenerName(String listenerName) {
        this.listenerName = listenerName;
        return this;
    }

    /**
     * 监听器的名称。  支持多值查询，查询条件格式：*listener_name=xxx&listener_name=xxx*。
     * @return listenerName
     */
    public String getListenerName() {
        return listenerName;
    }

    public void setListenerName(String listenerName) {
        this.listenerName = listenerName;
    }

    public ShowLoadBalancerTopologyRequest withListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }

    /**
     * 监听器的协议。  支持多值查询，查询条件格式：*listener_protocol=xxx&listener_protocol=xxx*。
     * @return listenerProtocol
     */
    public String getListenerProtocol() {
        return listenerProtocol;
    }

    public void setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
    }

    public ShowLoadBalancerTopologyRequest withListenerProtocolPort(Integer listenerProtocolPort) {
        this.listenerProtocolPort = listenerProtocolPort;
        return this;
    }

    /**
     * 监听器的监听端口。  支持多值查询，查询条件格式：*listener_protocol_port=xxx&listener_protocol_port=xxx*。
     * @return listenerProtocolPort
     */
    public Integer getListenerProtocolPort() {
        return listenerProtocolPort;
    }

    public void setListenerProtocolPort(Integer listenerProtocolPort) {
        this.listenerProtocolPort = listenerProtocolPort;
    }

    public ShowLoadBalancerTopologyRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * 后端服务器组的名称。  支持多值查询，查询条件格式：*pool_name=xxx&pool_name=xxx*。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLoadBalancerTopologyRequest that = (ShowLoadBalancerTopologyRequest) obj;
        return Objects.equals(this.loadbalancerId, that.loadbalancerId)
            && Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.listenerName, that.listenerName)
            && Objects.equals(this.listenerProtocol, that.listenerProtocol)
            && Objects.equals(this.listenerProtocolPort, that.listenerProtocolPort)
            && Objects.equals(this.poolName, that.poolName);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(loadbalancerId, listenerId, poolId, listenerName, listenerProtocol, listenerProtocolPort, poolName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLoadBalancerTopologyRequest {\n");
        sb.append("    loadbalancerId: ").append(toIndentedString(loadbalancerId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    listenerName: ").append(toIndentedString(listenerName)).append("\n");
        sb.append("    listenerProtocol: ").append(toIndentedString(listenerProtocol)).append("\n");
        sb.append("    listenerProtocolPort: ").append(toIndentedString(listenerProtocolPort)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
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
