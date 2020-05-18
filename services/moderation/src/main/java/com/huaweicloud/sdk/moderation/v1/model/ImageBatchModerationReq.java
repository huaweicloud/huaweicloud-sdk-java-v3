package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ImageBatchModerationReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="urls")
    
    private List<String> urls = new ArrayList<>();
        /**
     * Gets or Sets categories
     */
    public static class CategoriesEnum {

        
        /**
         * Enum POLITICS for value: "politics"
         */
        public static final CategoriesEnum POLITICS = new CategoriesEnum("politics");

        
        /**
         * Enum TERRORISM for value: "terrorism"
         */
        public static final CategoriesEnum TERRORISM = new CategoriesEnum("terrorism");

        
        /**
         * Enum PORN for value: "porn"
         */
        public static final CategoriesEnum PORN = new CategoriesEnum("porn");

        
        /**
         * Enum AD for value: "ad"
         */
        public static final CategoriesEnum AD = new CategoriesEnum("ad");

        
        /**
         * Enum ALL for value: "all"
         */
        public static final CategoriesEnum ALL = new CategoriesEnum("all");

        

        public static Map<String, CategoriesEnum> staticFields =
                new HashMap<String, CategoriesEnum>() {
                    { 
                        put("politics", POLITICS);
                        put("terrorism", TERRORISM);
                        put("porn", PORN);
                        put("ad", AD);
                        put("all", ALL);
                    }
                };

        private String value;

        CategoriesEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoriesEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            CategoriesEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new CategoriesEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static CategoriesEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            CategoriesEnum result = staticFields.get(value);
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
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="threshold")
    
    private Double threshold;

    public ImageBatchModerationReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public ImageBatchModerationReq addUrlsItem(String urlsItem) {
        this.urls.add(urlsItem);
        return this;
    }

    public ImageBatchModerationReq withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null ){
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 图片的URL路径，目前支持： - 公网HTTP/HTTPS URL - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[配置OBS访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)。 > 说明：图片的URL路径列表最多支持10个URL地址。接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public ImageBatchModerationReq withCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
        return this;
    }

    
    public ImageBatchModerationReq addCategoriesItem(CategoriesEnum categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ImageBatchModerationReq withCategories(Consumer<List<CategoriesEnum>> categoriesSetter) {
        if(this.categories == null ){
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 请参见[表1](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table2693546819540)中categories参数说明。
     * @return categories
     */
    public List<CategoriesEnum> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
    }

    public ImageBatchModerationReq withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 请参见[表1](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table2693546819540)中threshold参数说明。
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageBatchModerationReq imageBatchModerationReq = (ImageBatchModerationReq) o;
        return Objects.equals(this.urls, imageBatchModerationReq.urls) &&
            Objects.equals(this.categories, imageBatchModerationReq.categories) &&
            Objects.equals(this.threshold, imageBatchModerationReq.threshold);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urls, categories, threshold);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchModerationReq {\n");
            sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
            sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
            sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
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

