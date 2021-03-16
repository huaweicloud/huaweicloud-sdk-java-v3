package com.huaweicloud.sdk.roma.v2.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UploadProductRequestBody
 */
public class UploadProductRequestBody implements SdkFormDataBody {


    @com.fasterxml.jackson.annotation.JsonIgnore
    
    private FormDataFilePart file;
    /**
     * 导入模式 1-覆盖 2-跳过
     */
    public static final class ImportModeEnum {

        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ImportModeEnum NUMBER_1 = new ImportModeEnum(1);
        
        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final ImportModeEnum NUMBER_2 = new ImportModeEnum(2);
        

        private static final Map<Integer, ImportModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ImportModeEnum> createStaticFields() {
            Map<Integer, ImportModeEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ImportModeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ImportModeEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ImportModeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ImportModeEnum(value);
            }
            return result;
        }

        public static ImportModeEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ImportModeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ImportModeEnum) {
                return this.value.equals(((ImportModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="import_mode")
    
    private ImportModeEnum importMode;

    public UploadProductRequestBody withFile(FormDataFilePart file) {
        this.file = file;
        return this;
    }

    


    /**
     * 上传产品文件(.zip格式)
     * @return file
     */
    public FormDataFilePart getFile() {
        return file;
    }

    public void setFile(FormDataFilePart file) {
        this.file = file;
    }

    

    public UploadProductRequestBody withImportMode(ImportModeEnum importMode) {
        this.importMode = importMode;
        return this;
    }

    


    /**
     * 导入模式 1-覆盖 2-跳过
     * minimum: 0
     * maximum: 10
     * @return importMode
     */
    public ImportModeEnum getImportMode() {
        return importMode;
    }

    public void setImportMode(ImportModeEnum importMode) {
        this.importMode = importMode;
    }

    
    
    public UploadProductRequestBody withFile(InputStream inputStream, String fileName, String contentType) {
        this.file = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public UploadProductRequestBody withFile(InputStream inputStream, String fileName) {
        this.file = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public UploadProductRequestBody withFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.file = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }
    

    @Override
    public Map<String, FormDataPart> buildFormData() {
        return new LinkedHashMap<String, FormDataPart>() {
            {
                put("file", file);
                put("import_mode", new FormDataPart<>(importMode));
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
        UploadProductRequestBody uploadProductRequestBody = (UploadProductRequestBody) o;
        return Objects.equals(this.file, uploadProductRequestBody.file) &&
            Objects.equals(this.importMode, uploadProductRequestBody.importMode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(file, importMode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UploadProductRequestBody {\n");
        sb.append("    file: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    importMode: ").append(toIndentedString(importMode)).append("\n");
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

