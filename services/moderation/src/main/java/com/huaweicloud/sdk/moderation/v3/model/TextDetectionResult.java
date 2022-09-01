package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TextDetectionResult
 */
public class TextDetectionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    @JacksonXmlProperty(localName = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    @JacksonXmlProperty(localName = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    @JacksonXmlProperty(localName = "details")

    private List<TextDetectionResultDetail> details = null;

    public TextDetectionResult withSuggestion(String suggestion) {
        this.suggestion = suggestion;
        return this;
    }

    /**
     * 审核结果是否通过。  block：包含敏感信息，不通过  pass：不包含敏感信息，通过  review：需要人工复检
     * @return suggestion
     */
    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }

    public TextDetectionResult withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 检测结果的标签。  支持label列表如下：  politics: 涉政  terrorism: 暴恐  porn: 色情  ban: 违禁  abuse: 辱骂  ad: 广告  ad_law: 广告法  meaningless: ⽆意义  customized：自定义（命中自定义词库中的关键词）
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TextDetectionResult withDetails(List<TextDetectionResultDetail> details) {
        this.details = details;
        return this;
    }

    public TextDetectionResult addDetailsItem(TextDetectionResultDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public TextDetectionResult withDetails(Consumer<List<TextDetectionResultDetail>> detailsSetter) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 检测详情
     * @return details
     */
    public List<TextDetectionResultDetail> getDetails() {
        return details;
    }

    public void setDetails(List<TextDetectionResultDetail> details) {
        this.details = details;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextDetectionResult textDetectionResult = (TextDetectionResult) o;
        return Objects.equals(this.suggestion, textDetectionResult.suggestion)
            && Objects.equals(this.label, textDetectionResult.label)
            && Objects.equals(this.details, textDetectionResult.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, label, details);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextDetectionResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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
