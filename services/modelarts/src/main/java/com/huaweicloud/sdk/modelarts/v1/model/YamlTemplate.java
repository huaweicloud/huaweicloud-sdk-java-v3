package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 自动化搜索作业yaml模板。
 */
public class YamlTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type_en")

    private String algorithmTypeEn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_type_zh")

    private String algorithmTypeZh;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "algorithm_names")

    private List<String> algorithmNames = null;

    public YamlTemplate withAlgorithmTypeEn(String algorithmTypeEn) {
        this.algorithmTypeEn = algorithmTypeEn;
        return this;
    }

    /**
     * AutoSearch算法类型，英文描述。
     * @return algorithmTypeEn
     */
    public String getAlgorithmTypeEn() {
        return algorithmTypeEn;
    }

    public void setAlgorithmTypeEn(String algorithmTypeEn) {
        this.algorithmTypeEn = algorithmTypeEn;
    }

    public YamlTemplate withAlgorithmTypeZh(String algorithmTypeZh) {
        this.algorithmTypeZh = algorithmTypeZh;
        return this;
    }

    /**
     * AutoSearch算法类型[，中文描述](tag:hc,hk)。
     * @return algorithmTypeZh
     */
    public String getAlgorithmTypeZh() {
        return algorithmTypeZh;
    }

    public void setAlgorithmTypeZh(String algorithmTypeZh) {
        this.algorithmTypeZh = algorithmTypeZh;
    }

    public YamlTemplate withAlgorithmNames(List<String> algorithmNames) {
        this.algorithmNames = algorithmNames;
        return this;
    }

    public YamlTemplate addAlgorithmNamesItem(String algorithmNamesItem) {
        if (this.algorithmNames == null) {
            this.algorithmNames = new ArrayList<>();
        }
        this.algorithmNames.add(algorithmNamesItem);
        return this;
    }

    public YamlTemplate withAlgorithmNames(Consumer<List<String>> algorithmNamesSetter) {
        if (this.algorithmNames == null) {
            this.algorithmNames = new ArrayList<>();
        }
        algorithmNamesSetter.accept(this.algorithmNames);
        return this;
    }

    /**
     * 该算法类型下所有算法的名称。
     * @return algorithmNames
     */
    public List<String> getAlgorithmNames() {
        return algorithmNames;
    }

    public void setAlgorithmNames(List<String> algorithmNames) {
        this.algorithmNames = algorithmNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        YamlTemplate that = (YamlTemplate) obj;
        return Objects.equals(this.algorithmTypeEn, that.algorithmTypeEn)
            && Objects.equals(this.algorithmTypeZh, that.algorithmTypeZh)
            && Objects.equals(this.algorithmNames, that.algorithmNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(algorithmTypeEn, algorithmTypeZh, algorithmNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class YamlTemplate {\n");
        sb.append("    algorithmTypeEn: ").append(toIndentedString(algorithmTypeEn)).append("\n");
        sb.append("    algorithmTypeZh: ").append(toIndentedString(algorithmTypeZh)).append("\n");
        sb.append("    algorithmNames: ").append(toIndentedString(algorithmNames)).append("\n");
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
