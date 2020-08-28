package com.huaweicloud.sdk.iam.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.LoginProtectResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListUserLoginProtectsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="login_protects")
    
    private List<LoginProtectResult> loginProtects = null;
    
    public ListUserLoginProtectsResponse withLoginProtects(List<LoginProtectResult> loginProtects) {
        this.loginProtects = loginProtects;
        return this;
    }

    
    public ListUserLoginProtectsResponse addLoginProtectsItem(LoginProtectResult loginProtectsItem) {
        if (this.loginProtects == null) {
            this.loginProtects = new ArrayList<>();
        }
        this.loginProtects.add(loginProtectsItem);
        return this;
    }

    public ListUserLoginProtectsResponse withLoginProtects(Consumer<List<LoginProtectResult>> loginProtectsSetter) {
        if(this.loginProtects == null ){
            this.loginProtects = new ArrayList<>();
        }
        loginProtectsSetter.accept(this.loginProtects);
        return this;
    }

    /**
     * 登录状态保护信息列表。
     * @return loginProtects
     */
    public List<LoginProtectResult> getLoginProtects() {
        return loginProtects;
    }

    public void setLoginProtects(List<LoginProtectResult> loginProtects) {
        this.loginProtects = loginProtects;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListUserLoginProtectsResponse listUserLoginProtectsResponse = (ListUserLoginProtectsResponse) o;
        return Objects.equals(this.loginProtects, listUserLoginProtectsResponse.loginProtects);
    }
    @Override
    public int hashCode() {
        return Objects.hash(loginProtects);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserLoginProtectsResponse {\n");
        sb.append("    loginProtects: ").append(toIndentedString(loginProtects)).append("\n");
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

