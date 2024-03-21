package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OTT频道通用消息
 */
public class ModifyOttChannelEncoderSettings {

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
    @JsonProperty(value = "encoder_settings")

    private List<ModifyOttChannelEncoderSettingsEncoderSettings> encoderSettings = null;

    public ModifyOttChannelEncoderSettings withDomain(String domain) {
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

    public ModifyOttChannelEncoderSettings withAppName(String appName) {
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

    public ModifyOttChannelEncoderSettings withId(String id) {
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

    public ModifyOttChannelEncoderSettings withEncoderSettings(
        List<ModifyOttChannelEncoderSettingsEncoderSettings> encoderSettings) {
        this.encoderSettings = encoderSettings;
        return this;
    }

    public ModifyOttChannelEncoderSettings addEncoderSettingsItem(
        ModifyOttChannelEncoderSettingsEncoderSettings encoderSettingsItem) {
        if (this.encoderSettings == null) {
            this.encoderSettings = new ArrayList<>();
        }
        this.encoderSettings.add(encoderSettingsItem);
        return this;
    }

    public ModifyOttChannelEncoderSettings withEncoderSettings(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyOttChannelEncoderSettings that = (ModifyOttChannelEncoderSettings) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.encoderSettings, that.encoderSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, id, encoderSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOttChannelEncoderSettings {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    encoderSettings: ").append(toIndentedString(encoderSettings)).append("\n");
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
