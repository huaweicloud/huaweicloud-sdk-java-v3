package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImageDetectionResult
 */
public class ImageDetectionResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion")

    private String suggestion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "details")

    private List<ImageDetectionResultDetail> details = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ocr_text")

    private String ocrText;

    public ImageDetectionResult withSuggestion(String suggestion) {
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

    public ImageDetectionResult withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 检测结果的一级标签。 支持category列表如下： terrorism: 暴恐 porn: 色情 image_text: 图文审核
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ImageDetectionResult withDetails(List<ImageDetectionResultDetail> details) {
        this.details = details;
        return this;
    }

    public ImageDetectionResult addDetailsItem(ImageDetectionResultDetail detailsItem) {
        if (this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public ImageDetectionResult withDetails(Consumer<List<ImageDetectionResultDetail>> detailsSetter) {
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
    public List<ImageDetectionResultDetail> getDetails() {
        return details;
    }

    public void setDetails(List<ImageDetectionResultDetail> details) {
        this.details = details;
    }

    public ImageDetectionResult withOcrText(String ocrText) {
        this.ocrText = ocrText;
        return this;
    }

    /**
     * 图文审核检测出的文本，只有在category参数配置image_text且检测出文本时展示该字段。
     * @return ocrText
     */
    public String getOcrText() {
        return ocrText;
    }

    public void setOcrText(String ocrText) {
        this.ocrText = ocrText;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImageDetectionResult that = (ImageDetectionResult) obj;
        return Objects.equals(this.suggestion, that.suggestion) && Objects.equals(this.category, that.category)
            && Objects.equals(this.details, that.details) && Objects.equals(this.ocrText, that.ocrText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suggestion, category, details, ocrText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResult {\n");
        sb.append("    suggestion: ").append(toIndentedString(suggestion)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
        sb.append("    ocrText: ").append(toIndentedString(ocrText)).append("\n");
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
