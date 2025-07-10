package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 触发当前规则的条件 **约束限制：** 不涉及
 */
public class Conditions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "match")

    private Match match;

    public Conditions withMatch(Match match) {
        this.match = match;
        return this;
    }

    public Conditions withMatch(Consumer<Match> matchSetter) {
        if (this.match == null) {
            this.match = new Match();
            matchSetter.accept(this.match);
        }

        return this;
    }

    /**
     * Get match
     * @return match
     */
    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Conditions that = (Conditions) obj;
        return Objects.equals(this.match, that.match);
    }

    @Override
    public int hashCode() {
        return Objects.hash(match);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Conditions {\n");
        sb.append("    match: ").append(toIndentedString(match)).append("\n");
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
