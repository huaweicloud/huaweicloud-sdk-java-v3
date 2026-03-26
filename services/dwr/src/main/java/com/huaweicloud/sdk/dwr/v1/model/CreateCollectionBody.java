package com.huaweicloud.sdk.dwr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCollectionBody
 */
public class CreateCollectionBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "store_name")

    private String storeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_name")

    private String collectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_field")

    private PrimaryField primaryField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<Field> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_params")

    private List<IndexParam> indexParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    private Map<String, Object> params = null;

    public CreateCollectionBody withStoreName(String storeName) {
        this.storeName = storeName;
        return this;
    }

    /**
     * **参数解释：** 知识仓实例名称，region内唯一。 **约束限制：** 长度范围为3到63个字符，支持小写字母、数字、中划线（-），第一个字符只能够是小写字母，中划线(-)不得出现在字符串末尾。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return storeName
     */
    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public CreateCollectionBody withCollectionName(String collectionName) {
        this.collectionName = collectionName;
        return this;
    }

    /**
     * **参数解释：** collection名称。 **约束限制：** 可包含数字、字母和下划线 ( _ )。资源名称必须以字母或下划线 ( _ ) 开头。最大长度支持255。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return collectionName
     */
    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public CreateCollectionBody withPrimaryField(PrimaryField primaryField) {
        this.primaryField = primaryField;
        return this;
    }

    public CreateCollectionBody withPrimaryField(Consumer<PrimaryField> primaryFieldSetter) {
        if (this.primaryField == null) {
            this.primaryField = new PrimaryField();
            primaryFieldSetter.accept(this.primaryField);
        }

        return this;
    }

    /**
     * Get primaryField
     * @return primaryField
     */
    public PrimaryField getPrimaryField() {
        return primaryField;
    }

    public void setPrimaryField(PrimaryField primaryField) {
        this.primaryField = primaryField;
    }

    public CreateCollectionBody withFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public CreateCollectionBody addFieldsItem(Field fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public CreateCollectionBody withFields(Consumer<List<Field>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** 集合中通用字段，创建列的schema。 **约束限制：** 不涉及。
     * @return fields
     */
    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public CreateCollectionBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 指定 Collection 的描述信息。 **约束限制：** 有效长度0-255字节。 **取值范围：** 不涉及。 **默认取值:** 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCollectionBody withIndexParams(List<IndexParam> indexParams) {
        this.indexParams = indexParams;
        return this;
    }

    public CreateCollectionBody addIndexParamsItem(IndexParam indexParamsItem) {
        if (this.indexParams == null) {
            this.indexParams = new ArrayList<>();
        }
        this.indexParams.add(indexParamsItem);
        return this;
    }

    public CreateCollectionBody withIndexParams(Consumer<List<IndexParam>> indexParamsSetter) {
        if (this.indexParams == null) {
            this.indexParams = new ArrayList<>();
        }
        indexParamsSetter.accept(this.indexParams);
        return this;
    }

    /**
     * **参数解释：** 索引的配置信息。 **约束限制：** 不涉及。
     * @return indexParams
     */
    public List<IndexParam> getIndexParams() {
        return indexParams;
    }

    public void setIndexParams(List<IndexParam> indexParams) {
        this.indexParams = indexParams;
    }

    public CreateCollectionBody withParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public CreateCollectionBody putParamsItem(String key, Object paramsItem) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        this.params.put(key, paramsItem);
        return this;
    }

    public CreateCollectionBody withParams(Consumer<Map<String, Object>> paramsSetter) {
        if (this.params == null) {
            this.params = new HashMap<>();
        }
        paramsSetter.accept(this.params);
        return this;
    }

    /**
     * **参数解释：** collection常用参数。 **约束限制：** shards_num: 默认2，取值范围[1, 16] partitions_num: 默认4，取值范围[1, 1024]，若所有field的partition_key为false，则partitions_num固定为1。 max_length: 默认256，取值范围[1, 65535]，当primary_field.type为String时，指示String的最大长度。
     * @return params
     */
    public Map<String, Object> getParams() {
        return params;
    }

    public void setParams(Map<String, Object> params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCollectionBody that = (CreateCollectionBody) obj;
        return Objects.equals(this.storeName, that.storeName)
            && Objects.equals(this.collectionName, that.collectionName)
            && Objects.equals(this.primaryField, that.primaryField) && Objects.equals(this.fields, that.fields)
            && Objects.equals(this.description, that.description) && Objects.equals(this.indexParams, that.indexParams)
            && Objects.equals(this.params, that.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(storeName, collectionName, primaryField, fields, description, indexParams, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCollectionBody {\n");
        sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
        sb.append("    collectionName: ").append(toIndentedString(collectionName)).append("\n");
        sb.append("    primaryField: ").append(toIndentedString(primaryField)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    indexParams: ").append(toIndentedString(indexParams)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
