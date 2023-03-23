package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 分子搜索结果条目
 */
public class SearchResultItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles")

    private String smiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "score")

    private Float score;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "props")

    private List<PropertyValue> props = null;

    public SearchResultItem withSmiles(String smiles) {
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

    public SearchResultItem withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 分子所属的数据库来源
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public SearchResultItem withScore(Float score) {
        this.score = score;
        return this;
    }

    /**
     * 分子与查询分子的相似度
     * @return score
     */
    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public SearchResultItem withProps(List<PropertyValue> props) {
        this.props = props;
        return this;
    }

    public SearchResultItem addPropsItem(PropertyValue propsItem) {
        if (this.props == null) {
            this.props = new ArrayList<>();
        }
        this.props.add(propsItem);
        return this;
    }

    public SearchResultItem withProps(Consumer<List<PropertyValue>> propsSetter) {
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
        SearchResultItem searchResultItem = (SearchResultItem) o;
        return Objects.equals(this.smiles, searchResultItem.smiles)
            && Objects.equals(this.source, searchResultItem.source)
            && Objects.equals(this.score, searchResultItem.score) && Objects.equals(this.props, searchResultItem.props);
    }

    @Override
    public int hashCode() {
        return Objects.hash(smiles, source, score, props);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchResultItem {\n");
        sb.append("    smiles: ").append(toIndentedString(smiles)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
