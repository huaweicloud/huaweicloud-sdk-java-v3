package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * RetryNextflowJobRequestBody
 */
public class RetryNextflowJobRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "params", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart params;

    public RetryNextflowJobRequestBody withParams(FormDataFilePart params) {
        this.params = params;
        return this;
    }

    /**
     * 流程参数列表文件，取值范围[0, 10M]
     * @return params
     */
    public FormDataFilePart getParams() {
        return params;
    }

    public void setParams(FormDataFilePart params) {
        this.params = params;
    }

    public RetryNextflowJobRequestBody withParams(InputStream inputStream, String fileName, String contentType) {
        this.params = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public RetryNextflowJobRequestBody withParams(InputStream inputStream, String fileName) {
        this.params = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public RetryNextflowJobRequestBody withParams(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.params = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (params != null) {
                    put("params", params);
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
        RetryNextflowJobRequestBody that = (RetryNextflowJobRequestBody) obj;
        return Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RetryNextflowJobRequestBody {\n");
        sb.append("    params: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
