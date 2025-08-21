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
 * UpdateFlowOutputRequestBody
 */
public class UpdateFlowOutputRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr_whitelist")

    private List<String> cidrWhitelist = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "destination")

    private String destination;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream_id")

    private String streamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_latency")

    private Integer minLatency;

    public UpdateFlowOutputRequestBody withCidrWhitelist(List<String> cidrWhitelist) {
        this.cidrWhitelist = cidrWhitelist;
        return this;
    }

    public UpdateFlowOutputRequestBody addCidrWhitelistItem(String cidrWhitelistItem) {
        if (this.cidrWhitelist == null) {
            this.cidrWhitelist = new ArrayList<>();
        }
        this.cidrWhitelist.add(cidrWhitelistItem);
        return this;
    }

    public UpdateFlowOutputRequestBody withCidrWhitelist(Consumer<List<String>> cidrWhitelistSetter) {
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

    public UpdateFlowOutputRequestBody withDestination(String destination) {
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

    public UpdateFlowOutputRequestBody withEncryption(FlowSourceDecryption encryption) {
        this.encryption = encryption;
        return this;
    }

    public UpdateFlowOutputRequestBody withEncryption(Consumer<FlowSourceDecryption> encryptionSetter) {
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

    public UpdateFlowOutputRequestBody withOutputStatus(OutputStatusEnum outputStatus) {
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

    public UpdateFlowOutputRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
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

    public UpdateFlowOutputRequestBody withStreamId(String streamId) {
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

    public UpdateFlowOutputRequestBody withDescription(String description) {
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

    public UpdateFlowOutputRequestBody withMinLatency(Integer minLatency) {
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
        UpdateFlowOutputRequestBody that = (UpdateFlowOutputRequestBody) obj;
        return Objects.equals(this.cidrWhitelist, that.cidrWhitelist)
            && Objects.equals(this.destination, that.destination) && Objects.equals(this.encryption, that.encryption)
            && Objects.equals(this.outputStatus, that.outputStatus) && Objects.equals(this.port, that.port)
            && Objects.equals(this.streamId, that.streamId) && Objects.equals(this.description, that.description)
            && Objects.equals(this.minLatency, that.minLatency);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(cidrWhitelist, destination, encryption, outputStatus, port, streamId, description, minLatency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlowOutputRequestBody {\n");
        sb.append("    cidrWhitelist: ").append(toIndentedString(cidrWhitelist)).append("\n");
        sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
        sb.append("    encryption: ").append(toIndentedString(encryption)).append("\n");
        sb.append("    outputStatus: ").append(toIndentedString(outputStatus)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
