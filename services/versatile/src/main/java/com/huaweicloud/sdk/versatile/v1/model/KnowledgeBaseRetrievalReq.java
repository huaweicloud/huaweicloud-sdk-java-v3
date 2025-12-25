package com.huaweicloud.sdk.versatile.v1.model;

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
 * 知识检索请求体。
 */
public class KnowledgeBaseRetrievalReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "knowledge_base_ids")

    private List<String> knowledgeBaseIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * **参数解释**： 检索策略模式。  **约束限制**： 不涉及。  **取值范围**： - doc：语义检索。 - keyword：关键词检索。 - mix：混合检索。 - faq：FAQ检索。  **默认取值**： doc。
     */
    public static final class SearchModeEnum {

        /**
         * Enum DOC for value: "doc"
         */
        public static final SearchModeEnum DOC = new SearchModeEnum("doc");

        /**
         * Enum KEYWORD for value: "keyword"
         */
        public static final SearchModeEnum KEYWORD = new SearchModeEnum("keyword");

        /**
         * Enum MIX for value: "mix"
         */
        public static final SearchModeEnum MIX = new SearchModeEnum("mix");

        /**
         * Enum FAQ for value: "faq"
         */
        public static final SearchModeEnum FAQ = new SearchModeEnum("faq");

        private static final Map<String, SearchModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchModeEnum> createStaticFields() {
            Map<String, SearchModeEnum> map = new HashMap<>();
            map.put("doc", DOC);
            map.put("keyword", KEYWORD);
            map.put("mix", MIX);
            map.put("faq", FAQ);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchModeEnum(String value) {
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
        public static SearchModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SearchModeEnum(value));
        }

        public static SearchModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SearchModeEnum) {
                return this.value.equals(((SearchModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_mode")

    private SearchModeEnum searchMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_k")

    private Integer topK;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "similarity_threshold")

    private Float similarityThreshold;

    /**
     * **参数解释**： 知识检索结果切片中，对图片标签进行处理和保留的具体方式。  **约束限制**： 该功能要求被检索的知识库本身支持返回图片信息。  **取值范围**： - RETAIN_IMAGE_ID：保留图片ID，格式：{KI|imageId}。 - RETAIN_PLACEHOLDER：保留占位符，格式：{KI|N}，N为序号。 - REMOVE_IMAGE：移除图片（即替换为空字符串）。  **默认取值**： REMOVE_IMAGE。
     */
    public static final class ImageMaskPolicyEnum {

        /**
         * Enum RETAIN_IMAGE_ID for value: "RETAIN_IMAGE_ID"
         */
        public static final ImageMaskPolicyEnum RETAIN_IMAGE_ID = new ImageMaskPolicyEnum("RETAIN_IMAGE_ID");

        /**
         * Enum RETAIN_PLACEHOLDER for value: "RETAIN_PLACEHOLDER"
         */
        public static final ImageMaskPolicyEnum RETAIN_PLACEHOLDER = new ImageMaskPolicyEnum("RETAIN_PLACEHOLDER");

        /**
         * Enum REMOVE_IMAGE for value: "REMOVE_IMAGE"
         */
        public static final ImageMaskPolicyEnum REMOVE_IMAGE = new ImageMaskPolicyEnum("REMOVE_IMAGE");

        private static final Map<String, ImageMaskPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImageMaskPolicyEnum> createStaticFields() {
            Map<String, ImageMaskPolicyEnum> map = new HashMap<>();
            map.put("RETAIN_IMAGE_ID", RETAIN_IMAGE_ID);
            map.put("RETAIN_PLACEHOLDER", RETAIN_PLACEHOLDER);
            map.put("REMOVE_IMAGE", REMOVE_IMAGE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImageMaskPolicyEnum(String value) {
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
        public static ImageMaskPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImageMaskPolicyEnum(value));
        }

        public static ImageMaskPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImageMaskPolicyEnum) {
                return this.value.equals(((ImageMaskPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_mask_policy")

    private ImageMaskPolicyEnum imageMaskPolicy;

    public KnowledgeBaseRetrievalReq withKnowledgeBaseIds(List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
        return this;
    }

    public KnowledgeBaseRetrievalReq addKnowledgeBaseIdsItem(String knowledgeBaseIdsItem) {
        if (this.knowledgeBaseIds == null) {
            this.knowledgeBaseIds = new ArrayList<>();
        }
        this.knowledgeBaseIds.add(knowledgeBaseIdsItem);
        return this;
    }

    public KnowledgeBaseRetrievalReq withKnowledgeBaseIds(Consumer<List<String>> knowledgeBaseIdsSetter) {
        if (this.knowledgeBaseIds == null) {
            this.knowledgeBaseIds = new ArrayList<>();
        }
        knowledgeBaseIdsSetter.accept(this.knowledgeBaseIds);
        return this;
    }

    /**
     * **参数解释**： 知识库ID列表。  **约束限制**： 最多可同时检索3个知识库。  **取值范围**： 不涉及。  **默认取值**： 不涉及。
     * @return knowledgeBaseIds
     */
    public List<String> getKnowledgeBaseIds() {
        return knowledgeBaseIds;
    }

    public void setKnowledgeBaseIds(List<String> knowledgeBaseIds) {
        this.knowledgeBaseIds = knowledgeBaseIds;
    }

    public KnowledgeBaseRetrievalReq withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**： 用户输入的问题或关键词。  **约束限制**： 不涉及。  **取值范围**： 长度 1 至 4096 字符。  **默认取值**： 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public KnowledgeBaseRetrievalReq withSearchMode(SearchModeEnum searchMode) {
        this.searchMode = searchMode;
        return this;
    }

    /**
     * **参数解释**： 检索策略模式。  **约束限制**： 不涉及。  **取值范围**： - doc：语义检索。 - keyword：关键词检索。 - mix：混合检索。 - faq：FAQ检索。  **默认取值**： doc。
     * @return searchMode
     */
    public SearchModeEnum getSearchMode() {
        return searchMode;
    }

    public void setSearchMode(SearchModeEnum searchMode) {
        this.searchMode = searchMode;
    }

    public KnowledgeBaseRetrievalReq withTopK(Integer topK) {
        this.topK = topK;
        return this;
    }

    /**
     * **参数解释**： 每个知识库最多返回的检索结果数量。  **约束限制**： 若传入小数，系统会默认截断小数部分。  **取值范围**： 1 至 100（含）。  **默认取值**： 10。
     * minimum: 1
     * maximum: 100
     * @return topK
     */
    public Integer getTopK() {
        return topK;
    }

    public void setTopK(Integer topK) {
        this.topK = topK;
    }

    public KnowledgeBaseRetrievalReq withSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
        return this;
    }

    /**
     * **参数解释**： 检索结果的最低相关度得分，低于此值的片段将被过滤。  **约束限制**： 不涉及。  **取值范围**： [0.0, 1.0]，包含两端。  **默认取值**： 0.5。
     * minimum: 0
     * maximum: 1
     * @return similarityThreshold
     */
    public Float getSimilarityThreshold() {
        return similarityThreshold;
    }

    public void setSimilarityThreshold(Float similarityThreshold) {
        this.similarityThreshold = similarityThreshold;
    }

    public KnowledgeBaseRetrievalReq withImageMaskPolicy(ImageMaskPolicyEnum imageMaskPolicy) {
        this.imageMaskPolicy = imageMaskPolicy;
        return this;
    }

    /**
     * **参数解释**： 知识检索结果切片中，对图片标签进行处理和保留的具体方式。  **约束限制**： 该功能要求被检索的知识库本身支持返回图片信息。  **取值范围**： - RETAIN_IMAGE_ID：保留图片ID，格式：{KI|imageId}。 - RETAIN_PLACEHOLDER：保留占位符，格式：{KI|N}，N为序号。 - REMOVE_IMAGE：移除图片（即替换为空字符串）。  **默认取值**： REMOVE_IMAGE。
     * @return imageMaskPolicy
     */
    public ImageMaskPolicyEnum getImageMaskPolicy() {
        return imageMaskPolicy;
    }

    public void setImageMaskPolicy(ImageMaskPolicyEnum imageMaskPolicy) {
        this.imageMaskPolicy = imageMaskPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KnowledgeBaseRetrievalReq that = (KnowledgeBaseRetrievalReq) obj;
        return Objects.equals(this.knowledgeBaseIds, that.knowledgeBaseIds) && Objects.equals(this.query, that.query)
            && Objects.equals(this.searchMode, that.searchMode) && Objects.equals(this.topK, that.topK)
            && Objects.equals(this.similarityThreshold, that.similarityThreshold)
            && Objects.equals(this.imageMaskPolicy, that.imageMaskPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(knowledgeBaseIds, query, searchMode, topK, similarityThreshold, imageMaskPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KnowledgeBaseRetrievalReq {\n");
        sb.append("    knowledgeBaseIds: ").append(toIndentedString(knowledgeBaseIds)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    searchMode: ").append(toIndentedString(searchMode)).append("\n");
        sb.append("    topK: ").append(toIndentedString(topK)).append("\n");
        sb.append("    similarityThreshold: ").append(toIndentedString(similarityThreshold)).append("\n");
        sb.append("    imageMaskPolicy: ").append(toIndentedString(imageMaskPolicy)).append("\n");
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
