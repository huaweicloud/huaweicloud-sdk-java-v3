package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 
 */
public class AttrPair {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "party_a")

    @JacksonXmlProperty(localName = "party_a")

    private String partyA;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "party_b")

    @JacksonXmlProperty(localName = "party_b")

    private String partyB;

    public AttrPair withPartyA(String partyA) {
        this.partyA = partyA;
        return this;
    }

    /**
     * 被推荐对象的属性名。
     * @return partyA
     */
    public String getPartyA() {
        return partyA;
    }

    public void setPartyA(String partyA) {
        this.partyA = partyA;
    }

    public AttrPair withPartyB(String partyB) {
        this.partyB = partyB;
        return this;
    }

    /**
     * 被推荐对象的属性名。
     * @return partyB
     */
    public String getPartyB() {
        return partyB;
    }

    public void setPartyB(String partyB) {
        this.partyB = partyB;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttrPair attrPair = (AttrPair) o;
        return Objects.equals(this.partyA, attrPair.partyA) && Objects.equals(this.partyB, attrPair.partyB);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partyA, partyB);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttrPair {\n");
        sb.append("    partyA: ").append(toIndentedString(partyA)).append("\n");
        sb.append("    partyB: ").append(toIndentedString(partyB)).append("\n");
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
