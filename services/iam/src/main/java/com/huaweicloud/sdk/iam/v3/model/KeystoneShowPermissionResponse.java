package com.huaweicloud.sdk.iam.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iam.v3.model.RoleResult;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class KeystoneShowPermissionResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="role")
    
    private RoleResult role = null;

    public KeystoneShowPermissionResponse withRole(RoleResult role) {
        this.role = role;
        return this;
    }

    public KeystoneShowPermissionResponse withRole(Consumer<RoleResult> roleSetter) {
        if(this.role == null ){
            this.role = new RoleResult();
        }
        roleSetter.accept(this.role);
        return this;
    }


    /**
     * Get role
     * @return role
     */
    public RoleResult getRole() {
        return role;
    }

    public void setRole(RoleResult role) {
        this.role = role;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowPermissionResponse keystoneShowPermissionResponse = (KeystoneShowPermissionResponse) o;
        return Objects.equals(this.role, keystoneShowPermissionResponse.role);
    }
    @Override
    public int hashCode() {
        return Objects.hash(role);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowPermissionResponse {\n");
            sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

