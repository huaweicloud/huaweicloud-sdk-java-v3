package com.huaweicloud.sdk.config.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合规规则修正配置的请求体。
 */
public class RemediationConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic")

    private Boolean automatic;

    /**
     * 合规规则修正执行的方式。
     */
    public static final class TargetTypeEnum {

        /**
         * Enum FGS for value: "fgs"
         */
        public static final TargetTypeEnum FGS = new TargetTypeEnum("fgs");

        /**
         * Enum RFS for value: "rfs"
         */
        public static final TargetTypeEnum RFS = new TargetTypeEnum("rfs");

        private static final Map<String, TargetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TargetTypeEnum> createStaticFields() {
            Map<String, TargetTypeEnum> map = new HashMap<>();
            map.put("fgs", FGS);
            map.put("rfs", RFS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TargetTypeEnum(String value) {
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
        public static TargetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TargetTypeEnum(value));
        }

        public static TargetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TargetTypeEnum) {
                return this.value.equals(((TargetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_type")

    private TargetTypeEnum targetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_parameter")

    private List<RemediationStaticParameter> staticParameter = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_parameter")

    private RemediationResourceParameter resourceParameter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maximum_attempts")

    private Integer maximumAttempts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retry_attempt_seconds")

    private Integer retryAttemptSeconds;

    /**
     * 合规规则修正配置的权限方式。
     */
    public static final class AuthTypeEnum {

        /**
         * Enum AGENCY for value: "agency"
         */
        public static final AuthTypeEnum AGENCY = new AuthTypeEnum("agency");

        /**
         * Enum TRUSTAGENCY for value: "trustAgency"
         */
        public static final AuthTypeEnum TRUSTAGENCY = new AuthTypeEnum("trustAgency");

        private static final Map<String, AuthTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthTypeEnum> createStaticFields() {
            Map<String, AuthTypeEnum> map = new HashMap<>();
            map.put("agency", AGENCY);
            map.put("trustAgency", TRUSTAGENCY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthTypeEnum(String value) {
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
        public static AuthTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthTypeEnum(value));
        }

        public static AuthTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthTypeEnum) {
                return this.value.equals(((AuthTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_type")

    private AuthTypeEnum authType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_value")

    private String authValue;

    public RemediationConfigurationRequestBody withAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }

    /**
     * 是否为自动修正。
     * @return automatic
     */
    public Boolean getAutomatic() {
        return automatic;
    }

    public void setAutomatic(Boolean automatic) {
        this.automatic = automatic;
    }

    public RemediationConfigurationRequestBody withTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
        return this;
    }

    /**
     * 合规规则修正执行的方式。
     * @return targetType
     */
    public TargetTypeEnum getTargetType() {
        return targetType;
    }

    public void setTargetType(TargetTypeEnum targetType) {
        this.targetType = targetType;
    }

    public RemediationConfigurationRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 修正执行的目标ID。如果修正方式为fgs，则该值为函数工作流的函数urn；如果修正方式为rfs，则该值为资源编排服务的模板name与版本号，两者以/分割，如果没有指定默认V1。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    public RemediationConfigurationRequestBody withStaticParameter(List<RemediationStaticParameter> staticParameter) {
        this.staticParameter = staticParameter;
        return this;
    }

    public RemediationConfigurationRequestBody addStaticParameterItem(RemediationStaticParameter staticParameterItem) {
        if (this.staticParameter == null) {
            this.staticParameter = new ArrayList<>();
        }
        this.staticParameter.add(staticParameterItem);
        return this;
    }

    public RemediationConfigurationRequestBody withStaticParameter(
        Consumer<List<RemediationStaticParameter>> staticParameterSetter) {
        if (this.staticParameter == null) {
            this.staticParameter = new ArrayList<>();
        }
        staticParameterSetter.accept(this.staticParameter);
        return this;
    }

    /**
     * 修正执行的静态参数。
     * @return staticParameter
     */
    public List<RemediationStaticParameter> getStaticParameter() {
        return staticParameter;
    }

    public void setStaticParameter(List<RemediationStaticParameter> staticParameter) {
        this.staticParameter = staticParameter;
    }

    public RemediationConfigurationRequestBody withResourceParameter(RemediationResourceParameter resourceParameter) {
        this.resourceParameter = resourceParameter;
        return this;
    }

    public RemediationConfigurationRequestBody withResourceParameter(
        Consumer<RemediationResourceParameter> resourceParameterSetter) {
        if (this.resourceParameter == null) {
            this.resourceParameter = new RemediationResourceParameter();
            resourceParameterSetter.accept(this.resourceParameter);
        }

        return this;
    }

    /**
     * Get resourceParameter
     * @return resourceParameter
     */
    public RemediationResourceParameter getResourceParameter() {
        return resourceParameter;
    }

    public void setResourceParameter(RemediationResourceParameter resourceParameter) {
        this.resourceParameter = resourceParameter;
    }

    public RemediationConfigurationRequestBody withMaximumAttempts(Integer maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
        return this;
    }

    /**
     * 指定时间内自动修正的最大尝试次数。
     * minimum: 1
     * maximum: 25
     * @return maximumAttempts
     */
    public Integer getMaximumAttempts() {
        return maximumAttempts;
    }

    public void setMaximumAttempts(Integer maximumAttempts) {
        this.maximumAttempts = maximumAttempts;
    }

    public RemediationConfigurationRequestBody withRetryAttemptSeconds(Integer retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
        return this;
    }

    /**
     * 用于防止循环修正的时间窗口，如果在指定时间内进行了自动修正的最大尝试次数，则将资源添加至修正例外。
     * minimum: 60
     * maximum: 43200
     * @return retryAttemptSeconds
     */
    public Integer getRetryAttemptSeconds() {
        return retryAttemptSeconds;
    }

    public void setRetryAttemptSeconds(Integer retryAttemptSeconds) {
        this.retryAttemptSeconds = retryAttemptSeconds;
    }

    public RemediationConfigurationRequestBody withAuthType(AuthTypeEnum authType) {
        this.authType = authType;
        return this;
    }

    /**
     * 合规规则修正配置的权限方式。
     * @return authType
     */
    public AuthTypeEnum getAuthType() {
        return authType;
    }

    public void setAuthType(AuthTypeEnum authType) {
        this.authType = authType;
    }

    public RemediationConfigurationRequestBody withAuthValue(String authValue) {
        this.authValue = authValue;
        return this;
    }

    /**
     * 合规规则修正配置的权限信息。
     * @return authValue
     */
    public String getAuthValue() {
        return authValue;
    }

    public void setAuthValue(String authValue) {
        this.authValue = authValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RemediationConfigurationRequestBody that = (RemediationConfigurationRequestBody) obj;
        return Objects.equals(this.automatic, that.automatic) && Objects.equals(this.targetType, that.targetType)
            && Objects.equals(this.targetId, that.targetId)
            && Objects.equals(this.staticParameter, that.staticParameter)
            && Objects.equals(this.resourceParameter, that.resourceParameter)
            && Objects.equals(this.maximumAttempts, that.maximumAttempts)
            && Objects.equals(this.retryAttemptSeconds, that.retryAttemptSeconds)
            && Objects.equals(this.authType, that.authType) && Objects.equals(this.authValue, that.authValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(automatic,
            targetType,
            targetId,
            staticParameter,
            resourceParameter,
            maximumAttempts,
            retryAttemptSeconds,
            authType,
            authValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RemediationConfigurationRequestBody {\n");
        sb.append("    automatic: ").append(toIndentedString(automatic)).append("\n");
        sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
        sb.append("    staticParameter: ").append(toIndentedString(staticParameter)).append("\n");
        sb.append("    resourceParameter: ").append(toIndentedString(resourceParameter)).append("\n");
        sb.append("    maximumAttempts: ").append(toIndentedString(maximumAttempts)).append("\n");
        sb.append("    retryAttemptSeconds: ").append(toIndentedString(retryAttemptSeconds)).append("\n");
        sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
        sb.append("    authValue: ").append(toIndentedString(authValue)).append("\n");
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
