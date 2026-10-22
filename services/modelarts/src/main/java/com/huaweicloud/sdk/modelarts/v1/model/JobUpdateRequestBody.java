package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练作业的描述、事件通知、作业优先级、允许被抢占等信息。
 */
public class JobUpdateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private JobUpdateRequestBodySpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private JobEndpointsReq endpoints;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobUpdateRequestBodyMetadata metadata;

    public JobUpdateRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 对训练作业的描述，默认为“NULL”，字符串的长度限制为[0, 256]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobUpdateRequestBody withSpec(JobUpdateRequestBodySpec spec) {
        this.spec = spec;
        return this;
    }

    public JobUpdateRequestBody withSpec(Consumer<JobUpdateRequestBodySpec> specSetter) {
        if (this.spec == null) {
            this.spec = new JobUpdateRequestBodySpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public JobUpdateRequestBodySpec getSpec() {
        return spec;
    }

    public void setSpec(JobUpdateRequestBodySpec spec) {
        this.spec = spec;
    }

    public JobUpdateRequestBody withEndpoints(JobEndpointsReq endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public JobUpdateRequestBody withEndpoints(Consumer<JobEndpointsReq> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new JobEndpointsReq();
            endpointsSetter.accept(this.endpoints);
        }

        return this;
    }

    /**
     * Get endpoints
     * @return endpoints
     */
    public JobEndpointsReq getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(JobEndpointsReq endpoints) {
        this.endpoints = endpoints;
    }

    public JobUpdateRequestBody withMetadata(JobUpdateRequestBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public JobUpdateRequestBody withMetadata(Consumer<JobUpdateRequestBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobUpdateRequestBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public JobUpdateRequestBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(JobUpdateRequestBodyMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobUpdateRequestBody that = (JobUpdateRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.endpoints, that.endpoints) && Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, spec, endpoints, metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobUpdateRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
