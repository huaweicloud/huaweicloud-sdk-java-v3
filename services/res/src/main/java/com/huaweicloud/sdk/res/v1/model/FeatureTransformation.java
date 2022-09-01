package com.huaweicloud.sdk.res.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class FeatureTransformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attr")

    @JacksonXmlProperty(localName = "attr")

    private Attribute attr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "discrete_method")

    @JacksonXmlProperty(localName = "discrete_method")

    private String discreteMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "params")

    @JacksonXmlProperty(localName = "params")

    private Object params;

    public FeatureTransformation withAttr(Attribute attr) {
        this.attr = attr;
        return this;
    }

    public FeatureTransformation withAttr(Consumer<Attribute> attrSetter) {
        if (this.attr == null) {
            this.attr = new Attribute();
            attrSetter.accept(this.attr);
        }

        return this;
    }

    /**
     * Get attr
     * @return attr
     */
    public Attribute getAttr() {
        return attr;
    }

    public void setAttr(Attribute attr) {
        this.attr = attr;
    }

    public FeatureTransformation withDiscreteMethod(String discreteMethod) {
        this.discreteMethod = discreteMethod;
        return this;
    }

    /**
     * 离散方法： - equal_distance_discrete，等距离散 - user_define_discrete，自定义离散 - normalize，归一化 - null，不离散 
     * @return discreteMethod
     */
    public String getDiscreteMethod() {
        return discreteMethod;
    }

    public void setDiscreteMethod(String discreteMethod) {
        this.discreteMethod = discreteMethod;
    }

    public FeatureTransformation withParams(Object params) {
        this.params = params;
        return this;
    }

    /**
     * 具体处理参数。
     * @return params
     */
    public Object getParams() {
        return params;
    }

    public void setParams(Object params) {
        this.params = params;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FeatureTransformation featureTransformation = (FeatureTransformation) o;
        return Objects.equals(this.attr, featureTransformation.attr)
            && Objects.equals(this.discreteMethod, featureTransformation.discreteMethod)
            && Objects.equals(this.params, featureTransformation.params);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attr, discreteMethod, params);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeatureTransformation {\n");
        sb.append("    attr: ").append(toIndentedString(attr)).append("\n");
        sb.append("    discreteMethod: ").append(toIndentedString(discreteMethod)).append("\n");
        sb.append("    params: ").append(toIndentedString(params)).append("\n");
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
