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
    @JsonProperty(value = "SingleFieldExpr")
    @BsonProperty(value = "SingleFieldExpr")

    private SingleFieldExpr singleFieldExpr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MultiFieldExpr")
    @BsonProperty(value = "MultiFieldExpr")

    private MultiFieldExpr multiFieldExpr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "SingleKvExpr")
    @BsonProperty(value = "SingleKvExpr")

    private SingleKvExpr singleKvExpr;

    public ConditionExpression withSingleFieldExpr(SingleFieldExpr singleFieldExpr) {
        this.singleFieldExpr = singleFieldExpr;
        return this;
    }

    public ConditionExpression withSingleFieldExpr(Consumer<SingleFieldExpr> singleFieldExprSetter) {
        if (this.singleFieldExpr == null) {
            this.singleFieldExpr = new SingleFieldExpr();
            singleFieldExprSetter.accept(this.singleFieldExpr);
        }

        return this;
    }

    /**
     * Get singleFieldExpr
     * @return singleFieldExpr
     */
    public SingleFieldExpr getSingleFieldExpr() {
        return singleFieldExpr;
    }

    public void setSingleFieldExpr(SingleFieldExpr singleFieldExpr) {
        this.singleFieldExpr = singleFieldExpr;
    }

    public ConditionExpression withMultiFieldExpr(MultiFieldExpr multiFieldExpr) {
        this.multiFieldExpr = multiFieldExpr;
        return this;
    }

    public ConditionExpression withMultiFieldExpr(Consumer<MultiFieldExpr> multiFieldExprSetter) {
        if (this.multiFieldExpr == null) {
            this.multiFieldExpr = new MultiFieldExpr();
            multiFieldExprSetter.accept(this.multiFieldExpr);
        }

        return this;
    }

    /**
     * Get multiFieldExpr
     * @return multiFieldExpr
     */
    public MultiFieldExpr getMultiFieldExpr() {
        return multiFieldExpr;
    }

    public void setMultiFieldExpr(MultiFieldExpr multiFieldExpr) {
        this.multiFieldExpr = multiFieldExpr;
    }

    public ConditionExpression withSingleKvExpr(SingleKvExpr singleKvExpr) {
        this.singleKvExpr = singleKvExpr;
        return this;
    }

    public ConditionExpression withSingleKvExpr(Consumer<SingleKvExpr> singleKvExprSetter) {
        if (this.singleKvExpr == null) {
            this.singleKvExpr = new SingleKvExpr();
            singleKvExprSetter.accept(this.singleKvExpr);
        }

        return this;
    }

    /**
     * Get singleKvExpr
     * @return singleKvExpr
     */
    public SingleKvExpr getSingleKvExpr() {
        return singleKvExpr;
    }

    public void setSingleKvExpr(SingleKvExpr singleKvExpr) {
        this.singleKvExpr = singleKvExpr;
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
        return Objects.equals(this.singleFieldExpr, that.singleFieldExpr)
            && Objects.equals(this.multiFieldExpr, that.multiFieldExpr)
            && Objects.equals(this.singleKvExpr, that.singleKvExpr);
    }

    @Override
    public int hashCode() {
        return Objects.hash(singleFieldExpr, multiFieldExpr, singleKvExpr);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionExpression {\n");
        sb.append("    singleFieldExpr: ").append(toIndentedString(singleFieldExpr)).append("\n");
        sb.append("    multiFieldExpr: ").append(toIndentedString(multiFieldExpr)).append("\n");
        sb.append("    singleKvExpr: ").append(toIndentedString(singleKvExpr)).append("\n");
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
