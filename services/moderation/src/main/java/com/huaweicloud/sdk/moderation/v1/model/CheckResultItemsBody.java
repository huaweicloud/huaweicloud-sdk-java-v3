package com.huaweicloud.sdk.moderation.v1.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.moderation.v1.model.CheckResultDetailBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

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
    
    private CheckResultDetailBody detail = null;

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

    public CheckResultItemsBody withDetail(CheckResultDetailBody detail) {
        this.detail = detail;
        return this;
    }

    public CheckResultItemsBody withDetail(Consumer<CheckResultDetailBody> detailSetter) {
        if(this.detail == null ){
            this.detail = new CheckResultDetailBody();
        }
        detailSetter.accept(this.detail);
        return this;
    }


    /**
     * Get detail
     * @return detail
     */
    public CheckResultDetailBody getDetail() {
        return detail;
    }

    public void setDetail(CheckResultDetailBody detail) {
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
        CheckResultItemsBody checkResultItemsBody = (CheckResultItemsBody) o;
        return Objects.equals(this.url, checkResultItemsBody.url) &&
            Objects.equals(this.suggestion, checkResultItemsBody.suggestion) &&
            Objects.equals(this.detail, checkResultItemsBody.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(url, suggestion, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckResultItemsBody {\n");
            sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

