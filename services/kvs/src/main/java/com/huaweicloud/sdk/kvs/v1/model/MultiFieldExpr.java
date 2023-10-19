package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiFieldExpr
 */
public class MultiFieldExpr {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Logic")
    @BsonProperty(value = "Logic")

    private String logic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Array")
    @BsonProperty(value = "Array")

    private List<SingleFieldExpr> array = null;

    public MultiFieldExpr withLogic(String logic) {
        this.logic = logic;
        return this;
    }

    /**
     * Get logic
     * @return logic
     */
    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public MultiFieldExpr withArray(List<SingleFieldExpr> array) {
        this.array = array;
        return this;
    }

    public MultiFieldExpr addArrayItem(SingleFieldExpr arrayItem) {
        if (this.array == null) {
            this.array = new ArrayList<>();
        }
        this.array.add(arrayItem);
        return this;
    }

    public MultiFieldExpr withArray(Consumer<List<SingleFieldExpr>> arraySetter) {
        if (this.array == null) {
            this.array = new ArrayList<>();
        }
        arraySetter.accept(this.array);
        return this;
    }

    /**
     * Get array
     * @return array
     */
    public List<SingleFieldExpr> getArray() {
        return array;
    }

    public void setArray(List<SingleFieldExpr> array) {
        this.array = array;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiFieldExpr that = (MultiFieldExpr) obj;
        return Objects.equals(this.logic, that.logic) && Objects.equals(this.array, that.array);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logic, array);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiFieldExpr {\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    array: ").append(toIndentedString(array)).append("\n");
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
