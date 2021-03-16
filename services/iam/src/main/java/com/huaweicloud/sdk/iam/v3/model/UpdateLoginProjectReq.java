package com.huaweicloud.sdk.iam.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.UpdateLoginProject;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 
 */
public class UpdateLoginProjectReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login_protect")
    
    private UpdateLoginProject loginProtect;

    public UpdateLoginProjectReq withLoginProtect(UpdateLoginProject loginProtect) {
        this.loginProtect = loginProtect;
        return this;
    }

    public UpdateLoginProjectReq withLoginProtect(Consumer<UpdateLoginProject> loginProtectSetter) {
        if(this.loginProtect == null ){
            this.loginProtect = new UpdateLoginProject();
            loginProtectSetter.accept(this.loginProtect);
        }
        
        return this;
    }


    /**
     * Get loginProtect
     * @return loginProtect
     */
    public UpdateLoginProject getLoginProtect() {
        return loginProtect;
    }

    public void setLoginProtect(UpdateLoginProject loginProtect) {
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
        UpdateLoginProjectReq updateLoginProjectReq = (UpdateLoginProjectReq) o;
        return Objects.equals(this.loginProtect, updateLoginProjectReq.loginProtect);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loginProtect);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLoginProjectReq {\n");
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

