package com.huaweicloud.sdk.identitycenterscim.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class PatchUserResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "externalId")

    private String externalId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta")

    private MetaDto meta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userName")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private NameDto name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nickName")

    private String nickName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userType")

    private String userType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preferredLanguage")

    private String preferredLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locale")

    private String locale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timezone")

    private String timezone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active")

    private Boolean active;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emails")

    private List<EmailItemDto> emails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addresses")

    private List<AddressItemDto> addresses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phoneNumbers")

    private List<PhoneNumberItemDto> phoneNumbers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")

    private EnterpriseDto urnIetfParamsScimSchemasExtensionEnterprise20User;

    public PatchUserResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户的全局唯一标识符（ID）
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PatchUserResponse withExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * 外部标识符
     * @return externalId
     */
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public PatchUserResponse withMeta(MetaDto meta) {
        this.meta = meta;
        return this;
    }

    public PatchUserResponse withMeta(Consumer<MetaDto> metaSetter) {
        if (this.meta == null) {
            this.meta = new MetaDto();
            metaSetter.accept(this.meta);
        }

        return this;
    }

    /**
     * Get meta
     * @return meta
     */
    public MetaDto getMeta() {
        return meta;
    }

    public void setMeta(MetaDto meta) {
        this.meta = meta;
    }

    public PatchUserResponse withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public PatchUserResponse addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public PatchUserResponse withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * 概要
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public PatchUserResponse withUserName(String userName) {
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

    public PatchUserResponse withName(NameDto name) {
        this.name = name;
        return this;
    }

    public PatchUserResponse withName(Consumer<NameDto> nameSetter) {
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

    public PatchUserResponse withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * 包含用户显示名称的字符串
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public PatchUserResponse withNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }

    /**
     * 包含用户昵称的字符串
     * @return nickName
     */
    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public PatchUserResponse withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 包含用户头衔的字符串
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public PatchUserResponse withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    /**
     * 指示用户类型的字符串
     * @return userType
     */
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public PatchUserResponse withPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        return this;
    }

    /**
     * 包含用户首选语言的字符串
     * @return preferredLanguage
     */
    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public PatchUserResponse withLocale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * 包含用户地理区域或位置的字符串
     * @return locale
     */
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PatchUserResponse withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * 包含用户时区的字符串
     * @return timezone
     */
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public PatchUserResponse withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * 表示用户是否启用
     * @return active
     */
    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public PatchUserResponse withEmails(List<EmailItemDto> emails) {
        this.emails = emails;
        return this;
    }

    public PatchUserResponse addEmailsItem(EmailItemDto emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    public PatchUserResponse withEmails(Consumer<List<EmailItemDto>> emailsSetter) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        emailsSetter.accept(this.emails);
        return this;
    }

    /**
     * 包含用户的电子邮箱信息的对象列表
     * @return emails
     */
    public List<EmailItemDto> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailItemDto> emails) {
        this.emails = emails;
    }

    public PatchUserResponse withAddresses(List<AddressItemDto> addresses) {
        this.addresses = addresses;
        return this;
    }

    public PatchUserResponse addAddressesItem(AddressItemDto addressesItem) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(addressesItem);
        return this;
    }

    public PatchUserResponse withAddresses(Consumer<List<AddressItemDto>> addressesSetter) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        addressesSetter.accept(this.addresses);
        return this;
    }

    /**
     * 包含用户地址信息的对象列表
     * @return addresses
     */
    public List<AddressItemDto> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<AddressItemDto> addresses) {
        this.addresses = addresses;
    }

    public PatchUserResponse withPhoneNumbers(List<PhoneNumberItemDto> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public PatchUserResponse addPhoneNumbersItem(PhoneNumberItemDto phoneNumbersItem) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        this.phoneNumbers.add(phoneNumbersItem);
        return this;
    }

    public PatchUserResponse withPhoneNumbers(Consumer<List<PhoneNumberItemDto>> phoneNumbersSetter) {
        if (this.phoneNumbers == null) {
            this.phoneNumbers = new ArrayList<>();
        }
        phoneNumbersSetter.accept(this.phoneNumbers);
        return this;
    }

    /**
     * 包含用户电话号码信息的对象列表
     * @return phoneNumbers
     */
    public List<PhoneNumberItemDto> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberItemDto> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public PatchUserResponse withUrnIetfParamsScimSchemasExtensionEnterprise20User(
        EnterpriseDto urnIetfParamsScimSchemasExtensionEnterprise20User) {
        this.urnIetfParamsScimSchemasExtensionEnterprise20User = urnIetfParamsScimSchemasExtensionEnterprise20User;
        return this;
    }

    public PatchUserResponse withUrnIetfParamsScimSchemasExtensionEnterprise20User(
        Consumer<EnterpriseDto> urnIetfParamsScimSchemasExtensionEnterprise20UserSetter) {
        if (this.urnIetfParamsScimSchemasExtensionEnterprise20User == null) {
            this.urnIetfParamsScimSchemasExtensionEnterprise20User = new EnterpriseDto();
            urnIetfParamsScimSchemasExtensionEnterprise20UserSetter
                .accept(this.urnIetfParamsScimSchemasExtensionEnterprise20User);
        }

        return this;
    }

    /**
     * Get urnIetfParamsScimSchemasExtensionEnterprise20User
     * @return urnIetfParamsScimSchemasExtensionEnterprise20User
     */
    public EnterpriseDto getUrnIetfParamsScimSchemasExtensionEnterprise20User() {
        return urnIetfParamsScimSchemasExtensionEnterprise20User;
    }

    public void setUrnIetfParamsScimSchemasExtensionEnterprise20User(
        EnterpriseDto urnIetfParamsScimSchemasExtensionEnterprise20User) {
        this.urnIetfParamsScimSchemasExtensionEnterprise20User = urnIetfParamsScimSchemasExtensionEnterprise20User;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PatchUserResponse that = (PatchUserResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.externalId, that.externalId)
            && Objects.equals(this.meta, that.meta) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.name, that.name)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.nickName, that.nickName)
            && Objects.equals(this.title, that.title) && Objects.equals(this.userType, that.userType)
            && Objects.equals(this.preferredLanguage, that.preferredLanguage)
            && Objects.equals(this.locale, that.locale) && Objects.equals(this.timezone, that.timezone)
            && Objects.equals(this.active, that.active) && Objects.equals(this.emails, that.emails)
            && Objects.equals(this.addresses, that.addresses) && Objects.equals(this.phoneNumbers, that.phoneNumbers)
            && Objects.equals(this.urnIetfParamsScimSchemasExtensionEnterprise20User,
                that.urnIetfParamsScimSchemasExtensionEnterprise20User);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            externalId,
            meta,
            schemas,
            userName,
            name,
            displayName,
            nickName,
            title,
            userType,
            preferredLanguage,
            locale,
            timezone,
            active,
            emails,
            addresses,
            phoneNumbers,
            urnIetfParamsScimSchemasExtensionEnterprise20User);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatchUserResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
        sb.append("    preferredLanguage: ").append(toIndentedString(preferredLanguage)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
        sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
        sb.append("    phoneNumbers: ").append(toIndentedString(phoneNumbers)).append("\n");
        sb.append("    urnIetfParamsScimSchemasExtensionEnterprise20User: ")
            .append(toIndentedString(urnIetfParamsScimSchemasExtensionEnterprise20User))
            .append("\n");
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
