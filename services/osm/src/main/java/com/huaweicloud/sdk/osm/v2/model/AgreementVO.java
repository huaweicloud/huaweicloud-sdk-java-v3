package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AgreementVO
 */
public class AgreementVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_name")

    private String agreementName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_type")

    private String agreementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agreement_type_name")

    private String agreementTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "content")

    private String content;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    public AgreementVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 协议id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public AgreementVO withAgreementName(String agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    /**
     * 协议名称
     * @return agreementName
     */
    public String getAgreementName() {
        return agreementName;
    }

    public void setAgreementName(String agreementName) {
        this.agreementName = agreementName;
    }

    public AgreementVO withAgreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * 协议类型
     * @return agreementType
     */
    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public AgreementVO withAgreementTypeName(String agreementTypeName) {
        this.agreementTypeName = agreementTypeName;
        return this;
    }

    /**
     * 协议类型名称
     * @return agreementTypeName
     */
    public String getAgreementTypeName() {
        return agreementTypeName;
    }

    public void setAgreementTypeName(String agreementTypeName) {
        this.agreementTypeName = agreementTypeName;
    }

    public AgreementVO withContent(String content) {
        this.content = content;
        return this;
    }

    /**
     * 内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public AgreementVO withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * minimum: 0
     * maximum: 2147483647
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgreementVO that = (AgreementVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.agreementName, that.agreementName)
            && Objects.equals(this.agreementType, that.agreementType)
            && Objects.equals(this.agreementTypeName, that.agreementTypeName)
            && Objects.equals(this.content, that.content) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, agreementName, agreementType, agreementTypeName, content, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgreementVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    agreementName: ").append(toIndentedString(agreementName)).append("\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    agreementTypeName: ").append(toIndentedString(agreementTypeName)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
