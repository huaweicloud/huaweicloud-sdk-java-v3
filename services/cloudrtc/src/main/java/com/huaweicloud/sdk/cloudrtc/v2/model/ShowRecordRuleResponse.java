package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowRecordRuleResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_addr")

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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RecordFormatsEnum(value));
        }

        public static RecordFormatsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    private List<RecordFormatsEnum> recordFormats = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hls_config")

    private HLSRecordConfig hlsConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mp4_config")

    private MP4RecordConfig mp4Config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")

    private String xRequestId;

    public ShowRecordRuleResponse withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id，由服务端返回。创建或修改规则的时候不携带
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ShowRecordRuleResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public ShowRecordRuleResponse withObsAddr(RecordObsFileAddr obsAddr) {
        this.obsAddr = obsAddr;
        return this;
    }

    public ShowRecordRuleResponse withObsAddr(Consumer<RecordObsFileAddr> obsAddrSetter) {
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

    public ShowRecordRuleResponse withRecordFormats(List<RecordFormatsEnum> recordFormats) {
        this.recordFormats = recordFormats;
        return this;
    }

    public ShowRecordRuleResponse addRecordFormatsItem(RecordFormatsEnum recordFormatsItem) {
        if (this.recordFormats == null) {
            this.recordFormats = new ArrayList<>();
        }
        this.recordFormats.add(recordFormatsItem);
        return this;
    }

    public ShowRecordRuleResponse withRecordFormats(Consumer<List<RecordFormatsEnum>> recordFormatsSetter) {
        if (this.recordFormats == null) {
            this.recordFormats = new ArrayList<>();
        }
        recordFormatsSetter.accept(this.recordFormats);
        return this;
    }

    /**
     * 录制格式：HLS格式或者MP4格式
     * @return recordFormats
     */
    public List<RecordFormatsEnum> getRecordFormats() {
        return recordFormats;
    }

    public void setRecordFormats(List<RecordFormatsEnum> recordFormats) {
        this.recordFormats = recordFormats;
    }

    public ShowRecordRuleResponse withHlsConfig(HLSRecordConfig hlsConfig) {
        this.hlsConfig = hlsConfig;
        return this;
    }

    public ShowRecordRuleResponse withHlsConfig(Consumer<HLSRecordConfig> hlsConfigSetter) {
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

    public ShowRecordRuleResponse withMp4Config(MP4RecordConfig mp4Config) {
        this.mp4Config = mp4Config;
        return this;
    }

    public ShowRecordRuleResponse withMp4Config(Consumer<MP4RecordConfig> mp4ConfigSetter) {
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

    public ShowRecordRuleResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowRecordRuleResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，形如“2006-01-02T15:04:05.075Z”，时区为：UTC
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowRecordRuleResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRecordRuleResponse that = (ShowRecordRuleResponse) obj;
        return Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.obsAddr, that.obsAddr) && Objects.equals(this.recordFormats, that.recordFormats)
            && Objects.equals(this.hlsConfig, that.hlsConfig) && Objects.equals(this.mp4Config, that.mp4Config)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(ruleId, appId, obsAddr, recordFormats, hlsConfig, mp4Config, createTime, updateTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRecordRuleResponse {\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    obsAddr: ").append(toIndentedString(obsAddr)).append("\n");
        sb.append("    recordFormats: ").append(toIndentedString(recordFormats)).append("\n");
        sb.append("    hlsConfig: ").append(toIndentedString(hlsConfig)).append("\n");
        sb.append("    mp4Config: ").append(toIndentedString(mp4Config)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
