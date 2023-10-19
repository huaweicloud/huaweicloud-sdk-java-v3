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
 * SingleFieldExpr
 */
public class SingleFieldExpr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Field")
    @BsonProperty(value = "Field")

    private String field;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Func")
    @BsonProperty(value = "Func")

    private String func;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Value")
    @BsonProperty(value = "Value")

    private Document value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ValueArray")
    @BsonProperty(value = "ValueArray")

    private List<Document> valueArray = null;

    public SingleFieldExpr withField(String field) {
        this.field = field;
        return this;
    }

    /**
     * Get field
     * @return field
     */
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public SingleFieldExpr withFunc(String func) {
        this.func = func;
        return this;
    }

    /**
     * Get func
     * @return func
     */
    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func;
    }

    public SingleFieldExpr withValue(Document value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     */
    public Document getValue() {
        return value;
    }

    public void setValue(Document value) {
        this.value = value;
    }

    public SingleFieldExpr withValueArray(List<Document> valueArray) {
        this.valueArray = valueArray;
        return this;
    }

    public SingleFieldExpr addValueArrayItem(Document valueArrayItem) {
        if (this.valueArray == null) {
            this.valueArray = new ArrayList<>();
        }
        this.valueArray.add(valueArrayItem);
        return this;
    }

    public SingleFieldExpr withValueArray(Consumer<List<Document>> valueArraySetter) {
        if (this.valueArray == null) {
            this.valueArray = new ArrayList<>();
        }
        valueArraySetter.accept(this.valueArray);
        return this;
    }

    /**
     * Get valueArray
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
        SingleFieldExpr that = (SingleFieldExpr) obj;
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
        sb.append("class SingleFieldExpr {\n");
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
