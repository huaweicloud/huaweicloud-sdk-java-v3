package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * NodesInfoResp
 */
public class NodesInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_node_id")

    @JacksonXmlProperty(localName = "logical_node_id")

    private String logicalNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    /**
     * 节点状态，所有值如下: - Creating：创建中。 - Active：运行中。 - Inactive：故障。 - Deleting：删除中。 - AddSharding：添加分片中。 
     */
    public static final class StatusEnum {

        /**
         * Enum CREATING for value: "Creating"
         */
        public static final StatusEnum CREATING = new StatusEnum("Creating");

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("Active");

        /**
         * Enum INACTIVE for value: "Inactive"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("Inactive");

        /**
         * Enum DELETING for value: "Deleting"
         */
        public static final StatusEnum DELETING = new StatusEnum("Deleting");

        /**
         * Enum ADDSHARDING for value: "AddSharding"
         */
        public static final StatusEnum ADDSHARDING = new StatusEnum("AddSharding");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Creating", CREATING);
            map.put("Active", ACTIVE);
            map.put("Inactive", INACTIVE);
            map.put("Deleting", DELETING);
            map.put("AddSharding", ADDSHARDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "az_code")

    @JacksonXmlProperty(localName = "az_code")

    private String azCode;

    /**
     * 节点角色，所有值如下: - redis-server：Redis server节点。 - redis-proxy：proxy节点。 
     */
    public static final class NodeRoleEnum {

        /**
         * Enum REDIS_SERVER for value: "redis-server"
         */
        public static final NodeRoleEnum REDIS_SERVER = new NodeRoleEnum("redis-server");

        /**
         * Enum REDIS_PROXY for value: "redis-proxy"
         */
        public static final NodeRoleEnum REDIS_PROXY = new NodeRoleEnum("redis-proxy");

        private static final Map<String, NodeRoleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeRoleEnum> createStaticFields() {
            Map<String, NodeRoleEnum> map = new HashMap<>();
            map.put("redis-server", REDIS_SERVER);
            map.put("redis-proxy", REDIS_PROXY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeRoleEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NodeRoleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NodeRoleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodeRoleEnum(value);
            }
            return result;
        }

        public static NodeRoleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NodeRoleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeRoleEnum) {
                return this.value.equals(((NodeRoleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_role")

    @JacksonXmlProperty(localName = "node_role")

    private NodeRoleEnum nodeRole;

    /**
     * 节点主从角色: - master：主 - slave：从 - proxy: proxy实例节点角色为\"proxy\" 
     */
    public static final class NodeTypeEnum {

        /**
         * Enum MASTER for value: "master"
         */
        public static final NodeTypeEnum MASTER = new NodeTypeEnum("master");

        /**
         * Enum SLAVE for value: "slave"
         */
        public static final NodeTypeEnum SLAVE = new NodeTypeEnum("slave");

        /**
         * Enum PROXY for value: "proxy"
         */
        public static final NodeTypeEnum PROXY = new NodeTypeEnum("proxy");

        private static final Map<String, NodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodeTypeEnum> createStaticFields() {
            Map<String, NodeTypeEnum> map = new HashMap<>();
            map.put("master", MASTER);
            map.put("slave", SLAVE);
            map.put("proxy", PROXY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodeTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new NodeTypeEnum(value);
            }
            return result;
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            NodeTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodeTypeEnum) {
                return this.value.equals(((NodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    @JacksonXmlProperty(localName = "node_type")

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ip")

    @JacksonXmlProperty(localName = "node_ip")

    private String nodeIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_port")

    @JacksonXmlProperty(localName = "node_port")

    private String nodePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    @JacksonXmlProperty(localName = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_weight")

    @JacksonXmlProperty(localName = "priority_weight")

    private Integer priorityWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_access")

    @JacksonXmlProperty(localName = "is_access")

    private Boolean isAccess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    @JacksonXmlProperty(localName = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    @JacksonXmlProperty(localName = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_remove_ip")

    @JacksonXmlProperty(localName = "is_remove_ip")

    private Boolean isRemoveIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    @JacksonXmlProperty(localName = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<InstanceReplicationDimensionsInfo> dimensions = null;

    public NodesInfoResp withLogicalNodeId(String logicalNodeId) {
        this.logicalNodeId = logicalNodeId;
        return this;
    }

    /**
     * 逻辑节点ID
     * @return logicalNodeId
     */
    public String getLogicalNodeId() {
        return logicalNodeId;
    }

    public void setLogicalNodeId(String logicalNodeId) {
        this.logicalNodeId = logicalNodeId;
    }

    public NodesInfoResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NodesInfoResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 节点状态，所有值如下: - Creating：创建中。 - Active：运行中。 - Inactive：故障。 - Deleting：删除中。 - AddSharding：添加分片中。 
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NodesInfoResp withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 可用区code
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public NodesInfoResp withNodeRole(NodeRoleEnum nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }

    /**
     * 节点角色，所有值如下: - redis-server：Redis server节点。 - redis-proxy：proxy节点。 
     * @return nodeRole
     */
    public NodeRoleEnum getNodeRole() {
        return nodeRole;
    }

    public void setNodeRole(NodeRoleEnum nodeRole) {
        this.nodeRole = nodeRole;
    }

    public NodesInfoResp withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点主从角色: - master：主 - slave：从 - proxy: proxy实例节点角色为\"proxy\" 
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public NodesInfoResp withNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
        return this;
    }

    /**
     * 节点的IP
     * @return nodeIp
     */
    public String getNodeIp() {
        return nodeIp;
    }

    public void setNodeIp(String nodeIp) {
        this.nodeIp = nodeIp;
    }

    public NodesInfoResp withNodePort(String nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    /**
     * 节点的port
     * @return nodePort
     */
    public String getNodePort() {
        return nodePort;
    }

    public void setNodePort(String nodePort) {
        this.nodePort = nodePort;
    }

    public NodesInfoResp withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public NodesInfoResp withPriorityWeight(Integer priorityWeight) {
        this.priorityWeight = priorityWeight;
        return this;
    }

    /**
     * 节点权重
     * @return priorityWeight
     */
    public Integer getPriorityWeight() {
        return priorityWeight;
    }

    public void setPriorityWeight(Integer priorityWeight) {
        this.priorityWeight = priorityWeight;
    }

    public NodesInfoResp withIsAccess(Boolean isAccess) {
        this.isAccess = isAccess;
        return this;
    }

    /**
     * 节点的IP是否可直接访问
     * @return isAccess
     */
    public Boolean getIsAccess() {
        return isAccess;
    }

    public void setIsAccess(Boolean isAccess) {
        this.isAccess = isAccess;
    }

    public NodesInfoResp withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分片ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public NodesInfoResp withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 分片名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public NodesInfoResp withIsRemoveIp(Boolean isRemoveIp) {
        this.isRemoveIp = isRemoveIp;
        return this;
    }

    /**
     * 是否从只读域名中摘除IP
     * @return isRemoveIp
     */
    public Boolean getIsRemoveIp() {
        return isRemoveIp;
    }

    public void setIsRemoveIp(Boolean isRemoveIp) {
        this.isRemoveIp = isRemoveIp;
    }

    public NodesInfoResp withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 副本id
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public NodesInfoResp withDimensions(List<InstanceReplicationDimensionsInfo> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public NodesInfoResp addDimensionsItem(InstanceReplicationDimensionsInfo dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public NodesInfoResp withDimensions(Consumer<List<InstanceReplicationDimensionsInfo>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 副本对应的监控指标维度信息。可用于调用云监控服务的查询监控数据指标相关接口 - 副本的监控维度为多维度，返回数组中包含两个维度信息。从云监控查询监控数据时，要按多维度传递指标维度参数，才能查询到监控指标值 - 第一个维度为副本父维度信息 维度名称为dcs_instance_id，维度值对应副本所在的实例ID - 第二个维度，维度名称为dcs_cluster_redis_node,维度值为副本的监控对象ID，与副本ID和节点ID不同。 
     * @return dimensions
     */
    public List<InstanceReplicationDimensionsInfo> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<InstanceReplicationDimensionsInfo> dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NodesInfoResp nodesInfoResp = (NodesInfoResp) o;
        return Objects.equals(this.logicalNodeId, nodesInfoResp.logicalNodeId)
            && Objects.equals(this.name, nodesInfoResp.name) && Objects.equals(this.status, nodesInfoResp.status)
            && Objects.equals(this.azCode, nodesInfoResp.azCode)
            && Objects.equals(this.nodeRole, nodesInfoResp.nodeRole)
            && Objects.equals(this.nodeType, nodesInfoResp.nodeType)
            && Objects.equals(this.nodeIp, nodesInfoResp.nodeIp)
            && Objects.equals(this.nodePort, nodesInfoResp.nodePort)
            && Objects.equals(this.nodeId, nodesInfoResp.nodeId)
            && Objects.equals(this.priorityWeight, nodesInfoResp.priorityWeight)
            && Objects.equals(this.isAccess, nodesInfoResp.isAccess)
            && Objects.equals(this.groupId, nodesInfoResp.groupId)
            && Objects.equals(this.groupName, nodesInfoResp.groupName)
            && Objects.equals(this.isRemoveIp, nodesInfoResp.isRemoveIp)
            && Objects.equals(this.replicationId, nodesInfoResp.replicationId)
            && Objects.equals(this.dimensions, nodesInfoResp.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalNodeId,
            name,
            status,
            azCode,
            nodeRole,
            nodeType,
            nodeIp,
            nodePort,
            nodeId,
            priorityWeight,
            isAccess,
            groupId,
            groupName,
            isRemoveIp,
            replicationId,
            dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodesInfoResp {\n");
        sb.append("    logicalNodeId: ").append(toIndentedString(logicalNodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
        sb.append("    nodeRole: ").append(toIndentedString(nodeRole)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    nodeIp: ").append(toIndentedString(nodeIp)).append("\n");
        sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    priorityWeight: ").append(toIndentedString(priorityWeight)).append("\n");
        sb.append("    isAccess: ").append(toIndentedString(isAccess)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    isRemoveIp: ").append(toIndentedString(isRemoveIp)).append("\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
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
