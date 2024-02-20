package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 光标在策略文本中的范围。范围由开始位置（含）和结束位置（不含）组成。
 */
public class Span {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Position start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end")

    private Position end;

    public Span withStart(Position start) {
        this.start = start;
        return this;
    }

    public Span withStart(Consumer<Position> startSetter) {
        if (this.start == null) {
            this.start = new Position();
            startSetter.accept(this.start);
        }

        return this;
    }

    /**
     * Get start
     * @return start
     */
    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Span withEnd(Position end) {
        this.end = end;
        return this;
    }

    public Span withEnd(Consumer<Position> endSetter) {
        if (this.end == null) {
            this.end = new Position();
            endSetter.accept(this.end);
        }

        return this;
    }

    /**
     * Get end
     * @return end
     */
    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Span that = (Span) obj;
        return Objects.equals(this.start, that.start) && Objects.equals(this.end, that.end);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Span {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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
