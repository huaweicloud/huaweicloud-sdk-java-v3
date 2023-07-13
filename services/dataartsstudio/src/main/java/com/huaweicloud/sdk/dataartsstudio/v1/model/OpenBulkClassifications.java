package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenBulkClassifications
 */
public class OpenBulkClassifications {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "guids")

    private List<String> guids = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "classification")

    private OpenClassification classification;

    public OpenBulkClassifications withGuids(List<String> guids) {
        this.guids = guids;
        return this;
    }

    public OpenBulkClassifications addGuidsItem(String guidsItem) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        this.guids.add(guidsItem);
        return this;
    }

    public OpenBulkClassifications withGuids(Consumer<List<String>> guidsSetter) {
        if (this.guids == null) {
            this.guids = new ArrayList<>();
        }
        guidsSetter.accept(this.guids);
        return this;
    }

    /**
     * 数据资产list
     * @return guids
     */
    public List<String> getGuids() {
        return guids;
    }

    public void setGuids(List<String> guids) {
        this.guids = guids;
    }

    public OpenBulkClassifications withClassification(OpenClassification classification) {
        this.classification = classification;
        return this;
    }

    public OpenBulkClassifications withClassification(Consumer<OpenClassification> classificationSetter) {
        if (this.classification == null) {
            this.classification = new OpenClassification();
            classificationSetter.accept(this.classification);
        }

        return this;
    }

    /**
     * Get classification
     * @return classification
     */
    public OpenClassification getClassification() {
        return classification;
    }

    public void setClassification(OpenClassification classification) {
        this.classification = classification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OpenBulkClassifications that = (OpenBulkClassifications) obj;
        return Objects.equals(this.guids, that.guids) && Objects.equals(this.classification, that.classification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guids, classification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenBulkClassifications {\n");
        sb.append("    guids: ").append(toIndentedString(guids)).append("\n");
        sb.append("    classification: ").append(toIndentedString(classification)).append("\n");
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
