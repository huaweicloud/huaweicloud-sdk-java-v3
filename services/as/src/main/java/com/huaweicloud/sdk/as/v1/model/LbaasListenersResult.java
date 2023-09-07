package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 增强型负载均衡器信息
 */
public class LbaasListenersResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private Integer protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    /**
     * 指定ip协议版本
     */
    public static final class ProtocolVersionEnum {

        /**
         * Enum IPV4 for value: "IPV4"
         */
        public static final ProtocolVersionEnum IPV4 = new ProtocolVersionEnum("IPV4");

        /**
         * Enum IPV6 for value: "IPV6"
         */
        public static final ProtocolVersionEnum IPV6 = new ProtocolVersionEnum("IPV6");

        private static final Map<String, ProtocolVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolVersionEnum> createStaticFields() {
            Map<String, ProtocolVersionEnum> map = new HashMap<>();
            map.put("IPV4", IPV4);
            map.put("IPV6", IPV6);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolVersionEnum(String value) {
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
        public static ProtocolVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolVersionEnum(value));
        }

        public static ProtocolVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolVersionEnum) {
                return this.value.equals(((ProtocolVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_version")

    private ProtocolVersionEnum protocolVersion;

    public LbaasListenersResult withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * 监听器ID
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public LbaasListenersResult withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 后端云服务器组ID
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public LbaasListenersResult withProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 后端协议号，指后端云服务器监听的端口，取值范围[1,65535]
     * minimum: 1
     * maximum: 65535
     * @return protocolPort
     */
    public Integer getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(Integer protocolPort) {
        this.protocolPort = protocolPort;
    }

    public LbaasListenersResult withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重，指后端云服务器经分发得到的请求数量比例，取值范围[0,1]，默认为1。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LbaasListenersResult withProtocolVersion(ProtocolVersionEnum protocolVersion) {
        this.protocolVersion = protocolVersion;
        return this;
    }

    /**
     * 指定ip协议版本
     * @return protocolVersion
     */
    public ProtocolVersionEnum getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(ProtocolVersionEnum protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LbaasListenersResult that = (LbaasListenersResult) obj;
        return Objects.equals(this.listenerId, that.listenerId) && Objects.equals(this.poolId, that.poolId)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.weight, that.weight)
            && Objects.equals(this.protocolVersion, that.protocolVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listenerId, poolId, protocolPort, weight, protocolVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LbaasListenersResult {\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    protocolVersion: ").append(toIndentedString(protocolVersion)).append("\n");
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
