package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class RecognizeCustomTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Object result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    public RecognizeCustomTemplateResponse withResult(Object result) {
        this.result = result;
        return this;
    }

    /**
     * 调用成功时表示调用结果。 调用失败时无此字段。 
     * @return result
     */
    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public RecognizeCustomTemplateResponse withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 调用成功时返回调用模板id。 调用失败时无此字段。 
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecognizeCustomTemplateResponse recognizeCustomTemplateResponse = (RecognizeCustomTemplateResponse) o;
        return Objects.equals(this.result, recognizeCustomTemplateResponse.result)
            && Objects.equals(this.templateId, recognizeCustomTemplateResponse.templateId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, templateId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecognizeCustomTemplateResponse {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
