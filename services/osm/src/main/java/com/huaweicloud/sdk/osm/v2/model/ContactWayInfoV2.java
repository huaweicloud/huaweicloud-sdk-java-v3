package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ContactWayInfoV2
 */
public class ContactWayInfoV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mail")

    private String mail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "area")

    private String area;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_type")

    private Integer idType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "company_name")

    private String companyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_files")

    private List<String> idFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_way")

    private String otherWay;

    public ContactWayInfoV2 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 姓名或名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ContactWayInfoV2 withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 联系电话
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public ContactWayInfoV2 withMail(String mail) {
        this.mail = mail;
        return this;
    }

    /**
     * 联系邮箱
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public ContactWayInfoV2 withArea(String area) {
        this.area = area;
        return this;
    }

    /**
     * 国家/地区
     * @return area
     */
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public ContactWayInfoV2 withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContactWayInfoV2 withIdType(Integer idType) {
        this.idType = idType;
        return this;
    }

    /**
     * 身份。企业 10；个人 20；授权代理人 21；律师 22；知识产权所有人 23
     * minimum: 0
     * maximum: 100
     * @return idType
     */
    public Integer getIdType() {
        return idType;
    }

    public void setIdType(Integer idType) {
        this.idType = idType;
    }

    public ContactWayInfoV2 withCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /**
     * 公司名称
     * @return companyName
     */
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public ContactWayInfoV2 withIdFiles(List<String> idFiles) {
        this.idFiles = idFiles;
        return this;
    }

    public ContactWayInfoV2 addIdFilesItem(String idFilesItem) {
        if (this.idFiles == null) {
            this.idFiles = new ArrayList<>();
        }
        this.idFiles.add(idFilesItem);
        return this;
    }

    public ContactWayInfoV2 withIdFiles(Consumer<List<String>> idFilesSetter) {
        if (this.idFiles == null) {
            this.idFiles = new ArrayList<>();
        }
        idFilesSetter.accept(this.idFiles);
        return this;
    }

    /**
     * 身份证明附件列表，至少1个，最多3个
     * @return idFiles
     */
    public List<String> getIdFiles() {
        return idFiles;
    }

    public void setIdFiles(List<String> idFiles) {
        this.idFiles = idFiles;
    }

    public ContactWayInfoV2 withOtherWay(String otherWay) {
        this.otherWay = otherWay;
        return this;
    }

    /**
     * 其他联系方式
     * @return otherWay
     */
    public String getOtherWay() {
        return otherWay;
    }

    public void setOtherWay(String otherWay) {
        this.otherWay = otherWay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactWayInfoV2 contactWayInfoV2 = (ContactWayInfoV2) o;
        return Objects.equals(this.name, contactWayInfoV2.name) && Objects.equals(this.mobile, contactWayInfoV2.mobile)
            && Objects.equals(this.mail, contactWayInfoV2.mail) && Objects.equals(this.area, contactWayInfoV2.area)
            && Objects.equals(this.address, contactWayInfoV2.address)
            && Objects.equals(this.idType, contactWayInfoV2.idType)
            && Objects.equals(this.companyName, contactWayInfoV2.companyName)
            && Objects.equals(this.idFiles, contactWayInfoV2.idFiles)
            && Objects.equals(this.otherWay, contactWayInfoV2.otherWay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mobile, mail, area, address, idType, companyName, idFiles, otherWay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactWayInfoV2 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    mail: ").append(toIndentedString(mail)).append("\n");
        sb.append("    area: ").append(toIndentedString(area)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    idType: ").append(toIndentedString(idType)).append("\n");
        sb.append("    companyName: ").append(toIndentedString(companyName)).append("\n");
        sb.append("    idFiles: ").append(toIndentedString(idFiles)).append("\n");
        sb.append("    otherWay: ").append(toIndentedString(otherWay)).append("\n");
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
