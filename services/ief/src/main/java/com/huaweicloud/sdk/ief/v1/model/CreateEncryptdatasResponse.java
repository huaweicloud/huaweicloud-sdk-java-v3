package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateEncryptdatasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encrypt_data")

    private EncryptData encryptData;

    public CreateEncryptdatasResponse withEncryptData(EncryptData encryptData) {
        this.encryptData = encryptData;
        return this;
    }

    public CreateEncryptdatasResponse withEncryptData(Consumer<EncryptData> encryptDataSetter) {
        if (this.encryptData == null) {
            this.encryptData = new EncryptData();
            encryptDataSetter.accept(this.encryptData);
        }

        return this;
    }

    /**
     * Get encryptData
     * @return encryptData
     */
    public EncryptData getEncryptData() {
        return encryptData;
    }

    public void setEncryptData(EncryptData encryptData) {
        this.encryptData = encryptData;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateEncryptdatasResponse that = (CreateEncryptdatasResponse) obj;
        return Objects.equals(this.encryptData, that.encryptData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEncryptdatasResponse {\n");
        sb.append("    encryptData: ").append(toIndentedString(encryptData)).append("\n");
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
