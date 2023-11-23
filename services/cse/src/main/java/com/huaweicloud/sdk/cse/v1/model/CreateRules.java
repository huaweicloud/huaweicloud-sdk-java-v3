package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 灰度发布规则
 */
public class CreateRules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precedence")

    private Integer precedence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private CreateMatch match;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route")

    private List<CreateRoute> route = null;

    public CreateRules withPrecedence(Integer precedence) {
        this.precedence = precedence;
        return this;
    }

    /**
     * 优先级，数字越大，优先级越高。
     * @return precedence
     */
    public Integer getPrecedence() {
        return precedence;
    }

    public void setPrecedence(Integer precedence) {
        this.precedence = precedence;
    }

    public CreateRules withMatch(CreateMatch match) {
        this.match = match;
        return this;
    }

    public CreateRules withMatch(Consumer<CreateMatch> matchSetter) {
        if (this.match == null) {
            this.match = new CreateMatch();
            matchSetter.accept(this.match);
        }

        return this;
    }

    /**
     * Get match
     * @return match
     */
    public CreateMatch getMatch() {
        return match;
    }

    public void setMatch(CreateMatch match) {
        this.match = match;
    }

    public CreateRules withRoute(List<CreateRoute> route) {
        this.route = route;
        return this;
    }

    public CreateRules addRouteItem(CreateRoute routeItem) {
        if (this.route == null) {
            this.route = new ArrayList<>();
        }
        this.route.add(routeItem);
        return this;
    }

    public CreateRules withRoute(Consumer<List<CreateRoute>> routeSetter) {
        if (this.route == null) {
            this.route = new ArrayList<>();
        }
        routeSetter.accept(this.route);
        return this;
    }

    /**
     * 路由规则列表。
     * @return route
     */
    public List<CreateRoute> getRoute() {
        return route;
    }

    public void setRoute(List<CreateRoute> route) {
        this.route = route;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateRules that = (CreateRules) obj;
        return Objects.equals(this.precedence, that.precedence) && Objects.equals(this.match, that.match)
            && Objects.equals(this.route, that.route);
    }

    @Override
    public int hashCode() {
        return Objects.hash(precedence, match, route);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRules {\n");
        sb.append("    precedence: ").append(toIndentedString(precedence)).append("\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
        sb.append("    route: ").append(toIndentedString(route)).append("\n");
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
