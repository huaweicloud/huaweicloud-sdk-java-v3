package com.huaweicloud.sdk.kvs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.bson.codecs.pojo.annotations.BsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ConditionExpression
 */
public class ConditionExpression {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_kv_expression")
    @BsonProperty(value = "single_kv_expression")

    private SingleKvExpression singleKvExpression;

    public ConditionExpression withSingleFieldExpression(SingleFieldExpression singleFieldExpression) {
        this.singleFieldExpression = singleFieldExpression;
        return this;
    }

    public ConditionExpression withSingleFieldExpression(Consumer<SingleFieldExpression> singleFieldExpressionSetter) {
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

    public ConditionExpression withMultiFieldExpression(MultiFieldExpression multiFieldExpression) {
        this.multiFieldExpression = multiFieldExpression;
        return this;
    }

    public ConditionExpression withMultiFieldExpression(Consumer<MultiFieldExpression> multiFieldExpressionSetter) {
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

    public ConditionExpression withComposedExpression(ComposedExpression composedExpression) {
        this.composedExpression = composedExpression;
        return this;
    }

    public ConditionExpression withComposedExpression(Consumer<ComposedExpression> composedExpressionSetter) {
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

    public ConditionExpression withSingleKvExpression(SingleKvExpression singleKvExpression) {
        this.singleKvExpression = singleKvExpression;
        return this;
    }

    public ConditionExpression withSingleKvExpression(Consumer<SingleKvExpression> singleKvExpressionSetter) {
        if (this.singleKvExpression == null) {
            this.singleKvExpression = new SingleKvExpression();
            singleKvExpressionSetter.accept(this.singleKvExpression);
        }

        return this;
    }

    /**
     * Get singleKvExpression
     * @return singleKvExpression
     */
    public SingleKvExpression getSingleKvExpression() {
        return singleKvExpression;
    }

    public void setSingleKvExpression(SingleKvExpression singleKvExpression) {
        this.singleKvExpression = singleKvExpression;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConditionExpression that = (ConditionExpression) obj;
        return Objects.equals(this.singleFieldExpression, that.singleFieldExpression)
            && Objects.equals(this.multiFieldExpression, that.multiFieldExpression)
            && Objects.equals(this.composedExpression, that.composedExpression)
            && Objects.equals(this.singleKvExpression, that.singleKvExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleFieldExpression, multiFieldExpression, composedExpression, singleKvExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionExpression {\n");
        sb.append("    singleFieldExpression: ").append(toIndentedString(singleFieldExpression)).append("\n");
        sb.append("    multiFieldExpression: ").append(toIndentedString(multiFieldExpression)).append("\n");
        sb.append("    composedExpression: ").append(toIndentedString(composedExpression)).append("\n");
        sb.append("    singleKvExpression: ").append(toIndentedString(singleKvExpression)).append("\n");
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
