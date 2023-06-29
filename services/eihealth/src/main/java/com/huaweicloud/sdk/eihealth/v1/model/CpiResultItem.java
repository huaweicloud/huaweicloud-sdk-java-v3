package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CPI结果条目
 */
public class CpiResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "props")

    private List<PropertyValue> props = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private BigDecimal score;

    public CpiResultItem withSmiles(String smiles) {
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

    public CpiResultItem withProps(List<PropertyValue> props) {
        this.props = props;
        return this;
    }

    public CpiResultItem addPropsItem(PropertyValue propsItem) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        this.props.add(propsItem);
        return this;
    }

    public CpiResultItem withProps(Consumer<List<PropertyValue>> propsSetter) {
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

    public CpiResultItem withScore(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * 分子与蛋白质的打分
     * @return score
     */
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpiResultItem that = (CpiResultItem) obj;
        return Objects.equals(this.smiles, that.smiles) && Objects.equals(this.props, that.props)
            && Objects.equals(this.score, that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, props, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpiResultItem {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    props: ").append(toIndentedString(props)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
