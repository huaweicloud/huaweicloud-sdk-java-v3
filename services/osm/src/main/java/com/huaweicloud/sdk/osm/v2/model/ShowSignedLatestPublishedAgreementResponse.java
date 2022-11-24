package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSignedLatestPublishedAgreementResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_signed_latest")

    private Boolean isSignedLatest;

    public ShowSignedLatestPublishedAgreementResponse withIsSignedLatest(Boolean isSignedLatest) {
        this.isSignedLatest = isSignedLatest;
        return this;
    }

    /**
     * 是否签署
     * @return isSignedLatest
     */
    public Boolean getIsSignedLatest() {
        return isSignedLatest;
    }

    public void setIsSignedLatest(Boolean isSignedLatest) {
        this.isSignedLatest = isSignedLatest;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowSignedLatestPublishedAgreementResponse showSignedLatestPublishedAgreementResponse =
            (ShowSignedLatestPublishedAgreementResponse) o;
        return Objects.equals(this.isSignedLatest, showSignedLatestPublishedAgreementResponse.isSignedLatest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isSignedLatest);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSignedLatestPublishedAgreementResponse {\n");
        sb.append("    isSignedLatest: ").append(toIndentedString(isSignedLatest)).append("\n");
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
