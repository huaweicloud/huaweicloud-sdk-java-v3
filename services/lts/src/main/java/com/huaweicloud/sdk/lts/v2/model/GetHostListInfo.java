package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 主机详细信息
 */
public class GetHostListInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    /**
     * 主机状态。 uninstall:未安装 running:运行 offline:离线 error:异常 plugin error:插件错误 installing:安装中 install-fail:安装失败 upgrading:升级中 upgrading-transient:升级中 upgrade failed:升级失败 upgrade-fail:升级失败 uninstalling:卸载中 uninstalling-transient:卸载中 authentication error:鉴权失败
     */
    public static final class HostStatusEnum {

        /**
         * Enum UNINSTALL for value: "uninstall"
         */
        public static final HostStatusEnum UNINSTALL = new HostStatusEnum("uninstall");

        /**
         * Enum RUNNING for value: "running"
         */
        public static final HostStatusEnum RUNNING = new HostStatusEnum("running");

        /**
         * Enum OFFLINE for value: "offline"
         */
        public static final HostStatusEnum OFFLINE = new HostStatusEnum("offline");

        /**
         * Enum ERROR for value: "error"
         */
        public static final HostStatusEnum ERROR = new HostStatusEnum("error");

        /**
         * Enum PLUGIN_ERROR for value: "plugin error"
         */
        public static final HostStatusEnum PLUGIN_ERROR = new HostStatusEnum("plugin error");

        /**
         * Enum INSTALLING for value: "installing"
         */
        public static final HostStatusEnum INSTALLING = new HostStatusEnum("installing");

        /**
         * Enum INSTALL_FAIL for value: "install-fail"
         */
        public static final HostStatusEnum INSTALL_FAIL = new HostStatusEnum("install-fail");

        /**
         * Enum UPGRADING for value: "upgrading"
         */
        public static final HostStatusEnum UPGRADING = new HostStatusEnum("upgrading");

        /**
         * Enum UPGRADING_TRANSIENT for value: "upgrading-transient"
         */
        public static final HostStatusEnum UPGRADING_TRANSIENT = new HostStatusEnum("upgrading-transient");

        /**
         * Enum UPGRADE_FAILED for value: "upgrade failed"
         */
        public static final HostStatusEnum UPGRADE_FAILED = new HostStatusEnum("upgrade failed");

        /**
         * Enum UPGRADE_FAIL for value: "upgrade-fail"
         */
        public static final HostStatusEnum UPGRADE_FAIL = new HostStatusEnum("upgrade-fail");

        /**
         * Enum UNINSTALLING for value: "uninstalling"
         */
        public static final HostStatusEnum UNINSTALLING = new HostStatusEnum("uninstalling");

        /**
         * Enum UNINSTALLING_TRANSIENT for value: "uninstalling-transient"
         */
        public static final HostStatusEnum UNINSTALLING_TRANSIENT = new HostStatusEnum("uninstalling-transient");

        /**
         * Enum AUTHENTICATION_ERROR for value: "authentication error"
         */
        public static final HostStatusEnum AUTHENTICATION_ERROR = new HostStatusEnum("authentication error");

        private static final Map<String, HostStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostStatusEnum> createStaticFields() {
            Map<String, HostStatusEnum> map = new HashMap<>();
            map.put("uninstall", UNINSTALL);
            map.put("running", RUNNING);
            map.put("offline", OFFLINE);
            map.put("error", ERROR);
            map.put("plugin error", PLUGIN_ERROR);
            map.put("installing", INSTALLING);
            map.put("install-fail", INSTALL_FAIL);
            map.put("upgrading", UPGRADING);
            map.put("upgrading-transient", UPGRADING_TRANSIENT);
            map.put("upgrade failed", UPGRADE_FAILED);
            map.put("upgrade-fail", UPGRADE_FAIL);
            map.put("uninstalling", UNINSTALLING);
            map.put("uninstalling-transient", UNINSTALLING_TRANSIENT);
            map.put("authentication error", AUTHENTICATION_ERROR);
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
            HostStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostStatusEnum(value);
            }
            return result;
        }

        public static HostStatusEnum valueOf(String value) {
            if (value == null) {
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
    @JsonProperty(value = "host_status")

    private HostStatusEnum hostStatus;

    /**
     * 主机类型。linux:linux类型,windows:windows类型
     */
    public static final class HostTypeEnum {

        /**
         * Enum LINUX for value: "linux"
         */
        public static final HostTypeEnum LINUX = new HostTypeEnum("linux");

        /**
         * Enum WINDOWS for value: "windows"
         */
        public static final HostTypeEnum WINDOWS = new HostTypeEnum("windows");

        private static final Map<String, HostTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HostTypeEnum> createStaticFields() {
            Map<String, HostTypeEnum> map = new HashMap<>();
            map.put("linux", LINUX);
            map.put("windows", WINDOWS);
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
            HostTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HostTypeEnum(value);
            }
            return result;
        }

        public static HostTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HostTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "host_version")

    private String hostVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    public GetHostListInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * 主机ID
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public GetHostListInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 主机IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public GetHostListInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 主机名称
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public GetHostListInfo withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 主机状态。 uninstall:未安装 running:运行 offline:离线 error:异常 plugin error:插件错误 installing:安装中 install-fail:安装失败 upgrading:升级中 upgrading-transient:升级中 upgrade failed:升级失败 upgrade-fail:升级失败 uninstalling:卸载中 uninstalling-transient:卸载中 authentication error:鉴权失败
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public GetHostListInfo withHostType(HostTypeEnum hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * 主机类型。linux:linux类型,windows:windows类型
     * @return hostType
     */
    public HostTypeEnum getHostType() {
        return hostType;
    }

    public void setHostType(HostTypeEnum hostType) {
        this.hostType = hostType;
    }

    public GetHostListInfo withHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
        return this;
    }

    /**
     * 主机版本
     * @return hostVersion
     */
    public String getHostVersion() {
        return hostVersion;
    }

    public void setHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
    }

    public GetHostListInfo withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetHostListInfo getHostListInfo = (GetHostListInfo) o;
        return Objects.equals(this.hostId, getHostListInfo.hostId)
            && Objects.equals(this.hostIp, getHostListInfo.hostIp)
            && Objects.equals(this.hostName, getHostListInfo.hostName)
            && Objects.equals(this.hostStatus, getHostListInfo.hostStatus)
            && Objects.equals(this.hostType, getHostListInfo.hostType)
            && Objects.equals(this.hostVersion, getHostListInfo.hostVersion)
            && Objects.equals(this.updateTime, getHostListInfo.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostIp, hostName, hostStatus, hostType, hostVersion, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHostListInfo {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
        sb.append("    hostVersion: ").append(toIndentedString(hostVersion)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
