package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改录制规则
 */
public class RecordRuleReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_addr")

    @JacksonXmlProperty(localName = "obs_addr")

    private RecordObsFileAddr obsAddr;

    /**
     * Gets or Sets recordFormats
     */
    public static final class RecordFormatsEnum {

        /**
         * Enum HLS for value: "HLS"
         */
        public static final RecordFormatsEnum HLS = new RecordFormatsEnum("HLS");

        /**
         * Enum MP4 for value: "MP4"
         */
        public static final RecordFormatsEnum MP4 = new RecordFormatsEnum("MP4");

        private static final Map<String, RecordFormatsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordFormatsEnum> createStaticFields() {
            Map<String, RecordFormatsEnum> map = new HashMap<>();
            map.put("HLS", HLS);
            map.put("MP4", MP4);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordFormatsEnum(String value) {
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
        public static RecordFormatsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RecordFormatsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordFormatsEnum(value);
            }
            return result;
        }

        public static RecordFormatsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RecordFormatsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RecordFormatsEnum) {
                return this.value.equals(((RecordFormatsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_formats")

    @JacksonXmlProperty(localName = "record_formats")

    private List<RecordFormatsEnum> recordFormats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_config")

    @JacksonXmlProperty(localName = "hls_config")

    private HLSRecordConfig hlsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mp4_config")

    @JacksonXmlProperty(localName = "mp4_config")

    private MP4RecordConfig mp4Config;

    public RecordRuleReq withObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
        return this;
    }

    public RecordRuleReq withObsAddr(Consumer<RecordObsFileAddr> obsAddrSetter) {
        if (this.obsAddr == null) {
            this.obsAddr = new RecordObsFileAddr();
            obsAddrSetter.accept(this.obsAddr);
        }

        return this;
    }

    /**
     * Get obsAddr
     * @return obsAddr
     */
    public RecordObsFileAddr getObsAddr() {
        return obsAddr;
    }

    public void setObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
    }

    public RecordRuleReq withRecordFormats(List<RecordFormatsEnum> recordFormats) {
        this.recordFormats = recordFormats;
        return this;
    }

    public RecordRuleReq addRecordFormatsItem(RecordFormatsEnum recordFormatsItem) {
        if (this.recordFormats == null) {
            this.recordFormats = new ArrayList<>();
        }
        this.recordFormats.add(recordFormatsItem);
        return this;
    }

    public RecordRuleReq withRecordFormats(Consumer<List<RecordFormatsEnum>> recordFormatsSetter) {
        if (this.recordFormats == null) {
            this.recordFormats = new ArrayList<>();
        }
        recordFormatsSetter.accept(this.recordFormats);
        return this;
    }

    /**
     *  录制格式：支持HLS格式和MP4格式（HLS和MP4为大写）。   - 若配置HLS则必须携带HLSRecordConfig参数  - 若配置MP4则需要携带MP4RecordConfig 
     * @return recordFormats
     */
    public List<RecordFormatsEnum> getRecordFormats() {
        return recordFormats;
    }

    public void setRecordFormats(List<RecordFormatsEnum> recordFormats) {
        this.recordFormats = recordFormats;
    }

    public RecordRuleReq withHlsConfig(HLSRecordConfig hlsConfig) {
        this.hlsConfig = hlsConfig;
        return this;
    }

    public RecordRuleReq withHlsConfig(Consumer<HLSRecordConfig> hlsConfigSetter) {
        if (this.hlsConfig == null) {
            this.hlsConfig = new HLSRecordConfig();
            hlsConfigSetter.accept(this.hlsConfig);
        }

        return this;
    }

    /**
     * Get hlsConfig
     * @return hlsConfig
     */
    public HLSRecordConfig getHlsConfig() {
        return hlsConfig;
    }

    public void setHlsConfig(HLSRecordConfig hlsConfig) {
        this.hlsConfig = hlsConfig;
    }

    public RecordRuleReq withMp4Config(MP4RecordConfig mp4Config) {
        this.mp4Config = mp4Config;
        return this;
    }

    public RecordRuleReq withMp4Config(Consumer<MP4RecordConfig> mp4ConfigSetter) {
        if (this.mp4Config == null) {
            this.mp4Config = new MP4RecordConfig();
            mp4ConfigSetter.accept(this.mp4Config);
        }

        return this;
    }

    /**
     * Get mp4Config
     * @return mp4Config
     */
    public MP4RecordConfig getMp4Config() {
        return mp4Config;
    }

    public void setMp4Config(MP4RecordConfig mp4Config) {
        this.mp4Config = mp4Config;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordRuleReq recordRuleReq = (RecordRuleReq) o;
        return Objects.equals(this.obsAddr, recordRuleReq.obsAddr)
            && Objects.equals(this.recordFormats, recordRuleReq.recordFormats)
            && Objects.equals(this.hlsConfig, recordRuleReq.hlsConfig)
            && Objects.equals(this.mp4Config, recordRuleReq.mp4Config);
    }

    @Override
    public int hashCode() {
        return Objects.hash(obsAddr, recordFormats, hlsConfig, mp4Config);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordRuleReq {\n");
        sb.append("    obsAddr: ").append(toIndentedString(obsAddr)).append("\n");
        sb.append("    recordFormats: ").append(toIndentedString(recordFormats)).append("\n");
        sb.append("    hlsConfig: ").append(toIndentedString(hlsConfig)).append("\n");
        sb.append("    mp4Config: ").append(toIndentedString(mp4Config)).append("\n");
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
