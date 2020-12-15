package com.huaweicloud.sdk.bms.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowResetPwdResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resetpwd_flag")
    
    private String resetpwdFlag;

    public ShowResetPwdResponse withResetpwdFlag(String resetpwdFlag) {
        this.resetpwdFlag = resetpwdFlag;
        return this;
    }

    


    /**
     * 是否支持重置密码。True：支持一键重置密码。False：不支持一键重置密码
     * @return resetpwdFlag
     */
    public String getResetpwdFlag() {
        return resetpwdFlag;
    }

    public void setResetpwdFlag(String resetpwdFlag) {
        this.resetpwdFlag = resetpwdFlag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowResetPwdResponse showResetPwdResponse = (ShowResetPwdResponse) o;
        return Objects.equals(this.resetpwdFlag, showResetPwdResponse.resetpwdFlag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resetpwdFlag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResetPwdResponse {\n");
        sb.append("    resetpwdFlag: ").append(toIndentedString(resetpwdFlag)).append("\n");
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

