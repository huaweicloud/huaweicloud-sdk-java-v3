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
 * UserDetail
 */
public class UserDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_email")

    private String userEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

    /**
     * 激活类型，默认为用户激活。 * USER_ACTIVATE： 用户激活 * ADMIN_ACTIVATE： 管理员激活
     */
    public static final class ActiveTypeEnum {

        /**
         * Enum ADMIN_ACTIVATE for value: "ADMIN_ACTIVATE"
         */
        public static final ActiveTypeEnum ADMIN_ACTIVATE = new ActiveTypeEnum("ADMIN_ACTIVATE");

        /**
         * Enum USER_ACTIVATE for value: "USER_ACTIVATE"
         */
        public static final ActiveTypeEnum USER_ACTIVATE = new ActiveTypeEnum("USER_ACTIVATE");

        private static final Map<String, ActiveTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActiveTypeEnum> createStaticFields() {
            Map<String, ActiveTypeEnum> map = new HashMap<>();
            map.put("ADMIN_ACTIVATE", ADMIN_ACTIVATE);
            map.put("USER_ACTIVATE", USER_ACTIVATE);
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
    @JsonProperty(value = "object_sid")

    private String objectSid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sam_account_name")

    private String samAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_principal_name")

    private String userPrincipalName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_name")

    private String fullName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "distinguished_name")

    private String distinguishedName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private Integer accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "when_created")

    private String whenCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_expires")

    private Long accountExpires;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_pre_user")

    private Boolean isPreUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_expired")

    private Boolean userExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locked")

    private Boolean locked;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_change_password")

    private Boolean enableChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_never_expired")

    private Boolean passwordNeverExpired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "next_login_change_password")

    private Boolean nextLoginChangePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disabled")

    private Boolean disabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_names")

    private List<String> groupNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_subscription")

    private Boolean shareSpaceSubscription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_desktops")

    private Integer shareSpaceDesktops;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_desktops")

    private Integer totalDesktops;

    public UserDetail withDescription(String description) {
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

    public UserDetail withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public UserDetail withUserName(String userName) {
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

    public UserDetail withUserEmail(String userEmail) {
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

    public UserDetail withUserPhone(String userPhone) {
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

    public UserDetail withActiveType(ActiveTypeEnum activeType) {
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

    public UserDetail withObjectSid(String objectSid) {
        this.objectSid = objectSid;
        return this;
    }

    /**
     * 用户sid。
     * @return objectSid
     */
    public String getObjectSid() {
        return objectSid;
    }

    public void setObjectSid(String objectSid) {
        this.objectSid = objectSid;
    }

    public UserDetail withSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
        return this;
    }

    /**
     * 登录名(windows以前版本)。
     * @return samAccountName
     */
    public String getSamAccountName() {
        return samAccountName;
    }

    public void setSamAccountName(String samAccountName) {
        this.samAccountName = samAccountName;
    }

    public UserDetail withUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
        return this;
    }

    /**
     * 用户登录名。
     * @return userPrincipalName
     */
    public String getUserPrincipalName() {
        return userPrincipalName;
    }

    public void setUserPrincipalName(String userPrincipalName) {
        this.userPrincipalName = userPrincipalName;
    }

    public UserDetail withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * 全名。
     * @return fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserDetail withDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
        return this;
    }

    /**
     * 用户在域树上的唯一位置。
     * @return distinguishedName
     */
    public String getDistinguishedName() {
        return distinguishedName;
    }

    public void setDistinguishedName(String distinguishedName) {
        this.distinguishedName = distinguishedName;
    }

    public UserDetail withAccountType(Integer accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * 账号类型(0：用户；1：用户组)。
     * minimum: 1
     * maximum: 55
     * @return accountType
     */
    public Integer getAccountType() {
        return accountType;
    }

    public void setAccountType(Integer accountType) {
        this.accountType = accountType;
    }

    public UserDetail withWhenCreated(String whenCreated) {
        this.whenCreated = whenCreated;
        return this;
    }

    /**
     * UTC时间毫秒数对应的字符，格式为：yyyy-MM-ddTHH:mm:ss.SSSZ。
     * @return whenCreated
     */
    public String getWhenCreated() {
        return whenCreated;
    }

    public void setWhenCreated(String whenCreated) {
        this.whenCreated = whenCreated;
    }

    public UserDetail withAccountExpires(Long accountExpires) {
        this.accountExpires = accountExpires;
        return this;
    }

    /**
     * 账号有效期最后一天对应的UTC时间，以毫秒为单位。
     * minimum: 1
     * maximum: 55
     * @return accountExpires
     */
    public Long getAccountExpires() {
        return accountExpires;
    }

    public void setAccountExpires(Long accountExpires) {
        this.accountExpires = accountExpires;
    }

    public UserDetail withIsPreUser(Boolean isPreUser) {
        this.isPreUser = isPreUser;
        return this;
    }

    /**
     * 是否是预创建的用户，true表示是预创建用户，false表示不是预创建用户。
     * @return isPreUser
     */
    public Boolean getIsPreUser() {
        return isPreUser;
    }

    public void setIsPreUser(Boolean isPreUser) {
        this.isPreUser = isPreUser;
    }

    public UserDetail withUserExpired(Boolean userExpired) {
        this.userExpired = userExpired;
        return this;
    }

    /**
     * 账户是否过期，true表示过期，false表示未过期。
     * @return userExpired
     */
    public Boolean getUserExpired() {
        return userExpired;
    }

    public void setUserExpired(Boolean userExpired) {
        this.userExpired = userExpired;
    }

    public UserDetail withLocked(Boolean locked) {
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

    public UserDetail withEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
        return this;
    }

    /**
     * 是否允许修改密码，true表示允许修改密码，false表示不允许。
     * @return enableChangePassword
     */
    public Boolean getEnableChangePassword() {
        return enableChangePassword;
    }

    public void setEnableChangePassword(Boolean enableChangePassword) {
        this.enableChangePassword = enableChangePassword;
    }

    public UserDetail withPasswordNeverExpired(Boolean passwordNeverExpired) {
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

    public UserDetail withNextLoginChangePassword(Boolean nextLoginChangePassword) {
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

    public UserDetail withDisabled(Boolean disabled) {
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

    public UserDetail withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

    public UserDetail addGroupNamesItem(String groupNamesItem) {
        if (this.groupNames == null) {
            this.groupNames = new ArrayList<>();
        }
        this.groupNames.add(groupNamesItem);
        return this;
    }

    public UserDetail withGroupNames(Consumer<List<String>> groupNamesSetter) {
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

    public UserDetail withShareSpaceSubscription(Boolean shareSpaceSubscription) {
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

    public UserDetail withShareSpaceDesktops(Integer shareSpaceDesktops) {
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

    public UserDetail withTotalDesktops(Integer totalDesktops) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDetail that = (UserDetail) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.id, that.id)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userEmail, that.userEmail)
            && Objects.equals(this.userPhone, that.userPhone) && Objects.equals(this.activeType, that.activeType)
            && Objects.equals(this.objectSid, that.objectSid)
            && Objects.equals(this.samAccountName, that.samAccountName)
            && Objects.equals(this.userPrincipalName, that.userPrincipalName)
            && Objects.equals(this.fullName, that.fullName)
            && Objects.equals(this.distinguishedName, that.distinguishedName)
            && Objects.equals(this.accountType, that.accountType) && Objects.equals(this.whenCreated, that.whenCreated)
            && Objects.equals(this.accountExpires, that.accountExpires)
            && Objects.equals(this.isPreUser, that.isPreUser) && Objects.equals(this.userExpired, that.userExpired)
            && Objects.equals(this.locked, that.locked)
            && Objects.equals(this.enableChangePassword, that.enableChangePassword)
            && Objects.equals(this.passwordNeverExpired, that.passwordNeverExpired)
            && Objects.equals(this.nextLoginChangePassword, that.nextLoginChangePassword)
            && Objects.equals(this.disabled, that.disabled) && Objects.equals(this.groupNames, that.groupNames)
            && Objects.equals(this.shareSpaceSubscription, that.shareSpaceSubscription)
            && Objects.equals(this.shareSpaceDesktops, that.shareSpaceDesktops)
            && Objects.equals(this.totalDesktops, that.totalDesktops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            id,
            userName,
            userEmail,
            userPhone,
            activeType,
            objectSid,
            samAccountName,
            userPrincipalName,
            fullName,
            distinguishedName,
            accountType,
            whenCreated,
            accountExpires,
            isPreUser,
            userExpired,
            locked,
            enableChangePassword,
            passwordNeverExpired,
            nextLoginChangePassword,
            disabled,
            groupNames,
            shareSpaceSubscription,
            shareSpaceDesktops,
            totalDesktops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDetail {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    activeType: ").append(toIndentedString(activeType)).append("\n");
        sb.append("    objectSid: ").append(toIndentedString(objectSid)).append("\n");
        sb.append("    samAccountName: ").append(toIndentedString(samAccountName)).append("\n");
        sb.append("    userPrincipalName: ").append(toIndentedString(userPrincipalName)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    distinguishedName: ").append(toIndentedString(distinguishedName)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    whenCreated: ").append(toIndentedString(whenCreated)).append("\n");
        sb.append("    accountExpires: ").append(toIndentedString(accountExpires)).append("\n");
        sb.append("    isPreUser: ").append(toIndentedString(isPreUser)).append("\n");
        sb.append("    userExpired: ").append(toIndentedString(userExpired)).append("\n");
        sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
        sb.append("    enableChangePassword: ").append(toIndentedString(enableChangePassword)).append("\n");
        sb.append("    passwordNeverExpired: ").append(toIndentedString(passwordNeverExpired)).append("\n");
        sb.append("    nextLoginChangePassword: ").append(toIndentedString(nextLoginChangePassword)).append("\n");
        sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
        sb.append("    groupNames: ").append(toIndentedString(groupNames)).append("\n");
        sb.append("    shareSpaceSubscription: ").append(toIndentedString(shareSpaceSubscription)).append("\n");
        sb.append("    shareSpaceDesktops: ").append(toIndentedString(shareSpaceDesktops)).append("\n");
        sb.append("    totalDesktops: ").append(toIndentedString(totalDesktops)).append("\n");
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
