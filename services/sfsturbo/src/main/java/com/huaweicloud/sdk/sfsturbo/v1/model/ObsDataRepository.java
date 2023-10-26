package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 文件系统 obs 数据存储库
 */
public class ObsDataRepository {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    public ObsDataRepository withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * obs 桶名称
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ObsDataRepository withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * obs 桶 endpoint
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObsDataRepository that = (ObsDataRepository) obj;
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.endpoint, that.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsDataRepository {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
