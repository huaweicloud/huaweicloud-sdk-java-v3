package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * TextDetectionDataReq
 */
public class TextDetectionDataReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    @JacksonXmlProperty(localName = "text")

    private String text;

    public TextDetectionDataReq withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * 待检测文本，编码格式为“utf-8”，限定2000个字符以内，文本长度超过2000个字符时，只检测前2000个字符。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextDetectionDataReq textDetectionDataReq = (TextDetectionDataReq) o;
        return Objects.equals(this.text, textDetectionDataReq.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextDetectionDataReq {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
