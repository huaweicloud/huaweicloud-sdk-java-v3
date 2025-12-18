package com.huaweicloud.sdk.cce.v3.model;

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
public class ShowAutopilotClusterConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ttl_in_days")

    private Integer ttlInDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<AutopilotClusterLogConfigLogConfigs> logConfigs = null;

    public ShowAutopilotClusterConfigResponse withTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
        return this;
    }

    /**
     * 存储时长
     * @return ttlInDays
     */
    public Integer getTtlInDays() {
        return ttlInDays;
    }

    public void setTtlInDays(Integer ttlInDays) {
        this.ttlInDays = ttlInDays;
    }

    public ShowAutopilotClusterConfigResponse withLogConfigs(List<AutopilotClusterLogConfigLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ShowAutopilotClusterConfigResponse addLogConfigsItem(AutopilotClusterLogConfigLogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ShowAutopilotClusterConfigResponse withLogConfigs(
        Consumer<List<AutopilotClusterLogConfigLogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 日志配置项
     * @return logConfigs
     */
    public List<AutopilotClusterLogConfigLogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<AutopilotClusterLogConfigLogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutopilotClusterConfigResponse that = (ShowAutopilotClusterConfigResponse) obj;
        return Objects.equals(this.ttlInDays, that.ttlInDays) && Objects.equals(this.logConfigs, that.logConfigs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ttlInDays, logConfigs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutopilotClusterConfigResponse {\n");
        sb.append("    ttlInDays: ").append(toIndentedString(ttlInDays)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
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
