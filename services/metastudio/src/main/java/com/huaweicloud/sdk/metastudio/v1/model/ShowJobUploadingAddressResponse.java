package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobUploadingAddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_url")

    private ShowJobUploadingAddressRspSegmentUrl segmentUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package_url")

    private ShowJobUploadingAddressRspPackageUrl packageUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_letter_uploading_url")

    private String authorizationLetterUploadingUrl;

    public ShowJobUploadingAddressResponse withSegmentUrl(ShowJobUploadingAddressRspSegmentUrl segmentUrl) {
        this.segmentUrl = segmentUrl;
        return this;
    }

    public ShowJobUploadingAddressResponse withSegmentUrl(
        Consumer<ShowJobUploadingAddressRspSegmentUrl> segmentUrlSetter) {
        if (this.segmentUrl == null) {
            this.segmentUrl = new ShowJobUploadingAddressRspSegmentUrl();
            segmentUrlSetter.accept(this.segmentUrl);
        }

        return this;
    }

    /**
     * Get segmentUrl
     * @return segmentUrl
     */
    public ShowJobUploadingAddressRspSegmentUrl getSegmentUrl() {
        return segmentUrl;
    }

    public void setSegmentUrl(ShowJobUploadingAddressRspSegmentUrl segmentUrl) {
        this.segmentUrl = segmentUrl;
    }

    public ShowJobUploadingAddressResponse withPackageUrl(ShowJobUploadingAddressRspPackageUrl packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    public ShowJobUploadingAddressResponse withPackageUrl(
        Consumer<ShowJobUploadingAddressRspPackageUrl> packageUrlSetter) {
        if (this.packageUrl == null) {
            this.packageUrl = new ShowJobUploadingAddressRspPackageUrl();
            packageUrlSetter.accept(this.packageUrl);
        }

        return this;
    }

    /**
     * Get packageUrl
     * @return packageUrl
     */
    public ShowJobUploadingAddressRspPackageUrl getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(ShowJobUploadingAddressRspPackageUrl packageUrl) {
        this.packageUrl = packageUrl;
    }

    public ShowJobUploadingAddressResponse withAuthorizationLetterUploadingUrl(String authorizationLetterUploadingUrl) {
        this.authorizationLetterUploadingUrl = authorizationLetterUploadingUrl;
        return this;
    }

    /**
     * 授权书的上传地址。
     * @return authorizationLetterUploadingUrl
     */
    public String getAuthorizationLetterUploadingUrl() {
        return authorizationLetterUploadingUrl;
    }

    public void setAuthorizationLetterUploadingUrl(String authorizationLetterUploadingUrl) {
        this.authorizationLetterUploadingUrl = authorizationLetterUploadingUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobUploadingAddressResponse that = (ShowJobUploadingAddressResponse) obj;
        return Objects.equals(this.segmentUrl, that.segmentUrl) && Objects.equals(this.packageUrl, that.packageUrl)
            && Objects.equals(this.authorizationLetterUploadingUrl, that.authorizationLetterUploadingUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segmentUrl, packageUrl, authorizationLetterUploadingUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobUploadingAddressResponse {\n");
        sb.append("    segmentUrl: ").append(toIndentedString(segmentUrl)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    authorizationLetterUploadingUrl: ")
            .append(toIndentedString(authorizationLetterUploadingUrl))
            .append("\n");
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
