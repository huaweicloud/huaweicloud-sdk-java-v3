package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RegisterVoiceReq
 */
public class RegisterVoiceReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private RegisterVoiceReqConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private String data;

    public RegisterVoiceReq withConfig(RegisterVoiceReqConfig config) {
        this.config = config;
        return this;
    }

    public RegisterVoiceReq withConfig(Consumer<RegisterVoiceReqConfig> configSetter) {
        if (this.config == null) {
            this.config = new RegisterVoiceReqConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /**
     * Get config
     * @return config
     */
    public RegisterVoiceReqConfig getConfig() {
        return config;
    }

    public void setConfig(RegisterVoiceReqConfig config) {
        this.config = config;
    }

    public RegisterVoiceReq withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * 录音数据，使用base64编码，大小不超过6MB。支持wav、mp3、m4a格式，采样率不小于16kHz，时长在5-25秒，支持单、双通道。
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterVoiceReq that = (RegisterVoiceReq) obj;
        return Objects.equals(this.config, that.config) && Objects.equals(this.data, that.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterVoiceReq {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
