package com.huaweicloud.sdk.ges.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 存储metadata的消息信息的对象。
 */
public class CreateMetadataReqGesMetadata {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<CreateMetadataReqGesMetadataLabels> labels = null;

    public CreateMetadataReqGesMetadata withLabels(List<CreateMetadataReqGesMetadataLabels> labels) {
        this.labels = labels;
        return this;
    }

    public CreateMetadataReqGesMetadata addLabelsItem(CreateMetadataReqGesMetadataLabels labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateMetadataReqGesMetadata withLabels(Consumer<List<CreateMetadataReqGesMetadataLabels>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * label列表
     * @return labels
     */
    public List<CreateMetadataReqGesMetadataLabels> getLabels() {
        return labels;
    }

    public void setLabels(List<CreateMetadataReqGesMetadataLabels> labels) {
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
        CreateMetadataReqGesMetadata that = (CreateMetadataReqGesMetadata) obj;
        return Objects.equals(this.labels, that.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMetadataReqGesMetadata {\n");
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
