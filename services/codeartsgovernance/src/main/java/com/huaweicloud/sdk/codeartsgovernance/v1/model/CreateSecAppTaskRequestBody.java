package com.huaweicloud.sdk.codeartsgovernance.v1.model;

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
 * CreateSecAppTaskRequestBody
 */
public class CreateSecAppTaskRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "privacy_statement_url")

    private String privacyStatementUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "personal_info_share_url")

    private String personalInfoShareUrl;

    public CreateSecAppTaskRequestBody withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本：0免费版，1专业版
     * minimum: 0
     * maximum: 1
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CreateSecAppTaskRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * 待扫描文件，后缀为.apk或.hap,专业版大小限制为2G，免费版大小限制为100M
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public CreateSecAppTaskRequestBody withPrivacyStatementUrl(String privacyStatementUrl) {
        this.privacyStatementUrl = privacyStatementUrl;
        return this;
    }

    /**
     * 隐私申明URL
     * @return privacyStatementUrl
     */
    public String getPrivacyStatementUrl() {
        return privacyStatementUrl;
    }

    public void setPrivacyStatementUrl(String privacyStatementUrl) {
        this.privacyStatementUrl = privacyStatementUrl;
    }

    public CreateSecAppTaskRequestBody withPersonalInfoShareUrl(String personalInfoShareUrl) {
        this.personalInfoShareUrl = personalInfoShareUrl;
        return this;
    }

    /**
     * 个人信息第三方共享目录URL
     * @return personalInfoShareUrl
     */
    public String getPersonalInfoShareUrl() {
        return personalInfoShareUrl;
    }

    public void setPersonalInfoShareUrl(String personalInfoShareUrl) {
        this.personalInfoShareUrl = personalInfoShareUrl;
    }

    public CreateSecAppTaskRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateSecAppTaskRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateSecAppTaskRequestBody withFile(InputStream inputStream, String fileName, Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("version", new FormDataPart<>(version));
                put("file", file);
                if (privacyStatementUrl != null) {
                    put("privacy_statement_url", new FormDataPart<>(privacyStatementUrl));
                }
                if (personalInfoShareUrl != null) {
                    put("personal_info_share_url", new FormDataPart<>(personalInfoShareUrl));
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
        CreateSecAppTaskRequestBody that = (CreateSecAppTaskRequestBody) obj;
        return Objects.equals(this.version, that.version) && Objects.equals(this.file, that.file)
            && Objects.equals(this.privacyStatementUrl, that.privacyStatementUrl)
            && Objects.equals(this.personalInfoShareUrl, that.personalInfoShareUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, file, privacyStatementUrl, personalInfoShareUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecAppTaskRequestBody {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    privacyStatementUrl: ").append(toIndentedString(privacyStatementUrl)).append("\n");
        sb.append("    personalInfoShareUrl: ").append(toIndentedString(personalInfoShareUrl)).append("\n");
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
