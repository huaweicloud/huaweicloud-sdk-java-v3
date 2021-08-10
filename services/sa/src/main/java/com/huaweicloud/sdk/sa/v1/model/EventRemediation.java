package com.huaweicloud.sdk.sa.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 补救措施。 */
public class EventRemediation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recommendation")

    private Recommendation recommendation;

    public EventRemediation withRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
        return this;
    }

    public EventRemediation withRecommendation(Consumer<Recommendation> recommendationSetter) {
        if (this.recommendation == null) {
            this.recommendation = new Recommendation();
            recommendationSetter.accept(this.recommendation);
        }

        return this;
    }

    /** Get recommendation
     * 
     * @return recommendation */
    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EventRemediation eventRemediation = (EventRemediation) o;
        return Objects.equals(this.recommendation, eventRemediation.recommendation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recommendation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventRemediation {\n");
        sb.append("    recommendation: ").append(toIndentedString(recommendation)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
