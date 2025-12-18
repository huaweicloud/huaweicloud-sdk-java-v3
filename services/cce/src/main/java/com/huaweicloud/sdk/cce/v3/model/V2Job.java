package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * V2Job
 */
public class V2Job {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private V2JobTypeObject metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private V2JobSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private V2JobStatus status;

    public V2Job withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： Job 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public V2Job withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： v2 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public V2Job withMetadata(V2JobTypeObject metadata) {
        this.metadata = metadata;
        return this;
    }

    public V2Job withMetadata(Consumer<V2JobTypeObject> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new V2JobTypeObject();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public V2JobTypeObject getMetadata() {
        return metadata;
    }

    public void setMetadata(V2JobTypeObject metadata) {
        this.metadata = metadata;
    }

    public V2Job withSpec(V2JobSpec spec) {
        this.spec = spec;
        return this;
    }

    public V2Job withSpec(Consumer<V2JobSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new V2JobSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public V2JobSpec getSpec() {
        return spec;
    }

    public void setSpec(V2JobSpec spec) {
        this.spec = spec;
    }

    public V2Job withStatus(V2JobStatus status) {
        this.status = status;
        return this;
    }

    public V2Job withStatus(Consumer<V2JobStatus> statusSetter) {
        if (this.status == null) {
            this.status = new V2JobStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public V2JobStatus getStatus() {
        return status;
    }

    public void setStatus(V2JobStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        V2Job that = (V2Job) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class V2Job {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
