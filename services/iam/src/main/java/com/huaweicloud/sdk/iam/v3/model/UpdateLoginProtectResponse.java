package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProtectRespon;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateLoginProtectResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login_protect")
    
    private UpdateLoginProtectRespon loginProtect;

    public UpdateLoginProtectResponse withLoginProtect(UpdateLoginProtectRespon loginProtect) {
        this.loginProtect = loginProtect;
        return this;
    }

    public UpdateLoginProtectResponse withLoginProtect(Consumer<UpdateLoginProtectRespon> loginProtectSetter) {
        if(this.loginProtect == null ){
            this.loginProtect = new UpdateLoginProtectRespon();
            loginProtectSetter.accept(this.loginProtect);
        }
        
        return this;
    }


    /**
     * Get loginProtect
     * @return loginProtect
     */
    public UpdateLoginProtectRespon getLoginProtect() {
        return loginProtect;
    }

    public void setLoginProtect(UpdateLoginProtectRespon loginProtect) {
        this.loginProtect = loginProtect;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateLoginProtectResponse updateLoginProtectResponse = (UpdateLoginProtectResponse) o;
        return Objects.equals(this.loginProtect, updateLoginProtectResponse.loginProtect);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loginProtect);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoginProtectResponse {\n");
        sb.append("    loginProtect: ").append(toIndentedString(loginProtect)).append("\n");
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

