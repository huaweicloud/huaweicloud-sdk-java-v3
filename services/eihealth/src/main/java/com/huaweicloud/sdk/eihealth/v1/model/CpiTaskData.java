package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CPI任务的请求体
 */
public class CpiTaskData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header")

    private String header;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fasta")

    private String fasta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smiles_list")

    private List<String> smilesList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Float threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num_results")

    private Integer numResults;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_props")

    private List<CustomProp> customProps = null;

    public CpiTaskData withHeader(String header) {
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

    public CpiTaskData withFasta(String fasta) {
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

    public CpiTaskData withSmilesList(List<String> smilesList) {
        this.smilesList = smilesList;
        return this;
    }

    public CpiTaskData addSmilesListItem(String smilesListItem) {
        if (this.smilesList == null) {
            this.smilesList = new ArrayList<>();
        }
        this.smilesList.add(smilesListItem);
        return this;
    }

    public CpiTaskData withSmilesList(Consumer<List<String>> smilesListSetter) {
        if (this.smilesList == null) {
            this.smilesList = new ArrayList<>();
        }
        smilesListSetter.accept(this.smilesList);
        return this;
    }

    /**
     * 分子SMILES表达式列表
     * @return smilesList
     */
    public List<String> getSmilesList() {
        return smilesList;
    }

    public void setSmilesList(List<String> smilesList) {
        this.smilesList = smilesList;
    }

    public CpiTaskData withThreshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 打分阈值，分值必须大于该阈值才会返回
     * @return threshold
     */
    public Float getThreshold() {
        return threshold;
    }

    public void setThreshold(Float threshold) {
        this.threshold = threshold;
    }

    public CpiTaskData withNumResults(Integer numResults) {
        this.numResults = numResults;
        return this;
    }

    /**
     * 期望最大返回条目数（排序后取Top）
     * @return numResults
     */
    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public CpiTaskData withCustomProps(List<CustomProp> customProps) {
        this.customProps = customProps;
        return this;
    }

    public CpiTaskData addCustomPropsItem(CustomProp customPropsItem) {
        if (this.customProps == null) {
            this.customProps = new ArrayList<>();
        }
        this.customProps.add(customPropsItem);
        return this;
    }

    public CpiTaskData withCustomProps(Consumer<List<CustomProp>> customPropsSetter) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CpiTaskData that = (CpiTaskData) obj;
        return Objects.equals(this.header, that.header) && Objects.equals(this.fasta, that.fasta)
            && Objects.equals(this.smilesList, that.smilesList) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.numResults, that.numResults) && Objects.equals(this.customProps, that.customProps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(header, fasta, smilesList, threshold, numResults, customProps);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CpiTaskData {\n");
        sb.append("    header: ").append(toIndentedString(header)).append("\n");
        sb.append("    fasta: ").append(toIndentedString(fasta)).append("\n");
        sb.append("    smilesList: ").append(toIndentedString(smilesList)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    numResults: ").append(toIndentedString(numResults)).append("\n");
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
