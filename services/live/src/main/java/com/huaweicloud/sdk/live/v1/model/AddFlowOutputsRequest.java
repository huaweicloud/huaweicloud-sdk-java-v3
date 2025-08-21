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
 * AddFlowOutputsRequest
 */
public class AddFlowOutputsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_whitelist")

    private List<String> cidrWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption")

    private FlowSourceDecryption encryption;

    /**
     * 输出状态，ENABLED：启用，DISABLED：禁用
     */
    public static final class OutputStatusEnum {

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final OutputStatusEnum ENABLED = new OutputStatusEnum("ENABLED");

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final OutputStatusEnum DISABLED = new OutputStatusEnum("DISABLED");

        private static final Map<String, OutputStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OutputStatusEnum> createStaticFields() {
            Map<String, OutputStatusEnum> map = new HashMap<>();
            map.put("ENABLED", ENABLED);
            map.put("DISABLED", DISABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OutputStatusEnum(String value) {
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
        public static OutputStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OutputStatusEnum(value));
        }

        public static OutputStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OutputStatusEnum) {
                return this.value.equals(((OutputStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_status")

    private OutputStatusEnum outputStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    /**
     * 协议，srt-caller，srt-listener
     */
    public static final class ProtocolEnum {

        /**
         * Enum SRT_LISTENER for value: "srt-listener"
         */
        public static final ProtocolEnum SRT_LISTENER = new ProtocolEnum("srt-listener");

        /**
         * Enum SRT_CALLER for value: "srt-caller"
         */
        public static final ProtocolEnum SRT_CALLER = new ProtocolEnum("srt-caller");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("srt-listener", SRT_LISTENER);
            map.put("srt-caller", SRT_CALLER);
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
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_latency")

    private Integer minLatency;

    public AddFlowOutputsRequest withCidrWhitelist(List<String> cidrWhitelist) {
        this.cidrWhitelist = cidrWhitelist;
        return this;
    }

    public AddFlowOutputsRequest addCidrWhitelistItem(String cidrWhitelistItem) {
        if (this.cidrWhitelist == null) {
            this.cidrWhitelist = new ArrayList<>();
        }
        this.cidrWhitelist.add(cidrWhitelistItem);
        return this;
    }

    public AddFlowOutputsRequest withCidrWhitelist(Consumer<List<String>> cidrWhitelistSetter) {
        if (this.cidrWhitelist == null) {
            this.cidrWhitelist = new ArrayList<>();
        }
        cidrWhitelistSetter.accept(this.cidrWhitelist);
        return this;
    }

    /**
     * ip白名单，最大20条ip白名单
     * @return cidrWhitelist
     */
    public List<String> getCidrWhitelist() {
        return cidrWhitelist;
    }

    public void setCidrWhitelist(List<String> cidrWhitelist) {
        this.cidrWhitelist = cidrWhitelist;
    }

    public AddFlowOutputsRequest withDestination(String destination) {
        this.destination = destination;
        return this;
    }

    /**
     * 推流地址，支持ip和域名，最大值64
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public AddFlowOutputsRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * output名称，有效字符：大小写字母，数字，中划线，下划线;且只能以字母开头
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AddFlowOutputsRequest withEncryption(FlowSourceDecryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public AddFlowOutputsRequest withEncryption(Consumer<FlowSourceDecryption> encryptionSetter) {
        if (this.encryption == null) {
            this.encryption = new FlowSourceDecryption();
            encryptionSetter.accept(this.encryption);
        }

        return this;
    }

    /**
     * Get encryption
     * @return encryption
     */
    public FlowSourceDecryption getEncryption() {
        return encryption;
    }

    public void setEncryption(FlowSourceDecryption encryption) {
        this.encryption = encryption;
    }

    public AddFlowOutputsRequest withOutputStatus(OutputStatusEnum outputStatus) {
        this.outputStatus = outputStatus;
        return this;
    }

    /**
     * 输出状态，ENABLED：启用，DISABLED：禁用
     * @return outputStatus
     */
    public OutputStatusEnum getOutputStatus() {
        return outputStatus;
    }

    public void setOutputStatus(OutputStatusEnum outputStatus) {
        this.outputStatus = outputStatus;
    }

    public AddFlowOutputsRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口，如果ssrt-listener为监听端口，那么srt-caller为对端端口
     * minimum: 1024
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public AddFlowOutputsRequest withProtocol(ProtocolEnum protocol) {
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

    public AddFlowOutputsRequest withStreamId(String streamId) {
        this.streamId = streamId;
        return this;
    }

    /**
     * srt-caller模式支持设置streamid
     * @return streamId
     */
    public String getStreamId() {
        return streamId;
    }

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    public AddFlowOutputsRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 输出描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AddFlowOutputsRequest withMinLatency(Integer minLatency) {
        this.minLatency = minLatency;
        return this;
    }

    /**
     * 最小时延，单位毫秒，默认值2000，最小值10，最大值15000
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddFlowOutputsRequest that = (AddFlowOutputsRequest) obj;
        return Objects.equals(this.cidrWhitelist, that.cidrWhitelist)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.name, that.name)
            && Objects.equals(this.encryption, that.encryption) && Objects.equals(this.outputStatus, that.outputStatus)
            && Objects.equals(this.port, that.port) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.minLatency, that.minLatency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidrWhitelist,
            destination,
            name,
            encryption,
            outputStatus,
            port,
            protocol,
            streamId,
            description,
            minLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddFlowOutputsRequest {\n");
        sb.append("    cidrWhitelist: ").append(toIndentedString(cidrWhitelist)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    outputStatus: ").append(toIndentedString(outputStatus)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    streamId: ").append(toIndentedString(streamId)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    minLatency: ").append(toIndentedString(minLatency)).append("\n");
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
