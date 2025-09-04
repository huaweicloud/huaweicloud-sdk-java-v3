package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 咨询
 */
public class CountdownListTips {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private Tips summary;

    public CountdownListTips withSummary(Tips summary) {
        this.summary = summary;
        return this;
    }

    public CountdownListTips withSummary(Consumer<Tips> summarySetter) {
        if (this.summary == null) {
            this.summary = new Tips();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public Tips getSummary() {
        return summary;
    }

    public void setSummary(Tips summary) {
        this.summary = summary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CountdownListTips that = (CountdownListTips) obj;
        return Objects.equals(this.summary, that.summary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(summary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CountdownListTips {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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
