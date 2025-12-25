package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ImportPlaybookRequestBody
 */
public class ImportPlaybookRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "uploadFile", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart uploadFile;

    /**
     * 剧本文件上传模式 import 剧本上传导入 verify 剧本上传校验
     */
    public static final class UploadModelEnum {

        /**
         * Enum VERIFY for value: "verify"
         */
        public static final UploadModelEnum VERIFY = new UploadModelEnum("verify");

        /**
         * Enum IMPORT for value: "import"
         */
        public static final UploadModelEnum IMPORT = new UploadModelEnum("import");

        private static final Map<String, UploadModelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, UploadModelEnum> createStaticFields() {
            Map<String, UploadModelEnum> map = new HashMap<>();
            map.put("verify", VERIFY);
            map.put("import", IMPORT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        UploadModelEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UploadModelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new UploadModelEnum(value));
        }

        public static UploadModelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof UploadModelEnum) {
                return this.value.equals(((UploadModelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_model")

    private UploadModelEnum uploadModel;

    public ImportPlaybookRequestBody withUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
        return this;
    }

    /**
     * 导入文件
     * @return uploadFile
     */
    public FormDataFilePart getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(FormDataFilePart uploadFile) {
        this.uploadFile = uploadFile;
    }

    public ImportPlaybookRequestBody withUploadModel(UploadModelEnum uploadModel) {
        this.uploadModel = uploadModel;
        return this;
    }

    /**
     * 剧本文件上传模式 import 剧本上传导入 verify 剧本上传校验
     * @return uploadModel
     */
    public UploadModelEnum getUploadModel() {
        return uploadModel;
    }

    public void setUploadModel(UploadModelEnum uploadModel) {
        this.uploadModel = uploadModel;
    }

    public ImportPlaybookRequestBody withUploadFile(InputStream inputStream, String fileName, String contentType) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportPlaybookRequestBody withUploadFile(InputStream inputStream, String fileName) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportPlaybookRequestBody withUploadFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.uploadFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("uploadFile", uploadFile);
                if (uploadModel != null) {
                    put("upload_model", new FormDataPart<>(uploadModel));
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
        ImportPlaybookRequestBody that = (ImportPlaybookRequestBody) obj;
        return Objects.equals(this.uploadFile, that.uploadFile) && Objects.equals(this.uploadModel, that.uploadModel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadFile, uploadModel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportPlaybookRequestBody {\n");
        sb.append("    uploadFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    uploadModel: ").append(toIndentedString(uploadModel)).append("\n");
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
