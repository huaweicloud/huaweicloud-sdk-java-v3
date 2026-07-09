package com.huaweicloud.sdk.dbss.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLogRetentionCommonSettingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_retention")

    private CommonSettingsResponseLogRetention logRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_usage_limit")

    private Integer dataUsageLimit;

    public ShowLogRetentionCommonSettingsResponse withLogRetention(CommonSettingsResponseLogRetention logRetention) {
        this.logRetention = logRetention;
        return this;
    }

    public ShowLogRetentionCommonSettingsResponse withLogRetention(
        Consumer<CommonSettingsResponseLogRetention> logRetentionSetter) {
        if (this.logRetention == null) {
            this.logRetention = new CommonSettingsResponseLogRetention();
            logRetentionSetter.accept(this.logRetention);
        }

        return this;
    }

    /**
     * Get logRetention
     * @return logRetention
     */
    public CommonSettingsResponseLogRetention getLogRetention() {
        return logRetention;
    }

    public void setLogRetention(CommonSettingsResponseLogRetention logRetention) {
        this.logRetention = logRetention;
    }

    public ShowLogRetentionCommonSettingsResponse withDataUsageLimit(Integer dataUsageLimit) {
        this.dataUsageLimit = dataUsageLimit;
        return this;
    }

    /**
     * 日志存储磁盘占用上限
     * @return dataUsageLimit
     */
    public Integer getDataUsageLimit() {
        return dataUsageLimit;
    }

    public void setDataUsageLimit(Integer dataUsageLimit) {
        this.dataUsageLimit = dataUsageLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogRetentionCommonSettingsResponse that = (ShowLogRetentionCommonSettingsResponse) obj;
        return Objects.equals(this.logRetention, that.logRetention)
            && Objects.equals(this.dataUsageLimit, that.dataUsageLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logRetention, dataUsageLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogRetentionCommonSettingsResponse {\n");
        sb.append("    logRetention: ").append(toIndentedString(logRetention)).append("\n");
        sb.append("    dataUsageLimit: ").append(toIndentedString(dataUsageLimit)).append("\n");
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
