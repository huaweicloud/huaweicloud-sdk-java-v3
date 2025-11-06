package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** E2E公共设置信息。
 */
public class E2ePolicyDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_extract")

    private Boolean autoExtract;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prefix_symbol")

    private String prefixSymbol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "separator")

    private String separator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suffix_symbol")

    private String suffixSymbol;

    public E2ePolicyDto withAutoExtract(Boolean autoExtract) {
        this.autoExtract = autoExtract;
        return this;
    }

    /**
     * **参数解释：** 是否开启单号自动提取。 **取值范围：** true：开启单号自动提取，false：未开启单号自动提取。
     * @return autoExtract
     */
    public Boolean getAutoExtract() {
        return autoExtract;
    }

    public void setAutoExtract(Boolean autoExtract) {
        this.autoExtract = autoExtract;
    }

    public E2ePolicyDto withPrefixSymbol(String prefixSymbol) {
        this.prefixSymbol = prefixSymbol;
        return this;
    }

    /**
     * **参数解释：** 自动提取时的单号前缀合集，英文逗号分隔。 **取值范围：** 单个前缀长度最多200个字符，最多允许配置10个前缀。
     * @return prefixSymbol
     */
    public String getPrefixSymbol() {
        return prefixSymbol;
    }

    public void setPrefixSymbol(String prefixSymbol) {
        this.prefixSymbol = prefixSymbol;
    }

    public E2ePolicyDto withSeparator(String separator) {
        this.separator = separator;
        return this;
    }

    /**
     * **参数解释：** 自动提取时的分隔符。
     * @return separator
     */
    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public E2ePolicyDto withSuffixSymbol(String suffixSymbol) {
        this.suffixSymbol = suffixSymbol;
        return this;
    }

    /**
     * **参数解释：** 自动提取时的单号后缀。
     * @return suffixSymbol
     */
    public String getSuffixSymbol() {
        return suffixSymbol;
    }

    public void setSuffixSymbol(String suffixSymbol) {
        this.suffixSymbol = suffixSymbol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        E2ePolicyDto that = (E2ePolicyDto) obj;
        return Objects.equals(this.autoExtract, that.autoExtract)
            && Objects.equals(this.prefixSymbol, that.prefixSymbol) && Objects.equals(this.separator, that.separator)
            && Objects.equals(this.suffixSymbol, that.suffixSymbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoExtract, prefixSymbol, separator, suffixSymbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class E2ePolicyDto {\n");
        sb.append("    autoExtract: ").append(toIndentedString(autoExtract)).append("\n");
        sb.append("    prefixSymbol: ").append(toIndentedString(prefixSymbol)).append("\n");
        sb.append("    separator: ").append(toIndentedString(separator)).append("\n");
        sb.append("    suffixSymbol: ").append(toIndentedString(suffixSymbol)).append("\n");
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
