package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 调用成功时为图片标签内容。调用失败时无此字段。
 */
public class RecaptureDetectResponseResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private String score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private List<RecaptureDetectResponseResultDetail> detail = null;

    public RecaptureDetectResponseResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 总体的结论： true：真实 false：虚假 uncertainty：不确定 
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public RecaptureDetectResponseResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 标签（如果suggestion为真时，则该值为空字符串，否则不为空）。recapture：翻拍图
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public RecaptureDetectResponseResult withScore(String score) {
        this.score = score;
        return this;
    }

    /**
     * 总体置信度，取值范围（0~1）。
     * @return score
     */
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public RecaptureDetectResponseResult withDetail(List<RecaptureDetectResponseResultDetail> detail) {
        this.detail = detail;
        return this;
    }

    public RecaptureDetectResponseResult addDetailItem(RecaptureDetectResponseResultDetail detailItem) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        this.detail.add(detailItem);
        return this;
    }

    public RecaptureDetectResponseResult withDetail(Consumer<List<RecaptureDetectResponseResultDetail>> detailSetter) {
        if (this.detail == null) {
            this.detail = new ArrayList<>();
        }
        detailSetter.accept(this.detail);
        return this;
    }

    /**
     * 识别结果详情。
     * @return detail
     */
    public List<RecaptureDetectResponseResultDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<RecaptureDetectResponseResultDetail> detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecaptureDetectResponseResult that = (RecaptureDetectResponseResult) obj;
        return Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.category, that.category)
            && Objects.equals(this.score, that.score) && Objects.equals(this.detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, category, score, detail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecaptureDetectResponseResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
