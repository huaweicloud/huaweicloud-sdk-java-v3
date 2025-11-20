package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

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
 * FindingFilter
 */
public class FindingFilter {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterion")

    private Criterion criterion;

    /**
     * 过滤键。 - resource：资源URN - resource_type：资源类型 - resource_owner_account：资源所有者账号 - is_public：公共访问权限 - id：分析结果ID - status：分析结果类型 - principal_type：主体类型 - principal_identifier：主体Identifier - change_type：分析结果状态的变化 - existing_finding_id：已有分析结果ID - existing_finding_status：已有分析结果状态 - condition.g:PrincipalUrn：主体URN - condition.g:PrincipalId：主体ID - condition.g:PrincipalAccount：主体账号 - condition.g:PrincipalOrgId：主体OrgID - condition.g:PrincipalOrgPath：主体组织路径 - condition.g:PrincipalOrgManagementAccountId：主体组织管理账号ID - condition.g:SourceIp：源IP - condition.g:SourceVpc：源VPC - condition.g:SourceVpce：源VPCE - finding_type：分析结果类型 
     */
    public static final class KeyEnum {

        /**
         * Enum RESOURCE for value: "resource"
         */
        public static final KeyEnum RESOURCE = new KeyEnum("resource");

        /**
         * Enum RESOURCE_TYPE for value: "resource_type"
         */
        public static final KeyEnum RESOURCE_TYPE = new KeyEnum("resource_type");

        /**
         * Enum RESOURCE_OWNER_ACCOUNT for value: "resource_owner_account"
         */
        public static final KeyEnum RESOURCE_OWNER_ACCOUNT = new KeyEnum("resource_owner_account");

        /**
         * Enum IS_PUBLIC for value: "is_public"
         */
        public static final KeyEnum IS_PUBLIC = new KeyEnum("is_public");

        /**
         * Enum ID for value: "id"
         */
        public static final KeyEnum ID = new KeyEnum("id");

        /**
         * Enum STATUS for value: "status"
         */
        public static final KeyEnum STATUS = new KeyEnum("status");

        /**
         * Enum PRINCIPAL_TYPE for value: "principal_type"
         */
        public static final KeyEnum PRINCIPAL_TYPE = new KeyEnum("principal_type");

        /**
         * Enum PRINCIPAL_IDENTIFIER for value: "principal_identifier"
         */
        public static final KeyEnum PRINCIPAL_IDENTIFIER = new KeyEnum("principal_identifier");

        /**
         * Enum CHANGE_TYPE for value: "change_type"
         */
        public static final KeyEnum CHANGE_TYPE = new KeyEnum("change_type");

        /**
         * Enum EXISTING_FINDING_ID for value: "existing_finding_id"
         */
        public static final KeyEnum EXISTING_FINDING_ID = new KeyEnum("existing_finding_id");

        /**
         * Enum EXISTING_FINDING_STATUS for value: "existing_finding_status"
         */
        public static final KeyEnum EXISTING_FINDING_STATUS = new KeyEnum("existing_finding_status");

        /**
         * Enum CONDITION_G_PRINCIPALURN for value: "condition.g:PrincipalUrn"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALURN = new KeyEnum("condition.g:PrincipalUrn");

        /**
         * Enum CONDITION_G_PRINCIPALID for value: "condition.g:PrincipalId"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALID = new KeyEnum("condition.g:PrincipalId");

        /**
         * Enum CONDITION_G_PRINCIPALACCOUNT for value: "condition.g:PrincipalAccount"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALACCOUNT = new KeyEnum("condition.g:PrincipalAccount");

        /**
         * Enum CONDITION_G_PRINCIPALORGID for value: "condition.g:PrincipalOrgId"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALORGID = new KeyEnum("condition.g:PrincipalOrgId");

        /**
         * Enum CONDITION_G_PRINCIPALORGPATH for value: "condition.g:PrincipalOrgPath"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALORGPATH = new KeyEnum("condition.g:PrincipalOrgPath");

        /**
         * Enum CONDITION_G_PRINCIPALORGMANAGEMENTACCOUNTID for value: "condition.g:PrincipalOrgManagementAccountId"
         */
        public static final KeyEnum CONDITION_G_PRINCIPALORGMANAGEMENTACCOUNTID =
            new KeyEnum("condition.g:PrincipalOrgManagementAccountId");

        /**
         * Enum CONDITION_G_SOURCEIP for value: "condition.g:SourceIp"
         */
        public static final KeyEnum CONDITION_G_SOURCEIP = new KeyEnum("condition.g:SourceIp");

