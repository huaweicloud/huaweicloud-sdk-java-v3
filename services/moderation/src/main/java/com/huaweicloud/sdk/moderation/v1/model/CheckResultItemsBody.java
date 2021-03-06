package com.huaweicloud.sdk.moderation.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.ImageDetectionResultDetail;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class CheckResultItemsBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="url")
    
    private String url;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private String suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private ImageDetectionResultDetail detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_suggestions")
    
    private Map<String, String> categorySuggestions = null;
    
    public CheckResultItemsBody withUrl(String url) {
        this.url = url;
        return this;
    }

    


    /**
     * 图片的URL路径。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    

    public CheckResultItemsBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 请参见[表2](https://support.huaweicloud.com/api-moderation/moderation_03_0019.html#moderation_03_0019__zh-cn_topic_0087142444_table663805019540)中suggestion字段说明。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    

    public CheckResultItemsBody withDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
        return this;
    }

    public CheckResultItemsBody withDetail(Consumer<ImageDetectionResultDetail> detailSetter) {
        if(this.detail == null ){
            this.detail = new ImageDetectionResultDetail();
            detailSetter.accept(this.detail);
        }
        
        return this;
    }


    /**
     * Get detail
     * @return detail
     */
    public ImageDetectionResultDetail getDetail() {
        return detail;
    }

    public void setDetail(ImageDetectionResultDetail detail) {
        this.detail = detail;
    }

    

    public CheckResultItemsBody withCategorySuggestions(Map<String, String> categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
        return this;
    }

    

    public CheckResultItemsBody putCategorySuggestionsItem(String key, String categorySuggestionsItem) {
        if(this.categorySuggestions == null) {
            this.categorySuggestions = new HashMap<>();
        }
        this.categorySuggestions.put(key, categorySuggestionsItem);
        return this;
    }

    public CheckResultItemsBody withCategorySuggestions(Consumer<Map<String, String>> categorySuggestionsSetter) {
        if(this.categorySuggestions == null) {
            this.categorySuggestions = new HashMap<>();
        }
        categorySuggestionsSetter.accept(this.categorySuggestions);
        return this;
    }
    /**
     * 具体每个场景的检测结果。  block：包含敏感信息，不通过  pass：不包含敏感信息，通过  review：需要人工复检 
     * @return categorySuggestions
     */
    public Map<String, String> getCategorySuggestions() {
        return categorySuggestions;
    }

    public void setCategorySuggestions(Map<String, String> categorySuggestions) {
        this.categorySuggestions = categorySuggestions;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CheckResultItemsBody checkResultItemsBody = (CheckResultItemsBody) o;
        return Objects.equals(this.url, checkResultItemsBody.url) &&
            Objects.equals(this.suggestion, checkResultItemsBody.suggestion) &&
            Objects.equals(this.detail, checkResultItemsBody.detail) &&
            Objects.equals(this.categorySuggestions, checkResultItemsBody.categorySuggestions);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, suggestion, detail, categorySuggestions);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResultItemsBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    categorySuggestions: ").append(toIndentedString(categorySuggestions)).append("\n");
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

