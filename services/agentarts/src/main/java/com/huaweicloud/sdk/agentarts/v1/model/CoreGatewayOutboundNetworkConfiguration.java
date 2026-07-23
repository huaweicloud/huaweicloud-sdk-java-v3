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
 * 出站网络配置。
 */
public class CoreGatewayOutboundNetworkConfiguration {

    /**
     * 网络模式。
     */
    public static final class NetworkModeEnum {

        /**
         * Enum PUBLIC for value: "public"
         */
        public static final NetworkModeEnum PUBLIC = new NetworkModeEnum("public");

        /**
         * Enum VPC for value: "vpc"
         */
        public static final NetworkModeEnum VPC = new NetworkModeEnum("vpc");

        private static final Map<String, NetworkModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NetworkModeEnum> createStaticFields() {
            Map<String, NetworkModeEnum> map = new HashMap<>();
            map.put("public", PUBLIC);
            map.put("vpc", VPC);
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

    private CoreGatewayVpcConfig vpcConfig;

    public CoreGatewayOutboundNetworkConfiguration withNetworkMode(NetworkModeEnum networkMode) {
        this.networkMode = networkMode;
        return this;
    }

    /**
     * 网络模式。
     * @return networkMode
     */
    public NetworkModeEnum getNetworkMode() {
        return networkMode;
    }

    public void setNetworkMode(NetworkModeEnum networkMode) {
        this.networkMode = networkMode;
    }

    public CoreGatewayOutboundNetworkConfiguration withVpcConfig(CoreGatewayVpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    public CoreGatewayOutboundNetworkConfiguration withVpcConfig(Consumer<CoreGatewayVpcConfig> vpcConfigSetter) {
        if (this.vpcConfig == null) {
            this.vpcConfig = new CoreGatewayVpcConfig();
            vpcConfigSetter.accept(this.vpcConfig);
        }

        return this;
    }

    /**
     * Get vpcConfig
     * @return vpcConfig
     */
    public CoreGatewayVpcConfig getVpcConfig() {
        return vpcConfig;
    }

    public void setVpcConfig(CoreGatewayVpcConfig vpcConfig) {
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
        CoreGatewayOutboundNetworkConfiguration that = (CoreGatewayOutboundNetworkConfiguration) obj;
        return Objects.equals(this.networkMode, that.networkMode) && Objects.equals(this.vpcConfig, that.vpcConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(networkMode, vpcConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayOutboundNetworkConfiguration {\n");
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
