package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPublicipPoolTypesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publicip-pool-types")

    private PublicPoolType publicipPoolTypes;

    public ShowPublicipPoolTypesResponse withPublicipPoolTypes(PublicPoolType publicipPoolTypes) {
        this.publicipPoolTypes = publicipPoolTypes;
        return this;
    }

    public ShowPublicipPoolTypesResponse withPublicipPoolTypes(Consumer<PublicPoolType> publicipPoolTypesSetter) {
        if (this.publicipPoolTypes == null) {
            this.publicipPoolTypes = new PublicPoolType();
            publicipPoolTypesSetter.accept(this.publicipPoolTypes);
        }

        return this;
    }

    /**
     * Get publicipPoolTypes
     * @return publicipPoolTypes
     */
    public PublicPoolType getPublicipPoolTypes() {
        return publicipPoolTypes;
    }

    public void setPublicipPoolTypes(PublicPoolType publicipPoolTypes) {
        this.publicipPoolTypes = publicipPoolTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPublicipPoolTypesResponse that = (ShowPublicipPoolTypesResponse) obj;
        return Objects.equals(this.publicipPoolTypes, that.publicipPoolTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publicipPoolTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPublicipPoolTypesResponse {\n");
        sb.append("    publicipPoolTypes: ").append(toIndentedString(publicipPoolTypes)).append("\n");
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
