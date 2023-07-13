package com.huaweicloud.sdk.workspaceapp.v1.model;

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
    @JsonProperty(value = "bypass_in_remote_app_enable")

    private Boolean bypassInRemoteAppEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_redirection")

    private PoliciesFileAndClipboardFileRedirection fileRedirection;

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

    public PoliciesFileAndClipboard withBypassInRemoteAppEnable(Boolean bypassInRemoteAppEnable) {
        this.bypassInRemoteAppEnable = bypassInRemoteAppEnable;
        return this;
    }

    /**
     * 应用聚合场景下是否双向放通：取值为： false：表示不放通。 true：表示放通。
     * @return bypassInRemoteAppEnable
     */
    public Boolean getBypassInRemoteAppEnable() {
        return bypassInRemoteAppEnable;
    }

    public void setBypassInRemoteAppEnable(Boolean bypassInRemoteAppEnable) {
        this.bypassInRemoteAppEnable = bypassInRemoteAppEnable;
    }

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
        return Objects.equals(this.bypassInRemoteAppEnable, that.bypassInRemoteAppEnable)
            && Objects.equals(this.fileRedirection, that.fileRedirection)
            && Objects.equals(this.fdMobileClientRedirEnable, that.fdMobileClientRedirEnable)
            && Objects.equals(this.clipboardRedirection, that.clipboardRedirection)
            && Objects.equals(this.clipboardRedirectionOptions, that.clipboardRedirectionOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bypassInRemoteAppEnable,
            fileRedirection,
            fdMobileClientRedirEnable,
            clipboardRedirection,
            clipboardRedirectionOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboard {\n");
        sb.append("    bypassInRemoteAppEnable: ").append(toIndentedString(bypassInRemoteAppEnable)).append("\n");
        sb.append("    fileRedirection: ").append(toIndentedString(fileRedirection)).append("\n");
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
