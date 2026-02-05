package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DdmGroupInfo
 */
public class DdmGroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private String role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_endpoint")

    private String ipv6Endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_count")

    private Integer nodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "load_balance")

    private Boolean loadBalance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_default_group")

    private Boolean isDefaultGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_map")

    private Map<String, String> extendMap = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<DdmNodeInfo> nodes = null;

    public DdmGroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：  组ID。  **参数范围**：  不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DdmGroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  名称。  **参数范围**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DdmGroupInfo withRole(String role) {
        this.role = role;
        return this;
    }

    /**
     * **参数解释**：  角色。  **参数范围**：  不涉及。
     * @return role
     */
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public DdmGroupInfo withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * **参数解释**：  组ip。  **参数范围**：  不涉及。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public DdmGroupInfo withIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
        return this;
    }

    /**
     * **参数解释**：  ipv6。  **参数范围**：  不涉及。
     * @return ipv6Endpoint
     */
    public String getIpv6Endpoint() {
        return ipv6Endpoint;
    }

    public void setIpv6Endpoint(String ipv6Endpoint) {
        this.ipv6Endpoint = ipv6Endpoint;
    }

    public DdmGroupInfo withNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }

    /**
     * **参数解释**：  节点数量。  **参数范围**：  不涉及。
     * minimum: 0
     * maximum: 2147483647
     * @return nodeCount
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    public void setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
    }

    public DdmGroupInfo withLoadBalance(Boolean loadBalance) {
        this.loadBalance = loadBalance;
        return this;
    }

    /**
     * **参数解释**：  负载均衡。  **参数范围**：  不涉及。
     * @return loadBalance
     */
    public Boolean getLoadBalance() {
        return loadBalance;
    }

    public void setLoadBalance(Boolean loadBalance) {
        this.loadBalance = loadBalance;
    }

    public DdmGroupInfo withIsDefaultGroup(Boolean isDefaultGroup) {
        this.isDefaultGroup = isDefaultGroup;
        return this;
    }

    /**
     * **参数解释**：  是否默认组。  **参数范围**：  不涉及。
     * @return isDefaultGroup
     */
    public Boolean getIsDefaultGroup() {
        return isDefaultGroup;
    }

    public void setIsDefaultGroup(Boolean isDefaultGroup) {
        this.isDefaultGroup = isDefaultGroup;
    }

    public DdmGroupInfo withExtendMap(Map<String, String> extendMap) {
        this.extendMap = extendMap;
        return this;
    }

    public DdmGroupInfo putExtendMapItem(String key, String extendMapItem) {
        if (this.extendMap == null) {
            this.extendMap = new HashMap<>();
        }
        this.extendMap.put(key, extendMapItem);
        return this;
    }

    public DdmGroupInfo withExtendMap(Consumer<Map<String, String>> extendMapSetter) {
        if (this.extendMap == null) {
            this.extendMap = new HashMap<>();
        }
        extendMapSetter.accept(this.extendMap);
        return this;
    }

    /**
     * **参数解释**：  其他信息。  **参数范围**：  不涉及。
     * @return extendMap
     */
    public Map<String, String> getExtendMap() {
        return extendMap;
    }

    public void setExtendMap(Map<String, String> extendMap) {
        this.extendMap = extendMap;
    }

    public DdmGroupInfo withNodes(List<DdmNodeInfo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public DdmGroupInfo addNodesItem(DdmNodeInfo nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public DdmGroupInfo withNodes(Consumer<List<DdmNodeInfo>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：  节点信息。  **参数范围**：  不涉及。
     * @return nodes
     */
    public List<DdmNodeInfo> getNodes() {
        return nodes;
    }

    public void setNodes(List<DdmNodeInfo> nodes) {
        this.nodes = nodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DdmGroupInfo that = (DdmGroupInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.role, that.role) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.ipv6Endpoint, that.ipv6Endpoint) && Objects.equals(this.nodeCount, that.nodeCount)
            && Objects.equals(this.loadBalance, that.loadBalance)
            && Objects.equals(this.isDefaultGroup, that.isDefaultGroup)
            && Objects.equals(this.extendMap, that.extendMap) && Objects.equals(this.nodes, that.nodes);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, role, endpoint, ipv6Endpoint, nodeCount, loadBalance, isDefaultGroup, extendMap, nodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DdmGroupInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    ipv6Endpoint: ").append(toIndentedString(ipv6Endpoint)).append("\n");
        sb.append("    nodeCount: ").append(toIndentedString(nodeCount)).append("\n");
        sb.append("    loadBalance: ").append(toIndentedString(loadBalance)).append("\n");
        sb.append("    isDefaultGroup: ").append(toIndentedString(isDefaultGroup)).append("\n");
        sb.append("    extendMap: ").append(toIndentedString(extendMap)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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
