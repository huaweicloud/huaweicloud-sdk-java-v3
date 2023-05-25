package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 软件包的其他属性，只有在选择对象存储obs的时候才需要添加。
 */
public class ObsProperties {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    public ObsProperties withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * obs的终端地址，比如：https://obs.region_name.external_domain_name.com。
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ObsProperties withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * 软件包在obs的桶名。
     * @return bucket
     */
    public String getBucket() {
        return bucket;
    }

    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    public ObsProperties withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * obs桶中的对象，一般是软件包名，有文件夹的话要加上文件夹的路径。比如test.jar或者demo/test.jar。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ObsProperties obsProperties = (ObsProperties) o;
        return Objects.equals(this.endpoint, obsProperties.endpoint)
            && Objects.equals(this.bucket, obsProperties.bucket) && Objects.equals(this.key, obsProperties.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint, bucket, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsProperties {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
