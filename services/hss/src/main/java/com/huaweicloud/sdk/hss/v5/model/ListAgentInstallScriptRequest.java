package com.huaweicloud.sdk.hss.v5.model;

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
public class ListAgentInstallScriptRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    /**
     * os类型：Windows和Linux
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "Windows"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("Windows");

        /**
         * Enum LINUX for value: "Linux"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("Linux");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("Windows", WINDOWS);
            map.put("Linux", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    /**
     * 系统架构：x86_64和aarch64；当os_type为Windows时，只能选择x86_64
     */
    public static final class OsArchEnum {

        /**
         * Enum X86_64 for value: "x86_64"
         */
        public static final OsArchEnum X86_64 = new OsArchEnum("x86_64");

        /**
         * Enum AARCH64 for value: "aarch64"
         */
        public static final OsArchEnum AARCH64 = new OsArchEnum("aarch64");

        private static final Map<String, OsArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsArchEnum> createStaticFields() {
            Map<String, OsArchEnum> map = new HashMap<>();
            map.put("x86_64", X86_64);
            map.put("aarch64", AARCH64);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsArchEnum(String value) {
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
        public static OsArchEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsArchEnum(value));
        }

        public static OsArchEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsArchEnum) {
                return this.value.equals(((OsArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_arch")

    private OsArchEnum osArch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_host")

    private Boolean outsideHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "outside_group_id")

    private String outsideGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_install")

    private Boolean batchInstall;

    /**
     * 类型：password和ssh_key
     */
    public static final class TypeEnum {

        /**
         * Enum PASSWORD for value: "password"
         */
        public static final TypeEnum PASSWORD = new TypeEnum("password");

        /**
         * Enum SSH_KEY for value: "ssh_key"
         */
        public static final TypeEnum SSH_KEY = new TypeEnum("ssh_key");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("password", PASSWORD);
            map.put("ssh_key", SSH_KEY);
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

    public ListAgentInstallScriptRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Region ID
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListAgentInstallScriptRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，查询所有企业项目时填写：all_granted_eps
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListAgentInstallScriptRequest withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * os类型：Windows和Linux
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public ListAgentInstallScriptRequest withOsArch(OsArchEnum osArch) {
        this.osArch = osArch;
        return this;
    }

    /**
     * 系统架构：x86_64和aarch64；当os_type为Windows时，只能选择x86_64
     * @return osArch
     */
    public OsArchEnum getOsArch() {
        return osArch;
    }

    public void setOsArch(OsArchEnum osArch) {
        this.osArch = osArch;
    }

    public ListAgentInstallScriptRequest withOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
        return this;
    }

    /**
     * 是否非华为云
     * @return outsideHost
     */
    public Boolean getOutsideHost() {
        return outsideHost;
    }

    public void setOutsideHost(Boolean outsideHost) {
        this.outsideHost = outsideHost;
    }

    public ListAgentInstallScriptRequest withOutsideGroupId(String outsideGroupId) {
        this.outsideGroupId = outsideGroupId;
        return this;
    }

    /**
     * 服务器组ID
     * @return outsideGroupId
     */
    public String getOutsideGroupId() {
        return outsideGroupId;
    }

    public void setOutsideGroupId(String outsideGroupId) {
        this.outsideGroupId = outsideGroupId;
    }

    public ListAgentInstallScriptRequest withBatchInstall(Boolean batchInstall) {
        this.batchInstall = batchInstall;
        return this;
    }

    /**
     * 是否批量安装
     * @return batchInstall
     */
    public Boolean getBatchInstall() {
        return batchInstall;
    }

    public void setBatchInstall(Boolean batchInstall) {
        this.batchInstall = batchInstall;
    }

    public ListAgentInstallScriptRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 类型：password和ssh_key
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAgentInstallScriptRequest that = (ListAgentInstallScriptRequest) obj;
        return Objects.equals(this.region, that.region)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osArch, that.osArch)
            && Objects.equals(this.outsideHost, that.outsideHost)
            && Objects.equals(this.outsideGroupId, that.outsideGroupId)
            && Objects.equals(this.batchInstall, that.batchInstall) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(region, enterpriseProjectId, osType, osArch, outsideHost, outsideGroupId, batchInstall, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAgentInstallScriptRequest {\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osArch: ").append(toIndentedString(osArch)).append("\n");
        sb.append("    outsideHost: ").append(toIndentedString(outsideHost)).append("\n");
        sb.append("    outsideGroupId: ").append(toIndentedString(outsideGroupId)).append("\n");
        sb.append("    batchInstall: ").append(toIndentedString(batchInstall)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
