package com.huaweicloud.sdk.imagesearch.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.imagesearch.v2.model.RangeParam;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchAfterParam;
import com.huaweicloud.sdk.imagesearch.v2.model.SearchOptionalParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SearchParam
 */
public class SearchParam  {

    /**
     * 搜索类型，必须为服务实例支持的搜索类型。服务实例的搜索类型列表可在创建服务实例时进行配置。 - 可以使用枚举名或者枚举值（例如IMAGE/0），枚举值可能会变动，建议使用枚举名。
     */
    public static final class SearchTypeEnum {

        
        /**
         * Enum IMAGE for value: "IMAGE"
         */
        public static final SearchTypeEnum IMAGE = new SearchTypeEnum("IMAGE");
        
        /**
         * Enum KEYWORD for value: "KEYWORD"
         */
        public static final SearchTypeEnum KEYWORD = new SearchTypeEnum("KEYWORD");
        
        /**
         * Enum FACE for value: "FACE"
         */
        public static final SearchTypeEnum FACE = new SearchTypeEnum("FACE");
        
        /**
         * Enum CATEGORY for value: "CATEGORY"
         */
        public static final SearchTypeEnum CATEGORY = new SearchTypeEnum("CATEGORY");
        

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("IMAGE", IMAGE);
            map.put("KEYWORD", KEYWORD);
            map.put("FACE", FACE);
            map.put("CATEGORY", CATEGORY);
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
            if( value == null ){
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SearchTypeEnum(value);
            }
            return result;
        }

