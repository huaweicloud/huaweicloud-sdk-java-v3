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
 * 服务器的插件状态信息
 */
public class PluginStatusInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    /**
     * **参数解释**: 服务器类型 **取值范围**: - host：非容器主机 - container：容器主机 
     */
    public static final class HostTypeEnum {

        /**
         * Enum HOST for value: "host"
         */
        public static final HostTypeEnum HOST = new HostTypeEnum("host");

        /**
         * Enum CONTAINER for value: "container"
         */
        public static final HostTypeEnum CONTAINER = new HostTypeEnum("container");

        private static final Map<String, HostTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostTypeEnum> createStaticFields() {
            Map<String, HostTypeEnum> map = new HashMap<>();
            map.put("host", HOST);
            map.put("container", CONTAINER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HostTypeEnum(String value) {
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
        public static HostTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostTypeEnum(value));
        }

        public static HostTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HostTypeEnum) {
                return this.value.equals(((HostTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private HostTypeEnum hostType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "public_ip")

    private String publicIp;

    /**
     * **参数解释**: 服务器状态 **取值范围**: - ACTIVE：正在运行 - BUILDING：创建中 - ERROR：故障 - SHUTOFF：关机 
     */
    public static final class HostStatusEnum {

        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final HostStatusEnum ACTIVE = new HostStatusEnum("ACTIVE");

        /**
         * Enum BUILDING for value: "BUILDING"
         */
        public static final HostStatusEnum BUILDING = new HostStatusEnum("BUILDING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final HostStatusEnum ERROR = new HostStatusEnum("ERROR");

        /**
         * Enum SHUTOFF for value: "SHUTOFF"
         */
        public static final HostStatusEnum SHUTOFF = new HostStatusEnum("SHUTOFF");

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("ACTIVE", ACTIVE);
            map.put("BUILDING", BUILDING);
            map.put("ERROR", ERROR);
            map.put("SHUTOFF", SHUTOFF);
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
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HostStatusEnum(value));
        }

        public static HostStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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
    @JsonProperty(value = "host_status")

    private HostStatusEnum hostStatus;

    /**
     * **参数解释**: Agent状态 **取值范围**: - not_installed：未安装 - online：在线 - offline：离线 - install_failed：安装失败 - installing：安装中
     */
    public static final class AgentStatusEnum {

        /**
         * Enum NOT_INSTALLED for value: "not_installed"
         */
        public static final AgentStatusEnum NOT_INSTALLED = new AgentStatusEnum("not_installed");

        /**
         * Enum ONLINE for value: "online"
         */
        public static final AgentStatusEnum ONLINE = new AgentStatusEnum("online");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final AgentStatusEnum OFFLINE = new AgentStatusEnum("offline");

        /**
         * Enum INSTALL_FAILED for value: "install_failed"
         */
        public static final AgentStatusEnum INSTALL_FAILED = new AgentStatusEnum("install_failed");

        /**
         * Enum INSTALLING for value: "installing"
         */
        public static final AgentStatusEnum INSTALLING = new AgentStatusEnum("installing");

        private static final Map<String, AgentStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentStatusEnum> createStaticFields() {
            Map<String, AgentStatusEnum> map = new HashMap<>();
            map.put("not_installed", NOT_INSTALLED);
            map.put("online", ONLINE);
            map.put("offline", OFFLINE);
            map.put("install_failed", INSTALL_FAILED);
            map.put("installing", INSTALLING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentStatusEnum(String value) {
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
        public static AgentStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentStatusEnum(value));
        }

        public static AgentStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentStatusEnum) {
                return this.value.equals(((AgentStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_status")

    private AgentStatusEnum agentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    /**
     * **参数解释**: 服务器的资产重要性 **取值范围**: - important：重要资产 - common：一般资产 - test：测试资产 
     */
    public static final class AssetValueEnum {

        /**
         * Enum COMMON for value: "common"
         */
        public static final AssetValueEnum COMMON = new AssetValueEnum("common");

        /**
         * Enum IMPORTANT for value: "important"
         */
        public static final AssetValueEnum IMPORTANT = new AssetValueEnum("important");

        /**
         * Enum TEST for value: "test"
         */
        public static final AssetValueEnum TEST = new AssetValueEnum("test");

        private static final Map<String, AssetValueEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AssetValueEnum> createStaticFields() {
            Map<String, AssetValueEnum> map = new HashMap<>();
            map.put("common", COMMON);
            map.put("important", IMPORTANT);
            map.put("test", TEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AssetValueEnum(String value) {
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
        public static AssetValueEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AssetValueEnum(value));
        }

        public static AssetValueEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AssetValueEnum) {
                return this.value.equals(((AssetValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_value")

    private AssetValueEnum assetValue;

    /**
     * **参数解释**: 操作系统类型 **取值范围**: - linux：Linux操作系统 - windows：windows操作系统 
     */
    public static final class OsTypeEnum {

        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Linux", LINUX);
            map.put("Windows", WINDOWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    /**
     * **参数解释**: 系统架构 **取值范围**: - x86_64：X86架构 - arm：ARM架构 
     */
    public static final class OsArchEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final OsArchEnum X86_64 = new OsArchEnum("x86_64");

        /**
         * Enum ARM for value: "arm"
         */
        public static final OsArchEnum ARM = new OsArchEnum("arm");

        private static final Map<String, OsArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsArchEnum> createStaticFields() {
            Map<String, OsArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsArchEnum(String value) {
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
        public static OsArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsArchEnum(value));
        }

        public static OsArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsArchEnum) {
                return this.value.equals(((OsArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_arch")

    private OsArchEnum osArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    /**
     * **参数解释**: 插件状态 **取值范围**: - not_installed：未安装 - installing：安装中 - install_fail：安装失败 - starting：启动中 - running：运行中 - start_fail：启动失败 - offline：离线 - stopping：停止中 - stopped：已停止 - updating：更新中 - update_fail：更新失败 - uninstalling：卸载中 - uninstall_fail：卸载失败 
     */
    public static final class PluginStatusEnum {

        /**
         * Enum NOT_INSTALLED for value: "not_installed"
         */
        public static final PluginStatusEnum NOT_INSTALLED = new PluginStatusEnum("not_installed");

        /**
         * Enum INSTALLING for value: "installing"
         */
        public static final PluginStatusEnum INSTALLING = new PluginStatusEnum("installing");

        /**
         * Enum INSTALL_FAIL for value: "install_fail"
         */
        public static final PluginStatusEnum INSTALL_FAIL = new PluginStatusEnum("install_fail");

        /**
         * Enum STARTING for value: "starting"
         */
        public static final PluginStatusEnum STARTING = new PluginStatusEnum("starting");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final PluginStatusEnum RUNNING = new PluginStatusEnum("running");

        /**
         * Enum START_FAIL for value: "start_fail"
         */
        public static final PluginStatusEnum START_FAIL = new PluginStatusEnum("start_fail");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final PluginStatusEnum OFFLINE = new PluginStatusEnum("offline");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final PluginStatusEnum STOPPING = new PluginStatusEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final PluginStatusEnum STOPPED = new PluginStatusEnum("stopped");

        /**
         * Enum UPDATING for value: "updating"
         */
        public static final PluginStatusEnum UPDATING = new PluginStatusEnum("updating");

        /**
         * Enum UPDATE_FAIL for value: "update_fail"
         */
        public static final PluginStatusEnum UPDATE_FAIL = new PluginStatusEnum("update_fail");

        /**
         * Enum UNINSTALLING for value: "uninstalling"
         */
        public static final PluginStatusEnum UNINSTALLING = new PluginStatusEnum("uninstalling");

        /**
         * Enum UNINSTALL_FAIL for value: "uninstall_fail"
         */
        public static final PluginStatusEnum UNINSTALL_FAIL = new PluginStatusEnum("uninstall_fail");

        private static final Map<String, PluginStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PluginStatusEnum> createStaticFields() {
            Map<String, PluginStatusEnum> map = new HashMap<>();
            map.put("not_installed", NOT_INSTALLED);
            map.put("installing", INSTALLING);
            map.put("install_fail", INSTALL_FAIL);
            map.put("starting", STARTING);
            map.put("running", RUNNING);
            map.put("start_fail", START_FAIL);
            map.put("offline", OFFLINE);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("updating", UPDATING);
            map.put("update_fail", UPDATE_FAIL);
            map.put("uninstalling", UNINSTALLING);
            map.put("uninstall_fail", UNINSTALL_FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PluginStatusEnum(String value) {
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
        public static PluginStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PluginStatusEnum(value));
        }

        public static PluginStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PluginStatusEnum) {
                return this.value.equals(((PluginStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_status")

    private PluginStatusEnum pluginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_detail")

    private String statusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_progress")

    private String installProgress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_time")

    private String remainingTime;

    /**
     * **参数解释**: 主机防护状态 **取值范围**: - closed：未开启 - opened：防护中 
     */
    public static final class ProtectStatusEnum {

        /**
         * Enum CLOSED for value: "closed"
         */
        public static final ProtectStatusEnum CLOSED = new ProtectStatusEnum("closed");

        /**
         * Enum OPENED for value: "opened"
         */
        public static final ProtectStatusEnum OPENED = new ProtectStatusEnum("opened");

        private static final Map<String, ProtectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectStatusEnum> createStaticFields() {
            Map<String, ProtectStatusEnum> map = new HashMap<>();
            map.put("closed", CLOSED);
            map.put("opened", OPENED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectStatusEnum(String value) {
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
        public static ProtectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectStatusEnum(value));
        }

        public static ProtectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectStatusEnum) {
                return this.value.equals(((ProtectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protect_status")

    private ProtectStatusEnum protectStatus;

    public PluginStatusInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**: 服务器ID **取值范围**: 字符长度1-128 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public PluginStatusInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public PluginStatusInfo withHostType(HostTypeEnum hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * **参数解释**: 服务器类型 **取值范围**: - host：非容器主机 - container：容器主机 
     * @return hostType
     */
    public HostTypeEnum getHostType() {
        return hostType;
    }

    public void setHostType(HostTypeEnum hostType) {
        this.hostType = hostType;
    }

    public PluginStatusInfo withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**: 服务器私网IP地址 **取值范围**: 字符长度0-128 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public PluginStatusInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    /**
     * **参数解释**: 服务器公网IP地址 **取值范围**: 字符长度0-128 
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public PluginStatusInfo withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * **参数解释**: 服务器状态 **取值范围**: - ACTIVE：正在运行 - BUILDING：创建中 - ERROR：故障 - SHUTOFF：关机 
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public PluginStatusInfo withAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**: Agent状态 **取值范围**: - not_installed：未安装 - online：在线 - offline：离线 - install_failed：安装失败 - installing：安装中
     * @return agentStatus
     */
    public AgentStatusEnum getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
    }

    public PluginStatusInfo withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * **参数解释**： agent版本 **取值范围**： 字符长度0-32位
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public PluginStatusInfo withAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
        return this;
    }

    /**
     * **参数解释**: 服务器的资产重要性 **取值范围**: - important：重要资产 - common：一般资产 - test：测试资产 
     * @return assetValue
     */
    public AssetValueEnum getAssetValue() {
        return assetValue;
    }

    public void setAssetValue(AssetValueEnum assetValue) {
        this.assetValue = assetValue;
    }

    public PluginStatusInfo withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**: 操作系统类型 **取值范围**: - linux：Linux操作系统 - windows：windows操作系统 
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public PluginStatusInfo withOsArch(OsArchEnum osArch) {
        this.osArch = osArch;
        return this;
    }

    /**
     * **参数解释**: 系统架构 **取值范围**: - x86_64：X86架构 - arm：ARM架构 
     * @return osArch
     */
    public OsArchEnum getOsArch() {
        return osArch;
    }

    public void setOsArch(OsArchEnum osArch) {
        this.osArch = osArch;
    }

    public PluginStatusInfo withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * **参数解释**: 系统名称 **取值范围**: 不涉及 
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public PluginStatusInfo withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * **参数解释**: 操作系统类型 **取值范围**: - linux：Linux操作系统 - windows：windows操作系统 系统版本 
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public PluginStatusInfo withPluginStatus(PluginStatusEnum pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }

    /**
     * **参数解释**: 插件状态 **取值范围**: - not_installed：未安装 - installing：安装中 - install_fail：安装失败 - starting：启动中 - running：运行中 - start_fail：启动失败 - offline：离线 - stopping：停止中 - stopped：已停止 - updating：更新中 - update_fail：更新失败 - uninstalling：卸载中 - uninstall_fail：卸载失败 
     * @return pluginStatus
     */
    public PluginStatusEnum getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(PluginStatusEnum pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    public PluginStatusInfo withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**: 插件版本 **取值范围**: 不涉及 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public PluginStatusInfo withStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
        return this;
    }

    /**
     * **参数解释**: 插件操作失败原因，包括安装失败、启动失败、离线、停止失败、更新失败以及卸载失败 **取值范围**: 不涉及 
     * @return statusDetail
     */
    public String getStatusDetail() {
        return statusDetail;
    }

    public void setStatusDetail(String statusDetail) {
        this.statusDetail = statusDetail;
    }

    public PluginStatusInfo withInstallProgress(String installProgress) {
        this.installProgress = installProgress;
        return this;
    }

    /**
     * **参数解释**: 插件安装进度，百分比 **取值范围**: 0-99 
     * @return installProgress
     */
    public String getInstallProgress() {
        return installProgress;
    }

    public void setInstallProgress(String installProgress) {
        this.installProgress = installProgress;
    }

    public PluginStatusInfo withRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
        return this;
    }

    /**
     * **参数解释**: 插件剩余安装时间，单位分钟 **取值范围**: 不涉及 
     * @return remainingTime
     */
    public String getRemainingTime() {
        return remainingTime;
    }

    public void setRemainingTime(String remainingTime) {
        this.remainingTime = remainingTime;
    }

    public PluginStatusInfo withProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
        return this;
    }

    /**
     * **参数解释**: 主机防护状态 **取值范围**: - closed：未开启 - opened：防护中 
     * @return protectStatus
     */
    public ProtectStatusEnum getProtectStatus() {
        return protectStatus;
    }

    public void setProtectStatus(ProtectStatusEnum protectStatus) {
        this.protectStatus = protectStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PluginStatusInfo that = (PluginStatusInfo) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostType, that.hostType) && Objects.equals(this.privateIp, that.privateIp)
            && Objects.equals(this.publicIp, that.publicIp) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.agentStatus, that.agentStatus)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.assetValue, that.assetValue)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osArch, that.osArch)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.pluginStatus, that.pluginStatus)
            && Objects.equals(this.pluginVersion, that.pluginVersion)
            && Objects.equals(this.statusDetail, that.statusDetail)
            && Objects.equals(this.installProgress, that.installProgress)
            && Objects.equals(this.remainingTime, that.remainingTime)
            && Objects.equals(this.protectStatus, that.protectStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId,
            hostName,
            hostType,
            privateIp,
            publicIp,
            hostStatus,
            agentStatus,
            agentVersion,
            assetValue,
            osType,
            osArch,
            osName,
            osVersion,
            pluginStatus,
            pluginVersion,
            statusDetail,
            installProgress,
            remainingTime,
            protectStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PluginStatusInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    assetValue: ").append(toIndentedString(assetValue)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osArch: ").append(toIndentedString(osArch)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    pluginStatus: ").append(toIndentedString(pluginStatus)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    statusDetail: ").append(toIndentedString(statusDetail)).append("\n");
        sb.append("    installProgress: ").append(toIndentedString(installProgress)).append("\n");
        sb.append("    remainingTime: ").append(toIndentedString(remainingTime)).append("\n");
        sb.append("    protectStatus: ").append(toIndentedString(protectStatus)).append("\n");
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
