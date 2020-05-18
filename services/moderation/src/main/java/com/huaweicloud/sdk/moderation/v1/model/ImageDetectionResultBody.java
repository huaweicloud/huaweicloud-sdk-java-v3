package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class ImageDetectionResultBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private Object detail = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private String suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category_suggestion")
    
    private Object categorySuggestion = null;

    public ImageDetectionResultBody withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 针对选定的每个检测场景列出结果列表，politics为涉政敏感人物检测结果，terrorism为涉政暴恐检测结果，porn为涉黄检测结果。如果检测场景中的最高置信度也未达到threshold则结果列表为空。 
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    public ImageDetectionResultBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 检测结果是否通过。 block：包含敏感信息，不通过 pass：不包含敏感信息，通过 review：需要人工复检 > 说明： 当同时检测多个场景时，suggestion的值以最可能包含敏感信息的场景为准。即任一场景出现了block则总的suggestion为block，所有场景都pass时suggestion为pass，这两种情况之外则一定有场景需要review，此时suggestion为review。 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public ImageDetectionResultBody withCategorySuggestion(Object categorySuggestion) {
        this.categorySuggestion = categorySuggestion;
        return this;
    }

    


    /**
     * 具体每个场景的检测结果。  block：包含敏感信息，不通过  pass：不包含敏感信息，通过  review：需要人工复检 
     * @return categorySuggestion
     */
    public Object getCategorySuggestion() {
        return categorySuggestion;
    }

    public void setCategorySuggestion(Object categorySuggestion) {
        this.categorySuggestion = categorySuggestion;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultBody imageDetectionResultBody = (ImageDetectionResultBody) o;
        return Objects.equals(this.detail, imageDetectionResultBody.detail) &&
            Objects.equals(this.suggestion, imageDetectionResultBody.suggestion) &&
            Objects.equals(this.categorySuggestion, imageDetectionResultBody.categorySuggestion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(detail, suggestion, categorySuggestion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultBody {\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
            sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
            sb.append("    categorySuggestion: ").append(toIndentedString(categorySuggestion)).append("\n");
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