        public static SearchTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value="search_type")
    
    
    private SearchTypeEnum searchType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_item")
    
    
    private SearchAfterParam lastItem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="min_score")
    
    
    private Double minScore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_tags")
    
    
    private Map<String, List<String>> customTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="custom_num_tags")
    
    
    private Map<String, RangeParam> customNumTags = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_base64")
    
    
    private String imageBase64;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image_url")
    
    
    private String imageUrl;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    
    private List<String> keywords = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="optional_params")
    
    
    private SearchOptionalParam optionalParams;

    public SearchParam withSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    


    /**
     * 搜索类型，必须为服务实例支持的搜索类型。服务实例的搜索类型列表可在创建服务实例时进行配置。 - 可以使用枚举名或者枚举值（例如IMAGE/0），枚举值可能会变动，建议使用枚举名。
     * @return searchType
     */
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    

    public SearchParam withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 返回搜索结果的数量，默认为10，取值范围为[1, 100]。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public SearchParam withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 返回搜索结果的偏移量，即返回序号在[offset, offset+limit]内的搜索结果。默认为0，取值范围为[0, N]。 - 默认情况下，搜索要求offset+limit <= 1000。 - 针对支持全量召回的场景，使用全量召回时要求offset==0。
     * minimum: 0
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public SearchParam withLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
        return this;
    }

    public SearchParam withLastItem(Consumer<SearchAfterParam> lastItemSetter) {
        if(this.lastItem == null ){
            this.lastItem = new SearchAfterParam();
            lastItemSetter.accept(this.lastItem);
        }
        
        return this;
    }


    /**
     * Get lastItem
     * @return lastItem
     */
    public SearchAfterParam getLastItem() {
        return lastItem;
    }

    public void setLastItem(SearchAfterParam lastItem) {
        this.lastItem = lastItem;
    }

    

    public SearchParam withMinScore(Double minScore) {
        this.minScore = minScore;
        return this;
    }

    


    /**
     * 返回搜索结果的最小得分，用于对搜索结果进行score过滤，取值范围为[0, 1]。 - 目前仅对IMAGE/CATEGORY搜索类型生效。
     * minimum: 0
     * maximum: 1
     * @return minScore
     */
    public Double getMinScore() {
        return minScore;
    }

    public void setMinScore(Double minScore) {
        this.minScore = minScore;
    }

    

    public SearchParam withCustomTags(Map<String, List<String>> customTags) {
        this.customTags = customTags;
        return this;
    }

    

    public SearchParam putCustomTagsItem(String key, List<String> customTagsItem) {
        if(this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        this.customTags.put(key, customTagsItem);
        return this;
    }

    public SearchParam withCustomTags(Consumer<Map<String, List<String>>> customTagsSetter) {
        if(this.customTags == null) {
            this.customTags = new HashMap<>();
        }
        customTagsSetter.accept(this.customTags);
        return this;
    }
    /**
     * 自定义字符标签，用于对搜索结果进行custom_tags过滤。格式为键值对{key:value}。 - key: 必须为服务实例custom_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。 - value: 标签值列表，列表内多个标签值为“或”关系，即满足一个即可。列表长度范围为[1, 32]，标签值类型为字符串，字符长度范围为[1, 64]。
     * @return customTags
     */
    public Map<String, List<String>> getCustomTags() {
        return customTags;
    }

    public void setCustomTags(Map<String, List<String>> customTags) {
        this.customTags = customTags;
    }

    

    public SearchParam withCustomNumTags(Map<String, RangeParam> customNumTags) {
        this.customNumTags = customNumTags;
        return this;
    }

    

    public SearchParam putCustomNumTagsItem(String key, RangeParam customNumTagsItem) {
        if(this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        this.customNumTags.put(key, customNumTagsItem);
        return this;
    }

    public SearchParam withCustomNumTags(Consumer<Map<String, RangeParam>> customNumTagsSetter) {
        if(this.customNumTags == null) {
            this.customNumTags = new HashMap<>();
        }
        customNumTagsSetter.accept(this.customNumTags);
        return this;
    }
    /**
     * 自定义数值标签，用于对搜索结果进行custom_num_tags过滤。格式为键值对{key:value}。 - key: 必须为服务实例custom_num_tags中已存在的key，可在创建服务实例时进行配置，或在更新服务实例时进行新增。针对没有设置该数值标签的数据，会直接过滤。 - value: 标签值的取值范围，标签值在给定的取值范围内即视为符合条件。
     * @return customNumTags
     */
    public Map<String, RangeParam> getCustomNumTags() {
        return customNumTags;
    }

    public void setCustomNumTags(Map<String, RangeParam> customNumTags) {
        this.customNumTags = customNumTags;
    }

    

    public SearchParam withImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
        return this;
    }

    


    /**
     * 图像文件的base64字符串，基于图像搜索时，与image_url二选一。要求如下： - 格式：目前仅支持JPEG/JPG/PNG/BMP格式的图像。 - 尺寸：默认情况下，要求图像的最短边大于128px，最长边小于4096px。部分服务类型有特殊要求，可参见服务类型说明。 - 大小：图像文件大小要求不超过5M。 - 其他：图片中不能包含旋转信息。
     * @return imageBase64
     */
    public String getImageBase64() {
        return imageBase64;
    }

    public void setImageBase64(String imageBase64) {
        this.imageBase64 = imageBase64;
    }

    

    public SearchParam withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    


    /**
     * 图像文件的服务可访问URL，字符长度范围为[1, 4096]。基于图像搜索时，与image_base64二选一。
     * @return imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    

    public SearchParam withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    
    public SearchParam addKeywordsItem(String keywordsItem) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public SearchParam withKeywords(Consumer<List<String>> keywordsSetter) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 关键词列表，搜索时关键词数量范围为[1, 10]，关键词字符长度范围为[1, 64]。使用KEYWORD搜索类型进行搜索时，必须提供该参数。
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    

    public SearchParam withOptionalParams(SearchOptionalParam optionalParams) {
        this.optionalParams = optionalParams;
        return this;
    }

    public SearchParam withOptionalParams(Consumer<SearchOptionalParam> optionalParamsSetter) {
        if(this.optionalParams == null ){
            this.optionalParams = new SearchOptionalParam();
            optionalParamsSetter.accept(this.optionalParams);
        }
        
        return this;
    }


    /**
     * Get optionalParams
     * @return optionalParams
     */
    public SearchOptionalParam getOptionalParams() {
        return optionalParams;
    }

    public void setOptionalParams(SearchOptionalParam optionalParams) {
        this.optionalParams = optionalParams;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchParam searchParam = (SearchParam) o;
        return Objects.equals(this.searchType, searchParam.searchType) &&
            Objects.equals(this.limit, searchParam.limit) &&
            Objects.equals(this.offset, searchParam.offset) &&
            Objects.equals(this.lastItem, searchParam.lastItem) &&
            Objects.equals(this.minScore, searchParam.minScore) &&
            Objects.equals(this.customTags, searchParam.customTags) &&
            Objects.equals(this.customNumTags, searchParam.customNumTags) &&
            Objects.equals(this.imageBase64, searchParam.imageBase64) &&
            Objects.equals(this.imageUrl, searchParam.imageUrl) &&
            Objects.equals(this.keywords, searchParam.keywords) &&
            Objects.equals(this.optionalParams, searchParam.optionalParams);
    }
    @Override
    public int hashCode() {
        return Objects.hash(searchType, limit, offset, lastItem, minScore, customTags, customNumTags, imageBase64, imageUrl, keywords, optionalParams);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchParam {\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    lastItem: ").append(toIndentedString(lastItem)).append("\n");
        sb.append("    minScore: ").append(toIndentedString(minScore)).append("\n");
        sb.append("    customTags: ").append(toIndentedString(customTags)).append("\n");
        sb.append("    customNumTags: ").append(toIndentedString(customNumTags)).append("\n");
        sb.append("    imageBase64: ").append(toIndentedString(imageBase64)).append("\n");
        sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    optionalParams: ").append(toIndentedString(optionalParams)).append("\n");
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

