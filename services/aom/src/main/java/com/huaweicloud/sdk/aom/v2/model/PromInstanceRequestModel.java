package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * PromInstanceRequestModel
 */
public class PromInstanceRequestModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_name")

    private String promName;

    /**
     * Prometheus实例类型（暂时不支持VPC、KUBERNETES）。
     */
    public static final class PromTypeEnum {

        /**
         * Enum ECS for value: "ECS"
         */
        public static final PromTypeEnum ECS = new PromTypeEnum("ECS");

        /**
         * Enum VPC for value: "VPC"
         */
        public static final PromTypeEnum VPC = new PromTypeEnum("VPC");

        /**
         * Enum CCE for value: "CCE"
         */
        public static final PromTypeEnum CCE = new PromTypeEnum("CCE");

        /**
         * Enum REMOTE_WRITE for value: "REMOTE_WRITE"
         */
        public static final PromTypeEnum REMOTE_WRITE = new PromTypeEnum("REMOTE_WRITE");

        /**
         * Enum KUBERNETES for value: "KUBERNETES"
         */
        public static final PromTypeEnum KUBERNETES = new PromTypeEnum("KUBERNETES");

        /**
         * Enum CLOUD_SERVICE for value: "CLOUD_SERVICE"
         */
        public static final PromTypeEnum CLOUD_SERVICE = new PromTypeEnum("CLOUD_SERVICE");

        /**
         * Enum ACROSS_ACCOUNT for value: "ACROSS_ACCOUNT"
         */
        public static final PromTypeEnum ACROSS_ACCOUNT = new PromTypeEnum("ACROSS_ACCOUNT");

        private static final Map<String, PromTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PromTypeEnum> createStaticFields() {
            Map<String, PromTypeEnum> map = new HashMap<>();
            map.put("ECS", ECS);
            map.put("VPC", VPC);
            map.put("CCE", CCE);
            map.put("REMOTE_WRITE", REMOTE_WRITE);
            map.put("KUBERNETES", KUBERNETES);
            map.put("CLOUD_SERVICE", CLOUD_SERVICE);
            map.put("ACROSS_ACCOUNT", ACROSS_ACCOUNT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PromTypeEnum(String value) {
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
        public static PromTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PromTypeEnum(value));
        }

        public static PromTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PromTypeEnum) {
                return this.value.equals(((PromTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_type")

    private PromTypeEnum promType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_version")

    private String promVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public PromInstanceRequestModel withPromName(String promName) {
        this.promName = promName;
        return this;
    }

    /**
     * Prometheus实例名称 名称不能以下划线或中划线开头结尾，只含有中文、英文、数字、下划线、中划线、长度1-100。
     * @return promName
     */
    public String getPromName() {
        return promName;
    }

    public void setPromName(String promName) {
        this.promName = promName;
    }

    public PromInstanceRequestModel withPromType(PromTypeEnum promType) {
        this.promType = promType;
        return this;
    }

    /**
     * Prometheus实例类型（暂时不支持VPC、KUBERNETES）。
     * @return promType
     */
    public PromTypeEnum getPromType() {
        return promType;
    }

    public void setPromType(PromTypeEnum promType) {
        this.promType = promType;
    }

    public PromInstanceRequestModel withPromVersion(String promVersion) {
        this.promVersion = promVersion;
        return this;
    }

    /**
     * Prometheus实例版本号。
     * @return promVersion
     */
    public String getPromVersion() {
        return promVersion;
    }

    public void setPromVersion(String promVersion) {
        this.promVersion = promVersion;
    }

    public PromInstanceRequestModel withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * Prometheus实例所属的企业项目。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PromInstanceRequestModel withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Prometheus实例所属projectId。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PromInstanceRequestModel that = (PromInstanceRequestModel) obj;
        return Objects.equals(this.promName, that.promName) && Objects.equals(this.promType, that.promType)
            && Objects.equals(this.promVersion, that.promVersion)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promName, promType, promVersion, enterpriseProjectId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromInstanceRequestModel {\n");
        sb.append("    promName: ").append(toIndentedString(promName)).append("\n");
        sb.append("    promType: ").append(toIndentedString(promType)).append("\n");
        sb.append("    promVersion: ").append(toIndentedString(promVersion)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
