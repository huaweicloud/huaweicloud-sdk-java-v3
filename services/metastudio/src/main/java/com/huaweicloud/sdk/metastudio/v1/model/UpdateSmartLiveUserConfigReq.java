package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 租户直播配置修改请求
 */
public class UpdateSmartLiveUserConfigReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_exit_config")

    private LiveExitConfig liveExitConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_event_callback_config")

    private LiveEventCallBackConfig liveEventCallbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_notify_config")

    private LiveNotifyConfigReq liveNotifyConfig;

    public UpdateSmartLiveUserConfigReq withLiveExitConfig(LiveExitConfig liveExitConfig) {
        this.liveExitConfig = liveExitConfig;
        return this;
    }

    public UpdateSmartLiveUserConfigReq withLiveExitConfig(Consumer<LiveExitConfig> liveExitConfigSetter) {
        if (this.liveExitConfig == null) {
            this.liveExitConfig = new LiveExitConfig();
            liveExitConfigSetter.accept(this.liveExitConfig);
        }

        return this;
    }

    /**
     * Get liveExitConfig
     * @return liveExitConfig
     */
    public LiveExitConfig getLiveExitConfig() {
        return liveExitConfig;
    }

    public void setLiveExitConfig(LiveExitConfig liveExitConfig) {
        this.liveExitConfig = liveExitConfig;
    }

    public UpdateSmartLiveUserConfigReq withLiveEventCallbackConfig(LiveEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
        return this;
    }

    public UpdateSmartLiveUserConfigReq withLiveEventCallbackConfig(
        Consumer<LiveEventCallBackConfig> liveEventCallbackConfigSetter) {
        if (this.liveEventCallbackConfig == null) {
            this.liveEventCallbackConfig = new LiveEventCallBackConfig();
            liveEventCallbackConfigSetter.accept(this.liveEventCallbackConfig);
        }

        return this;
    }

    /**
     * Get liveEventCallbackConfig
     * @return liveEventCallbackConfig
     */
    public LiveEventCallBackConfig getLiveEventCallbackConfig() {
        return liveEventCallbackConfig;
    }

    public void setLiveEventCallbackConfig(LiveEventCallBackConfig liveEventCallbackConfig) {
        this.liveEventCallbackConfig = liveEventCallbackConfig;
    }

    public UpdateSmartLiveUserConfigReq withLiveNotifyConfig(LiveNotifyConfigReq liveNotifyConfig) {
        this.liveNotifyConfig = liveNotifyConfig;
        return this;
    }

    public UpdateSmartLiveUserConfigReq withLiveNotifyConfig(Consumer<LiveNotifyConfigReq> liveNotifyConfigSetter) {
        if (this.liveNotifyConfig == null) {
            this.liveNotifyConfig = new LiveNotifyConfigReq();
            liveNotifyConfigSetter.accept(this.liveNotifyConfig);
        }

        return this;
    }

    /**
     * Get liveNotifyConfig
     * @return liveNotifyConfig
     */
    public LiveNotifyConfigReq getLiveNotifyConfig() {
        return liveNotifyConfig;
    }

    public void setLiveNotifyConfig(LiveNotifyConfigReq liveNotifyConfig) {
        this.liveNotifyConfig = liveNotifyConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSmartLiveUserConfigReq that = (UpdateSmartLiveUserConfigReq) obj;
        return Objects.equals(this.liveExitConfig, that.liveExitConfig)
            && Objects.equals(this.liveEventCallbackConfig, that.liveEventCallbackConfig)
            && Objects.equals(this.liveNotifyConfig, that.liveNotifyConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(liveExitConfig, liveEventCallbackConfig, liveNotifyConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSmartLiveUserConfigReq {\n");
        sb.append("    liveExitConfig: ").append(toIndentedString(liveExitConfig)).append("\n");
        sb.append("    liveEventCallbackConfig: ").append(toIndentedString(liveEventCallbackConfig)).append("\n");
        sb.append("    liveNotifyConfig: ").append(toIndentedString(liveNotifyConfig)).append("\n");
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
