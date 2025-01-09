package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件和剪切板。
 */
public class PoliciesFileAndClipboard {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection")

    private PoliciesFileAndClipboardFileRedirection fileRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_length_limit_flag_c2s")

    private Boolean clipLengthLimitFlagC2s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_length_limit_c2s")

    private Integer clipLengthLimitC2s;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_length_limit_flag_s2c")

    private Boolean clipLengthLimitFlagS2c;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clip_length_limit_s2c")

    private Integer clipLengthLimitS2c;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fd_mobile_client_redir_enable")

    private Boolean fdMobileClientRedirEnable;

    /**
     * 剪切板重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     */
    public static final class ClipboardRedirectionEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final ClipboardRedirectionEnum DISABLED = new ClipboardRedirectionEnum("DISABLED");

        /**
         * Enum SERVER_TO_CLIENT_ENABLED for value: "SERVER_TO_CLIENT_ENABLED"
         */
        public static final ClipboardRedirectionEnum SERVER_TO_CLIENT_ENABLED =
            new ClipboardRedirectionEnum("SERVER_TO_CLIENT_ENABLED");

        /**
         * Enum CLIENT_TO_SERVER_ENABLED for value: "CLIENT_TO_SERVER_ENABLED"
         */
        public static final ClipboardRedirectionEnum CLIENT_TO_SERVER_ENABLED =
            new ClipboardRedirectionEnum("CLIENT_TO_SERVER_ENABLED");

        /**
         * Enum TWO_WAY_ENABLED for value: "TWO_WAY_ENABLED"
         */
        public static final ClipboardRedirectionEnum TWO_WAY_ENABLED = new ClipboardRedirectionEnum("TWO_WAY_ENABLED");

