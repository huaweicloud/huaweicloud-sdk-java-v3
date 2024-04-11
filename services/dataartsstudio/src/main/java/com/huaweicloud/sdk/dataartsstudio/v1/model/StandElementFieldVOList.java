package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 属性列表。
 */
public class StandElementFieldVOList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fields")

    private List<StandElementFieldVO> fields = null;

    public StandElementFieldVOList withFields(List<StandElementFieldVO> fields) {
        this.fields = fields;
        return this;
    }

    public StandElementFieldVOList addFieldsItem(StandElementFieldVO fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    public StandElementFieldVOList withFields(Consumer<List<StandElementFieldVO>> fieldsSetter) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        fieldsSetter.accept(this.fields);
        return this;
    }

    /**
     * 属性信息。
     * @return fields
     */
    public List<StandElementFieldVO> getFields() {
        return fields;
    }

    public void setFields(List<StandElementFieldVO> fields) {
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
        StandElementFieldVOList that = (StandElementFieldVOList) obj;
        return Objects.equals(this.fields, that.fields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StandElementFieldVOList {\n");
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
