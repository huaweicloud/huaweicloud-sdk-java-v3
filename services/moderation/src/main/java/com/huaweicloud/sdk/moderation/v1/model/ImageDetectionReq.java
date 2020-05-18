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
public class ImageDetectionReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="image")
    
    private byte[] image;
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
    
    private Float threshold;

    public ImageDetectionReq withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 与image二选一  图片的URL路径，目前支持：  - 公网HTTP/HTTPS URL  - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[配置OBS访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)。  > 说明：  - 接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageDetectionReq withImage(byte[] image) {
        this.image = image;
        return this;
    }

    


    /**
     * 与url二选一  图片文件Base64编码字符串。要求base64编码后大小不超过10M。  政治人物检测人脸部分不小于50*50像素。  支持JPG/PNG/BMP格式。 
     * @return image
     */
    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public ImageDetectionReq withCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
        return this;
    }

    
    public ImageDetectionReq addCategoriesItem(CategoriesEnum categoriesItem) {
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        this.categories.add(categoriesItem);
        return this;
    }

    public ImageDetectionReq withCategories(Consumer<List<CategoriesEnum>> categoriesSetter) {
        if(this.categories == null ){
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景:  - politics：是否涉及政治人物的检测。  - terrorism：是否包含涉政暴恐元素的检测。  - porn：是否包含涉黄内容元素的检测。  - ad：是否包含广告的检测（公测特性）。  - all：包含politics、terrorism和porn三种场景的检测。  可通过配置上述场景，来完对应场景元素的检测。  为空或无此参数表示politics和terrorism都检测，但不包含porn场景。  > 说明： 每个检测场景的检测次数会分类统计。 
     * @return categories
     */
    public List<CategoriesEnum> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesEnum> categories) {
        this.categories = categories;
    }

    public ImageDetectionReq withThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    


    /**
     * 结果过滤门限，只有置信度不低于此门限的结果才会呈现在detail的列表中，取值范围 0-1，当未设置此值时各个检测场景会使用各自的默认值。  politics检测场景的默认值为0.95。  terrorism检测场景的默认值为0。  ad检测场景的默认值为0。  无特殊需求直接不传此参数或像示例中一样值设为空字符串即可。  > 说明：  - 如果检测场景中的最高置信度也未达到threshold，则结果列表为空；反之threshold过小，则会使结果列表中内容过多。  - threshold参数不支持porn场景筛选。  - threshold参数不会影响响应中的suggestion。 
     * minimum: 0
     * maximum: 1
     * @return threshold
     */
    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
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
        ImageDetectionReq imageDetectionReq = (ImageDetectionReq) o;
        return Objects.equals(this.url, imageDetectionReq.url) &&
            Objects.equals(this.image, imageDetectionReq.image) &&
            Objects.equals(this.categories, imageDetectionReq.categories) &&
            Objects.equals(this.threshold, imageDetectionReq.threshold);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, image, categories, threshold);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionReq {\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
            sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

