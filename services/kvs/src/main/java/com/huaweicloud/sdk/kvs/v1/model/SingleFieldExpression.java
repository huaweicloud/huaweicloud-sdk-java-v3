package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.Document;
import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SingleFieldExpression
 */
public class SingleFieldExpression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field")
    @BsonProperty(value = "field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "func")
    @BsonProperty(value = "func")

    private String func;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")
    @BsonProperty(value = "value")

    private Document value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_array")
    @BsonProperty(value = "value_array")

    private List<Document> valueArray = null;

    public SingleFieldExpression withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * 条件字段。
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public SingleFieldExpression withFunc(String func) {
        this.func = func;
        return this;
    }

    /**
     * 条件函数，取值如\"$gt\", $lt\",\"$gte\", $lte\" \"$eq\", \"$ne\", \"$prefix\", \"$in\",\"$nin\", \"$exists\"
     * @return func
     */
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public SingleFieldExpression withValue(Document value) {
        this.value = value;
        return this;
    }

    /**
     * value和value_array二选一。 - value条件值，适用于除\"$in\", \"$nin\"外的func - 字段名无意义，可以传空，也可以传字段名。 - $exists值为true/false > $prefix操作只适用于string和binary类型。
     * @return value
     */
    public Document getValue() {
        return value;
    }

    public void setValue(Document value) {
        this.value = value;
    }

    public SingleFieldExpression withValueArray(List<Document> valueArray) {
        this.valueArray = valueArray;
        return this;
    }

    public SingleFieldExpression addValueArrayItem(Document valueArrayItem) {
        if (this.valueArray == null) {
            this.valueArray = new ArrayList<>();
        }
        this.valueArray.add(valueArrayItem);
        return this;
    }

    public SingleFieldExpression withValueArray(Consumer<List<Document>> valueArraySetter) {
        if (this.valueArray == null) {
            this.valueArray = new ArrayList<>();
        }
        valueArraySetter.accept(this.valueArray);
        return this;
    }

    /**
     * \"value\"和\"value_array\"二选一。 - \"value_array\" 条件值列表, 值用于\"$in\", \"$nin\"
     * @return valueArray
     */
    public List<Document> getValueArray() {
        return valueArray;
    }

    public void setValueArray(List<Document> valueArray) {
        this.valueArray = valueArray;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SingleFieldExpression that = (SingleFieldExpression) obj;
        return Objects.equals(this.field, that.field) && Objects.equals(this.func, that.func)
            && Objects.equals(this.value, that.value) && Objects.equals(this.valueArray, that.valueArray);
    }

    @Override
    public int hashCode() {
        return Objects.hash(field, func, value, valueArray);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SingleFieldExpression {\n");
        sb.append("    field: ").append(toIndentedString(field)).append("\n");
        sb.append("    func: ").append(toIndentedString(func)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    valueArray: ").append(toIndentedString(valueArray)).append("\n");
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
