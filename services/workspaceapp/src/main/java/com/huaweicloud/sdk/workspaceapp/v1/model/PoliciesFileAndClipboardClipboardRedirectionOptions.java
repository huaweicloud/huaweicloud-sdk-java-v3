package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 剪切板重定向控制的选项。
 */
public class PoliciesFileAndClipboardClipboardRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rich_text_redirection_enable")

    private Boolean richTextRedirectionEnable;

    /**
     * 剪切板富文本重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     */
    public static final class RichTextClipboardRedirectionEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final RichTextClipboardRedirectionEnum DISABLED =
            new RichTextClipboardRedirectionEnum("DISABLED");

        /**
         * Enum SERVER_TO_CLIENT_ENABLED for value: "SERVER_TO_CLIENT_ENABLED"
         */
        public static final RichTextClipboardRedirectionEnum SERVER_TO_CLIENT_ENABLED =
            new RichTextClipboardRedirectionEnum("SERVER_TO_CLIENT_ENABLED");

        /**
         * Enum CLIENT_TO_SERVER_ENABLED for value: "CLIENT_TO_SERVER_ENABLED"
         */
        public static final RichTextClipboardRedirectionEnum CLIENT_TO_SERVER_ENABLED =
            new RichTextClipboardRedirectionEnum("CLIENT_TO_SERVER_ENABLED");

        /**
         * Enum TWO_WAY_ENABLED for value: "TWO_WAY_ENABLED"
         */
        public static final RichTextClipboardRedirectionEnum TWO_WAY_ENABLED =
            new RichTextClipboardRedirectionEnum("TWO_WAY_ENABLED");

        private static final Map<String, RichTextClipboardRedirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RichTextClipboardRedirectionEnum> createStaticFields() {
            Map<String, RichTextClipboardRedirectionEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("SERVER_TO_CLIENT_ENABLED", SERVER_TO_CLIENT_ENABLED);
            map.put("CLIENT_TO_SERVER_ENABLED", CLIENT_TO_SERVER_ENABLED);
            map.put("TWO_WAY_ENABLED", TWO_WAY_ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RichTextClipboardRedirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RichTextClipboardRedirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new RichTextClipboardRedirectionEnum(value));
        }

        public static RichTextClipboardRedirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RichTextClipboardRedirectionEnum) {
                return this.value.equals(((RichTextClipboardRedirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rich_text_clipboard_redirection")

    private RichTextClipboardRedirectionEnum richTextClipboardRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_file_redirection_enable")

    private Boolean clipboardFileRedirectionEnable;

    /**
     * 剪切板文件重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     */
    public static final class FileClipboardRedirectionEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final FileClipboardRedirectionEnum DISABLED = new FileClipboardRedirectionEnum("DISABLED");

        /**
         * Enum SERVER_TO_CLIENT_ENABLED for value: "SERVER_TO_CLIENT_ENABLED"
         */
        public static final FileClipboardRedirectionEnum SERVER_TO_CLIENT_ENABLED =
            new FileClipboardRedirectionEnum("SERVER_TO_CLIENT_ENABLED");

        /**
         * Enum CLIENT_TO_SERVER_ENABLED for value: "CLIENT_TO_SERVER_ENABLED"
         */
        public static final FileClipboardRedirectionEnum CLIENT_TO_SERVER_ENABLED =
            new FileClipboardRedirectionEnum("CLIENT_TO_SERVER_ENABLED");

        /**
         * Enum TWO_WAY_ENABLED for value: "TWO_WAY_ENABLED"
         */
        public static final FileClipboardRedirectionEnum TWO_WAY_ENABLED =
            new FileClipboardRedirectionEnum("TWO_WAY_ENABLED");

        private static final Map<String, FileClipboardRedirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FileClipboardRedirectionEnum> createStaticFields() {
            Map<String, FileClipboardRedirectionEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("SERVER_TO_CLIENT_ENABLED", SERVER_TO_CLIENT_ENABLED);
            map.put("CLIENT_TO_SERVER_ENABLED", CLIENT_TO_SERVER_ENABLED);
            map.put("TWO_WAY_ENABLED", TWO_WAY_ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FileClipboardRedirectionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FileClipboardRedirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new FileClipboardRedirectionEnum(value));
        }

        public static FileClipboardRedirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FileClipboardRedirectionEnum) {
                return this.value.equals(((FileClipboardRedirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_clipboard_redirection")

    private FileClipboardRedirectionEnum fileClipboardRedirection;

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

    public PoliciesFileAndClipboardClipboardRedirectionOptions withRichTextClipboardRedirection(
        RichTextClipboardRedirectionEnum richTextClipboardRedirection) {
        this.richTextClipboardRedirection = richTextClipboardRedirection;
        return this;
    }

    /**
     * 剪切板富文本重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     * @return richTextClipboardRedirection
     */
    public RichTextClipboardRedirectionEnum getRichTextClipboardRedirection() {
        return richTextClipboardRedirection;
    }

    public void setRichTextClipboardRedirection(RichTextClipboardRedirectionEnum richTextClipboardRedirection) {
        this.richTextClipboardRedirection = richTextClipboardRedirection;
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

    public PoliciesFileAndClipboardClipboardRedirectionOptions withFileClipboardRedirection(
        FileClipboardRedirectionEnum fileClipboardRedirection) {
        this.fileClipboardRedirection = fileClipboardRedirection;
        return this;
    }

    /**
     * 剪切板文件重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     * @return fileClipboardRedirection
     */
    public FileClipboardRedirectionEnum getFileClipboardRedirection() {
        return fileClipboardRedirection;
    }

    public void setFileClipboardRedirection(FileClipboardRedirectionEnum fileClipboardRedirection) {
        this.fileClipboardRedirection = fileClipboardRedirection;
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
            && Objects.equals(this.richTextClipboardRedirection, that.richTextClipboardRedirection)
            && Objects.equals(this.clipboardFileRedirectionEnable, that.clipboardFileRedirectionEnable)
            && Objects.equals(this.fileClipboardRedirection, that.fileClipboardRedirection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(richTextRedirectionEnable,
            richTextClipboardRedirection,
            clipboardFileRedirectionEnable,
            fileClipboardRedirection);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboardClipboardRedirectionOptions {\n");
        sb.append("    richTextRedirectionEnable: ").append(toIndentedString(richTextRedirectionEnable)).append("\n");
        sb.append("    richTextClipboardRedirection: ")
            .append(toIndentedString(richTextClipboardRedirection))
            .append("\n");
        sb.append("    clipboardFileRedirectionEnable: ")
            .append(toIndentedString(clipboardFileRedirectionEnable))
            .append("\n");
        sb.append("    fileClipboardRedirection: ").append(toIndentedString(fileClipboardRedirection)).append("\n");
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
