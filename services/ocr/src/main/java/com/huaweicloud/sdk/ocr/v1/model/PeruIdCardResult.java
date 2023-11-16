package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PeruIdCardResult
 */
public class PeruIdCardResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cui_number")

    private String cuiNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_surname")

    private String firstSurname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "second_surname")

    private String secondSurname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "given_name")

    private String givenName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marital_status")

    private String maritalStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nationality")

    private String nationality;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expiry_date")

    private String expiryDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_place")

    private String birthPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voting_group")

    private String votingGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organ_donation")

    private String organDonation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_date")

    private String registrationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_image")

    private String portraitImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "portrait_location")

    private List<List<Integer>> portraitLocation = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "department")

    private String department;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "province")

    private String province;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "district")

    private String district;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remarks")

    private String remarks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code1")

    private String machineCode1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code2")

    private String machineCode2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "machine_code3")

    private String machineCode3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duplicate")

    private Boolean duplicate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidence")

    private Map<String, Float> confidence = null;

    public PeruIdCardResult withCuiNumber(String cuiNumber) {
        this.cuiNumber = cuiNumber;
        return this;
    }

    /**
     * 身份证号。
     * @return cuiNumber
     */
    public String getCuiNumber() {
        return cuiNumber;
    }

    public void setCuiNumber(String cuiNumber) {
        this.cuiNumber = cuiNumber;
    }

    public PeruIdCardResult withFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
        return this;
    }

    /**
     * 第一姓氏。
     * @return firstSurname
     */
    public String getFirstSurname() {
        return firstSurname;
    }

    public void setFirstSurname(String firstSurname) {
        this.firstSurname = firstSurname;
    }

    public PeruIdCardResult withSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
        return this;
    }

    /**
     * 第二姓氏。
     * @return secondSurname
     */
    public String getSecondSurname() {
        return secondSurname;
    }

    public void setSecondSurname(String secondSurname) {
        this.secondSurname = secondSurname;
    }

    public PeruIdCardResult withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    /**
     * 名。
     * @return givenName
     */
    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public PeruIdCardResult withSex(String sex) {
        this.sex = sex;
        return this;
    }

    /**
     * 性别。
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public PeruIdCardResult withMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
        return this;
    }

    /**
     * 婚姻状况。
     * @return maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public PeruIdCardResult withBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    /**
     * 出生日期。
     * @return birthDate
     */
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public PeruIdCardResult withNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }

    /**
     * 国籍。
     * @return nationality
     */
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public PeruIdCardResult withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 发行日期。
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public PeruIdCardResult withExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
        return this;
    }

    /**
     * 失效日期。
     * @return expiryDate
     */
    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public PeruIdCardResult withBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
        return this;
    }

    /**
     * 出生地编码。
     * @return birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public PeruIdCardResult withVotingGroup(String votingGroup) {
        this.votingGroup = votingGroup;
        return this;
    }

    /**
     * 投票组。
     * @return votingGroup
     */
    public String getVotingGroup() {
        return votingGroup;
    }

    public void setVotingGroup(String votingGroup) {
        this.votingGroup = votingGroup;
    }

    public PeruIdCardResult withOrganDonation(String organDonation) {
        this.organDonation = organDonation;
        return this;
    }

    /**
     * 器官捐赠意愿。
     * @return organDonation
     */
    public String getOrganDonation() {
        return organDonation;
    }

    public void setOrganDonation(String organDonation) {
        this.organDonation = organDonation;
    }

    public PeruIdCardResult withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * 注册日期。
     * @return registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public PeruIdCardResult withPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
        return this;
    }

    /**
     * 头像的base64编码。当输入参数“return_portrait_image”为“true”时，才返回该参数。
     * @return portraitImage
     */
    public String getPortraitImage() {
        return portraitImage;
    }

    public void setPortraitImage(String portraitImage) {
        this.portraitImage = portraitImage;
    }

    public PeruIdCardResult withPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
        return this;
    }

    public PeruIdCardResult addPortraitLocationItem(List<Integer> portraitLocationItem) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        this.portraitLocation.add(portraitLocationItem);
        return this;
    }

    public PeruIdCardResult withPortraitLocation(Consumer<List<List<Integer>>> portraitLocationSetter) {
        if (this.portraitLocation == null) {
            this.portraitLocation = new ArrayList<>();
        }
        portraitLocationSetter.accept(this.portraitLocation);
        return this;
    }

    /**
     * 头像在原图上的位置。 当输入参数“return_portrait_location”为“true”时，才返回该参数。以列表形式显示，包含头像区域四个顶点的二维坐标（x,y），坐标原点为图片左上角，x轴沿水平方向，y轴沿竖直方向。 
     * @return portraitLocation
     */
    public List<List<Integer>> getPortraitLocation() {
        return portraitLocation;
    }

    public void setPortraitLocation(List<List<Integer>> portraitLocation) {
        this.portraitLocation = portraitLocation;
    }

    public PeruIdCardResult withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 地址。
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public PeruIdCardResult withDepartment(String department) {
        this.department = department;
        return this;
    }

    /**
     * 大区。
     * @return department
     */
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public PeruIdCardResult withProvince(String province) {
        this.province = province;
        return this;
    }

    /**
     * 省。
     * @return province
     */
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public PeruIdCardResult withDistrict(String district) {
        this.district = district;
        return this;
    }

    /**
     * 区。
     * @return district
     */
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public PeruIdCardResult withRemarks(String remarks) {
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

    public PeruIdCardResult withMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
        return this;
    }

    /**
     * 机器码第一行。
     * @return machineCode1
     */
    public String getMachineCode1() {
        return machineCode1;
    }

    public void setMachineCode1(String machineCode1) {
        this.machineCode1 = machineCode1;
    }

    public PeruIdCardResult withMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
        return this;
    }

    /**
     * 机器码第二行。
     * @return machineCode2
     */
    public String getMachineCode2() {
        return machineCode2;
    }

    public void setMachineCode2(String machineCode2) {
        this.machineCode2 = machineCode2;
    }

    public PeruIdCardResult withMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
        return this;
    }

    /**
     * 机器码第三行。
     * @return machineCode3
     */
    public String getMachineCode3() {
        return machineCode3;
    }

    public void setMachineCode3(String machineCode3) {
        this.machineCode3 = machineCode3;
    }

    public PeruIdCardResult withDuplicate(Boolean duplicate) {
        this.duplicate = duplicate;
        return this;
    }

    /**
     * 是否重新登记过。可选值如下所示： -  true: 已重新登记过 -  false: 未重新登记过 
     * @return duplicate
     */
    public Boolean getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(Boolean duplicate) {
        this.duplicate = duplicate;
    }

    public PeruIdCardResult withConfidence(Map<String, Float> confidence) {
        this.confidence = confidence;
        return this;
    }

    public PeruIdCardResult putConfidenceItem(String key, Float confidenceItem) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        this.confidence.put(key, confidenceItem);
        return this;
    }

    public PeruIdCardResult withConfidence(Consumer<Map<String, Float>> confidenceSetter) {
        if (this.confidence == null) {
            this.confidence = new HashMap<>();
        }
        confidenceSetter.accept(this.confidence);
        return this;
    }

    /**
     * 相关字段的置信度信息，置信度越大，表示本次识别的对应字段的可靠性越高，在统计意义上，置信度越大，准确率越高。注：置信度由算法给出，不直接等价于对应字段的准确率。
     * @return confidence
     */
    public Map<String, Float> getConfidence() {
        return confidence;
    }

    public void setConfidence(Map<String, Float> confidence) {
        this.confidence = confidence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PeruIdCardResult that = (PeruIdCardResult) obj;
        return Objects.equals(this.cuiNumber, that.cuiNumber) && Objects.equals(this.firstSurname, that.firstSurname)
            && Objects.equals(this.secondSurname, that.secondSurname) && Objects.equals(this.givenName, that.givenName)
            && Objects.equals(this.sex, that.sex) && Objects.equals(this.maritalStatus, that.maritalStatus)
            && Objects.equals(this.birthDate, that.birthDate) && Objects.equals(this.nationality, that.nationality)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.expiryDate, that.expiryDate)
            && Objects.equals(this.birthPlace, that.birthPlace) && Objects.equals(this.votingGroup, that.votingGroup)
            && Objects.equals(this.organDonation, that.organDonation)
            && Objects.equals(this.registrationDate, that.registrationDate)
            && Objects.equals(this.portraitImage, that.portraitImage)
            && Objects.equals(this.portraitLocation, that.portraitLocation)
            && Objects.equals(this.address, that.address) && Objects.equals(this.department, that.department)
            && Objects.equals(this.province, that.province) && Objects.equals(this.district, that.district)
            && Objects.equals(this.remarks, that.remarks) && Objects.equals(this.machineCode1, that.machineCode1)
            && Objects.equals(this.machineCode2, that.machineCode2)
            && Objects.equals(this.machineCode3, that.machineCode3) && Objects.equals(this.duplicate, that.duplicate)
            && Objects.equals(this.confidence, that.confidence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuiNumber,
            firstSurname,
            secondSurname,
            givenName,
            sex,
            maritalStatus,
            birthDate,
            nationality,
            issueDate,
            expiryDate,
            birthPlace,
            votingGroup,
            organDonation,
            registrationDate,
            portraitImage,
            portraitLocation,
            address,
            department,
            province,
            district,
            remarks,
            machineCode1,
            machineCode2,
            machineCode3,
            duplicate,
            confidence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PeruIdCardResult {\n");
        sb.append("    cuiNumber: ").append(toIndentedString(cuiNumber)).append("\n");
        sb.append("    firstSurname: ").append(toIndentedString(firstSurname)).append("\n");
        sb.append("    secondSurname: ").append(toIndentedString(secondSurname)).append("\n");
        sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
        sb.append("    birthPlace: ").append(toIndentedString(birthPlace)).append("\n");
        sb.append("    votingGroup: ").append(toIndentedString(votingGroup)).append("\n");
        sb.append("    organDonation: ").append(toIndentedString(organDonation)).append("\n");
        sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
        sb.append("    portraitImage: ").append(toIndentedString(portraitImage)).append("\n");
        sb.append("    portraitLocation: ").append(toIndentedString(portraitLocation)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    department: ").append(toIndentedString(department)).append("\n");
        sb.append("    province: ").append(toIndentedString(province)).append("\n");
        sb.append("    district: ").append(toIndentedString(district)).append("\n");
        sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
        sb.append("    machineCode1: ").append(toIndentedString(machineCode1)).append("\n");
        sb.append("    machineCode2: ").append(toIndentedString(machineCode2)).append("\n");
        sb.append("    machineCode3: ").append(toIndentedString(machineCode3)).append("\n");
        sb.append("    duplicate: ").append(toIndentedString(duplicate)).append("\n");
        sb.append("    confidence: ").append(toIndentedString(confidence)).append("\n");
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
