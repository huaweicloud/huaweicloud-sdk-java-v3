package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowGetLogSettingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logConfiguration")

    private LogConfiguration logConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "realTimeLogCollectRecord")

    private RealTimeLogCollect realTimeLogCollectRecord;

    public ShowGetLogSettingResponse withLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }

    public ShowGetLogSettingResponse withLogConfiguration(Consumer<LogConfiguration> logConfigurationSetter) {
        if (this.logConfiguration == null) {
            this.logConfiguration = new LogConfiguration();
            logConfigurationSetter.accept(this.logConfiguration);
        }

        return this;
    }

    /**
     * Get logConfiguration
     * @return logConfiguration
     */
    public LogConfiguration getLogConfiguration() {
        return logConfiguration;
    }

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    public ShowGetLogSettingResponse withRealTimeLogCollectRecord(RealTimeLogCollect realTimeLogCollectRecord) {
        this.realTimeLogCollectRecord = realTimeLogCollectRecord;
        return this;
    }

    public ShowGetLogSettingResponse withRealTimeLogCollectRecord(
        Consumer<RealTimeLogCollect> realTimeLogCollectRecordSetter) {
        if (this.realTimeLogCollectRecord == null) {
            this.realTimeLogCollectRecord = new RealTimeLogCollect();
            realTimeLogCollectRecordSetter.accept(this.realTimeLogCollectRecord);
        }

        return this;
    }

    /**
     * Get realTimeLogCollectRecord
     * @return realTimeLogCollectRecord
     */
    public RealTimeLogCollect getRealTimeLogCollectRecord() {
        return realTimeLogCollectRecord;
    }

    public void setRealTimeLogCollectRecord(RealTimeLogCollect realTimeLogCollectRecord) {
        this.realTimeLogCollectRecord = realTimeLogCollectRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGetLogSettingResponse that = (ShowGetLogSettingResponse) obj;
        return Objects.equals(this.logConfiguration, that.logConfiguration)
            && Objects.equals(this.realTimeLogCollectRecord, that.realTimeLogCollectRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfiguration, realTimeLogCollectRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGetLogSettingResponse {\n");
        sb.append("    logConfiguration: ").append(toIndentedString(logConfiguration)).append("\n");
        sb.append("    realTimeLogCollectRecord: ").append(toIndentedString(realTimeLogCollectRecord)).append("\n");
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
