package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 搜索操作配置。
 */
public class CoreGatewaySearchConfiguration {

    /**
     * 搜索类型。
     */
    public static final class SearchTypeEnum {

        /**
         * Enum SEMANTIC for value: "semantic"
         */
        public static final SearchTypeEnum SEMANTIC = new SearchTypeEnum("semantic");

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("semantic", SEMANTIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchTypeEnum(String value) {
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
        public static SearchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SearchTypeEnum(value));
        }

        public static SearchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SearchTypeEnum) {
                return this.value.equals(((SearchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private SearchTypeEnum searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_n")

    private Integer topN;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score_threshold")

    private String scoreThreshold;

    public CoreGatewaySearchConfiguration withSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 搜索类型。
     * @return searchType
     */
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    public CoreGatewaySearchConfiguration withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * 语义检索返回的工具数量。
     * minimum: 1
     * maximum: 100
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public CoreGatewaySearchConfiguration withScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
        return this;
    }

    /**
     * 语义检索相似得分阈值。
     * @return scoreThreshold
     */
    public String getScoreThreshold() {
        return scoreThreshold;
    }

    public void setScoreThreshold(String scoreThreshold) {
        this.scoreThreshold = scoreThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewaySearchConfiguration that = (CoreGatewaySearchConfiguration) obj;
        return Objects.equals(this.searchType, that.searchType) && Objects.equals(this.topN, that.topN)
            && Objects.equals(this.scoreThreshold, that.scoreThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchType, topN, scoreThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewaySearchConfiguration {\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
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
