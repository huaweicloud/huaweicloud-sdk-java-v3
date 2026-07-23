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
 * EvaluationOpsSeedDataCreateConfig
 */
public class EvaluationOpsSeedDataCreateConfig {

    /**
     * **参数解释：**   指定种子数据的来源类型。 **约束限制：**   枚举值。 **取值范围：**   字符长度1-100，dataset(平台评测集),file(本地上传文件)。 **默认取值：**   不涉及。 
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
    @JsonProperty(value = "dataset_version_id")

    private String datasetVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_tmp_file_id")

    private String obsTmpFileId;

    public EvaluationOpsSeedDataCreateConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：**   指定种子数据的来源类型。 **约束限制：**   枚举值。 **取值范围：**   字符长度1-100，dataset(平台评测集),file(本地上传文件)。 **默认取值：**   不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public EvaluationOpsSeedDataCreateConfig withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：**   种子评测集的唯一标识符，通过数据集列表接口获取。 **约束限制：**   0-64个字符；当type为dataset时必填。 **取值范围：**   字符长度0-64，已存在的评测集ID。 **默认取值：**   不涉及。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public EvaluationOpsSeedDataCreateConfig withDatasetVersionId(String datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
        return this;
    }

    /**
     * **参数解释：**   指定种子评测集的具体版本标识。 **约束限制：**   0-64个字符。 **取值范围：**   已发布或草稿版本的ID。 **默认取值：**   指向草稿版本。 
     * @return datasetVersionId
     */
    public String getDatasetVersionId() {
        return datasetVersionId;
    }

    public void setDatasetVersionId(String datasetVersionId) {
        this.datasetVersionId = datasetVersionId;
    }

    public EvaluationOpsSeedDataCreateConfig withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释：**   上传的种子数据文件的原始名称。 **约束限制：**   1-200个字符，当type为file时必填。 **取值范围：**   1-200个字符，合法的文件名。 **默认取值：**   不涉及。 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public EvaluationOpsSeedDataCreateConfig withObsTmpFileId(String obsTmpFileId) {
        this.obsTmpFileId = obsTmpFileId;
        return this;
    }

    /**
     * **参数解释：**   种子数据文件在OBS中的临时存储路径。 **约束限制：**   最大长度10000字符。 **取值范围：**   OBS路径字符串。 **默认取值：**   不涉及。 
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
        EvaluationOpsSeedDataCreateConfig that = (EvaluationOpsSeedDataCreateConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.datasetVersionId, that.datasetVersionId)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.obsTmpFileId, that.obsTmpFileId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, datasetId, datasetVersionId, fileName, obsTmpFileId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationOpsSeedDataCreateConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    datasetVersionId: ").append(toIndentedString(datasetVersionId)).append("\n");
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
