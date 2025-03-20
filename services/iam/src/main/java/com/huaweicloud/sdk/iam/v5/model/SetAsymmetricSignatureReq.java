package com.huaweicloud.sdk.iam.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Set asymmetric signature API request body.
 */
public class SetAsymmetricSignatureReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asymmetric_signature")

    private AsymmetricSignature asymmetricSignature;

    public SetAsymmetricSignatureReq withAsymmetricSignature(AsymmetricSignature asymmetricSignature) {
        this.asymmetricSignature = asymmetricSignature;
        return this;
    }

    public SetAsymmetricSignatureReq withAsymmetricSignature(Consumer<AsymmetricSignature> asymmetricSignatureSetter) {
        if (this.asymmetricSignature == null) {
            this.asymmetricSignature = new AsymmetricSignature();
            asymmetricSignatureSetter.accept(this.asymmetricSignature);
        }

        return this;
    }

    /**
     * Get asymmetricSignature
     * @return asymmetricSignature
     */
    public AsymmetricSignature getAsymmetricSignature() {
        return asymmetricSignature;
    }

    public void setAsymmetricSignature(AsymmetricSignature asymmetricSignature) {
        this.asymmetricSignature = asymmetricSignature;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAsymmetricSignatureReq that = (SetAsymmetricSignatureReq) obj;
        return Objects.equals(this.asymmetricSignature, that.asymmetricSignature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asymmetricSignature);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAsymmetricSignatureReq {\n");
        sb.append("    asymmetricSignature: ").append(toIndentedString(asymmetricSignature)).append("\n");
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
