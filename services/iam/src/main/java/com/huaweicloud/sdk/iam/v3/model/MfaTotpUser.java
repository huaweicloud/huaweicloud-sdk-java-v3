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
public class MfaTotpUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="passcode")
    
    private String passcode;

    public MfaTotpUser withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 已开启虚拟MFA方式的登录保护的IAM用户ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public MfaTotpUser withPasscode(String passcode) {
        this.passcode = passcode;
        return this;
    }

    


    /**
     * 虚拟MFA验证码，在MFA应用程序中获取动态验证码，获取方法请参见：[如何获取虚拟MFA验证码](https://support.huaweicloud.com/iam_faq/iam_01_0001.html)。
     * @return passcode
     */
    public String getPasscode() {
        return passcode;
    }

    public void setPasscode(String passcode) {
        this.passcode = passcode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MfaTotpUser mfaTotpUser = (MfaTotpUser) o;
        return Objects.equals(this.id, mfaTotpUser.id) &&
            Objects.equals(this.passcode, mfaTotpUser.passcode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, passcode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MfaTotpUser {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

