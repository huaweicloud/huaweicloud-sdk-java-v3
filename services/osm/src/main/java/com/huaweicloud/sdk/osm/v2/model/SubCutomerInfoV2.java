package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * SubCutomerInfoV2
 */
public class SubCutomerInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile")
    
    private String mobile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_id")
    
    private String customerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_name")
    
    private String customerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="area_code")
    
    private String areaCode;

    public SubCutomerInfoV2 withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    


    /**
     * 手机号（匿名化）
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public SubCutomerInfoV2 withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * 邮箱（匿名化）
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SubCutomerInfoV2 withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    


    /**
     * 客户id
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public SubCutomerInfoV2 withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * 主账号id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public SubCutomerInfoV2 withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    


    /**
     * 客户名称（匿名化）
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public SubCutomerInfoV2 withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    


    /**
     * 国家码
     * @return areaCode
     */
    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubCutomerInfoV2 subCutomerInfoV2 = (SubCutomerInfoV2) o;
        return Objects.equals(this.mobile, subCutomerInfoV2.mobile) &&
            Objects.equals(this.email, subCutomerInfoV2.email) &&
            Objects.equals(this.customerId, subCutomerInfoV2.customerId) &&
            Objects.equals(this.domainId, subCutomerInfoV2.domainId) &&
            Objects.equals(this.customerName, subCutomerInfoV2.customerName) &&
            Objects.equals(this.areaCode, subCutomerInfoV2.areaCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(mobile, email, customerId, domainId, customerName, areaCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubCutomerInfoV2 {\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
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

