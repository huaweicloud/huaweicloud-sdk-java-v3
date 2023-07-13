package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NeutronCreateRouterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "router")

    private NeutronCreateRouterOption router;

    public NeutronCreateRouterRequestBody withRouter(NeutronCreateRouterOption router) {
        this.router = router;
        return this;
    }

    public NeutronCreateRouterRequestBody withRouter(Consumer<NeutronCreateRouterOption> routerSetter) {
        if (this.router == null) {
            this.router = new NeutronCreateRouterOption();
            routerSetter.accept(this.router);
        }

        return this;
    }

    /**
     * Get router
     * @return router
     */
    public NeutronCreateRouterOption getRouter() {
        return router;
    }

    public void setRouter(NeutronCreateRouterOption router) {
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
        NeutronCreateRouterRequestBody that = (NeutronCreateRouterRequestBody) obj;
        return Objects.equals(this.router, that.router);
    }

    @Override
    public int hashCode() {
        return Objects.hash(router);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronCreateRouterRequestBody {\n");
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
