package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OTT频道修改入流消息体
 */
public class ModifyOttChannelInputReq {

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
    @JsonProperty(value = "input")

    private InputStreamInfo input;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encoder_settings_expand")

    private EncoderSettingsExpand encoderSettingsExpand;

    public ModifyOttChannelInputReq withDomain(String domain) {
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

    public ModifyOttChannelInputReq withAppName(String appName) {
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

    public ModifyOttChannelInputReq withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 频道ID。频道唯一标识，为必填项
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModifyOttChannelInputReq withInput(InputStreamInfo input) {
        this.input = input;
        return this;
    }

    public ModifyOttChannelInputReq withInput(Consumer<InputStreamInfo> inputSetter) {
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

    public ModifyOttChannelInputReq withEncoderSettingsExpand(EncoderSettingsExpand encoderSettingsExpand) {
        this.encoderSettingsExpand = encoderSettingsExpand;
        return this;
    }

    public ModifyOttChannelInputReq withEncoderSettingsExpand(
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
        ModifyOttChannelInputReq that = (ModifyOttChannelInputReq) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.input, that.input)
            && Objects.equals(this.encoderSettingsExpand, that.encoderSettingsExpand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, id, input, encoderSettingsExpand);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOttChannelInputReq {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
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
