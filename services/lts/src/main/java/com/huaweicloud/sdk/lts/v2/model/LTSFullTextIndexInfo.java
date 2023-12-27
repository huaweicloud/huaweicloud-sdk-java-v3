package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * LTSFullTextIndexInfo
 */
public class LTSFullTextIndexInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseSensitive")

    private Boolean caseSensitive;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeChinese")

    private Boolean includeChinese;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tokenizer")

    private String tokenizer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ascii")

    private List<String> ascii = null;

    public LTSFullTextIndexInfo withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * 是否开启全文索引
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public LTSFullTextIndexInfo withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * 是否大小写敏感
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public LTSFullTextIndexInfo withIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
        return this;
    }

    /**
     * 是否包含中文
     * @return includeChinese
     */
    public Boolean getIncludeChinese() {
        return includeChinese;
    }

    public void setIncludeChinese(Boolean includeChinese) {
        this.includeChinese = includeChinese;
    }

    public LTSFullTextIndexInfo withTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
        return this;
    }

    /**
     * 自定义分词符
     * @return tokenizer
     */
    public String getTokenizer() {
        return tokenizer;
    }

    public void setTokenizer(String tokenizer) {
        this.tokenizer = tokenizer;
    }

    public LTSFullTextIndexInfo withAscii(List<String> ascii) {
        this.ascii = ascii;
        return this;
    }

    public LTSFullTextIndexInfo addAsciiItem(String asciiItem) {
        if (this.ascii == null) {
            this.ascii = new ArrayList<>();
        }
        this.ascii.add(asciiItem);
        return this;
    }

    public LTSFullTextIndexInfo withAscii(Consumer<List<String>> asciiSetter) {
        if (this.ascii == null) {
            this.ascii = new ArrayList<>();
        }
        asciiSetter.accept(this.ascii);
        return this;
    }

    /**
     * 特殊分词符
     * @return ascii
     */
    public List<String> getAscii() {
        return ascii;
    }

    public void setAscii(List<String> ascii) {
        this.ascii = ascii;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LTSFullTextIndexInfo that = (LTSFullTextIndexInfo) obj;
        return Objects.equals(this.enable, that.enable) && Objects.equals(this.caseSensitive, that.caseSensitive)
            && Objects.equals(this.includeChinese, that.includeChinese)
            && Objects.equals(this.tokenizer, that.tokenizer) && Objects.equals(this.ascii, that.ascii);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enable, caseSensitive, includeChinese, tokenizer, ascii);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LTSFullTextIndexInfo {\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
        sb.append("    includeChinese: ").append(toIndentedString(includeChinese)).append("\n");
        sb.append("    tokenizer: ").append(toIndentedString(tokenizer)).append("\n");
        sb.append("    ascii: ").append(toIndentedString(ascii)).append("\n");
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
