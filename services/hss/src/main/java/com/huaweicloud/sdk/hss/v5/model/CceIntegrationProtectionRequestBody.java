package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * CceIntegrationProtectionRequestBody
 */
public class CceIntegrationProtectionRequestBody {

    /**
     * **参数解释**: cce集群类型 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - existing：存量集群。 - adding：新增集群。  **默认取值**: 不涉及 
     */
    public static final class ClusterTypeEnum {

        /**
         * Enum EXISTING for value: "existing"
         */
        public static final ClusterTypeEnum EXISTING = new ClusterTypeEnum("existing");

        /**
         * Enum ADDING for value: "adding"
         */
        public static final ClusterTypeEnum ADDING = new ClusterTypeEnum("adding");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("existing", EXISTING);
            map.put("adding", ADDING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
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
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterTypeEnum(value));
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    /**
     * **参数解释**: 付费模式 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - on_demand：按需。 - free_security_check：免费安全体检。  **默认取值**: 不涉及 
     */
    public static final class ChargingModeEnum {

        /**
         * Enum ON_DEMAND for value: "on_demand"
         */
        public static final ChargingModeEnum ON_DEMAND = new ChargingModeEnum("on_demand");

        /**
         * Enum FREE_SECURITY_CHECK for value: "free_security_check"
         */
        public static final ChargingModeEnum FREE_SECURITY_CHECK = new ChargingModeEnum("free_security_check");

        private static final Map<String, ChargingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ChargingModeEnum> createStaticFields() {
            Map<String, ChargingModeEnum> map = new HashMap<>();
            map.put("on_demand", ON_DEMAND);
            map.put("free_security_check", FREE_SECURITY_CHECK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ChargingModeEnum(String value) {
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
        public static ChargingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ChargingModeEnum(value));
        }

        public static ChargingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ChargingModeEnum) {
                return this.value.equals(((ChargingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "charging_mode")

    private ChargingModeEnum chargingMode;

    /**
     * **参数解释**: cce防护类型 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - cluster_level：集群级别防护。 - node_level：节点级别防护。  **默认取值**: 不涉及 
     */
    public static final class CceProtectionTypeEnum {

        /**
         * Enum CLUSTER_LEVEL for value: "cluster_level"
         */
        public static final CceProtectionTypeEnum CLUSTER_LEVEL = new CceProtectionTypeEnum("cluster_level");

        /**
         * Enum NODE_LEVEL for value: "node_level"
         */
        public static final CceProtectionTypeEnum NODE_LEVEL = new CceProtectionTypeEnum("node_level");

        private static final Map<String, CceProtectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CceProtectionTypeEnum> createStaticFields() {
            Map<String, CceProtectionTypeEnum> map = new HashMap<>();
            map.put("cluster_level", CLUSTER_LEVEL);
            map.put("node_level", NODE_LEVEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CceProtectionTypeEnum(String value) {
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
        public static CceProtectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CceProtectionTypeEnum(value));
        }

        public static CceProtectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CceProtectionTypeEnum) {
                return this.value.equals(((CceProtectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_protection_type")

    private CceProtectionTypeEnum cceProtectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefer_packet_cycle")

    private Boolean preferPacketCycle;

    public CceIntegrationProtectionRequestBody withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * **参数解释**: cce集群类型 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - existing：存量集群。 - adding：新增集群。  **默认取值**: 不涉及 
     * @return clusterType
     */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public CceIntegrationProtectionRequestBody withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CceIntegrationProtectionRequestBody withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public CceIntegrationProtectionRequestBody withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * **参数解释**: 付费模式 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - on_demand：按需。 - free_security_check：免费安全体检。  **默认取值**: 不涉及 
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public CceIntegrationProtectionRequestBody withCceProtectionType(CceProtectionTypeEnum cceProtectionType) {
        this.cceProtectionType = cceProtectionType;
        return this;
    }

    /**
     * **参数解释**: cce防护类型 **约束限制**: 不涉及 **取值范围**: 包含如下两种： - cluster_level：集群级别防护。 - node_level：节点级别防护。  **默认取值**: 不涉及 
     * @return cceProtectionType
     */
    public CceProtectionTypeEnum getCceProtectionType() {
        return cceProtectionType;
    }

    public void setCceProtectionType(CceProtectionTypeEnum cceProtectionType) {
        this.cceProtectionType = cceProtectionType;
    }

    public CceIntegrationProtectionRequestBody withPreferPacketCycle(Boolean preferPacketCycle) {
        this.preferPacketCycle = preferPacketCycle;
        return this;
    }

    /**
     * 优先使用包周期配额；默认false
     * @return preferPacketCycle
     */
    public Boolean getPreferPacketCycle() {
        return preferPacketCycle;
    }

    public void setPreferPacketCycle(Boolean preferPacketCycle) {
        this.preferPacketCycle = preferPacketCycle;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CceIntegrationProtectionRequestBody that = (CceIntegrationProtectionRequestBody) obj;
        return Objects.equals(this.clusterType, that.clusterType) && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.cceProtectionType, that.cceProtectionType)
            && Objects.equals(this.preferPacketCycle, that.preferPacketCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterType, clusterId, clusterName, chargingMode, cceProtectionType, preferPacketCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CceIntegrationProtectionRequestBody {\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    chargingMode: ").append(toIndentedString(chargingMode)).append("\n");
        sb.append("    cceProtectionType: ").append(toIndentedString(cceProtectionType)).append("\n");
        sb.append("    preferPacketCycle: ").append(toIndentedString(preferPacketCycle)).append("\n");
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
