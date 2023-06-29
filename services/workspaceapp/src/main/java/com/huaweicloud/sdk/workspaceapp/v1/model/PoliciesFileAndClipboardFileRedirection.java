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
 * 文件重定向。
 */
public class PoliciesFileAndClipboardFileRedirection {

    /**
     * 文件重定向。取值为： DISABLED：表示禁用。（默认） READ_ONLY：表示只读。 READ_AND_WRITE：表示读写。
     */
    public static final class RedirectionModeEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final RedirectionModeEnum DISABLED = new RedirectionModeEnum("DISABLED");

        /**
         * Enum READ_ONLY for value: "READ_ONLY"
         */
        public static final RedirectionModeEnum READ_ONLY = new RedirectionModeEnum("READ_ONLY");

        /**
         * Enum READ_AND_WRITE for value: "READ_AND_WRITE"
         */
        public static final RedirectionModeEnum READ_AND_WRITE = new RedirectionModeEnum("READ_AND_WRITE");

        private static final Map<String, RedirectionModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RedirectionModeEnum> createStaticFields() {
            Map<String, RedirectionModeEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("READ_ONLY", READ_ONLY);
            map.put("READ_AND_WRITE", READ_AND_WRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RedirectionModeEnum(String value) {
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
        public static RedirectionModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RedirectionModeEnum(value));
        }

        public static RedirectionModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RedirectionModeEnum) {
                return this.value.equals(((RedirectionModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirection_mode")

    private RedirectionModeEnum redirectionMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private PoliciesFileAndClipboardFileRedirectionOptions options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vm_send_file_client")

    private Boolean vmSendFileClient;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirection_send_file_options")

    private PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions redirectionSendFileOptions;

    public PoliciesFileAndClipboardFileRedirection withRedirectionMode(RedirectionModeEnum redirectionMode) {
        this.redirectionMode = redirectionMode;
        return this;
    }

    /**
     * 文件重定向。取值为： DISABLED：表示禁用。（默认） READ_ONLY：表示只读。 READ_AND_WRITE：表示读写。
     * @return redirectionMode
     */
    public RedirectionModeEnum getRedirectionMode() {
        return redirectionMode;
    }

    public void setRedirectionMode(RedirectionModeEnum redirectionMode) {
        this.redirectionMode = redirectionMode;
    }

    public PoliciesFileAndClipboardFileRedirection withOptions(PoliciesFileAndClipboardFileRedirectionOptions options) {
        this.options = options;
        return this;
    }

    public PoliciesFileAndClipboardFileRedirection withOptions(
        Consumer<PoliciesFileAndClipboardFileRedirectionOptions> optionsSetter) {
        if (this.options == null) {
            this.options = new PoliciesFileAndClipboardFileRedirectionOptions();
            optionsSetter.accept(this.options);
        }

        return this;
    }

    /**
     * Get options
     * @return options
     */
    public PoliciesFileAndClipboardFileRedirectionOptions getOptions() {
        return options;
    }

    public void setOptions(PoliciesFileAndClipboardFileRedirectionOptions options) {
        this.options = options;
    }

    public PoliciesFileAndClipboardFileRedirection withVmSendFileClient(Boolean vmSendFileClient) {
        this.vmSendFileClient = vmSendFileClient;
        return this;
    }

    /**
     * 是否开启发送文件（虚机到客户端）。取值为： false：表示关闭。 true：表示开启。
     * @return vmSendFileClient
     */
    public Boolean getVmSendFileClient() {
        return vmSendFileClient;
    }

    public void setVmSendFileClient(Boolean vmSendFileClient) {
        this.vmSendFileClient = vmSendFileClient;
    }

    public PoliciesFileAndClipboardFileRedirection withRedirectionSendFileOptions(
        PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions redirectionSendFileOptions) {
        this.redirectionSendFileOptions = redirectionSendFileOptions;
        return this;
    }

    public PoliciesFileAndClipboardFileRedirection withRedirectionSendFileOptions(
        Consumer<PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions> redirectionSendFileOptionsSetter) {
        if (this.redirectionSendFileOptions == null) {
            this.redirectionSendFileOptions = new PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions();
            redirectionSendFileOptionsSetter.accept(this.redirectionSendFileOptions);
        }

        return this;
    }

    /**
     * Get redirectionSendFileOptions
     * @return redirectionSendFileOptions
     */
    public PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions getRedirectionSendFileOptions() {
        return redirectionSendFileOptions;
    }

    public void setRedirectionSendFileOptions(
        PoliciesFileAndClipboardFileRedirectionRedirectionSendFileOptions redirectionSendFileOptions) {
        this.redirectionSendFileOptions = redirectionSendFileOptions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesFileAndClipboardFileRedirection that = (PoliciesFileAndClipboardFileRedirection) obj;
        return Objects.equals(this.redirectionMode, that.redirectionMode) && Objects.equals(this.options, that.options)
            && Objects.equals(this.vmSendFileClient, that.vmSendFileClient)
            && Objects.equals(this.redirectionSendFileOptions, that.redirectionSendFileOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(redirectionMode, options, vmSendFileClient, redirectionSendFileOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesFileAndClipboardFileRedirection {\n");
        sb.append("    redirectionMode: ").append(toIndentedString(redirectionMode)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    vmSendFileClient: ").append(toIndentedString(vmSendFileClient)).append("\n");
        sb.append("    redirectionSendFileOptions: ").append(toIndentedString(redirectionSendFileOptions)).append("\n");
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
