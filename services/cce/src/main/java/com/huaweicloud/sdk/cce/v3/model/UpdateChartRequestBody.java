package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateChartRequestBody
 */
public class UpdateChartRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private String parameters;

    @JsonProperty(value = "content", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart content;

    public UpdateChartRequestBody withParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * 上传模板的配置参数，示例如下：\"{\\\"override\\\":true,\\\"skip_lint\\\":true,\\\"source\\\":\\\"package\\\"}\" - skip_lint: whether lint uploaded chart - override: whether override existed chart - visible: update chart visible
     * @return parameters
     */
    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public UpdateChartRequestBody withContent(FormDataFilePart content) {
        this.content = content;
        return this;
    }

    /**
     * 模板包文件
     * @return content
     */
    public FormDataFilePart getContent() {
        return content;
    }

    public void setContent(FormDataFilePart content) {
        this.content = content;
    }

    public UpdateChartRequestBody withContent(InputStream inputStream, String fileName, String contentType) {
        this.content = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UpdateChartRequestBody withContent(InputStream inputStream, String fileName) {
        this.content = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UpdateChartRequestBody withContent(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.content = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (parameters != null) {
                    put("parameters", new FormDataPart<>(parameters));
                }
                put("content", content);
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
        UpdateChartRequestBody that = (UpdateChartRequestBody) obj;
        return Objects.equals(this.parameters, that.parameters) && Objects.equals(this.content, that.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parameters, content);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateChartRequestBody {\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    content: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
