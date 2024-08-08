package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Expression
 */
public class Expression {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_field_expression")
    @BsonProperty(value = "single_field_expression")

    private SingleFieldExpression singleFieldExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_field_expression")
    @BsonProperty(value = "multi_field_expression")

    private MultiFieldExpression multiFieldExpression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "composed_expression")
    @BsonProperty(value = "composed_expression")

    private ComposedExpression composedExpression;

    public Expression withSingleFieldExpression(SingleFieldExpression singleFieldExpression) {
        this.singleFieldExpression = singleFieldExpression;
        return this;
    }

    public Expression withSingleFieldExpression(Consumer<SingleFieldExpression> singleFieldExpressionSetter) {
        if (this.singleFieldExpression == null) {
            this.singleFieldExpression = new SingleFieldExpression();
            singleFieldExpressionSetter.accept(this.singleFieldExpression);
        }

        return this;
    }

    /**
     * Get singleFieldExpression
     * @return singleFieldExpression
     */
    public SingleFieldExpression getSingleFieldExpression() {
        return singleFieldExpression;
    }

    public void setSingleFieldExpression(SingleFieldExpression singleFieldExpression) {
        this.singleFieldExpression = singleFieldExpression;
    }

    public Expression withMultiFieldExpression(MultiFieldExpression multiFieldExpression) {
        this.multiFieldExpression = multiFieldExpression;
        return this;
    }

    public Expression withMultiFieldExpression(Consumer<MultiFieldExpression> multiFieldExpressionSetter) {
        if (this.multiFieldExpression == null) {
            this.multiFieldExpression = new MultiFieldExpression();
            multiFieldExpressionSetter.accept(this.multiFieldExpression);
        }

        return this;
    }

    /**
     * Get multiFieldExpression
     * @return multiFieldExpression
     */
    public MultiFieldExpression getMultiFieldExpression() {
        return multiFieldExpression;
    }

    public void setMultiFieldExpression(MultiFieldExpression multiFieldExpression) {
        this.multiFieldExpression = multiFieldExpression;
    }

    public Expression withComposedExpression(ComposedExpression composedExpression) {
        this.composedExpression = composedExpression;
        return this;
    }

    public Expression withComposedExpression(Consumer<ComposedExpression> composedExpressionSetter) {
        if (this.composedExpression == null) {
            this.composedExpression = new ComposedExpression();
            composedExpressionSetter.accept(this.composedExpression);
        }

        return this;
    }

    /**
     * Get composedExpression
     * @return composedExpression
     */
    public ComposedExpression getComposedExpression() {
        return composedExpression;
    }

    public void setComposedExpression(ComposedExpression composedExpression) {
        this.composedExpression = composedExpression;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Expression that = (Expression) obj;
        return Objects.equals(this.singleFieldExpression, that.singleFieldExpression)
            && Objects.equals(this.multiFieldExpression, that.multiFieldExpression)
            && Objects.equals(this.composedExpression, that.composedExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleFieldExpression, multiFieldExpression, composedExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Expression {\n");
        sb.append("    singleFieldExpression: ").append(toIndentedString(singleFieldExpression)).append("\n");
        sb.append("    multiFieldExpression: ").append(toIndentedString(multiFieldExpression)).append("\n");
        sb.append("    composedExpression: ").append(toIndentedString(composedExpression)).append("\n");
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
