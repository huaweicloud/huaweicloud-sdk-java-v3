package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 广告检测详情
 */
public class ImageDetectionResultAdDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hit_contexts")

    private List<String> hitContexts = null;

    public ImageDetectionResultAdDetail withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * 置信度，取值范围 0-1。
     * @return confidence
     */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public ImageDetectionResultAdDetail withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * ad：label为对应的广告识别结果信息 - 广告场景当前支持label列表如下：   - normal：正常   - ad：广告 - 图文审核场景当前支持label列表如下：   - normal：正常   - qr_code：二维   - politics：涉政   - porn：涉黄   - ad：广告   - abuse：辱骂   - contraband：违禁品   - 其他自定义黑库名称 
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ImageDetectionResultAdDetail withHitContexts(List<String> hitContexts) {
        this.hitContexts = hitContexts;
        return this;
    }

    public ImageDetectionResultAdDetail addHitContextsItem(String hitContextsItem) {
        if (this.hitContexts == null) {
            this.hitContexts = new ArrayList<>();
        }
        this.hitContexts.add(hitContextsItem);
        return this;
    }

    public ImageDetectionResultAdDetail withHitContexts(Consumer<List<String>> hitContextsSetter) {
        if (this.hitContexts == null) {
            this.hitContexts = new ArrayList<>();
        }
        hitContextsSetter.accept(this.hitContexts);
        return this;
    }

    /**
     * 图文审核场景命中的文本列表。
     * @return hitContexts
     */
    public List<String> getHitContexts() {
        return hitContexts;
    }

    public void setHitContexts(List<String> hitContexts) {
        this.hitContexts = hitContexts;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultAdDetail imageDetectionResultAdDetail = (ImageDetectionResultAdDetail) o;
        return Objects.equals(this.confidence, imageDetectionResultAdDetail.confidence)
            && Objects.equals(this.label, imageDetectionResultAdDetail.label)
            && Objects.equals(this.hitContexts, imageDetectionResultAdDetail.hitContexts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, label, hitContexts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultAdDetail {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    hitContexts: ").append(toIndentedString(hitContexts)).append("\n");
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
