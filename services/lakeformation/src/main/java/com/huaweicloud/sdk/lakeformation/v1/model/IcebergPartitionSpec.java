package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 定义了Iceberg表的分区规格，决定了分区表数据在查询优化时的性能。
 */
public class IcebergPartitionSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_id")

    private Integer specId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<IcebergPartitionField> fields = null;

    public IcebergPartitionSpec withSpecId(Integer specId) {
        this.specId = specId;
        return this;
    }

    /**
     * 分区规范id。
     * minimum: 0
     * maximum: 2147483647
     * @return specId
     */
    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public IcebergPartitionSpec withFields(List<IcebergPartitionField> fields) {
        this.fields = fields;
        return this;
    }

    public IcebergPartitionSpec addFieldsItem(IcebergPartitionField fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public IcebergPartitionSpec withFields(Consumer<List<IcebergPartitionField>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * IcebergPartitionField的列表。
     * @return fields
     */
    public List<IcebergPartitionField> getFields() {
        return fields;
    }

    public void setFields(List<IcebergPartitionField> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcebergPartitionSpec that = (IcebergPartitionSpec) obj;
        return Objects.equals(this.specId, that.specId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergPartitionSpec {\n");
        sb.append("    specId: ").append(toIndentedString(specId)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
