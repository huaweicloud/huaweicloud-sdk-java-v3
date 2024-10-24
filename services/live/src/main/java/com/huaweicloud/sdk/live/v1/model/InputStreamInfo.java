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
     * 频道入流协议 - FLV_PULL - RTMP_PUSH - HLS_PULL - SRT_PULL - SRT_PUSH
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_whitelist")

    private String ipWhitelist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scte35_source")

    private String scte35Source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_triggers")

    private List<String> adTriggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_selectors")

    private List<InputAudioSelector> audioSelectors = null;

    public InputStreamInfo withInputProtocol(InputProtocolEnum inputProtocol) {
        this.inputProtocol = inputProtocol;
        return this;
    }

    /**
     * 频道入流协议 - FLV_PULL - RTMP_PUSH - HLS_PULL - SRT_PULL - SRT_PUSH
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
     * 当入流协议为HLS_PULL时，需要配置的最大带宽。  用户提供的拉流URL中，针对不同码率的音视频，均会携带带宽参数“BANDWIDTH”。 - 如果这里配置最大带宽，媒体直播服务从URL拉流时，会选择小于最大带宽且码率最大的音视频流，推流到源站。 - 如果这里未配置最大带宽，媒体直播服务从URL拉流时，会默认选择“BANDWIDTH”最高的音视频流，推流到源站。
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

    public InputStreamInfo withIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
        return this;
    }

    /**
     * SRT_PUSH类型时，客户push ip白名单
     * @return ipWhitelist
     */
    public String getIpWhitelist() {
        return ipWhitelist;
    }

    public void setIpWhitelist(String ipWhitelist) {
        this.ipWhitelist = ipWhitelist;
    }

    public InputStreamInfo withScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
        return this;
    }

    /**
     * 广告的scte35信号源。  仅HLS_PULL类型的频道支持此配置，且目前仅支持SEGMENTS。
     * @return scte35Source
     */
    public String getScte35Source() {
        return scte35Source;
    }

    public void setScte35Source(String scte35Source) {
        this.scte35Source = scte35Source;
    }

    public InputStreamInfo withAdTriggers(List<String> adTriggers) {
        this.adTriggers = adTriggers;
        return this;
    }

    public InputStreamInfo addAdTriggersItem(String adTriggersItem) {
        if (this.adTriggers == null) {
            this.adTriggers = new ArrayList<>();
        }
        this.adTriggers.add(adTriggersItem);
        return this;
    }

    public InputStreamInfo withAdTriggers(Consumer<List<String>> adTriggersSetter) {
        if (this.adTriggers == null) {
            this.adTriggers = new ArrayList<>();
        }
        adTriggersSetter.accept(this.adTriggers);
        return this;
    }

    /**
     * 广告触发器配置。  包含如下取值： - Splice insert：拼接插入 - Provider advertisement：提供商广告 - Distributor advertisement：分销商广告 - Provider placement opportunity：提供商置放机会 - Distributor placement opportunity：分销商置放机会
     * @return adTriggers
     */
    public List<String> getAdTriggers() {
        return adTriggers;
    }

    public void setAdTriggers(List<String> adTriggers) {
        this.adTriggers = adTriggers;
    }

    public InputStreamInfo withAudioSelectors(List<InputAudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
        return this;
    }

    public InputStreamInfo addAudioSelectorsItem(InputAudioSelector audioSelectorsItem) {
        if (this.audioSelectors == null) {
            this.audioSelectors = new ArrayList<>();
        }
        this.audioSelectors.add(audioSelectorsItem);
        return this;
    }

    public InputStreamInfo withAudioSelectors(Consumer<List<InputAudioSelector>> audioSelectorsSetter) {
        if (this.audioSelectors == null) {
            this.audioSelectors = new ArrayList<>();
        }
        audioSelectorsSetter.accept(this.audioSelectors);
        return this;
    }

    /**
     * 设置音频选择器，最多设置8个音频选择器
     * @return audioSelectors
     */
    public List<InputAudioSelector> getAudioSelectors() {
        return audioSelectors;
    }

    public void setAudioSelectors(List<InputAudioSelector> audioSelectors) {
        this.audioSelectors = audioSelectors;
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
            && Objects.equals(this.ipPortMode, that.ipPortMode) && Objects.equals(this.ipWhitelist, that.ipWhitelist)
            && Objects.equals(this.scte35Source, that.scte35Source) && Objects.equals(this.adTriggers, that.adTriggers)
            && Objects.equals(this.audioSelectors, that.audioSelectors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputProtocol,
            sources,
            secondarySources,
            failoverConditions,
            maxBandwidthLimit,
            ipPortMode,
            ipWhitelist,
            scte35Source,
            adTriggers,
            audioSelectors);
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
        sb.append("    ipWhitelist: ").append(toIndentedString(ipWhitelist)).append("\n");
        sb.append("    scte35Source: ").append(toIndentedString(scte35Source)).append("\n");
        sb.append("    adTriggers: ").append(toIndentedString(adTriggers)).append("\n");
        sb.append("    audioSelectors: ").append(toIndentedString(audioSelectors)).append("\n");
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
