package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
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
public class UpdateUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    @JacksonXmlProperty(localName = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "secret_key")

    @JacksonXmlProperty(localName = "secret_key")

    private String secretKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_remote_address")

    @JacksonXmlProperty(localName = "white_remote_address")

    private String whiteRemoteAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin")

    @JacksonXmlProperty(localName = "admin")

    private Boolean admin;

    /**
     * 默认的主题权限。
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
            DefaultTopicPermEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DefaultTopicPermEnum(value);
            }
            return result;
        }

        public static DefaultTopicPermEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DefaultTopicPermEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "default_topic_perm")

    private DefaultTopicPermEnum defaultTopicPerm;

    /**
     * 默认的消费组权限。
     */
    public static final class DefaultGroupPermEnum {

        /**
         * Enum PUB for value: "PUB"
         */
        public static final DefaultGroupPermEnum PUB = new DefaultGroupPermEnum("PUB");

        /**
         * Enum SUB for value: "SUB"
         */
        public static final DefaultGroupPermEnum SUB = new DefaultGroupPermEnum("SUB");

        /**
         * Enum PUB_SUB for value: "PUB|SUB"
         */
        public static final DefaultGroupPermEnum PUB_SUB = new DefaultGroupPermEnum("PUB|SUB");

        /**
         * Enum DENY for value: "DENY"
         */
        public static final DefaultGroupPermEnum DENY = new DefaultGroupPermEnum("DENY");

        private static final Map<String, DefaultGroupPermEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DefaultGroupPermEnum> createStaticFields() {
            Map<String, DefaultGroupPermEnum> map = new HashMap<>();
            map.put("PUB", PUB);
            map.put("SUB", SUB);
            map.put("PUB|SUB", PUB_SUB);
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
            DefaultGroupPermEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new DefaultGroupPermEnum(value);
            }
            return result;
        }

        public static DefaultGroupPermEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            DefaultGroupPermEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    @JacksonXmlProperty(localName = "default_group_perm")

    private DefaultGroupPermEnum defaultGroupPerm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic_perms")

    @JacksonXmlProperty(localName = "topic_perms")

    private List<UserTopicPerms> topicPerms = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_perms")

    @JacksonXmlProperty(localName = "group_perms")

    private List<UserGroupPerms> groupPerms = null;

    public UpdateUserResponse withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 用户名。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public UpdateUserResponse withSecretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    /**
     * 密钥。
     * @return secretKey
     */
    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public UpdateUserResponse withWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
        return this;
    }

    /**
     * IP白名单。
     * @return whiteRemoteAddress
     */
    public String getWhiteRemoteAddress() {
        return whiteRemoteAddress;
    }

    public void setWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
    }

    public UpdateUserResponse withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * 是否为管理员。
     * @return admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public UpdateUserResponse withDefaultTopicPerm(DefaultTopicPermEnum defaultTopicPerm) {
        this.defaultTopicPerm = defaultTopicPerm;
        return this;
    }

    /**
     * 默认的主题权限。
     * @return defaultTopicPerm
     */
    public DefaultTopicPermEnum getDefaultTopicPerm() {
        return defaultTopicPerm;
    }

    public void setDefaultTopicPerm(DefaultTopicPermEnum defaultTopicPerm) {
        this.defaultTopicPerm = defaultTopicPerm;
    }

    public UpdateUserResponse withDefaultGroupPerm(DefaultGroupPermEnum defaultGroupPerm) {
        this.defaultGroupPerm = defaultGroupPerm;
        return this;
    }

    /**
     * 默认的消费组权限。
     * @return defaultGroupPerm
     */
    public DefaultGroupPermEnum getDefaultGroupPerm() {
        return defaultGroupPerm;
    }

    public void setDefaultGroupPerm(DefaultGroupPermEnum defaultGroupPerm) {
        this.defaultGroupPerm = defaultGroupPerm;
    }

    public UpdateUserResponse withTopicPerms(List<UserTopicPerms> topicPerms) {
        this.topicPerms = topicPerms;
        return this;
    }

    public UpdateUserResponse addTopicPermsItem(UserTopicPerms topicPermsItem) {
        if (this.topicPerms == null) {
            this.topicPerms = new ArrayList<>();
        }
        this.topicPerms.add(topicPermsItem);
        return this;
    }

    public UpdateUserResponse withTopicPerms(Consumer<List<UserTopicPerms>> topicPermsSetter) {
        if (this.topicPerms == null) {
            this.topicPerms = new ArrayList<>();
        }
        topicPermsSetter.accept(this.topicPerms);
        return this;
    }

    /**
     * 特殊的主题权限。
     * @return topicPerms
     */
    public List<UserTopicPerms> getTopicPerms() {
        return topicPerms;
    }

    public void setTopicPerms(List<UserTopicPerms> topicPerms) {
        this.topicPerms = topicPerms;
    }

    public UpdateUserResponse withGroupPerms(List<UserGroupPerms> groupPerms) {
        this.groupPerms = groupPerms;
        return this;
    }

    public UpdateUserResponse addGroupPermsItem(UserGroupPerms groupPermsItem) {
        if (this.groupPerms == null) {
            this.groupPerms = new ArrayList<>();
        }
        this.groupPerms.add(groupPermsItem);
        return this;
    }

    public UpdateUserResponse withGroupPerms(Consumer<List<UserGroupPerms>> groupPermsSetter) {
        if (this.groupPerms == null) {
            this.groupPerms = new ArrayList<>();
        }
        groupPermsSetter.accept(this.groupPerms);
        return this;
    }

    /**
     * 特殊的消费组权限。
     * @return groupPerms
     */
    public List<UserGroupPerms> getGroupPerms() {
        return groupPerms;
    }

    public void setGroupPerms(List<UserGroupPerms> groupPerms) {
        this.groupPerms = groupPerms;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserResponse updateUserResponse = (UpdateUserResponse) o;
        return Objects.equals(this.accessKey, updateUserResponse.accessKey)
            && Objects.equals(this.secretKey, updateUserResponse.secretKey)
            && Objects.equals(this.whiteRemoteAddress, updateUserResponse.whiteRemoteAddress)
            && Objects.equals(this.admin, updateUserResponse.admin)
            && Objects.equals(this.defaultTopicPerm, updateUserResponse.defaultTopicPerm)
            && Objects.equals(this.defaultGroupPerm, updateUserResponse.defaultGroupPerm)
            && Objects.equals(this.topicPerms, updateUserResponse.topicPerms)
            && Objects.equals(this.groupPerms, updateUserResponse.groupPerms);
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
        sb.append("class UpdateUserResponse {\n");
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
