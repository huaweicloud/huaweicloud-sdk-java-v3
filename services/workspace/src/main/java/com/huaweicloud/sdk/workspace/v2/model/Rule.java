package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则信息。
 */
public class Rule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private RuleScope scope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_rule")

    private ProductRule productRule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_rule")

    private PathRule pathRule;

    public Rule withScope(RuleScope scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Get scope
     * @return scope
     */
    public RuleScope getScope() {
        return scope;
    }

    public void setScope(RuleScope scope) {
        this.scope = scope;
    }

    public Rule withProductRule(ProductRule productRule) {
        this.productRule = productRule;
        return this;
    }

    public Rule withProductRule(Consumer<ProductRule> productRuleSetter) {
        if (this.productRule == null) {
            this.productRule = new ProductRule();
            productRuleSetter.accept(this.productRule);
        }

        return this;
    }

    /**
     * Get productRule
     * @return productRule
     */
    public ProductRule getProductRule() {
        return productRule;
    }

    public void setProductRule(ProductRule productRule) {
        this.productRule = productRule;
    }

    public Rule withPathRule(PathRule pathRule) {
        this.pathRule = pathRule;
        return this;
    }

    public Rule withPathRule(Consumer<PathRule> pathRuleSetter) {
        if (this.pathRule == null) {
            this.pathRule = new PathRule();
            pathRuleSetter.accept(this.pathRule);
        }

        return this;
    }

    /**
     * Get pathRule
     * @return pathRule
     */
    public PathRule getPathRule() {
        return pathRule;
    }

    public void setPathRule(PathRule pathRule) {
        this.pathRule = pathRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rule that = (Rule) obj;
        return Objects.equals(this.scope, that.scope) && Objects.equals(this.productRule, that.productRule)
            && Objects.equals(this.pathRule, that.pathRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scope, productRule, pathRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Rule {\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
        sb.append("    productRule: ").append(toIndentedString(productRule)).append("\n");
        sb.append("    pathRule: ").append(toIndentedString(pathRule)).append("\n");
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
