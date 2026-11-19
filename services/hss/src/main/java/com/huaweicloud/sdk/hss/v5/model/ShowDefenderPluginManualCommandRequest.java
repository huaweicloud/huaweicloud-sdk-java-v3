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
 * Request Object
 */
public class ShowDefenderPluginManualCommandRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * **参数解释**： 操作类型 **约束限制**： 必填 **取值范围**： - install：安装 - uninstall：卸载  **默认取值**： 不涉及 
     */
    public static final class OptEnum {

        /**
         * Enum INSTALL for value: "install"
         */
        public static final OptEnum INSTALL = new OptEnum("install");

        /**
         * Enum UNINSTALL for value: "uninstall"
         */
        public static final OptEnum UNINSTALL = new OptEnum("uninstall");

        private static final Map<String, OptEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptEnum> createStaticFields() {
            Map<String, OptEnum> map = new HashMap<>();
            map.put("install", INSTALL);
            map.put("uninstall", UNINSTALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptEnum(String value) {
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
        public static OptEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OptEnum(value));
        }

        public static OptEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OptEnum) {
                return this.value.equals(((OptEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "opt")

    private OptEnum opt;

    /**
     * **参数解释**： 网络类型，用于指定返回的命令中使用的下载地址和服务端地址的网络类型 **约束限制**： 非必填 **取值范围**： - public：公网 - internal：内网  **默认取值**： internal 
     */
    public static final class NetworkEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final NetworkEnum PUBLIC = new NetworkEnum("public");

        /**
         * Enum INTERNAL for value: "internal"
         */
        public static final NetworkEnum INTERNAL = new NetworkEnum("internal");

        private static final Map<String, NetworkEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkEnum> createStaticFields() {
            Map<String, NetworkEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("internal", INTERNAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkEnum(String value) {
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
        public static NetworkEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkEnum(value));
        }

        public static NetworkEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkEnum) {
                return this.value.equals(((NetworkEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network")

    private NetworkEnum network;

    /**
     * **参数解释**： 智能体类型，用于区分OpenClaw和自研Claw **约束限制**： 必填 **取值范围**： - OpenClaw：OpenClaw - SelfDevelopedClaw：自研claw  **默认取值**： OpenClaw 
     */
    public static final class AgentTypeEnum {

        /**
         * Enum OPENCLAW for value: "OpenClaw"
         */
        public static final AgentTypeEnum OPENCLAW = new AgentTypeEnum("OpenClaw");

        /**
         * Enum SELFDEVELOPEDCLAW for value: "SelfDevelopedClaw"
         */
        public static final AgentTypeEnum SELFDEVELOPEDCLAW = new AgentTypeEnum("SelfDevelopedClaw");

        private static final Map<String, AgentTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AgentTypeEnum> createStaticFields() {
            Map<String, AgentTypeEnum> map = new HashMap<>();
            map.put("OpenClaw", OPENCLAW);
            map.put("SelfDevelopedClaw", SELFDEVELOPEDCLAW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AgentTypeEnum(String value) {
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
        public static AgentTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AgentTypeEnum(value));
        }

        public static AgentTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AgentTypeEnum) {
                return this.value.equals(((AgentTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private AgentTypeEnum agentType;

    public ShowDefenderPluginManualCommandRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowDefenderPluginManualCommandRequest withOpt(OptEnum opt) {
        this.opt = opt;
        return this;
    }

    /**
     * **参数解释**： 操作类型 **约束限制**： 必填 **取值范围**： - install：安装 - uninstall：卸载  **默认取值**： 不涉及 
     * @return opt
     */
    public OptEnum getOpt() {
        return opt;
    }

    public void setOpt(OptEnum opt) {
        this.opt = opt;
    }

    public ShowDefenderPluginManualCommandRequest withNetwork(NetworkEnum network) {
        this.network = network;
        return this;
    }

    /**
     * **参数解释**： 网络类型，用于指定返回的命令中使用的下载地址和服务端地址的网络类型 **约束限制**： 非必填 **取值范围**： - public：公网 - internal：内网  **默认取值**： internal 
     * @return network
     */
    public NetworkEnum getNetwork() {
        return network;
    }

    public void setNetwork(NetworkEnum network) {
        this.network = network;
    }

    public ShowDefenderPluginManualCommandRequest withAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * **参数解释**： 智能体类型，用于区分OpenClaw和自研Claw **约束限制**： 必填 **取值范围**： - OpenClaw：OpenClaw - SelfDevelopedClaw：自研claw  **默认取值**： OpenClaw 
     * @return agentType
     */
    public AgentTypeEnum getAgentType() {
        return agentType;
    }

    public void setAgentType(AgentTypeEnum agentType) {
        this.agentType = agentType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDefenderPluginManualCommandRequest that = (ShowDefenderPluginManualCommandRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.opt, that.opt)
            && Objects.equals(this.network, that.network) && Objects.equals(this.agentType, that.agentType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, opt, network, agentType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDefenderPluginManualCommandRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    opt: ").append(toIndentedString(opt)).append("\n");
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
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
