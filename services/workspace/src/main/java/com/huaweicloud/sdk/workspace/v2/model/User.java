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
 * User
 */
public class User {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sid")

    private String sid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_desktops")

    private Integer totalDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

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
    @JsonProperty(value = "is_pre_user")

    private Boolean isPreUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private String accountExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_never_expired")

    private Boolean passwordNeverExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expired")

    private Boolean accountExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_password")

    private Boolean enableChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_subscription")

    private Boolean shareSpaceSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_desktops")

    private Integer shareSpaceDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private List<String> groupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_info_map")

    private String userInfoMap;

    public User withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User withSid(String sid) {
        this.sid = sid;
        return this;
    }

    /**
     * 用户ID。
     * @return sid
     */
    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public User withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User withUserEmail(String userEmail) {
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

    public User withTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
        return this;
    }

    /**
     * 用户绑定桌面云总数。
     * minimum: 1
     * maximum: 55
     * @return totalDesktops
     */
    public Integer getTotalDesktops() {
        return totalDesktops;
    }

    public void setTotalDesktops(Integer totalDesktops) {
        this.totalDesktops = totalDesktops;
    }

    public User withUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * 手机号。
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public User withActiveType(ActiveTypeEnum activeType) {
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

    public User withIsPreUser(Boolean isPreUser) {
        this.isPreUser = isPreUser;
        return this;
    }

    /**
     * 是不是预创建的用户。
     * @return isPreUser
     */
    public Boolean getIsPreUser() {
        return isPreUser;
    }

    public void setIsPreUser(Boolean isPreUser) {
        this.isPreUser = isPreUser;
    }

    public User withAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账户过期时间，0表示永远不过期。
     * @return accountExpires
     */
    public String getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(String accountExpires) {
        this.accountExpires = accountExpires;
    }

    public User withPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
        return this;
    }

    /**
     * 密码是否永不过期，true表示密码永不过期，false表示密码会过期。
     * @return passwordNeverExpired
     */
    public Boolean getPasswordNeverExpired() {
        return passwordNeverExpired;
    }

    public void setPasswordNeverExpired(Boolean passwordNeverExpired) {
        this.passwordNeverExpired = passwordNeverExpired;
    }

    public User withAccountExpired(Boolean accountExpired) {
        this.accountExpired = accountExpired;
        return this;
    }

    /**
     * 账号是否过期，true表示已过期，false表示未过期。
     * @return accountExpired
     */
    public Boolean getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(Boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    public User withEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
        return this;
    }

    /**
     * 是否允许修改密码，true表示允许，false表示不允许。
     * @return enableChangePassword
     */
    public Boolean getEnableChangePassword() {
        return enableChangePassword;
    }

    public void setEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
    }

    public User withNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
        return this;
    }

    /**
     * 下次登录是否需要重置密码，true表示需要重置密码，false表示不需要。
     * @return nextLoginChangePassword
     */
    public Boolean getNextLoginChangePassword() {
        return nextLoginChangePassword;
    }

    public void setNextLoginChangePassword(Boolean nextLoginChangePassword) {
        this.nextLoginChangePassword = nextLoginChangePassword;
    }

    public User withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 用户描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User withLocked(Boolean locked) {
        this.locked = locked;
        return this;
    }

    /**
     * 账户是否被锁定，true表示被锁定，false表示未锁定。
     * @return locked
     */
    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public User withDisabled(Boolean disabled) {
        this.disabled = disabled;
        return this;
    }

    /**
     * 账户是否禁用，true表示被禁用，false表示未禁用。
     * @return disabled
     */
    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public User withShareSpaceSubscription(Boolean shareSpaceSubscription) {
        this.shareSpaceSubscription = shareSpaceSubscription;
        return this;
    }

    /**
     * 用户是否订阅协同，true表示已订阅，false表示未订阅。
     * @return shareSpaceSubscription
     */
    public Boolean getShareSpaceSubscription() {
        return shareSpaceSubscription;
    }

    public void setShareSpaceSubscription(Boolean shareSpaceSubscription) {
        this.shareSpaceSubscription = shareSpaceSubscription;
    }

    public User withShareSpaceDesktops(Integer shareSpaceDesktops) {
        this.shareSpaceDesktops = shareSpaceDesktops;
        return this;
    }

    /**
     * 用户已绑定协同桌面数。
     * minimum: 0
     * maximum: 100
     * @return shareSpaceDesktops
     */
    public Integer getShareSpaceDesktops() {
        return shareSpaceDesktops;
    }

    public void setShareSpaceDesktops(Integer shareSpaceDesktops) {
        this.shareSpaceDesktops = shareSpaceDesktops;
    }

    public User withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public User addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    public User withGroupNames(Consumer<List<String>> groupNamesSetter) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        groupNamesSetter.accept(this.groupNames);
        return this;
    }

    /**
     * 加入的组列表。
     * @return groupNames
     */
    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    public User withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public User withUserInfoMap(String userInfoMap) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User that = (User) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.sid, that.sid)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userEmail, that.userEmail)
            && Objects.equals(this.totalDesktops, that.totalDesktops) && Objects.equals(this.userPhone, that.userPhone)
            && Objects.equals(this.activeType, that.activeType) && Objects.equals(this.isPreUser, that.isPreUser)
            && Objects.equals(this.accountExpires, that.accountExpires)
            && Objects.equals(this.passwordNeverExpired, that.passwordNeverExpired)
            && Objects.equals(this.accountExpired, that.accountExpired)
            && Objects.equals(this.enableChangePassword, that.enableChangePassword)
            && Objects.equals(this.nextLoginChangePassword, that.nextLoginChangePassword)
            && Objects.equals(this.description, that.description) && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.disabled, that.disabled)
            && Objects.equals(this.shareSpaceSubscription, that.shareSpaceSubscription)
            && Objects.equals(this.shareSpaceDesktops, that.shareSpaceDesktops)
            && Objects.equals(this.groupNames, that.groupNames)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.userInfoMap, that.userInfoMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            sid,
            userName,
            userEmail,
            totalDesktops,
            userPhone,
            activeType,
            isPreUser,
            accountExpires,
            passwordNeverExpired,
            accountExpired,
            enableChangePassword,
            nextLoginChangePassword,
            description,
            locked,
            disabled,
            shareSpaceSubscription,
            shareSpaceDesktops,
            groupNames,
            enterpriseProjectId,
            userInfoMap);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sid: ").append(toIndentedString(sid)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    totalDesktops: ").append(toIndentedString(totalDesktops)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    isPreUser: ").append(toIndentedString(isPreUser)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    passwordNeverExpired: ").append(toIndentedString(passwordNeverExpired)).append("\n");
        sb.append("    accountExpired: ").append(toIndentedString(accountExpired)).append("\n");
        sb.append("    enableChangePassword: ").append(toIndentedString(enableChangePassword)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    shareSpaceSubscription: ").append(toIndentedString(shareSpaceSubscription)).append("\n");
        sb.append("    shareSpaceDesktops: ").append(toIndentedString(shareSpaceDesktops)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    userInfoMap: ").append(toIndentedString(userInfoMap)).append("\n");
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
