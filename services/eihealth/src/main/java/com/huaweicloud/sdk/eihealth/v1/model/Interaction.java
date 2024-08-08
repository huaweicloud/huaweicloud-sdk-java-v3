package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分子与蛋白间的相互作用力
 */
public class Interaction {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binding_site")

    private String bindingSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private InteractionType type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "amino_acid")

    private String aminoAcid;

    public Interaction withBindingSite(String bindingSite) {
        this.bindingSite = bindingSite;
        return this;
    }

    /**
     * 靶点，只支持target1或target2。
     * @return bindingSite
     */
    public String getBindingSite() {
        return bindingSite;
    }

    public void setBindingSite(String bindingSite) {
        this.bindingSite = bindingSite;
    }

    public Interaction withType(InteractionType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    public InteractionType getType() {
        return type;
    }

    public void setType(InteractionType type) {
        this.type = type;
    }

    public Interaction withAminoAcid(String aminoAcid) {
        this.aminoAcid = aminoAcid;
        return this;
    }

    /**
     * 氨基酸
     * @return aminoAcid
     */
    public String getAminoAcid() {
        return aminoAcid;
    }

    public void setAminoAcid(String aminoAcid) {
        this.aminoAcid = aminoAcid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Interaction that = (Interaction) obj;
        return Objects.equals(this.bindingSite, that.bindingSite) && Objects.equals(this.type, that.type)
            && Objects.equals(this.aminoAcid, that.aminoAcid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bindingSite, type, aminoAcid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Interaction {\n");
        sb.append("    bindingSite: ").append(toIndentedString(bindingSite)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    aminoAcid: ").append(toIndentedString(aminoAcid)).append("\n");
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
