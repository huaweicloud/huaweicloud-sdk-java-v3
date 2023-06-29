package com.huaweicloud.sdk.rds.v3.model;

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
public class ListSslCertDownloadLinkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_info_list")

    private List<DownloadInfoRsp> certInfoList = null;

    public ListSslCertDownloadLinkResponse withCertInfoList(List<DownloadInfoRsp> certInfoList) {
        this.certInfoList = certInfoList;
        return this;
    }

    public ListSslCertDownloadLinkResponse addCertInfoListItem(DownloadInfoRsp certInfoListItem) {
        if (this.certInfoList == null) {
            this.certInfoList = new ArrayList<>();
        }
        this.certInfoList.add(certInfoListItem);
        return this;
    }

    public ListSslCertDownloadLinkResponse withCertInfoList(Consumer<List<DownloadInfoRsp>> certInfoListSetter) {
        if (this.certInfoList == null) {
            this.certInfoList = new ArrayList<>();
        }
        certInfoListSetter.accept(this.certInfoList);
        return this;
    }

    /**
     * Get certInfoList
     * @return certInfoList
     */
    public List<DownloadInfoRsp> getCertInfoList() {
        return certInfoList;
    }

    public void setCertInfoList(List<DownloadInfoRsp> certInfoList) {
        this.certInfoList = certInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSslCertDownloadLinkResponse that = (ListSslCertDownloadLinkResponse) obj;
        return Objects.equals(this.certInfoList, that.certInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSslCertDownloadLinkResponse {\n");
        sb.append("    certInfoList: ").append(toIndentedString(certInfoList)).append("\n");
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
