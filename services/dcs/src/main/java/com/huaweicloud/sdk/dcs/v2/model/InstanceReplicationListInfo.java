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
 * 副本列表
 */
public class InstanceReplicationListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_role")

    @JacksonXmlProperty(localName = "replication_role")

    private String replicationRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_ip")

    @JacksonXmlProperty(localName = "replication_ip")

    private String replicationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_replication")

    @JacksonXmlProperty(localName = "is_replication")

    private Boolean isReplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_id")

    @JacksonXmlProperty(localName = "replication_id")

    private String replicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    @JacksonXmlProperty(localName = "node_id")

    private String nodeId;

    /**
     * 副本状态。
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "Active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("Active");

        /**
         * Enum INACTIVE for value: "Inactive"
         */
        public static final StatusEnum INACTIVE = new StatusEnum("Inactive");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("Active", ACTIVE);
            map.put("Inactive", INACTIVE);
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    @JacksonXmlProperty(localName = "dimensions")

    private List<InstanceReplicationDimensionsInfo> dimensions = null;

    public InstanceReplicationListInfo withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * 副本角色，取值有： - master：表示主节点。 - slave：表示从节点。 
     * @return replicationRole
     */
    public String getReplicationRole() {
        return replicationRole;
    }

    public void setReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
    }

    public InstanceReplicationListInfo withReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
        return this;
    }

    /**
     * 副本IP。
     * @return replicationIp
     */
    public String getReplicationIp() {
        return replicationIp;
    }

    public void setReplicationIp(String replicationIp) {
        this.replicationIp = replicationIp;
    }

    public InstanceReplicationListInfo withIsReplication(Boolean isReplication) {
        this.isReplication = isReplication;
        return this;
    }

    /**
     * 是否是新加副本。
     * @return isReplication
     */
    public Boolean getIsReplication() {
        return isReplication;
    }

    public void setIsReplication(Boolean isReplication) {
        this.isReplication = isReplication;
    }

    public InstanceReplicationListInfo withReplicationId(String replicationId) {
        this.replicationId = replicationId;
        return this;
    }

    /**
     * 副本id。
     * @return replicationId
     */
    public String getReplicationId() {
        return replicationId;
    }

    public void setReplicationId(String replicationId) {
        this.replicationId = replicationId;
    }

    public InstanceReplicationListInfo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public InstanceReplicationListInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 副本状态。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public InstanceReplicationListInfo withAzCode(String azCode) {
        this.azCode = azCode;
        return this;
    }

    /**
     * 副本所在的可用区
     * @return azCode
     */
    public String getAzCode() {
        return azCode;
    }

    public void setAzCode(String azCode) {
        this.azCode = azCode;
    }

    public InstanceReplicationListInfo withDimensions(List<InstanceReplicationDimensionsInfo> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public InstanceReplicationListInfo addDimensionsItem(InstanceReplicationDimensionsInfo dimensionsItem) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimensionsItem);
        return this;
    }

    public InstanceReplicationListInfo withDimensions(
        Consumer<List<InstanceReplicationDimensionsInfo>> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        dimensionsSetter.accept(this.dimensions);
        return this;
    }

    /**
     * 副本对应的监控指标维度信息。可用于调用云监控服务的查询监控数据指标相关接口 - 副本的监控维度为多维度，返回数组中包含两个维度信息。从云监控查询监控数据时，要按多维度传递指标维度参数，才能查询到监控指标值 - 第一个维度为副本父维度信息，维度名称为dcs_instance_id，维度值对应副本所在的实例ID - 第二个维度，维度名称为dcs_cluster_redis_node,维度值为副本的监控对象ID，与副本ID和节点ID不同。 
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
        InstanceReplicationListInfo instanceReplicationListInfo = (InstanceReplicationListInfo) o;
        return Objects.equals(this.replicationRole, instanceReplicationListInfo.replicationRole)
            && Objects.equals(this.replicationIp, instanceReplicationListInfo.replicationIp)
            && Objects.equals(this.isReplication, instanceReplicationListInfo.isReplication)
            && Objects.equals(this.replicationId, instanceReplicationListInfo.replicationId)
            && Objects.equals(this.nodeId, instanceReplicationListInfo.nodeId)
            && Objects.equals(this.status, instanceReplicationListInfo.status)
            && Objects.equals(this.azCode, instanceReplicationListInfo.azCode)
            && Objects.equals(this.dimensions, instanceReplicationListInfo.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(replicationRole, replicationIp, isReplication, replicationId, nodeId, status, azCode, dimensions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceReplicationListInfo {\n");
        sb.append("    replicationRole: ").append(toIndentedString(replicationRole)).append("\n");
        sb.append("    replicationIp: ").append(toIndentedString(replicationIp)).append("\n");
        sb.append("    isReplication: ").append(toIndentedString(isReplication)).append("\n");
        sb.append("    replicationId: ").append(toIndentedString(replicationId)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    azCode: ").append(toIndentedString(azCode)).append("\n");
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
