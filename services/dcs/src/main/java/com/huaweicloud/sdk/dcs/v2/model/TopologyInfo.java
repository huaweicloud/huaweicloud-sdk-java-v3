package com.huaweicloud.sdk.dcs.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 拓扑详情
 */
public class TopologyInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    /**
     * **参数解释**： 节点主从角色。 **取值范围**： master：主节点 slave：从节点 proxy：proxy节点 
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodeTypeEnum(value));
        }

        public static NodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private NodeTypeEnum nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_memory")

    private String maxMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_memory")

    private String usedMemory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private String qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandwidth")

    private BandWidth bandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_num")

    private String dbNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dbs")

    private KeySpace dbs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_ip")

    private String relationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_port")

    private String relationPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dims")

    private DimsInfo dims;

    public TopologyInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * **参数解释**： 节点ID。 **取值范围**： 不涉及。 
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TopologyInfo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**： 节点名称。 **取值范围**： 不涉及。 
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TopologyInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * **参数解释**： 节点IP。 **取值范围**： 不涉及。 
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public TopologyInfo withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 节点端口。 **取值范围**： 不涉及。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public TopologyInfo withNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * **参数解释**： 节点主从角色。 **取值范围**： master：主节点 slave：从节点 proxy：proxy节点 
     * @return nodeType
     */
    public NodeTypeEnum getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeTypeEnum nodeType) {
        this.nodeType = nodeType;
    }

    public TopologyInfo withMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }

    /**
     * **参数解释**： 总内存，单位：MB。 **取值范围**： 不涉及。 
     * @return maxMemory
     */
    public String getMaxMemory() {
        return maxMemory;
    }

    public void setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
    }

    public TopologyInfo withUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
        return this;
    }

    /**
     * **参数解释**： 已使用的内存，单位：MB。 **取值范围**： 不涉及。 
     * @return usedMemory
     */
    public String getUsedMemory() {
        return usedMemory;
    }

    public void setUsedMemory(String usedMemory) {
        this.usedMemory = usedMemory;
    }

    public TopologyInfo withQps(String qps) {
        this.qps = qps;
        return this;
    }

    /**
     * **参数解释**： 每秒查询率。 **取值范围**： 不涉及。 
     * @return qps
     */
    public String getQps() {
        return qps;
    }

    public void setQps(String qps) {
        this.qps = qps;
    }

    public TopologyInfo withBandwidth(BandWidth bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }

    public TopologyInfo withBandwidth(Consumer<BandWidth> bandwidthSetter) {
        if (this.bandwidth == null) {
            this.bandwidth = new BandWidth();
            bandwidthSetter.accept(this.bandwidth);
        }

        return this;
    }

    /**
     * Get bandwidth
     * @return bandwidth
     */
    public BandWidth getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(BandWidth bandwidth) {
        this.bandwidth = bandwidth;
    }

    public TopologyInfo withDbNum(String dbNum) {
        this.dbNum = dbNum;
        return this;
    }

    /**
     * **参数解释**： 该实例的DB数量。 **取值范围**： 不涉及。 
     * @return dbNum
     */
    public String getDbNum() {
        return dbNum;
    }

    public void setDbNum(String dbNum) {
        this.dbNum = dbNum;
    }

    public TopologyInfo withDbs(KeySpace dbs) {
        this.dbs = dbs;
        return this;
    }

    public TopologyInfo withDbs(Consumer<KeySpace> dbsSetter) {
        if (this.dbs == null) {
            this.dbs = new KeySpace();
            dbsSetter.accept(this.dbs);
        }

        return this;
    }

    /**
     * Get dbs
     * @return dbs
     */
    public KeySpace getDbs() {
        return dbs;
    }

    public void setDbs(KeySpace dbs) {
        this.dbs = dbs;
    }

    public TopologyInfo withRelationIp(String relationIp) {
        this.relationIp = relationIp;
        return this;
    }

    /**
     * **参数解释**： 关联IP。 **取值范围**： 不涉及。 
     * @return relationIp
     */
    public String getRelationIp() {
        return relationIp;
    }

    public void setRelationIp(String relationIp) {
        this.relationIp = relationIp;
    }

    public TopologyInfo withRelationPort(String relationPort) {
        this.relationPort = relationPort;
        return this;
    }

    /**
     * **参数解释**： 关联端口。 **取值范围**： 不涉及。 
     * @return relationPort
     */
    public String getRelationPort() {
        return relationPort;
    }

    public void setRelationPort(String relationPort) {
        this.relationPort = relationPort;
    }

    public TopologyInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 分片ID。 **取值范围**： 不涉及。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public TopologyInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： 节点状态。 **取值范围**： 不涉及。 
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TopologyInfo withDims(DimsInfo dims) {
        this.dims = dims;
        return this;
    }

    public TopologyInfo withDims(Consumer<DimsInfo> dimsSetter) {
        if (this.dims == null) {
            this.dims = new DimsInfo();
            dimsSetter.accept(this.dims);
        }

        return this;
    }

    /**
     * Get dims
     * @return dims
     */
    public DimsInfo getDims() {
        return dims;
    }

    public void setDims(DimsInfo dims) {
        this.dims = dims;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TopologyInfo that = (TopologyInfo) obj;
        return Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.nodeName, that.nodeName)
            && Objects.equals(this.ip, that.ip) && Objects.equals(this.port, that.port)
            && Objects.equals(this.nodeType, that.nodeType) && Objects.equals(this.maxMemory, that.maxMemory)
            && Objects.equals(this.usedMemory, that.usedMemory) && Objects.equals(this.qps, that.qps)
            && Objects.equals(this.bandwidth, that.bandwidth) && Objects.equals(this.dbNum, that.dbNum)
            && Objects.equals(this.dbs, that.dbs) && Objects.equals(this.relationIp, that.relationIp)
            && Objects.equals(this.relationPort, that.relationPort) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.status, that.status) && Objects.equals(this.dims, that.dims);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId,
            nodeName,
            ip,
            port,
            nodeType,
            maxMemory,
            usedMemory,
            qps,
            bandwidth,
            dbNum,
            dbs,
            relationIp,
            relationPort,
            groupId,
            status,
            dims);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopologyInfo {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
        sb.append("    usedMemory: ").append(toIndentedString(usedMemory)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    bandwidth: ").append(toIndentedString(bandwidth)).append("\n");
        sb.append("    dbNum: ").append(toIndentedString(dbNum)).append("\n");
        sb.append("    dbs: ").append(toIndentedString(dbs)).append("\n");
        sb.append("    relationIp: ").append(toIndentedString(relationIp)).append("\n");
        sb.append("    relationPort: ").append(toIndentedString(relationPort)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    dims: ").append(toIndentedString(dims)).append("\n");
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
