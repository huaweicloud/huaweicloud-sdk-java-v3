package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * EnterprisePersonNew
 */
public class EnterprisePersonNew {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legel_name")

    @JacksonXmlProperty(localName = "legel_name")

    private String legelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legel_id_number")

    @JacksonXmlProperty(localName = "legel_id_number")

    private String legelIdNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certifier_role")

    @JacksonXmlProperty(localName = "certifier_role")

    private String certifierRole;

    public EnterprisePersonNew withLegelName(String legelName) {
        this.legelName = legelName;
        return this;
    }

    /**
     * 法人姓名。
     * @return legelName
     */
    public String getLegelName() {
        return legelName;
    }

    public void setLegelName(String legelName) {
        this.legelName = legelName;
    }

    public EnterprisePersonNew withLegelIdNumber(String legelIdNumber) {
        this.legelIdNumber = legelIdNumber;
        return this;
    }

    /**
     * 法人身份证号。
     * @return legelIdNumber
     */
    public String getLegelIdNumber() {
        return legelIdNumber;
    }

    public void setLegelIdNumber(String legelIdNumber) {
        this.legelIdNumber = legelIdNumber;
    }

    public EnterprisePersonNew withCertifierRole(String certifierRole) {
        this.certifierRole = certifierRole;
        return this;
    }

    /**
     * 认证人角色。 legalPerson ：法人代表。
     * @return certifierRole
     */
    public String getCertifierRole() {
        return certifierRole;
    }

    public void setCertifierRole(String certifierRole) {
        this.certifierRole = certifierRole;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnterprisePersonNew enterprisePersonNew = (EnterprisePersonNew) o;
        return Objects.equals(this.legelName, enterprisePersonNew.legelName)
            && Objects.equals(this.legelIdNumber, enterprisePersonNew.legelIdNumber)
            && Objects.equals(this.certifierRole, enterprisePersonNew.certifierRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(legelName, legelIdNumber, certifierRole);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnterprisePersonNew {\n");
        sb.append("    legelName: ").append(toIndentedString(legelName)).append("\n");
        sb.append("    legelIdNumber: ").append(toIndentedString(legelIdNumber)).append("\n");
        sb.append("    certifierRole: ").append(toIndentedString(certifierRole)).append("\n");
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
