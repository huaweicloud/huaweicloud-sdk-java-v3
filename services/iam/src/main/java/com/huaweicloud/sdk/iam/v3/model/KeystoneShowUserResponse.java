package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.KeystoneUserResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneShowUserResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user")
    
    private KeystoneUserResult user = null;

    public KeystoneShowUserResponse withUser(KeystoneUserResult user) {
        this.user = user;
        return this;
    }

    public KeystoneShowUserResponse withUser(Consumer<KeystoneUserResult> userSetter) {
        if(this.user == null ){
            this.user = new KeystoneUserResult();
        }
        userSetter.accept(this.user);
        return this;
    }


    /**
     * Get user
     * @return user
     */
    public KeystoneUserResult getUser() {
        return user;
    }

    public void setUser(KeystoneUserResult user) {
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
        KeystoneShowUserResponse keystoneShowUserResponse = (KeystoneShowUserResponse) o;
        return Objects.equals(this.user, keystoneShowUserResponse.user);
    }
    @Override
    public int hashCode() {
        return Objects.hash(user);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowUserResponse {\n");
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

