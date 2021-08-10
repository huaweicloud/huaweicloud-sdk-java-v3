package com.huaweicloud.sdk.moderation.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 反黄，暴恐检测详情 */
public class ImageDetectionResultSimpleDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Float confidence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    public ImageDetectionResultSimpleDetail withConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }

    /** 置信度，取值范围 0-1。
     * 
     * @return confidence */
    public Float getConfidence() {
        return confidence;
    }

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    public ImageDetectionResultSimpleDetail withLabel(String label) {
        this.label = label;
        return this;
    }

    /** 每个检测结果的标签化说明： terrorism：label为对应的涉政暴恐元素信息。 - 涉政暴恐场景当前支持label列表如下： - normal：正常 - knife：刀 - gun：枪 - fire：火灾 -
     * bloody ：血腥 - terrorist：暴恐组织及标志 - fascist：法西斯组织及标志 - cult：邪教组织及标志 - negative_politics ：涉政负面组织及标志 -
     * negative_political_events：涉政负面事件及标志 - special_characters ：特殊文字 - kidnap：绑架 - corpse：尸体 - riot：暴乱事件 - parade ：游行示威
     * - sensitive_landmarks：敏感地标 - military_weapon：军事武器 - army：警察部队 - positive_politics：涉政正面组织及标志 - crowd：人群聚集
     * porn：label为对应的涉黄分类（涉黄、性感等）信息。 - 鉴黄场景当前支持label列表如下： - normal：正常 - porn：色情 - sexy：性感
     * 
     * @return label */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageDetectionResultSimpleDetail imageDetectionResultSimpleDetail = (ImageDetectionResultSimpleDetail) o;
        return Objects.equals(this.confidence, imageDetectionResultSimpleDetail.confidence)
            && Objects.equals(this.label, imageDetectionResultSimpleDetail.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(confidence, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageDetectionResultSimpleDetail {\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
