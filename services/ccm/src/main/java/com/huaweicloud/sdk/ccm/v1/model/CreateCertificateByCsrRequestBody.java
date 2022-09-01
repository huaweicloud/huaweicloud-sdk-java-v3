package com.huaweicloud.sdk.ccm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateCertificateByCsrRequestBody
 */
public class CreateCertificateByCsrRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issuer_id")

    @JacksonXmlProperty(localName = "issuer_id")

    private String issuerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "csr")

    @JacksonXmlProperty(localName = "csr")

    private String csr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity")

    @JacksonXmlProperty(localName = "validity")

    private Validity validity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path_length")

    @JacksonXmlProperty(localName = "path_length")

    private Integer pathLength;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_alternative_names")

    @JacksonXmlProperty(localName = "subject_alternative_names")

    private List<SubjectAlternativeName> subjectAlternativeNames = null;

    public CreateCertificateByCsrRequestBody withIssuerId(String issuerId) {
        this.issuerId = issuerId;
        return this;
    }

    /**
     * 父CA证书ID。
     * @return issuerId
     */
    public String getIssuerId() {
        return issuerId;
    }

    public void setIssuerId(String issuerId) {
        this.issuerId = issuerId;
    }

    public CreateCertificateByCsrRequestBody withCsr(String csr) {
        this.csr = csr;
        return this;
    }

    /**
     * 证书签名请求。请使用“\\r\\n”或“\\n”替代证书签名请求中的换行符，若通过console端请求此接口，则无需做符号转换。
     * @return csr
     */
    public String getCsr() {
        return csr;
    }

    public void setCsr(String csr) {
        this.csr = csr;
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

    /**
     * Get validity
     * @return validity
     */
    public Validity getValidity() {
        return validity;
    }

    public void setValidity(Validity validity) {
        this.validity = validity;
    }

    public CreateCertificateByCsrRequestBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型，用于区分从属CA与私有证书。   - **ENTITY_CERT** : 签发私有证书，为缺省值；   - **INTERMEDIATE_CA** : 签发从属CA。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CreateCertificateByCsrRequestBody withPathLength(Integer pathLength) {
        this.pathLength = pathLength;
        return this;
    }

    /**
     * 路径长度，仅当签发从属CA时有效。
     * minimum: 0
     * maximum: 6
     * @return pathLength
     */
    public Integer getPathLength() {
        return pathLength;
    }

    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
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

    /**
     * 主体备用名称(本接口预留参数，当前在后端被忽略)，详情请参见**SubjectAlternativeName**字段数据结构说明。
     * @return subjectAlternativeNames
     */
    public List<SubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    public void setSubjectAlternativeNames(List<SubjectAlternativeName> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
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
        return Objects.equals(this.issuerId, createCertificateByCsrRequestBody.issuerId)
            && Objects.equals(this.csr, createCertificateByCsrRequestBody.csr)
            && Objects.equals(this.validity, createCertificateByCsrRequestBody.validity)
            && Objects.equals(this.type, createCertificateByCsrRequestBody.type)
            && Objects.equals(this.pathLength, createCertificateByCsrRequestBody.pathLength)
            && Objects.equals(this.subjectAlternativeNames, createCertificateByCsrRequestBody.subjectAlternativeNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issuerId, csr, validity, type, pathLength, subjectAlternativeNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCertificateByCsrRequestBody {\n");
        sb.append("    issuerId: ").append(toIndentedString(issuerId)).append("\n");
        sb.append("    csr: ").append(toIndentedString(csr)).append("\n");
        sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    pathLength: ").append(toIndentedString(pathLength)).append("\n");
        sb.append("    subjectAlternativeNames: ").append(toIndentedString(subjectAlternativeNames)).append("\n");
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
