package com.huaweicloud.sdk.rds.v3.model;

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
 * 资源监控信息
 */
public class ResourceMonitoringInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_state")

    private InstanceState instanceState;

    /**
     * 实例类型
     */
    public static final class TypeEnum {

        /**
         * Enum SINGLE for value: "Single"
         */
        public static final TypeEnum SINGLE = new TypeEnum("Single");

        /**
         * Enum HA for value: "Ha"
         */
        public static final TypeEnum HA = new TypeEnum("Ha");

        /**
         * Enum REPLICA for value: "Replica"
         */
        public static final TypeEnum REPLICA = new TypeEnum("Replica");

        /**
         * Enum ENTERPRISE for value: "Enterprise"
         */
        public static final TypeEnum ENTERPRISE = new TypeEnum("Enterprise");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("Single", SINGLE);
            map.put("Ha", HA);
            map.put("Replica", REPLICA);
            map.put("Enterprise", ENTERPRISE);
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
    @JsonProperty(value = "cpu")

    private String cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem")

    private String mem;

    /**
     * 引擎名称
     */
    public static final class EngineNameEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineNameEnum MYSQL = new EngineNameEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineNameEnum POSTGRESQL = new EngineNameEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final EngineNameEnum SQLSERVER = new EngineNameEnum("sqlserver");

        private static final Map<String, EngineNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineNameEnum> createStaticFields() {
            Map<String, EngineNameEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineNameEnum(String value) {
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
        public static EngineNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineNameEnum(value));
        }

        public static EngineNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineNameEnum) {
                return this.value.equals(((EngineNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_name")

    private EngineNameEnum engineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine_version")

    private String engineVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_usage")

    private Double cpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory_usage")

    private Double memoryUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disk_usage")

    private Double diskUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tps")

    private Double tps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "qps")

    private Double qps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iops")

    private Double iops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_connections")

    private Integer activeConnections;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_sql")

    private Double slowSql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly_instance_resource_monitoring_info")

    private List<ResourceMonitoringInfo> readonlyInstanceResourceMonitoringInfo = null;

    public ResourceMonitoringInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceMonitoringInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceMonitoringInfo withInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
        return this;
    }

    public ResourceMonitoringInfo withInstanceState(Consumer<InstanceState> instanceStateSetter) {
        if (this.instanceState == null) {
            this.instanceState = new InstanceState();
            instanceStateSetter.accept(this.instanceState);
        }

        return this;
    }

    /**
     * Get instanceState
     * @return instanceState
     */
    public InstanceState getInstanceState() {
        return instanceState;
    }

    public void setInstanceState(InstanceState instanceState) {
        this.instanceState = instanceState;
    }

    public ResourceMonitoringInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 实例类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ResourceMonitoringInfo withCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * cpu大小
     * @return cpu
     */
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public ResourceMonitoringInfo withMem(String mem) {
        this.mem = mem;
        return this;
    }

    /**
     * 内存大小（单位：GB）
     * @return mem
     */
    public String getMem() {
        return mem;
    }

    public void setMem(String mem) {
        this.mem = mem;
    }

    public ResourceMonitoringInfo withEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
        return this;
    }

    /**
     * 引擎名称
     * @return engineName
     */
    public EngineNameEnum getEngineName() {
        return engineName;
    }

    public void setEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
    }

    public ResourceMonitoringInfo withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * 引擎版本
     * @return engineVersion
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ResourceMonitoringInfo withCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
        return this;
    }

    /**
     * cpu使用率
     * @return cpuUsage
     */
    public Double getCpuUsage() {
        return cpuUsage;
    }

    public void setCpuUsage(Double cpuUsage) {
        this.cpuUsage = cpuUsage;
    }

    public ResourceMonitoringInfo withMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }

    /**
     * 内存使用率
     * @return memoryUsage
     */
    public Double getMemoryUsage() {
        return memoryUsage;
    }

    public void setMemoryUsage(Double memoryUsage) {
        this.memoryUsage = memoryUsage;
    }

    public ResourceMonitoringInfo withDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * 磁盘使用率
     * @return diskUsage
     */
    public Double getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Double diskUsage) {
        this.diskUsage = diskUsage;
    }

    public ResourceMonitoringInfo withTps(Double tps) {
        this.tps = tps;
        return this;
    }

    /**
     * tps
     * @return tps
     */
    public Double getTps() {
        return tps;
    }

    public void setTps(Double tps) {
        this.tps = tps;
    }

    public ResourceMonitoringInfo withQps(Double qps) {
        this.qps = qps;
        return this;
    }

    /**
     * qps
     * @return qps
     */
    public Double getQps() {
        return qps;
    }

    public void setQps(Double qps) {
        this.qps = qps;
    }

    public ResourceMonitoringInfo withIops(Double iops) {
        this.iops = iops;
        return this;
    }

    /**
     * iops
     * @return iops
     */
    public Double getIops() {
        return iops;
    }

    public void setIops(Double iops) {
        this.iops = iops;
    }

    public ResourceMonitoringInfo withActiveConnections(Integer activeConnections) {
        this.activeConnections = activeConnections;
        return this;
    }

    /**
     * 活跃连接数
     * @return activeConnections
     */
    public Integer getActiveConnections() {
        return activeConnections;
    }

    public void setActiveConnections(Integer activeConnections) {
        this.activeConnections = activeConnections;
    }

    public ResourceMonitoringInfo withSlowSql(Double slowSql) {
        this.slowSql = slowSql;
        return this;
    }

    /**
     * 慢SQL
     * @return slowSql
     */
    public Double getSlowSql() {
        return slowSql;
    }

    public void setSlowSql(Double slowSql) {
        this.slowSql = slowSql;
    }

    public ResourceMonitoringInfo withReadonlyInstanceResourceMonitoringInfo(
        List<ResourceMonitoringInfo> readonlyInstanceResourceMonitoringInfo) {
        this.readonlyInstanceResourceMonitoringInfo = readonlyInstanceResourceMonitoringInfo;
        return this;
    }

    public ResourceMonitoringInfo addReadonlyInstanceResourceMonitoringInfoItem(
        ResourceMonitoringInfo readonlyInstanceResourceMonitoringInfoItem) {
        if (this.readonlyInstanceResourceMonitoringInfo == null) {
            this.readonlyInstanceResourceMonitoringInfo = new ArrayList<>();
        }
        this.readonlyInstanceResourceMonitoringInfo.add(readonlyInstanceResourceMonitoringInfoItem);
        return this;
    }

    public ResourceMonitoringInfo withReadonlyInstanceResourceMonitoringInfo(
        Consumer<List<ResourceMonitoringInfo>> readonlyInstanceResourceMonitoringInfoSetter) {
        if (this.readonlyInstanceResourceMonitoringInfo == null) {
            this.readonlyInstanceResourceMonitoringInfo = new ArrayList<>();
        }
        readonlyInstanceResourceMonitoringInfoSetter.accept(this.readonlyInstanceResourceMonitoringInfo);
        return this;
    }

    /**
     * 只读实例资源监控指标
     * @return readonlyInstanceResourceMonitoringInfo
     */
    public List<ResourceMonitoringInfo> getReadonlyInstanceResourceMonitoringInfo() {
        return readonlyInstanceResourceMonitoringInfo;
    }

    public void setReadonlyInstanceResourceMonitoringInfo(
        List<ResourceMonitoringInfo> readonlyInstanceResourceMonitoringInfo) {
        this.readonlyInstanceResourceMonitoringInfo = readonlyInstanceResourceMonitoringInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceMonitoringInfo that = (ResourceMonitoringInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.instanceState, that.instanceState) && Objects.equals(this.type, that.type)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.mem, that.mem)
            && Objects.equals(this.engineName, that.engineName)
            && Objects.equals(this.engineVersion, that.engineVersion) && Objects.equals(this.cpuUsage, that.cpuUsage)
            && Objects.equals(this.memoryUsage, that.memoryUsage) && Objects.equals(this.diskUsage, that.diskUsage)
            && Objects.equals(this.tps, that.tps) && Objects.equals(this.qps, that.qps)
            && Objects.equals(this.iops, that.iops) && Objects.equals(this.activeConnections, that.activeConnections)
            && Objects.equals(this.slowSql, that.slowSql)
            && Objects.equals(this.readonlyInstanceResourceMonitoringInfo, that.readonlyInstanceResourceMonitoringInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            instanceState,
            type,
            cpu,
            mem,
            engineName,
            engineVersion,
            cpuUsage,
            memoryUsage,
            diskUsage,
            tps,
            qps,
            iops,
            activeConnections,
            slowSql,
            readonlyInstanceResourceMonitoringInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceMonitoringInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceState: ").append(toIndentedString(instanceState)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    mem: ").append(toIndentedString(mem)).append("\n");
        sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
        sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
        sb.append("    cpuUsage: ").append(toIndentedString(cpuUsage)).append("\n");
        sb.append("    memoryUsage: ").append(toIndentedString(memoryUsage)).append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    tps: ").append(toIndentedString(tps)).append("\n");
        sb.append("    qps: ").append(toIndentedString(qps)).append("\n");
        sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
        sb.append("    activeConnections: ").append(toIndentedString(activeConnections)).append("\n");
        sb.append("    slowSql: ").append(toIndentedString(slowSql)).append("\n");
        sb.append("    readonlyInstanceResourceMonitoringInfo: ")
            .append(toIndentedString(readonlyInstanceResourceMonitoringInfo))
            .append("\n");
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
