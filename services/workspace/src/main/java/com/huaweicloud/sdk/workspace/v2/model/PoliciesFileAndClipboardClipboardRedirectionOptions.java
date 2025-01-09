package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 剪切板重定向控制的选项。
 */
public class PoliciesFileAndClipboardClipboardRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rich_text_redirection_enable")

    private Boolean richTextRedirectionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_file_redirection_enable")

    private Boolean clipboardFileRedirectionEnable;

    public PoliciesFileAndClipboardClipboardRedirectionOptions withRichTextRedirectionEnable(
        Boolean richTextRedirectionEnable) {
        this.richTextRedirectionEnable = richTextRedirectionEnable;
        return this;
    }

    /**
     * 是否开启剪切板富文本重定向。取值为： false：表示关闭。 true：表示开启。
     * @return richTextRedirectionEnable
     */
    public Boolean getRichTextRedirectionEnable() {
        return richTextRedirectionEnable;
    }

    public void setRichTextRedirectionEnable(Boolean richTextRedirectionEnable) {
        this.richTextRedirectionEnable = richTextRedirectionEnable;
    }

    public PoliciesFileAndClipboardClipboardRedirectionOptions withClipboardFileRedirectionEnable(
        Boolean clipboardFileRedirectionEnable) {
        this.clipboardFileRedirectionEnable = clipboardFileRedirectionEnable;
        return this;
    }

    /**
     * 是否开启剪切板文件重定向。取值为： false：表示关闭。 true：表示开启。
     * @return clipboardFileRedirectionEnable
     */
    public Boolean getClipboardFileRedirectionEnable() {
        return clipboardFileRedirectionEnable;
    }

    public void setClipboardFileRedirectionEnable(Boolean clipboardFileRedirectionEnable) {
        this.clipboardFileRedirectionEnable = clipboardFileRedirectionEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFileAndClipboardClipboardRedirectionOptions that =
            (PoliciesFileAndClipboardClipboardRedirectionOptions) obj;
        return Objects.equals(this.richTextRedirectionEnable, that.richTextRedirectionEnable)
            && Objects.equals(this.clipboardFileRedirectionEnable, that.clipboardFileRedirectionEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(richTextRedirectionEnable, clipboardFileRedirectionEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboardClipboardRedirectionOptions {\n");
        sb.append("    richTextRedirectionEnable: ").append(toIndentedString(richTextRedirectionEnable)).append("\n");
        sb.append("    clipboardFileRedirectionEnable: ")
            .append(toIndentedString(clipboardFileRedirectionEnable))
            .append("\n");
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
