package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子合成路径规划结果条目
 */
public class SynthesisResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route")

    private List<String> route = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    public SynthesisResultItem withRoute(List<String> route) {
        this.route = route;
        return this;
    }

    public SynthesisResultItem addRouteItem(String routeItem) {
        if (this.route == null) {
            this.route = new ArrayList<>();
        }
        this.route.add(routeItem);
        return this;
    }

    public SynthesisResultItem withRoute(Consumer<List<String>> routeSetter) {
        if (this.route == null) {
            this.route = new ArrayList<>();
        }
        routeSetter.accept(this.route);
        return this;
    }

    /**
     * 分子合成规划，列表内是reactions id
     * @return route
     */
    public List<String> getRoute() {
        return route;
    }

    public void setRoute(List<String> route) {
        this.route = route;
    }

    public SynthesisResultItem withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 当前分子合成路径的得分
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SynthesisResultItem that = (SynthesisResultItem) obj;
        return Objects.equals(this.route, that.route) && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(route, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisResultItem {\n");
        sb.append("    route: ").append(toIndentedString(route)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
