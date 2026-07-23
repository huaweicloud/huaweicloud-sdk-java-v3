package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 出站网络配置，不配置默认是PUBLIC。
 */
public class CoreToolsOutboundNetwork {

    /**
     * **参数解释：** 工具可以访问的网络类型。 **约束限制：** 2选1。 **取值范围：** - PUBLIC表示公网。 - VPC表示私有网络。 **默认取值：** 不涉及。
     */
    public static final class NetworkModeEnum {

        /**
         * Enum PUBLIC for value: "PUBLIC"
         */
        public static final NetworkModeEnum PUBLIC = new NetworkModeEnum("PUBLIC");

        /**
         * Enum VPC for value: "VPC"
         */
        public static final NetworkModeEnum VPC = new NetworkModeEnum("VPC");

        private static final Map<String, NetworkModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkModeEnum> createStaticFields() {
            Map<String, NetworkModeEnum> map = new HashMap<>();
            map.put("PUBLIC", PUBLIC);
            map.put("VPC", VPC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NetworkModeEnum(String value) {
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
        public static NetworkModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NetworkModeEnum(value));
        }

        public static NetworkModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NetworkModeEnum) {
                return this.value.equals(((NetworkModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_mode")

    private NetworkModeEnum networkMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_config")

    private CoreToolsVpcConfig vpcConfig;

    public CoreToolsOutboundNetwork withNetworkMode(NetworkModeEnum networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * **参数解释：** 工具可以访问的网络类型。 **约束限制：** 2选1。 **取值范围：** - PUBLIC表示公网。 - VPC表示私有网络。 **默认取值：** 不涉及。
     * @return networkMode
     */
    public NetworkModeEnum getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(NetworkModeEnum networkMode) {
        this.networkMode = networkMode;
    }

    public CoreToolsOutboundNetwork withVpcConfig(CoreToolsVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    public CoreToolsOutboundNetwork withVpcConfig(Consumer<CoreToolsVpcConfig> vpcConfigSetter) {
        if (this.vpcConfig == null) {
            this.vpcConfig = new CoreToolsVpcConfig();
            vpcConfigSetter.accept(this.vpcConfig);
        }

        return this;
    }

    /**
     * Get vpcConfig
     * @return vpcConfig
     */
    public CoreToolsVpcConfig getVpcConfig() {
        return vpcConfig;
    }

    public void setVpcConfig(CoreToolsVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreToolsOutboundNetwork that = (CoreToolsOutboundNetwork) obj;
        return Objects.equals(this.networkMode, that.networkMode) && Objects.equals(this.vpcConfig, that.vpcConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkMode, vpcConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreToolsOutboundNetwork {\n");
        sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
        sb.append("    vpcConfig: ").append(toIndentedString(vpcConfig)).append("\n");
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
