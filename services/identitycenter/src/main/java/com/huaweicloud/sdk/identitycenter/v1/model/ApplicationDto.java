package com.huaweicloud.sdk.identitycenter.v1.model;

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
 * 应用程序
 */
public class ApplicationDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_urn")

    private String applicationUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_provider_urn")

    private String applicationProviderUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "assignment_config")

    private AssignmentConfigDto assignmentConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_date")

    private Long createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_urn")

    private String instanceUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portal_options")

    private PortalOptionsDto portalOptions;

    /**
     * 应用程序状态
     */
    public static final class StatusEnum {

        /**
         * Enum DISABLED for value: "DISABLED"
         */
        public static final StatusEnum DISABLED = new StatusEnum("DISABLED");

        /**
         * Enum ENABLED for value: "ENABLED"
         */
        public static final StatusEnum ENABLED = new StatusEnum("ENABLED");

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("DISABLED", DISABLED);
            map.put("ENABLED", ENABLED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatusEnum(value));
        }

        public static StatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_account")

    private String applicationAccount;

    public ApplicationDto withApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
        return this;
    }

    /**
     * 应用程序URN
     * @return applicationUrn
     */
    public String getApplicationUrn() {
        return applicationUrn;
    }

    public void setApplicationUrn(String applicationUrn) {
        this.applicationUrn = applicationUrn;
    }

    public ApplicationDto withApplicationProviderUrn(String applicationProviderUrn) {
        this.applicationProviderUrn = applicationProviderUrn;
        return this;
    }

    /**
     * 应用程序提供商URN
     * @return applicationProviderUrn
     */
    public String getApplicationProviderUrn() {
        return applicationProviderUrn;
    }

    public void setApplicationProviderUrn(String applicationProviderUrn) {
        this.applicationProviderUrn = applicationProviderUrn;
    }

    public ApplicationDto withAssignmentConfig(AssignmentConfigDto assignmentConfig) {
        this.assignmentConfig = assignmentConfig;
        return this;
    }

    public ApplicationDto withAssignmentConfig(Consumer<AssignmentConfigDto> assignmentConfigSetter) {
        if (this.assignmentConfig == null) {
            this.assignmentConfig = new AssignmentConfigDto();
            assignmentConfigSetter.accept(this.assignmentConfig);
        }

        return this;
    }

    /**
     * Get assignmentConfig
     * @return assignmentConfig
     */
    public AssignmentConfigDto getAssignmentConfig() {
        return assignmentConfig;
    }

    public void setAssignmentConfig(AssignmentConfigDto assignmentConfig) {
        this.assignmentConfig = assignmentConfig;
    }

    public ApplicationDto withCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * 应用程序创建时间
     * @return createdDate
     */
    public Long getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Long createdDate) {
        this.createdDate = createdDate;
    }

    public ApplicationDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用程序描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ApplicationDto withInstanceUrn(String instanceUrn) {
        this.instanceUrn = instanceUrn;
        return this;
    }

    /**
     * IAM身份中心实例URN
     * @return instanceUrn
     */
    public String getInstanceUrn() {
        return instanceUrn;
    }

    public void setInstanceUrn(String instanceUrn) {
        this.instanceUrn = instanceUrn;
    }

    public ApplicationDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用程序显示名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationDto withPortalOptions(PortalOptionsDto portalOptions) {
        this.portalOptions = portalOptions;
        return this;
    }

    public ApplicationDto withPortalOptions(Consumer<PortalOptionsDto> portalOptionsSetter) {
        if (this.portalOptions == null) {
            this.portalOptions = new PortalOptionsDto();
            portalOptionsSetter.accept(this.portalOptions);
        }

        return this;
    }

    /**
     * Get portalOptions
     * @return portalOptions
     */
    public PortalOptionsDto getPortalOptions() {
        return portalOptions;
    }

    public void setPortalOptions(PortalOptionsDto portalOptions) {
        this.portalOptions = portalOptions;
    }

    public ApplicationDto withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 应用程序状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ApplicationDto withApplicationAccount(String applicationAccount) {
        this.applicationAccount = applicationAccount;
        return this;
    }

    /**
     * 华为云账号
     * @return applicationAccount
     */
    public String getApplicationAccount() {
        return applicationAccount;
    }

    public void setApplicationAccount(String applicationAccount) {
        this.applicationAccount = applicationAccount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplicationDto that = (ApplicationDto) obj;
        return Objects.equals(this.applicationUrn, that.applicationUrn)
            && Objects.equals(this.applicationProviderUrn, that.applicationProviderUrn)
            && Objects.equals(this.assignmentConfig, that.assignmentConfig)
            && Objects.equals(this.createdDate, that.createdDate) && Objects.equals(this.description, that.description)
            && Objects.equals(this.instanceUrn, that.instanceUrn) && Objects.equals(this.name, that.name)
            && Objects.equals(this.portalOptions, that.portalOptions) && Objects.equals(this.status, that.status)
            && Objects.equals(this.applicationAccount, that.applicationAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationUrn,
            applicationProviderUrn,
            assignmentConfig,
            createdDate,
            description,
            instanceUrn,
            name,
            portalOptions,
            status,
            applicationAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationDto {\n");
        sb.append("    applicationUrn: ").append(toIndentedString(applicationUrn)).append("\n");
        sb.append("    applicationProviderUrn: ").append(toIndentedString(applicationProviderUrn)).append("\n");
        sb.append("    assignmentConfig: ").append(toIndentedString(assignmentConfig)).append("\n");
        sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceUrn: ").append(toIndentedString(instanceUrn)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    portalOptions: ").append(toIndentedString(portalOptions)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    applicationAccount: ").append(toIndentedString(applicationAccount)).append("\n");
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
