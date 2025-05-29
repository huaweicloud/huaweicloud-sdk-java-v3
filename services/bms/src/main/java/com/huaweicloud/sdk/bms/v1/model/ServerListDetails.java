package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * server字段数据结构说明
 */
public class ServerListDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated")

    private String updated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_id")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor")

    private FlavorDetailInfos flavor;

    /**
     * 裸金属服务器当前状态信息。  取值范围：  ACTIVE：运行中/正在关机/删除中 BUILD：创建中 ERROR：故障 HARD_REBOOT：强制重启中 REBOOT：重启中 DELETED：实例已被正常删除 SHUTOFF：关机/正在开机/删除中/重建中/重装操作系统中/重装操作系统失败/冻结
     */
    public static final class StatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        /**
         * Enum BUILD for value: "BUILD"
         */
        public static final StatusEnum BUILD = new StatusEnum("BUILD");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final StatusEnum ERROR = new StatusEnum("ERROR");

        /**
         * Enum HARD_REBOOT for value: "HARD_REBOOT"
         */
        public static final StatusEnum HARD_REBOOT = new StatusEnum("HARD_REBOOT");

        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final StatusEnum REBOOT = new StatusEnum("REBOOT");

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");

        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("ERROR", ERROR);
            map.put("HARD_REBOOT", HARD_REBOOT);
            map.put("REBOOT", REBOOT);
            map.put("DELETED", DELETED);
            map.put("SHUTOFF", SHUTOFF);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private StatusEnum status;

    /**
     * 扩展属性，裸金属服务器当前的任务状态。例如：rebooting：重启中reboot_started：普通重启reboot_started_hard：强制重启powering-off：关机中powering-on：开机中rebuilding：重建中scheduling：调度中deleting：删除中
     */
    public static final class TaskStateEnum {

        /**
         * Enum REBOOTING for value: "rebooting"
         */
        public static final TaskStateEnum REBOOTING = new TaskStateEnum("rebooting");

        /**
         * Enum REBOOT_STARTED for value: "reboot_started"
         */
        public static final TaskStateEnum REBOOT_STARTED = new TaskStateEnum("reboot_started");

        /**
         * Enum REBOOT_STARTED_HARD for value: "reboot_started_hard"
         */
        public static final TaskStateEnum REBOOT_STARTED_HARD = new TaskStateEnum("reboot_started_hard");

        /**
         * Enum POWERING_OFF for value: "powering-off"
         */
        public static final TaskStateEnum POWERING_OFF = new TaskStateEnum("powering-off");

        /**
         * Enum POWERING_ON for value: "powering-on"
         */
        public static final TaskStateEnum POWERING_ON = new TaskStateEnum("powering-on");

        /**
         * Enum REBUILDING for value: "rebuilding"
         */
        public static final TaskStateEnum REBUILDING = new TaskStateEnum("rebuilding");

        /**
         * Enum SCHEDULING for value: "scheduling"
         */
        public static final TaskStateEnum SCHEDULING = new TaskStateEnum("scheduling");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final TaskStateEnum DELETING = new TaskStateEnum("deleting");

        private static final Map<String, TaskStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TaskStateEnum> createStaticFields() {
            Map<String, TaskStateEnum> map = new HashMap<>();
            map.put("rebooting", REBOOTING);
            map.put("reboot_started", REBOOT_STARTED);
            map.put("reboot_started_hard", REBOOT_STARTED_HARD);
            map.put("powering-off", POWERING_OFF);
            map.put("powering-on", POWERING_ON);
            map.put("rebuilding", REBUILDING);
            map.put("scheduling", SCHEDULING);
            map.put("deleting", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TaskStateEnum(String value) {
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
        public static TaskStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TaskStateEnum(value));
        }

        public static TaskStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TaskStateEnum) {
                return this.value.equals(((TaskStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private TaskStateEnum taskState;

    /**
     * 扩展属性，裸金属服务器的稳定状态。例如：active：运行中shutoff：关机reboot：重启
     */
    public static final class VmStateEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final VmStateEnum ACTIVE = new VmStateEnum("active");

        /**
         * Enum SHUTOFF for value: "shutoff"
         */
        public static final VmStateEnum SHUTOFF = new VmStateEnum("shutoff");

        /**
         * Enum REBOOT for value: "reboot"
         */
        public static final VmStateEnum REBOOT = new VmStateEnum("reboot");

        private static final Map<String, VmStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VmStateEnum> createStaticFields() {
            Map<String, VmStateEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("shutoff", SHUTOFF);
            map.put("reboot", REBOOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VmStateEnum(String value) {
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
        public static VmStateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VmStateEnum(value));
        }

        public static VmStateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VmStateEnum) {
                return this.value.equals(((VmStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_state")

    private VmStateEnum vmState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone")

    private String availabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fault")

    private Fault fault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_recycle_bin")

    private Boolean inRecycleBin;

    public ServerListDetails withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * 裸金属服务器ID，格式为UUID
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ServerListDetails withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 创建裸金属服务器的用户ID，格式为UUID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ServerListDetails withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 裸金属服务器名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ServerListDetails withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * 裸金属服务器创建时间。时间戳格式为ISO 8601：YYYY-MM-DDTHH:MM:SSZ，例如：2019-05-22T03:30:52Z
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ServerListDetails withUpdated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * 裸金属服务器更新时间。时间戳格式为ISO 8601：YYYY-MM-DDTHH:MM:SSZ，例如：2019-05-22T04:30:52Z
     * @return updated
     */
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public ServerListDetails withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * 裸金属服务器所属租户ID，格式为UUID。该参数和project_id表示相同的概念。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public ServerListDetails withFlavor(FlavorDetailInfos flavor) {
        this.flavor = flavor;
        return this;
    }

    public ServerListDetails withFlavor(Consumer<FlavorDetailInfos> flavorSetter) {
        if (this.flavor == null) {
            this.flavor = new FlavorDetailInfos();
            flavorSetter.accept(this.flavor);
        }

        return this;
    }

    /**
     * Get flavor
     * @return flavor
     */
    public FlavorDetailInfos getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorDetailInfos flavor) {
        this.flavor = flavor;
    }

    public ServerListDetails withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 裸金属服务器当前状态信息。  取值范围：  ACTIVE：运行中/正在关机/删除中 BUILD：创建中 ERROR：故障 HARD_REBOOT：强制重启中 REBOOT：重启中 DELETED：实例已被正常删除 SHUTOFF：关机/正在开机/删除中/重建中/重装操作系统中/重装操作系统失败/冻结
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ServerListDetails withTaskState(TaskStateEnum taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 扩展属性，裸金属服务器当前的任务状态。例如：rebooting：重启中reboot_started：普通重启reboot_started_hard：强制重启powering-off：关机中powering-on：开机中rebuilding：重建中scheduling：调度中deleting：删除中
     * @return taskState
     */
    public TaskStateEnum getTaskState() {
        return taskState;
    }

    public void setTaskState(TaskStateEnum taskState) {
        this.taskState = taskState;
    }

    public ServerListDetails withVmState(VmStateEnum vmState) {
        this.vmState = vmState;
        return this;
    }

    /**
     * 扩展属性，裸金属服务器的稳定状态。例如：active：运行中shutoff：关机reboot：重启
     * @return vmState
     */
    public VmStateEnum getVmState() {
        return vmState;
    }

    public void setVmState(VmStateEnum vmState) {
        this.vmState = vmState;
    }

    public ServerListDetails withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * 扩展属性，裸金属服务器所在可用分区名称。
     * @return availabilityZone
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ServerListDetails withFault(Fault fault) {
        this.fault = fault;
        return this;
    }

    public ServerListDetails withFault(Consumer<Fault> faultSetter) {
        if (this.fault == null) {
            this.fault = new Fault();
            faultSetter.accept(this.fault);
        }

        return this;
    }

    /**
     * Get fault
     * @return fault
     */
    public Fault getFault() {
        return fault;
    }

    public void setFault(Fault fault) {
        this.fault = fault;
    }

    public ServerListDetails withInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
        return this;
    }

    /**
     * 裸机是否在回收站中
     * @return inRecycleBin
     */
    public Boolean getInRecycleBin() {
        return inRecycleBin;
    }

    public void setInRecycleBin(Boolean inRecycleBin) {
        this.inRecycleBin = inRecycleBin;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerListDetails that = (ServerListDetails) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.created, that.created)
            && Objects.equals(this.updated, that.updated) && Objects.equals(this.tenantId, that.tenantId)
            && Objects.equals(this.flavor, that.flavor) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskState, that.taskState) && Objects.equals(this.vmState, that.vmState)
            && Objects.equals(this.availabilityZone, that.availabilityZone) && Objects.equals(this.fault, that.fault)
            && Objects.equals(this.inRecycleBin, that.inRecycleBin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            userId,
            name,
            created,
            updated,
            tenantId,
            flavor,
            status,
            taskState,
            vmState,
            availabilityZone,
            fault,
            inRecycleBin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerListDetails {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    vmState: ").append(toIndentedString(vmState)).append("\n");
        sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    inRecycleBin: ").append(toIndentedString(inRecycleBin)).append("\n");
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
