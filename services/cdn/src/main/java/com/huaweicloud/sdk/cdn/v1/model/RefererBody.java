package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RefererBody
 */
public class RefererBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "referer")

    @JacksonXmlProperty(localName = "referer")

    private Referer referer;

    public RefererBody withReferer(Referer referer) {
        this.referer = referer;
        return this;
    }

    public RefererBody withReferer(Consumer<Referer> refererSetter) {
        if (this.referer == null) {
            this.referer = new Referer();
            refererSetter.accept(this.referer);
        }

        return this;
    }

    /**
     * Get referer
     * @return referer
     */
    public Referer getReferer() {
        return referer;
    }

    public void setReferer(Referer referer) {
        this.referer = referer;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RefererBody refererBody = (RefererBody) o;
        return Objects.equals(this.referer, refererBody.referer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RefererBody {\n");
        sb.append("    referer: ").append(toIndentedString(referer)).append("\n");
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
