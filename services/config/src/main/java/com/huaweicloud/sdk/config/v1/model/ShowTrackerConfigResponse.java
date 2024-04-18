package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTrackerConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel")

    private ChannelConfigBody channel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selector")

    private SelectorConfigBody selector;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_period_in_days")

    private Integer retentionPeriodInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    public ShowTrackerConfigResponse withChannel(ChannelConfigBody channel) {
        this.channel = channel;
        return this;
    }

    public ShowTrackerConfigResponse withChannel(Consumer<ChannelConfigBody> channelSetter) {
        if (this.channel == null) {
            this.channel = new ChannelConfigBody();
            channelSetter.accept(this.channel);
        }

        return this;
    }

    /**
     * Get channel
     * @return channel
     */
    public ChannelConfigBody getChannel() {
        return channel;
    }

    public void setChannel(ChannelConfigBody channel) {
        this.channel = channel;
    }

    public ShowTrackerConfigResponse withSelector(SelectorConfigBody selector) {
        this.selector = selector;
        return this;
    }

    public ShowTrackerConfigResponse withSelector(Consumer<SelectorConfigBody> selectorSetter) {
        if (this.selector == null) {
            this.selector = new SelectorConfigBody();
            selectorSetter.accept(this.selector);
        }

        return this;
    }

    /**
     * Get selector
     * @return selector
     */
    public SelectorConfigBody getSelector() {
        return selector;
    }

    public void setSelector(SelectorConfigBody selector) {
        this.selector = selector;
    }

    public ShowTrackerConfigResponse withRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
        return this;
    }

    /**
     * 存储历史信息的天数
     * @return retentionPeriodInDays
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    public void setRetentionPeriodInDays(Integer retentionPeriodInDays) {
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    public ShowTrackerConfigResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * IAM委托名称
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrackerConfigResponse that = (ShowTrackerConfigResponse) obj;
        return Objects.equals(this.channel, that.channel) && Objects.equals(this.selector, that.selector)
            && Objects.equals(this.retentionPeriodInDays, that.retentionPeriodInDays)
            && Objects.equals(this.agencyName, that.agencyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(channel, selector, retentionPeriodInDays, agencyName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrackerConfigResponse {\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
        sb.append("    retentionPeriodInDays: ").append(toIndentedString(retentionPeriodInDays)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
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
