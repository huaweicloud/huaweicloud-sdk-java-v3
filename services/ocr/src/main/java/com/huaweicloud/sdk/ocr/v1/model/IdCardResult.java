package com.huaweicloud.sdk.ocr.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class IdCardResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sex")
    
    private String sex;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="birth")
    
    private String birth;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ethnicity")
    
    private String ethnicity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="number")
    
    private String number;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue")
    
    private String issue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valid_from")
    
    private String validFrom;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="valid_to")
    
    private String validTo;

    public IdCardResult withName(String name) {
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

    

    public IdCardResult withSex(String sex) {
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

    

    public IdCardResult withBirth(String birth) {
        this.birth = birth;
        return this;
    }

    


    /**
     * 出生日期。 
     * @return birth
     */
    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    

    public IdCardResult withEthnicity(String ethnicity) {
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

    

    public IdCardResult withAddress(String address) {
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

    

    public IdCardResult withNumber(String number) {
        this.number = number;
        return this;
    }

    


    /**
     * 身份证号。 
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    

    public IdCardResult withIssue(String issue) {
        this.issue = issue;
        return this;
    }

    


    /**
     * 发证机关。 
     * @return issue
     */
    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    

    public IdCardResult withValidFrom(String validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    


    /**
     * 有效起始日期。 
     * @return validFrom
     */
    public String getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(String validFrom) {
        this.validFrom = validFrom;
    }

    

    public IdCardResult withValidTo(String validTo) {
        this.validTo = validTo;
        return this;
    }

    


    /**
     * 有效结束日期。   > 说明：  - 身份证识别只支持中国大陆汉族身份证识别。 
     * @return validTo
     */
    public String getValidTo() {
        return validTo;
    }

    public void setValidTo(String validTo) {
        this.validTo = validTo;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IdCardResult idCardResult = (IdCardResult) o;
        return Objects.equals(this.name, idCardResult.name) &&
            Objects.equals(this.sex, idCardResult.sex) &&
            Objects.equals(this.birth, idCardResult.birth) &&
            Objects.equals(this.ethnicity, idCardResult.ethnicity) &&
            Objects.equals(this.address, idCardResult.address) &&
            Objects.equals(this.number, idCardResult.number) &&
            Objects.equals(this.issue, idCardResult.issue) &&
            Objects.equals(this.validFrom, idCardResult.validFrom) &&
            Objects.equals(this.validTo, idCardResult.validTo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, sex, birth, ethnicity, address, number, issue, validFrom, validTo);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IdCardResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
        sb.append("    birth: ").append(toIndentedString(birth)).append("\n");
        sb.append("    ethnicity: ").append(toIndentedString(ethnicity)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    issue: ").append(toIndentedString(issue)).append("\n");
        sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("    validTo: ").append(toIndentedString(validTo)).append("\n");
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

