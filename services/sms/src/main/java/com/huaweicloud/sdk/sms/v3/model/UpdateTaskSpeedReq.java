package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class UpdateTaskSpeedReq {

    /**
     * 当前上报进度的子任务名称，子任务名称包括： 创建虚拟机 CREATE_CLOUD_SERVER 配置安全通道 SSL_CONFIG 挂载代理镜像 ATTACH_AGENT_IMAGE 卸载代理镜像 DETTACH_AGENT_IMAGE Linux分区格式化 FORMAT_DISK_LINUX Linux分区格式化(文件级） FORMAT_DISK_LINUX_FILE Linux分区格式化(块级） FORMAT_DISK_LINUX_BLOCK Windows分区格式化 FORMAT_DISK_WINDOWS Linux文件级数据迁移 MIGRATE_LINUX_FILE, Linux块级数据迁移 MIGRATE_LINUX_BLOCK Windows块级数据迁移 MIGRATE_WINDOWS_BLOCK 克隆一个虚拟机 CLONE_VM Linux文件级数据同步 SYNC_LINUX_FILE Linux块级数据同步 SYNC_LINUX_BLOCK Windows块级数据同步 SYNC_WINDOWS_BLOCK Linux配置修改 CONFIGURE_LINUX Linux配置修改(块级）CONFIGURE_LINUX_BLOCK Linux配置修改（文件级） CONFIGURE_LINUX_FILE Windows配置修改 CONFIGURE_WINDOWS
     */
    public static final class SubtaskNameEnum {

        /**
         * Enum CREATE_CLOUD_SERVER for value: "CREATE_CLOUD_SERVER"
         */
        public static final SubtaskNameEnum CREATE_CLOUD_SERVER = new SubtaskNameEnum("CREATE_CLOUD_SERVER");

        /**
         * Enum SSL_CONFIG for value: "SSL_CONFIG"
         */
        public static final SubtaskNameEnum SSL_CONFIG = new SubtaskNameEnum("SSL_CONFIG");

        /**
         * Enum ATTACH_AGENT_IMAGE for value: "ATTACH_AGENT_IMAGE"
         */
        public static final SubtaskNameEnum ATTACH_AGENT_IMAGE = new SubtaskNameEnum("ATTACH_AGENT_IMAGE");

        /**
         * Enum DETTACH_AGENT_IMAGE for value: "DETTACH_AGENT_IMAGE"
         */
        public static final SubtaskNameEnum DETTACH_AGENT_IMAGE = new SubtaskNameEnum("DETTACH_AGENT_IMAGE");

        /**
         * Enum FORMAT_DISK_LINUX for value: "FORMAT_DISK_LINUX"
         */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX = new SubtaskNameEnum("FORMAT_DISK_LINUX");

        /**
         * Enum FORMAT_DISK_LINUX_FILE for value: "FORMAT_DISK_LINUX_FILE"
         */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX_FILE = new SubtaskNameEnum("FORMAT_DISK_LINUX_FILE");

        /**
         * Enum FORMAT_DISK_LINUX_BLOCK for value: "FORMAT_DISK_LINUX_BLOCK"
         */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX_BLOCK = new SubtaskNameEnum("FORMAT_DISK_LINUX_BLOCK");

        /**
         * Enum FORMAT_DISK_WINDOWS for value: "FORMAT_DISK_WINDOWS"
         */
        public static final SubtaskNameEnum FORMAT_DISK_WINDOWS = new SubtaskNameEnum("FORMAT_DISK_WINDOWS");

        /**
         * Enum MIGRATE_LINUX_FILE for value: "MIGRATE_LINUX_FILE"
         */
        public static final SubtaskNameEnum MIGRATE_LINUX_FILE = new SubtaskNameEnum("MIGRATE_LINUX_FILE");

        /**
         * Enum MIGRATE_LINUX_BLOCK for value: "MIGRATE_LINUX_BLOCK"
         */
        public static final SubtaskNameEnum MIGRATE_LINUX_BLOCK = new SubtaskNameEnum("MIGRATE_LINUX_BLOCK");

        /**
         * Enum MIGRATE_WINDOWS_BLOCK for value: "MIGRATE_WINDOWS_BLOCK"
         */
        public static final SubtaskNameEnum MIGRATE_WINDOWS_BLOCK = new SubtaskNameEnum("MIGRATE_WINDOWS_BLOCK");

        /**
         * Enum CLONE_VM for value: "CLONE_VM"
         */
        public static final SubtaskNameEnum CLONE_VM = new SubtaskNameEnum("CLONE_VM");

        /**
         * Enum SYNC_LINUX_FILE for value: "SYNC_LINUX_FILE"
         */
        public static final SubtaskNameEnum SYNC_LINUX_FILE = new SubtaskNameEnum("SYNC_LINUX_FILE");

        /**
         * Enum SYNC_LINUX_BLOCK for value: "SYNC_LINUX_BLOCK"
         */
        public static final SubtaskNameEnum SYNC_LINUX_BLOCK = new SubtaskNameEnum("SYNC_LINUX_BLOCK");

        /**
         * Enum SYNC_WINDOWS_BLOCK for value: "SYNC_WINDOWS_BLOCK"
         */
        public static final SubtaskNameEnum SYNC_WINDOWS_BLOCK = new SubtaskNameEnum("SYNC_WINDOWS_BLOCK");

        /**
         * Enum CONFIGURE_LINUX for value: "CONFIGURE_LINUX"
         */
        public static final SubtaskNameEnum CONFIGURE_LINUX = new SubtaskNameEnum("CONFIGURE_LINUX");

        /**
         * Enum CONFIGURE_LINUX_BLOCK for value: "CONFIGURE_LINUX_BLOCK"
         */
        public static final SubtaskNameEnum CONFIGURE_LINUX_BLOCK = new SubtaskNameEnum("CONFIGURE_LINUX_BLOCK");

        /**
         * Enum CONFIGURE_LINUX_FILE for value: "CONFIGURE_LINUX_FILE"
         */
        public static final SubtaskNameEnum CONFIGURE_LINUX_FILE = new SubtaskNameEnum("CONFIGURE_LINUX_FILE");

        /**
         * Enum CONFIGURE_WINDOWS for value: "CONFIGURE_WINDOWS"
         */
        public static final SubtaskNameEnum CONFIGURE_WINDOWS = new SubtaskNameEnum("CONFIGURE_WINDOWS");

        private static final Map<String, SubtaskNameEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SubtaskNameEnum> createStaticFields() {
            Map<String, SubtaskNameEnum> map = new HashMap<>();
            map.put("CREATE_CLOUD_SERVER", CREATE_CLOUD_SERVER);
            map.put("SSL_CONFIG", SSL_CONFIG);
            map.put("ATTACH_AGENT_IMAGE", ATTACH_AGENT_IMAGE);
            map.put("DETTACH_AGENT_IMAGE", DETTACH_AGENT_IMAGE);
            map.put("FORMAT_DISK_LINUX", FORMAT_DISK_LINUX);
            map.put("FORMAT_DISK_LINUX_FILE", FORMAT_DISK_LINUX_FILE);
            map.put("FORMAT_DISK_LINUX_BLOCK", FORMAT_DISK_LINUX_BLOCK);
            map.put("FORMAT_DISK_WINDOWS", FORMAT_DISK_WINDOWS);
            map.put("MIGRATE_LINUX_FILE", MIGRATE_LINUX_FILE);
            map.put("MIGRATE_LINUX_BLOCK", MIGRATE_LINUX_BLOCK);
            map.put("MIGRATE_WINDOWS_BLOCK", MIGRATE_WINDOWS_BLOCK);
            map.put("CLONE_VM", CLONE_VM);
            map.put("SYNC_LINUX_FILE", SYNC_LINUX_FILE);
            map.put("SYNC_LINUX_BLOCK", SYNC_LINUX_BLOCK);
            map.put("SYNC_WINDOWS_BLOCK", SYNC_WINDOWS_BLOCK);
            map.put("CONFIGURE_LINUX", CONFIGURE_LINUX);
            map.put("CONFIGURE_LINUX_BLOCK", CONFIGURE_LINUX_BLOCK);
            map.put("CONFIGURE_LINUX_FILE", CONFIGURE_LINUX_FILE);
            map.put("CONFIGURE_WINDOWS", CONFIGURE_WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SubtaskNameEnum(String value) {
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
        public static SubtaskNameEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SubtaskNameEnum(value));
        }

        public static SubtaskNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SubtaskNameEnum) {
                return this.value.equals(((SubtaskNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_name")

    private SubtaskNameEnum subtaskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicatesize")

    private Long replicatesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalsize")

    private Long totalsize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_trace")

    private String processTrace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_rate")

    private Double compressRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_time")

    private Long remainTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_usage")

    private Double totalCpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_cpu_usage")

    private Double agentCpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_mem_usage")

    private Double totalMemUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_mem_usage")

    private Double agentMemUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_disk_io")

    private Double totalDiskIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_disk_io")

    private Double agentDiskIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration_test")

    private Boolean needMigrationTest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_time")

    private String agentTime;

    public UpdateTaskSpeedReq withSubtaskName(SubtaskNameEnum subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /**
     * 当前上报进度的子任务名称，子任务名称包括： 创建虚拟机 CREATE_CLOUD_SERVER 配置安全通道 SSL_CONFIG 挂载代理镜像 ATTACH_AGENT_IMAGE 卸载代理镜像 DETTACH_AGENT_IMAGE Linux分区格式化 FORMAT_DISK_LINUX Linux分区格式化(文件级） FORMAT_DISK_LINUX_FILE Linux分区格式化(块级） FORMAT_DISK_LINUX_BLOCK Windows分区格式化 FORMAT_DISK_WINDOWS Linux文件级数据迁移 MIGRATE_LINUX_FILE, Linux块级数据迁移 MIGRATE_LINUX_BLOCK Windows块级数据迁移 MIGRATE_WINDOWS_BLOCK 克隆一个虚拟机 CLONE_VM Linux文件级数据同步 SYNC_LINUX_FILE Linux块级数据同步 SYNC_LINUX_BLOCK Windows块级数据同步 SYNC_WINDOWS_BLOCK Linux配置修改 CONFIGURE_LINUX Linux配置修改(块级）CONFIGURE_LINUX_BLOCK Linux配置修改（文件级） CONFIGURE_LINUX_FILE Windows配置修改 CONFIGURE_WINDOWS
     * @return subtaskName
     */
    public SubtaskNameEnum getSubtaskName() {
        return subtaskName;
    }

    public void setSubtaskName(SubtaskNameEnum subtaskName) {
        this.subtaskName = subtaskName;
    }

    public UpdateTaskSpeedReq withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 当前上报的子任务的最新百分比进度
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public UpdateTaskSpeedReq withReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
        return this;
    }

    /**
     * 当前任务已经复制的数据量大小（B）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return replicatesize
     */
    public Long getReplicatesize() {
        return replicatesize;
    }

    public void setReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
    }

    public UpdateTaskSpeedReq withTotalsize(Long totalsize) {
        this.totalsize = totalsize;
        return this;
    }

    /**
     * 当前任务的总迁移数据大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalsize
     */
    public Long getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(Long totalsize) {
        this.totalsize = totalsize;
    }

    public UpdateTaskSpeedReq withProcessTrace(String processTrace) {
        this.processTrace = processTrace;
        return this;
    }

    /**
     * 迁移或同步时，具体的迁移详情
     * @return processTrace
     */
    public String getProcessTrace() {
        return processTrace;
    }

    public void setProcessTrace(String processTrace) {
        this.processTrace = processTrace;
    }

    public UpdateTaskSpeedReq withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /**
     * 实施迁移速率，单位Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return migrateSpeed
     */
    public Double getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public UpdateTaskSpeedReq withCompressRate(Double compressRate) {
        this.compressRate = compressRate;
        return this;
    }

    /**
     * 实施文件压缩率
     * minimum: 0
     * maximum: 1E+4
     * @return compressRate
     */
    public Double getCompressRate() {
        return compressRate;
    }

    public void setCompressRate(Double compressRate) {
        this.compressRate = compressRate;
    }

    public UpdateTaskSpeedReq withRemainTime(Long remainTime) {
        this.remainTime = remainTime;
        return this;
    }

    /**
     * 剩余时间
     * minimum: 0
     * maximum: 2147483647
     * @return remainTime
     */
    public Long getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Long remainTime) {
        this.remainTime = remainTime;
    }

    public UpdateTaskSpeedReq withTotalCpuUsage(Double totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
        return this;
    }

    /**
     * 主机的CPU使用率，0到100，单位是百分比
     * minimum: 0
     * maximum: 1E+2
     * @return totalCpuUsage
     */
    public Double getTotalCpuUsage() {
        return totalCpuUsage;
    }

    public void setTotalCpuUsage(Double totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public UpdateTaskSpeedReq withAgentCpuUsage(Double agentCpuUsage) {
        this.agentCpuUsage = agentCpuUsage;
        return this;
    }

    /**
     * Agent的CPU使用率，0到100，单位是百分比
     * minimum: 0
     * maximum: 1E+2
     * @return agentCpuUsage
     */
    public Double getAgentCpuUsage() {
        return agentCpuUsage;
    }

    public void setAgentCpuUsage(Double agentCpuUsage) {
        this.agentCpuUsage = agentCpuUsage;
    }

    public UpdateTaskSpeedReq withTotalMemUsage(Double totalMemUsage) {
        this.totalMemUsage = totalMemUsage;
        return this;
    }

    /**
     * 主机的内存使用值，单位是MB
     * minimum: 0
     * maximum: 1048576
     * @return totalMemUsage
     */
    public Double getTotalMemUsage() {
        return totalMemUsage;
    }

    public void setTotalMemUsage(Double totalMemUsage) {
        this.totalMemUsage = totalMemUsage;
    }

    public UpdateTaskSpeedReq withAgentMemUsage(Double agentMemUsage) {
        this.agentMemUsage = agentMemUsage;
        return this;
    }

    /**
     * Agent的内存使用值，单位是MB
     * minimum: 0
     * maximum: 1048576
     * @return agentMemUsage
     */
    public Double getAgentMemUsage() {
        return agentMemUsage;
    }

    public void setAgentMemUsage(Double agentMemUsage) {
        this.agentMemUsage = agentMemUsage;
    }

    public UpdateTaskSpeedReq withTotalDiskIo(Double totalDiskIo) {
        this.totalDiskIo = totalDiskIo;
        return this;
    }

    /**
     * 主机的磁盘I/O值，单位是Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return totalDiskIo
     */
    public Double getTotalDiskIo() {
        return totalDiskIo;
    }

    public void setTotalDiskIo(Double totalDiskIo) {
        this.totalDiskIo = totalDiskIo;
    }

    public UpdateTaskSpeedReq withAgentDiskIo(Double agentDiskIo) {
        this.agentDiskIo = agentDiskIo;
        return this;
    }

    /**
     * Agent的磁盘I/O值，单位是Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return agentDiskIo
     */
    public Double getAgentDiskIo() {
        return agentDiskIo;
    }

    public void setAgentDiskIo(Double agentDiskIo) {
        this.agentDiskIo = agentDiskIo;
    }

    public UpdateTaskSpeedReq withNeedMigrationTest(Boolean needMigrationTest) {
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

    public UpdateTaskSpeedReq withAgentTime(String agentTime) {
        this.agentTime = agentTime;
        return this;
    }

    /**
     * Agent的当前时间，用于超速检测，因为限速值是可以分时间段设置的
     * @return agentTime
     */
    public String getAgentTime() {
        return agentTime;
    }

    public void setAgentTime(String agentTime) {
        this.agentTime = agentTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTaskSpeedReq that = (UpdateTaskSpeedReq) obj;
        return Objects.equals(this.subtaskName, that.subtaskName) && Objects.equals(this.progress, that.progress)
            && Objects.equals(this.replicatesize, that.replicatesize) && Objects.equals(this.totalsize, that.totalsize)
            && Objects.equals(this.processTrace, that.processTrace)
            && Objects.equals(this.migrateSpeed, that.migrateSpeed)
            && Objects.equals(this.compressRate, that.compressRate) && Objects.equals(this.remainTime, that.remainTime)
            && Objects.equals(this.totalCpuUsage, that.totalCpuUsage)
            && Objects.equals(this.agentCpuUsage, that.agentCpuUsage)
            && Objects.equals(this.totalMemUsage, that.totalMemUsage)
            && Objects.equals(this.agentMemUsage, that.agentMemUsage)
            && Objects.equals(this.totalDiskIo, that.totalDiskIo) && Objects.equals(this.agentDiskIo, that.agentDiskIo)
            && Objects.equals(this.needMigrationTest, that.needMigrationTest)
            && Objects.equals(this.agentTime, that.agentTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtaskName,
            progress,
            replicatesize,
            totalsize,
            processTrace,
            migrateSpeed,
            compressRate,
            remainTime,
            totalCpuUsage,
            agentCpuUsage,
            totalMemUsage,
            agentMemUsage,
            totalDiskIo,
            agentDiskIo,
            needMigrationTest,
            agentTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskSpeedReq {\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    replicatesize: ").append(toIndentedString(replicatesize)).append("\n");
        sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
        sb.append("    processTrace: ").append(toIndentedString(processTrace)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    compressRate: ").append(toIndentedString(compressRate)).append("\n");
        sb.append("    remainTime: ").append(toIndentedString(remainTime)).append("\n");
        sb.append("    totalCpuUsage: ").append(toIndentedString(totalCpuUsage)).append("\n");
        sb.append("    agentCpuUsage: ").append(toIndentedString(agentCpuUsage)).append("\n");
        sb.append("    totalMemUsage: ").append(toIndentedString(totalMemUsage)).append("\n");
        sb.append("    agentMemUsage: ").append(toIndentedString(agentMemUsage)).append("\n");
        sb.append("    totalDiskIo: ").append(toIndentedString(totalDiskIo)).append("\n");
        sb.append("    agentDiskIo: ").append(toIndentedString(agentDiskIo)).append("\n");
        sb.append("    needMigrationTest: ").append(toIndentedString(needMigrationTest)).append("\n");
        sb.append("    agentTime: ").append(toIndentedString(agentTime)).append("\n");
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
