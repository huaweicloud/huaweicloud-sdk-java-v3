package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 控制策略内容。
 */
public class Content {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en")

    private String en;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ch")

    private String ch;

    public Content withEn(String en) {
        this.en = en;
        return this;
    }

    /**
     * 英文策略内容。
     * @return en
     */
    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public Content withCh(String ch) {
        this.ch = ch;
        return this;
    }

    /**
     * 中文策略内容。
     * @return ch
     */
    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Content that = (Content) obj;
        return Objects.equals(this.en, that.en) && Objects.equals(this.ch, that.ch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(en, ch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Content {\n");
        sb.append("    en: ").append(toIndentedString(en)).append("\n");
        sb.append("    ch: ").append(toIndentedString(ch)).append("\n");
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
