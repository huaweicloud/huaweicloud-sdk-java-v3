package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 外部联系人信息。
 */
public class ExternalContactDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otherNumber")

    private String otherNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "otherNumberCountry")

    private String otherNumberCountry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country")

    private String country;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "corpName")

    private String corpName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deptName")

    private String deptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "position")

    private String position;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customNumber")

    private String customNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updateTime")

    private BigDecimal updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public ExternalContactDTO withOtherNumber(String otherNumber) {
        this.otherNumber = otherNumber;
        return this;
    }

    /**
     * 其他号码。 > * 其他号码必须以国家码作为前缀 > * otherNumber填写时，otherNumberCountry也必须填写 > * 如果要清空手机号配置，则otherNumberCountry和otherNumber都要置为\"\" 
     * @return otherNumber
     */
    public String getOtherNumber() {
        return otherNumber;
    }

    public void setOtherNumber(String otherNumber) {
        this.otherNumber = otherNumber;
    }

    public ExternalContactDTO withOtherNumberCountry(String otherNumberCountry) {
        this.otherNumberCountry = otherNumberCountry;
        return this;
    }

    /**
     * [[其他号码所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
     * @return otherNumberCountry
     */
    public String getOtherNumberCountry() {
        return otherNumberCountry;
    }

    public void setOtherNumberCountry(String otherNumberCountry) {
        this.otherNumberCountry = otherNumberCountry;
    }

    public ExternalContactDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * [[手机号所属的国家](https://support.huaweicloud.com/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hws)[[手机号所属的国家](https://support.huaweicloud.com/intl/zh-cn/api-meeting/meeting_21_0109.html#ZH-CN_TOPIC_0212714591__table19371178135314)](tag:hk) 。 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public ExternalContactDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 手机号。 > * 手机号必须以国家码作为前缀 > * phone填写时，country也必须填写 > * 如果要清空手机号配置，则country和phone都要置为\"\" 
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ExternalContactDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ExternalContactDTO withCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }

    /**
     * 公司名称。
     * @return corpName
     */
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    public ExternalContactDTO withDeptName(String deptName) {
        this.deptName = deptName;
        return this;
    }

    /**
     * 部门。
     * @return deptName
     */
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public ExternalContactDTO withPosition(String position) {
        this.position = position;
        return this;
    }

    /**
     * 职务。
     * @return position
     */
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public ExternalContactDTO withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 个人地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ExternalContactDTO withRemarks(String remarks) {
        this.remarks = remarks;
        return this;
    }

    /**
     * 备注。
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public ExternalContactDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 外部联系人UUID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ExternalContactDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExternalContactDTO withCustomNumber(String customNumber) {
        this.customNumber = customNumber;
        return this;
    }

    /**
     * 外部联系人自定义号码。 > 仅VDC场景下使用。 
     * @return customNumber
     */
    public String getCustomNumber() {
        return customNumber;
    }

    public void setCustomNumber(String customNumber) {
        this.customNumber = customNumber;
    }

    public ExternalContactDTO withUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 用户信息最后更新时间戳。
     * @return updateTime
     */
    public BigDecimal getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(BigDecimal updateTime) {
        this.updateTime = updateTime;
    }

    public ExternalContactDTO withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 外部联系人类型。 * PERSONAL：个人外部联系人 * CORP：企业外部联系人 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExternalContactDTO externalContactDTO = (ExternalContactDTO) o;
        return Objects.equals(this.otherNumber, externalContactDTO.otherNumber)
            && Objects.equals(this.otherNumberCountry, externalContactDTO.otherNumberCountry)
            && Objects.equals(this.country, externalContactDTO.country)
            && Objects.equals(this.phone, externalContactDTO.phone)
            && Objects.equals(this.email, externalContactDTO.email)
            && Objects.equals(this.corpName, externalContactDTO.corpName)
            && Objects.equals(this.deptName, externalContactDTO.deptName)
            && Objects.equals(this.position, externalContactDTO.position)
            && Objects.equals(this.address, externalContactDTO.address)
            && Objects.equals(this.remarks, externalContactDTO.remarks)
            && Objects.equals(this.id, externalContactDTO.id) && Objects.equals(this.name, externalContactDTO.name)
            && Objects.equals(this.customNumber, externalContactDTO.customNumber)
            && Objects.equals(this.updateTime, externalContactDTO.updateTime)
            && Objects.equals(this.type, externalContactDTO.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otherNumber,
            otherNumberCountry,
            country,
            phone,
            email,
            corpName,
            deptName,
            position,
            address,
            remarks,
            id,
            name,
            customNumber,
            updateTime,
            type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExternalContactDTO {\n");
        sb.append("    otherNumber: ").append(toIndentedString(otherNumber)).append("\n");
        sb.append("    otherNumberCountry: ").append(toIndentedString(otherNumberCountry)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    corpName: ").append(toIndentedString(corpName)).append("\n");
        sb.append("    deptName: ").append(toIndentedString(deptName)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    customNumber: ").append(toIndentedString(customNumber)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
