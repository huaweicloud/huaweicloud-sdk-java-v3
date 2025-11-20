package com.huaweicloud.sdk.iamaccessanalyzer.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 访问分析结果类型。 - external_access：外部访问 - privilege_escalation：提权访问 - unused_iam_user_access_key：未使用访问密钥 - unused_iam_user_password：未使用密码 - unused_permission：未使用权限 - unused_iam_agency：未使用委托 - iam_bp_root_user_has_access_key：为根用户绑定AK/SK - iam_bp_access_api_with_password：使用密码访问API - iam_bp_login_protection_disabled：未开启登录保护 - iam_bp_mfa_unconfigured：未绑定MFA - iam_bp_assign_high_risk_sys_policy_or_role_to_user：为用户授予高风险系统策略或角色 - iam_bp_attach_high_risk_sys_identity_policy_to_user：为用户授予高风险系统身份策略 - iam_bp_assign_high_risk_sys_policy_or_role_to_agency：为委托授予高风险系统策略或角色 - iam_bp_attach_high_risk_sys_identity_policy_to_agency：为委托授予高风险系统身份策略 
 */
public class FindingType {

    /**
     * Enum EXTERNAL_ACCESS for value: "external_access"
     */
    public static final FindingType EXTERNAL_ACCESS = new FindingType("external_access");

    /**
     * Enum PRIVILEGE_ESCALATION for value: "privilege_escalation"
     */
    public static final FindingType PRIVILEGE_ESCALATION = new FindingType("privilege_escalation");

    /**
     * Enum UNUSED_IAM_USER_ACCESS_KEY for value: "unused_iam_user_access_key"
     */
    public static final FindingType UNUSED_IAM_USER_ACCESS_KEY = new FindingType("unused_iam_user_access_key");

    /**
     * Enum UNUSED_IAM_USER_PASSWORD for value: "unused_iam_user_password"
     */
    public static final FindingType UNUSED_IAM_USER_PASSWORD = new FindingType("unused_iam_user_password");

    /**
     * Enum UNUSED_PERMISSION for value: "unused_permission"
     */
    public static final FindingType UNUSED_PERMISSION = new FindingType("unused_permission");

    /**
     * Enum UNUSED_IAM_AGENCY for value: "unused_iam_agency"
     */
    public static final FindingType UNUSED_IAM_AGENCY = new FindingType("unused_iam_agency");

    /**
     * Enum IAM_BP_ROOT_USER_HAS_ACCESS_KEY for value: "iam_bp_root_user_has_access_key"
     */
    public static final FindingType IAM_BP_ROOT_USER_HAS_ACCESS_KEY =
        new FindingType("iam_bp_root_user_has_access_key");

    /**
     * Enum IAM_BP_ACCESS_API_WITH_PASSWORD for value: "iam_bp_access_api_with_password"
     */
    public static final FindingType IAM_BP_ACCESS_API_WITH_PASSWORD =
        new FindingType("iam_bp_access_api_with_password");

    /**
     * Enum IAM_BP_LOGIN_PROTECTION_DISABLED for value: "iam_bp_login_protection_disabled"
     */
    public static final FindingType IAM_BP_LOGIN_PROTECTION_DISABLED =
        new FindingType("iam_bp_login_protection_disabled");

    /**
     * Enum IAM_BP_MFA_UNCONFIGURED for value: "iam_bp_mfa_unconfigured"
     */
    public static final FindingType IAM_BP_MFA_UNCONFIGURED = new FindingType("iam_bp_mfa_unconfigured");

    /**
     * Enum IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_USER for value: "iam_bp_assign_high_risk_sys_policy_or_role_to_user"
     */
    public static final FindingType IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_USER =
        new FindingType("iam_bp_assign_high_risk_sys_policy_or_role_to_user");

    /**
     * Enum IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_USER for value: "iam_bp_attach_high_risk_sys_identity_policy_to_user"
     */
    public static final FindingType IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_USER =
        new FindingType("iam_bp_attach_high_risk_sys_identity_policy_to_user");

    /**
     * Enum IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_AGENCY for value: "iam_bp_assign_high_risk_sys_policy_or_role_to_agency"
     */
    public static final FindingType IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_AGENCY =
        new FindingType("iam_bp_assign_high_risk_sys_policy_or_role_to_agency");

    /**
     * Enum IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_AGENCY for value: "iam_bp_attach_high_risk_sys_identity_policy_to_agency"
     */
    public static final FindingType IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_AGENCY =
        new FindingType("iam_bp_attach_high_risk_sys_identity_policy_to_agency");

    private static final Map<String, FindingType> STATIC_FIELDS = createStaticFields();

    private static Map<String, FindingType> createStaticFields() {
        Map<String, FindingType> map = new HashMap<>();
        map.put("external_access", EXTERNAL_ACCESS);
        map.put("privilege_escalation", PRIVILEGE_ESCALATION);
        map.put("unused_iam_user_access_key", UNUSED_IAM_USER_ACCESS_KEY);
        map.put("unused_iam_user_password", UNUSED_IAM_USER_PASSWORD);
        map.put("unused_permission", UNUSED_PERMISSION);
        map.put("unused_iam_agency", UNUSED_IAM_AGENCY);
        map.put("iam_bp_root_user_has_access_key", IAM_BP_ROOT_USER_HAS_ACCESS_KEY);
        map.put("iam_bp_access_api_with_password", IAM_BP_ACCESS_API_WITH_PASSWORD);
        map.put("iam_bp_login_protection_disabled", IAM_BP_LOGIN_PROTECTION_DISABLED);
        map.put("iam_bp_mfa_unconfigured", IAM_BP_MFA_UNCONFIGURED);
        map.put("iam_bp_assign_high_risk_sys_policy_or_role_to_user",
            IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_USER);
        map.put("iam_bp_attach_high_risk_sys_identity_policy_to_user",
            IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_USER);
        map.put("iam_bp_assign_high_risk_sys_policy_or_role_to_agency",
            IAM_BP_ASSIGN_HIGH_RISK_SYS_POLICY_OR_ROLE_TO_AGENCY);
        map.put("iam_bp_attach_high_risk_sys_identity_policy_to_agency",
            IAM_BP_ATTACH_HIGH_RISK_SYS_IDENTITY_POLICY_TO_AGENCY);
        return Collections.unmodifiableMap(map);
    }

    private String value;

    FindingType(String value) {
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
    public static FindingType fromValue(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FindingType(value));
    }

    public static FindingType valueOf(String value) {
        if (value == null) {
            return null;
        }
        return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
            .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FindingType) {
            return this.value.equals(((FindingType) obj).value);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.value.hashCode();
    }
}
