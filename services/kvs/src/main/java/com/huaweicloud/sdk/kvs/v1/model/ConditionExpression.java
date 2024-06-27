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
            && Objects.equals(this.multiFieldExpression, that.multiFieldExpression);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleFieldExpression, multiFieldExpression);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionExpression {\n");
        sb.append("    singleFieldExpression: ").append(toIndentedString(singleFieldExpression)).append("\n");
        sb.append("    multiFieldExpression: ").append(toIndentedString(multiFieldExpression)).append("\n");
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
