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
public class TaskSumbitReq  {



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
         * Enum PORN for value: "porn"
         */
        public static final CategoriesEnum PORN = new CategoriesEnum("porn");

        
        /**
         * Enum TERRORISM for value: "terrorism"
         */
        public static final CategoriesEnum TERRORISM = new CategoriesEnum("terrorism");

        

        public static Map<String, CategoriesEnum> staticFields =
                new HashMap<String, CategoriesEnum>() {
                    { 
                        put("politics", POLITICS);
                        put("porn", PORN);
                        put("terrorism", TERRORISM);
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
    
    public TaskSumbitReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    
    public TaskSumbitReq addUrlsItem(String urlsItem) {
        this.urls.add(urlsItem);
        return this;
    }

    public TaskSumbitReq withUrls(Consumer<List<String>> urlsSetter) {
        if(this.urls == null ){
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 图片的URL路径，目前支持： - 公网HTTP/HTTPS URL - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[配置OBS访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)。 > 说明：图片的URL路径列表最多支持500个URL地址。接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 
     * @return urls
     */
    public List<String> getUrls() {
        return urls;
    }

    public void setUrls(List<String> urls) {
        this.urls = urls;
    }

    public TaskSumbitReq withCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
        return this;
    }

    
    public TaskSumbitReq addCategoriesItem(CategoriesEnum categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public TaskSumbitReq withCategories(Consumer<List<CategoriesEnum>> categoriesSetter) {
        if(this.categories == null ){
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景。  - politics：是否涉及政治人物的检测。  - terrorism：是否包含涉政敏感人物、涉政暴恐元素的检测。  - porn：是否包含涉黄内容元素的检测。  可通过配置上述场景，来完成对应场景元素的检测。  为空或无此参数时默认检测politics和terrorism(不包含porn)。 
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
        TaskSumbitReq taskSumbitReq = (TaskSumbitReq) o;
        return Objects.equals(this.urls, taskSumbitReq.urls) &&
            Objects.equals(this.categories, taskSumbitReq.categories);
    }
    @Override
    public int hashCode() {
        return Objects.hash(urls, categories);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskSumbitReq {\n");
            sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

