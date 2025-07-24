package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowEventResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_cn")

    private String nameCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_en")

    private String nameEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_cn")

    private String effectCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effect_en")

    private String effectEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_cn")

    private String suggestionCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suggestion_en")

    private String suggestionEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_cn")

    private String reasonCn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reason_en")

    private String reasonEn;

    public ShowEventResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 事件码
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ShowEventResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowEventResponse withNameCn(String nameCn) {
        this.nameCn = nameCn;
        return this;
    }

    /**
     * 事件中文名称
     * @return nameCn
     */
    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn;
    }

    public ShowEventResponse withNameEn(String nameEn) {
        this.nameEn = nameEn;
        return this;
    }

    /**
     * 事件英文名称
     * @return nameEn
     */
    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public ShowEventResponse withEffectCn(String effectCn) {
        this.effectCn = effectCn;
        return this;
    }

    /**
     * 事件中文影响
     * @return effectCn
     */
    public String getEffectCn() {
        return effectCn;
    }

    public void setEffectCn(String effectCn) {
        this.effectCn = effectCn;
    }

    public ShowEventResponse withEffectEn(String effectEn) {
        this.effectEn = effectEn;
        return this;
    }

    /**
     * 事件英文影响
     * @return effectEn
     */
    public String getEffectEn() {
        return effectEn;
    }

    public void setEffectEn(String effectEn) {
        this.effectEn = effectEn;
    }

    public ShowEventResponse withSuggestionCn(String suggestionCn) {
        this.suggestionCn = suggestionCn;
        return this;
    }

    /**
     * 事件中文处理建议
     * @return suggestionCn
     */
    public String getSuggestionCn() {
        return suggestionCn;
    }

    public void setSuggestionCn(String suggestionCn) {
        this.suggestionCn = suggestionCn;
    }

    public ShowEventResponse withSuggestionEn(String suggestionEn) {
        this.suggestionEn = suggestionEn;
        return this;
    }

    /**
     * 事件英文处理建议
     * @return suggestionEn
     */
    public String getSuggestionEn() {
        return suggestionEn;
    }

    public void setSuggestionEn(String suggestionEn) {
        this.suggestionEn = suggestionEn;
    }

    public ShowEventResponse withReasonCn(String reasonCn) {
        this.reasonCn = reasonCn;
        return this;
    }

    /**
     * 事件中文原因
     * @return reasonCn
     */
    public String getReasonCn() {
        return reasonCn;
    }

    public void setReasonCn(String reasonCn) {
        this.reasonCn = reasonCn;
    }

    public ShowEventResponse withReasonEn(String reasonEn) {
        this.reasonEn = reasonEn;
        return this;
    }

    /**
     * 事件英文原因
     * @return reasonEn
     */
    public String getReasonEn() {
        return reasonEn;
    }

    public void setReasonEn(String reasonEn) {
        this.reasonEn = reasonEn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEventResponse that = (ShowEventResponse) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.status, that.status)
            && Objects.equals(this.nameCn, that.nameCn) && Objects.equals(this.nameEn, that.nameEn)
            && Objects.equals(this.effectCn, that.effectCn) && Objects.equals(this.effectEn, that.effectEn)
            && Objects.equals(this.suggestionCn, that.suggestionCn)
            && Objects.equals(this.suggestionEn, that.suggestionEn) && Objects.equals(this.reasonCn, that.reasonCn)
            && Objects.equals(this.reasonEn, that.reasonEn);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(code, status, nameCn, nameEn, effectCn, effectEn, suggestionCn, suggestionEn, reasonCn, reasonEn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEventResponse {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    nameCn: ").append(toIndentedString(nameCn)).append("\n");
        sb.append("    nameEn: ").append(toIndentedString(nameEn)).append("\n");
        sb.append("    effectCn: ").append(toIndentedString(effectCn)).append("\n");
        sb.append("    effectEn: ").append(toIndentedString(effectEn)).append("\n");
        sb.append("    suggestionCn: ").append(toIndentedString(suggestionCn)).append("\n");
        sb.append("    suggestionEn: ").append(toIndentedString(suggestionEn)).append("\n");
        sb.append("    reasonCn: ").append(toIndentedString(reasonCn)).append("\n");
        sb.append("    reasonEn: ").append(toIndentedString(reasonEn)).append("\n");
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
