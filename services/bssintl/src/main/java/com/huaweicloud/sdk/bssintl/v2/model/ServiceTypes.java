package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ServiceTypes
 */
public class ServiceTypes {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_name")

    @JacksonXmlProperty(localName = "service_type_name")

    private String serviceTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_type_code")

    @JacksonXmlProperty(localName = "service_type_code")

    private String serviceTypeCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abbreviation")

    @JacksonXmlProperty(localName = "abbreviation")

    private String abbreviation;

    public ServiceTypes withServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
        return this;
    }

    /**
     * 云服务类型的名称。
     * @return serviceTypeName
     */
    public String getServiceTypeName() {
        return serviceTypeName;
    }

    public void setServiceTypeName(String serviceTypeName) {
        this.serviceTypeName = serviceTypeName;
    }

    public ServiceTypes withServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
        return this;
    }

    /**
     * 云服务类型的编码。
     * @return serviceTypeCode
     */
    public String getServiceTypeCode() {
        return serviceTypeCode;
    }

    public void setServiceTypeCode(String serviceTypeCode) {
        this.serviceTypeCode = serviceTypeCode;
    }

    public ServiceTypes withAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        return this;
    }

    /**
     * 云服务类型的缩写。
     * @return abbreviation
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceTypes serviceTypes = (ServiceTypes) o;
        return Objects.equals(this.serviceTypeName, serviceTypes.serviceTypeName)
            && Objects.equals(this.serviceTypeCode, serviceTypes.serviceTypeCode)
            && Objects.equals(this.abbreviation, serviceTypes.abbreviation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceTypeName, serviceTypeCode, abbreviation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceTypes {\n");
        sb.append("    serviceTypeName: ").append(toIndentedString(serviceTypeName)).append("\n");
        sb.append("    serviceTypeCode: ").append(toIndentedString(serviceTypeCode)).append("\n");
        sb.append("    abbreviation: ").append(toIndentedString(abbreviation)).append("\n");
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
