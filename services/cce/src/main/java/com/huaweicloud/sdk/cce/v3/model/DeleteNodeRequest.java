package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteNodeRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    /**
     * 标明是否为nodepool下发的请求。若不为“NoScaleDown”将自动更新对应节点池的实例数
     */
    public static final class NodepoolScaleDownEnum {

        /**
         * Enum NOSCALEDOWN for value: "NoScaleDown"
         */
        public static final NodepoolScaleDownEnum NOSCALEDOWN = new NodepoolScaleDownEnum("NoScaleDown");

        private static final Map<String, NodepoolScaleDownEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NodepoolScaleDownEnum> createStaticFields() {
            Map<String, NodepoolScaleDownEnum> map = new HashMap<>();
            map.put("NoScaleDown", NOSCALEDOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NodepoolScaleDownEnum(String value) {
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
        public static NodepoolScaleDownEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NodepoolScaleDownEnum(value));
        }

        public static NodepoolScaleDownEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NodepoolScaleDownEnum) {
                return this.value.equals(((NodepoolScaleDownEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodepoolScaleDown")

    private NodepoolScaleDownEnum nodepoolScaleDown;

    public DeleteNodeRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteNodeRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，获取方式请参见[如何获取接口URI中参数](cce_02_0271.xml)。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DeleteNodeRequest withNodepoolScaleDown(NodepoolScaleDownEnum nodepoolScaleDown) {
        this.nodepoolScaleDown = nodepoolScaleDown;
        return this;
    }

    /**
     * 标明是否为nodepool下发的请求。若不为“NoScaleDown”将自动更新对应节点池的实例数
     * @return nodepoolScaleDown
     */
    public NodepoolScaleDownEnum getNodepoolScaleDown() {
        return nodepoolScaleDown;
    }

    public void setNodepoolScaleDown(NodepoolScaleDownEnum nodepoolScaleDown) {
        this.nodepoolScaleDown = nodepoolScaleDown;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteNodeRequest that = (DeleteNodeRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodepoolScaleDown, that.nodepoolScaleDown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, nodeId, nodepoolScaleDown);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteNodeRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodepoolScaleDown: ").append(toIndentedString(nodepoolScaleDown)).append("\n");
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
