package com.huaweicloud.sdk.bms.v1.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.Addresses;
import com.huaweicloud.sdk.bms.v1.model.Fault;
import com.huaweicloud.sdk.bms.v1.model.FlavorInfo;
import com.huaweicloud.sdk.bms.v1.model.Image;
import com.huaweicloud.sdk.bms.v1.model.Links;
import com.huaweicloud.sdk.bms.v1.model.MetadataInfos;
import com.huaweicloud.sdk.bms.v1.model.OsExtendedVolumes;
import com.huaweicloud.sdk.bms.v1.model.SecurityGroups;
import com.huaweicloud.sdk.bms.v1.model.ServerOsSchedulerHints;
import com.huaweicloud.sdk.bms.v1.model.SystemTags;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * server字段数据结构说明
 */
public class ChangeBaremetalNameResponsesServers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private UUID id;
    /**
     * 裸金属服务器当前状态。ACTIVE：运行中/正在关机/删除中BUILD：创建中ERROR：故障HARD_REBOOT：强制重启中REBOOT：重启中 SHUTOFF：关机/正在开机/删除中/重建中/重装操作系统中/重装操作系统失败/冻结
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
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");
        
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
         * Enum REBUILD for value: "REBUILD"
         */
        public static final StatusEnum REBUILD = new StatusEnum("REBUILD");
        
        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILD", BUILD);
            map.put("DELETED", DELETED);
            map.put("ERROR", ERROR);
            map.put("HARD_REBOOT", HARD_REBOOT);
            map.put("REBOOT", REBOOT);
            map.put("REBUILD", REBUILD);
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
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
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
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created")
    
    private OffsetDateTime created;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private OffsetDateTime updated;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private FlavorInfo flavor;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private Image image;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private UUID tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private UUID userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private MetadataInfos metadata;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostId")
    
    private UUID hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private Addresses addresses;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<SecurityGroups> securityGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<Links> links = null;
        /**
     * 扩展属性，磁盘配置方式，取值为如下两种：MANUAL：API使用镜像中的分区方案和文件系统创建裸金属服务器。如果目标flavor磁盘较大，则API不会对剩余磁盘空间进行分区。AUTO：API使用与目标flavor磁盘大小相同的单个分区创建裸金属服务器，API会自动调整文件系统以适应整个分区。
     */
    public static final class OsDCFDiskConfigEnum {

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");
        
        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");
        

        private static final Map<String, OsDCFDiskConfigEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsDCFDiskConfigEnum> createStaticFields() {
            Map<String, OsDCFDiskConfigEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("AUTO", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsDCFDiskConfigEnum(String value) {
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
        public static OsDCFDiskConfigEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsDCFDiskConfigEnum(value);
            }
            return result;
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsDCFDiskConfigEnum) {
                return this.value.equals(((OsDCFDiskConfigEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-DCF:diskConfig")
    
    private OsDCFDiskConfigEnum osDCFDiskConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-AZ:availability_zone")
    
    private String osEXTAZAvailabilityZone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:host")
    
    private String osEXTSRVATTRHost;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:hypervisor_hostname")
    
    private String osEXTSRVATTRHypervisorHostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:instance_name")
    
    private String osEXTSRVATTRInstanceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:power_state")
    
    private Integer osEXTSTSPowerState;
    /**
     * 扩展属性，裸金属服务器任务状态。例如：rebooting表示重启中reboot_started表示普通重启reboot_started_hard表示强制重启powering-off表示关机中powering-on表示开机中rebuilding表示重建中scheduling表示调度中deleting表示删除中
     */
    public static final class OsEXTSTSTaskStateEnum {

        
        /**
         * Enum REBOOTING for value: "rebooting"
         */
        public static final OsEXTSTSTaskStateEnum REBOOTING = new OsEXTSTSTaskStateEnum("rebooting");
        
        /**
         * Enum REBOOT_STARTED for value: "reboot_started"
         */
        public static final OsEXTSTSTaskStateEnum REBOOT_STARTED = new OsEXTSTSTaskStateEnum("reboot_started");
        
        /**
         * Enum REBOOT_STARTED_HARD for value: "reboot_started_hard"
         */
        public static final OsEXTSTSTaskStateEnum REBOOT_STARTED_HARD = new OsEXTSTSTaskStateEnum("reboot_started_hard");
        
        /**
         * Enum POWERING_OFF for value: "powering-off"
         */
        public static final OsEXTSTSTaskStateEnum POWERING_OFF = new OsEXTSTSTaskStateEnum("powering-off");
        
        /**
         * Enum POWERING_ON for value: "powering-on"
         */
        public static final OsEXTSTSTaskStateEnum POWERING_ON = new OsEXTSTSTaskStateEnum("powering-on");
        
        /**
         * Enum REBUILDING for value: "rebuilding"
         */
        public static final OsEXTSTSTaskStateEnum REBUILDING = new OsEXTSTSTaskStateEnum("rebuilding");
        
        /**
         * Enum SCHEDULING for value: "scheduling"
         */
        public static final OsEXTSTSTaskStateEnum SCHEDULING = new OsEXTSTSTaskStateEnum("scheduling");
        
        /**
         * Enum DELETING for value: "deleting"
         */
        public static final OsEXTSTSTaskStateEnum DELETING = new OsEXTSTSTaskStateEnum("deleting");
        

        private static final Map<String, OsEXTSTSTaskStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSTaskStateEnum> createStaticFields() {
            Map<String, OsEXTSTSTaskStateEnum> map = new HashMap<>();
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

        OsEXTSTSTaskStateEnum(String value) {
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
        public static OsEXTSTSTaskStateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSTaskStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEXTSTSTaskStateEnum(value);
            }
            return result;
        }

        public static OsEXTSTSTaskStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSTaskStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEXTSTSTaskStateEnum) {
                return this.value.equals(((OsEXTSTSTaskStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:task_state")
    
    private OsEXTSTSTaskStateEnum osEXTSTSTaskState;
    /**
     * 扩展属性，裸金属服务器状态。例如：RUNNING表示运行中SHUTOFF表示关机SUSPENDED表示暂停REBOOT表示重启
     */
    public static final class OsEXTSTSVmStateEnum {

        
        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final OsEXTSTSVmStateEnum RUNNING = new OsEXTSTSVmStateEnum("RUNNING");
        
        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final OsEXTSTSVmStateEnum SHUTOFF = new OsEXTSTSVmStateEnum("SHUTOFF");
        
        /**
         * Enum SUSPENDED for value: "SUSPENDED"
         */
        public static final OsEXTSTSVmStateEnum SUSPENDED = new OsEXTSTSVmStateEnum("SUSPENDED");
        
        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final OsEXTSTSVmStateEnum REBOOT = new OsEXTSTSVmStateEnum("REBOOT");
        

        private static final Map<String, OsEXTSTSVmStateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsEXTSTSVmStateEnum> createStaticFields() {
            Map<String, OsEXTSTSVmStateEnum> map = new HashMap<>();
            map.put("RUNNING", RUNNING);
            map.put("SHUTOFF", SHUTOFF);
            map.put("SUSPENDED", SUSPENDED);
            map.put("REBOOT", REBOOT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsEXTSTSVmStateEnum(String value) {
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
        public static OsEXTSTSVmStateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSVmStateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsEXTSTSVmStateEnum(value);
            }
            return result;
        }

        public static OsEXTSTSVmStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSVmStateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsEXTSTSVmStateEnum) {
                return this.value.equals(((OsEXTSTSVmStateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-STS:vm_state")
    
    private OsEXTSTSVmStateEnum osEXTSTSVmState;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-SRV-USG:launched_at")
    
    private OffsetDateTime osSRVUSGLaunchedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-SRV-USG:terminated_at")
    
    private OffsetDateTime osSRVUSGTerminatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extended-volumes:volumes_attached")
    
    private List<OsExtendedVolumes> osExtendedVolumesVolumesAttached = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv4")
    
    private String accessIPv4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv6")
    
    private String accessIPv6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fault")
    
    private Fault fault;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_drive")
    
    private String configDrive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private Integer progress;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * 裸金属服务器宿主机状态。UP：服务正常UNKNOWN：状态未知DOWN：服务异常MAINTENANCE：维护状态空字符串：裸金属服务器无主机信息
     */
    public static final class HostStatusEnum {

        
        /**
         * Enum UP for value: "UP"
         */
        public static final HostStatusEnum UP = new HostStatusEnum("UP");
        
        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final HostStatusEnum UNKNOWN = new HostStatusEnum("UNKNOWN");
        
        /**
         * Enum DOWN for value: "DOWN"
         */
        public static final HostStatusEnum DOWN = new HostStatusEnum("DOWN");
        
        /**
         * Enum MAINTENANCE for value: "MAINTENANCE"
         */
        public static final HostStatusEnum MAINTENANCE = new HostStatusEnum("MAINTENANCE");
        

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("UP", UP);
            map.put("UNKNOWN", UNKNOWN);
            map.put("DOWN", DOWN);
            map.put("MAINTENANCE", MAINTENANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostStatusEnum(String value) {
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
        public static HostStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostStatusEnum(value);
            }
            return result;
        }

        public static HostStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostStatusEnum) {
                return this.value.equals(((HostStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_status")
    
    private HostStatusEnum hostStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:hostname")
    
    private String osEXTSRVATTRHostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:reservation_id")
    
    private UUID osEXTSRVATTRReservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:launch_index")
    
    private Integer osEXTSRVATTRLaunchIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:kernel_id")
    
    private UUID osEXTSRVATTRKernelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:ramdisk_id")
    
    private UUID osEXTSRVATTRRamdiskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:root_device_name")
    
    private String osEXTSRVATTRRootDeviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:user_data")
    
    private String osEXTSRVATTRUserData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Boolean locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sys_tags")
    
    private List<SystemTags> sysTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os:scheduler_hints")
    
    private ServerOsSchedulerHints osSchedulerHints;

    public ChangeBaremetalNameResponsesServers withName(String name) {
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

    

    public ChangeBaremetalNameResponsesServers withId(UUID id) {
        this.id = id;
        return this;
    }

    


    /**
     * 裸金属服务器唯一标识ID
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    

    public ChangeBaremetalNameResponsesServers withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 裸金属服务器当前状态。ACTIVE：运行中/正在关机/删除中BUILD：创建中ERROR：故障HARD_REBOOT：强制重启中REBOOT：重启中 SHUTOFF：关机/正在开机/删除中/重建中/重装操作系统中/重装操作系统失败/冻结
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ChangeBaremetalNameResponsesServers withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    


    /**
     * 裸金属服务器创建时间。时间戳格式为ISO 8601：YYYY-MM-DDTHH:MM:SSZ，例如：2019-05-22T03:30:52Z
     * @return created
     */
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    

    public ChangeBaremetalNameResponsesServers withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 裸金属服务器上一次更新时间。时间戳格式为ISO 8601：YYYY-MM-DDTHH:MM:SSZ，例如：2019-05-22T04:30:52Z
     * @return updated
     */
    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    

    public ChangeBaremetalNameResponsesServers withFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withFlavor(Consumer<FlavorInfo> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new FlavorInfo();
            flavorSetter.accept(this.flavor);
        }
        
        return this;
    }


    /**
     * Get flavor
     * @return flavor
     */
    public FlavorInfo getFlavor() {
        return flavor;
    }

    public void setFlavor(FlavorInfo flavor) {
        this.flavor = flavor;
    }

    

    public ChangeBaremetalNameResponsesServers withImage(Image image) {
        this.image = image;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withImage(Consumer<Image> imageSetter) {
        if(this.image == null ){
            this.image = new Image();
            imageSetter.accept(this.image);
        }
        
        return this;
    }


    /**
     * Get image
     * @return image
     */
    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    

    public ChangeBaremetalNameResponsesServers withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 裸金属服务器所属租户ID，格式为UUID。该参数和project_id表示相同的概念。
     * @return tenantId
     */
    public UUID getTenantId() {
        return tenantId;
    }

    public void setTenantId(UUID tenantId) {
        this.tenantId = tenantId;
    }

    

    public ChangeBaremetalNameResponsesServers withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * SSH密钥名称
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    

    public ChangeBaremetalNameResponsesServers withUserId(UUID userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 裸金属服务器所属用户ID。
     * @return userId
     */
    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    

    public ChangeBaremetalNameResponsesServers withMetadata(MetadataInfos metadata) {
        this.metadata = metadata;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withMetadata(Consumer<MetadataInfos> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new MetadataInfos();
            metadataSetter.accept(this.metadata);
        }
        
        return this;
    }


    /**
     * Get metadata
     * @return metadata
     */
    public MetadataInfos getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataInfos metadata) {
        this.metadata = metadata;
    }

    

    public ChangeBaremetalNameResponsesServers withHostId(UUID hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 裸金属服务器的主机ID
     * @return hostId
     */
    public UUID getHostId() {
        return hostId;
    }

    public void setHostId(UUID hostId) {
        this.hostId = hostId;
    }

    

    public ChangeBaremetalNameResponsesServers withAddresses(Addresses addresses) {
        this.addresses = addresses;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withAddresses(Consumer<Addresses> addressesSetter) {
        if(this.addresses == null ){
            this.addresses = new Addresses();
            addressesSetter.accept(this.addresses);
        }
        
        return this;
    }


    /**
     * Get addresses
     * @return addresses
     */
    public Addresses getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses addresses) {
        this.addresses = addresses;
    }

    

    public ChangeBaremetalNameResponsesServers withSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public ChangeBaremetalNameResponsesServers addSecurityGroupsItem(SecurityGroups securityGroupsItem) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ChangeBaremetalNameResponsesServers withSecurityGroups(Consumer<List<SecurityGroups>> securityGroupsSetter) {
        if(this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 裸金属服务器所属安全组列表。
     * @return securityGroups
     */
    public List<SecurityGroups> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroups> securityGroups) {
        this.securityGroups = securityGroups;
    }

    

    public ChangeBaremetalNameResponsesServers withLinks(List<Links> links) {
        this.links = links;
        return this;
    }

    
    public ChangeBaremetalNameResponsesServers addLinksItem(Links linksItem) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        this.links.add(linksItem);
        return this;
    }

    public ChangeBaremetalNameResponsesServers withLinks(Consumer<List<Links>> linksSetter) {
        if(this.links == null) {
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 裸金属服务器相关信息快捷链接
     * @return links
     */
    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }

    

    public ChangeBaremetalNameResponsesServers withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    


    /**
     * 扩展属性，磁盘配置方式，取值为如下两种：MANUAL：API使用镜像中的分区方案和文件系统创建裸金属服务器。如果目标flavor磁盘较大，则API不会对剩余磁盘空间进行分区。AUTO：API使用与目标flavor磁盘大小相同的单个分区创建裸金属服务器，API会自动调整文件系统以适应整个分区。
     * @return osDCFDiskConfig
     */
    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
        return this;
    }

    


    /**
     * 扩展属性，可用分区编码。
     * @return osEXTAZAvailabilityZone
     */
    public String getOsEXTAZAvailabilityZone() {
        return osEXTAZAvailabilityZone;
    }

    public void setOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
        this.osEXTAZAvailabilityZone = osEXTAZAvailabilityZone;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器宿主名称
     * @return osEXTSRVATTRHost
     */
    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    


    /**
     * 扩展属性，hypervisor主机名称，由Nova virt驱动提供
     * @return osEXTSRVATTRHypervisorHostname
     */
    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器实例ID
     * @return osEXTSRVATTRInstanceName
     */
    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器电源状态。例如：0表示“NO STATE”1表示“RUNNING”4表示“SHUTDOWN”
     * @return osEXTSTSPowerState
     */
    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器任务状态。例如：rebooting表示重启中reboot_started表示普通重启reboot_started_hard表示强制重启powering-off表示关机中powering-on表示开机中rebuilding表示重建中scheduling表示调度中deleting表示删除中
     * @return osEXTSTSTaskState
     */
    public OsEXTSTSTaskStateEnum getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器状态。例如：RUNNING表示运行中SHUTOFF表示关机SUSPENDED表示暂停REBOOT表示重启
     * @return osEXTSTSVmState
     */
    public OsEXTSTSVmStateEnum getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    

    public ChangeBaremetalNameResponsesServers withOsSRVUSGLaunchedAt(OffsetDateTime osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器启动时间。时间戳格式为ISO 8601，例如：2019-05-25T03:40:25.000000
     * @return osSRVUSGLaunchedAt
     */
    public OffsetDateTime getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(OffsetDateTime osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    

    public ChangeBaremetalNameResponsesServers withOsSRVUSGTerminatedAt(OffsetDateTime osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    


    /**
     * 扩展属性，裸金属服务器关闭时间。时间戳格式为ISO 8601，例如：2019-06-25T03:40:25.000000
     * @return osSRVUSGTerminatedAt
     */
    public OffsetDateTime getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(OffsetDateTime osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    

    public ChangeBaremetalNameResponsesServers withOsExtendedVolumesVolumesAttached(List<OsExtendedVolumes> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    
    public ChangeBaremetalNameResponsesServers addOsExtendedVolumesVolumesAttachedItem(OsExtendedVolumes osExtendedVolumesVolumesAttachedItem) {
        if(this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public ChangeBaremetalNameResponsesServers withOsExtendedVolumesVolumesAttached(Consumer<List<OsExtendedVolumes>> osExtendedVolumesVolumesAttachedSetter) {
        if(this.osExtendedVolumesVolumesAttached == null) {
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    /**
     * 裸金属服务器挂载的云硬盘信息。详情请参见表 os-extended-volumes:volumes_attached字段数据结构说明。
     * @return osExtendedVolumesVolumesAttached
     */
    public List<OsExtendedVolumes> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<OsExtendedVolumes> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    

    public ChangeBaremetalNameResponsesServers withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    


    /**
     * 预留属性
     * @return accessIPv4
     */
    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    

    public ChangeBaremetalNameResponsesServers withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    


    /**
     * 预留属性
     * @return accessIPv6
     */
    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    

    public ChangeBaremetalNameResponsesServers withFault(Fault fault) {
        this.fault = fault;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withFault(Consumer<Fault> faultSetter) {
        if(this.fault == null ){
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

    

    public ChangeBaremetalNameResponsesServers withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    


    /**
     * config drive信息
     * @return configDrive
     */
    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    

    public ChangeBaremetalNameResponsesServers withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    


    /**
     * 预留属性
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    

    public ChangeBaremetalNameResponsesServers withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 裸金属服务器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    public ChangeBaremetalNameResponsesServers withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * 裸金属服务器宿主机状态。UP：服务正常UNKNOWN：状态未知DOWN：服务异常MAINTENANCE：维护状态空字符串：裸金属服务器无主机信息
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    


    /**
     * 裸金属服务器的主机名
     * @return osEXTSRVATTRHostname
     */
    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRReservationId(UUID osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    


    /**
     * 批量创建场景，裸金属服务器的预留ID。当批量创建裸金属服务器时，这些服务器将拥有相同的reservation_id。您可以使用6.3.3-查询裸金属服务器详情列表API并指定reservation_id来过滤查询同一批创建的所有裸金属服务器。
     * @return osEXTSRVATTRReservationId
     */
    public UUID getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(UUID osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    


    /**
     * 批量创建场景，裸金属服务器的启动顺序
     * @return osEXTSRVATTRLaunchIndex
     */
    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRKernelId(UUID osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    


    /**
     * 若使用AMI格式的镜像，则表示kernel image的UUID；否则，留空
     * @return osEXTSRVATTRKernelId
     */
    public UUID getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(UUID osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRRamdiskId(UUID osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    


    /**
     * 若使用AMI格式镜像，则表示ramdisk image的UUID；否则，留空。
     * @return osEXTSRVATTRRamdiskId
     */
    public UUID getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(UUID osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    


    /**
     * 裸金属服务器系统盘的设备名称，例如“/dev/sdb”。
     * @return osEXTSRVATTRRootDeviceName
     */
    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    

    public ChangeBaremetalNameResponsesServers withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    


    /**
     * 创建裸金属服务器时指定的user_data。取值为base64编码后的结果或空字符串。
     * @return osEXTSRVATTRUserData
     */
    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    

    public ChangeBaremetalNameResponsesServers withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 裸金属服务器实例是否为锁定状态。true：锁定false：未锁定
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    

    public ChangeBaremetalNameResponsesServers withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public ChangeBaremetalNameResponsesServers addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ChangeBaremetalNameResponsesServers withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 裸金属服务器标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    public ChangeBaremetalNameResponsesServers withSysTags(List<SystemTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    
    public ChangeBaremetalNameResponsesServers addSysTagsItem(SystemTags sysTagsItem) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ChangeBaremetalNameResponsesServers withSysTags(Consumer<List<SystemTags>> sysTagsSetter) {
        if(this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 裸金属服务器的系统标签
     * @return sysTags
     */
    public List<SystemTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SystemTags> sysTags) {
        this.sysTags = sysTags;
    }

    

    public ChangeBaremetalNameResponsesServers withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * enterprise_project_id。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    public ChangeBaremetalNameResponsesServers withOsSchedulerHints(ServerOsSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
        return this;
    }

    public ChangeBaremetalNameResponsesServers withOsSchedulerHints(Consumer<ServerOsSchedulerHints> osSchedulerHintsSetter) {
        if(this.osSchedulerHints == null ){
            this.osSchedulerHints = new ServerOsSchedulerHints();
            osSchedulerHintsSetter.accept(this.osSchedulerHints);
        }
        
        return this;
    }


    /**
     * Get osSchedulerHints
     * @return osSchedulerHints
     */
    public ServerOsSchedulerHints getOsSchedulerHints() {
        return osSchedulerHints;
    }

    public void setOsSchedulerHints(ServerOsSchedulerHints osSchedulerHints) {
        this.osSchedulerHints = osSchedulerHints;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeBaremetalNameResponsesServers changeBaremetalNameResponsesServers = (ChangeBaremetalNameResponsesServers) o;
        return Objects.equals(this.name, changeBaremetalNameResponsesServers.name) &&
            Objects.equals(this.id, changeBaremetalNameResponsesServers.id) &&
            Objects.equals(this.status, changeBaremetalNameResponsesServers.status) &&
            Objects.equals(this.created, changeBaremetalNameResponsesServers.created) &&
            Objects.equals(this.updated, changeBaremetalNameResponsesServers.updated) &&
            Objects.equals(this.flavor, changeBaremetalNameResponsesServers.flavor) &&
            Objects.equals(this.image, changeBaremetalNameResponsesServers.image) &&
            Objects.equals(this.tenantId, changeBaremetalNameResponsesServers.tenantId) &&
            Objects.equals(this.keyName, changeBaremetalNameResponsesServers.keyName) &&
            Objects.equals(this.userId, changeBaremetalNameResponsesServers.userId) &&
            Objects.equals(this.metadata, changeBaremetalNameResponsesServers.metadata) &&
            Objects.equals(this.hostId, changeBaremetalNameResponsesServers.hostId) &&
            Objects.equals(this.addresses, changeBaremetalNameResponsesServers.addresses) &&
            Objects.equals(this.securityGroups, changeBaremetalNameResponsesServers.securityGroups) &&
            Objects.equals(this.links, changeBaremetalNameResponsesServers.links) &&
            Objects.equals(this.osDCFDiskConfig, changeBaremetalNameResponsesServers.osDCFDiskConfig) &&
            Objects.equals(this.osEXTAZAvailabilityZone, changeBaremetalNameResponsesServers.osEXTAZAvailabilityZone) &&
            Objects.equals(this.osEXTSRVATTRHost, changeBaremetalNameResponsesServers.osEXTSRVATTRHost) &&
            Objects.equals(this.osEXTSRVATTRHypervisorHostname, changeBaremetalNameResponsesServers.osEXTSRVATTRHypervisorHostname) &&
            Objects.equals(this.osEXTSRVATTRInstanceName, changeBaremetalNameResponsesServers.osEXTSRVATTRInstanceName) &&
            Objects.equals(this.osEXTSTSPowerState, changeBaremetalNameResponsesServers.osEXTSTSPowerState) &&
            Objects.equals(this.osEXTSTSTaskState, changeBaremetalNameResponsesServers.osEXTSTSTaskState) &&
            Objects.equals(this.osEXTSTSVmState, changeBaremetalNameResponsesServers.osEXTSTSVmState) &&
            Objects.equals(this.osSRVUSGLaunchedAt, changeBaremetalNameResponsesServers.osSRVUSGLaunchedAt) &&
            Objects.equals(this.osSRVUSGTerminatedAt, changeBaremetalNameResponsesServers.osSRVUSGTerminatedAt) &&
            Objects.equals(this.osExtendedVolumesVolumesAttached, changeBaremetalNameResponsesServers.osExtendedVolumesVolumesAttached) &&
            Objects.equals(this.accessIPv4, changeBaremetalNameResponsesServers.accessIPv4) &&
            Objects.equals(this.accessIPv6, changeBaremetalNameResponsesServers.accessIPv6) &&
            Objects.equals(this.fault, changeBaremetalNameResponsesServers.fault) &&
            Objects.equals(this.configDrive, changeBaremetalNameResponsesServers.configDrive) &&
            Objects.equals(this.progress, changeBaremetalNameResponsesServers.progress) &&
            Objects.equals(this.description, changeBaremetalNameResponsesServers.description) &&
            Objects.equals(this.hostStatus, changeBaremetalNameResponsesServers.hostStatus) &&
            Objects.equals(this.osEXTSRVATTRHostname, changeBaremetalNameResponsesServers.osEXTSRVATTRHostname) &&
            Objects.equals(this.osEXTSRVATTRReservationId, changeBaremetalNameResponsesServers.osEXTSRVATTRReservationId) &&
            Objects.equals(this.osEXTSRVATTRLaunchIndex, changeBaremetalNameResponsesServers.osEXTSRVATTRLaunchIndex) &&
            Objects.equals(this.osEXTSRVATTRKernelId, changeBaremetalNameResponsesServers.osEXTSRVATTRKernelId) &&
            Objects.equals(this.osEXTSRVATTRRamdiskId, changeBaremetalNameResponsesServers.osEXTSRVATTRRamdiskId) &&
            Objects.equals(this.osEXTSRVATTRRootDeviceName, changeBaremetalNameResponsesServers.osEXTSRVATTRRootDeviceName) &&
            Objects.equals(this.osEXTSRVATTRUserData, changeBaremetalNameResponsesServers.osEXTSRVATTRUserData) &&
            Objects.equals(this.locked, changeBaremetalNameResponsesServers.locked) &&
            Objects.equals(this.tags, changeBaremetalNameResponsesServers.tags) &&
            Objects.equals(this.sysTags, changeBaremetalNameResponsesServers.sysTags) &&
            Objects.equals(this.enterpriseProjectId, changeBaremetalNameResponsesServers.enterpriseProjectId) &&
            Objects.equals(this.osSchedulerHints, changeBaremetalNameResponsesServers.osSchedulerHints);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, status, created, updated, flavor, image, tenantId, keyName, userId, metadata, hostId, addresses, securityGroups, links, osDCFDiskConfig, osEXTAZAvailabilityZone, osEXTSRVATTRHost, osEXTSRVATTRHypervisorHostname, osEXTSRVATTRInstanceName, osEXTSTSPowerState, osEXTSTSTaskState, osEXTSTSVmState, osSRVUSGLaunchedAt, osSRVUSGTerminatedAt, osExtendedVolumesVolumesAttached, accessIPv4, accessIPv6, fault, configDrive, progress, description, hostStatus, osEXTSRVATTRHostname, osEXTSRVATTRReservationId, osEXTSRVATTRLaunchIndex, osEXTSRVATTRKernelId, osEXTSRVATTRRamdiskId, osEXTSRVATTRRootDeviceName, osEXTSRVATTRUserData, locked, tags, sysTags, enterpriseProjectId, osSchedulerHints);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeBaremetalNameResponsesServers {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
        sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    keyName: ").append(toIndentedString(keyName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    links: ").append(toIndentedString(links)).append("\n");
        sb.append("    osDCFDiskConfig: ").append(toIndentedString(osDCFDiskConfig)).append("\n");
        sb.append("    osEXTAZAvailabilityZone: ").append(toIndentedString(osEXTAZAvailabilityZone)).append("\n");
        sb.append("    osEXTSRVATTRHost: ").append(toIndentedString(osEXTSRVATTRHost)).append("\n");
        sb.append("    osEXTSRVATTRHypervisorHostname: ").append(toIndentedString(osEXTSRVATTRHypervisorHostname)).append("\n");
        sb.append("    osEXTSRVATTRInstanceName: ").append(toIndentedString(osEXTSRVATTRInstanceName)).append("\n");
        sb.append("    osEXTSTSPowerState: ").append(toIndentedString(osEXTSTSPowerState)).append("\n");
        sb.append("    osEXTSTSTaskState: ").append(toIndentedString(osEXTSTSTaskState)).append("\n");
        sb.append("    osEXTSTSVmState: ").append(toIndentedString(osEXTSTSVmState)).append("\n");
        sb.append("    osSRVUSGLaunchedAt: ").append(toIndentedString(osSRVUSGLaunchedAt)).append("\n");
        sb.append("    osSRVUSGTerminatedAt: ").append(toIndentedString(osSRVUSGTerminatedAt)).append("\n");
        sb.append("    osExtendedVolumesVolumesAttached: ").append(toIndentedString(osExtendedVolumesVolumesAttached)).append("\n");
        sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
        sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
        sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
        sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
        sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
        sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
        sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
        sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
        sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
        sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    osSchedulerHints: ").append(toIndentedString(osSchedulerHints)).append("\n");
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

