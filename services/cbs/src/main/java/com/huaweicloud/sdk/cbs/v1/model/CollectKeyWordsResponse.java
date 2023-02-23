package com.huaweicloud.sdk.cbs.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbs.v1.model.KeyWordsStat;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CollectKeyWordsResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    private List<KeyWordsStat> keywords = null;
    
    public CollectKeyWordsResponse withKeywords(List<KeyWordsStat> keywords) {
        this.keywords = keywords;
        return this;
    }

    
    public CollectKeyWordsResponse addKeywordsItem(KeyWordsStat keywordsItem) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public CollectKeyWordsResponse withKeywords(Consumer<List<KeyWordsStat>> keywordsSetter) {
        if(this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 指定时间范围内，用户问关键词列表。
     * @return keywords
     */
    public List<KeyWordsStat> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<KeyWordsStat> keywords) {
        this.keywords = keywords;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CollectKeyWordsResponse collectKeyWordsResponse = (CollectKeyWordsResponse) o;
        return Objects.equals(this.keywords, collectKeyWordsResponse.keywords);
    }
    @Override
    public int hashCode() {
        return Objects.hash(keywords);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CollectKeyWordsResponse {\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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

