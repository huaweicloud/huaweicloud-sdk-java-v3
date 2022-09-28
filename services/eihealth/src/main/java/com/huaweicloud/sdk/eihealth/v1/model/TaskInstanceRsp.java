package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskInstanceRsp
 */
public class TaskInstanceRsp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private TaskInstanceStatusRsp status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private TaskInstanceMetadataRsp metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private TaskInstanceSpecRsp spec;

    public TaskInstanceRsp withStatus(TaskInstanceStatusRsp status) {
        this.status = status;
        return this;
    }

    public TaskInstanceRsp withStatus(Consumer<TaskInstanceStatusRsp> statusSetter) {
        if (this.status == null) {
            this.status = new TaskInstanceStatusRsp();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public TaskInstanceStatusRsp getStatus() {
        return status;
    }

    public void setStatus(TaskInstanceStatusRsp status) {
        this.status = status;
    }

    public TaskInstanceRsp withMetadata(TaskInstanceMetadataRsp metadata) {
        this.metadata = metadata;
        return this;
    }

    public TaskInstanceRsp withMetadata(Consumer<TaskInstanceMetadataRsp> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new TaskInstanceMetadataRsp();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public TaskInstanceMetadataRsp getMetadata() {
        return metadata;
    }

    public void setMetadata(TaskInstanceMetadataRsp metadata) {
        this.metadata = metadata;
    }

    public TaskInstanceRsp withSpec(TaskInstanceSpecRsp spec) {
        this.spec = spec;
        return this;
    }

    public TaskInstanceRsp withSpec(Consumer<TaskInstanceSpecRsp> specSetter) {
        if (this.spec == null) {
            this.spec = new TaskInstanceSpecRsp();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public TaskInstanceSpecRsp getSpec() {
        return spec;
    }

    public void setSpec(TaskInstanceSpecRsp spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TaskInstanceRsp taskInstanceRsp = (TaskInstanceRsp) o;
        return Objects.equals(this.status, taskInstanceRsp.status)
            && Objects.equals(this.metadata, taskInstanceRsp.metadata)
            && Objects.equals(this.spec, taskInstanceRsp.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskInstanceRsp {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
