package com.huaweicloud.sdk.ecs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ecs.v2.model.NovaLink;
import com.huaweicloud.sdk.ecs.v2.model.NovaNetwork;
import com.huaweicloud.sdk.ecs.v2.model.NovaSecurityGroup;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerFault;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerFlavor;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerImage;
import com.huaweicloud.sdk.ecs.v2.model.NovaServerVolume;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 *  
 */
public class NovaServer  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;
    /**
     * 云服务器当前状态信息。   取值范围： ACTIVE， BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE
     */
    public static class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");

        
        /**
         * Enum _BUILD for value: " BUILD"
         */
        public static final StatusEnum _BUILD = new StatusEnum(" BUILD");

        
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
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        
        /**
         * Enum REBOOT for value: "REBOOT"
         */
        public static final StatusEnum REBOOT = new StatusEnum("REBOOT");

        
        /**
         * Enum RESIZE for value: "RESIZE"
         */
        public static final StatusEnum RESIZE = new StatusEnum("RESIZE");

        
        /**
         * Enum REVERT_RESIZE for value: "REVERT_RESIZE"
         */
        public static final StatusEnum REVERT_RESIZE = new StatusEnum("REVERT_RESIZE");

        
        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final StatusEnum SHELVED = new StatusEnum("SHELVED");

        
        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final StatusEnum SHELVED_OFFLOADED = new StatusEnum("SHELVED_OFFLOADED");

        
        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final StatusEnum SHUTOFF = new StatusEnum("SHUTOFF");

        
        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final StatusEnum UNKNOWN = new StatusEnum("UNKNOWN");

        
        /**
         * Enum VERIFY_RESIZE for value: "VERIFY_RESIZE"
         */
        public static final StatusEnum VERIFY_RESIZE = new StatusEnum("VERIFY_RESIZE");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put(" BUILD", _BUILD);
                        put("DELETED", DELETED);
                        put("ERROR", ERROR);
                        put("HARD_REBOOT", HARD_REBOOT);
                        put("MIGRATING", MIGRATING);
                        put("REBOOT", REBOOT);
                        put("RESIZE", RESIZE);
                        put("REVERT_RESIZE", REVERT_RESIZE);
                        put("SHELVED", SHELVED);
                        put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
                        put("SHUTOFF", SHUTOFF);
                        put("UNKNOWN", UNKNOWN);
                        put("VERIFY_RESIZE", VERIFY_RESIZE);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
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
    
    private OffsetDateTime created = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated")
    
    private OffsetDateTime updated = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="flavor")
    
    private NovaServerFlavor flavor = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private NovaServerImage image = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tenant_id")
    
    private String tenantId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="key_name")
    
    private String keyName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="metadata")
    
    private Map<String, String> metadata = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostId")
    
    private String hostId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="addresses")
    
    private Map<String, List<NovaNetwork>> addresses = new HashMap<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_groups")
    
    private List<NovaSecurityGroup> securityGroups = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="links")
    
    private List<NovaLink> links = new ArrayList<>();
        /**
     * 扩展属性，磁盘配置方式。对镜像启动云服务器生效。  取值范围：  - AUTO: API使用单个分区构建目标磁盘大小的云服务器。 API会自动调整文件系统以适应整个分区。 - MANUAL：API使用源映像中的分区方案和文件系统构建服务器。如果目标磁盘较大，则API不分区剩余的磁盘空间。
     */
    public static class OsDCFDiskConfigEnum {

        
        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final OsDCFDiskConfigEnum AUTO = new OsDCFDiskConfigEnum("AUTO");

        
        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final OsDCFDiskConfigEnum MANUAL = new OsDCFDiskConfigEnum("MANUAL");

        

        public static Map<String, OsDCFDiskConfigEnum> staticFields =
                new HashMap<String, OsDCFDiskConfigEnum>() {
                    { 
                        put("AUTO", AUTO);
                        put("MANUAL", MANUAL);
                    }
                };

        private String value;

        OsDCFDiskConfigEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsDCFDiskConfigEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsDCFDiskConfigEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsDCFDiskConfigEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsDCFDiskConfigEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsDCFDiskConfigEnum) {
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
     * 扩展属性，云服务器任务状态。   取值范围：  SHOUTOFF, RESIZE, REBUILD, VERIFY_RESIZE, REVERT_RESIZE, PAUSED, MIGRATING, SUSPENDED, RESCUE, ERROR, DELETED,SOFT_DELETED,SHELVED,SHELVED_OFFLOADED
     */
    public static class OsEXTSTSTaskStateEnum {

        
        /**
         * Enum SHOUTOFF for value: "SHOUTOFF"
         */
        public static final OsEXTSTSTaskStateEnum SHOUTOFF = new OsEXTSTSTaskStateEnum("SHOUTOFF");

        
        /**
         * Enum _RESIZE for value: " RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _RESIZE = new OsEXTSTSTaskStateEnum(" RESIZE");

        
        /**
         * Enum _REBUILD for value: " REBUILD"
         */
        public static final OsEXTSTSTaskStateEnum _REBUILD = new OsEXTSTSTaskStateEnum(" REBUILD");

        
        /**
         * Enum _VERIFY_RESIZE for value: " VERIFY_RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _VERIFY_RESIZE = new OsEXTSTSTaskStateEnum(" VERIFY_RESIZE");

        
        /**
         * Enum _REVERT_RESIZE for value: " REVERT_RESIZE"
         */
        public static final OsEXTSTSTaskStateEnum _REVERT_RESIZE = new OsEXTSTSTaskStateEnum(" REVERT_RESIZE");

        
        /**
         * Enum _PAUSED for value: " PAUSED"
         */
        public static final OsEXTSTSTaskStateEnum _PAUSED = new OsEXTSTSTaskStateEnum(" PAUSED");

        
        /**
         * Enum _MIGRATING for value: " MIGRATING"
         */
        public static final OsEXTSTSTaskStateEnum _MIGRATING = new OsEXTSTSTaskStateEnum(" MIGRATING");

        
        /**
         * Enum _SUSPENDED for value: " SUSPENDED"
         */
        public static final OsEXTSTSTaskStateEnum _SUSPENDED = new OsEXTSTSTaskStateEnum(" SUSPENDED");

        
        /**
         * Enum _RESCUE for value: " RESCUE"
         */
        public static final OsEXTSTSTaskStateEnum _RESCUE = new OsEXTSTSTaskStateEnum(" RESCUE");

        
        /**
         * Enum _ERROR for value: " ERROR"
         */
        public static final OsEXTSTSTaskStateEnum _ERROR = new OsEXTSTSTaskStateEnum(" ERROR");

        
        /**
         * Enum _DELETED for value: " DELETED"
         */
        public static final OsEXTSTSTaskStateEnum _DELETED = new OsEXTSTSTaskStateEnum(" DELETED");

        
        /**
         * Enum SOFT_DELETED for value: "SOFT_DELETED"
         */
        public static final OsEXTSTSTaskStateEnum SOFT_DELETED = new OsEXTSTSTaskStateEnum("SOFT_DELETED");

        
        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final OsEXTSTSTaskStateEnum SHELVED = new OsEXTSTSTaskStateEnum("SHELVED");

        
        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final OsEXTSTSTaskStateEnum SHELVED_OFFLOADED = new OsEXTSTSTaskStateEnum("SHELVED_OFFLOADED");

        

        public static Map<String, OsEXTSTSTaskStateEnum> staticFields =
                new HashMap<String, OsEXTSTSTaskStateEnum>() {
                    { 
                        put("SHOUTOFF", SHOUTOFF);
                        put(" RESIZE", _RESIZE);
                        put(" REBUILD", _REBUILD);
                        put(" VERIFY_RESIZE", _VERIFY_RESIZE);
                        put(" REVERT_RESIZE", _REVERT_RESIZE);
                        put(" PAUSED", _PAUSED);
                        put(" MIGRATING", _MIGRATING);
                        put(" SUSPENDED", _SUSPENDED);
                        put(" RESCUE", _RESCUE);
                        put(" ERROR", _ERROR);
                        put(" DELETED", _DELETED);
                        put("SOFT_DELETED", SOFT_DELETED);
                        put("SHELVED", SHELVED);
                        put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
                    }
                };

        private String value;

        OsEXTSTSTaskStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsEXTSTSTaskStateEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsEXTSTSTaskStateEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsEXTSTSTaskStateEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsEXTSTSTaskStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSTaskStateEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsEXTSTSTaskStateEnum) {
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
     * 扩展属性，云服务器状态。  取值范围：   ACTIVE,BUILDING,STOPPED,RESIZED,PAUSED,SUSPENDED,RESCUED,ERROR,DELETED,SOFT_DELETED,SHELVED,SHELVED_OFFLOADED
     */
    public static class OsEXTSTSVmStateEnum {

        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final OsEXTSTSVmStateEnum ACTIVE = new OsEXTSTSVmStateEnum("ACTIVE");

        
        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final OsEXTSTSVmStateEnum BUILDING = new OsEXTSTSVmStateEnum("BUILDING");

        
        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final OsEXTSTSVmStateEnum STOPPED = new OsEXTSTSVmStateEnum("STOPPED");

        
        /**
         * Enum RESIZED for value: "RESIZED"
         */
        public static final OsEXTSTSVmStateEnum RESIZED = new OsEXTSTSVmStateEnum("RESIZED");

        
        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final OsEXTSTSVmStateEnum PAUSED = new OsEXTSTSVmStateEnum("PAUSED");

        
        /**
         * Enum SUSPENDED for value: "SUSPENDED"
         */
        public static final OsEXTSTSVmStateEnum SUSPENDED = new OsEXTSTSVmStateEnum("SUSPENDED");

        
        /**
         * Enum RESCUED for value: "RESCUED"
         */
        public static final OsEXTSTSVmStateEnum RESCUED = new OsEXTSTSVmStateEnum("RESCUED");

        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final OsEXTSTSVmStateEnum ERROR = new OsEXTSTSVmStateEnum("ERROR");

        
        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final OsEXTSTSVmStateEnum DELETED = new OsEXTSTSVmStateEnum("DELETED");

        
        /**
         * Enum SOFT_DELETED for value: "SOFT_DELETED"
         */
        public static final OsEXTSTSVmStateEnum SOFT_DELETED = new OsEXTSTSVmStateEnum("SOFT_DELETED");

        
        /**
         * Enum SHELVED for value: "SHELVED"
         */
        public static final OsEXTSTSVmStateEnum SHELVED = new OsEXTSTSVmStateEnum("SHELVED");

        
        /**
         * Enum SHELVED_OFFLOADED for value: "SHELVED_OFFLOADED"
         */
        public static final OsEXTSTSVmStateEnum SHELVED_OFFLOADED = new OsEXTSTSVmStateEnum("SHELVED_OFFLOADED");

        

        public static Map<String, OsEXTSTSVmStateEnum> staticFields =
                new HashMap<String, OsEXTSTSVmStateEnum>() {
                    { 
                        put("ACTIVE", ACTIVE);
                        put("BUILDING", BUILDING);
                        put("STOPPED", STOPPED);
                        put("RESIZED", RESIZED);
                        put("PAUSED", PAUSED);
                        put("SUSPENDED", SUSPENDED);
                        put("RESCUED", RESCUED);
                        put("ERROR", ERROR);
                        put("DELETED", DELETED);
                        put("SOFT_DELETED", SOFT_DELETED);
                        put("SHELVED", SHELVED);
                        put("SHELVED_OFFLOADED", SHELVED_OFFLOADED);
                    }
                };

        private String value;

        OsEXTSTSVmStateEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsEXTSTSVmStateEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            OsEXTSTSVmStateEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OsEXTSTSVmStateEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OsEXTSTSVmStateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsEXTSTSVmStateEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsEXTSTSVmStateEnum) {
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
    
    private String osSRVUSGLaunchedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-SRV-USG:terminated_at")
    
    private String osSRVUSGTerminatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os-extended-volumes:volumes_attached")
    
    private List<NovaServerVolume> osExtendedVolumesVolumesAttached = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fault")
    
    private NovaServerFault fault = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;
    /**
     * nova-compute状态。  - UP：服务正常 - UNKNOWN：状态未知 - DOWN：服务异常 - MAINTENANCE：维护状态 - 空字符串：弹性云服务器无主机信息
     */
    public static class HostStatusEnum {

        
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

        

        public static Map<String, HostStatusEnum> staticFields =
                new HashMap<String, HostStatusEnum>() {
                    { 
                        put("UP", UP);
                        put("UNKNOWN", UNKNOWN);
                        put("DOWN", DOWN);
                        put("MAINTENANCE", MAINTENANCE);
                    }
                };

        private String value;

        HostStatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static HostStatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            HostStatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new HostStatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static HostStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            HostStatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof HostStatusEnum) {
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
    
    private String osEXTSRVATTRReservationId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:launch_index")
    
    private Integer osEXTSRVATTRLaunchIndex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:kernel_id")
    
    private String osEXTSRVATTRKernelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:ramdisk_id")
    
    private String osEXTSRVATTRRamdiskId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:root_device_name")
    
    private String osEXTSRVATTRRootDeviceName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="OS-EXT-SRV-ATTR:user_data")
    
    private String osEXTSRVATTRUserData;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="locked")
    
    private Boolean locked;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv4")
    
    private String accessIPv4;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessIPv6")
    
    private String accessIPv6;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="config_drive")
    
    private String configDrive;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="progress")
    
    private Integer progress;

    public NovaServer withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 云服务器名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NovaServer withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 云服务器唯一标识。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NovaServer withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 云服务器当前状态信息。   取值范围： ACTIVE， BUILD，DELETED，ERROR，HARD_REBOOT，MIGRATING，REBOOT，RESIZE，REVERT_RESIZE，SHELVED，SHELVED_OFFLOADED，SHUTOFF，UNKNOWN，VERIFY_RESIZE
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public NovaServer withCreated(OffsetDateTime created) {
        this.created = created;
        return this;
    }

    


    /**
     * 云服务器创建时间。 时间格式例如：2019-05-22T07:48:53Z
     * @return created
     */
    public OffsetDateTime getCreated() {
        return created;
    }

    public void setCreated(OffsetDateTime created) {
        this.created = created;
    }

    public NovaServer withUpdated(OffsetDateTime updated) {
        this.updated = updated;
        return this;
    }

    


    /**
     * 云服务器上一次更新时间。时间格式例如：2019-05-22T07:48:53Z
     * @return updated
     */
    public OffsetDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(OffsetDateTime updated) {
        this.updated = updated;
    }

    public NovaServer withFlavor(NovaServerFlavor flavor) {
        this.flavor = flavor;
        return this;
    }

    public NovaServer withFlavor(Consumer<NovaServerFlavor> flavorSetter) {
        if(this.flavor == null ){
            this.flavor = new NovaServerFlavor();
        }
        flavorSetter.accept(this.flavor);
        return this;
    }


    /**
     * Get flavor
     * @return flavor
     */
    public NovaServerFlavor getFlavor() {
        return flavor;
    }

    public void setFlavor(NovaServerFlavor flavor) {
        this.flavor = flavor;
    }

    public NovaServer withImage(NovaServerImage image) {
        this.image = image;
        return this;
    }

    public NovaServer withImage(Consumer<NovaServerImage> imageSetter) {
        if(this.image == null ){
            this.image = new NovaServerImage();
        }
        imageSetter.accept(this.image);
        return this;
    }


    /**
     * Get image
     * @return image
     */
    public NovaServerImage getImage() {
        return image;
    }

    public void setImage(NovaServerImage image) {
        this.image = image;
    }

    public NovaServer withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    


    /**
     * 云服务器所属租户ID。即项目id，与project_id表示相同的概念。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public NovaServer withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    


    /**
     * SSH密钥名称。
     * @return keyName
     */
    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public NovaServer withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 云服务器所属用户ID。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public NovaServer withMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    

    public NovaServer putMetadataItem(String key, String metadataItem) {
        this.metadata.put(key, metadataItem);
        return this;
    }

    public NovaServer withMetadata(Consumer<Map<String, String>> metadataSetter) {
        if(this.metadata == null ){
            this.metadata = new HashMap<>();
        }
        metadataSetter.accept(this.metadata);
        return this;
    }
    /**
     * 云服务器元数据。
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public NovaServer withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    


    /**
     * 云服务器对应的主机ID。
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public NovaServer withAddresses(Map<String, List<NovaNetwork>> addresses) {
        this.addresses = addresses;
        return this;
    }

    

    public NovaServer putAddressesItem(String key, List<NovaNetwork> addressesItem) {
        this.addresses.put(key, addressesItem);
        return this;
    }

    public NovaServer withAddresses(Consumer<Map<String, List<NovaNetwork>>> addressesSetter) {
        if(this.addresses == null ){
            this.addresses = new HashMap<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }
    /**
     * 云服务器对应的网络地址信息。
     * @return addresses
     */
    public Map<String, List<NovaNetwork>> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, List<NovaNetwork>> addresses) {
        this.addresses = addresses;
    }

    public NovaServer withSecurityGroups(List<NovaSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    
    public NovaServer addSecurityGroupsItem(NovaSecurityGroup securityGroupsItem) {
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public NovaServer withSecurityGroups(Consumer<List<NovaSecurityGroup>> securityGroupsSetter) {
        if(this.securityGroups == null ){
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /**
     * 云服务器所属安全组列表。
     * @return securityGroups
     */
    public List<NovaSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<NovaSecurityGroup> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public NovaServer withLinks(List<NovaLink> links) {
        this.links = links;
        return this;
    }

    
    public NovaServer addLinksItem(NovaLink linksItem) {
        this.links.add(linksItem);
        return this;
    }

    public NovaServer withLinks(Consumer<List<NovaLink>> linksSetter) {
        if(this.links == null ){
            this.links = new ArrayList<>();
        }
        linksSetter.accept(this.links);
        return this;
    }

    /**
     * 云服务器相关标记快捷链接信息。
     * @return links
     */
    public List<NovaLink> getLinks() {
        return links;
    }

    public void setLinks(List<NovaLink> links) {
        this.links = links;
    }

    public NovaServer withOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
        return this;
    }

    


    /**
     * 扩展属性，磁盘配置方式。对镜像启动云服务器生效。  取值范围：  - AUTO: API使用单个分区构建目标磁盘大小的云服务器。 API会自动调整文件系统以适应整个分区。 - MANUAL：API使用源映像中的分区方案和文件系统构建服务器。如果目标磁盘较大，则API不分区剩余的磁盘空间。
     * @return osDCFDiskConfig
     */
    public OsDCFDiskConfigEnum getOsDCFDiskConfig() {
        return osDCFDiskConfig;
    }

    public void setOsDCFDiskConfig(OsDCFDiskConfigEnum osDCFDiskConfig) {
        this.osDCFDiskConfig = osDCFDiskConfig;
    }

    public NovaServer withOsEXTAZAvailabilityZone(String osEXTAZAvailabilityZone) {
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

    public NovaServer withOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
        return this;
    }

    


    /**
     * 扩展属性，与主机宿主名称。
     * @return osEXTSRVATTRHost
     */
    public String getOsEXTSRVATTRHost() {
        return osEXTSRVATTRHost;
    }

    public void setOsEXTSRVATTRHost(String osEXTSRVATTRHost) {
        this.osEXTSRVATTRHost = osEXTSRVATTRHost;
    }

    public NovaServer withOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
        return this;
    }

    


    /**
     * 扩展属性，hypervisor主机名。
     * @return osEXTSRVATTRHypervisorHostname
     */
    public String getOsEXTSRVATTRHypervisorHostname() {
        return osEXTSRVATTRHypervisorHostname;
    }

    public void setOsEXTSRVATTRHypervisorHostname(String osEXTSRVATTRHypervisorHostname) {
        this.osEXTSRVATTRHypervisorHostname = osEXTSRVATTRHypervisorHostname;
    }

    public NovaServer withOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
        return this;
    }

    


    /**
     * 扩展属性，云服务器实例ID。
     * @return osEXTSRVATTRInstanceName
     */
    public String getOsEXTSRVATTRInstanceName() {
        return osEXTSRVATTRInstanceName;
    }

    public void setOsEXTSRVATTRInstanceName(String osEXTSRVATTRInstanceName) {
        this.osEXTSRVATTRInstanceName = osEXTSRVATTRInstanceName;
    }

    public NovaServer withOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
        return this;
    }

    


    /**
     * 扩展属性，云服务器电源状态。  取值范围：0，1，2，3，4  - 0 : pending - 1 : running - 2 : paused - 3 : shutdown - 4 : crashed
     * minimum: 0
     * maximum: 4
     * @return osEXTSTSPowerState
     */
    public Integer getOsEXTSTSPowerState() {
        return osEXTSTSPowerState;
    }

    public void setOsEXTSTSPowerState(Integer osEXTSTSPowerState) {
        this.osEXTSTSPowerState = osEXTSTSPowerState;
    }

    public NovaServer withOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
        return this;
    }

    


    /**
     * 扩展属性，云服务器任务状态。   取值范围：  SHOUTOFF, RESIZE, REBUILD, VERIFY_RESIZE, REVERT_RESIZE, PAUSED, MIGRATING, SUSPENDED, RESCUE, ERROR, DELETED,SOFT_DELETED,SHELVED,SHELVED_OFFLOADED
     * @return osEXTSTSTaskState
     */
    public OsEXTSTSTaskStateEnum getOsEXTSTSTaskState() {
        return osEXTSTSTaskState;
    }

    public void setOsEXTSTSTaskState(OsEXTSTSTaskStateEnum osEXTSTSTaskState) {
        this.osEXTSTSTaskState = osEXTSTSTaskState;
    }

    public NovaServer withOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
        return this;
    }

    


    /**
     * 扩展属性，云服务器状态。  取值范围：   ACTIVE,BUILDING,STOPPED,RESIZED,PAUSED,SUSPENDED,RESCUED,ERROR,DELETED,SOFT_DELETED,SHELVED,SHELVED_OFFLOADED
     * @return osEXTSTSVmState
     */
    public OsEXTSTSVmStateEnum getOsEXTSTSVmState() {
        return osEXTSTSVmState;
    }

    public void setOsEXTSTSVmState(OsEXTSTSVmStateEnum osEXTSTSVmState) {
        this.osEXTSTSVmState = osEXTSTSVmState;
    }

    public NovaServer withOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
        return this;
    }

    


    /**
     * 扩展属性，云服务器启动时间。时间格式例如：2019-05-22T07:48:19.000000
     * @return osSRVUSGLaunchedAt
     */
    public String getOsSRVUSGLaunchedAt() {
        return osSRVUSGLaunchedAt;
    }

    public void setOsSRVUSGLaunchedAt(String osSRVUSGLaunchedAt) {
        this.osSRVUSGLaunchedAt = osSRVUSGLaunchedAt;
    }

    public NovaServer withOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
        return this;
    }

    


    /**
     * 扩展属性，云服务器关闭时间。  时间格式例如：2019-05-22T07:48:19.000000
     * @return osSRVUSGTerminatedAt
     */
    public String getOsSRVUSGTerminatedAt() {
        return osSRVUSGTerminatedAt;
    }

    public void setOsSRVUSGTerminatedAt(String osSRVUSGTerminatedAt) {
        this.osSRVUSGTerminatedAt = osSRVUSGTerminatedAt;
    }

    public NovaServer withOsExtendedVolumesVolumesAttached(List<NovaServerVolume> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
        return this;
    }

    
    public NovaServer addOsExtendedVolumesVolumesAttachedItem(NovaServerVolume osExtendedVolumesVolumesAttachedItem) {
        this.osExtendedVolumesVolumesAttached.add(osExtendedVolumesVolumesAttachedItem);
        return this;
    }

    public NovaServer withOsExtendedVolumesVolumesAttached(Consumer<List<NovaServerVolume>> osExtendedVolumesVolumesAttachedSetter) {
        if(this.osExtendedVolumesVolumesAttached == null ){
            this.osExtendedVolumesVolumesAttached = new ArrayList<>();
        }
        osExtendedVolumesVolumesAttachedSetter.accept(this.osExtendedVolumesVolumesAttached);
        return this;
    }

    /**
     * 云服务器挂载的云磁盘信息。
     * @return osExtendedVolumesVolumesAttached
     */
    public List<NovaServerVolume> getOsExtendedVolumesVolumesAttached() {
        return osExtendedVolumesVolumesAttached;
    }

    public void setOsExtendedVolumesVolumesAttached(List<NovaServerVolume> osExtendedVolumesVolumesAttached) {
        this.osExtendedVolumesVolumesAttached = osExtendedVolumesVolumesAttached;
    }

    public NovaServer withFault(NovaServerFault fault) {
        this.fault = fault;
        return this;
    }

    public NovaServer withFault(Consumer<NovaServerFault> faultSetter) {
        if(this.fault == null ){
            this.fault = new NovaServerFault();
        }
        faultSetter.accept(this.fault);
        return this;
    }


    /**
     * Get fault
     * @return fault
     */
    public NovaServerFault getFault() {
        return fault;
    }

    public void setFault(NovaServerFault fault) {
        this.fault = fault;
    }

    public NovaServer withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 弹性云服务器的描述信息。  微版本2.19后支持
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public NovaServer withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    


    /**
     * nova-compute状态。  - UP：服务正常 - UNKNOWN：状态未知 - DOWN：服务异常 - MAINTENANCE：维护状态 - 空字符串：弹性云服务器无主机信息
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public NovaServer withOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
        return this;
    }

    


    /**
     * 弹性云服务器的主机名。  微版本2.3后支持
     * @return osEXTSRVATTRHostname
     */
    public String getOsEXTSRVATTRHostname() {
        return osEXTSRVATTRHostname;
    }

    public void setOsEXTSRVATTRHostname(String osEXTSRVATTRHostname) {
        this.osEXTSRVATTRHostname = osEXTSRVATTRHostname;
    }

    public NovaServer withOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
        return this;
    }

    


    /**
     * 批量创建场景，弹性云服务器的预留ID。  微版本2.3后支持
     * @return osEXTSRVATTRReservationId
     */
    public String getOsEXTSRVATTRReservationId() {
        return osEXTSRVATTRReservationId;
    }

    public void setOsEXTSRVATTRReservationId(String osEXTSRVATTRReservationId) {
        this.osEXTSRVATTRReservationId = osEXTSRVATTRReservationId;
    }

    public NovaServer withOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
        return this;
    }

    


    /**
     * 批量创建场景，弹性云服务器的启动顺序。  微版本2.3后支持
     * @return osEXTSRVATTRLaunchIndex
     */
    public Integer getOsEXTSRVATTRLaunchIndex() {
        return osEXTSRVATTRLaunchIndex;
    }

    public void setOsEXTSRVATTRLaunchIndex(Integer osEXTSRVATTRLaunchIndex) {
        this.osEXTSRVATTRLaunchIndex = osEXTSRVATTRLaunchIndex;
    }

    public NovaServer withOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
        return this;
    }

    


    /**
     * 若使用AMI格式的镜像，则表示kernel image的UUID；否则，留空。  微版本2.3后支持
     * @return osEXTSRVATTRKernelId
     */
    public String getOsEXTSRVATTRKernelId() {
        return osEXTSRVATTRKernelId;
    }

    public void setOsEXTSRVATTRKernelId(String osEXTSRVATTRKernelId) {
        this.osEXTSRVATTRKernelId = osEXTSRVATTRKernelId;
    }

    public NovaServer withOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
        return this;
    }

    


    /**
     * 若使用AMI格式镜像，则表示ramdisk image的UUID；否则，留空。  微版本2.3后支持
     * @return osEXTSRVATTRRamdiskId
     */
    public String getOsEXTSRVATTRRamdiskId() {
        return osEXTSRVATTRRamdiskId;
    }

    public void setOsEXTSRVATTRRamdiskId(String osEXTSRVATTRRamdiskId) {
        this.osEXTSRVATTRRamdiskId = osEXTSRVATTRRamdiskId;
    }

    public NovaServer withOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
        return this;
    }

    


    /**
     * 弹性云服务器系统盘的设备名称。  微版本2.3后支持
     * @return osEXTSRVATTRRootDeviceName
     */
    public String getOsEXTSRVATTRRootDeviceName() {
        return osEXTSRVATTRRootDeviceName;
    }

    public void setOsEXTSRVATTRRootDeviceName(String osEXTSRVATTRRootDeviceName) {
        this.osEXTSRVATTRRootDeviceName = osEXTSRVATTRRootDeviceName;
    }

    public NovaServer withOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
        return this;
    }

    


    /**
     * 创建弹性云服务器时指定的user_data。  微版本2.3后支持
     * @return osEXTSRVATTRUserData
     */
    public String getOsEXTSRVATTRUserData() {
        return osEXTSRVATTRUserData;
    }

    public void setOsEXTSRVATTRUserData(String osEXTSRVATTRUserData) {
        this.osEXTSRVATTRUserData = osEXTSRVATTRUserData;
    }

    public NovaServer withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public NovaServer addTagsItem(String tagsItem) {
        this.tags.add(tagsItem);
        return this;
    }

    public NovaServer withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null ){
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 云服务器的标签列表。  系统近期对标签功能进行了升级，升级后，返回的tag值遵循如下规则：  - key与value使用“=”连接，如“key=value”。 - 如果value为空字符串，则仅返回key。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public NovaServer withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    


    /**
     * 当云服务器被锁时为True，否则为False。  微版本2.9后支持
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public NovaServer withAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv4
     */
    public String getAccessIPv4() {
        return accessIPv4;
    }

    public void setAccessIPv4(String accessIPv4) {
        this.accessIPv4 = accessIPv4;
    }

    public NovaServer withAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
        return this;
    }

    


    /**
     * 预留属性。
     * @return accessIPv6
     */
    public String getAccessIPv6() {
        return accessIPv6;
    }

    public void setAccessIPv6(String accessIPv6) {
        this.accessIPv6 = accessIPv6;
    }

    public NovaServer withConfigDrive(String configDrive) {
        this.configDrive = configDrive;
        return this;
    }

    


    /**
     * 预留属性。
     * @return configDrive
     */
    public String getConfigDrive() {
        return configDrive;
    }

    public void setConfigDrive(String configDrive) {
        this.configDrive = configDrive;
    }

    public NovaServer withProgress(Integer progress) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NovaServer novaServer = (NovaServer) o;
        return Objects.equals(this.name, novaServer.name) &&
            Objects.equals(this.id, novaServer.id) &&
            Objects.equals(this.status, novaServer.status) &&
            Objects.equals(this.created, novaServer.created) &&
            Objects.equals(this.updated, novaServer.updated) &&
            Objects.equals(this.flavor, novaServer.flavor) &&
            Objects.equals(this.image, novaServer.image) &&
            Objects.equals(this.tenantId, novaServer.tenantId) &&
            Objects.equals(this.keyName, novaServer.keyName) &&
            Objects.equals(this.userId, novaServer.userId) &&
            Objects.equals(this.metadata, novaServer.metadata) &&
            Objects.equals(this.hostId, novaServer.hostId) &&
            Objects.equals(this.addresses, novaServer.addresses) &&
            Objects.equals(this.securityGroups, novaServer.securityGroups) &&
            Objects.equals(this.links, novaServer.links) &&
            Objects.equals(this.osDCFDiskConfig, novaServer.osDCFDiskConfig) &&
            Objects.equals(this.osEXTAZAvailabilityZone, novaServer.osEXTAZAvailabilityZone) &&
            Objects.equals(this.osEXTSRVATTRHost, novaServer.osEXTSRVATTRHost) &&
            Objects.equals(this.osEXTSRVATTRHypervisorHostname, novaServer.osEXTSRVATTRHypervisorHostname) &&
            Objects.equals(this.osEXTSRVATTRInstanceName, novaServer.osEXTSRVATTRInstanceName) &&
            Objects.equals(this.osEXTSTSPowerState, novaServer.osEXTSTSPowerState) &&
            Objects.equals(this.osEXTSTSTaskState, novaServer.osEXTSTSTaskState) &&
            Objects.equals(this.osEXTSTSVmState, novaServer.osEXTSTSVmState) &&
            Objects.equals(this.osSRVUSGLaunchedAt, novaServer.osSRVUSGLaunchedAt) &&
            Objects.equals(this.osSRVUSGTerminatedAt, novaServer.osSRVUSGTerminatedAt) &&
            Objects.equals(this.osExtendedVolumesVolumesAttached, novaServer.osExtendedVolumesVolumesAttached) &&
            Objects.equals(this.fault, novaServer.fault) &&
            Objects.equals(this.description, novaServer.description) &&
            Objects.equals(this.hostStatus, novaServer.hostStatus) &&
            Objects.equals(this.osEXTSRVATTRHostname, novaServer.osEXTSRVATTRHostname) &&
            Objects.equals(this.osEXTSRVATTRReservationId, novaServer.osEXTSRVATTRReservationId) &&
            Objects.equals(this.osEXTSRVATTRLaunchIndex, novaServer.osEXTSRVATTRLaunchIndex) &&
            Objects.equals(this.osEXTSRVATTRKernelId, novaServer.osEXTSRVATTRKernelId) &&
            Objects.equals(this.osEXTSRVATTRRamdiskId, novaServer.osEXTSRVATTRRamdiskId) &&
            Objects.equals(this.osEXTSRVATTRRootDeviceName, novaServer.osEXTSRVATTRRootDeviceName) &&
            Objects.equals(this.osEXTSRVATTRUserData, novaServer.osEXTSRVATTRUserData) &&
            Objects.equals(this.tags, novaServer.tags) &&
            Objects.equals(this.locked, novaServer.locked) &&
            Objects.equals(this.accessIPv4, novaServer.accessIPv4) &&
            Objects.equals(this.accessIPv6, novaServer.accessIPv6) &&
            Objects.equals(this.configDrive, novaServer.configDrive) &&
            Objects.equals(this.progress, novaServer.progress);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, status, created, updated, flavor, image, tenantId, keyName, userId, metadata, hostId, addresses, securityGroups, links, osDCFDiskConfig, osEXTAZAvailabilityZone, osEXTSRVATTRHost, osEXTSRVATTRHypervisorHostname, osEXTSRVATTRInstanceName, osEXTSTSPowerState, osEXTSTSTaskState, osEXTSTSVmState, osSRVUSGLaunchedAt, osSRVUSGTerminatedAt, osExtendedVolumesVolumesAttached, fault, description, hostStatus, osEXTSRVATTRHostname, osEXTSRVATTRReservationId, osEXTSRVATTRLaunchIndex, osEXTSRVATTRKernelId, osEXTSRVATTRRamdiskId, osEXTSRVATTRRootDeviceName, osEXTSRVATTRUserData, tags, locked, accessIPv4, accessIPv6, configDrive, progress);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaServer {\n");
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
            sb.append("    fault: ").append(toIndentedString(fault)).append("\n");
            sb.append("    description: ").append(toIndentedString(description)).append("\n");
            sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
            sb.append("    osEXTSRVATTRHostname: ").append(toIndentedString(osEXTSRVATTRHostname)).append("\n");
            sb.append("    osEXTSRVATTRReservationId: ").append(toIndentedString(osEXTSRVATTRReservationId)).append("\n");
            sb.append("    osEXTSRVATTRLaunchIndex: ").append(toIndentedString(osEXTSRVATTRLaunchIndex)).append("\n");
            sb.append("    osEXTSRVATTRKernelId: ").append(toIndentedString(osEXTSRVATTRKernelId)).append("\n");
            sb.append("    osEXTSRVATTRRamdiskId: ").append(toIndentedString(osEXTSRVATTRRamdiskId)).append("\n");
            sb.append("    osEXTSRVATTRRootDeviceName: ").append(toIndentedString(osEXTSRVATTRRootDeviceName)).append("\n");
            sb.append("    osEXTSRVATTRUserData: ").append(toIndentedString(osEXTSRVATTRUserData)).append("\n");
            sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
            sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
            sb.append("    accessIPv4: ").append(toIndentedString(accessIPv4)).append("\n");
            sb.append("    accessIPv6: ").append(toIndentedString(accessIPv6)).append("\n");
            sb.append("    configDrive: ").append(toIndentedString(configDrive)).append("\n");
            sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
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

