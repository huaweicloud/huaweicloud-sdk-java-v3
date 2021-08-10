package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** This is a auto create Body Object */
public class UpdateTaskSpeedReq {

    /** 当前上报进度的子任务名称，子任务名称包括： 创建虚拟机 CREATE_CLOUD_SERVER 配置安全通道 SSL_CONFIG 挂载代理镜像 ATTACH_AGENT_IMAGE 卸载载代理镜像
     * DETTACH_AGENT_IMAGE Linux分区格式化 FORMAT_DISK_LINUX Linux分区格式化(文件级级） FORMAT_DISK_LINUX_FILE Linux分区格式化(块级）
     * FORMAT_DISK_LINUX_BLOCK Windows分区格式化 FORMAT_DISK_WINDOWS Linux文件级数据迁移 MIGRATE_LINUX_FILE, Linux块级数据迁移
     * MIGRATE_LINUX_BLOCK Windows块级数据迁移 MIGRATE_WINDOWS_BLOCK 克隆一个虚拟机 CLONE_VM Linux文件级数据同步 SYNC_LINUX_FILE Linux块级数据同步
     * SYNC_LINUX_BLOCK Windows块级数据同步 SYNC_WINDOWS_BLOCK Linux配置修改 CONFIGURE_LINUX Linux配置修改(块级）CONFIGURE_LINUX_BLOCK
     * Linux配置修改（文件级） CONFIGURE_LINUX_FILE Windows配置修改 CONFIGURE_WINDOWS */
    public static final class SubtaskNameEnum {

        /** Enum CREATE_CLOUD_SERVER for value: "CREATE_CLOUD_SERVER" */
        public static final SubtaskNameEnum CREATE_CLOUD_SERVER = new SubtaskNameEnum("CREATE_CLOUD_SERVER");

        /** Enum SSL_CONFIG for value: "SSL_CONFIG" */
        public static final SubtaskNameEnum SSL_CONFIG = new SubtaskNameEnum("SSL_CONFIG");

        /** Enum ATTACH_AGENT_IMAGE for value: "ATTACH_AGENT_IMAGE" */
        public static final SubtaskNameEnum ATTACH_AGENT_IMAGE = new SubtaskNameEnum("ATTACH_AGENT_IMAGE");

        /** Enum DETTACH_AGENT_IMAGE for value: "DETTACH_AGENT_IMAGE" */
        public static final SubtaskNameEnum DETTACH_AGENT_IMAGE = new SubtaskNameEnum("DETTACH_AGENT_IMAGE");

        /** Enum FORMAT_DISK_LINUX for value: "FORMAT_DISK_LINUX" */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX = new SubtaskNameEnum("FORMAT_DISK_LINUX");

        /** Enum FORMAT_DISK_LINUX_FILE for value: "FORMAT_DISK_LINUX_FILE" */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX_FILE = new SubtaskNameEnum("FORMAT_DISK_LINUX_FILE");

        /** Enum FORMAT_DISK_LINUX_BLOCK for value: "FORMAT_DISK_LINUX_BLOCK" */
        public static final SubtaskNameEnum FORMAT_DISK_LINUX_BLOCK = new SubtaskNameEnum("FORMAT_DISK_LINUX_BLOCK");

        /** Enum FORMAT_DISK_WINDOWS for value: "FORMAT_DISK_WINDOWS" */
        public static final SubtaskNameEnum FORMAT_DISK_WINDOWS = new SubtaskNameEnum("FORMAT_DISK_WINDOWS");

        /** Enum MIGRATE_LINUX_FILE for value: "MIGRATE_LINUX_FILE" */
        public static final SubtaskNameEnum MIGRATE_LINUX_FILE = new SubtaskNameEnum("MIGRATE_LINUX_FILE");

        /** Enum MIGRATE_LINUX_BLOCK for value: "MIGRATE_LINUX_BLOCK" */
        public static final SubtaskNameEnum MIGRATE_LINUX_BLOCK = new SubtaskNameEnum("MIGRATE_LINUX_BLOCK");

        /** Enum MIGRATE_WINDOWS_BLOCK for value: "MIGRATE_WINDOWS_BLOCK" */
        public static final SubtaskNameEnum MIGRATE_WINDOWS_BLOCK = new SubtaskNameEnum("MIGRATE_WINDOWS_BLOCK");

        /** Enum CLONE_VM for value: "CLONE_VM" */
        public static final SubtaskNameEnum CLONE_VM = new SubtaskNameEnum("CLONE_VM");

        /** Enum SYNC_LINUX_FILE for value: "SYNC_LINUX_FILE" */
        public static final SubtaskNameEnum SYNC_LINUX_FILE = new SubtaskNameEnum("SYNC_LINUX_FILE");

