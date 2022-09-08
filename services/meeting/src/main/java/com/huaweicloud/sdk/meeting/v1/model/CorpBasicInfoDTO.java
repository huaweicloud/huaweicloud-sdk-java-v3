package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 企业注册信息
 */
public class CorpBasicInfoDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminName")

    private String adminName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableSMS")

    private Boolean enableSMS;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableCloudDisk")

    private Boolean enableCloudDisk;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enablePstn")

    private Boolean enablePstn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "autoUserCreate")

    private Boolean autoUserCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpType")

    private Integer corpType;

    public CorpBasicInfoDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 企业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CorpBasicInfoDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 企业名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CorpBasicInfoDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 企业所在地
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public CorpBasicInfoDTO withAdminName(String adminName) {
        this.adminName = adminName;
        return this;
    }

    /**
     * 管理员名称
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public CorpBasicInfoDTO withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 管理员账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public CorpBasicInfoDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 管理员手机
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CorpBasicInfoDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * 管理员手机所属的国家
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public CorpBasicInfoDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 管理员邮箱
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CorpBasicInfoDTO withEnableSMS(Boolean enableSMS) {
        this.enableSMS = enableSMS;
        return this;
    }

    /**
     * 是否发送短信
     * @return enableSMS
     */
    public Boolean getEnableSMS() {
        return enableSMS;
    }

    public void setEnableSMS(Boolean enableSMS) {
        this.enableSMS = enableSMS;
    }

    public CorpBasicInfoDTO withEnableCloudDisk(Boolean enableCloudDisk) {
        this.enableCloudDisk = enableCloudDisk;
        return this;
    }

    /**
     * 是否开启云盘
     * @return enableCloudDisk
     */
    public Boolean getEnableCloudDisk() {
        return enableCloudDisk;
    }

    public void setEnableCloudDisk(Boolean enableCloudDisk) {
        this.enableCloudDisk = enableCloudDisk;
    }

    public CorpBasicInfoDTO withEnablePstn(Boolean enablePstn) {
        this.enablePstn = enablePstn;
        return this;
    }

    /**
     * 是否具有pstn功能
     * @return enablePstn
     */
    public Boolean getEnablePstn() {
        return enablePstn;
    }

    public void setEnablePstn(Boolean enablePstn) {
        this.enablePstn = enablePstn;
    }

    public CorpBasicInfoDTO withAutoUserCreate(Boolean autoUserCreate) {
        this.autoUserCreate = autoUserCreate;
        return this;
    }

    /**
     * 是否支持自动开户
     * @return autoUserCreate
     */
    public Boolean getAutoUserCreate() {
        return autoUserCreate;
    }

    public void setAutoUserCreate(Boolean autoUserCreate) {
        this.autoUserCreate = autoUserCreate;
    }

    public CorpBasicInfoDTO withCorpType(Integer corpType) {
        this.corpType = corpType;
        return this;
    }

    /**
     * 企业类型
     * @return corpType
     */
    public Integer getCorpType() {
        return corpType;
    }

    public void setCorpType(Integer corpType) {
        this.corpType = corpType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CorpBasicInfoDTO corpBasicInfoDTO = (CorpBasicInfoDTO) o;
        return Objects.equals(this.id, corpBasicInfoDTO.id) && Objects.equals(this.name, corpBasicInfoDTO.name)
            && Objects.equals(this.address, corpBasicInfoDTO.address)
            && Objects.equals(this.adminName, corpBasicInfoDTO.adminName)
            && Objects.equals(this.account, corpBasicInfoDTO.account)
            && Objects.equals(this.phone, corpBasicInfoDTO.phone)
            && Objects.equals(this.country, corpBasicInfoDTO.country)
            && Objects.equals(this.email, corpBasicInfoDTO.email)
            && Objects.equals(this.enableSMS, corpBasicInfoDTO.enableSMS)
            && Objects.equals(this.enableCloudDisk, corpBasicInfoDTO.enableCloudDisk)
            && Objects.equals(this.enablePstn, corpBasicInfoDTO.enablePstn)
            && Objects.equals(this.autoUserCreate, corpBasicInfoDTO.autoUserCreate)
            && Objects.equals(this.corpType, corpBasicInfoDTO.corpType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            address,
            adminName,
            account,
            phone,
            country,
            email,
            enableSMS,
            enableCloudDisk,
            enablePstn,
            autoUserCreate,
            corpType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CorpBasicInfoDTO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    adminName: ").append(toIndentedString(adminName)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    enableSMS: ").append(toIndentedString(enableSMS)).append("\n");
        sb.append("    enableCloudDisk: ").append(toIndentedString(enableCloudDisk)).append("\n");
        sb.append("    enablePstn: ").append(toIndentedString(enablePstn)).append("\n");
        sb.append("    autoUserCreate: ").append(toIndentedString(autoUserCreate)).append("\n");
        sb.append("    corpType: ").append(toIndentedString(corpType)).append("\n");
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
