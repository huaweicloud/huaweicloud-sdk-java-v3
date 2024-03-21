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
 * 频道入流信息
 */
public class InputStreamInfo {

    /**
     * 频道入流协议 - FLV_PULL - RTMP_PUSH - RTMP_PULL - HLS_PULL - SRT_PULL - SRT_PUSH
     */
    public static final class InputProtocolEnum {

        /**
         * Enum FLV_PULL for value: "FLV_PULL"
         */
        public static final InputProtocolEnum FLV_PULL = new InputProtocolEnum("FLV_PULL");

        /**
         * Enum RTMP_PUSH for value: "RTMP_PUSH"
         */
        public static final InputProtocolEnum RTMP_PUSH = new InputProtocolEnum("RTMP_PUSH");

        /**
         * Enum RTMP_PULL for value: "RTMP_PULL"
         */
        public static final InputProtocolEnum RTMP_PULL = new InputProtocolEnum("RTMP_PULL");

        /**
         * Enum HLS_PULL for value: "HLS_PULL"
         */
        public static final InputProtocolEnum HLS_PULL = new InputProtocolEnum("HLS_PULL");

        /**
         * Enum SRT_PULL for value: "SRT_PULL"
         */
        public static final InputProtocolEnum SRT_PULL = new InputProtocolEnum("SRT_PULL");

        /**
         * Enum SRT_PUSH for value: "SRT_PUSH"
         */
        public static final InputProtocolEnum SRT_PUSH = new InputProtocolEnum("SRT_PUSH");

        private static final Map<String, InputProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InputProtocolEnum> createStaticFields() {
            Map<String, InputProtocolEnum> map = new HashMap<>();
            map.put("FLV_PULL", FLV_PULL);
            map.put("RTMP_PUSH", RTMP_PUSH);
            map.put("RTMP_PULL", RTMP_PULL);
            map.put("HLS_PULL", HLS_PULL);
            map.put("SRT_PULL", SRT_PULL);
            map.put("SRT_PUSH", SRT_PUSH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InputProtocolEnum(String value) {
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
        public static InputProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InputProtocolEnum(value));
        }

        public static InputProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InputProtocolEnum) {
                return this.value.equals(((InputProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input_protocol")

    private InputProtocolEnum inputProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<SourcesInfo> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secondary_sources")

    private List<SecondarySourcesInfo> secondarySources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failover_conditions")

    private FailoverConditions failoverConditions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_bandwidth_limit")

    private Integer maxBandwidthLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_port_mode")

    private Boolean ipPortMode;

    public InputStreamInfo withInputProtocol(InputProtocolEnum inputProtocol) {
        this.inputProtocol = inputProtocol;
        return this;
    }

    /**
     * 频道入流协议 - FLV_PULL - RTMP_PUSH - RTMP_PULL - HLS_PULL - SRT_PULL - SRT_PUSH
     * @return inputProtocol
     */
    public InputProtocolEnum getInputProtocol() {
        return inputProtocol;
    }

    public void setInputProtocol(InputProtocolEnum inputProtocol) {
        this.inputProtocol = inputProtocol;
    }

    public InputStreamInfo withSources(List<SourcesInfo> sources) {
        this.sources = sources;
        return this;
    }

    public InputStreamInfo addSourcesItem(SourcesInfo sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public InputStreamInfo withSources(Consumer<List<SourcesInfo>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 频道主源流信息。入流协议为RTMP_PUSH和SRT_PUSH时，非必填项。其他情况下，均为必填项。
     * @return sources
     */
    public List<SourcesInfo> getSources() {
        return sources;
    }

    public void setSources(List<SourcesInfo> sources) {
        this.sources = sources;
    }

    public InputStreamInfo withSecondarySources(List<SecondarySourcesInfo> secondarySources) {
        this.secondarySources = secondarySources;
        return this;
    }

    public InputStreamInfo addSecondarySourcesItem(SecondarySourcesInfo secondarySourcesItem) {
        if (this.secondarySources == null) {
            this.secondarySources = new ArrayList<>();
        }
        this.secondarySources.add(secondarySourcesItem);
        return this;
    }

    public InputStreamInfo withSecondarySources(Consumer<List<SecondarySourcesInfo>> secondarySourcesSetter) {
        if (this.secondarySources == null) {
            this.secondarySources = new ArrayList<>();
        }
        secondarySourcesSetter.accept(this.secondarySources);
        return this;
    }

    /**
     * 备入流数组，非必填项。如果有备入流，则主备入流必须保证路数、codec和分辨率均一致。入流协议为RTMP_PUSH时，无需填写。
     * @return secondarySources
     */
    public List<SecondarySourcesInfo> getSecondarySources() {
        return secondarySources;
    }

    public void setSecondarySources(List<SecondarySourcesInfo> secondarySources) {
        this.secondarySources = secondarySources;
    }

    public InputStreamInfo withFailoverConditions(FailoverConditions failoverConditions) {
        this.failoverConditions = failoverConditions;
        return this;
    }

    public InputStreamInfo withFailoverConditions(Consumer<FailoverConditions> failoverConditionsSetter) {
        if (this.failoverConditions == null) {
            this.failoverConditions = new FailoverConditions();
            failoverConditionsSetter.accept(this.failoverConditions);
        }

        return this;
    }

    /**
     * Get failoverConditions
     * @return failoverConditions
     */
    public FailoverConditions getFailoverConditions() {
        return failoverConditions;
    }

    public void setFailoverConditions(FailoverConditions failoverConditions) {
        this.failoverConditions = failoverConditions;
    }

    public InputStreamInfo withMaxBandwidthLimit(Integer maxBandwidthLimit) {
        this.maxBandwidthLimit = maxBandwidthLimit;
        return this;
    }

    /**
     * 当入流协议为HLS_PULL时，最大带宽限制。 未配置会默认选择BANDWIDTH最高的流
     * @return maxBandwidthLimit
     */
    public Integer getMaxBandwidthLimit() {
        return maxBandwidthLimit;
    }

    public void setMaxBandwidthLimit(Integer maxBandwidthLimit) {
        this.maxBandwidthLimit = maxBandwidthLimit;
    }

    public InputStreamInfo withIpPortMode(Boolean ipPortMode) {
        this.ipPortMode = ipPortMode;
        return this;
    }

    /**
     * 当推流协议为SRT_PUSH时，如果配置了直推源站，编码器不支持输入streamid，需要打开设置为true
     * @return ipPortMode
     */
    public Boolean getIpPortMode() {
        return ipPortMode;
    }

    public void setIpPortMode(Boolean ipPortMode) {
        this.ipPortMode = ipPortMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InputStreamInfo that = (InputStreamInfo) obj;
        return Objects.equals(this.inputProtocol, that.inputProtocol) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.secondarySources, that.secondarySources)
            && Objects.equals(this.failoverConditions, that.failoverConditions)
            && Objects.equals(this.maxBandwidthLimit, that.maxBandwidthLimit)
            && Objects.equals(this.ipPortMode, that.ipPortMode);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(inputProtocol, sources, secondarySources, failoverConditions, maxBandwidthLimit, ipPortMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InputStreamInfo {\n");
        sb.append("    inputProtocol: ").append(toIndentedString(inputProtocol)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    secondarySources: ").append(toIndentedString(secondarySources)).append("\n");
        sb.append("    failoverConditions: ").append(toIndentedString(failoverConditions)).append("\n");
        sb.append("    maxBandwidthLimit: ").append(toIndentedString(maxBandwidthLimit)).append("\n");
        sb.append("    ipPortMode: ").append(toIndentedString(ipPortMode)).append("\n");
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
