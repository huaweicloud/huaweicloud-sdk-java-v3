package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateUserRequest
 */
public class CreateUserRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private String accountExpires;

    /**
     * 激活类型，默认为用户激活。 * USER_ACTIVATE： 用户激活 * ADMIN_ACTIVATE： 管理员激活
     */
    public static final class ActiveTypeEnum {

        /**
         * Enum USER_ACTIVATE for value: "USER_ACTIVATE"
         */
        public static final ActiveTypeEnum USER_ACTIVATE = new ActiveTypeEnum("USER_ACTIVATE");

        /**
         * Enum ADMIN_ACTIVATE for value: "ADMIN_ACTIVATE"
         */
        public static final ActiveTypeEnum ADMIN_ACTIVATE = new ActiveTypeEnum("ADMIN_ACTIVATE");

        private static final Map<String, ActiveTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActiveTypeEnum> createStaticFields() {
            Map<String, ActiveTypeEnum> map = new HashMap<>();
            map.put("USER_ACTIVATE", USER_ACTIVATE);
            map.put("ADMIN_ACTIVATE", ADMIN_ACTIVATE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActiveTypeEnum(String value) {
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
        public static ActiveTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActiveTypeEnum(value));
        }

        public static ActiveTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActiveTypeEnum) {
                return this.value.equals(((ActiveTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_type")

    private ActiveTypeEnum activeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_password")

    private Boolean enableChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias_name")

    private String aliasName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info_map")

    private String userInfoMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    public CreateUserRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CreateUserRequest withUserEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    /**
     * 用户邮箱。
     * @return userEmail
     */
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public CreateUserRequest withAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账户过期时间，0表示永远不过期。时间格式：yyyy-MM-ddTHH:mm:ssZ或yyyy-MM-ddTHH:mm:ss.SSSZ。
     * @return accountExpires
     */
    public String getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    public CreateUserRequest withActiveType(ActiveTypeEnum activeType) {
        this.activeType = activeType;
        return this;
    }

    /**
     * 激活类型，默认为用户激活。 * USER_ACTIVATE： 用户激活 * ADMIN_ACTIVATE： 管理员激活
     * @return activeType
     */
    public ActiveTypeEnum getActiveType() {
        return activeType;
    }

    public void setActiveType(ActiveTypeEnum activeType) {
        this.activeType = activeType;
    }

    public CreateUserRequest withUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * 用户手机号。
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public CreateUserRequest withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户初始密码。管理员激活模式需要输入。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateUserRequest withEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
        return this;
    }

    /**
     * 是否允许用户更改密码，缺省值为true。
     * @return enableChangePassword
     */
    public Boolean getEnableChangePassword() {
        return enableChangePassword;
    }

    public void setEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
    }

    public CreateUserRequest withNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
        return this;
    }

    /**
     * 下次登录是否必须更改密码，缺省值为true。该字段只在active_type为ADMIN_ACTIVATE时生效。
     * @return nextLoginChangePassword
     */
    public Boolean getNextLoginChangePassword() {
        return nextLoginChangePassword;
    }

    public void setNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
    }

    public CreateUserRequest withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public CreateUserRequest addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public CreateUserRequest withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 用户组的专有ID列表。
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public CreateUserRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述，字符串长度区间[0, 255]。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateUserRequest withAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }

    /**
     * 别名。
     * @return aliasName
     */
    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public CreateUserRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public CreateUserRequest withUserInfoMap(String userInfoMap) {
        this.userInfoMap = userInfoMap;
        return this;
    }

    /**
     * 用户信息映射，包含用户的服务等级、操作模式和类型。
     * @return userInfoMap
     */
    public String getUserInfoMap() {
        return userInfoMap;
    }

    public void setUserInfoMap(String userInfoMap) {
        this.userInfoMap = userInfoMap;
    }

    public CreateUserRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 用户所属域，domain为空时，默认主域。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserRequest that = (CreateUserRequest) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.userEmail, that.userEmail)
            && Objects.equals(this.accountExpires, that.accountExpires)
            && Objects.equals(this.activeType, that.activeType) && Objects.equals(this.userPhone, that.userPhone)
            && Objects.equals(this.password, that.password)
            && Objects.equals(this.enableChangePassword, that.enableChangePassword)
            && Objects.equals(this.nextLoginChangePassword, that.nextLoginChangePassword)
            && Objects.equals(this.groupIds, that.groupIds) && Objects.equals(this.description, that.description)
            && Objects.equals(this.aliasName, that.aliasName)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.userInfoMap, that.userInfoMap) && Objects.equals(this.domain, that.domain);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            userEmail,
            accountExpires,
            activeType,
            userPhone,
            password,
            enableChangePassword,
            nextLoginChangePassword,
            groupIds,
            description,
            aliasName,
            enterpriseProjectId,
            userInfoMap,
            domain);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserRequest {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    enableChangePassword: ").append(toIndentedString(enableChangePassword)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    aliasName: ").append(toIndentedString(aliasName)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    userInfoMap: ").append(toIndentedString(userInfoMap)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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
