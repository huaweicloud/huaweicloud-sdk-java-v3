package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListLabelResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<LabelRsp> labels = null;

    public ListLabelResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 标签列表个数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListLabelResponse withLabels(List<LabelRsp> labels) {
        this.labels = labels;
        return this;
    }

    public ListLabelResponse addLabelsItem(LabelRsp labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ListLabelResponse withLabels(Consumer<List<LabelRsp>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 标签详情
     * @return labels
     */
    public List<LabelRsp> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelRsp> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLabelResponse listLabelResponse = (ListLabelResponse) o;
        return Objects.equals(this.count, listLabelResponse.count)
            && Objects.equals(this.labels, listLabelResponse.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
