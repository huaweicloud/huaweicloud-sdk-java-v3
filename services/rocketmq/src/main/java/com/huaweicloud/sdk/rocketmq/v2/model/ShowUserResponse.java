package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_remote_address")

    private String whiteRemoteAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin")

    private Boolean admin;

    /**
     * **参数解释**： 默认的主题权限。 **约束限制**： 不涉及。 **取值范围**： - pub：拥有发布权限。 - sub：拥有订阅权限。 - PUB|sub：拥有发布订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     */
    public static final class DefaultTopicPermEnum {

        /**
         * Enum PUB for value: "PUB"
         */
        public static final DefaultTopicPermEnum PUB = new DefaultTopicPermEnum("PUB");

        /**
         * Enum SUB for value: "SUB"
         */
        public static final DefaultTopicPermEnum SUB = new DefaultTopicPermEnum("SUB");

        /**
         * Enum PUB_SUB for value: "PUB|SUB"
         */
        public static final DefaultTopicPermEnum PUB_SUB = new DefaultTopicPermEnum("PUB|SUB");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final DefaultTopicPermEnum DENY = new DefaultTopicPermEnum("DENY");

        private static final Map<String, DefaultTopicPermEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefaultTopicPermEnum> createStaticFields() {
            Map<String, DefaultTopicPermEnum> map = new HashMap<>();
            map.put("PUB", PUB);
            map.put("SUB", SUB);
            map.put("PUB|SUB", PUB_SUB);
            map.put("DENY", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DefaultTopicPermEnum(String value) {
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
        public static DefaultTopicPermEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DefaultTopicPermEnum(value));
        }

        public static DefaultTopicPermEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefaultTopicPermEnum) {
                return this.value.equals(((DefaultTopicPermEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_topic_perm")

    private DefaultTopicPermEnum defaultTopicPerm;

    /**
     * **参数解释**： 默认的消费组权限。 **约束限制**： 不涉及。 **取值范围**： - sub：拥有订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     */
    public static final class DefaultGroupPermEnum {

        /**
         * Enum SUB for value: "SUB"
         */
        public static final DefaultGroupPermEnum SUB = new DefaultGroupPermEnum("SUB");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final DefaultGroupPermEnum DENY = new DefaultGroupPermEnum("DENY");

        private static final Map<String, DefaultGroupPermEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefaultGroupPermEnum> createStaticFields() {
            Map<String, DefaultGroupPermEnum> map = new HashMap<>();
            map.put("SUB", SUB);
            map.put("DENY", DENY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DefaultGroupPermEnum(String value) {
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
        public static DefaultGroupPermEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DefaultGroupPermEnum(value));
        }

        public static DefaultGroupPermEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefaultGroupPermEnum) {
                return this.value.equals(((DefaultGroupPermEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_group_perm")

    private DefaultGroupPermEnum defaultGroupPerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_perms")

    private List<UserTopicPerms> topicPerms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_perms")

    private List<UserGroupPerms> groupPerms = null;

    public ShowUserResponse withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * **参数解释**： 用户名。 **约束限制**： 只能英文字母开头，且由英文字母、数字、中划线、下划线组成，长度为7~64个字符。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ShowUserResponse withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * **参数解释**： 密钥。 **约束限制**： 8-32个字符。 至少包含以下字符中的3种： - 大写字母 - 小写字母 - 数字 - 特殊字符`~!@#$%^&*()-_=+\\\\|[{}];:\\'\\\",<.>/?密钥。 不能与名称或倒序的名称相同。  **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public ShowUserResponse withWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
        return this;
    }

    /**
     * **参数解释**： IP白名单。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return whiteRemoteAddress
     */
    public String getWhiteRemoteAddress() {
        return whiteRemoteAddress;
    }

    public void setWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
    }

    public ShowUserResponse withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * **参数解释**： 是否为管理员。 **约束限制**： 不涉及。 **取值范围**： - true：是管理员。 - false：不是管理员。  **默认取值**： 不涉及。
     * @return admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public ShowUserResponse withDefaultTopicPerm(DefaultTopicPermEnum defaultTopicPerm) {
        this.defaultTopicPerm = defaultTopicPerm;
        return this;
    }

    /**
     * **参数解释**： 默认的主题权限。 **约束限制**： 不涉及。 **取值范围**： - pub：拥有发布权限。 - sub：拥有订阅权限。 - PUB|sub：拥有发布订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     * @return defaultTopicPerm
     */
    public DefaultTopicPermEnum getDefaultTopicPerm() {
        return defaultTopicPerm;
    }

    public void setDefaultTopicPerm(DefaultTopicPermEnum defaultTopicPerm) {
        this.defaultTopicPerm = defaultTopicPerm;
    }

    public ShowUserResponse withDefaultGroupPerm(DefaultGroupPermEnum defaultGroupPerm) {
        this.defaultGroupPerm = defaultGroupPerm;
        return this;
    }

    /**
     * **参数解释**： 默认的消费组权限。 **约束限制**： 不涉及。 **取值范围**： - sub：拥有订阅权限。 - DENY：无权限。  **默认取值**： 不涉及。
     * @return defaultGroupPerm
     */
    public DefaultGroupPermEnum getDefaultGroupPerm() {
        return defaultGroupPerm;
    }

    public void setDefaultGroupPerm(DefaultGroupPermEnum defaultGroupPerm) {
        this.defaultGroupPerm = defaultGroupPerm;
    }

    public ShowUserResponse withTopicPerms(List<UserTopicPerms> topicPerms) {
        this.topicPerms = topicPerms;
        return this;
    }

    public ShowUserResponse addTopicPermsItem(UserTopicPerms topicPermsItem) {
        if (this.topicPerms == null) {
            this.topicPerms = new ArrayList<>();
        }
        this.topicPerms.add(topicPermsItem);
        return this;
    }

    public ShowUserResponse withTopicPerms(Consumer<List<UserTopicPerms>> topicPermsSetter) {
        if (this.topicPerms == null) {
            this.topicPerms = new ArrayList<>();
        }
        topicPermsSetter.accept(this.topicPerms);
        return this;
    }

    /**
     * **参数解释**： 特殊的主题权限。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return topicPerms
     */
    public List<UserTopicPerms> getTopicPerms() {
        return topicPerms;
    }

    public void setTopicPerms(List<UserTopicPerms> topicPerms) {
        this.topicPerms = topicPerms;
    }

    public ShowUserResponse withGroupPerms(List<UserGroupPerms> groupPerms) {
        this.groupPerms = groupPerms;
        return this;
    }

    public ShowUserResponse addGroupPermsItem(UserGroupPerms groupPermsItem) {
        if (this.groupPerms == null) {
            this.groupPerms = new ArrayList<>();
        }
        this.groupPerms.add(groupPermsItem);
        return this;
    }

    public ShowUserResponse withGroupPerms(Consumer<List<UserGroupPerms>> groupPermsSetter) {
        if (this.groupPerms == null) {
            this.groupPerms = new ArrayList<>();
        }
        groupPermsSetter.accept(this.groupPerms);
        return this;
    }

    /**
     * **参数解释**： 特殊的消费组权限。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return groupPerms
     */
    public List<UserGroupPerms> getGroupPerms() {
        return groupPerms;
    }

    public void setGroupPerms(List<UserGroupPerms> groupPerms) {
        this.groupPerms = groupPerms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowUserResponse that = (ShowUserResponse) obj;
        return Objects.equals(this.accessKey, that.accessKey) && Objects.equals(this.secretKey, that.secretKey)
            && Objects.equals(this.whiteRemoteAddress, that.whiteRemoteAddress)
            && Objects.equals(this.admin, that.admin) && Objects.equals(this.defaultTopicPerm, that.defaultTopicPerm)
            && Objects.equals(this.defaultGroupPerm, that.defaultGroupPerm)
            && Objects.equals(this.topicPerms, that.topicPerms) && Objects.equals(this.groupPerms, that.groupPerms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey,
            secretKey,
            whiteRemoteAddress,
            admin,
            defaultTopicPerm,
            defaultGroupPerm,
            topicPerms,
            groupPerms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowUserResponse {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
        sb.append("    whiteRemoteAddress: ").append(toIndentedString(whiteRemoteAddress)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    defaultTopicPerm: ").append(toIndentedString(defaultTopicPerm)).append("\n");
        sb.append("    defaultGroupPerm: ").append(toIndentedString(defaultGroupPerm)).append("\n");
        sb.append("    topicPerms: ").append(toIndentedString(topicPerms)).append("\n");
        sb.append("    groupPerms: ").append(toIndentedString(groupPerms)).append("\n");
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
