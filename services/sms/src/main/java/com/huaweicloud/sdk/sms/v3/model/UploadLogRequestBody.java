package com.huaweicloud.sdk.sms.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 上传日志请求体
 */
public class UploadLogRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_bucket")

    private String logBucket;

    public UploadLogRequestBody withLogBucket(String logBucket) {
        this.logBucket = logBucket;
        return this;
    }

    /**
     * 指定桶名称
     * @return logBucket
     */
    public String getLogBucket() {
        return logBucket;
    }

    public void setLogBucket(String logBucket) {
        this.logBucket = logBucket;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UploadLogRequestBody that = (UploadLogRequestBody) obj;
        return Objects.equals(this.logBucket, that.logBucket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logBucket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadLogRequestBody {\n");
        sb.append("    logBucket: ").append(toIndentedString(logBucket)).append("\n");
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
