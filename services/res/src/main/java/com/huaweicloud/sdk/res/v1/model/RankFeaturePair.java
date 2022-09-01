package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class RankFeaturePair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name_a")

    @JacksonXmlProperty(localName = "feature_name_a")

    private String featureNameA;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature_name_b")

    @JacksonXmlProperty(localName = "feature_name_b")

    private String featureNameB;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Float weight;

    public RankFeaturePair withFeatureNameA(String featureNameA) {
        this.featureNameA = featureNameA;
        return this;
    }

    /**
     * 待推荐对象的属性。
     * @return featureNameA
     */
    public String getFeatureNameA() {
        return featureNameA;
    }

    public void setFeatureNameA(String featureNameA) {
        this.featureNameA = featureNameA;
    }

    public RankFeaturePair withFeatureNameB(String featureNameB) {
        this.featureNameB = featureNameB;
        return this;
    }

    /**
     * 被推荐对象的属性。
     * @return featureNameB
     */
    public String getFeatureNameB() {
        return featureNameB;
    }

    public void setFeatureNameB(String featureNameB) {
        this.featureNameB = featureNameB;
    }

    public RankFeaturePair withWeight(Float weight) {
        this.weight = weight;
        return this;
    }

    /**
     * 权重。
     * minimum: 0.01
     * maximum: 1
     * @return weight
     */
    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RankFeaturePair rankFeaturePair = (RankFeaturePair) o;
        return Objects.equals(this.featureNameA, rankFeaturePair.featureNameA)
            && Objects.equals(this.featureNameB, rankFeaturePair.featureNameB)
            && Objects.equals(this.weight, rankFeaturePair.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(featureNameA, featureNameB, weight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RankFeaturePair {\n");
        sb.append("    featureNameA: ").append(toIndentedString(featureNameA)).append("\n");
        sb.append("    featureNameB: ").append(toIndentedString(featureNameB)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
