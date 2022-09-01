package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
 * ImportLiveDataApiDefinitionsV2RequestBody
 */
public class ImportLiveDataApiDefinitionsV2RequestBody implements SdkFormDataBody {

    /**
     * 扩展信息导入模式 - merge：当扩展信息定义冲突时，merge保留原有扩展信息 - override：当扩展信息定义冲突时，override会覆盖原有扩展信息
     */
    public static final class ExtendModeEnum {

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ExtendModeEnum MERGE = new ExtendModeEnum("merge");

        /**
         * Enum OVERRIDE for value: "override"
         */
        public static final ExtendModeEnum OVERRIDE = new ExtendModeEnum("override");

        private static final Map<String, ExtendModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ExtendModeEnum> createStaticFields() {
            Map<String, ExtendModeEnum> map = new HashMap<>();
            map.put("merge", MERGE);
            map.put("override", OVERRIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ExtendModeEnum(String value) {
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
        public static ExtendModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ExtendModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ExtendModeEnum(value);
            }
            return result;
        }

        public static ExtendModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ExtendModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ExtendModeEnum) {
                return this.value.equals(((ExtendModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend_mode")

    @JacksonXmlProperty(localName = "extend_mode")

    private ExtendModeEnum extendMode;

    /**
     * 导入模式 - merge：当API信息定义冲突时，merge保留原有API信息 - override：当API信息定义冲突时，override会覆盖原有API信息
     */
    public static final class ApiModeEnum {

        /**
         * Enum MERGE for value: "merge"
         */
        public static final ApiModeEnum MERGE = new ApiModeEnum("merge");

        /**
         * Enum OVERRIDE for value: "override"
         */
        public static final ApiModeEnum OVERRIDE = new ApiModeEnum("override");

        private static final Map<String, ApiModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ApiModeEnum> createStaticFields() {
            Map<String, ApiModeEnum> map = new HashMap<>();
            map.put("merge", MERGE);
            map.put("override", OVERRIDE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ApiModeEnum(String value) {
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
        public static ApiModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ApiModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ApiModeEnum(value);
            }
            return result;
        }

        public static ApiModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ApiModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ApiModeEnum) {
                return this.value.equals(((ApiModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_mode")

    @JacksonXmlProperty(localName = "api_mode")

    private ApiModeEnum apiMode;

    @JsonProperty(value = "file_name", access = JsonProperty.Access.WRITE_ONLY)
    @JacksonXmlProperty(localName = "file_name")

    private FormDataFilePart fileName;

    public ImportLiveDataApiDefinitionsV2RequestBody withExtendMode(ExtendModeEnum extendMode) {
        this.extendMode = extendMode;
        return this;
    }

    /**
     * 扩展信息导入模式 - merge：当扩展信息定义冲突时，merge保留原有扩展信息 - override：当扩展信息定义冲突时，override会覆盖原有扩展信息
     * @return extendMode
     */
    public ExtendModeEnum getExtendMode() {
        return extendMode;
    }

    public void setExtendMode(ExtendModeEnum extendMode) {
        this.extendMode = extendMode;
    }

    public ImportLiveDataApiDefinitionsV2RequestBody withApiMode(ApiModeEnum apiMode) {
        this.apiMode = apiMode;
        return this;
    }

    /**
     * 导入模式 - merge：当API信息定义冲突时，merge保留原有API信息 - override：当API信息定义冲突时，override会覆盖原有API信息
     * @return apiMode
     */
    public ApiModeEnum getApiMode() {
        return apiMode;
    }

    public void setApiMode(ApiModeEnum apiMode) {
        this.apiMode = apiMode;
    }

    public ImportLiveDataApiDefinitionsV2RequestBody withFileName(FormDataFilePart fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * 导入自定义后端API的请求体，json或yaml格式的文件
     * @return fileName
     */
    public FormDataFilePart getFileName() {
        return fileName;
    }

    public void setFileName(FormDataFilePart fileName) {
        this.fileName = fileName;
    }

    public ImportLiveDataApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName,
        String contentType) {
        this.fileName = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public ImportLiveDataApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName) {
        this.fileName = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public ImportLiveDataApiDefinitionsV2RequestBody withFileName(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.fileName = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {

            {
                if (extendMode != null) {
                    put("extend_mode", new FormDataPart<>(extendMode));
                }
                if (apiMode != null) {
                    put("api_mode", new FormDataPart<>(apiMode));
                }
                put("file_name", fileName);
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportLiveDataApiDefinitionsV2RequestBody importLiveDataApiDefinitionsV2RequestBody =
            (ImportLiveDataApiDefinitionsV2RequestBody) o;
        return Objects.equals(this.extendMode, importLiveDataApiDefinitionsV2RequestBody.extendMode)
            && Objects.equals(this.apiMode, importLiveDataApiDefinitionsV2RequestBody.apiMode)
            && Objects.equals(this.fileName, importLiveDataApiDefinitionsV2RequestBody.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extendMode, apiMode, fileName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportLiveDataApiDefinitionsV2RequestBody {\n");
        sb.append("    extendMode: ").append(toIndentedString(extendMode)).append("\n");
        sb.append("    apiMode: ").append(toIndentedString(apiMode)).append("\n");
        sb.append("    fileName: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
