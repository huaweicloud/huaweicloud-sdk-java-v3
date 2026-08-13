package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PaimonSchema模型。
 */
public class PaimonSchema {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<PaimonField> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitionKeys")

    private List<String> partitionKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primaryKeys")

    private List<String> primaryKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private Map<String, String> options = null;

    public PaimonSchema withFields(List<PaimonField> fields) {
        this.fields = fields;
        return this;
    }

    public PaimonSchema addFieldsItem(PaimonField fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public PaimonSchema withFields(Consumer<List<PaimonField>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 字段列表，定义表的所有列及其类型。
     * @return fields
     */
    public List<PaimonField> getFields() {
        return fields;
    }

    public void setFields(List<PaimonField> fields) {
        this.fields = fields;
    }

    public PaimonSchema withPartitionKeys(List<String> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }

    public PaimonSchema addPartitionKeysItem(String partitionKeysItem) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        this.partitionKeys.add(partitionKeysItem);
        return this;
    }

    public PaimonSchema withPartitionKeys(Consumer<List<String>> partitionKeysSetter) {
        if (this.partitionKeys == null) {
            this.partitionKeys = new ArrayList<>();
        }
        partitionKeysSetter.accept(this.partitionKeys);
        return this;
    }

    /**
     * 分区建集合
     * @return partitionKeys
     */
    public List<String> getPartitionKeys() {
        return partitionKeys;
    }

    public void setPartitionKeys(List<String> partitionKeys) {
        this.partitionKeys = partitionKeys;
    }

    public PaimonSchema withPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }

    public PaimonSchema addPrimaryKeysItem(String primaryKeysItem) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        this.primaryKeys.add(primaryKeysItem);
        return this;
    }

    public PaimonSchema withPrimaryKeys(Consumer<List<String>> primaryKeysSetter) {
        if (this.primaryKeys == null) {
            this.primaryKeys = new ArrayList<>();
        }
        primaryKeysSetter.accept(this.primaryKeys);
        return this;
    }

    /**
     * 主键集合
     * @return primaryKeys
     */
    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    public void setPrimaryKeys(List<String> primaryKeys) {
        this.primaryKeys = primaryKeys;
    }

    public PaimonSchema withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }

    public PaimonSchema putOptionsItem(String key, String optionsItem) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        this.options.put(key, optionsItem);
        return this;
    }

    public PaimonSchema withOptions(Consumer<Map<String, String>> optionsSetter) {
        if (this.options == null) {
            this.options = new HashMap<>();
        }
        optionsSetter.accept(this.options);
        return this;
    }

    /**
     * Paimon表属性
     * @return options
     */
    public Map<String, String> getOptions() {
        return options;
    }

    public void setOptions(Map<String, String> options) {
        this.options = options;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaimonSchema that = (PaimonSchema) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.partitionKeys, that.partitionKeys)
            && Objects.equals(this.primaryKeys, that.primaryKeys) && Objects.equals(this.options, that.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, partitionKeys, primaryKeys, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaimonSchema {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    partitionKeys: ").append(toIndentedString(partitionKeys)).append("\n");
        sb.append("    primaryKeys: ").append(toIndentedString(primaryKeys)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
