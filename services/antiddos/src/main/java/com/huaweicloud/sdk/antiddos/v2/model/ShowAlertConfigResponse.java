package com.huaweicloud.sdk.antiddos.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAlertConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_urn")

    private String topicUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warn_config")

    private AlertConfigRespWarnConfig warnConfig;

    public ShowAlertConfigResponse withTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
        return this;
    }

    /**
     * 告警群组的唯一标识
     * @return topicUrn
     */
    public String getTopicUrn() {
        return topicUrn;
    }

    public void setTopicUrn(String topicUrn) {
        this.topicUrn = topicUrn;
    }

    public ShowAlertConfigResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 告警群组描述
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShowAlertConfigResponse withWarnConfig(AlertConfigRespWarnConfig warnConfig) {
        this.warnConfig = warnConfig;
        return this;
    }

    public ShowAlertConfigResponse withWarnConfig(Consumer<AlertConfigRespWarnConfig> warnConfigSetter) {
        if (this.warnConfig == null) {
            this.warnConfig = new AlertConfigRespWarnConfig();
            warnConfigSetter.accept(this.warnConfig);
        }

        return this;
    }

    /**
     * Get warnConfig
     * @return warnConfig
     */
    public AlertConfigRespWarnConfig getWarnConfig() {
        return warnConfig;
    }

    public void setWarnConfig(AlertConfigRespWarnConfig warnConfig) {
        this.warnConfig = warnConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAlertConfigResponse that = (ShowAlertConfigResponse) obj;
        return Objects.equals(this.topicUrn, that.topicUrn) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.warnConfig, that.warnConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUrn, displayName, warnConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAlertConfigResponse {\n");
        sb.append("    topicUrn: ").append(toIndentedString(topicUrn)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    warnConfig: ").append(toIndentedString(warnConfig)).append("\n");
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
