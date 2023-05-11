package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CPI任务的返回结果
 */
public class CpiResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private String header;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fasta")

    private String fasta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prop_names")

    private List<String> propNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private List<CpiResultItem> result = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_props")

    private List<CustomProp> customProps = null;

    public CpiResult withHeader(String header) {
        this.header = header;
        return this;
    }

    /**
     * 蛋白质FASTA标题
     * @return header
     */
    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public CpiResult withFasta(String fasta) {
        this.fasta = fasta;
        return this;
    }

    /**
     * 蛋白质FASTA序列
     * @return fasta
     */
    public String getFasta() {
        return fasta;
    }

    public void setFasta(String fasta) {
        this.fasta = fasta;
    }

    public CpiResult withPropNames(List<String> propNames) {
        this.propNames = propNames;
        return this;
    }

    public CpiResult addPropNamesItem(String propNamesItem) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        this.propNames.add(propNamesItem);
        return this;
    }

    public CpiResult withPropNames(Consumer<List<String>> propNamesSetter) {
        if (this.propNames == null) {
            this.propNames = new ArrayList<>();
        }
        propNamesSetter.accept(this.propNames);
        return this;
    }

    /**
     * 分子ADMET属性名列表
     * @return propNames
     */
    public List<String> getPropNames() {
        return propNames;
    }

    public void setPropNames(List<String> propNames) {
        this.propNames = propNames;
    }

    public CpiResult withResult(List<CpiResultItem> result) {
        this.result = result;
        return this;
    }

    public CpiResult addResultItem(CpiResultItem resultItem) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        this.result.add(resultItem);
        return this;
    }

    public CpiResult withResult(Consumer<List<CpiResultItem>> resultSetter) {
        if (this.result == null) {
            this.result = new ArrayList<>();
        }
        resultSetter.accept(this.result);
        return this;
    }

    /**
     * 返回CPI的模型结果
     * @return result
     */
    public List<CpiResultItem> getResult() {
        return result;
    }

    public void setResult(List<CpiResultItem> result) {
        this.result = result;
    }

    public CpiResult withCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
        return this;
    }

    public CpiResult addCustomPropsItem(CustomProp customPropsItem) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        this.customProps.add(customPropsItem);
        return this;
    }

    public CpiResult withCustomProps(Consumer<List<CustomProp>> customPropsSetter) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        customPropsSetter.accept(this.customProps);
        return this;
    }

    /**
     * 用户已开启的自定义属性集合
     * @return customProps
     */
    public List<CustomProp> getCustomProps() {
        return customProps;
    }

    public void setCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CpiResult cpiResult = (CpiResult) o;
        return Objects.equals(this.header, cpiResult.header) && Objects.equals(this.fasta, cpiResult.fasta)
            && Objects.equals(this.propNames, cpiResult.propNames) && Objects.equals(this.result, cpiResult.result)
            && Objects.equals(this.customProps, cpiResult.customProps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, fasta, propNames, result, customProps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpiResult {\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    fasta: ").append(toIndentedString(fasta)).append("\n");
        sb.append("    propNames: ").append(toIndentedString(propNames)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    customProps: ").append(toIndentedString(customProps)).append("\n");
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
