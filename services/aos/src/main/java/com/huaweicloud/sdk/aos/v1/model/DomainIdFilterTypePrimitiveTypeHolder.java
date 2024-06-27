package com.huaweicloud.sdk.aos.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DomainIdFilterTypePrimitiveTypeHolder
 */
public class DomainIdFilterTypePrimitiveTypeHolder {

    /**
     * 租户ID筛选类型，仅支持资源栈集权限模型是SERVICE_MANAGED时指定该参数。默认为NONE  用户可以指定不同的筛选类型，通过domain_ids或domain_ids_uri 指定或排除部署的用户信息，以增加或限制部署目标用户范围，实现不同的部署策略。     * `INTERSECTION` - 从所提供的 OUs 中选择指定用户进行部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `DIFFERENCE` - 从所提供的 OUs 中排除指定用户部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `UNION` - 除了部署到提供的 OUs 外，还将部署到指定的账户中。用户可以通过同时指定organizational_unit_ids 和 domain_ids/domain_ids_uri 以实现在同一请求中部署整个OU和来自不同OU的特定个人账户。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。创建资源栈实例（CreateStackInstances）除外，该API 不允许指定使用该类型。    * `NONE` - 只部署在指定 OUs 中的所有账户。该类型下domain_ids和domain_ids_uri字段必须为空。
     */
    public static final class DomainIdFilterTypeEnum {

        /**
         * Enum INTERSECTION for value: "INTERSECTION"
         */
        public static final DomainIdFilterTypeEnum INTERSECTION = new DomainIdFilterTypeEnum("INTERSECTION");

        /**
         * Enum DIFFERENCE for value: "DIFFERENCE"
         */
        public static final DomainIdFilterTypeEnum DIFFERENCE = new DomainIdFilterTypeEnum("DIFFERENCE");

        /**
         * Enum UNION for value: "UNION"
         */
        public static final DomainIdFilterTypeEnum UNION = new DomainIdFilterTypeEnum("UNION");

        /**
         * Enum NONE for value: "NONE"
         */
        public static final DomainIdFilterTypeEnum NONE = new DomainIdFilterTypeEnum("NONE");

        private static final Map<String, DomainIdFilterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DomainIdFilterTypeEnum> createStaticFields() {
            Map<String, DomainIdFilterTypeEnum> map = new HashMap<>();
            map.put("INTERSECTION", INTERSECTION);
            map.put("DIFFERENCE", DIFFERENCE);
            map.put("UNION", UNION);
            map.put("NONE", NONE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DomainIdFilterTypeEnum(String value) {
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
        public static DomainIdFilterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DomainIdFilterTypeEnum(value));
        }

        public static DomainIdFilterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DomainIdFilterTypeEnum) {
                return this.value.equals(((DomainIdFilterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id_filter_type")

    private DomainIdFilterTypeEnum domainIdFilterType;

    public DomainIdFilterTypePrimitiveTypeHolder withDomainIdFilterType(DomainIdFilterTypeEnum domainIdFilterType) {
        this.domainIdFilterType = domainIdFilterType;
        return this;
    }

    /**
     * 租户ID筛选类型，仅支持资源栈集权限模型是SERVICE_MANAGED时指定该参数。默认为NONE  用户可以指定不同的筛选类型，通过domain_ids或domain_ids_uri 指定或排除部署的用户信息，以增加或限制部署目标用户范围，实现不同的部署策略。     * `INTERSECTION` - 从所提供的 OUs 中选择指定用户进行部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `DIFFERENCE` - 从所提供的 OUs 中排除指定用户部署。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。    * `UNION` - 除了部署到提供的 OUs 外，还将部署到指定的账户中。用户可以通过同时指定organizational_unit_ids 和 domain_ids/domain_ids_uri 以实现在同一请求中部署整个OU和来自不同OU的特定个人账户。指定该类型时，domain_ids和domain_ids_uri 有且仅能有一个存在。创建资源栈实例（CreateStackInstances）除外，该API 不允许指定使用该类型。    * `NONE` - 只部署在指定 OUs 中的所有账户。该类型下domain_ids和domain_ids_uri字段必须为空。
     * @return domainIdFilterType
     */
    public DomainIdFilterTypeEnum getDomainIdFilterType() {
        return domainIdFilterType;
    }

    public void setDomainIdFilterType(DomainIdFilterTypeEnum domainIdFilterType) {
        this.domainIdFilterType = domainIdFilterType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DomainIdFilterTypePrimitiveTypeHolder that = (DomainIdFilterTypePrimitiveTypeHolder) obj;
        return Objects.equals(this.domainIdFilterType, that.domainIdFilterType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainIdFilterType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DomainIdFilterTypePrimitiveTypeHolder {\n");
        sb.append("    domainIdFilterType: ").append(toIndentedString(domainIdFilterType)).append("\n");
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
