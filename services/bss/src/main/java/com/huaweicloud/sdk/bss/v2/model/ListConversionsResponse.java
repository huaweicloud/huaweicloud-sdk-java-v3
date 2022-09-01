package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListConversionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conversions")

    @JacksonXmlProperty(localName = "conversions")

    private List<Conversion> conversions = null;

    public ListConversionsResponse withConversions(List<Conversion> conversions) {
        this.conversions = conversions;
        return this;
    }

    public ListConversionsResponse addConversionsItem(Conversion conversionsItem) {
        if (this.conversions == null) {
            this.conversions = new ArrayList<>();
        }
        this.conversions.add(conversionsItem);
        return this;
    }

    public ListConversionsResponse withConversions(Consumer<List<Conversion>> conversionsSetter) {
        if (this.conversions == null) {
            this.conversions = new ArrayList<>();
        }
        conversionsSetter.accept(this.conversions);
        return this;
    }

    /**
     * 度量单位的换算信息，具体参见表3。
     * @return conversions
     */
    public List<Conversion> getConversions() {
        return conversions;
    }

    public void setConversions(List<Conversion> conversions) {
        this.conversions = conversions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListConversionsResponse listConversionsResponse = (ListConversionsResponse) o;
        return Objects.equals(this.conversions, listConversionsResponse.conversions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(conversions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListConversionsResponse {\n");
        sb.append("    conversions: ").append(toIndentedString(conversions)).append("\n");
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
