package com.huaweicloud.sdk.lts.v2.model;

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
 * 查询主机信息过滤参数
 */
public class GetHostListFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name_list")

    private List<String> hostNameList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip_list")

    private List<String> hostIpList = null;

    /**
     * 主机状态。可以根据主机状态进行过滤。 uninstall:未安装 running:运行 offline:离线 error:异常 plugin error:插件错误 installing:安装中 install-fail:安装失败 upgrading:升级中 upgrading-transient:升级中 upgrade failed:升级失败 upgrade-fail:升级失败 uninstalling:卸载中 uninstalling-transient:卸载中 authentication error:鉴权失败
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_version")

    private String hostVersion;

    public GetHostListFilter withHostNameList(List<String> hostNameList) {
        this.hostNameList = hostNameList;
        return this;
    }

    public GetHostListFilter addHostNameListItem(String hostNameListItem) {
        if (this.hostNameList == null) {
            this.hostNameList = new ArrayList<>();
        }
        this.hostNameList.add(hostNameListItem);
        return this;
    }

    public GetHostListFilter withHostNameList(Consumer<List<String>> hostNameListSetter) {
        if (this.hostNameList == null) {
            this.hostNameList = new ArrayList<>();
        }
        hostNameListSetter.accept(this.hostNameList);
        return this;
    }

    /**
     * 主机名称列表。可以根据主机名称列表，进行批量过滤。
     * @return hostNameList
     */
    public List<String> getHostNameList() {
        return hostNameList;
    }

    public void setHostNameList(List<String> hostNameList) {
        this.hostNameList = hostNameList;
    }

    public GetHostListFilter withHostIpList(List<String> hostIpList) {
        this.hostIpList = hostIpList;
        return this;
    }

    public GetHostListFilter addHostIpListItem(String hostIpListItem) {
        if (this.hostIpList == null) {
            this.hostIpList = new ArrayList<>();
        }
        this.hostIpList.add(hostIpListItem);
        return this;
    }

    public GetHostListFilter withHostIpList(Consumer<List<String>> hostIpListSetter) {
        if (this.hostIpList == null) {
            this.hostIpList = new ArrayList<>();
        }
        hostIpListSetter.accept(this.hostIpList);
        return this;
    }

    /**
     * 主机ID列表。可以根据主机IP列表，进行批量过滤。
     * @return hostIpList
     */
    public List<String> getHostIpList() {
        return hostIpList;
    }

    public void setHostIpList(List<String> hostIpList) {
        this.hostIpList = hostIpList;
    }

    public GetHostListFilter withHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    /**
     * 主机状态。可以根据主机状态进行过滤。 uninstall:未安装 running:运行 offline:离线 error:异常 plugin error:插件错误 installing:安装中 install-fail:安装失败 upgrading:升级中 upgrading-transient:升级中 upgrade failed:升级失败 upgrade-fail:升级失败 uninstalling:卸载中 uninstalling-transient:卸载中 authentication error:鉴权失败
     * @return hostStatus
     */
    public HostStatusEnum getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(HostStatusEnum hostStatus) {
        this.hostStatus = hostStatus;
    }

    public GetHostListFilter withHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
        return this;
    }

    /**
     * 主机版本。可以根据主机版本进行过滤。
     * @return hostVersion
     */
    public String getHostVersion() {
        return hostVersion;
    }

    public void setHostVersion(String hostVersion) {
        this.hostVersion = hostVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GetHostListFilter that = (GetHostListFilter) obj;
        return Objects.equals(this.hostNameList, that.hostNameList) && Objects.equals(this.hostIpList, that.hostIpList)
            && Objects.equals(this.hostStatus, that.hostStatus) && Objects.equals(this.hostVersion, that.hostVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostNameList, hostIpList, hostStatus, hostVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetHostListFilter {\n");
        sb.append("    hostNameList: ").append(toIndentedString(hostNameList)).append("\n");
        sb.append("    hostIpList: ").append(toIndentedString(hostIpList)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    hostVersion: ").append(toIndentedString(hostVersion)).append("\n");
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
