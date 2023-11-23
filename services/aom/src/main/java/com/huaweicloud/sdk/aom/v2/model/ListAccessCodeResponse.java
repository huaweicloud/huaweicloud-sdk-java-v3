package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListAccessCodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_codes")

    private List<AccessCodeModel> accessCodes = null;

    public ListAccessCodeResponse withAccessCodes(List<AccessCodeModel> accessCodes) {
        this.accessCodes = accessCodes;
        return this;
    }

    public ListAccessCodeResponse addAccessCodesItem(AccessCodeModel accessCodesItem) {
        if (this.accessCodes == null) {
            this.accessCodes = new ArrayList<>();
        }
        this.accessCodes.add(accessCodesItem);
        return this;
    }

    public ListAccessCodeResponse withAccessCodes(Consumer<List<AccessCodeModel>> accessCodesSetter) {
        if (this.accessCodes == null) {
            this.accessCodes = new ArrayList<>();
        }
        accessCodesSetter.accept(this.accessCodes);
        return this;
    }

    /**
     * accessCodes
     * @return accessCodes
     */
    public List<AccessCodeModel> getAccessCodes() {
        return accessCodes;
    }

    public void setAccessCodes(List<AccessCodeModel> accessCodes) {
        this.accessCodes = accessCodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessCodeResponse that = (ListAccessCodeResponse) obj;
        return Objects.equals(this.accessCodes, that.accessCodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessCodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessCodeResponse {\n");
        sb.append("    accessCodes: ").append(toIndentedString(accessCodes)).append("\n");
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
