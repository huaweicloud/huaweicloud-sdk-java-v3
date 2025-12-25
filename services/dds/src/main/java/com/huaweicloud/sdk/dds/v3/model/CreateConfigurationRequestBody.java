package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateConfigurationRequestBody
 */
public class CreateConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameter_values")

    private Map<String, String> parameterValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datastore")

    private DatastoreResult datastore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    public CreateConfigurationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 参数模板名称。 **约束限制：** 长度1到64位之间，区分大小写字母，可包含字母、数字、中划线、下划线或句点，不能包含其他特殊字符。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateConfigurationRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 参数模板描述。 **约束限制：** 长度不超过256位，且不能包含回车和>!<\"&'=特殊字符。 **取值范围：** 不涉及。 **默认取值：** 默认为空。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateConfigurationRequestBody withParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
        return this;
    }

    public CreateConfigurationRequestBody putParameterValuesItem(String key, String parameterValuesItem) {
        if (this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        this.parameterValues.put(key, parameterValuesItem);
        return this;
    }

    public CreateConfigurationRequestBody withParameterValues(Consumer<Map<String, String>> parameterValuesSetter) {
        if (this.parameterValues == null) {
            this.parameterValues = new HashMap<>();
        }
        parameterValuesSetter.accept(this.parameterValues);
        return this;
    }

    /**
     * **参数解释：** 参数名和参数值映射关系。用户可以基于默认参数模板的参数，自定义的参数值。 **约束限制：** 当未传入entity_id参数时，此参数必选。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return parameterValues
     */
    public Map<String, String> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(Map<String, String> parameterValues) {
        this.parameterValues = parameterValues;
    }

    public CreateConfigurationRequestBody withDatastore(DatastoreResult datastore) {
        this.datastore = datastore;
        return this;
    }

    public CreateConfigurationRequestBody withDatastore(Consumer<DatastoreResult> datastoreSetter) {
        if (this.datastore == null) {
            this.datastore = new DatastoreResult();
            datastoreSetter.accept(this.datastore);
        }

        return this;
    }

    /**
     * Get datastore
     * @return datastore
     */
    public DatastoreResult getDatastore() {
        return datastore;
    }

    public void setDatastore(DatastoreResult datastore) {
        this.datastore = datastore;
    }

    public CreateConfigurationRequestBody withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * **参数解释：** 实例ID或组ID或节点ID。可以调用“查询实例列表和详情”接口获取。如果未申请实例，可以调用“创建实例”接口创建。 若传入此参数，则会基于此实例、组或节点的参数信息创建参数模板，将会忽略parameter_values和datastore传参。 **约束限制：** 不涉及。 **取值范围：** 当实例类型是集群，取值为shard组或config组的组ID、mongos节点的节点ID、只读节点的节点ID。 当实例类型是副本集，传值为实例ID或只读节点的节点ID。 当实例类型是单节点，传值为实例ID。 **默认取值：** 不涉及。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateConfigurationRequestBody that = (CreateConfigurationRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.parameterValues, that.parameterValues)
            && Objects.equals(this.datastore, that.datastore) && Objects.equals(this.entityId, that.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, parameterValues, datastore, entityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfigurationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
        sb.append("    datastore: ").append(toIndentedString(datastore)).append("\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
