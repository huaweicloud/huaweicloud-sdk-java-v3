package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowSinglePluginResponse extends SdkResponse {

    /**
     * 拉取OCI镜像的行为
     */
    public static final class ImagePullPolicyEnum {

        /**
         * Enum UNSPECIFIED_POLICY for value: "UNSPECIFIED_POLICY"
         */
        public static final ImagePullPolicyEnum UNSPECIFIED_POLICY = new ImagePullPolicyEnum("UNSPECIFIED_POLICY");

        /**
         * Enum IFNOTPRESENT for value: "IfNotPresent"
         */
        public static final ImagePullPolicyEnum IFNOTPRESENT = new ImagePullPolicyEnum("IfNotPresent");

        /**
         * Enum ALWAYS for value: "Always"
         */
        public static final ImagePullPolicyEnum ALWAYS = new ImagePullPolicyEnum("Always");

        private static final Map<String, ImagePullPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagePullPolicyEnum> createStaticFields() {
            Map<String, ImagePullPolicyEnum> map = new HashMap<>();
            map.put("UNSPECIFIED_POLICY", UNSPECIFIED_POLICY);
            map.put("IfNotPresent", IFNOTPRESENT);
            map.put("Always", ALWAYS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ImagePullPolicyEnum(String value) {
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
        public static ImagePullPolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ImagePullPolicyEnum(value));
        }

        public static ImagePullPolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ImagePullPolicyEnum) {
                return this.value.equals(((ImagePullPolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imagePullPolicy")

    private ImagePullPolicyEnum imagePullPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "imagePullSecret")

    private String imagePullSecret;

    /**
     * 确定插件将在过滤器链中的何处注入。
     */
    public static final class PhaseEnum {

        /**
         * Enum UNSPECIFIED_PHASE for value: "UNSPECIFIED_PHASE"
         */
        public static final PhaseEnum UNSPECIFIED_PHASE = new PhaseEnum("UNSPECIFIED_PHASE");

        /**
         * Enum AUTHN for value: "AUTHN"
         */
        public static final PhaseEnum AUTHN = new PhaseEnum("AUTHN");

        /**
         * Enum AUTHZ for value: "AUTHZ"
         */
        public static final PhaseEnum AUTHZ = new PhaseEnum("AUTHZ");

        /**
         * Enum STATS for value: "STATS"
         */
        public static final PhaseEnum STATS = new PhaseEnum("STATS");

        private static final Map<String, PhaseEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PhaseEnum> createStaticFields() {
            Map<String, PhaseEnum> map = new HashMap<>();
            map.put("UNSPECIFIED_PHASE", UNSPECIFIED_PHASE);
            map.put("AUTHN", AUTHN);
            map.put("AUTHZ", AUTHZ);
            map.put("STATS", STATS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PhaseEnum(String value) {
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
        public static PhaseEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PhaseEnum(value));
        }

        public static PhaseEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PhaseEnum) {
                return this.value.equals(((PhaseEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase")

    private PhaseEnum phase;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pluginConfig")

    private Object pluginConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pluginName")

    private String pluginName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verificationKey")

    private String verificationKey;

    public ShowSinglePluginResponse withImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * 拉取OCI镜像的行为
     * @return imagePullPolicy
     */
    public ImagePullPolicyEnum getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    public ShowSinglePluginResponse withImagePullSecret(String imagePullSecret) {
        this.imagePullSecret = imagePullSecret;
        return this;
    }

    /**
     * 拉取OCI 镜像的凭据
     * @return imagePullSecret
     */
    public String getImagePullSecret() {
        return imagePullSecret;
    }

    public void setImagePullSecret(String imagePullSecret) {
        this.imagePullSecret = imagePullSecret;
    }

    public ShowSinglePluginResponse withPhase(PhaseEnum phase) {
        this.phase = phase;
        return this;
    }

    /**
     * 确定插件将在过滤器链中的何处注入。
     * @return phase
     */
    public PhaseEnum getPhase() {
        return phase;
    }

    public void setPhase(PhaseEnum phase) {
        this.phase = phase;
    }

    public ShowSinglePluginResponse withPluginConfig(Object pluginConfig) {
        this.pluginConfig = pluginConfig;
        return this;
    }

    /**
     * 传递给插件的配置。
     * @return pluginConfig
     */
    public Object getPluginConfig() {
        return pluginConfig;
    }

    public void setPluginConfig(Object pluginConfig) {
        this.pluginConfig = pluginConfig;
    }

    public ShowSinglePluginResponse withPluginName(String pluginName) {
        this.pluginName = pluginName;
        return this;
    }

    /**
     * 插件名。
     * @return pluginName
     */
    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public ShowSinglePluginResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 插件的调用优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ShowSinglePluginResponse withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * 用于校验插件和容器的校验和。
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public ShowSinglePluginResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 插件或容器的下载地址。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ShowSinglePluginResponse withVerificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
        return this;
    }

    /**
     * 校验值。
     * @return verificationKey
     */
    public String getVerificationKey() {
        return verificationKey;
    }

    public void setVerificationKey(String verificationKey) {
        this.verificationKey = verificationKey;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSinglePluginResponse that = (ShowSinglePluginResponse) obj;
        return Objects.equals(this.imagePullPolicy, that.imagePullPolicy)
            && Objects.equals(this.imagePullSecret, that.imagePullSecret) && Objects.equals(this.phase, that.phase)
            && Objects.equals(this.pluginConfig, that.pluginConfig) && Objects.equals(this.pluginName, that.pluginName)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.sha256, that.sha256)
            && Objects.equals(this.url, that.url) && Objects.equals(this.verificationKey, that.verificationKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imagePullPolicy,
            imagePullSecret,
            phase,
            pluginConfig,
            pluginName,
            priority,
            sha256,
            url,
            verificationKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSinglePluginResponse {\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
        sb.append("    imagePullSecret: ").append(toIndentedString(imagePullSecret)).append("\n");
        sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
        sb.append("    pluginConfig: ").append(toIndentedString(pluginConfig)).append("\n");
        sb.append("    pluginName: ").append(toIndentedString(pluginName)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    verificationKey: ").append(toIndentedString(verificationKey)).append("\n");
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
