package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUpdateUserOption;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 
 */
public class KeystoneUpdateUserByAdminRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private KeystoneUpdateUserOption user = null;

    public KeystoneUpdateUserByAdminRequestBody withUser(KeystoneUpdateUserOption user) {
        this.user = user;
        return this;
    }

    public KeystoneUpdateUserByAdminRequestBody withUser(Consumer<KeystoneUpdateUserOption> userSetter) {
        if(this.user == null ){
            this.user = new KeystoneUpdateUserOption();
        }
        userSetter.accept(this.user);
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public KeystoneUpdateUserOption getUser() {
        return user;
    }

    public void setUser(KeystoneUpdateUserOption user) {
        this.user = user;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneUpdateUserByAdminRequestBody keystoneUpdateUserByAdminRequestBody = (KeystoneUpdateUserByAdminRequestBody) o;
        return Objects.equals(this.user, keystoneUpdateUserByAdminRequestBody.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneUpdateUserByAdminRequestBody {\n");
            sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

