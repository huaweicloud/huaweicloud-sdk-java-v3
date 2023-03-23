package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PlainMoleculeItem
 */
public class PlainMoleculeItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "props")

    private List<PropertyValue> props = null;

    public PlainMoleculeItem withSmiles(String smiles) {
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

    public PlainMoleculeItem withProps(List<PropertyValue> props) {
        this.props = props;
        return this;
    }

    public PlainMoleculeItem addPropsItem(PropertyValue propsItem) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        this.props.add(propsItem);
        return this;
    }

    public PlainMoleculeItem withProps(Consumer<List<PropertyValue>> propsSetter) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        propsSetter.accept(this.props);
        return this;
    }

    /**
     * 分子ADMET属性值列表
     * @return props
     */
    public List<PropertyValue> getProps() {
        return props;
    }

    public void setProps(List<PropertyValue> props) {
        this.props = props;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlainMoleculeItem plainMoleculeItem = (PlainMoleculeItem) o;
        return Objects.equals(this.smiles, plainMoleculeItem.smiles)
            && Objects.equals(this.props, plainMoleculeItem.props);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, props);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlainMoleculeItem {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
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
