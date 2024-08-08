package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MultiFieldExpression
 */
public class MultiFieldExpression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic")
    @BsonProperty(value = "logic")

    private String logic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expressions")
    @BsonProperty(value = "expressions")

    private List<SingleFieldExpression> expressions = null;

    public MultiFieldExpression withLogic(String logic) {
        this.logic = logic;
        return this;
    }

    /**
     * 多字段条件，多个相同优先级的单字段条件。
     * @return logic
     */
    public String getLogic() {
        return logic;
    }

    public void setLogic(String logic) {
        this.logic = logic;
    }

    public MultiFieldExpression withExpressions(List<SingleFieldExpression> expressions) {
        this.expressions = expressions;
        return this;
    }

    public MultiFieldExpression addExpressionsItem(SingleFieldExpression expressionsItem) {
        if (this.expressions == null) {
            this.expressions = new ArrayList<>();
        }
        this.expressions.add(expressionsItem);
        return this;
    }

    public MultiFieldExpression withExpressions(Consumer<List<SingleFieldExpression>> expressionsSetter) {
        if (this.expressions == null) {
            this.expressions = new ArrayList<>();
        }
        expressionsSetter.accept(this.expressions);
        return this;
    }

    /**
     * 多个相同逻辑操作的单字段条件。
     * @return expressions
     */
    public List<SingleFieldExpression> getExpressions() {
        return expressions;
    }

    public void setExpressions(List<SingleFieldExpression> expressions) {
        this.expressions = expressions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiFieldExpression that = (MultiFieldExpression) obj;
        return Objects.equals(this.logic, that.logic) && Objects.equals(this.expressions, that.expressions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logic, expressions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiFieldExpression {\n");
        sb.append("    logic: ").append(toIndentedString(logic)).append("\n");
        sb.append("    expressions: ").append(toIndentedString(expressions)).append("\n");
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
