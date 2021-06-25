package com.huaweicloud.sdk.vod.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowAssetDetailRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="asset_id")
    
    private String assetId;
    /**
     * Gets or Sets categories
     */
    public static final class CategoriesEnum {

        
        /**
         * Enum BASE_INFO for value: "base_info"
         */
        public static final CategoriesEnum BASE_INFO = new CategoriesEnum("base_info");
        
        /**
         * Enum TRANSCODE_INFO for value: "transcode_info"
         */
        public static final CategoriesEnum TRANSCODE_INFO = new CategoriesEnum("transcode_info");
        
        /**
         * Enum THUMBNAIL_INFO for value: "thumbnail_info"
         */
        public static final CategoriesEnum THUMBNAIL_INFO = new CategoriesEnum("thumbnail_info");
        
        /**
         * Enum REVIEW_INFO for value: "review_info"
         */
        public static final CategoriesEnum REVIEW_INFO = new CategoriesEnum("review_info");
        

        private static final Map<String, CategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoriesEnum> createStaticFields() {
            Map<String, CategoriesEnum> map = new HashMap<>();
            map.put("base_info", BASE_INFO);
            map.put("transcode_info", TRANSCODE_INFO);
            map.put("thumbnail_info", THUMBNAIL_INFO);
            map.put("review_info", REVIEW_INFO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoriesEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoriesEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            CategoriesEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CategoriesEnum(value);
            }
            return result;
        }

        public static CategoriesEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CategoriesEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof CategoriesEnum) {
                return this.value.equals(((CategoriesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="categories")
    
    private List<CategoriesEnum> categories = null;
    
    public ShowAssetDetailRequest withAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }

    


    /**
     * 媒资ID
     * @return assetId
     */
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    

    public ShowAssetDetailRequest withCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
        return this;
    }

    
    public ShowAssetDetailRequest addCategoriesItem(CategoriesEnum categoriesItem) {
        if(this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ShowAssetDetailRequest withCategories(Consumer<List<CategoriesEnum>> categoriesSetter) {
        if(this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 要查询的信息类型，可同时查询多个类型的信息。不指定时表示查询所有信息。 \"base_info\"       //媒资基本信息 \"transcode_info\"   //转码结果信息 \"thumbnail_info\"  //截图结果信息 \"review_info\"     //审核结果信息 
     * @return categories
     */
    public List<CategoriesEnum> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAssetDetailRequest showAssetDetailRequest = (ShowAssetDetailRequest) o;
        return Objects.equals(this.assetId, showAssetDetailRequest.assetId) &&
            Objects.equals(this.categories, showAssetDetailRequest.categories);
    }
    @Override
    public int hashCode() {
        return Objects.hash(assetId, categories);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAssetDetailRequest {\n");
        sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
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

