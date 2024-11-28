package com.huaweicloud.sdk.smsapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmsContent
 */
public class SmsContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private List<String> to = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateId")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateParas")

    private List<String> templateParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    public SmsContent withTo(List<String> to) {
        this.to = to;
        return this;
    }

    public SmsContent addToItem(String toItem) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        this.to.add(toItem);
        return this;
    }

    public SmsContent withTo(Consumer<List<String>> toSetter) {
        if (this.to == null) {
            this.to = new ArrayList<>();
        }
        toSetter.accept(this.to);
        return this;
    }

    /**
     * 群发短信接收方的号码
     * @return to
     */
    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public SmsContent withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 短信模板ID
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public SmsContent withTemplateParas(List<String> templateParas) {
        this.templateParas = templateParas;
        return this;
    }

    public SmsContent addTemplateParasItem(String templateParasItem) {
        if (this.templateParas == null) {
            this.templateParas = new ArrayList<>();
        }
        this.templateParas.add(templateParasItem);
        return this;
    }

    public SmsContent withTemplateParas(Consumer<List<String>> templateParasSetter) {
        if (this.templateParas == null) {
            this.templateParas = new ArrayList<>();
        }
        templateParasSetter.accept(this.templateParas);
        return this;
    }

    /**
     * 短信模板的变量值列表
     * @return templateParas
     */
    public List<String> getTemplateParas() {
        return templateParas;
    }

    public void setTemplateParas(List<String> templateParas) {
        this.templateParas = templateParas;
    }

    public SmsContent withSignature(String signature) {
        this.signature = signature;
        return this;
    }

    /**
     * 短信签名
     * @return signature
     */
    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmsContent that = (SmsContent) obj;
        return Objects.equals(this.to, that.to) && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateParas, that.templateParas) && Objects.equals(this.signature, that.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(to, templateId, templateParas, signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmsContent {\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateParas: ").append(toIndentedString(templateParas)).append("\n");
        sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
