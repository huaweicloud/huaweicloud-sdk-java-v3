package com.huaweicloud.sdk.codehub.v4.model;

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
public class ShowGroupsInheritRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private Integer groupId;

    /**
     * **参数解释：** 必填项，设置类型protected_branches保护分支 protected_tags保护tag push_rules推送规则 merge_requests合并请求 mr_branch_policies合并分支 reviews检视意见 e2e_settings e2e设置 webhook_settings hook设置 deploy_keys 部署key watermark水印 repository_settings仓库设置。
     */
    public static final class SettingTypeEnum {

        /**
         * Enum PROTECTED_BRANCHES for value: "protected_branches"
         */
        public static final SettingTypeEnum PROTECTED_BRANCHES = new SettingTypeEnum("protected_branches");

        /**
         * Enum PROTECTED_TAGS for value: "protected_tags"
         */
        public static final SettingTypeEnum PROTECTED_TAGS = new SettingTypeEnum("protected_tags");

        /**
         * Enum PUSH_RULES for value: "push_rules"
         */
        public static final SettingTypeEnum PUSH_RULES = new SettingTypeEnum("push_rules");

        /**
         * Enum MERGE_REQUESTS for value: "merge_requests"
         */
        public static final SettingTypeEnum MERGE_REQUESTS = new SettingTypeEnum("merge_requests");

        /**
         * Enum MR_BRANCH_POLICIES for value: "mr_branch_policies"
         */
        public static final SettingTypeEnum MR_BRANCH_POLICIES = new SettingTypeEnum("mr_branch_policies");

        /**
         * Enum REVIEWS for value: "reviews"
         */
        public static final SettingTypeEnum REVIEWS = new SettingTypeEnum("reviews");

        /**
         * Enum E2E_SETTINGS for value: "e2e_settings"
         */
        public static final SettingTypeEnum E2E_SETTINGS = new SettingTypeEnum("e2e_settings");

        /**
         * Enum WEBHOOK_SETTINGS for value: "webhook_settings"
         */
        public static final SettingTypeEnum WEBHOOK_SETTINGS = new SettingTypeEnum("webhook_settings");

        /**
         * Enum DEPLOY_KEYS for value: "deploy_keys"
         */
        public static final SettingTypeEnum DEPLOY_KEYS = new SettingTypeEnum("deploy_keys");

        /**
         * Enum WATERMARK for value: "watermark"
         */
        public static final SettingTypeEnum WATERMARK = new SettingTypeEnum("watermark");

        /**
         * Enum REPOSITORY_SETTINGS for value: "repository_settings"
         */
        public static final SettingTypeEnum REPOSITORY_SETTINGS = new SettingTypeEnum("repository_settings");

        private static final Map<String, SettingTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SettingTypeEnum> createStaticFields() {
            Map<String, SettingTypeEnum> map = new HashMap<>();
            map.put("protected_branches", PROTECTED_BRANCHES);
            map.put("protected_tags", PROTECTED_TAGS);
            map.put("push_rules", PUSH_RULES);
            map.put("merge_requests", MERGE_REQUESTS);
            map.put("mr_branch_policies", MR_BRANCH_POLICIES);
            map.put("reviews", REVIEWS);
            map.put("e2e_settings", E2E_SETTINGS);
            map.put("webhook_settings", WEBHOOK_SETTINGS);
            map.put("deploy_keys", DEPLOY_KEYS);
            map.put("watermark", WATERMARK);
            map.put("repository_settings", REPOSITORY_SETTINGS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SettingTypeEnum(String value) {
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
        public static SettingTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SettingTypeEnum(value));
        }

        public static SettingTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SettingTypeEnum) {
                return this.value.equals(((SettingTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_type")

    private SettingTypeEnum settingType;

    public ShowGroupsInheritRequest withGroupId(Integer groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释：** 代码组id，代码组首页，Group ID后的数字Id
     * minimum: 1
     * maximum: 2147483647
     * @return groupId
     */
    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public ShowGroupsInheritRequest withSettingType(SettingTypeEnum settingType) {
        this.settingType = settingType;
        return this;
    }

    /**
     * **参数解释：** 必填项，设置类型protected_branches保护分支 protected_tags保护tag push_rules推送规则 merge_requests合并请求 mr_branch_policies合并分支 reviews检视意见 e2e_settings e2e设置 webhook_settings hook设置 deploy_keys 部署key watermark水印 repository_settings仓库设置。
     * @return settingType
     */
    public SettingTypeEnum getSettingType() {
        return settingType;
    }

    public void setSettingType(SettingTypeEnum settingType) {
        this.settingType = settingType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowGroupsInheritRequest that = (ShowGroupsInheritRequest) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.settingType, that.settingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, settingType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsInheritRequest {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    settingType: ").append(toIndentedString(settingType)).append("\n");
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
