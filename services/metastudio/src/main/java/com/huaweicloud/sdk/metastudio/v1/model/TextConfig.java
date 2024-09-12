package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 台词脚本。 &gt; 最长10000个字符，不含SSML标签字符数。
 */
public class TextConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text")

    private String text;

    public TextConfig withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * **参数解释**： 台词脚本。支持两种模式，纯文本模式和标签模式。 - 纯文本模式：使用方法，如“大家好，我是人工智大家，是个虚拟主播”。 - 标签模式：SSML标签的详细定义请参考[文本驱动SSML定义](metastudio_02_0038.xml)。  **约束限制**： 不含SSML标签字符数最长10000个字符。 **取值范围**： 字符长度0-131072位。 **默认取值**： 不涉及。
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextConfig that = (TextConfig) obj;
        return Objects.equals(this.text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextConfig {\n");
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
