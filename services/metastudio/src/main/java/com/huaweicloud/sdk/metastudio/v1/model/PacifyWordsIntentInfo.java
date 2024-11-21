package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 安抚话术意图信息。
 */
public class PacifyWordsIntentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "intent")

    private String intent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_cn")

    private String descCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc_en")

    private String descEn;

    public PacifyWordsIntentInfo withIntent(String intent) {
        this.intent = intent;
        return this;
    }

    /**
     * 意图名称
     * @return intent
     */
    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public PacifyWordsIntentInfo withDescCn(String descCn) {
        this.descCn = descCn;
        return this;
    }

    /**
     * 意图中文描述
     * @return descCn
     */
    public String getDescCn() {
        return descCn;
    }

    public void setDescCn(String descCn) {
        this.descCn = descCn;
    }

    public PacifyWordsIntentInfo withDescEn(String descEn) {
        this.descEn = descEn;
        return this;
    }

    /**
     * 意图英文描述
     * @return descEn
     */
    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PacifyWordsIntentInfo that = (PacifyWordsIntentInfo) obj;
        return Objects.equals(this.intent, that.intent) && Objects.equals(this.descCn, that.descCn)
            && Objects.equals(this.descEn, that.descEn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(intent, descCn, descEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PacifyWordsIntentInfo {\n");
        sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
        sb.append("    descCn: ").append(toIndentedString(descCn)).append("\n");
        sb.append("    descEn: ").append(toIndentedString(descEn)).append("\n");
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
