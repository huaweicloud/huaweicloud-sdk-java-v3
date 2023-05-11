package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SynthesisResultResultMolecules
 */
public class SynthesisResultResultMolecules {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    public SynthesisResultResultMolecules withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * molecule的序号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SynthesisResultResultMolecules withSmiles(String smiles) {
        this.smiles = smiles;
        return this;
    }

    /**
     * 分子SMILES表达式
     * @return smiles
     */
    public String getSmiles() {
        return smiles;
    }

    public void setSmiles(String smiles) {
        this.smiles = smiles;
    }

    public SynthesisResultResultMolecules withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * molecule的smiles来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SynthesisResultResultMolecules synthesisResultResultMolecules = (SynthesisResultResultMolecules) o;
        return Objects.equals(this.id, synthesisResultResultMolecules.id)
            && Objects.equals(this.smiles, synthesisResultResultMolecules.smiles)
            && Objects.equals(this.source, synthesisResultResultMolecules.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, smiles, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SynthesisResultResultMolecules {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
