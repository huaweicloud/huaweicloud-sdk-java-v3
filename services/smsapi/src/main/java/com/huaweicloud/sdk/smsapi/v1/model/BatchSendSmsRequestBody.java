package com.huaweicloud.sdk.smsapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchSendSmsRequestBody
 */
public class BatchSendSmsRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private String from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private String to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateId")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "templateParas")

    private String templateParas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statusCallback")

    private String statusCallback;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private String extend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature")

    private String signature;

    public BatchSendSmsRequestBody withFrom(String from) {
        this.from = from;
        return this;
    }

    /**
     * 短信发送方的号码
     * @return from
     */
    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public BatchSendSmsRequestBody withTo(String to) {
        this.to = to;
        return this;
    }

    /**
     * 短信接收方的号码
     * @return to
     */
    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BatchSendSmsRequestBody withTemplateId(String templateId) {
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

    public BatchSendSmsRequestBody withTemplateParas(String templateParas) {
        this.templateParas = templateParas;
        return this;
    }

    /**
     * 短信模板的变量值
     * @return templateParas
     */
    public String getTemplateParas() {
        return templateParas;
    }

    public void setTemplateParas(String templateParas) {
        this.templateParas = templateParas;
    }

    public BatchSendSmsRequestBody withStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
        return this;
    }

    /**
     * SP的回调地址
     * @return statusCallback
     */
    public String getStatusCallback() {
        return statusCallback;
    }

    public void setStatusCallback(String statusCallback) {
        this.statusCallback = statusCallback;
    }

    public BatchSendSmsRequestBody withExtend(String extend) {
        this.extend = extend;
        return this;
    }

    /**
     * 扩展参数，在状态报告中会原样返回。
     * @return extend
     */
    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public BatchSendSmsRequestBody withSignature(String signature) {
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
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (from != null) {
                    put("from", new FormDataPart<>(from));
                }
                if (to != null) {
                    put("to", new FormDataPart<>(to));
                }
                if (templateId != null) {
                    put("templateId", new FormDataPart<>(templateId));
                }
                if (templateParas != null) {
                    put("templateParas", new FormDataPart<>(templateParas));
                }
                if (statusCallback != null) {
                    put("statusCallback", new FormDataPart<>(statusCallback));
                }
                if (extend != null) {
                    put("extend", new FormDataPart<>(extend));
                }
                if (signature != null) {
                    put("signature", new FormDataPart<>(signature));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchSendSmsRequestBody that = (BatchSendSmsRequestBody) obj;
        return Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.templateId, that.templateId)
            && Objects.equals(this.templateParas, that.templateParas)
            && Objects.equals(this.statusCallback, that.statusCallback) && Objects.equals(this.extend, that.extend)
            && Objects.equals(this.signature, that.signature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to, templateId, templateParas, statusCallback, extend, signature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchSendSmsRequestBody {\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateParas: ").append(toIndentedString(templateParas)).append("\n");
        sb.append("    statusCallback: ").append(toIndentedString(statusCallback)).append("\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
