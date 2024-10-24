package com.huaweicloud.sdk.identitycenter.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set")

    private PermissionSetDto permissionSet;

    public CreatePermissionSetResponse withPermissionSet(PermissionSetDto permissionSet) {
        this.permissionSet = permissionSet;
        return this;
    }

    public CreatePermissionSetResponse withPermissionSet(Consumer<PermissionSetDto> permissionSetSetter) {
        if (this.permissionSet == null) {
            this.permissionSet = new PermissionSetDto();
            permissionSetSetter.accept(this.permissionSet);
        }

        return this;
    }

    /**
     * Get permissionSet
     * @return permissionSet
     */
    public PermissionSetDto getPermissionSet() {
        return permissionSet;
    }

    public void setPermissionSet(PermissionSetDto permissionSet) {
        this.permissionSet = permissionSet;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePermissionSetResponse that = (CreatePermissionSetResponse) obj;
        return Objects.equals(this.permissionSet, that.permissionSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSet);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePermissionSetResponse {\n");
        sb.append("    permissionSet: ").append(toIndentedString(permissionSet)).append("\n");
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
