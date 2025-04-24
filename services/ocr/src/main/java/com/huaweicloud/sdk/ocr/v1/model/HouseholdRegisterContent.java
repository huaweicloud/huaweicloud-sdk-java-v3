package com.huaweicloud.sdk.ocr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HouseholdRegisterContent
 */
public class HouseholdRegisterContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "householder_relationship")

    private String householderRelationship;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "former_name")

    private String formerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sex")

    private String sex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birthplace")

    private String birthplace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ethnicity")

    private String ethnicity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_place")

    private String originPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "birth_date")

    private String birthDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_address")

    private String otherAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "religious_belief")

    private String religiousBelief;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id_card_number")

    private String idCardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private String height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blood_type")

    private String bloodType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "education")

    private String education;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marital_status")

    private String maritalStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "military_service_status")

    private String militaryServiceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "work_place")

    private String workPlace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "occupation")

    private String occupation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrated_to_city")

    private String migratedToCity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrated_to_address")

    private String migratedToAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registrar_signature_seal")

    private String registrarSignatureSeal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "registration_date")

    private String registrationDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "household_type")

    private String householdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "household_number")

    private String householdNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "householder_name")

    private String householderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "community")

    private String community;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_date")

    private String issueDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "police_station")

    private String policeStation;

    public HouseholdRegisterContent withName(String name) {
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

    public HouseholdRegisterContent withHouseholderRelationship(String householderRelationship) {
        this.householderRelationship = householderRelationship;
        return this;
    }

    /**
     * 户主或与户主关系。 
     * @return householderRelationship
     */
    public String getHouseholderRelationship() {
        return householderRelationship;
    }

    public void setHouseholderRelationship(String householderRelationship) {
        this.householderRelationship = householderRelationship;
    }

    public HouseholdRegisterContent withFormerName(String formerName) {
        this.formerName = formerName;
        return this;
    }

    /**
     * 曾用名。 
     * @return formerName
     */
    public String getFormerName() {
        return formerName;
    }

    public void setFormerName(String formerName) {
        this.formerName = formerName;
    }

    public HouseholdRegisterContent withSex(String sex) {
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

    public HouseholdRegisterContent withBirthplace(String birthplace) {
        this.birthplace = birthplace;
        return this;
    }

    /**
     * 出生地。 
     * @return birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    public HouseholdRegisterContent withEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
        return this;
    }

    /**
     * 民族。 
     * @return ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }

    public HouseholdRegisterContent withOriginPlace(String originPlace) {
        this.originPlace = originPlace;
        return this;
    }

    /**
     * 籍贯。 
     * @return originPlace
     */
    public String getOriginPlace() {
        return originPlace;
    }

    public void setOriginPlace(String originPlace) {
        this.originPlace = originPlace;
    }

    public HouseholdRegisterContent withBirthDate(String birthDate) {
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

    public HouseholdRegisterContent withOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
        return this;
    }

    /**
     * 本市(县)其他住址。 
     * @return otherAddress
     */
    public String getOtherAddress() {
        return otherAddress;
    }

    public void setOtherAddress(String otherAddress) {
        this.otherAddress = otherAddress;
    }

    public HouseholdRegisterContent withReligiousBelief(String religiousBelief) {
        this.religiousBelief = religiousBelief;
        return this;
    }

    /**
     * 宗教信仰。 
     * @return religiousBelief
     */
    public String getReligiousBelief() {
        return religiousBelief;
    }

    public void setReligiousBelief(String religiousBelief) {
        this.religiousBelief = religiousBelief;
    }

    public HouseholdRegisterContent withIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }

    /**
     * 公民身份证件编号。 
     * @return idCardNumber
     */
    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public HouseholdRegisterContent withHeight(String height) {
        this.height = height;
        return this;
    }

    /**
     * 身高。 
     * @return height
     */
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public HouseholdRegisterContent withBloodType(String bloodType) {
        this.bloodType = bloodType;
        return this;
    }

    /**
     * 血型。 
     * @return bloodType
     */
    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public HouseholdRegisterContent withEducation(String education) {
        this.education = education;
        return this;
    }

    /**
     * 文化程度。 
     * @return education
     */
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public HouseholdRegisterContent withMaritalStatus(String maritalStatus) {
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

    public HouseholdRegisterContent withMilitaryServiceStatus(String militaryServiceStatus) {
        this.militaryServiceStatus = militaryServiceStatus;
        return this;
    }

    /**
     * 兵役情况。 
     * @return militaryServiceStatus
     */
    public String getMilitaryServiceStatus() {
        return militaryServiceStatus;
    }

    public void setMilitaryServiceStatus(String militaryServiceStatus) {
        this.militaryServiceStatus = militaryServiceStatus;
    }

    public HouseholdRegisterContent withWorkPlace(String workPlace) {
        this.workPlace = workPlace;
        return this;
    }

    /**
     * 服务处所。 
     * @return workPlace
     */
    public String getWorkPlace() {
        return workPlace;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public HouseholdRegisterContent withOccupation(String occupation) {
        this.occupation = occupation;
        return this;
    }

    /**
     * 职业。 
     * @return occupation
     */
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public HouseholdRegisterContent withMigratedToCity(String migratedToCity) {
        this.migratedToCity = migratedToCity;
        return this;
    }

    /**
     * 何时由何地迁来本市(县)。 
     * @return migratedToCity
     */
    public String getMigratedToCity() {
        return migratedToCity;
    }

    public void setMigratedToCity(String migratedToCity) {
        this.migratedToCity = migratedToCity;
    }

    public HouseholdRegisterContent withMigratedToAddress(String migratedToAddress) {
        this.migratedToAddress = migratedToAddress;
        return this;
    }

    /**
     * 何时由何地迁来本址。 
     * @return migratedToAddress
     */
    public String getMigratedToAddress() {
        return migratedToAddress;
    }

    public void setMigratedToAddress(String migratedToAddress) {
        this.migratedToAddress = migratedToAddress;
    }

    public HouseholdRegisterContent withRegistrarSignatureSeal(String registrarSignatureSeal) {
        this.registrarSignatureSeal = registrarSignatureSeal;
        return this;
    }

    /**
     * 承办人签章。 
     * @return registrarSignatureSeal
     */
    public String getRegistrarSignatureSeal() {
        return registrarSignatureSeal;
    }

    public void setRegistrarSignatureSeal(String registrarSignatureSeal) {
        this.registrarSignatureSeal = registrarSignatureSeal;
    }

    public HouseholdRegisterContent withRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * 登记日期。 
     * @return registrationDate
     */
    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public HouseholdRegisterContent withHouseholdType(String householdType) {
        this.householdType = householdType;
        return this;
    }

    /**
     * 户别。 
     * @return householdType
     */
    public String getHouseholdType() {
        return householdType;
    }

    public void setHouseholdType(String householdType) {
        this.householdType = householdType;
    }

    public HouseholdRegisterContent withHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
        return this;
    }

    /**
     * 户号。 
     * @return householdNumber
     */
    public String getHouseholdNumber() {
        return householdNumber;
    }

    public void setHouseholdNumber(String householdNumber) {
        this.householdNumber = householdNumber;
    }

    public HouseholdRegisterContent withHouseholderName(String householderName) {
        this.householderName = householderName;
        return this;
    }

    /**
     * 户主姓名。当type参数为“首页”时，返回此参数。 
     * @return householderName
     */
    public String getHouseholderName() {
        return householderName;
    }

    public void setHouseholderName(String householderName) {
        this.householderName = householderName;
    }

    public HouseholdRegisterContent withCommunity(String community) {
        this.community = community;
        return this;
    }

    /**
     * 社区。当type参数为“首页”时，返回此参数。 
     * @return community
     */
    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public HouseholdRegisterContent withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 住址。当type参数为“首页”时，返回此参数。 
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public HouseholdRegisterContent withIssueDate(String issueDate) {
        this.issueDate = issueDate;
        return this;
    }

    /**
     * 签发日期。当type参数为“首页”时，返回此参数。 
     * @return issueDate
     */
    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public HouseholdRegisterContent withPoliceStation(String policeStation) {
        this.policeStation = policeStation;
        return this;
    }

    /**
     * 户口登记机关。当type参数为“首页”时，返回此参数。 
     * @return policeStation
     */
    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HouseholdRegisterContent that = (HouseholdRegisterContent) obj;
        return Objects.equals(this.name, that.name)
            && Objects.equals(this.householderRelationship, that.householderRelationship)
            && Objects.equals(this.formerName, that.formerName) && Objects.equals(this.sex, that.sex)
            && Objects.equals(this.birthplace, that.birthplace) && Objects.equals(this.ethnicity, that.ethnicity)
            && Objects.equals(this.originPlace, that.originPlace) && Objects.equals(this.birthDate, that.birthDate)
            && Objects.equals(this.otherAddress, that.otherAddress)
            && Objects.equals(this.religiousBelief, that.religiousBelief)
            && Objects.equals(this.idCardNumber, that.idCardNumber) && Objects.equals(this.height, that.height)
            && Objects.equals(this.bloodType, that.bloodType) && Objects.equals(this.education, that.education)
            && Objects.equals(this.maritalStatus, that.maritalStatus)
            && Objects.equals(this.militaryServiceStatus, that.militaryServiceStatus)
            && Objects.equals(this.workPlace, that.workPlace) && Objects.equals(this.occupation, that.occupation)
            && Objects.equals(this.migratedToCity, that.migratedToCity)
            && Objects.equals(this.migratedToAddress, that.migratedToAddress)
            && Objects.equals(this.registrarSignatureSeal, that.registrarSignatureSeal)
            && Objects.equals(this.registrationDate, that.registrationDate)
            && Objects.equals(this.householdType, that.householdType)
            && Objects.equals(this.householdNumber, that.householdNumber)
            && Objects.equals(this.householderName, that.householderName)
            && Objects.equals(this.community, that.community) && Objects.equals(this.address, that.address)
            && Objects.equals(this.issueDate, that.issueDate) && Objects.equals(this.policeStation, that.policeStation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            householderRelationship,
            formerName,
            sex,
            birthplace,
            ethnicity,
            originPlace,
            birthDate,
            otherAddress,
            religiousBelief,
            idCardNumber,
            height,
            bloodType,
            education,
            maritalStatus,
            militaryServiceStatus,
            workPlace,
            occupation,
            migratedToCity,
            migratedToAddress,
            registrarSignatureSeal,
            registrationDate,
            householdType,
            householdNumber,
            householderName,
            community,
            address,
            issueDate,
            policeStation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HouseholdRegisterContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    householderRelationship: ").append(toIndentedString(householderRelationship)).append("\n");
        sb.append("    formerName: ").append(toIndentedString(formerName)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
        sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
        sb.append("    originPlace: ").append(toIndentedString(originPlace)).append("\n");
        sb.append("    birthDate: ").append(toIndentedString(birthDate)).append("\n");
        sb.append("    otherAddress: ").append(toIndentedString(otherAddress)).append("\n");
        sb.append("    religiousBelief: ").append(toIndentedString(religiousBelief)).append("\n");
        sb.append("    idCardNumber: ").append(toIndentedString(idCardNumber)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    bloodType: ").append(toIndentedString(bloodType)).append("\n");
        sb.append("    education: ").append(toIndentedString(education)).append("\n");
        sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
        sb.append("    militaryServiceStatus: ").append(toIndentedString(militaryServiceStatus)).append("\n");
        sb.append("    workPlace: ").append(toIndentedString(workPlace)).append("\n");
        sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
        sb.append("    migratedToCity: ").append(toIndentedString(migratedToCity)).append("\n");
        sb.append("    migratedToAddress: ").append(toIndentedString(migratedToAddress)).append("\n");
        sb.append("    registrarSignatureSeal: ").append(toIndentedString(registrarSignatureSeal)).append("\n");
        sb.append("    registrationDate: ").append(toIndentedString(registrationDate)).append("\n");
        sb.append("    householdType: ").append(toIndentedString(householdType)).append("\n");
        sb.append("    householdNumber: ").append(toIndentedString(householdNumber)).append("\n");
        sb.append("    householderName: ").append(toIndentedString(householderName)).append("\n");
        sb.append("    community: ").append(toIndentedString(community)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    issueDate: ").append(toIndentedString(issueDate)).append("\n");
        sb.append("    policeStation: ").append(toIndentedString(policeStation)).append("\n");
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