        /**
         * Enum CONDITION_G_SOURCEVPC for value: "condition.g:SourceVpc"
         */
        public static final KeyEnum CONDITION_G_SOURCEVPC = new KeyEnum("condition.g:SourceVpc");

        /**
         * Enum CONDITION_G_SOURCEVPCE for value: "condition.g:SourceVpce"
         */
        public static final KeyEnum CONDITION_G_SOURCEVPCE = new KeyEnum("condition.g:SourceVpce");

        /**
         * Enum FINDING_TYPE for value: "finding_type"
         */
        public static final KeyEnum FINDING_TYPE = new KeyEnum("finding_type");

        private static final Map<String, KeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeyEnum> createStaticFields() {
            Map<String, KeyEnum> map = new HashMap<>();
            map.put("resource", RESOURCE);
            map.put("resource_type", RESOURCE_TYPE);
            map.put("resource_owner_account", RESOURCE_OWNER_ACCOUNT);
            map.put("is_public", IS_PUBLIC);
            map.put("id", ID);
            map.put("status", STATUS);
            map.put("principal_type", PRINCIPAL_TYPE);
            map.put("principal_identifier", PRINCIPAL_IDENTIFIER);
            map.put("change_type", CHANGE_TYPE);
            map.put("existing_finding_id", EXISTING_FINDING_ID);
            map.put("existing_finding_status", EXISTING_FINDING_STATUS);
            map.put("condition.g:PrincipalUrn", CONDITION_G_PRINCIPALURN);
            map.put("condition.g:PrincipalId", CONDITION_G_PRINCIPALID);
            map.put("condition.g:PrincipalAccount", CONDITION_G_PRINCIPALACCOUNT);
            map.put("condition.g:PrincipalOrgId", CONDITION_G_PRINCIPALORGID);
            map.put("condition.g:PrincipalOrgPath", CONDITION_G_PRINCIPALORGPATH);
            map.put("condition.g:PrincipalOrgManagementAccountId", CONDITION_G_PRINCIPALORGMANAGEMENTACCOUNTID);
            map.put("condition.g:SourceIp", CONDITION_G_SOURCEIP);
            map.put("condition.g:SourceVpc", CONDITION_G_SOURCEVPC);
            map.put("condition.g:SourceVpce", CONDITION_G_SOURCEVPCE);
            map.put("finding_type", FINDING_TYPE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeyEnum(String value) {
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
        public static KeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new KeyEnum(value));
        }

        public static KeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof KeyEnum) {
                return this.value.equals(((KeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private KeyEnum key;

    public FindingFilter withCriterion(Criterion criterion) {
        this.criterion = criterion;
        return this;
    }

    public FindingFilter withCriterion(Consumer<Criterion> criterionSetter) {
        if (this.criterion == null) {
            this.criterion = new Criterion();
            criterionSetter.accept(this.criterion);
        }

        return this;
    }

    /**
     * Get criterion
     * @return criterion
     */
    public Criterion getCriterion() {
        return criterion;
    }

    public void setCriterion(Criterion criterion) {
        this.criterion = criterion;
    }

    public FindingFilter withKey(KeyEnum key) {
        this.key = key;
        return this;
    }

    /**
     * 过滤键。 - resource：资源URN - resource_type：资源类型 - resource_owner_account：资源所有者账号 - is_public：公共访问权限 - id：分析结果ID - status：分析结果类型 - principal_type：主体类型 - principal_identifier：主体Identifier - change_type：分析结果状态的变化 - existing_finding_id：已有分析结果ID - existing_finding_status：已有分析结果状态 - condition.g:PrincipalUrn：主体URN - condition.g:PrincipalId：主体ID - condition.g:PrincipalAccount：主体账号 - condition.g:PrincipalOrgId：主体OrgID - condition.g:PrincipalOrgPath：主体组织路径 - condition.g:PrincipalOrgManagementAccountId：主体组织管理账号ID - condition.g:SourceIp：源IP - condition.g:SourceVpc：源VPC - condition.g:SourceVpce：源VPCE - finding_type：分析结果类型 
     * @return key
     */
    public KeyEnum getKey() {
        return key;
    }

    public void setKey(KeyEnum key) {
        this.key = key;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FindingFilter that = (FindingFilter) obj;
        return Objects.equals(this.criterion, that.criterion) && Objects.equals(this.key, that.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criterion, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FindingFilter {\n");
        sb.append("    criterion: ").append(toIndentedString(criterion)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
