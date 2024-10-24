package com.huaweicloud.sdk.identitycenterstore.v1.model;

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
 * 创建用户请求体
 */
public class CreateUserReqBody {

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
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_type")

    private String userType;

    /**
     * 初始化密码方式，一次性密码/邮箱
     */
    public static final class PasswordModeEnum {

        /**
         * Enum OTP for value: "OTP"
         */
        public static final PasswordModeEnum OTP = new PasswordModeEnum("OTP");

        /**
         * Enum EMAIL for value: "EMAIL"
         */
        public static final PasswordModeEnum EMAIL = new PasswordModeEnum("EMAIL");

        private static final Map<String, PasswordModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PasswordModeEnum> createStaticFields() {
            Map<String, PasswordModeEnum> map = new HashMap<>();
            map.put("OTP", OTP);
            map.put("EMAIL", EMAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PasswordModeEnum(String value) {
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
        public static PasswordModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PasswordModeEnum(value));
        }

        public static PasswordModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PasswordModeEnum) {
                return this.value.equals(((PasswordModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password_mode")

    private PasswordModeEnum passwordMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise")

    private EnterpriseDto enterprise;

    public CreateUserReqBody withAddresses(List<AddressDto> addresses) {
        this.addresses = addresses;
        return this;
    }

    public CreateUserReqBody addAddressesItem(AddressDto addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public CreateUserReqBody withAddresses(Consumer<List<AddressDto>> addressesSetter) {
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

    public CreateUserReqBody withDisplayName(String displayName) {
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

    public CreateUserReqBody withEmails(List<EmailDto> emails) {
        this.emails = emails;
        return this;
    }

    public CreateUserReqBody addEmailsItem(EmailDto emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    public CreateUserReqBody withEmails(Consumer<List<EmailDto>> emailsSetter) {
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

    public CreateUserReqBody withLocale(String locale) {
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

    public CreateUserReqBody withName(NameDto name) {
        this.name = name;
        return this;
    }

    public CreateUserReqBody withName(Consumer<NameDto> nameSetter) {
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

    public CreateUserReqBody withNickname(String nickname) {
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

    public CreateUserReqBody withPhoneNumbers(List<PhoneNumberDto> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public CreateUserReqBody addPhoneNumbersItem(PhoneNumberDto phoneNumbersItem) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    public CreateUserReqBody withPhoneNumbers(Consumer<List<PhoneNumberDto>> phoneNumbersSetter) {
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

    public CreateUserReqBody withPreferredLanguage(String preferredLanguage) {
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

    public CreateUserReqBody withProfileUrl(String profileUrl) {
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

    public CreateUserReqBody withTimezone(String timezone) {
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

    public CreateUserReqBody withTitle(String title) {
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

    public CreateUserReqBody withUserName(String userName) {
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

    public CreateUserReqBody withUserType(String userType) {
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

    public CreateUserReqBody withPasswordMode(PasswordModeEnum passwordMode) {
        this.passwordMode = passwordMode;
        return this;
    }

    /**
     * 初始化密码方式，一次性密码/邮箱
     * @return passwordMode
     */
    public PasswordModeEnum getPasswordMode() {
        return passwordMode;
    }

    public void setPasswordMode(PasswordModeEnum passwordMode) {
        this.passwordMode = passwordMode;
    }

    public CreateUserReqBody withEnterprise(EnterpriseDto enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    public CreateUserReqBody withEnterprise(Consumer<EnterpriseDto> enterpriseSetter) {
        if (this.enterprise == null) {
            this.enterprise = new EnterpriseDto();
            enterpriseSetter.accept(this.enterprise);
        }

        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    public EnterpriseDto getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseDto enterprise) {
        this.enterprise = enterprise;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateUserReqBody that = (CreateUserReqBody) obj;
        return Objects.equals(this.addresses, that.addresses) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.emails, that.emails) && Objects.equals(this.locale, that.locale)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nickname, that.nickname)
            && Objects.equals(this.phoneNumbers, that.phoneNumbers)
            && Objects.equals(this.preferredLanguage, that.preferredLanguage)
            && Objects.equals(this.profileUrl, that.profileUrl) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.title, that.title) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userType, that.userType) && Objects.equals(this.passwordMode, that.passwordMode)
            && Objects.equals(this.enterprise, that.enterprise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addresses,
            displayName,
            emails,
            locale,
            name,
            nickname,
            phoneNumbers,
            preferredLanguage,
            profileUrl,
            timezone,
            title,
            userName,
            userType,
            passwordMode,
            enterprise);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateUserReqBody {\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
        sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
        sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
        sb.append("    profileUrl: ").append(toIndentedString(profileUrl)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    passwordMode: ").append(toIndentedString(passwordMode)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
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
