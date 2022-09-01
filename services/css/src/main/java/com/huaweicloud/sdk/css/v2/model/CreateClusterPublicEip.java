package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 公网带宽信息。
 */
public class CreateClusterPublicEip {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bandWidth")

    @JacksonXmlProperty(localName = "bandWidth")

    private CreateClusterPublicEipSize bandWidth;

    public CreateClusterPublicEip withBandWidth(CreateClusterPublicEipSize bandWidth) {
        this.bandWidth = bandWidth;
        return this;
    }

    public CreateClusterPublicEip withBandWidth(Consumer<CreateClusterPublicEipSize> bandWidthSetter) {
        if (this.bandWidth == null) {
            this.bandWidth = new CreateClusterPublicEipSize();
            bandWidthSetter.accept(this.bandWidth);
        }

        return this;
    }

    /**
     * Get bandWidth
     * @return bandWidth
     */
    public CreateClusterPublicEipSize getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(CreateClusterPublicEipSize bandWidth) {
        this.bandWidth = bandWidth;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterPublicEip createClusterPublicEip = (CreateClusterPublicEip) o;
        return Objects.equals(this.bandWidth, createClusterPublicEip.bandWidth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandWidth);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterPublicEip {\n");
        sb.append("    bandWidth: ").append(toIndentedString(bandWidth)).append("\n");
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
