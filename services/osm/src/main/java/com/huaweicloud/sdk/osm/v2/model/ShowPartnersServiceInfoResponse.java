package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPartnersServiceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partners_service_info")

    private PartnersServiceInfo partnersServiceInfo;

    public ShowPartnersServiceInfoResponse withPartnersServiceInfo(PartnersServiceInfo partnersServiceInfo) {
        this.partnersServiceInfo = partnersServiceInfo;
        return this;
    }

    public ShowPartnersServiceInfoResponse withPartnersServiceInfo(
        Consumer<PartnersServiceInfo> partnersServiceInfoSetter) {
        if (this.partnersServiceInfo == null) {
            this.partnersServiceInfo = new PartnersServiceInfo();
            partnersServiceInfoSetter.accept(this.partnersServiceInfo);
        }

        return this;
    }

    /**
     * Get partnersServiceInfo
     * @return partnersServiceInfo
     */
    public PartnersServiceInfo getPartnersServiceInfo() {
        return partnersServiceInfo;
    }

    public void setPartnersServiceInfo(PartnersServiceInfo partnersServiceInfo) {
        this.partnersServiceInfo = partnersServiceInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPartnersServiceInfoResponse showPartnersServiceInfoResponse = (ShowPartnersServiceInfoResponse) o;
        return Objects.equals(this.partnersServiceInfo, showPartnersServiceInfoResponse.partnersServiceInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partnersServiceInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPartnersServiceInfoResponse {\n");
        sb.append("    partnersServiceInfo: ").append(toIndentedString(partnersServiceInfo)).append("\n");
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
