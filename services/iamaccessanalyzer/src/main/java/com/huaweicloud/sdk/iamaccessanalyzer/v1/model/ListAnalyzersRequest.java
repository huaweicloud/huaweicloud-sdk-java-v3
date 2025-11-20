package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

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
public class ListAnalyzersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    /**
     * 分析器的类型。 - account：账号级外部访问分析器 - organization：组织级外部访问分析器 - account_unused_access：账号级未使用访问分析器 - organization_unused_access：组织级未使用访问分析器 - account_privilege_escalation：账号级提权访问分析器 - account_iam_best_practice：账号级IAM最佳实践分析器 
     */
    public static final class TypeEnum {

        /**
         * Enum ACCOUNT for value: "account"
         */
        public static final TypeEnum ACCOUNT = new TypeEnum("account");

        /**
         * Enum ORGANIZATION for value: "organization"
         */
        public static final TypeEnum ORGANIZATION = new TypeEnum("organization");

        /**
         * Enum ACCOUNT_UNUSED_ACCESS for value: "account_unused_access"
         */
        public static final TypeEnum ACCOUNT_UNUSED_ACCESS = new TypeEnum("account_unused_access");

        /**
         * Enum ORGANIZATION_UNUSED_ACCESS for value: "organization_unused_access"
         */
        public static final TypeEnum ORGANIZATION_UNUSED_ACCESS = new TypeEnum("organization_unused_access");

        /**
         * Enum ACCOUNT_PRIVILEGE_ESCALATION for value: "account_privilege_escalation"
         */
        public static final TypeEnum ACCOUNT_PRIVILEGE_ESCALATION = new TypeEnum("account_privilege_escalation");

        /**
         * Enum ACCOUNT_IAM_BEST_PRACTICE for value: "account_iam_best_practice"
         */
        public static final TypeEnum ACCOUNT_IAM_BEST_PRACTICE = new TypeEnum("account_iam_best_practice");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("account", ACCOUNT);
            map.put("organization", ORGANIZATION);
            map.put("account_unused_access", ACCOUNT_UNUSED_ACCESS);
            map.put("organization_unused_access", ORGANIZATION_UNUSED_ACCESS);
            map.put("account_privilege_escalation", ACCOUNT_PRIVILEGE_ESCALATION);
            map.put("account_iam_best_practice", ACCOUNT_IAM_BEST_PRACTICE);
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

    public ListAnalyzersRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 单页最大结果数。
     * minimum: 1
     * maximum: 200
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListAnalyzersRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 页面标记。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListAnalyzersRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 分析器的类型。 - account：账号级外部访问分析器 - organization：组织级外部访问分析器 - account_unused_access：账号级未使用访问分析器 - organization_unused_access：组织级未使用访问分析器 - account_privilege_escalation：账号级提权访问分析器 - account_iam_best_practice：账号级IAM最佳实践分析器 
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
        ListAnalyzersRequest that = (ListAnalyzersRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAnalyzersRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
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
