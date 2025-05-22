package com.huaweicloud.sdk.csms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateSecretsConfigRequestBody
 */
public class UpdateSecretsConfigRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checking_secret_strength")

    private Boolean checkingSecretStrength;

    public UpdateSecretsConfigRequestBody withCheckingSecretStrength(Boolean checkingSecretStrength) {
        this.checkingSecretStrength = checkingSecretStrength;
        return this;
    }

    /**
     * 凭据强度检测配置是否打开。
     * @return checkingSecretStrength
     */
    public Boolean getCheckingSecretStrength() {
        return checkingSecretStrength;
    }

    public void setCheckingSecretStrength(Boolean checkingSecretStrength) {
        this.checkingSecretStrength = checkingSecretStrength;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSecretsConfigRequestBody that = (UpdateSecretsConfigRequestBody) obj;
        return Objects.equals(this.checkingSecretStrength, that.checkingSecretStrength);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkingSecretStrength);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecretsConfigRequestBody {\n");
        sb.append("    checkingSecretStrength: ").append(toIndentedString(checkingSecretStrength)).append("\n");
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
