package com.huaweicloud.sdk.workspaceapp.v1.model;

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
 * UploadAppIconRequestBody
 */
public class UploadAppIconRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "data", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "icon_url")

    private String iconUrl;

    public UploadAppIconRequestBody withData(FormDataFilePart data) {
        this.data = data;
        return this;
    }

    /**
     * 应用图标，png格式，限制大小8KB。
     * @return data
     */
    public FormDataFilePart getData() {
        return data;
    }

    public void setData(FormDataFilePart data) {
        this.data = data;
    }

    public UploadAppIconRequestBody withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    /**
     * base64编码后的png格式图标。
     * @return iconUrl
     */
    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public UploadAppIconRequestBody withData(InputStream inputStream, String fileName, String contentType) {
        this.data = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadAppIconRequestBody withData(InputStream inputStream, String fileName) {
        this.data = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadAppIconRequestBody withData(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.data = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                if (data != null) {
                    put("data", data);
                }
                if (iconUrl != null) {
                    put("icon_url", new FormDataPart<>(iconUrl));
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
        UploadAppIconRequestBody that = (UploadAppIconRequestBody) obj;
        return Objects.equals(this.data, that.data) && Objects.equals(this.iconUrl, that.iconUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, iconUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadAppIconRequestBody {\n");
        sb.append("    data: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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
