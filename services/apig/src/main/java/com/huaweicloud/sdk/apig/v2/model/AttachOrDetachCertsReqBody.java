package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 域名绑定和解绑证书的请求体
 */
public class AttachOrDetachCertsReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_ids")

    private List<String> certificateIds = null;

    public AttachOrDetachCertsReqBody withCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
        return this;
    }

    public AttachOrDetachCertsReqBody addCertificateIdsItem(String certificateIdsItem) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        this.certificateIds.add(certificateIdsItem);
        return this;
    }

    public AttachOrDetachCertsReqBody withCertificateIds(Consumer<List<String>> certificateIdsSetter) {
        if (this.certificateIds == null) {
            this.certificateIds = new ArrayList<>();
        }
        certificateIdsSetter.accept(this.certificateIds);
        return this;
    }

    /**
     * 证书的id集合
     * @return certificateIds
     */
    public List<String> getCertificateIds() {
        return certificateIds;
    }

    public void setCertificateIds(List<String> certificateIds) {
        this.certificateIds = certificateIds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttachOrDetachCertsReqBody attachOrDetachCertsReqBody = (AttachOrDetachCertsReqBody) o;
        return Objects.equals(this.certificateIds, attachOrDetachCertsReqBody.certificateIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachOrDetachCertsReqBody {\n");
        sb.append("    certificateIds: ").append(toIndentedString(certificateIds)).append("\n");
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
