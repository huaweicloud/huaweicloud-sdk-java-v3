package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OBS类型后端存储
 */
public class ObsDataRepository {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bucket")

    private String bucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private String endpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private ObsDataRepositoryPolicy policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    private ObsTargetAttributes attributes;

    public ObsDataRepository withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * OBS桶名称
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
     * OBS桶所在的区域域名
     * @return endpoint
     */
    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public ObsDataRepository withPolicy(ObsDataRepositoryPolicy policy) {
        this.policy = policy;
        return this;
    }

    public ObsDataRepository withPolicy(Consumer<ObsDataRepositoryPolicy> policySetter) {
        if (this.policy == null) {
            this.policy = new ObsDataRepositoryPolicy();
            policySetter.accept(this.policy);
        }

        return this;
    }

    /**
     * Get policy
     * @return policy
     */
    public ObsDataRepositoryPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(ObsDataRepositoryPolicy policy) {
        this.policy = policy;
    }

    public ObsDataRepository withAttributes(ObsTargetAttributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public ObsDataRepository withAttributes(Consumer<ObsTargetAttributes> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ObsTargetAttributes();
            attributesSetter.accept(this.attributes);
        }

        return this;
    }

    /**
     * Get attributes
     * @return attributes
     */
    public ObsTargetAttributes getAttributes() {
        return attributes;
    }

    public void setAttributes(ObsTargetAttributes attributes) {
        this.attributes = attributes;
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
        return Objects.equals(this.bucket, that.bucket) && Objects.equals(this.endpoint, that.endpoint)
            && Objects.equals(this.policy, that.policy) && Objects.equals(this.attributes, that.attributes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bucket, endpoint, policy, attributes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObsDataRepository {\n");
        sb.append("    bucket: ").append(toIndentedString(bucket)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
