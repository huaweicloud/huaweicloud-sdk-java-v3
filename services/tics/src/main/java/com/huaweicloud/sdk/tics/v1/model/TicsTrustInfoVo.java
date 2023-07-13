package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * TicsTrustInfoVo
 */
public class TicsTrustInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    /**
     * 主备模式，ACTIVE.主，STANDBY.备
     */
    public static final class HaModeEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final HaModeEnum ACTIVE = new HaModeEnum("ACTIVE");

        /**
         * Enum STANDBY for value: "STANDBY"
         */
        public static final HaModeEnum STANDBY = new HaModeEnum("STANDBY");

        private static final Map<String, HaModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HaModeEnum> createStaticFields() {
            Map<String, HaModeEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("STANDBY", STANDBY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HaModeEnum(String value) {
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
        public static HaModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HaModeEnum(value));
        }

        public static HaModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HaModeEnum) {
                return this.value.equals(((HaModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_mode")

    private HaModeEnum haMode;

    /**
     * 网元部署类型，CCE.容器集群部署，IEF.边缘部署
     */
    public static final class NeDeployTypeEnum {

        /**
         * Enum CCE for value: "CCE"
         */
        public static final NeDeployTypeEnum CCE = new NeDeployTypeEnum("CCE");

        /**
         * Enum IEF for value: "IEF"
         */
        public static final NeDeployTypeEnum IEF = new NeDeployTypeEnum("IEF");

        private static final Map<String, NeDeployTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NeDeployTypeEnum> createStaticFields() {
            Map<String, NeDeployTypeEnum> map = new HashMap<>();
            map.put("CCE", CCE);
            map.put("IEF", IEF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NeDeployTypeEnum(String value) {
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
        public static NeDeployTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NeDeployTypeEnum(value));
        }

        public static NeDeployTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NeDeployTypeEnum) {
                return this.value.equals(((NeDeployTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ne_deploy_type")

    private NeDeployTypeEnum neDeployType;

    /**
     * 节点类型,AGENT.计算节点，AGG.聚合节点，AGG_MANAGER.聚合器管理节点,SERVER.控制节点
     */
    public static final class NeNodeTypeEnum {

        /**
         * Enum AGENT for value: "AGENT"
         */
        public static final NeNodeTypeEnum AGENT = new NeNodeTypeEnum("AGENT");

        /**
         * Enum AGG for value: "AGG"
         */
        public static final NeNodeTypeEnum AGG = new NeNodeTypeEnum("AGG");

        /**
         * Enum AGG_MANAGER for value: "AGG_MANAGER"
         */
        public static final NeNodeTypeEnum AGG_MANAGER = new NeNodeTypeEnum("AGG_MANAGER");

        /**
         * Enum SERVER for value: "SERVER"
         */
        public static final NeNodeTypeEnum SERVER = new NeNodeTypeEnum("SERVER");

        private static final Map<String, NeNodeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NeNodeTypeEnum> createStaticFields() {
            Map<String, NeNodeTypeEnum> map = new HashMap<>();
            map.put("AGENT", AGENT);
            map.put("AGG", AGG);
            map.put("AGG_MANAGER", AGG_MANAGER);
            map.put("SERVER", SERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NeNodeTypeEnum(String value) {
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
        public static NeNodeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NeNodeTypeEnum(value));
        }

        public static NeNodeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NeNodeTypeEnum) {
                return this.value.equals(((NeNodeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ne_node_type")

    private NeNodeTypeEnum neNodeType;

    /**
     * 网元状态，INIT.初始化,UNKNOWN.未知,OFFLINE.离线,ONLINE.在线,FAULT.故障,TRUSTING.互信中,TRUST.已互信
     */
    public static final class NeStatusEnum {

        /**
         * Enum FAULT for value: "FAULT"
         */
        public static final NeStatusEnum FAULT = new NeStatusEnum("FAULT");

        /**
         * Enum INIT for value: "INIT"
         */
        public static final NeStatusEnum INIT = new NeStatusEnum("INIT");

        /**
         * Enum OFFLINE for value: "OFFLINE"
         */
        public static final NeStatusEnum OFFLINE = new NeStatusEnum("OFFLINE");

        /**
         * Enum ONLINE for value: "ONLINE"
         */
        public static final NeStatusEnum ONLINE = new NeStatusEnum("ONLINE");

        /**
         * Enum TRUST for value: "TRUST"
         */
        public static final NeStatusEnum TRUST = new NeStatusEnum("TRUST");

        /**
         * Enum TRUSTING for value: "TRUSTING"
         */
        public static final NeStatusEnum TRUSTING = new NeStatusEnum("TRUSTING");

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final NeStatusEnum UNKNOWN = new NeStatusEnum("UNKNOWN");

        private static final Map<String, NeStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NeStatusEnum> createStaticFields() {
            Map<String, NeStatusEnum> map = new HashMap<>();
            map.put("FAULT", FAULT);
            map.put("INIT", INIT);
            map.put("OFFLINE", OFFLINE);
            map.put("ONLINE", ONLINE);
            map.put("TRUST", TRUST);
            map.put("TRUSTING", TRUSTING);
            map.put("UNKNOWN", UNKNOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NeStatusEnum(String value) {
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
        public static NeStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NeStatusEnum(value));
        }

        public static NeStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NeStatusEnum) {
                return this.value.equals(((NeStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ne_status")

    private NeStatusEnum neStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_name")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_alias")

    private String partnerAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public TicsTrustInfoVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public TicsTrustInfoVo withHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
        return this;
    }

    /**
     * 主备模式，ACTIVE.主，STANDBY.备
     * @return haMode
     */
    public HaModeEnum getHaMode() {
        return haMode;
    }

    public void setHaMode(HaModeEnum haMode) {
        this.haMode = haMode;
    }

    public TicsTrustInfoVo withNeDeployType(NeDeployTypeEnum neDeployType) {
        this.neDeployType = neDeployType;
        return this;
    }

    /**
     * 网元部署类型，CCE.容器集群部署，IEF.边缘部署
     * @return neDeployType
     */
    public NeDeployTypeEnum getNeDeployType() {
        return neDeployType;
    }

    public void setNeDeployType(NeDeployTypeEnum neDeployType) {
        this.neDeployType = neDeployType;
    }

    public TicsTrustInfoVo withNeNodeType(NeNodeTypeEnum neNodeType) {
        this.neNodeType = neNodeType;
        return this;
    }

    /**
     * 节点类型,AGENT.计算节点，AGG.聚合节点，AGG_MANAGER.聚合器管理节点,SERVER.控制节点
     * @return neNodeType
     */
    public NeNodeTypeEnum getNeNodeType() {
        return neNodeType;
    }

    public void setNeNodeType(NeNodeTypeEnum neNodeType) {
        this.neNodeType = neNodeType;
    }

    public TicsTrustInfoVo withNeStatus(NeStatusEnum neStatus) {
        this.neStatus = neStatus;
        return this;
    }

    /**
     * 网元状态，INIT.初始化,UNKNOWN.未知,OFFLINE.离线,ONLINE.在线,FAULT.故障,TRUSTING.互信中,TRUST.已互信
     * @return neStatus
     */
    public NeStatusEnum getNeStatus() {
        return neStatus;
    }

    public void setNeStatus(NeStatusEnum neStatus) {
        this.neStatus = neStatus;
    }

    public TicsTrustInfoVo withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点id
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public TicsTrustInfoVo withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * 节点名称
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public TicsTrustInfoVo withPartnerAlias(String partnerAlias) {
        this.partnerAlias = partnerAlias;
        return this;
    }

    /**
     * 合作方别名
     * @return partnerAlias
     */
    public String getPartnerAlias() {
        return partnerAlias;
    }

    public void setPartnerAlias(String partnerAlias) {
        this.partnerAlias = partnerAlias;
    }

    public TicsTrustInfoVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TicsTrustInfoVo that = (TicsTrustInfoVo) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.haMode, that.haMode)
            && Objects.equals(this.neDeployType, that.neDeployType) && Objects.equals(this.neNodeType, that.neNodeType)
            && Objects.equals(this.neStatus, that.neStatus) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.partnerAlias, that.partnerAlias)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(createTime, haMode, neDeployType, neNodeType, neStatus, nodeId, nodeName, partnerAlias, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TicsTrustInfoVo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    haMode: ").append(toIndentedString(haMode)).append("\n");
        sb.append("    neDeployType: ").append(toIndentedString(neDeployType)).append("\n");
        sb.append("    neNodeType: ").append(toIndentedString(neNodeType)).append("\n");
        sb.append("    neStatus: ").append(toIndentedString(neStatus)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    partnerAlias: ").append(toIndentedString(partnerAlias)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
