package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TriggerConfig
 */
public class TriggerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_settings")

    private TriggerSetting triggerSettings;

    public TriggerConfig withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 触发类型，镜像签名、老化规则只支持manual(手动)、scheduled(定时+手动)；同步策略支持manual(手动)、scheduled(定时+手动)、event_based(事件触发+手动)
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TriggerConfig withTriggerSettings(TriggerSetting triggerSettings) {
        this.triggerSettings = triggerSettings;
        return this;
    }

    public TriggerConfig withTriggerSettings(Consumer<TriggerSetting> triggerSettingsSetter) {
        if (this.triggerSettings == null) {
            this.triggerSettings = new TriggerSetting();
            triggerSettingsSetter.accept(this.triggerSettings);
        }

        return this;
    }

    /**
     * Get triggerSettings
     * @return triggerSettings
     */
    public TriggerSetting getTriggerSettings() {
        return triggerSettings;
    }

    public void setTriggerSettings(TriggerSetting triggerSettings) {
        this.triggerSettings = triggerSettings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerConfig that = (TriggerConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.triggerSettings, that.triggerSettings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, triggerSettings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    triggerSettings: ").append(toIndentedString(triggerSettings)).append("\n");
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
