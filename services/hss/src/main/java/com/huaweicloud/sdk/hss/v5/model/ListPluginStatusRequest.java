package com.huaweicloud.sdk.hss.v5.model;

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
 * Request Object
 */
public class ListPluginStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_code")

    private String pluginCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_version")

    private String pluginVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plugin_status")

    private String pluginStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    /**
     * Gets or Sets hostStatus
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

    private List<HostStatusEnum> hostStatus = null;

    /**
     * **参数解释**： agent状态 **约束限制**: 不涉及 **取值范围**: -not_installed：未安装 -online：在线 -offline：离线 -install_failed：安装失败 -installing：安装中  **默认取值**: 不涉及 
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
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_arch")

    private String osArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_type")

    private String hostType;

    public ListPluginStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释**: 企业项目ID，用于过滤不同企业项目下的资产。获取方式请参见[获取企业项目ID](hss_02_0027.xml)。 如需查询所有企业项目下的资产请传参“all_granted_eps”。 **约束限制**: 开通企业项目功能后才需要配置企业项目ID参数。 **取值范围**: 字符长度1-256位 **默认取值**: 0，表示默认企业项目（default）。 
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListPluginStatusRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 偏移量：指定返回记录的开始位置 **约束限制**: 不涉及 **取值范围**: 最小值0，最大值2000000 **默认取值**: 默认为0 
     * minimum: 0
     * maximum: 2000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListPluginStatusRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 每页显示个数 **约束限制**: 不涉及 **取值范围**: 取值10-200 **默认取值**: 10 
     * minimum: 10
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListPluginStatusRequest withPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
        return this;
    }

    /**
     * **参数解释**： 插件编码 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return pluginCode
     */
    public String getPluginCode() {
        return pluginCode;
    }

    public void setPluginCode(String pluginCode) {
        this.pluginCode = pluginCode;
    }

    public ListPluginStatusRequest withPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
        return this;
    }

    /**
     * **参数解释**： 插件版本 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return pluginVersion
     */
    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public ListPluginStatusRequest withPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
        return this;
    }

    /**
     * **参数解释**： 插件状态 **约束限制**: 不涉及 **取值范围**: - not_installed：未安装 - installing：安装中 - install_fail：安装失败 - starting：启动中 - running：运行中 - start_fail：启动失败 - offline：离线 - stopping：停止中 - stopped：已停止 - updating：更新中 - update_fail：更新失败 - uninstalling：卸载中 - uninstall_fail：卸载失败  **默认取值**: 不涉及 
     * @return pluginStatus
     */
    public String getPluginStatus() {
        return pluginStatus;
    }

    public void setPluginStatus(String pluginStatus) {
        this.pluginStatus = pluginStatus;
    }

    public ListPluginStatusRequest withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**： 服务器名称 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public ListPluginStatusRequest withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public ListPluginStatusRequest addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public ListPluginStatusRequest withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**： 服务器ID列表 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public ListPluginStatusRequest withHostStatus(List<HostStatusEnum> hostStatus) {
        this.hostStatus = hostStatus;
        return this;
    }

    public ListPluginStatusRequest addHostStatusItem(HostStatusEnum hostStatusItem) {
        if (this.hostStatus == null) {
            this.hostStatus = new ArrayList<>();
        }
        this.hostStatus.add(hostStatusItem);
        return this;
    }

    public ListPluginStatusRequest withHostStatus(Consumer<List<HostStatusEnum>> hostStatusSetter) {
        if (this.hostStatus == null) {
            this.hostStatus = new ArrayList<>();
        }
        hostStatusSetter.accept(this.hostStatus);
        return this;
    }

    /**
     * **参数解释**： 服务器状态 **约束限制**: 不涉及 **取值范围**: - ACTIVE：正在运行 - BUILDING：创建中 - ERROR：故障 - SHUTOFF：关机  **默认取值**: 不涉及 
     * @return hostStatus
     */
    public List<HostStatusEnum> getHostStatus() {
        return hostStatus;
    }

    public void setHostStatus(List<HostStatusEnum> hostStatus) {
        this.hostStatus = hostStatus;
    }

    public ListPluginStatusRequest withAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }

    /**
     * **参数解释**： agent状态 **约束限制**: 不涉及 **取值范围**: -not_installed：未安装 -online：在线 -offline：离线 -install_failed：安装失败 -installing：安装中  **默认取值**: 不涉及 
     * @return agentStatus
     */
    public AgentStatusEnum getAgentStatus() {
        return agentStatus;
    }

    public void setAgentStatus(AgentStatusEnum agentStatus) {
        this.agentStatus = agentStatus;
    }

    public ListPluginStatusRequest withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * **参数解释**： 主机操作系统 **约束限制**: 不涉及 **取值范围**: - linux：Linux操作系统 - Windows：windows操作系统  **默认取值**: 不涉及 
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ListPluginStatusRequest withOsArch(String osArch) {
        this.osArch = osArch;
        return this;
    }

    /**
     * **参数解释**： 系统架构 **约束限制**: 不涉及 **取值范围**: - x86_64：X86架构 - arm：ARM架构  **默认取值**: 不涉及 
     * @return osArch
     */
    public String getOsArch() {
        return osArch;
    }

    public void setOsArch(String osArch) {
        this.osArch = osArch;
    }

    public ListPluginStatusRequest withHostType(String hostType) {
        this.hostType = hostType;
        return this;
    }

    /**
     * **参数解释**： 服务器类型 **约束限制**: 不涉及 **取值范围**: - host：非容器主机 - container：容器主机  **默认取值**: 不涉及 
     * @return hostType
     */
    public String getHostType() {
        return hostType;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPluginStatusRequest that = (ListPluginStatusRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.pluginCode, that.pluginCode)
            && Objects.equals(this.pluginVersion, that.pluginVersion)
            && Objects.equals(this.pluginStatus, that.pluginStatus) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.hostIds, that.hostIds) && Objects.equals(this.hostStatus, that.hostStatus)
            && Objects.equals(this.agentStatus, that.agentStatus) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osArch, that.osArch) && Objects.equals(this.hostType, that.hostType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId,
            offset,
            limit,
            pluginCode,
            pluginVersion,
            pluginStatus,
            hostName,
            hostIds,
            hostStatus,
            agentStatus,
            osType,
            osArch,
            hostType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPluginStatusRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    pluginCode: ").append(toIndentedString(pluginCode)).append("\n");
        sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
        sb.append("    pluginStatus: ").append(toIndentedString(pluginStatus)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    hostStatus: ").append(toIndentedString(hostStatus)).append("\n");
        sb.append("    agentStatus: ").append(toIndentedString(agentStatus)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osArch: ").append(toIndentedString(osArch)).append("\n");
        sb.append("    hostType: ").append(toIndentedString(hostType)).append("\n");
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
