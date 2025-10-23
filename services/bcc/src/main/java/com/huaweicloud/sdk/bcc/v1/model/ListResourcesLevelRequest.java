package com.huaweicloud.sdk.bcc.v1.model;

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
public class ListResourcesLevelRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /**
     * 云服务类型：ecs-云服务器，evs-云硬盘，sfsturbo-高性能文件存储，workspace-云桌面，rds-关系型数据库，gaussdb-高斯数据库
     */
    public static final class ProviderEnum {

        /**
         * Enum ECS for value: "ecs"
         */
        public static final ProviderEnum ECS = new ProviderEnum("ecs");

        /**
         * Enum EVS for value: "evs"
         */
        public static final ProviderEnum EVS = new ProviderEnum("evs");

        /**
         * Enum SFSTURBO for value: "sfsturbo"
         */
        public static final ProviderEnum SFSTURBO = new ProviderEnum("sfsturbo");

        /**
         * Enum WORKSPACE for value: "workspace"
         */
        public static final ProviderEnum WORKSPACE = new ProviderEnum("workspace");

        /**
         * Enum RDS for value: "rds"
         */
        public static final ProviderEnum RDS = new ProviderEnum("rds");

        /**
         * Enum GAUSSDB for value: "gaussdb"
         */
        public static final ProviderEnum GAUSSDB = new ProviderEnum("gaussdb");

        private static final Map<String, ProviderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProviderEnum> createStaticFields() {
            Map<String, ProviderEnum> map = new HashMap<>();
            map.put("ecs", ECS);
            map.put("evs", EVS);
            map.put("sfsturbo", SFSTURBO);
            map.put("workspace", WORKSPACE);
            map.put("rds", RDS);
            map.put("gaussdb", GAUSSDB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProviderEnum(String value) {
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
        public static ProviderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProviderEnum(value));
        }

        public static ProviderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProviderEnum) {
                return this.value.equals(((ProviderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider")

    private ProviderEnum provider;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliance_rule_id")

    private String complianceRuleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Long offset;

    public ListResourcesLevelRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 账号ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListResourcesLevelRequest withProvider(ProviderEnum provider) {
        this.provider = provider;
        return this;
    }

    /**
     * 云服务类型：ecs-云服务器，evs-云硬盘，sfsturbo-高性能文件存储，workspace-云桌面，rds-关系型数据库，gaussdb-高斯数据库
     * @return provider
     */
    public ProviderEnum getProvider() {
        return provider;
    }

    public void setProvider(ProviderEnum provider) {
        this.provider = provider;
    }

    public ListResourcesLevelRequest withComplianceRuleId(String complianceRuleId) {
        this.complianceRuleId = complianceRuleId;
        return this;
    }

    /**
     * 合规规则ID
     * @return complianceRuleId
     */
    public String getComplianceRuleId() {
        return complianceRuleId;
    }

    public void setComplianceRuleId(String complianceRuleId) {
        this.complianceRuleId = complianceRuleId;
    }

    public ListResourcesLevelRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 本次请求返回的最大记录条数。
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListResourcesLevelRequest withOffset(Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量
     * minimum: 0
     * maximum: 2147483647
     * @return offset
     */
    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListResourcesLevelRequest that = (ListResourcesLevelRequest) obj;
        return Objects.equals(this.domainId, that.domainId) && Objects.equals(this.provider, that.provider)
            && Objects.equals(this.complianceRuleId, that.complianceRuleId) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, provider, complianceRuleId, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListResourcesLevelRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
        sb.append("    complianceRuleId: ").append(toIndentedString(complianceRuleId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
