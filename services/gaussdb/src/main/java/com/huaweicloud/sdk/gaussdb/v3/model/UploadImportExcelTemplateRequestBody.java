package com.huaweicloud.sdk.gaussdb.v3.model;

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
 * UploadImportExcelTemplateRequestBody
 */
public class UploadImportExcelTemplateRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_type")

    private String templateType;

    @JsonProperty(value = "file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart file;

    /**
     * **参数解释**：  判断是否是实例级同步。  **约束限制**：  不涉及。  **取值范围**：  - true：实例级同步。 - false: 非实例级同步。  **默认取值**：  false。
     */
    public static final class IsInstanceLevelEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsInstanceLevelEnum TRUE = new IsInstanceLevelEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsInstanceLevelEnum FALSE = new IsInstanceLevelEnum("false");

        private static final Map<String, IsInstanceLevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsInstanceLevelEnum> createStaticFields() {
            Map<String, IsInstanceLevelEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsInstanceLevelEnum(String value) {
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
        public static IsInstanceLevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsInstanceLevelEnum(value));
        }

        public static IsInstanceLevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsInstanceLevelEnum) {
                return this.value.equals(((IsInstanceLevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_instance_level")

    private IsInstanceLevelEnum isInstanceLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "selected_dbs")

    private String selectedDbs;

    /**
     * **参数解释**：  是否支持标配符。  **约束限制**：  不涉及。  **取值范围**：  - true: 支持标配符。 - false: 不支持标配符。  **默认取值**：  不涉及。
     */
    public static final class IsSupportRegexpEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final IsSupportRegexpEnum TRUE = new IsSupportRegexpEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final IsSupportRegexpEnum FALSE = new IsSupportRegexpEnum("false");

        private static final Map<String, IsSupportRegexpEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IsSupportRegexpEnum> createStaticFields() {
            Map<String, IsSupportRegexpEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IsSupportRegexpEnum(String value) {
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
        public static IsSupportRegexpEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IsSupportRegexpEnum(value));
        }

        public static IsSupportRegexpEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IsSupportRegexpEnum) {
                return this.value.equals(((IsSupportRegexpEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_support_regexp")

    private IsSupportRegexpEnum isSupportRegexp;

    public UploadImportExcelTemplateRequestBody withTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }

    /**
     * **参数解释**：  具体选择哪一种模板进行下载。  **约束限制**：  不涉及。  **取值范围**：  import_async: Excel导入文件类型。  **默认取值**：  不涉及。
     * @return templateType
     */
    public String getTemplateType() {
        return templateType;
    }

    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }

    public UploadImportExcelTemplateRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    /**
     * **参数解释**：  Excel文件上传。  **约束限制**：  Excel文件。  **取值范围**：  .xlsx文件。  **默认取值**：  不涉及。
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    public UploadImportExcelTemplateRequestBody withIsInstanceLevel(IsInstanceLevelEnum isInstanceLevel) {
        this.isInstanceLevel = isInstanceLevel;
        return this;
    }

    /**
     * **参数解释**：  判断是否是实例级同步。  **约束限制**：  不涉及。  **取值范围**：  - true：实例级同步。 - false: 非实例级同步。  **默认取值**：  false。
     * @return isInstanceLevel
     */
    public IsInstanceLevelEnum getIsInstanceLevel() {
        return isInstanceLevel;
    }

    public void setIsInstanceLevel(IsInstanceLevelEnum isInstanceLevel) {
        this.isInstanceLevel = isInstanceLevel;
    }

    public UploadImportExcelTemplateRequestBody withSelectedDbs(String selectedDbs) {
        this.selectedDbs = selectedDbs;
        return this;
    }

    /**
     * **参数解释**：  用户选中的数据库名，用英文\",\"隔开。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return selectedDbs
     */
    public String getSelectedDbs() {
        return selectedDbs;
    }

    public void setSelectedDbs(String selectedDbs) {
        this.selectedDbs = selectedDbs;
    }

    public UploadImportExcelTemplateRequestBody withIsSupportRegexp(IsSupportRegexpEnum isSupportRegexp) {
        this.isSupportRegexp = isSupportRegexp;
        return this;
    }

    /**
     * **参数解释**：  是否支持标配符。  **约束限制**：  不涉及。  **取值范围**：  - true: 支持标配符。 - false: 不支持标配符。  **默认取值**：  不涉及。
     * @return isSupportRegexp
     */
    public IsSupportRegexpEnum getIsSupportRegexp() {
        return isSupportRegexp;
    }

    public void setIsSupportRegexp(IsSupportRegexpEnum isSupportRegexp) {
        this.isSupportRegexp = isSupportRegexp;
    }

    public UploadImportExcelTemplateRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadImportExcelTemplateRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadImportExcelTemplateRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("template_type", new FormDataPart<>(templateType));
                put("file", file);
                if (isInstanceLevel != null) {
                    put("is_instance_level", new FormDataPart<>(isInstanceLevel));
                }
                put("selected_dbs", new FormDataPart<>(selectedDbs));
                if (isSupportRegexp != null) {
                    put("is_support_regexp", new FormDataPart<>(isSupportRegexp));
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
        UploadImportExcelTemplateRequestBody that = (UploadImportExcelTemplateRequestBody) obj;
        return Objects.equals(this.templateType, that.templateType) && Objects.equals(this.file, that.file)
            && Objects.equals(this.isInstanceLevel, that.isInstanceLevel)
            && Objects.equals(this.selectedDbs, that.selectedDbs)
            && Objects.equals(this.isSupportRegexp, that.isSupportRegexp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(templateType, file, isInstanceLevel, selectedDbs, isSupportRegexp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadImportExcelTemplateRequestBody {\n");
        sb.append("    templateType: ").append(toIndentedString(templateType)).append("\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    isInstanceLevel: ").append(toIndentedString(isInstanceLevel)).append("\n");
        sb.append("    selectedDbs: ").append(toIndentedString(selectedDbs)).append("\n");
        sb.append("    isSupportRegexp: ").append(toIndentedString(isSupportRegexp)).append("\n");
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
