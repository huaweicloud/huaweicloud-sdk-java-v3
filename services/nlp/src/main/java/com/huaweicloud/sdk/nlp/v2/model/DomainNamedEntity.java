package com.huaweicloud.sdk.nlp.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 命名实体类
 */
public class DomainNamedEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "word")

    private String word;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "len")

    private Integer len;

    public DomainNamedEntity withWord(String word) {
        this.word = word;
        return this;
    }

    /**
     * 实体文本。
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public DomainNamedEntity withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * 实体类型，枚举类型。 通用领域：支持人名nr，地名ns，机构名nt，时间点tpt，日期day，百分比pct，货币额度mny，序数词ord，计量规格词qtt，民族race，职业job，邮箱email，国家coun，节日fest。 商务领域：支持公司名com、品牌名bra、职业job、职位post、邮箱email、手机号码cell、电话号码tele、IP地址ip、身份证号id、网址web。 娱乐领域：支持电影名mov、动漫anime、书名book、互联网int、歌名song、产品名pro、电视剧名dra、电视节目名tv。
     * @return tag
     */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public DomainNamedEntity withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 实体文本在待分析文本中的起始位置。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public DomainNamedEntity withLen(Integer len) {
        this.len = len;
        return this;
    }

    /**
     * 实体文本长度。
     * @return len
     */
    public Integer getLen() {
        return len;
    }

    public void setLen(Integer len) {
        this.len = len;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainNamedEntity that = (DomainNamedEntity) obj;
        return Objects.equals(this.word, that.word) && Objects.equals(this.tag, that.tag)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.len, that.len);
    }

    @Override
    public int hashCode() {
        return Objects.hash(word, tag, offset, len);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainNamedEntity {\n");
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    len: ").append(toIndentedString(len)).append("\n");
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
