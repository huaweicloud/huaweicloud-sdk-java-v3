package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 查询缓存的返回结果。
 */
public class ListCacheDatasResposeResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<FieldVO> fields = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibleFields")

    private List<FieldVO> visibleFields = null;

    public ListCacheDatasResposeResult withFields(List<FieldVO> fields) {
        this.fields = fields;
        return this;
    }

    public ListCacheDatasResposeResult addFieldsItem(FieldVO fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public ListCacheDatasResposeResult withFields(Consumer<List<FieldVO>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * **参数解释：** 全部字段。
     * @return fields
     */
    public List<FieldVO> getFields() {
        return fields;
    }

    public void setFields(List<FieldVO> fields) {
        this.fields = fields;
    }

    public ListCacheDatasResposeResult withVisibleFields(List<FieldVO> visibleFields) {
        this.visibleFields = visibleFields;
        return this;
    }

    public ListCacheDatasResposeResult addVisibleFieldsItem(FieldVO visibleFieldsItem) {
        if (this.visibleFields == null) {
            this.visibleFields = new ArrayList<>();
        }
        this.visibleFields.add(visibleFieldsItem);
        return this;
    }

    public ListCacheDatasResposeResult withVisibleFields(Consumer<List<FieldVO>> visibleFieldsSetter) {
        if (this.visibleFields == null) {
            this.visibleFields = new ArrayList<>();
        }
        visibleFieldsSetter.accept(this.visibleFields);
        return this;
    }

    /**
     * **参数解释：** 表头显示字段。
     * @return visibleFields
     */
    public List<FieldVO> getVisibleFields() {
        return visibleFields;
    }

    public void setVisibleFields(List<FieldVO> visibleFields) {
        this.visibleFields = visibleFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCacheDatasResposeResult that = (ListCacheDatasResposeResult) obj;
        return Objects.equals(this.fields, that.fields) && Objects.equals(this.visibleFields, that.visibleFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields, visibleFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCacheDatasResposeResult {\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
        sb.append("    visibleFields: ").append(toIndentedString(visibleFields)).append("\n");
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
