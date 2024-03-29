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
 * Request Object
 */
public class ListPromInstanceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_id")

    private String promId;

    /**
     * Prometheus实例类型（暂时不支持VPC、KUBERNETES）。
     */
    public static final class PromTypeEnum {

        /**
         * Enum DEFAULT for value: "default"
         */
        public static final PromTypeEnum DEFAULT = new PromTypeEnum("default");

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
            map.put("default", DEFAULT);
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

    /**
     * cce集群开关。
     */
    public static final class CceClusterEnableEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final CceClusterEnableEnum TRUE = new CceClusterEnableEnum("true");

        /**
         * Enum FALSE for value: "false"
         */
        public static final CceClusterEnableEnum FALSE = new CceClusterEnableEnum("false");

        private static final Map<String, CceClusterEnableEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CceClusterEnableEnum> createStaticFields() {
            Map<String, CceClusterEnableEnum> map = new HashMap<>();
            map.put("true", TRUE);
            map.put("false", FALSE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CceClusterEnableEnum(String value) {
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
        public static CceClusterEnableEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CceClusterEnableEnum(value));
        }

        public static CceClusterEnableEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CceClusterEnableEnum) {
                return this.value.equals(((CceClusterEnableEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cce_cluster_enable")

    private CceClusterEnableEnum cceClusterEnable;

    /**
     * Prometheus实例状态。
     */
    public static final class PromStatusEnum {

        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final PromStatusEnum DELETED = new PromStatusEnum("DELETED");

        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final PromStatusEnum NORMAL = new PromStatusEnum("NORMAL");

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PromStatusEnum ALL = new PromStatusEnum("ALL");

        private static final Map<String, PromStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PromStatusEnum> createStaticFields() {
            Map<String, PromStatusEnum> map = new HashMap<>();
            map.put("DELETED", DELETED);
            map.put("NORMAL", NORMAL);
            map.put("ALL", ALL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PromStatusEnum(String value) {
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
        public static PromStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PromStatusEnum(value));
        }

        public static PromStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PromStatusEnum) {
                return this.value.equals(((PromStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "prom_status")

    private PromStatusEnum promStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Enterprise-Project-Id")

    private String enterpriseProjectId;

    public ListPromInstanceRequest withPromId(String promId) {
        this.promId = promId;
        return this;
    }

    /**
     * Prometheus实例id(prom_id与prom_type同时存在时，仅prom_id生效)。
     * @return promId
     */
    public String getPromId() {
        return promId;
    }

    public void setPromId(String promId) {
        this.promId = promId;
    }

    public ListPromInstanceRequest withPromType(PromTypeEnum promType) {
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

    public ListPromInstanceRequest withCceClusterEnable(CceClusterEnableEnum cceClusterEnable) {
        this.cceClusterEnable = cceClusterEnable;
        return this;
    }

    /**
     * cce集群开关。
     * @return cceClusterEnable
     */
    public CceClusterEnableEnum getCceClusterEnable() {
        return cceClusterEnable;
    }

    public void setCceClusterEnable(CceClusterEnableEnum cceClusterEnable) {
        this.cceClusterEnable = cceClusterEnable;
    }

    public ListPromInstanceRequest withPromStatus(PromStatusEnum promStatus) {
        this.promStatus = promStatus;
        return this;
    }

    /**
     * Prometheus实例状态。
     * @return promStatus
     */
    public PromStatusEnum getPromStatus() {
        return promStatus;
    }

    public void setPromStatus(PromStatusEnum promStatus) {
        this.promStatus = promStatus;
    }

    public ListPromInstanceRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目id。 - 查询单个企业项目下实例，填写企业项目id。 - 查询所有企业项目下实例，填写“all_granted_eps”。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPromInstanceRequest that = (ListPromInstanceRequest) obj;
        return Objects.equals(this.promId, that.promId) && Objects.equals(this.promType, that.promType)
            && Objects.equals(this.cceClusterEnable, that.cceClusterEnable)
            && Objects.equals(this.promStatus, that.promStatus)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(promId, promType, cceClusterEnable, promStatus, enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPromInstanceRequest {\n");
        sb.append("    promId: ").append(toIndentedString(promId)).append("\n");
        sb.append("    promType: ").append(toIndentedString(promType)).append("\n");
        sb.append("    cceClusterEnable: ").append(toIndentedString(cceClusterEnable)).append("\n");
        sb.append("    promStatus: ").append(toIndentedString(promStatus)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
