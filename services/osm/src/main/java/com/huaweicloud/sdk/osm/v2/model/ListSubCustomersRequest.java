package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubCustomersRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_name")

    @JacksonXmlProperty(localName = "sub_customer_name")

    private String subCustomerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_customer_id")

    @JacksonXmlProperty(localName = "sub_customer_id")

    private String subCustomerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")

    @JacksonXmlProperty(localName = "X-Site")

    private Integer xSite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")

    @JacksonXmlProperty(localName = "X-Language")

    private String xLanguage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")

    @JacksonXmlProperty(localName = "X-Time-Zone")

    private String xTimeZone;

    public ListSubCustomersRequest withSubCustomerName(String subCustomerName) {
        this.subCustomerName = subCustomerName;
        return this;
    }

    /**
     * 子用户名称
     * @return subCustomerName
     */
    public String getSubCustomerName() {
        return subCustomerName;
    }

    public void setSubCustomerName(String subCustomerName) {
        this.subCustomerName = subCustomerName;
    }

    public ListSubCustomersRequest withSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
        return this;
    }

    /**
     * 子用户id
     * @return subCustomerId
     */
    public String getSubCustomerId() {
        return subCustomerId;
    }

    public void setSubCustomerId(String subCustomerId) {
        this.subCustomerId = subCustomerId;
    }

    public ListSubCustomersRequest withXSite(Integer xSite) {
        this.xSite = xSite;
        return this;
    }

    /**
     * 对接站点信息。  0（中国站） 1（国际站），不填的话默认为0。
     * minimum: 0
     * maximum: 1
     * @return xSite
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Site")
    public Integer getXSite() {
        return xSite;
    }

    public void setXSite(Integer xSite) {
        this.xSite = xSite;
    }

    public ListSubCustomersRequest withXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
        return this;
    }

    /**
     * 语言环境，值为通用的语言描述字符串，比如zh-cn等，默认为zh-cn。  会根据语言环境对应展示一些国际化的信息，比如工单类型名称等。
     * @return xLanguage
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Language")
    public String getXLanguage() {
        return xLanguage;
    }

    public void setXLanguage(String xLanguage) {
        this.xLanguage = xLanguage;
    }

    public ListSubCustomersRequest withXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
        return this;
    }

    /**
     * 环境时区，值为通用的时区描述字符串，比如GMT+8等，默认为GMT+8。  涉及时间的数据会根据环境时区处理。
     * @return xTimeZone
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Time-Zone")
    public String getXTimeZone() {
        return xTimeZone;
    }

    public void setXTimeZone(String xTimeZone) {
        this.xTimeZone = xTimeZone;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubCustomersRequest listSubCustomersRequest = (ListSubCustomersRequest) o;
        return Objects.equals(this.subCustomerName, listSubCustomersRequest.subCustomerName)
            && Objects.equals(this.subCustomerId, listSubCustomersRequest.subCustomerId)
            && Objects.equals(this.xSite, listSubCustomersRequest.xSite)
            && Objects.equals(this.xLanguage, listSubCustomersRequest.xLanguage)
            && Objects.equals(this.xTimeZone, listSubCustomersRequest.xTimeZone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subCustomerName, subCustomerId, xSite, xLanguage, xTimeZone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubCustomersRequest {\n");
        sb.append("    subCustomerName: ").append(toIndentedString(subCustomerName)).append("\n");
        sb.append("    subCustomerId: ").append(toIndentedString(subCustomerId)).append("\n");
        sb.append("    xSite: ").append(toIndentedString(xSite)).append("\n");
        sb.append("    xLanguage: ").append(toIndentedString(xLanguage)).append("\n");
        sb.append("    xTimeZone: ").append(toIndentedString(xTimeZone)).append("\n");
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