        /** Enum SYNC_LINUX_BLOCK for value: "SYNC_LINUX_BLOCK" */
        public static final SubtaskNameEnum SYNC_LINUX_BLOCK = new SubtaskNameEnum("SYNC_LINUX_BLOCK");

        /** Enum SYNC_WINDOWS_BLOCK for value: "SYNC_WINDOWS_BLOCK" */
        public static final SubtaskNameEnum SYNC_WINDOWS_BLOCK = new SubtaskNameEnum("SYNC_WINDOWS_BLOCK");

        /** Enum CONFIGURE_LINUX for value: "CONFIGURE_LINUX" */
        public static final SubtaskNameEnum CONFIGURE_LINUX = new SubtaskNameEnum("CONFIGURE_LINUX");

        /** Enum CONFIGURE_LINUX_BLOCK for value: "CONFIGURE_LINUX_BLOCK" */
        public static final SubtaskNameEnum CONFIGURE_LINUX_BLOCK = new SubtaskNameEnum("CONFIGURE_LINUX_BLOCK");

        /** Enum CONFIGURE_LINUX_FILE for value: "CONFIGURE_LINUX_FILE" */
        public static final SubtaskNameEnum CONFIGURE_LINUX_FILE = new SubtaskNameEnum("CONFIGURE_LINUX_FILE");

        /** Enum CONFIGURE_WINDOWS for value: "CONFIGURE_WINDOWS" */
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
            SubtaskNameEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SubtaskNameEnum(value);
            }
            return result;
        }

        public static SubtaskNameEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SubtaskNameEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    public UpdateTaskSpeedReq withSubtaskName(SubtaskNameEnum subtaskName) {
        this.subtaskName = subtaskName;
        return this;
    }

    /** 当前上报进度的子任务名称，子任务名称包括： 创建虚拟机 CREATE_CLOUD_SERVER 配置安全通道 SSL_CONFIG 挂载代理镜像 ATTACH_AGENT_IMAGE 卸载载代理镜像
     * DETTACH_AGENT_IMAGE Linux分区格式化 FORMAT_DISK_LINUX Linux分区格式化(文件级级） FORMAT_DISK_LINUX_FILE Linux分区格式化(块级）
     * FORMAT_DISK_LINUX_BLOCK Windows分区格式化 FORMAT_DISK_WINDOWS Linux文件级数据迁移 MIGRATE_LINUX_FILE, Linux块级数据迁移
     * MIGRATE_LINUX_BLOCK Windows块级数据迁移 MIGRATE_WINDOWS_BLOCK 克隆一个虚拟机 CLONE_VM Linux文件级数据同步 SYNC_LINUX_FILE Linux块级数据同步
     * SYNC_LINUX_BLOCK Windows块级数据同步 SYNC_WINDOWS_BLOCK Linux配置修改 CONFIGURE_LINUX Linux配置修改(块级）CONFIGURE_LINUX_BLOCK
     * Linux配置修改（文件级） CONFIGURE_LINUX_FILE Windows配置修改 CONFIGURE_WINDOWS
     * 
     * @return subtaskName */
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

    /** 当前上报的子任务的最新百分比进度 minimum: 0 maximum: 100
     * 
     * @return progress */
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

    /** 当前任务已经复制的数据量大小（B） minimum: 0 maximum: 9223372036854775807
     * 
     * @return replicatesize */
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

    /** 当前任务的总迁移数据大小 minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalsize */
    public Long getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(Long totalsize) {
        this.totalsize = totalsize;
    }

    public UpdateTaskSpeedReq withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /** 实施迁移速率，单位Mb/s minimum: 0 maximum: 1E+4
     * 
     * @return migrateSpeed */
    public Double getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTaskSpeedReq updateTaskSpeedReq = (UpdateTaskSpeedReq) o;
        return Objects.equals(this.subtaskName, updateTaskSpeedReq.subtaskName)
            && Objects.equals(this.progress, updateTaskSpeedReq.progress)
            && Objects.equals(this.replicatesize, updateTaskSpeedReq.replicatesize)
            && Objects.equals(this.totalsize, updateTaskSpeedReq.totalsize)
            && Objects.equals(this.migrateSpeed, updateTaskSpeedReq.migrateSpeed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subtaskName, progress, replicatesize, totalsize, migrateSpeed);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTaskSpeedReq {\n");
        sb.append("    subtaskName: ").append(toIndentedString(subtaskName)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    replicatesize: ").append(toIndentedString(replicatesize)).append("\n");
        sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
