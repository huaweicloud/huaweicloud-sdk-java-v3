package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * EvaluationOpsSeedDataConfig
 */
public class EvaluationOpsSeedDataConfig {

    /**
     * **参数解释：**   种子数据的来源类型。 **取值范围：**   dataset(评测集)，file(文件)。 
     */
    public static final class TypeEnum {

        /**
         * Enum DATASET for value: "dataset"
         */
        public static final TypeEnum DATASET = new TypeEnum("dataset");

        /**
         * Enum FILE for value: "file"
         */
        public static final TypeEnum FILE = new TypeEnum("file");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("dataset", DATASET);
            map.put("file", FILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_id")

    private String datasetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_version_id")

    private String datasetVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_version")

    private String datasetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_tmp_file_id")

    private String obsTmpFileId;

    public EvaluationOpsSeedDataConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**   种子数据的来源类型。 **取值范围：**   dataset(评测集)，file(文件)。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EvaluationOpsSeedDataConfig withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：**   种子评测集的唯一ID。 **取值范围：**   符合通用唯一识别码(UUID)标准的字符串。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public EvaluationOpsSeedDataConfig withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * **参数解释：**   种子评测集的展示名称。 **取值范围：**   任意字符串。 
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public EvaluationOpsSeedDataConfig withDatasetVersionId(String datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
        return this;
    }

    /**
     * **参数解释：**   种子评测集版本的内部唯一标识符。 **取值范围：**   符合通用唯一识别码(UUID)标准的字符串。 
     * @return datasetVersionId
     */
    public String getDatasetVersionId() {
        return datasetVersionId;
    }

    public void setDatasetVersionId(String datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
    }

    public EvaluationOpsSeedDataConfig withDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
        return this;
    }

    /**
     * **参数解释：**   种子评测集的可读版本号。 **取值范围：**   如0.0.1。 
     * @return datasetVersion
     */
    public String getDatasetVersion() {
        return datasetVersion;
    }

    public void setDatasetVersion(String datasetVersion) {
        this.datasetVersion = datasetVersion;
    }

    public EvaluationOpsSeedDataConfig withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释：**   作为种子源的临时文件名称。 **取值范围：**   文件名。 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public EvaluationOpsSeedDataConfig withObsTmpFileId(String obsTmpFileId) {
        this.obsTmpFileId = obsTmpFileId;
        return this;
    }

    /**
     * **参数解释：**   种子数据文件在对象存储中的路径。 **取值范围：**   OBS路径。 
     * @return obsTmpFileId
     */
    public String getObsTmpFileId() {
        return obsTmpFileId;
    }

    public void setObsTmpFileId(String obsTmpFileId) {
        this.obsTmpFileId = obsTmpFileId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EvaluationOpsSeedDataConfig that = (EvaluationOpsSeedDataConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.datasetVersionId, that.datasetVersionId)
            && Objects.equals(this.datasetVersion, that.datasetVersion) && Objects.equals(this.fileName, that.fileName)
            && Objects.equals(this.obsTmpFileId, that.obsTmpFileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, datasetId, datasetName, datasetVersionId, datasetVersion, fileName, obsTmpFileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSeedDataConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    datasetVersionId: ").append(toIndentedString(datasetVersionId)).append("\n");
        sb.append("    datasetVersion: ").append(toIndentedString(datasetVersion)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    obsTmpFileId: ").append(toIndentedString(obsTmpFileId)).append("\n");
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
