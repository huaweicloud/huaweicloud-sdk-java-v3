package com.huaweicloud.sdk.live.v1.model;

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
 * 入流信息
 */
public class FlowSource {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_listener_address")

    private String sourceListenerAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_listener_port")

    private Integer sourceListenerPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_latency")

    private Integer minLatency;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_whitelist")

    private List<String> cidrWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 协议，srt-caller，srt-listener
     */
    public static final class ProtocolEnum {

        /**
         * Enum SRT_CALLER for value: "srt-caller"
         */
        public static final ProtocolEnum SRT_CALLER = new ProtocolEnum("srt-caller");

        /**
         * Enum SRT_LISTENER for value: "srt-listener"
         */
        public static final ProtocolEnum SRT_LISTENER = new ProtocolEnum("srt-listener");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("srt-caller", SRT_CALLER);
            map.put("srt-listener", SRT_LISTENER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "decryption")

    private FlowSourceDecryption decryption;

    /**
     * **参数解释**： 转推流状态 **约束限制**： 不涉及 **取值范围**： - CONNECTED：转推中 - DISCONNECTED：转推中断 
     */
    public static final class HealthStatusEnum {

        /**
         * Enum CONNECTED for value: "CONNECTED"
         */
        public static final HealthStatusEnum CONNECTED = new HealthStatusEnum("CONNECTED");

        /**
         * Enum DISCONNECTED for value: "DISCONNECTED"
         */
        public static final HealthStatusEnum DISCONNECTED = new HealthStatusEnum("DISCONNECTED");

        private static final Map<String, HealthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HealthStatusEnum> createStaticFields() {
            Map<String, HealthStatusEnum> map = new HashMap<>();
            map.put("CONNECTED", CONNECTED);
            map.put("DISCONNECTED", DISCONNECTED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HealthStatusEnum(String value) {
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
        public static HealthStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new HealthStatusEnum(value));
        }

        public static HealthStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HealthStatusEnum) {
                return this.value.equals(((HealthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_status")

    private HealthStatusEnum healthStatus;

    public FlowSource withSourceListenerAddress(String sourceListenerAddress) {
        this.sourceListenerAddress = sourceListenerAddress;
        return this;
    }

    /**
     * 拉流地址
     * @return sourceListenerAddress
     */
    public String getSourceListenerAddress() {
        return sourceListenerAddress;
    }

    public void setSourceListenerAddress(String sourceListenerAddress) {
        this.sourceListenerAddress = sourceListenerAddress;
    }

    public FlowSource withSourceListenerPort(Integer sourceListenerPort) {
        this.sourceListenerPort = sourceListenerPort;
        return this;
    }

    /**
     * 拉流端口，2077/2088不可选
     * minimum: 1024
     * maximum: 65535
     * @return sourceListenerPort
     */
    public Integer getSourceListenerPort() {
        return sourceListenerPort;
    }

    public void setSourceListenerPort(Integer sourceListenerPort) {
        this.sourceListenerPort = sourceListenerPort;
    }

    public FlowSource withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * srt拉流streamid
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public FlowSource withMinLatency(Integer minLatency) {
        this.minLatency = minLatency;
        return this;
    }

    /**
     * 最小时延，单位ms
     * minimum: 10
     * maximum: 15000
     * @return minLatency
     */
    public Integer getMinLatency() {
        return minLatency;
    }

    public void setMinLatency(Integer minLatency) {
        this.minLatency = minLatency;
    }

    public FlowSource withCidrWhitelist(List<String> cidrWhitelist) {
        this.cidrWhitelist = cidrWhitelist;
        return this;
    }

    public FlowSource addCidrWhitelistItem(String cidrWhitelistItem) {
        if (this.cidrWhitelist == null) {
            this.cidrWhitelist = new ArrayList<>();
        }
        this.cidrWhitelist.add(cidrWhitelistItem);
        return this;
    }

    public FlowSource withCidrWhitelist(Consumer<List<String>> cidrWhitelistSetter) {
        if (this.cidrWhitelist == null) {
            this.cidrWhitelist = new ArrayList<>();
        }
        cidrWhitelistSetter.accept(this.cidrWhitelist);
        return this;
    }

    /**
     * 推流CIDR IP白名单列表
     * @return cidrWhitelist
     */
    public List<String> getCidrWhitelist() {
        return cidrWhitelist;
    }

    public void setCidrWhitelist(List<String> cidrWhitelist) {
        this.cidrWhitelist = cidrWhitelist;
    }

    public FlowSource withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FlowSource withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议，srt-caller，srt-listener
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public FlowSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 入流资源名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlowSource withDecryption(FlowSourceDecryption decryption) {
        this.decryption = decryption;
        return this;
    }

    public FlowSource withDecryption(Consumer<FlowSourceDecryption> decryptionSetter) {
        if (this.decryption == null) {
            this.decryption = new FlowSourceDecryption();
            decryptionSetter.accept(this.decryption);
        }

        return this;
    }

    /**
     * Get decryption
     * @return decryption
     */
    public FlowSourceDecryption getDecryption() {
        return decryption;
    }

    public void setDecryption(FlowSourceDecryption decryption) {
        this.decryption = decryption;
    }

    public FlowSource withHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * **参数解释**： 转推流状态 **约束限制**： 不涉及 **取值范围**： - CONNECTED：转推中 - DISCONNECTED：转推中断 
     * @return healthStatus
     */
    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlowSource that = (FlowSource) obj;
        return Objects.equals(this.sourceListenerAddress, that.sourceListenerAddress)
            && Objects.equals(this.sourceListenerPort, that.sourceListenerPort)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.minLatency, that.minLatency)
            && Objects.equals(this.cidrWhitelist, that.cidrWhitelist)
            && Objects.equals(this.description, that.description) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.name, that.name) && Objects.equals(this.decryption, that.decryption)
            && Objects.equals(this.healthStatus, that.healthStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceListenerAddress,
            sourceListenerPort,
            streamId,
            minLatency,
            cidrWhitelist,
            description,
            protocol,
            name,
            decryption,
            healthStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlowSource {\n");
        sb.append("    sourceListenerAddress: ").append(toIndentedString(sourceListenerAddress)).append("\n");
        sb.append("    sourceListenerPort: ").append(toIndentedString(sourceListenerPort)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
        sb.append("    cidrWhitelist: ").append(toIndentedString(cidrWhitelist)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    decryption: ").append(toIndentedString(decryption)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
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
