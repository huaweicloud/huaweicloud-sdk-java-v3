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
 * OTT频道创建消息体
 */
public class CreateOttChannelInfoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 频道状态 - ON：频道下发成功后，自动启动拉流、转码、录制等功能 - OFF：仅保存频道信息，不启动频道
     */
    public static final class StateEnum {

        /**
         * Enum ON for value: "ON"
         */
        public static final StateEnum ON = new StateEnum("ON");

        /**
         * Enum OFF for value: "OFF"
         */
        public static final StateEnum OFF = new StateEnum("OFF");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("ON", ON);
            map.put("OFF", OFF);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "input")

    private InputStreamInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoder_settings")

    private List<ModifyOttChannelEncoderSettingsEncoderSettings> encoderSettings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_settings")

    private CreateOttChannelInfoReqRecordSettings recordSettings;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointItem> endpoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoder_settings_expand")

    private EncoderSettingsExpand encoderSettingsExpand;

    public CreateOttChannelInfoReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 频道推流域名
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CreateOttChannelInfoReq withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 组名或应用名
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public CreateOttChannelInfoReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 频道ID。频道唯一标识，为必填项。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateOttChannelInfoReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 频道名。可选配置
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateOttChannelInfoReq withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 频道状态 - ON：频道下发成功后，自动启动拉流、转码、录制等功能 - OFF：仅保存频道信息，不启动频道
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public CreateOttChannelInfoReq withInput(InputStreamInfo input) {
        this.input = input;
        return this;
    }

    public CreateOttChannelInfoReq withInput(Consumer<InputStreamInfo> inputSetter) {
        if (this.input == null) {
            this.input = new InputStreamInfo();
            inputSetter.accept(this.input);
        }

        return this;
    }

    /**
     * Get input
     * @return input
     */
    public InputStreamInfo getInput() {
        return input;
    }

    public void setInput(InputStreamInfo input) {
        this.input = input;
    }

    public CreateOttChannelInfoReq withEncoderSettings(
        List<ModifyOttChannelEncoderSettingsEncoderSettings> encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    public CreateOttChannelInfoReq addEncoderSettingsItem(
        ModifyOttChannelEncoderSettingsEncoderSettings encoderSettingsItem) {
        if (this.encoderSettings == null) {
            this.encoderSettings = new ArrayList<>();
        }
        this.encoderSettings.add(encoderSettingsItem);
        return this;
    }

    public CreateOttChannelInfoReq withEncoderSettings(
        Consumer<List<ModifyOttChannelEncoderSettingsEncoderSettings>> encoderSettingsSetter) {
        if (this.encoderSettings == null) {
            this.encoderSettings = new ArrayList<>();
        }
        encoderSettingsSetter.accept(this.encoderSettings);
        return this;
    }

    /**
     * 转码模板配置
     * @return encoderSettings
     */
    public List<ModifyOttChannelEncoderSettingsEncoderSettings> getEncoderSettings() {
        return encoderSettings;
    }

    public void setEncoderSettings(List<ModifyOttChannelEncoderSettingsEncoderSettings> encoderSettings) {
        this.encoderSettings = encoderSettings;
    }

    public CreateOttChannelInfoReq withRecordSettings(CreateOttChannelInfoReqRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
        return this;
    }

    public CreateOttChannelInfoReq withRecordSettings(
        Consumer<CreateOttChannelInfoReqRecordSettings> recordSettingsSetter) {
        if (this.recordSettings == null) {
            this.recordSettings = new CreateOttChannelInfoReqRecordSettings();
            recordSettingsSetter.accept(this.recordSettings);
        }

        return this;
    }

    /**
     * Get recordSettings
     * @return recordSettings
     */
    public CreateOttChannelInfoReqRecordSettings getRecordSettings() {
        return recordSettings;
    }

    public void setRecordSettings(CreateOttChannelInfoReqRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
    }

    public CreateOttChannelInfoReq withEndpoints(List<EndpointItem> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public CreateOttChannelInfoReq addEndpointsItem(EndpointItem endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public CreateOttChannelInfoReq withEndpoints(Consumer<List<EndpointItem>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 频道出流信息
     * @return endpoints
     */
    public List<EndpointItem> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointItem> endpoints) {
        this.endpoints = endpoints;
    }

    public CreateOttChannelInfoReq withEncoderSettingsExpand(EncoderSettingsExpand encoderSettingsExpand) {
        this.encoderSettingsExpand = encoderSettingsExpand;
        return this;
    }

    public CreateOttChannelInfoReq withEncoderSettingsExpand(
        Consumer<EncoderSettingsExpand> encoderSettingsExpandSetter) {
        if (this.encoderSettingsExpand == null) {
            this.encoderSettingsExpand = new EncoderSettingsExpand();
            encoderSettingsExpandSetter.accept(this.encoderSettingsExpand);
        }

        return this;
    }

    /**
     * Get encoderSettingsExpand
     * @return encoderSettingsExpand
     */
    public EncoderSettingsExpand getEncoderSettingsExpand() {
        return encoderSettingsExpand;
    }

    public void setEncoderSettingsExpand(EncoderSettingsExpand encoderSettingsExpand) {
        this.encoderSettingsExpand = encoderSettingsExpand;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateOttChannelInfoReq that = (CreateOttChannelInfoReq) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.state, that.state) && Objects.equals(this.input, that.input)
            && Objects.equals(this.encoderSettings, that.encoderSettings)
            && Objects.equals(this.recordSettings, that.recordSettings)
            && Objects.equals(this.endpoints, that.endpoints)
            && Objects.equals(this.encoderSettingsExpand, that.encoderSettingsExpand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain,
            appName,
            id,
            name,
            state,
            input,
            encoderSettings,
            recordSettings,
            endpoints,
            encoderSettingsExpand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateOttChannelInfoReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    encoderSettings: ").append(toIndentedString(encoderSettings)).append("\n");
        sb.append("    recordSettings: ").append(toIndentedString(recordSettings)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    encoderSettingsExpand: ").append(toIndentedString(encoderSettingsExpand)).append("\n");
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
