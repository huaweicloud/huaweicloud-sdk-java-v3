package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class EtlBasicParameter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_features")

    @JacksonXmlProperty(localName = "user_features")

    private List<FeatureTransformation> userFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_features")

    @JacksonXmlProperty(localName = "item_features")

    private List<FeatureTransformation> itemFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_etl_filter")

    @JacksonXmlProperty(localName = "rank_etl_filter")

    private RankETLFilter rankEtlFilter;

    public EtlBasicParameter withUserFeatures(List<FeatureTransformation> userFeatures) {
        this.userFeatures = userFeatures;
        return this;
    }

    public EtlBasicParameter addUserFeaturesItem(FeatureTransformation userFeaturesItem) {
        if (this.userFeatures == null) {
            this.userFeatures = new ArrayList<>();
        }
        this.userFeatures.add(userFeaturesItem);
        return this;
    }

    public EtlBasicParameter withUserFeatures(Consumer<List<FeatureTransformation>> userFeaturesSetter) {
        if (this.userFeatures == null) {
            this.userFeatures = new ArrayList<>();
        }
        userFeaturesSetter.accept(this.userFeatures);
        return this;
    }

    /**
     * 用户特征。
     * @return userFeatures
     */
    public List<FeatureTransformation> getUserFeatures() {
        return userFeatures;
    }

    public void setUserFeatures(List<FeatureTransformation> userFeatures) {
        this.userFeatures = userFeatures;
    }

    public EtlBasicParameter withItemFeatures(List<FeatureTransformation> itemFeatures) {
        this.itemFeatures = itemFeatures;
        return this;
    }

    public EtlBasicParameter addItemFeaturesItem(FeatureTransformation itemFeaturesItem) {
        if (this.itemFeatures == null) {
            this.itemFeatures = new ArrayList<>();
        }
        this.itemFeatures.add(itemFeaturesItem);
        return this;
    }

    public EtlBasicParameter withItemFeatures(Consumer<List<FeatureTransformation>> itemFeaturesSetter) {
        if (this.itemFeatures == null) {
            this.itemFeatures = new ArrayList<>();
        }
        itemFeaturesSetter.accept(this.itemFeatures);
        return this;
    }

    /**
     * 物品特征。
     * @return itemFeatures
     */
    public List<FeatureTransformation> getItemFeatures() {
        return itemFeatures;
    }

    public void setItemFeatures(List<FeatureTransformation> itemFeatures) {
        this.itemFeatures = itemFeatures;
    }

    public EtlBasicParameter withRankEtlFilter(RankETLFilter rankEtlFilter) {
        this.rankEtlFilter = rankEtlFilter;
        return this;
    }

    public EtlBasicParameter withRankEtlFilter(Consumer<RankETLFilter> rankEtlFilterSetter) {
        if (this.rankEtlFilter == null) {
            this.rankEtlFilter = new RankETLFilter();
            rankEtlFilterSetter.accept(this.rankEtlFilter);
        }

        return this;
    }

    /**
     * Get rankEtlFilter
     * @return rankEtlFilter
     */
    public RankETLFilter getRankEtlFilter() {
        return rankEtlFilter;
    }

    public void setRankEtlFilter(RankETLFilter rankEtlFilter) {
        this.rankEtlFilter = rankEtlFilter;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EtlBasicParameter etlBasicParameter = (EtlBasicParameter) o;
        return Objects.equals(this.userFeatures, etlBasicParameter.userFeatures)
            && Objects.equals(this.itemFeatures, etlBasicParameter.itemFeatures)
            && Objects.equals(this.rankEtlFilter, etlBasicParameter.rankEtlFilter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userFeatures, itemFeatures, rankEtlFilter);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EtlBasicParameter {\n");
        sb.append("    userFeatures: ").append(toIndentedString(userFeatures)).append("\n");
        sb.append("    itemFeatures: ").append(toIndentedString(itemFeatures)).append("\n");
        sb.append("    rankEtlFilter: ").append(toIndentedString(rankEtlFilter)).append("\n");
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
