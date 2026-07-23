package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportOpsResultsRequestBody
 */
public class ImportOpsResultsRequestBody {

    /**
     * **参数解释：** 指定导入来源的任务类型。 **约束限制：** 枚举值。 **取值范围：** 字符长度1-100，evaluation-task(评测记录)，datasets-synthesis(合成样本)。 **默认取值：** 不涉及。 
     */
    public static final class TypeEnum {

        /**
         * Enum EVALUATION_TASK for value: "evaluation-task"
         */
        public static final TypeEnum EVALUATION_TASK = new TypeEnum("evaluation-task");

        /**
         * Enum DATASETS_SYNTHESIS for value: "datasets-synthesis"
         */
        public static final TypeEnum DATASETS_SYNTHESIS = new TypeEnum("datasets-synthesis");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("evaluation-task", EVALUATION_TASK);
            map.put("datasets-synthesis", DATASETS_SYNTHESIS);
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
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_name")

    private String datasetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataset_description")

    private String datasetDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_published")

    private Boolean isPublished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "overwrite")

    private Boolean overwrite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_mapping")

    private List<ImportOpsResultsRequestBodySchemaMapping> schemaMapping = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private List<String> ids = null;

    public ImportOpsResultsRequestBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释：** 指定导入来源的任务类型。 **约束限制：** 枚举值。 **取值范围：** 字符长度1-100，evaluation-task(评测记录)，datasets-synthesis(合成样本)。 **默认取值：** 不涉及。 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ImportOpsResultsRequestBody withDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }

    /**
     * **参数解释：** 目标评测集的唯一标识符。为空时将触发创建新评测集。 **约束限制：** 1-64个字符。 **取值范围：** 字符长度1-64，已存在的评测集ID。 **默认取值：** 不涉及。 
     * @return datasetId
     */
    public String getDatasetId() {
        return datasetId;
    }

    public void setDatasetId(String datasetId) {
        this.datasetId = datasetId;
    }

    public ImportOpsResultsRequestBody withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * **参数解释：** 待导入数据所属的源任务ID。 **约束限制：** 1-64个字符。 **取值范围：** 字符长度1-64，合法的任务ID。 **默认取值：** 不涉及。 
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ImportOpsResultsRequestBody withDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    /**
     * **参数解释：** 当 dataset_id 为空时，定义新建评测集的名称。 **约束限制：** 2-100个字符。 **取值范围：** 任意字符串。 **默认取值：** 不涉及。 
     * @return datasetName
     */
    public String getDatasetName() {
        return datasetName;
    }

    public void setDatasetName(String datasetName) {
        this.datasetName = datasetName;
    }

    public ImportOpsResultsRequestBody withDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }

    /**
     * **参数解释：** 为新建评测集提供的详细功能或内容描述。 **约束限制：** 0-400个字符。 **取值范围：** 字符长度0-400，任意描述性文本。 **默认取值：** 不涉及。 
     * @return datasetDescription
     */
    public String getDatasetDescription() {
        return datasetDescription;
    }

    public void setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
    }

    public ImportOpsResultsRequestBody withIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
        return this;
    }

    /**
     * **参数解释：** 是否在导入完成后自动发布为一个正式版本。 **约束限制：** 布尔值。 **取值范围：** true(自动发布)，false(存入草稿)。 **默认取值：** false。 
     * @return isPublished
     */
    public Boolean getIsPublished() {
        return isPublished;
    }

    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    public ImportOpsResultsRequestBody withOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
        return this;
    }

    /**
     * **参数解释：** 当目标评测集已存在数据时，是否清空原有数据再执行导入。 **约束限制：** 布尔值。 **取值范围：** true(全量覆盖)，false(增量追加)。 **默认取值：** false。 
     * @return overwrite
     */
    public Boolean getOverwrite() {
        return overwrite;
    }

    public void setOverwrite(Boolean overwrite) {
        this.overwrite = overwrite;
    }

    public ImportOpsResultsRequestBody withSchemaMapping(List<ImportOpsResultsRequestBodySchemaMapping> schemaMapping) {
        this.schemaMapping = schemaMapping;
        return this;
    }

    public ImportOpsResultsRequestBody addSchemaMappingItem(
        ImportOpsResultsRequestBodySchemaMapping schemaMappingItem) {
        if (this.schemaMapping == null) {
            this.schemaMapping = new ArrayList<>();
        }
        this.schemaMapping.add(schemaMappingItem);
        return this;
    }

    public ImportOpsResultsRequestBody withSchemaMapping(
        Consumer<List<ImportOpsResultsRequestBodySchemaMapping>> schemaMappingSetter) {
        if (this.schemaMapping == null) {
            this.schemaMapping = new ArrayList<>();
        }
        schemaMappingSetter.accept(this.schemaMapping);
        return this;
    }

    /**
     * **参数解释：** 字段映射规则列表，定义源字段如何对应到目标评测集字段。 **约束限制：** 数组长度1-100。 **取值范围：** 包含source, target, type的对象。 **默认取值：** 不涉及。 
     * @return schemaMapping
     */
    public List<ImportOpsResultsRequestBodySchemaMapping> getSchemaMapping() {
        return schemaMapping;
    }

    public void setSchemaMapping(List<ImportOpsResultsRequestBodySchemaMapping> schemaMapping) {
        this.schemaMapping = schemaMapping;
    }

    public ImportOpsResultsRequestBody withIds(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public ImportOpsResultsRequestBody addIdsItem(String idsItem) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        this.ids.add(idsItem);
        return this;
    }

    public ImportOpsResultsRequestBody withIds(Consumer<List<String>> idsSetter) {
        if (this.ids == null) {
            this.ids = new ArrayList<>();
        }
        idsSetter.accept(this.ids);
        return this;
    }

    /**
     * **参数解释：** 需要执行导入操作的具体条目ID列表，通过数据集列表接口获取。 **约束限制：** 包含1-500个数据项ID。 **取值范围：** 每项1-64个字符。 **默认取值：** 不涉及。 
     * @return ids
     */
    public List<String> getIds() {
        return ids;
    }

    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportOpsResultsRequestBody that = (ImportOpsResultsRequestBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.datasetId, that.datasetId)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.datasetName, that.datasetName)
            && Objects.equals(this.datasetDescription, that.datasetDescription)
            && Objects.equals(this.isPublished, that.isPublished) && Objects.equals(this.overwrite, that.overwrite)
            && Objects.equals(this.schemaMapping, that.schemaMapping) && Objects.equals(this.ids, that.ids);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, datasetId, taskId, datasetName, datasetDescription, isPublished, overwrite, schemaMapping, ids);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOpsResultsRequestBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    datasetName: ").append(toIndentedString(datasetName)).append("\n");
        sb.append("    datasetDescription: ").append(toIndentedString(datasetDescription)).append("\n");
        sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
        sb.append("    overwrite: ").append(toIndentedString(overwrite)).append("\n");
        sb.append("    schemaMapping: ").append(toIndentedString(schemaMapping)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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
