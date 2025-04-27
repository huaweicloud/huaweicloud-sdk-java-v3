package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * AssociateOrDisassociateRouterWithRuleRequestBody
 */
public class AssociateOrDisassociateRouterWithRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router")

    private RouterForRule router;

    public AssociateOrDisassociateRouterWithRuleRequestBody withRouter(RouterForRule router) {
        this.router = router;
        return this;
    }

    public AssociateOrDisassociateRouterWithRuleRequestBody withRouter(Consumer<RouterForRule> routerSetter) {
        if (this.router == null) {
            this.router = new RouterForRule();
            routerSetter.accept(this.router);
        }

        return this;
    }

    /**
     * Get router
     * @return router
     */
    public RouterForRule getRouter() {
        return router;
    }

    public void setRouter(RouterForRule router) {
        this.router = router;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociateOrDisassociateRouterWithRuleRequestBody that = (AssociateOrDisassociateRouterWithRuleRequestBody) obj;
        return Objects.equals(this.router, that.router);
    }

    @Override
    public int hashCode() {
        return Objects.hash(router);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateOrDisassociateRouterWithRuleRequestBody {\n");
        sb.append("    router: ").append(toIndentedString(router)).append("\n");
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
