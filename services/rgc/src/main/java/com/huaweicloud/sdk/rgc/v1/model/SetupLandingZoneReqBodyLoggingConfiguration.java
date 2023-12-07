package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 日志桶设置信息。
 */
public class SetupLandingZoneReqBodyLoggingConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_bucket")

    private LoggingBucketBaseline loggingBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_logging_bucket")

    private AccessLoggingBucketBaseline accessLoggingBucket;

    public SetupLandingZoneReqBodyLoggingConfiguration withLoggingBucket(LoggingBucketBaseline loggingBucket) {
        this.loggingBucket = loggingBucket;
        return this;
    }

    public SetupLandingZoneReqBodyLoggingConfiguration withLoggingBucket(
        Consumer<LoggingBucketBaseline> loggingBucketSetter) {
        if (this.loggingBucket == null) {
            this.loggingBucket = new LoggingBucketBaseline();
            loggingBucketSetter.accept(this.loggingBucket);
        }

        return this;
    }

    /**
     * Get loggingBucket
     * @return loggingBucket
     */
    public LoggingBucketBaseline getLoggingBucket() {
        return loggingBucket;
    }

    public void setLoggingBucket(LoggingBucketBaseline loggingBucket) {
        this.loggingBucket = loggingBucket;
    }

    public SetupLandingZoneReqBodyLoggingConfiguration withAccessLoggingBucket(
        AccessLoggingBucketBaseline accessLoggingBucket) {
        this.accessLoggingBucket = accessLoggingBucket;
        return this;
    }

    public SetupLandingZoneReqBodyLoggingConfiguration withAccessLoggingBucket(
        Consumer<AccessLoggingBucketBaseline> accessLoggingBucketSetter) {
        if (this.accessLoggingBucket == null) {
            this.accessLoggingBucket = new AccessLoggingBucketBaseline();
            accessLoggingBucketSetter.accept(this.accessLoggingBucket);
        }

        return this;
    }

    /**
     * Get accessLoggingBucket
     * @return accessLoggingBucket
     */
    public AccessLoggingBucketBaseline getAccessLoggingBucket() {
        return accessLoggingBucket;
    }

    public void setAccessLoggingBucket(AccessLoggingBucketBaseline accessLoggingBucket) {
        this.accessLoggingBucket = accessLoggingBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetupLandingZoneReqBodyLoggingConfiguration that = (SetupLandingZoneReqBodyLoggingConfiguration) obj;
        return Objects.equals(this.loggingBucket, that.loggingBucket)
            && Objects.equals(this.accessLoggingBucket, that.accessLoggingBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggingBucket, accessLoggingBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetupLandingZoneReqBodyLoggingConfiguration {\n");
        sb.append("    loggingBucket: ").append(toIndentedString(loggingBucket)).append("\n");
        sb.append("    accessLoggingBucket: ").append(toIndentedString(accessLoggingBucket)).append("\n");
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
