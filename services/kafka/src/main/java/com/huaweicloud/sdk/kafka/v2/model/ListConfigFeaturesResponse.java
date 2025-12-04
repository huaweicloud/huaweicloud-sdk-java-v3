package com.huaweicloud.sdk.kafka.v2.model;

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
public class ListConfigFeaturesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "features")

    private List<ListConfigFeatures> features = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRecord")

    private Integer totalRecord;

    public ListConfigFeaturesResponse withFeatures(List<ListConfigFeatures> features) {
        this.features = features;
        return this;
    }

    public ListConfigFeaturesResponse addFeaturesItem(ListConfigFeatures featuresItem) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        this.features.add(featuresItem);
        return this;
    }

    public ListConfigFeaturesResponse withFeatures(Consumer<List<ListConfigFeatures>> featuresSetter) {
        if (this.features == null) {
            this.features = new ArrayList<>();
        }
        featuresSetter.accept(this.features);
        return this;
    }

    /**
     * **参数解释**： 特性列表。
     * @return features
     */
    public List<ListConfigFeatures> getFeatures() {
        return features;
    }

    public void setFeatures(List<ListConfigFeatures> features) {
        this.features = features;
    }

    public ListConfigFeaturesResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * **参数解释**： 总特性数量。  **取值范围**： 不涉及。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListConfigFeaturesResponse that = (ListConfigFeaturesResponse) obj;
        return Objects.equals(this.features, that.features) && Objects.equals(this.totalRecord, that.totalRecord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(features, totalRecord);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConfigFeaturesResponse {\n");
        sb.append("    features: ").append(toIndentedString(features)).append("\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
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