        private static final Map<String, ClipboardRedirectionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClipboardRedirectionEnum> createStaticFields() {
            Map<String, ClipboardRedirectionEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("SERVER_TO_CLIENT_ENABLED", SERVER_TO_CLIENT_ENABLED);
            map.put("CLIENT_TO_SERVER_ENABLED", CLIENT_TO_SERVER_ENABLED);
            map.put("TWO_WAY_ENABLED", TWO_WAY_ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClipboardRedirectionEnum(String value) {
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
        public static ClipboardRedirectionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClipboardRedirectionEnum(value));
        }

        public static ClipboardRedirectionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClipboardRedirectionEnum) {
                return this.value.equals(((ClipboardRedirectionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_redirection")

    private ClipboardRedirectionEnum clipboardRedirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clipboard_redirection_options")

    private PoliciesFileAndClipboardClipboardRedirectionOptions clipboardRedirectionOptions;

    public PoliciesFileAndClipboard withFileRedirection(PoliciesFileAndClipboardFileRedirection fileRedirection) {
        this.fileRedirection = fileRedirection;
        return this;
    }

    public PoliciesFileAndClipboard withFileRedirection(
        Consumer<PoliciesFileAndClipboardFileRedirection> fileRedirectionSetter) {
        if (this.fileRedirection == null) {
            this.fileRedirection = new PoliciesFileAndClipboardFileRedirection();
            fileRedirectionSetter.accept(this.fileRedirection);
        }

        return this;
    }

    /**
     * Get fileRedirection
     * @return fileRedirection
     */
    public PoliciesFileAndClipboardFileRedirection getFileRedirection() {
        return fileRedirection;
    }

    public void setFileRedirection(PoliciesFileAndClipboardFileRedirection fileRedirection) {
        this.fileRedirection = fileRedirection;
    }

    public PoliciesFileAndClipboard withClipLengthLimitFlagC2s(Boolean clipLengthLimitFlagC2s) {
        this.clipLengthLimitFlagC2s = clipLengthLimitFlagC2s;
        return this;
    }

    /**
     * 剪切板长度表示
     * @return clipLengthLimitFlagC2s
     */
    public Boolean getClipLengthLimitFlagC2s() {
        return clipLengthLimitFlagC2s;
    }

    public void setClipLengthLimitFlagC2s(Boolean clipLengthLimitFlagC2s) {
        this.clipLengthLimitFlagC2s = clipLengthLimitFlagC2s;
    }

    public PoliciesFileAndClipboard withClipLengthLimitC2s(Integer clipLengthLimitC2s) {
        this.clipLengthLimitC2s = clipLengthLimitC2s;
        return this;
    }

    /**
     * 剪切板客户端长度
     * @return clipLengthLimitC2s
     */
    public Integer getClipLengthLimitC2s() {
        return clipLengthLimitC2s;
    }

    public void setClipLengthLimitC2s(Integer clipLengthLimitC2s) {
        this.clipLengthLimitC2s = clipLengthLimitC2s;
    }

    public PoliciesFileAndClipboard withClipLengthLimitFlagS2c(Boolean clipLengthLimitFlagS2c) {
        this.clipLengthLimitFlagS2c = clipLengthLimitFlagS2c;
        return this;
    }

    /**
     * 剪切板长度表示
     * @return clipLengthLimitFlagS2c
     */
    public Boolean getClipLengthLimitFlagS2c() {
        return clipLengthLimitFlagS2c;
    }

    public void setClipLengthLimitFlagS2c(Boolean clipLengthLimitFlagS2c) {
        this.clipLengthLimitFlagS2c = clipLengthLimitFlagS2c;
    }

    public PoliciesFileAndClipboard withClipLengthLimitS2c(Integer clipLengthLimitS2c) {
        this.clipLengthLimitS2c = clipLengthLimitS2c;
        return this;
    }

    /**
     * 剪切板客户端长度
     * @return clipLengthLimitS2c
     */
    public Integer getClipLengthLimitS2c() {
        return clipLengthLimitS2c;
    }

    public void setClipLengthLimitS2c(Integer clipLengthLimitS2c) {
        this.clipLengthLimitS2c = clipLengthLimitS2c;
    }

    public PoliciesFileAndClipboard withFdMobileClientRedirEnable(Boolean fdMobileClientRedirEnable) {
        this.fdMobileClientRedirEnable = fdMobileClientRedirEnable;
        return this;
    }

    /**
     * 移动客户端文件重定向：取值为： false：表示关闭。 true：表示开启。
     * @return fdMobileClientRedirEnable
     */
    public Boolean getFdMobileClientRedirEnable() {
        return fdMobileClientRedirEnable;
    }

    public void setFdMobileClientRedirEnable(Boolean fdMobileClientRedirEnable) {
        this.fdMobileClientRedirEnable = fdMobileClientRedirEnable;
    }

    public PoliciesFileAndClipboard withClipboardRedirection(ClipboardRedirectionEnum clipboardRedirection) {
        this.clipboardRedirection = clipboardRedirection;
        return this;
    }

    /**
     * 剪切板重定向。取值为： DISABLED：表示禁用。（默认） SERVER_TO_CLIENT_ENABLED：表示开启服务端到客户端。 CLIENT_TO_SERVER_ENABLED：表示开启客户端到服务端。 TWO_WAY_ENABLED：表示开启双向。
     * @return clipboardRedirection
     */
    public ClipboardRedirectionEnum getClipboardRedirection() {
        return clipboardRedirection;
    }

    public void setClipboardRedirection(ClipboardRedirectionEnum clipboardRedirection) {
        this.clipboardRedirection = clipboardRedirection;
    }

    public PoliciesFileAndClipboard withClipboardRedirectionOptions(
        PoliciesFileAndClipboardClipboardRedirectionOptions clipboardRedirectionOptions) {
        this.clipboardRedirectionOptions = clipboardRedirectionOptions;
        return this;
    }

    public PoliciesFileAndClipboard withClipboardRedirectionOptions(
        Consumer<PoliciesFileAndClipboardClipboardRedirectionOptions> clipboardRedirectionOptionsSetter) {
        if (this.clipboardRedirectionOptions == null) {
            this.clipboardRedirectionOptions = new PoliciesFileAndClipboardClipboardRedirectionOptions();
            clipboardRedirectionOptionsSetter.accept(this.clipboardRedirectionOptions);
        }

        return this;
    }

    /**
     * Get clipboardRedirectionOptions
     * @return clipboardRedirectionOptions
     */
    public PoliciesFileAndClipboardClipboardRedirectionOptions getClipboardRedirectionOptions() {
        return clipboardRedirectionOptions;
    }

    public void setClipboardRedirectionOptions(
        PoliciesFileAndClipboardClipboardRedirectionOptions clipboardRedirectionOptions) {
        this.clipboardRedirectionOptions = clipboardRedirectionOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFileAndClipboard that = (PoliciesFileAndClipboard) obj;
        return Objects.equals(this.fileRedirection, that.fileRedirection)
            && Objects.equals(this.clipLengthLimitFlagC2s, that.clipLengthLimitFlagC2s)
            && Objects.equals(this.clipLengthLimitC2s, that.clipLengthLimitC2s)
            && Objects.equals(this.clipLengthLimitFlagS2c, that.clipLengthLimitFlagS2c)
            && Objects.equals(this.clipLengthLimitS2c, that.clipLengthLimitS2c)
            && Objects.equals(this.fdMobileClientRedirEnable, that.fdMobileClientRedirEnable)
            && Objects.equals(this.clipboardRedirection, that.clipboardRedirection)
            && Objects.equals(this.clipboardRedirectionOptions, that.clipboardRedirectionOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileRedirection,
            clipLengthLimitFlagC2s,
            clipLengthLimitC2s,
            clipLengthLimitFlagS2c,
            clipLengthLimitS2c,
            fdMobileClientRedirEnable,
            clipboardRedirection,
            clipboardRedirectionOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboard {\n");
        sb.append("    fileRedirection: ").append(toIndentedString(fileRedirection)).append("\n");
        sb.append("    clipLengthLimitFlagC2s: ").append(toIndentedString(clipLengthLimitFlagC2s)).append("\n");
        sb.append("    clipLengthLimitC2s: ").append(toIndentedString(clipLengthLimitC2s)).append("\n");
        sb.append("    clipLengthLimitFlagS2c: ").append(toIndentedString(clipLengthLimitFlagS2c)).append("\n");
        sb.append("    clipLengthLimitS2c: ").append(toIndentedString(clipLengthLimitS2c)).append("\n");
        sb.append("    fdMobileClientRedirEnable: ").append(toIndentedString(fdMobileClientRedirEnable)).append("\n");
        sb.append("    clipboardRedirection: ").append(toIndentedString(clipboardRedirection)).append("\n");
        sb.append("    clipboardRedirectionOptions: ")
            .append(toIndentedString(clipboardRedirectionOptions))
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
