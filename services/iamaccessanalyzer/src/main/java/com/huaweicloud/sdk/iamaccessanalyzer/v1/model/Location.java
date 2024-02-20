package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 策略中的位置，形式分别为json表示的路径和相应的行列范围。
 */
public class Location {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private List<PathElement> path = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "span")

    private Span span;

    public Location withPath(List<PathElement> path) {
        this.path = path;
        return this;
    }

    public Location addPathItem(PathElement pathItem) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.add(pathItem);
        return this;
    }

    public Location withPath(Consumer<List<PathElement>> pathSetter) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        pathSetter.accept(this.path);
        return this;
    }

    /**
     * 策略中的路径，表示为路径元素的有序序列。
     * @return path
     */
    public List<PathElement> getPath() {
        return path;
    }

    public void setPath(List<PathElement> path) {
        this.path = path;
    }

    public Location withSpan(Span span) {
        this.span = span;
        return this;
    }

    public Location withSpan(Consumer<Span> spanSetter) {
        if (this.span == null) {
            this.span = new Span();
            spanSetter.accept(this.span);
        }

        return this;
    }

    /**
     * Get span
     * @return span
     */
    public Span getSpan() {
        return span;
    }

    public void setSpan(Span span) {
        this.span = span;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Location that = (Location) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.span, that.span);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, span);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Location {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    span: ").append(toIndentedString(span)).append("\n");
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
