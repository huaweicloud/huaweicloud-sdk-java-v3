package com.huaweicloud.sdk.moderation.v2.model;

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
 * 
 */
public class ImageBatchModerationReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urls")

    private List<String> urls = null;

    /**
     * Gets or Sets categories
     */
    public static final class CategoriesEnum {

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

        private static final Map<String, CategoriesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoriesEnum> createStaticFields() {
            Map<String, CategoriesEnum> map = new HashMap<>();
            map.put("politics", POLITICS);
            map.put("terrorism", TERRORISM);
            map.put("porn", PORN);
            map.put("ad", AD);
            map.put("all", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoriesEnum(String value) {
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
        public static CategoriesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoriesEnum(value));
        }

        public static CategoriesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoriesEnum) {
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
    @JsonProperty(value = "categories")

    private List<CategoriesEnum> categories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "moderation_rule")

    private String moderationRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ad_categories")

    private List<String> adCategories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "show_ocr_text")

    private Boolean showOcrText;

    public ImageBatchModerationReq withUrls(List<String> urls) {
        this.urls = urls;
        return this;
    }

    public ImageBatchModerationReq addUrlsItem(String urlsItem) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        this.urls.add(urlsItem);
        return this;
    }

    public ImageBatchModerationReq withUrls(Consumer<List<String>> urlsSetter) {
        if (this.urls == null) {
            this.urls = new ArrayList<>();
        }
        urlsSetter.accept(this.urls);
        return this;
    }

    /**
     * 图片的URL路径，目前支持： - 公网HTTP/HTTPS URL - 华为云OBS提供的URL，使用OBS数据需要进行授权。包括对服务授权、临时授权、匿名公开授权。详请参见[配置OBS访问权限](https://support.huaweicloud.com/api-moderation/moderation_03_0020.html)。 > 图片的URL路径列表最多支持10个URL地址。接口响应时间依赖图片的下载时间，如果图片下载时间过长，会返回接口调用失败。请保证被检测图片所在的存储服务稳定可靠，建议您使用华为云OBS存储。 
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
        if (this.categories == null) {
            this.categories = new ArrayList<>();
        }
        categoriesSetter.accept(this.categories);
        return this;
    }

    /**
     * 检测场景:  - politics：是否涉及政治人物的检测。  - terrorism：是否包含涉政暴恐元素的检测。  - porn：是否包含涉黄内容元素的检测。  - ad：是否包含广告的检测（公测特性）。  - all：包含politics、terrorism和porn三种场景的检测。  可通过配置上述场景，来完对应场景元素的检测。  为空或无此参数表示politics和terrorism都检测，但不包含porn场景。  > 每个检测场景的检测次数会分类统计。 
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
     * - 结果过滤门限，只有置信度不低于此门限的结果才会呈现在detail的列表中，取值范围 0-1，当未设置此值时各个检测场景会使用各自的默认值。  - politics检测场景的默认值为0.95。  - terrorism检测场景的默认值为0。  - ad检测场景的默认值为0。  - 无特殊需求直接不传此参数或像示例中一样值设为空字符串即可。  > - 如果检测场景中的最高置信度也未达到threshold，则结果列表为空；反之threshold过小，则会使结果列表中内容过多。 > - threshold参数不支持porn场景筛选。 > -  threshold参数不会影响响应中的suggestion。 
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public ImageBatchModerationReq withModerationRule(String moderationRule) {
        this.moderationRule = moderationRule;
        return this;
    }

    /**
     * 图像审核规则名称，默认使用default规则。 审核规则的创建和使用请参见[配置审核规则](https://support.huaweicloud.com/api-moderation/moderation_03_0063.html)。 
     * @return moderationRule
     */
    public String getModerationRule() {
        return moderationRule;
    }

    public void setModerationRule(String moderationRule) {
        this.moderationRule = moderationRule;
    }

    public ImageBatchModerationReq withAdCategories(List<String> adCategories) {
        this.adCategories = adCategories;
        return this;
    }

    public ImageBatchModerationReq addAdCategoriesItem(String adCategoriesItem) {
        if (this.adCategories == null) {
            this.adCategories = new ArrayList<>();
        }
        this.adCategories.add(adCategoriesItem);
        return this;
    }

    public ImageBatchModerationReq withAdCategories(Consumer<List<String>> adCategoriesSetter) {
        if (this.adCategories == null) {
            this.adCategories = new ArrayList<>();
        }
        adCategoriesSetter.accept(this.adCategories);
        return this;
    }

    /**
     * 图文审核检测场景。当categories包含ad时，该参数生效。  当前支持的场景有系统场景和用户自定义场景: - 系统场景为：   - qr_code：二维码   - politics：涉政   - porn：涉黄   - ad：广告   - abuse：辱骂   - contraband：违禁品 - 用户自定义场景为：自定义黑名单词库。  自定义词库的创建和使用请参见[配置自定义词库](https://support.huaweicloud.com/api-moderation/moderation_03_0027.html)。 
     * @return adCategories
     */
    public List<String> getAdCategories() {
        return adCategories;
    }

    public void setAdCategories(List<String> adCategories) {
        this.adCategories = adCategories;
    }

    public ImageBatchModerationReq withShowOcrText(Boolean showOcrText) {
        this.showOcrText = showOcrText;
        return this;
    }

    /**
     * 是否返回ocr识别的结果。
     * @return showOcrText
     */
    public Boolean getShowOcrText() {
        return showOcrText;
    }

    public void setShowOcrText(Boolean showOcrText) {
        this.showOcrText = showOcrText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageBatchModerationReq that = (ImageBatchModerationReq) obj;
        return Objects.equals(this.urls, that.urls) && Objects.equals(this.categories, that.categories)
            && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.moderationRule, that.moderationRule)
            && Objects.equals(this.adCategories, that.adCategories)
            && Objects.equals(this.showOcrText, that.showOcrText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(urls, categories, threshold, moderationRule, adCategories, showOcrText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageBatchModerationReq {\n");
        sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
        sb.append("    categories: ").append(toIndentedString(categories)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    moderationRule: ").append(toIndentedString(moderationRule)).append("\n");
        sb.append("    adCategories: ").append(toIndentedString(adCategories)).append("\n");
        sb.append("    showOcrText: ").append(toIndentedString(showOcrText)).append("\n");
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
