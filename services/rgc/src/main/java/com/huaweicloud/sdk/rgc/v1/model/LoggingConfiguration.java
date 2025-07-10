package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Landing Zone日志配置。
 */
public class LoggingConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_bucket_name")

    private String loggingBucketName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_logging_bucket")

    private AccessLoggingBucketBaseline accessLoggingBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logging_bucket")

    private LoggingBucketBaseline loggingBucket;

    public LoggingConfiguration withLoggingBucketName(String loggingBucketName) {
        this.loggingBucketName = loggingBucketName;
        return this;
    }

    /**
     * 日志桶名称。
     * @return loggingBucketName
     */
    public String getLoggingBucketName() {
        return loggingBucketName;
    }

    public void setLoggingBucketName(String loggingBucketName) {
        this.loggingBucketName = loggingBucketName;
    }

    public LoggingConfiguration withAccessLoggingBucket(AccessLoggingBucketBaseline accessLoggingBucket) {
        this.accessLoggingBucket = accessLoggingBucket;
        return this;
    }

    public LoggingConfiguration withAccessLoggingBucket(
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

    public LoggingConfiguration withLoggingBucket(LoggingBucketBaseline loggingBucket) {
        this.loggingBucket = loggingBucket;
        return this;
    }

    public LoggingConfiguration withLoggingBucket(Consumer<LoggingBucketBaseline> loggingBucketSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoggingConfiguration that = (LoggingConfiguration) obj;
        return Objects.equals(this.loggingBucketName, that.loggingBucketName)
            && Objects.equals(this.accessLoggingBucket, that.accessLoggingBucket)
            && Objects.equals(this.loggingBucket, that.loggingBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loggingBucketName, accessLoggingBucket, loggingBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoggingConfiguration {\n");
        sb.append("    loggingBucketName: ").append(toIndentedString(loggingBucketName)).append("\n");
        sb.append("    accessLoggingBucket: ").append(toIndentedString(accessLoggingBucket)).append("\n");
        sb.append("    loggingBucket: ").append(toIndentedString(loggingBucket)).append("\n");
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
