package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDelayConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay_config")

    private List<DelayConfig> delayConfig = null;

    public ListDelayConfigResponse withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 播放域名
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public ListDelayConfigResponse withDelayConfig(List<DelayConfig> delayConfig) {
        this.delayConfig = delayConfig;
        return this;
    }

    public ListDelayConfigResponse addDelayConfigItem(DelayConfig delayConfigItem) {
        if (this.delayConfig == null) {
            this.delayConfig = new ArrayList<>();
        }
        this.delayConfig.add(delayConfigItem);
        return this;
    }

    public ListDelayConfigResponse withDelayConfig(Consumer<List<DelayConfig>> delayConfigSetter) {
        if (this.delayConfig == null) {
            this.delayConfig = new ArrayList<>();
        }
        delayConfigSetter.accept(this.delayConfig);
        return this;
    }

    /**
     * 直播延时配置
     * @return delayConfig
     */
    public List<DelayConfig> getDelayConfig() {
        return delayConfig;
    }

    public void setDelayConfig(List<DelayConfig> delayConfig) {
        this.delayConfig = delayConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDelayConfigResponse that = (ListDelayConfigResponse) obj;
        return Objects.equals(this.playDomain, that.playDomain) && Objects.equals(this.delayConfig, that.delayConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain, delayConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDelayConfigResponse {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    delayConfig: ").append(toIndentedString(delayConfig)).append("\n");
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
