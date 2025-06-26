package com.huaweicloud.sdk.sms.v3.model;

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
 * 创建任务的参数
 */
public class PostTask {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务类型 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     */
    public static final class TypeEnum {

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_start")

    private Boolean autoStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_server")

    private SourceServerByTask sourceServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    private TargetServerByTask targetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_ip")

    private String migrationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_name")

    private String regionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_template_id")

    private String vmTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_public_ip")

    private Boolean usePublicIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "use_ipv6")

    private Boolean useIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Boolean syncing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exist_server")

    private Boolean existServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_network_check")

    private Boolean startNetworkCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "over_speed_threshold")

    private Double overSpeedThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_need_consistency_check")

    private Boolean isNeedConsistencyCheck;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration_test")

    private Boolean needMigrationTest;

    public PostTask withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PostTask withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 任务类型 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public PostTask withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    /**
     * 迁移后是否启动目的端虚拟机
     * @return startTargetServer
     */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public PostTask withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * 是否自动启动
     * @return autoStart
     */
    public Boolean getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
    }

    public PostTask withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PostTask withSourceServer(SourceServerByTask sourceServer) {
        this.sourceServer = sourceServer;
        return this;
    }

    public PostTask withSourceServer(Consumer<SourceServerByTask> sourceServerSetter) {
        if (this.sourceServer == null) {
            this.sourceServer = new SourceServerByTask();
            sourceServerSetter.accept(this.sourceServer);
        }

        return this;
    }

    /**
     * Get sourceServer
     * @return sourceServer
     */
    public SourceServerByTask getSourceServer() {
        return sourceServer;
    }

    public void setSourceServer(SourceServerByTask sourceServer) {
        this.sourceServer = sourceServer;
    }

    public PostTask withTargetServer(TargetServerByTask targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public PostTask withTargetServer(Consumer<TargetServerByTask> targetServerSetter) {
        if (this.targetServer == null) {
            this.targetServer = new TargetServerByTask();
            targetServerSetter.accept(this.targetServer);
        }

        return this;
    }

    /**
     * Get targetServer
     * @return targetServer
     */
    public TargetServerByTask getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(TargetServerByTask targetServer) {
        this.targetServer = targetServer;
    }

    public PostTask withMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
        return this;
    }

    /**
     * 迁移IP，如果是自动创建虚拟机，不需要此参数
     * @return migrationIp
     */
    public String getMigrationIp() {
        return migrationIp;
    }

    public void setMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
    }

    public PostTask withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * region的名称
     * @return regionName
     */
    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public PostTask withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region ID
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public PostTask withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * 项目名称
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public PostTask withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PostTask withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级。默认为1
     * minimum: 0
     * maximum: 65535
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public PostTask withVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
        return this;
    }

    /**
     * 自动创建虚拟机使用模板
     * @return vmTemplateId
     */
    public String getVmTemplateId() {
        return vmTemplateId;
    }

    public void setVmTemplateId(String vmTemplateId) {
        this.vmTemplateId = vmTemplateId;
    }

    public PostTask withUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
        return this;
    }

    /**
     * 是否使用公网ip
     * @return usePublicIp
     */
    public Boolean getUsePublicIp() {
        return usePublicIp;
    }

    public void setUsePublicIp(Boolean usePublicIp) {
        this.usePublicIp = usePublicIp;
    }

    public PostTask withUseIpv6(Boolean useIpv6) {
        this.useIpv6 = useIpv6;
        return this;
    }

    /**
     * 是否使用ipv6
     * @return useIpv6
     */
    public Boolean getUseIpv6() {
        return useIpv6;
    }

    public void setUseIpv6(Boolean useIpv6) {
        this.useIpv6 = useIpv6;
    }

    public PostTask withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    /**
     * 复制或者同步后是否会继续持续同步，不添加则默认是false
     * @return syncing
     */
    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

    public PostTask withExistServer(Boolean existServer) {
        this.existServer = existServer;
        return this;
    }

    /**
     * 是否存在服务，如果存在，则创建任务
     * @return existServer
     */
    public Boolean getExistServer() {
        return existServer;
    }

    public void setExistServer(Boolean existServer) {
        this.existServer = existServer;
    }

    public PostTask withStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
        return this;
    }

    /**
     * 是否开启网络检测
     * @return startNetworkCheck
     */
    public Boolean getStartNetworkCheck() {
        return startNetworkCheck;
    }

    public void setStartNetworkCheck(Boolean startNetworkCheck) {
        this.startNetworkCheck = startNetworkCheck;
    }

    public PostTask withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /**
     * 迁移速率限制值
     * minimum: 0
     * maximum: 10000
     * @return speedLimit
     */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public PostTask withOverSpeedThreshold(Double overSpeedThreshold) {
        this.overSpeedThreshold = overSpeedThreshold;
        return this;
    }

    /**
     * 停止迁移的超速阈值。 是一个迁移速率的保护机制，超出该阈值会停止任务。它主要用于控制迁移过程中资源（特别是网络带宽）的消耗，确保系统的整体性能不受单一迁移任务影响 单位是百分比
     * minimum: 1E+1
     * maximum: 1E+2
     * @return overSpeedThreshold
     */
    public Double getOverSpeedThreshold() {
        return overSpeedThreshold;
    }

    public void setOverSpeedThreshold(Double overSpeedThreshold) {
        this.overSpeedThreshold = overSpeedThreshold;
    }

    public PostTask withIsNeedConsistencyCheck(Boolean isNeedConsistencyCheck) {
        this.isNeedConsistencyCheck = isNeedConsistencyCheck;
        return this;
    }

    /**
     * 是否进行一致性校验
     * @return isNeedConsistencyCheck
     */
    public Boolean getIsNeedConsistencyCheck() {
        return isNeedConsistencyCheck;
    }

    public void setIsNeedConsistencyCheck(Boolean isNeedConsistencyCheck) {
        this.isNeedConsistencyCheck = isNeedConsistencyCheck;
    }

    public PostTask withNeedMigrationTest(Boolean needMigrationTest) {
        this.needMigrationTest = needMigrationTest;
        return this;
    }

    /**
     * 是否开启迁移演练
     * @return needMigrationTest
     */
    public Boolean getNeedMigrationTest() {
        return needMigrationTest;
    }

    public void setNeedMigrationTest(Boolean needMigrationTest) {
        this.needMigrationTest = needMigrationTest;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostTask that = (PostTask) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.type, that.type)
            && Objects.equals(this.startTargetServer, that.startTargetServer)
            && Objects.equals(this.autoStart, that.autoStart) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.sourceServer, that.sourceServer)
            && Objects.equals(this.targetServer, that.targetServer)
            && Objects.equals(this.migrationIp, that.migrationIp) && Objects.equals(this.regionName, that.regionName)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.vmTemplateId, that.vmTemplateId)
            && Objects.equals(this.usePublicIp, that.usePublicIp) && Objects.equals(this.useIpv6, that.useIpv6)
            && Objects.equals(this.syncing, that.syncing) && Objects.equals(this.existServer, that.existServer)
            && Objects.equals(this.startNetworkCheck, that.startNetworkCheck)
            && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.overSpeedThreshold, that.overSpeedThreshold)
            && Objects.equals(this.isNeedConsistencyCheck, that.isNeedConsistencyCheck)
            && Objects.equals(this.needMigrationTest, that.needMigrationTest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            type,
            startTargetServer,
            autoStart,
            osType,
            sourceServer,
            targetServer,
            migrationIp,
            regionName,
            regionId,
            projectName,
            projectId,
            priority,
            vmTemplateId,
            usePublicIp,
            useIpv6,
            syncing,
            existServer,
            startNetworkCheck,
            speedLimit,
            overSpeedThreshold,
            isNeedConsistencyCheck,
            needMigrationTest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostTask {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    autoStart: ").append(toIndentedString(autoStart)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    sourceServer: ").append(toIndentedString(sourceServer)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    migrationIp: ").append(toIndentedString(migrationIp)).append("\n");
        sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    vmTemplateId: ").append(toIndentedString(vmTemplateId)).append("\n");
        sb.append("    usePublicIp: ").append(toIndentedString(usePublicIp)).append("\n");
        sb.append("    useIpv6: ").append(toIndentedString(useIpv6)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("    existServer: ").append(toIndentedString(existServer)).append("\n");
        sb.append("    startNetworkCheck: ").append(toIndentedString(startNetworkCheck)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    overSpeedThreshold: ").append(toIndentedString(overSpeedThreshold)).append("\n");
        sb.append("    isNeedConsistencyCheck: ").append(toIndentedString(isNeedConsistencyCheck)).append("\n");
        sb.append("    needMigrationTest: ").append(toIndentedString(needMigrationTest)).append("\n");
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
