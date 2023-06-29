package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 综合排序信息
 */
public class AttributeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rank_feature_pairs")

    private List<RankFeaturePair> rankFeaturePairs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "numerical_attrs")

    private List<NumericalAttr> numericalAttrs = null;

    /**
     * 统计方式： - ORDER，顺序 - ABS，绝对值
     */
    public static final class NumStatisticsTypeEnum {

        /**
         * Enum ORDER for value: "ORDER"
         */
        public static final NumStatisticsTypeEnum ORDER = new NumStatisticsTypeEnum("ORDER");

        /**
         * Enum ABS for value: "ABS"
         */
        public static final NumStatisticsTypeEnum ABS = new NumStatisticsTypeEnum("ABS");

        private static final Map<String, NumStatisticsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, NumStatisticsTypeEnum> createStaticFields() {
            Map<String, NumStatisticsTypeEnum> map = new HashMap<>();
            map.put("ORDER", ORDER);
            map.put("ABS", ABS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        NumStatisticsTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static NumStatisticsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new NumStatisticsTypeEnum(value));
        }

        public static NumStatisticsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof NumStatisticsTypeEnum) {
                return this.value.equals(((NumStatisticsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_statistics_type")

    private NumStatisticsTypeEnum numStatisticsType;

    public AttributeInfo withRankFeaturePairs(List<RankFeaturePair> rankFeaturePairs) {
        this.rankFeaturePairs = rankFeaturePairs;
        return this;
    }

    public AttributeInfo addRankFeaturePairsItem(RankFeaturePair rankFeaturePairsItem) {
        if (this.rankFeaturePairs == null) {
            this.rankFeaturePairs = new ArrayList<>();
        }
        this.rankFeaturePairs.add(rankFeaturePairsItem);
        return this;
    }

    public AttributeInfo withRankFeaturePairs(Consumer<List<RankFeaturePair>> rankFeaturePairsSetter) {
        if (this.rankFeaturePairs == null) {
            this.rankFeaturePairs = new ArrayList<>();
        }
        rankFeaturePairsSetter.accept(this.rankFeaturePairs);
        return this;
    }

    /**
     * 属性匹配对。
     * @return rankFeaturePairs
     */
    public List<RankFeaturePair> getRankFeaturePairs() {
        return rankFeaturePairs;
    }

    public void setRankFeaturePairs(List<RankFeaturePair> rankFeaturePairs) {
        this.rankFeaturePairs = rankFeaturePairs;
    }

    public AttributeInfo withNumericalAttrs(List<NumericalAttr> numericalAttrs) {
        this.numericalAttrs = numericalAttrs;
        return this;
    }

    public AttributeInfo addNumericalAttrsItem(NumericalAttr numericalAttrsItem) {
        if (this.numericalAttrs == null) {
            this.numericalAttrs = new ArrayList<>();
        }
        this.numericalAttrs.add(numericalAttrsItem);
        return this;
    }

    public AttributeInfo withNumericalAttrs(Consumer<List<NumericalAttr>> numericalAttrsSetter) {
        if (this.numericalAttrs == null) {
            this.numericalAttrs = new ArrayList<>();
        }
        numericalAttrsSetter.accept(this.numericalAttrs);
        return this;
    }

    /**
     * 属性权重。
     * @return numericalAttrs
     */
    public List<NumericalAttr> getNumericalAttrs() {
        return numericalAttrs;
    }

    public void setNumericalAttrs(List<NumericalAttr> numericalAttrs) {
        this.numericalAttrs = numericalAttrs;
    }

    public AttributeInfo withNumStatisticsType(NumStatisticsTypeEnum numStatisticsType) {
        this.numStatisticsType = numStatisticsType;
        return this;
    }

    /**
     * 统计方式： - ORDER，顺序 - ABS，绝对值
     * @return numStatisticsType
     */
    public NumStatisticsTypeEnum getNumStatisticsType() {
        return numStatisticsType;
    }

    public void setNumStatisticsType(NumStatisticsTypeEnum numStatisticsType) {
        this.numStatisticsType = numStatisticsType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttributeInfo that = (AttributeInfo) obj;
        return Objects.equals(this.rankFeaturePairs, that.rankFeaturePairs)
            && Objects.equals(this.numericalAttrs, that.numericalAttrs)
            && Objects.equals(this.numStatisticsType, that.numStatisticsType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rankFeaturePairs, numericalAttrs, numStatisticsType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttributeInfo {\n");
        sb.append("    rankFeaturePairs: ").append(toIndentedString(rankFeaturePairs)).append("\n");
        sb.append("    numericalAttrs: ").append(toIndentedString(numericalAttrs)).append("\n");
        sb.append("    numStatisticsType: ").append(toIndentedString(numStatisticsType)).append("\n");
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
