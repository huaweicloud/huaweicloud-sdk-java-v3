package com.huaweicloud.sdk.lakeformation.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 排序顺序规格，决定了数据如何被重新排序以优化查询性能
 */
public class IcebergSortOrder {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private Integer orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<IcebergSortField> fields = null;

    public IcebergSortOrder withOrderId(Integer orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 排序规范的id
     * minimum: 0
     * maximum: 2147483647
     * @return orderId
     */
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public IcebergSortOrder withFields(List<IcebergSortField> fields) {
        this.fields = fields;
        return this;
    }

    public IcebergSortOrder addFieldsItem(IcebergSortField fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public IcebergSortOrder withFields(Consumer<List<IcebergSortField>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * IcebergSortField的数组
     * @return fields
     */
    public List<IcebergSortField> getFields() {
        return fields;
    }

    public void setFields(List<IcebergSortField> fields) {
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
        IcebergSortOrder that = (IcebergSortOrder) obj;
        return Objects.equals(this.orderId, that.orderId) && Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IcebergSortOrder {\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
