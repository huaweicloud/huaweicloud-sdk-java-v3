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
 * This is a auto create Response Object
 */
public class TextDetectionBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="suggestion")
    
    private String suggestion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private Object detail = null;

    public TextDetectionBody withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    


    /**
     * 检测结果是否通过。  block：包含敏感信息，不通过。  pass：不包含敏感信息，通过。  review：需要人工复查。
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public TextDetectionBody withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 返回的相关检测结果详细信息：  - politics：涉政敏感词列表。  - porn：涉黄敏感词列表。  - ad：广告敏感词列表。  - abuse：辱骂敏感词列表。  - contraband：违禁品敏感词列表。  - flood：灌水文本。  > 说明：  - 灌水文本最多显示200个字符。
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextDetectionBody textDetectionBody = (TextDetectionBody) o;
        return Objects.equals(this.suggestion, textDetectionBody.suggestion) &&
            Objects.equals(this.detail, textDetectionBody.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(suggestion, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextDetectionBody {\n");
            sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
            sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

