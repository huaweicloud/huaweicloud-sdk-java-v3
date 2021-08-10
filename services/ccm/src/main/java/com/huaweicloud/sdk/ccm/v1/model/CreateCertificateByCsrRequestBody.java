package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** CreateCertificateByCsrRequestBody */
public class CreateCertificateByCsrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csr")

    private String csr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_alternative_names")

    private List<SubjectAlternativeName> subjectAlternativeNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    private Validity validity;

    public CreateCertificateByCsrRequestBody withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /** 证书签名请求
     * 
     * @return csr */
    public String getCsr() {
        return csr;
    }

    public void setCsr(String csr) {
        this.csr = csr;
    }

    public CreateCertificateByCsrRequestBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /** 签发CA ID
     * 
     * @return issuerId */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public CreateCertificateByCsrRequestBody withSubjectAlternativeNames(
        List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    public CreateCertificateByCsrRequestBody addSubjectAlternativeNamesItem(
        SubjectAlternativeName subjectAlternativeNamesItem) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        this.subjectAlternativeNames.add(subjectAlternativeNamesItem);
        return this;
    }

    public CreateCertificateByCsrRequestBody withSubjectAlternativeNames(
        Consumer<List<SubjectAlternativeName>> subjectAlternativeNamesSetter) {
        if (this.subjectAlternativeNames == null) {
            this.subjectAlternativeNames = new ArrayList<>();
        }
        subjectAlternativeNamesSetter.accept(this.subjectAlternativeNames);
        return this;
    }

    /** 主题备用名称
     * 
     * @return subjectAlternativeNames */
    public List<SubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
    }

    public CreateCertificateByCsrRequestBody withValidity(Validity validity) {
        this.validity = validity;
        return this;
    }

    public CreateCertificateByCsrRequestBody withValidity(Consumer<Validity> validitySetter) {
        if (this.validity == null) {
            this.validity = new Validity();
            validitySetter.accept(this.validity);
        }

        return this;
    }

    /** Get validity
     * 
     * @return validity */
    public Validity getValidity() {
        return validity;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCertificateByCsrRequestBody createCertificateByCsrRequestBody = (CreateCertificateByCsrRequestBody) o;
        return Objects.equals(this.csr, createCertificateByCsrRequestBody.csr)
            && Objects.equals(this.issuerId, createCertificateByCsrRequestBody.issuerId)
            && Objects.equals(this.subjectAlternativeNames, createCertificateByCsrRequestBody.subjectAlternativeNames)
            && Objects.equals(this.validity, createCertificateByCsrRequestBody.validity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(csr, issuerId, subjectAlternativeNames, validity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateByCsrRequestBody {\n");
        sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
