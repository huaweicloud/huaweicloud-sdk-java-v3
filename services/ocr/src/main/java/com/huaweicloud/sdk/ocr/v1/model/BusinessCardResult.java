package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class BusinessCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private List<String> title = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company")

    private List<String> company = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "department")

    private List<String> department = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private List<String> phone = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private List<String> address = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private List<String> email = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fax")

    private List<String> fax = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "postcode")

    private List<String> postcode = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "website")

    private List<String> website = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info_list")

    private List<ExtraInfoList> extraInfoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adjusted_image")

    private String adjustedImage;

    public BusinessCardResult withName(List<String> name) {
        this.name = name;
        return this;
    }

    public BusinessCardResult addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public BusinessCardResult withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /** 姓名列表。
     * 
     * @return name */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public BusinessCardResult withTitle(List<String> title) {
        this.title = title;
        return this;
    }

    public BusinessCardResult addTitleItem(String titleItem) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        this.title.add(titleItem);
        return this;
    }

    public BusinessCardResult withTitle(Consumer<List<String>> titleSetter) {
        if (this.title == null) {
            this.title = new ArrayList<>();
        }
        titleSetter.accept(this.title);
        return this;
    }

    /** 职位头衔列表。
     * 
     * @return title */
    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public BusinessCardResult withCompany(List<String> company) {
        this.company = company;
        return this;
    }

    public BusinessCardResult addCompanyItem(String companyItem) {
        if (this.company == null) {
            this.company = new ArrayList<>();
        }
        this.company.add(companyItem);
        return this;
    }

    public BusinessCardResult withCompany(Consumer<List<String>> companySetter) {
        if (this.company == null) {
            this.company = new ArrayList<>();
        }
        companySetter.accept(this.company);
        return this;
    }

    /** 公司列表。
     * 
     * @return company */
    public List<String> getCompany() {
        return company;
    }

    public void setCompany(List<String> company) {
        this.company = company;
    }

    public BusinessCardResult withDepartment(List<String> department) {
        this.department = department;
        return this;
    }

    public BusinessCardResult addDepartmentItem(String departmentItem) {
        if (this.department == null) {
            this.department = new ArrayList<>();
        }
        this.department.add(departmentItem);
        return this;
    }

    public BusinessCardResult withDepartment(Consumer<List<String>> departmentSetter) {
        if (this.department == null) {
            this.department = new ArrayList<>();
        }
        departmentSetter.accept(this.department);
        return this;
    }

    /** 部门列表。
     * 
     * @return department */
    public List<String> getDepartment() {
        return department;
    }

    public void setDepartment(List<String> department) {
        this.department = department;
    }

    public BusinessCardResult withPhone(List<String> phone) {
        this.phone = phone;
        return this;
    }

    public BusinessCardResult addPhoneItem(String phoneItem) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        this.phone.add(phoneItem);
        return this;
    }

    public BusinessCardResult withPhone(Consumer<List<String>> phoneSetter) {
        if (this.phone == null) {
            this.phone = new ArrayList<>();
        }
        phoneSetter.accept(this.phone);
        return this;
    }

    /** 联系方式列表。
     * 
     * @return phone */
    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public BusinessCardResult withAddress(List<String> address) {
        this.address = address;
        return this;
    }

    public BusinessCardResult addAddressItem(String addressItem) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        this.address.add(addressItem);
        return this;
    }

    public BusinessCardResult withAddress(Consumer<List<String>> addressSetter) {
        if (this.address == null) {
            this.address = new ArrayList<>();
        }
        addressSetter.accept(this.address);
        return this;
    }

    /** 地址列表。
     * 
     * @return address */
    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public BusinessCardResult withEmail(List<String> email) {
        this.email = email;
        return this;
    }

    public BusinessCardResult addEmailItem(String emailItem) {
        if (this.email == null) {
            this.email = new ArrayList<>();
        }
        this.email.add(emailItem);
        return this;
    }

    public BusinessCardResult withEmail(Consumer<List<String>> emailSetter) {
        if (this.email == null) {
            this.email = new ArrayList<>();
        }
        emailSetter.accept(this.email);
        return this;
    }

    /** 邮箱列表。
     * 
     * @return email */
    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public BusinessCardResult withFax(List<String> fax) {
        this.fax = fax;
        return this;
    }

    public BusinessCardResult addFaxItem(String faxItem) {
        if (this.fax == null) {
            this.fax = new ArrayList<>();
        }
        this.fax.add(faxItem);
        return this;
    }

    public BusinessCardResult withFax(Consumer<List<String>> faxSetter) {
        if (this.fax == null) {
            this.fax = new ArrayList<>();
        }
        faxSetter.accept(this.fax);
        return this;
    }

    /** 传真列表。
     * 
     * @return fax */
    public List<String> getFax() {
        return fax;
    }

    public void setFax(List<String> fax) {
        this.fax = fax;
    }

    public BusinessCardResult withPostcode(List<String> postcode) {
        this.postcode = postcode;
        return this;
    }

    public BusinessCardResult addPostcodeItem(String postcodeItem) {
        if (this.postcode == null) {
            this.postcode = new ArrayList<>();
        }
        this.postcode.add(postcodeItem);
        return this;
    }

    public BusinessCardResult withPostcode(Consumer<List<String>> postcodeSetter) {
        if (this.postcode == null) {
            this.postcode = new ArrayList<>();
        }
        postcodeSetter.accept(this.postcode);
        return this;
    }

    /** 邮编列表。
     * 
     * @return postcode */
    public List<String> getPostcode() {
        return postcode;
    }

    public void setPostcode(List<String> postcode) {
        this.postcode = postcode;
    }

    public BusinessCardResult withWebsite(List<String> website) {
        this.website = website;
        return this;
    }

    public BusinessCardResult addWebsiteItem(String websiteItem) {
        if (this.website == null) {
            this.website = new ArrayList<>();
        }
        this.website.add(websiteItem);
        return this;
    }

    public BusinessCardResult withWebsite(Consumer<List<String>> websiteSetter) {
        if (this.website == null) {
            this.website = new ArrayList<>();
        }
        websiteSetter.accept(this.website);
        return this;
    }

    /** 公司网址列表。
     * 
     * @return website */
    public List<String> getWebsite() {
        return website;
    }

    public void setWebsite(List<String> website) {
        this.website = website;
    }

    public BusinessCardResult withExtraInfoList(List<ExtraInfoList> extraInfoList) {
        this.extraInfoList = extraInfoList;
        return this;
    }

    public BusinessCardResult addExtraInfoListItem(ExtraInfoList extraInfoListItem) {
        if (this.extraInfoList == null) {
            this.extraInfoList = new ArrayList<>();
        }
        this.extraInfoList.add(extraInfoListItem);
        return this;
    }

    public BusinessCardResult withExtraInfoList(Consumer<List<ExtraInfoList>> extraInfoListSetter) {
        if (this.extraInfoList == null) {
            this.extraInfoList = new ArrayList<>();
        }
        extraInfoListSetter.accept(this.extraInfoList);
        return this;
    }

    /** 其余信息列表。
     * 
     * @return extraInfoList */
    public List<ExtraInfoList> getExtraInfoList() {
        return extraInfoList;
    }

    public void setExtraInfoList(List<ExtraInfoList> extraInfoList) {
        this.extraInfoList = extraInfoList;
    }

    public BusinessCardResult withAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
        return this;
    }

    /** 返回矫正后的名片图像的BASE64编码。
     * 
     * @return adjustedImage */
    public String getAdjustedImage() {
        return adjustedImage;
    }

    public void setAdjustedImage(String adjustedImage) {
        this.adjustedImage = adjustedImage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BusinessCardResult businessCardResult = (BusinessCardResult) o;
        return Objects.equals(this.name, businessCardResult.name)
            && Objects.equals(this.title, businessCardResult.title)
            && Objects.equals(this.company, businessCardResult.company)
            && Objects.equals(this.department, businessCardResult.department)
            && Objects.equals(this.phone, businessCardResult.phone)
            && Objects.equals(this.address, businessCardResult.address)
            && Objects.equals(this.email, businessCardResult.email) && Objects.equals(this.fax, businessCardResult.fax)
            && Objects.equals(this.postcode, businessCardResult.postcode)
            && Objects.equals(this.website, businessCardResult.website)
            && Objects.equals(this.extraInfoList, businessCardResult.extraInfoList)
            && Objects.equals(this.adjustedImage, businessCardResult.adjustedImage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            title,
            company,
            department,
            phone,
            address,
            email,
            fax,
            postcode,
            website,
            extraInfoList,
            adjustedImage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BusinessCardResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    postcode: ").append(toIndentedString(postcode)).append("\n");
        sb.append("    website: ").append(toIndentedString(website)).append("\n");
        sb.append("    extraInfoList: ").append(toIndentedString(extraInfoList)).append("\n");
        sb.append("    adjustedImage: ").append(toIndentedString(adjustedImage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
