package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * NetworkMetadata
 */
public class NetworkMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creationTimestamp")

    private String creationTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private NetworkMetadataLabels labels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private NetworkMetadataAnnotations annotations;

    public NetworkMetadata withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：网络资源的ID。 **取值范围**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NetworkMetadata withCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
        return this;
    }

    /**
     * **参数解释**：网络的创建时间。例如\"2025-11-01T03:49:41Z\"。 **取值范围**：不涉及。
     * @return creationTimestamp
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    public void setCreationTimestamp(String creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    public NetworkMetadata withLabels(NetworkMetadataLabels labels) {
        this.labels = labels;
        return this;
    }

    public NetworkMetadata withLabels(Consumer<NetworkMetadataLabels> labelsSetter) {
        if (this.labels == null) {
            this.labels = new NetworkMetadataLabels();
            labelsSetter.accept(this.labels);
        }

        return this;
    }

    /**
     * Get labels
     * @return labels
     */
    public NetworkMetadataLabels getLabels() {
        return labels;
    }

    public void setLabels(NetworkMetadataLabels labels) {
        this.labels = labels;
    }

    public NetworkMetadata withAnnotations(NetworkMetadataAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public NetworkMetadata withAnnotations(Consumer<NetworkMetadataAnnotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new NetworkMetadataAnnotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public NetworkMetadataAnnotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(NetworkMetadataAnnotations annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkMetadata that = (NetworkMetadata) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.creationTimestamp, that.creationTimestamp)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.annotations, that.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationTimestamp, labels, annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkMetadata {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    creationTimestamp: ").append(toIndentedString(creationTimestamp)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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
