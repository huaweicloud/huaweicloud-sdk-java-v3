package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络资源metadata信息创建请求体。
 */
public class NetworkMetadataCreation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private NetworkMetadataLabels labels;

    public NetworkMetadataCreation withLabels(NetworkMetadataLabels labels) {
        this.labels = labels;
        return this;
    }

    public NetworkMetadataCreation withLabels(Consumer<NetworkMetadataLabels> labelsSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkMetadataCreation that = (NetworkMetadataCreation) obj;
        return Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkMetadataCreation {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
