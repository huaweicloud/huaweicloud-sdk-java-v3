package com.huaweicloud.sdk.identitycenterstore.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * A user object that contains a specified user’s metadata and attributes.
 */
public class UserDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<AddressDto> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emails")

    private List<EmailDto> emails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "external_ids")

    private List<ExternalIdDto> externalIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "identity_store_id")

    private String identityStoreId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameDto name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickname")

    private String nickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_numbers")

    private List<PhoneNumberDto> phoneNumbers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferred_language")

    private String preferredLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profile_url")

    private String profileUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private Long createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_by")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private Long updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_by")

    private String updatedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public UserDto withAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
        return this;
    }

    public UserDto addAddressesItem(AddressDto addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public UserDto withAddresses(Consumer<List<AddressDto>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 用户的地址信息列表
     * @return addresses
     */
    public List<AddressDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
    }

    public UserDto withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 用户的显示名称
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UserDto withEmails(List<EmailDto> emails) {
        this.emails = emails;
        return this;
    }

    public UserDto addEmailsItem(EmailDto emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    public UserDto withEmails(Consumer<List<EmailDto>> emailsSetter) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        emailsSetter.accept(this.emails);
        return this;
    }

    /**
     * 用户的电子邮箱信息列表
     * @return emails
     */
    public List<EmailDto> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailDto> emails) {
        this.emails = emails;
    }

    public UserDto withExternalIds(List<ExternalIdDto> externalIds) {
        this.externalIds = externalIds;
        return this;
    }

    public UserDto addExternalIdsItem(ExternalIdDto externalIdsItem) {
        if (this.externalIds == null) {
            this.externalIds = new ArrayList<>();
        }
        this.externalIds.add(externalIdsItem);
        return this;
    }

    public UserDto withExternalIds(Consumer<List<ExternalIdDto>> externalIdsSetter) {
        if (this.externalIds == null) {
            this.externalIds = new ArrayList<>();
        }
        externalIdsSetter.accept(this.externalIds);
        return this;
    }

    /**
     * 用户的外部标识符信息列表
     * @return externalIds
     */
    public List<ExternalIdDto> getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(List<ExternalIdDto> externalIds) {
        this.externalIds = externalIds;
    }

    public UserDto withIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
        return this;
    }

    /**
     * 身份源的全局唯一标识符（ID）
     * @return identityStoreId
     */
    public String getIdentityStoreId() {
        return identityStoreId;
    }

    public void setIdentityStoreId(String identityStoreId) {
        this.identityStoreId = identityStoreId;
    }

    public UserDto withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 用户的地理区域或位置信息
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public UserDto withName(NameDto name) {
        this.name = name;
        return this;
    }

    public UserDto withName(Consumer<NameDto> nameSetter) {
        if (this.name == null) {
            this.name = new NameDto();
            nameSetter.accept(this.name);
        }

        return this;
    }

    /**
     * Get name
     * @return name
     */
    public NameDto getName() {
        return name;
    }

    public void setName(NameDto name) {
        this.name = name;
    }

    public UserDto withNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    /**
     * 用户昵称
     * @return nickname
     */
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public UserDto withPhoneNumbers(List<PhoneNumberDto> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public UserDto addPhoneNumbersItem(PhoneNumberDto phoneNumbersItem) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    public UserDto withPhoneNumbers(Consumer<List<PhoneNumberDto>> phoneNumbersSetter) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        phoneNumbersSetter.accept(this.phoneNumbers);
        return this;
    }

    /**
     * 用户的电话号码信息列表
     * @return phoneNumbers
     */
    public List<PhoneNumberDto> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberDto> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public UserDto withPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * 用户语言首选项
     * @return preferredLanguage
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public UserDto withProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
        return this;
    }

    /**
     * 与用户关联的URL
     * @return profileUrl
     */
    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public UserDto withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 用户时区
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public UserDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 用户头衔
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UserDto withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 身份源中IdentityCenter用户的全局唯一标识符（ID）
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名，用于标识用户的唯一字符串
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserDto withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 用户类型
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public UserDto withCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建用户时的时间戳
     * @return createdAt
     */
    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public UserDto withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * 创建者
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public UserDto withUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新用户时的时间戳
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserDto withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * 更新者
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public UserDto withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 一个布尔值，表示用户是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserDto that = (UserDto) obj;
        return Objects.equals(this.addresses, that.addresses) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.emails, that.emails) && Objects.equals(this.externalIds, that.externalIds)
            && Objects.equals(this.identityStoreId, that.identityStoreId) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nickname, that.nickname)
            && Objects.equals(this.phoneNumbers, that.phoneNumbers)
            && Objects.equals(this.preferredLanguage, that.preferredLanguage)
            && Objects.equals(this.profileUrl, that.profileUrl) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.title, that.title) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.userType, that.userType)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.updatedBy, that.updatedBy)
            && Objects.equals(this.enabled, that.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses,
            displayName,
            emails,
            externalIds,
            identityStoreId,
            locale,
            name,
            nickname,
            phoneNumbers,
            preferredLanguage,
            profileUrl,
            timezone,
            title,
            userId,
            userName,
            userType,
            createdAt,
            createdBy,
            updatedAt,
            updatedBy,
            enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserDto {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
        sb.append("    identityStoreId: ").append(toIndentedString(identityStoreId)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
        sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
        sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
