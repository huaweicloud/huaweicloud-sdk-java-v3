package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDaemonsetRequestBody
 */
public class UpdateDaemonsetRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_upgrade")

    private Boolean autoUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_info")

    private List<RuntimeRequestBody> runtimeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_info")

    private UpdateDaemonsetRequestBodyScheduleInfo scheduleInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoked_service")

    private String invokedService;

    /**
     * 付费模式，cce集成防护调用场景使用:   - on_demand:按需    - free_security_check:免费安全体检
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
     * cce防护类型，cce集成防护调用场景使用:   - cluster_level:集群级别防护    - node_level:节点级别防护
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

    public UpdateDaemonsetRequestBody withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * agent版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public UpdateDaemonsetRequestBody withClusterName(String clusterName) {
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

    public UpdateDaemonsetRequestBody withAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
        return this;
    }

    /**
     * 开启agent自动升级
     * @return autoUpgrade
     */
    public Boolean getAutoUpgrade() {
        return autoUpgrade;
    }

    public void setAutoUpgrade(Boolean autoUpgrade) {
        this.autoUpgrade = autoUpgrade;
    }

    public UpdateDaemonsetRequestBody withRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
        return this;
    }

    public UpdateDaemonsetRequestBody addRuntimeInfoItem(RuntimeRequestBody runtimeInfoItem) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        this.runtimeInfo.add(runtimeInfoItem);
        return this;
    }

    public UpdateDaemonsetRequestBody withRuntimeInfo(Consumer<List<RuntimeRequestBody>> runtimeInfoSetter) {
        if (this.runtimeInfo == null) {
            this.runtimeInfo = new ArrayList<>();
        }
        runtimeInfoSetter.accept(this.runtimeInfo);
        return this;
    }

    /**
     * 容器运行时配置
     * @return runtimeInfo
     */
    public List<RuntimeRequestBody> getRuntimeInfo() {
        return runtimeInfo;
    }

    public void setRuntimeInfo(List<RuntimeRequestBody> runtimeInfo) {
        this.runtimeInfo = runtimeInfo;
    }

    public UpdateDaemonsetRequestBody withScheduleInfo(UpdateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
        return this;
    }

    public UpdateDaemonsetRequestBody withScheduleInfo(
        Consumer<UpdateDaemonsetRequestBodyScheduleInfo> scheduleInfoSetter) {
        if (this.scheduleInfo == null) {
            this.scheduleInfo = new UpdateDaemonsetRequestBodyScheduleInfo();
            scheduleInfoSetter.accept(this.scheduleInfo);
        }

        return this;
    }

    /**
     * Get scheduleInfo
     * @return scheduleInfo
     */
    public UpdateDaemonsetRequestBodyScheduleInfo getScheduleInfo() {
        return scheduleInfo;
    }

    public void setScheduleInfo(UpdateDaemonsetRequestBodyScheduleInfo scheduleInfo) {
        this.scheduleInfo = scheduleInfo;
    }

    public UpdateDaemonsetRequestBody withInvokedService(String invokedService) {
        this.invokedService = invokedService;
        return this;
    }

    /**
     * 调用服务，默认hss，cce集成防护调用场景使用:   - hss：hss服务    - cce：cce服务
     * @return invokedService
     */
    public String getInvokedService() {
        return invokedService;
    }

    public void setInvokedService(String invokedService) {
        this.invokedService = invokedService;
    }

    public UpdateDaemonsetRequestBody withChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
        return this;
    }

    /**
     * 付费模式，cce集成防护调用场景使用:   - on_demand:按需    - free_security_check:免费安全体检
     * @return chargingMode
     */
    public ChargingModeEnum getChargingMode() {
        return chargingMode;
    }

    public void setChargingMode(ChargingModeEnum chargingMode) {
        this.chargingMode = chargingMode;
    }

    public UpdateDaemonsetRequestBody withCceProtectionType(CceProtectionTypeEnum cceProtectionType) {
        this.cceProtectionType = cceProtectionType;
        return this;
    }

    /**
     * cce防护类型，cce集成防护调用场景使用:   - cluster_level:集群级别防护    - node_level:节点级别防护
     * @return cceProtectionType
     */
    public CceProtectionTypeEnum getCceProtectionType() {
        return cceProtectionType;
    }

    public void setCceProtectionType(CceProtectionTypeEnum cceProtectionType) {
        this.cceProtectionType = cceProtectionType;
    }

    public UpdateDaemonsetRequestBody withPreferPacketCycle(Boolean preferPacketCycle) {
        this.preferPacketCycle = preferPacketCycle;
        return this;
    }

    /**
     * 优先使用包周期配额，cce集成防护调用场景使用，默认false
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
        UpdateDaemonsetRequestBody that = (UpdateDaemonsetRequestBody) obj;
        return Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.clusterName, that.clusterName) && Objects.equals(this.autoUpgrade, that.autoUpgrade)
            && Objects.equals(this.runtimeInfo, that.runtimeInfo)
            && Objects.equals(this.scheduleInfo, that.scheduleInfo)
            && Objects.equals(this.invokedService, that.invokedService)
            && Objects.equals(this.chargingMode, that.chargingMode)
            && Objects.equals(this.cceProtectionType, that.cceProtectionType)
            && Objects.equals(this.preferPacketCycle, that.preferPacketCycle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentVersion,
            clusterName,
            autoUpgrade,
            runtimeInfo,
            scheduleInfo,
            invokedService,
            chargingMode,
            cceProtectionType,
            preferPacketCycle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDaemonsetRequestBody {\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    autoUpgrade: ").append(toIndentedString(autoUpgrade)).append("\n");
        sb.append("    runtimeInfo: ").append(toIndentedString(runtimeInfo)).append("\n");
        sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
        sb.append("    invokedService: ").append(toIndentedString(invokedService)).append("\n");
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
