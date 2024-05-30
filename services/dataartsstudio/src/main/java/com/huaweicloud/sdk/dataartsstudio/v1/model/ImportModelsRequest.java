package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ImportModelsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")

    private String xProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    private String xLanguage;

    /**
     * 需要执行的动作，根据导入的对象不同而选择不同的导入动作。 枚举值：   - import_relation: 导入关系模型：逻辑实体/物理表   - import_dimension: 导入维度表、事实表   - import_codetable: 导入码表   - import_datastandard: 导入数据标准   - import_bizmetric: 导入业务指标   - import_bizcatalog: 导入流程架构   - import_atomic: 导入原子指标   - import_derivative: 导入衍生指标   - import_compound: 导入复合指标   - import_aggregation: 导入汇总表 
     */
    public static final class ActionIdEnum {

        /**
         * Enum IMPORT_RELATION for value: "import_relation"
         */
        public static final ActionIdEnum IMPORT_RELATION = new ActionIdEnum("import_relation");

        /**
         * Enum IMPORT_DIMENSION for value: "import_dimension"
         */
        public static final ActionIdEnum IMPORT_DIMENSION = new ActionIdEnum("import_dimension");

        /**
         * Enum IMPORT_CODETABLE for value: "import_codetable"
         */
        public static final ActionIdEnum IMPORT_CODETABLE = new ActionIdEnum("import_codetable");

        /**
         * Enum IMPORT_DATASTANDARD for value: "import_datastandard"
         */
        public static final ActionIdEnum IMPORT_DATASTANDARD = new ActionIdEnum("import_datastandard");

        /**
         * Enum IMPORT_BIZMETRIC for value: "import_bizmetric"
         */
        public static final ActionIdEnum IMPORT_BIZMETRIC = new ActionIdEnum("import_bizmetric");

        /**
         * Enum IMPORT_BIZCATALOG for value: "import_bizcatalog"
         */
        public static final ActionIdEnum IMPORT_BIZCATALOG = new ActionIdEnum("import_bizcatalog");

        /**
         * Enum IMPORT_ATOMIC for value: "import_atomic"
         */
        public static final ActionIdEnum IMPORT_ATOMIC = new ActionIdEnum("import_atomic");

        /**
         * Enum IMPORT_DERIVATIVE for value: "import_derivative"
         */
        public static final ActionIdEnum IMPORT_DERIVATIVE = new ActionIdEnum("import_derivative");

        /**
         * Enum IMPORT_COMPOUND for value: "import_compound"
         */
        public static final ActionIdEnum IMPORT_COMPOUND = new ActionIdEnum("import_compound");

        /**
         * Enum IMPORT_AGGREGATION for value: "import_aggregation"
         */
        public static final ActionIdEnum IMPORT_AGGREGATION = new ActionIdEnum("import_aggregation");

        private static final Map<String, ActionIdEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionIdEnum> createStaticFields() {
            Map<String, ActionIdEnum> map = new HashMap<>();
            map.put("import_relation", IMPORT_RELATION);
            map.put("import_dimension", IMPORT_DIMENSION);
            map.put("import_codetable", IMPORT_CODETABLE);
            map.put("import_datastandard", IMPORT_DATASTANDARD);
            map.put("import_bizmetric", IMPORT_BIZMETRIC);
            map.put("import_bizcatalog", IMPORT_BIZCATALOG);
            map.put("import_atomic", IMPORT_ATOMIC);
            map.put("import_derivative", IMPORT_DERIVATIVE);
            map.put("import_compound", IMPORT_COMPOUND);
            map.put("import_aggregation", IMPORT_AGGREGATION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionIdEnum(String value) {
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
        public static ActionIdEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionIdEnum(value));
        }

        public static ActionIdEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionIdEnum) {
                return this.value.equals(((ActionIdEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action-id")

    private ActionIdEnum actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_id")

    private String modelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_id")

    private String directoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip-exist")

    private Boolean skipExist;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ImportModelsRequestBody body;

    public ImportModelsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * 工作空间ID，获取方法请参见[实例ID和工作空间ID](dataartsstudio_02_0350.xml)。
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ImportModelsRequest withXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
        return this;
    }

    /**
     * 项目ID，获取方法请参见[项目ID和账号ID](projectid_accountid.xml)。  多project场景采用AK/SK认证的接口请求，则该字段必选。
     * @return xProjectId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Project-Id")
    public String getXProjectId() {
        return xProjectId;
    }

    public void setXProjectId(String xProjectId) {
        this.xProjectId = xProjectId;
    }

    public ImportModelsRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 默认值：en-us 可选，导入导出接口必填，可选值有：zh-cn、en-us，分别表示中文、英文。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ImportModelsRequest withActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * 需要执行的动作，根据导入的对象不同而选择不同的导入动作。 枚举值：   - import_relation: 导入关系模型：逻辑实体/物理表   - import_dimension: 导入维度表、事实表   - import_codetable: 导入码表   - import_datastandard: 导入数据标准   - import_bizmetric: 导入业务指标   - import_bizcatalog: 导入流程架构   - import_atomic: 导入原子指标   - import_derivative: 导入衍生指标   - import_compound: 导入复合指标   - import_aggregation: 导入汇总表 
     * @return actionId
     */
    public ActionIdEnum getActionId() {
        return actionId;
    }

    public void setActionId(ActionIdEnum actionId) {
        this.actionId = actionId;
    }

    public ImportModelsRequest withModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }

    /**
     * 关系建模的模型ID，在导入模型（import_relation）时必填。
     * @return modelId
     */
    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public ImportModelsRequest withDirectoryId(String directoryId) {
        this.directoryId = directoryId;
        return this;
    }

    /**
     * 导入的目录id，在导入码表（import_codetable）和数据标准（import_datastandard）时生效，选填。
     * @return directoryId
     */
    public String getDirectoryId() {
        return directoryId;
    }

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    public ImportModelsRequest withSkipExist(Boolean skipExist) {
        this.skipExist = skipExist;
        return this;
    }

    /**
     * 是否需要覆盖更新已有的实体。
     * @return skipExist
     */
    public Boolean getSkipExist() {
        return skipExist;
    }

    public void setSkipExist(Boolean skipExist) {
        this.skipExist = skipExist;
    }

    public ImportModelsRequest withBody(ImportModelsRequestBody body) {
        this.body = body;
        return this;
    }

    public ImportModelsRequest withBody(Consumer<ImportModelsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ImportModelsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ImportModelsRequestBody getBody() {
        return body;
    }

    public void setBody(ImportModelsRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportModelsRequest that = (ImportModelsRequest) obj;
        return Objects.equals(this.workspace, that.workspace) && Objects.equals(this.xProjectId, that.xProjectId)
            && Objects.equals(this.xLanguage, that.xLanguage) && Objects.equals(this.actionId, that.actionId)
            && Objects.equals(this.modelId, that.modelId) && Objects.equals(this.directoryId, that.directoryId)
            && Objects.equals(this.skipExist, that.skipExist) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workspace, xProjectId, xLanguage, actionId, modelId, directoryId, skipExist, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportModelsRequest {\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    xProjectId: ").append(toIndentedString(xProjectId)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
        sb.append("    directoryId: ").append(toIndentedString(directoryId)).append("\n");
        sb.append("    skipExist: ").append(toIndentedString(skipExist)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
