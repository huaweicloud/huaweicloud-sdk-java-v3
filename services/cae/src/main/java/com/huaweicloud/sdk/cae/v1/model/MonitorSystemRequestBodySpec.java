package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 创建或更新监控系统配置。
 */
public class MonitorSystemRequestBodySpec {

    /**
     * 采集方式。
     */
    public static final class TypeEnum {

        /**
         * Enum OPENTELEMETRY for value: "opentelemetry"
         */
        public static final TypeEnum OPENTELEMETRY = new TypeEnum("opentelemetry");

        /**
         * Enum APM2 for value: "apm2"
         */
        public static final TypeEnum APM2 = new TypeEnum("apm2");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("opentelemetry", OPENTELEMETRY);
            map.put("apm2", APM2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    /**
     * 探针注入方式。
     */
    public static final class InstrumentationEnum {

        /**
         * Enum MANUAL for value: "manual"
         */
        public static final InstrumentationEnum MANUAL = new InstrumentationEnum("manual");

        /**
         * Enum AUTOMATIC for value: "automatic"
         */
        public static final InstrumentationEnum AUTOMATIC = new InstrumentationEnum("automatic");

        private static final Map<String, InstrumentationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstrumentationEnum> createStaticFields() {
            Map<String, InstrumentationEnum> map = new HashMap<>();
            map.put("manual", MANUAL);
            map.put("automatic", AUTOMATIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstrumentationEnum(String value) {
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
        public static InstrumentationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InstrumentationEnum(value));
        }

        public static InstrumentationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InstrumentationEnum) {
                return this.value.equals(((InstrumentationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instrumentation")

    private InstrumentationEnum instrumentation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_value")

    private String accessValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_token")

    private String accessToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apm_application")

    private String apmApplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    /**
     * 探针镜像更新策略。
     */
    public static final class ImagePullPolicyEnum {

        /**
         * Enum ALWAYS for value: "Always"
         */
        public static final ImagePullPolicyEnum ALWAYS = new ImagePullPolicyEnum("Always");

        /**
         * Enum IFNOTPRESENT for value: "IfNotPresent"
         */
        public static final ImagePullPolicyEnum IFNOTPRESENT = new ImagePullPolicyEnum("IfNotPresent");

        private static final Map<String, ImagePullPolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ImagePullPolicyEnum> createStaticFields() {
            Map<String, ImagePullPolicyEnum> map = new HashMap<>();
            map.put("Always", ALWAYS);
            map.put("IfNotPresent", IFNOTPRESENT);
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
    @JsonProperty(value = "image_pull_policy")

    private ImagePullPolicyEnum imagePullPolicy;

    public MonitorSystemRequestBodySpec withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 采集方式。
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public MonitorSystemRequestBodySpec withInstrumentation(InstrumentationEnum instrumentation) {
        this.instrumentation = instrumentation;
        return this;
    }

    /**
     * 探针注入方式。
     * @return instrumentation
     */
    public InstrumentationEnum getInstrumentation() {
        return instrumentation;
    }

    public void setInstrumentation(InstrumentationEnum instrumentation) {
        this.instrumentation = instrumentation;
    }

    public MonitorSystemRequestBodySpec withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * apm2访问密钥Key。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public MonitorSystemRequestBodySpec withAccessValue(String accessValue) {
        this.accessValue = accessValue;
        return this;
    }

    /**
     * apm2访问密钥value。
     * @return accessValue
     */
    public String getAccessValue() {
        return accessValue;
    }

    public void setAccessValue(String accessValue) {
        this.accessValue = accessValue;
    }

    public MonitorSystemRequestBodySpec withAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * apm2 opentelemetry接入token。
     * @return accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public MonitorSystemRequestBodySpec withApmApplication(String apmApplication) {
        this.apmApplication = apmApplication;
        return this;
    }

    /**
     * apm2应用。
     * @return apmApplication
     */
    public String getApmApplication() {
        return apmApplication;
    }

    public void setApmApplication(String apmApplication) {
        this.apmApplication = apmApplication;
    }

    public MonitorSystemRequestBodySpec withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 增强型探针/opentelemetry探针版本。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MonitorSystemRequestBodySpec withImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
        return this;
    }

    /**
     * 探针镜像更新策略。
     * @return imagePullPolicy
     */
    public ImagePullPolicyEnum getImagePullPolicy() {
        return imagePullPolicy;
    }

    public void setImagePullPolicy(ImagePullPolicyEnum imagePullPolicy) {
        this.imagePullPolicy = imagePullPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MonitorSystemRequestBodySpec that = (MonitorSystemRequestBodySpec) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.instrumentation, that.instrumentation)
            && Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.accessValue, that.accessValue)
            && Objects.equals(this.accessToken, that.accessToken)
            && Objects.equals(this.apmApplication, that.apmApplication) && Objects.equals(this.version, that.version)
            && Objects.equals(this.imagePullPolicy, that.imagePullPolicy);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(type, instrumentation, accessKey, accessValue, accessToken, apmApplication, version, imagePullPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MonitorSystemRequestBodySpec {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instrumentation: ").append(toIndentedString(instrumentation)).append("\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    accessValue: ").append(toIndentedString(accessValue)).append("\n");
        sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
        sb.append("    apmApplication: ").append(toIndentedString(apmApplication)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
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
