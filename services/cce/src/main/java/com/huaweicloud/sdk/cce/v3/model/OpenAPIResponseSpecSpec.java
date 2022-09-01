package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenAPIResponseSpecSpec
 */
public class OpenAPIResponseSpecSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip")

    @JacksonXmlProperty(localName = "eip")

    private EipSpec eip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "IsDynamic")

    @JacksonXmlProperty(localName = "IsDynamic")

    private Boolean isDynamic;

    public OpenAPIResponseSpecSpec withEip(EipSpec eip) {
        this.eip = eip;
        return this;
    }

    public OpenAPIResponseSpecSpec withEip(Consumer<EipSpec> eipSetter) {
        if (this.eip == null) {
            this.eip = new EipSpec();
            eipSetter.accept(this.eip);
        }

        return this;
    }

    /**
     * Get eip
     * @return eip
     */
    public EipSpec getEip() {
        return eip;
    }

    public void setEip(EipSpec eip) {
        this.eip = eip;
    }

    public OpenAPIResponseSpecSpec withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * 是否动态创建
     * @return isDynamic
     */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    public void setIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenAPIResponseSpecSpec openAPIResponseSpecSpec = (OpenAPIResponseSpecSpec) o;
        return Objects.equals(this.eip, openAPIResponseSpecSpec.eip)
            && Objects.equals(this.isDynamic, openAPIResponseSpecSpec.isDynamic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eip, isDynamic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenAPIResponseSpecSpec {\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
        sb.append("    isDynamic: ").append(toIndentedString(isDynamic)).append("\n");
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
