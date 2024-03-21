package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OTT频道修改录制消息体
 */
public class ModifyOttChannelRecordSettings {

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
    @JsonProperty(value = "record_settings")

    private ModifyOttChannelRecordSettingsRecordSettings recordSettings;

    public ModifyOttChannelRecordSettings withDomain(String domain) {
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

    public ModifyOttChannelRecordSettings withAppName(String appName) {
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

    public ModifyOttChannelRecordSettings withId(String id) {
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

    public ModifyOttChannelRecordSettings withRecordSettings(
        ModifyOttChannelRecordSettingsRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
        return this;
    }

    public ModifyOttChannelRecordSettings withRecordSettings(
        Consumer<ModifyOttChannelRecordSettingsRecordSettings> recordSettingsSetter) {
        if (this.recordSettings == null) {
            this.recordSettings = new ModifyOttChannelRecordSettingsRecordSettings();
            recordSettingsSetter.accept(this.recordSettings);
        }

        return this;
    }

    /**
     * Get recordSettings
     * @return recordSettings
     */
    public ModifyOttChannelRecordSettingsRecordSettings getRecordSettings() {
        return recordSettings;
    }

    public void setRecordSettings(ModifyOttChannelRecordSettingsRecordSettings recordSettings) {
        this.recordSettings = recordSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyOttChannelRecordSettings that = (ModifyOttChannelRecordSettings) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.id, that.id) && Objects.equals(this.recordSettings, that.recordSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, appName, id, recordSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyOttChannelRecordSettings {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    recordSettings: ").append(toIndentedString(recordSettings)).append("\n");
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
