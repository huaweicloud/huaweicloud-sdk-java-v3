package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateUserInformationOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile")
    
    private String mobile;

    public UpdateUserInformationOption withEmail(String email) {
        this.email = email;
        return this;
    }

    


    /**
     * IAM用户的新邮箱，符合邮箱格式，长度小于等于255字符。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public UpdateUserInformationOption withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    


    /**
     * IAM用户的国家码+新手机号，手机号为纯数字，长度小于等于32字符。
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserInformationOption updateUserInformationOption = (UpdateUserInformationOption) o;
        return Objects.equals(this.email, updateUserInformationOption.email) &&
            Objects.equals(this.mobile, updateUserInformationOption.mobile);
    }
    @Override
    public int hashCode() {
        return Objects.hash(email, mobile);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserInformationOption {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

