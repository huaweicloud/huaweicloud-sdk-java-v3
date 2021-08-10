package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private JobSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private JobStatus status;

    public Job withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /** API类型，固定值“Job”，该值不可修改。
     * 
     * @return kind */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Job withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** API版本，固定值“v3”，该值不可修改。
     * 
     * @return apiVersion */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Job withMetadata(JobMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Job withMetadata(Consumer<JobMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /** Get metadata
     * 
     * @return metadata */
    public JobMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(JobMetadata metadata) {
        this.metadata = metadata;
    }

    public Job withSpec(JobSpec spec) {
        this.spec = spec;
        return this;
    }

    public Job withSpec(Consumer<JobSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new JobSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /** Get spec
     * 
     * @return spec */
    public JobSpec getSpec() {
        return spec;
    }

    public void setSpec(JobSpec spec) {
        this.spec = spec;
    }

    public Job withStatus(JobStatus status) {
        this.status = status;
        return this;
    }

    public Job withStatus(Consumer<JobStatus> statusSetter) {
        if (this.status == null) {
            this.status = new JobStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /** Get status
     * 
     * @return status */
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Job job = (Job) o;
        return Objects.equals(this.kind, job.kind) && Objects.equals(this.apiVersion, job.apiVersion)
            && Objects.equals(this.metadata, job.metadata) && Objects.equals(this.spec, job.spec)
            && Objects.equals(this.status, job.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Job {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
