package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 待修改的企业基本信息，不带或参数null，则不修改
 */
public class ModCorpBasicDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="country")
    
    private String country;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="fax")
    
    private String fax;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="address")
    
    private String address;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public ModCorpBasicDTO withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 企业名称，格式必须满足^[^#%&'+;<>=\"'？?\\\\……/]*$
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ModCorpBasicDTO withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 手机号，必须加上国家码，例如中国大陆手机+86xxxxxxx，当填写手机号时 “country”参数必填,手机格式必须满足(^$|^[+]?[0-9]+$)
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public ModCorpBasicDTO withCountry(String country) {
        this.country = country;
        return this;
    }

    


    /**
     * 若smsNumber为手机号,则需带上手机号所属的国家。 例如国家为中国大陆则country参数取值为chinaPR 国家和国家码的对应关系请参考：https://support.huaweicloud.com/api-meeting/meeting_21_0109.html 
     * @return country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    

    public ModCorpBasicDTO withFax(String fax) {
        this.fax = fax;
        return this;
    }

    


    /**
     * 传真号码,格式必须满足(^$|^[+]?[0-9]+$)
     * @return fax
     */
    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    

    public ModCorpBasicDTO withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 邮箱地址,格式必须满足(^$|^[\\w-+]+(\\.[\\w-+]+)*@[\\w-]+(\\.[\\w-]+)*(\\.[\\w-]{1,})$)
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public ModCorpBasicDTO withAddress(String address) {
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

    

    public ModCorpBasicDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 备注
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModCorpBasicDTO modCorpBasicDTO = (ModCorpBasicDTO) o;
        return Objects.equals(this.name, modCorpBasicDTO.name) &&
            Objects.equals(this.phone, modCorpBasicDTO.phone) &&
            Objects.equals(this.country, modCorpBasicDTO.country) &&
            Objects.equals(this.fax, modCorpBasicDTO.fax) &&
            Objects.equals(this.email, modCorpBasicDTO.email) &&
            Objects.equals(this.address, modCorpBasicDTO.address) &&
            Objects.equals(this.description, modCorpBasicDTO.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, phone, country, fax, email, address, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModCorpBasicDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

