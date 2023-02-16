package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IntellectualPropertyV2
 */
public class IntellectualPropertyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_type")

    private String ipType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_area")

    private String ipArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_number")

    private String ipNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_content")

    private String ipContent;

    public IntellectualPropertyV2 withIpType(String ipType) {
        this.ipType = ipType;
        return this;
    }

    /**
     * 知识产权类型,分：著作权-copyright、商标权-trademark、专利权-patent
     * @return ipType
     */
    public String getIpType() {
        return ipType;
    }

    public void setIpType(String ipType) {
        this.ipType = ipType;
    }

    public IntellectualPropertyV2 withIpArea(String ipArea) {
        this.ipArea = ipArea;
        return this;
    }

    /**
     * 知识产权注册国家/地区
     * @return ipArea
     */
    public String getIpArea() {
        return ipArea;
    }

    public void setIpArea(String ipArea) {
        this.ipArea = ipArea;
    }

    public IntellectualPropertyV2 withIpNumber(String ipNumber) {
        this.ipNumber = ipNumber;
        return this;
    }

    /**
     * 商标注册号/专利申请号
     * @return ipNumber
     */
    public String getIpNumber() {
        return ipNumber;
    }

    public void setIpNumber(String ipNumber) {
        this.ipNumber = ipNumber;
    }

    public IntellectualPropertyV2 withIpContent(String ipContent) {
        this.ipContent = ipContent;
        return this;
    }

    /**
     * 知识产权情况简述
     * @return ipContent
     */
    public String getIpContent() {
        return ipContent;
    }

    public void setIpContent(String ipContent) {
        this.ipContent = ipContent;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntellectualPropertyV2 intellectualPropertyV2 = (IntellectualPropertyV2) o;
        return Objects.equals(this.ipType, intellectualPropertyV2.ipType)
            && Objects.equals(this.ipArea, intellectualPropertyV2.ipArea)
            && Objects.equals(this.ipNumber, intellectualPropertyV2.ipNumber)
            && Objects.equals(this.ipContent, intellectualPropertyV2.ipContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ipType, ipArea, ipNumber, ipContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IntellectualPropertyV2 {\n");
        sb.append("    ipType: ").append(toIndentedString(ipType)).append("\n");
        sb.append("    ipArea: ").append(toIndentedString(ipArea)).append("\n");
        sb.append("    ipNumber: ").append(toIndentedString(ipNumber)).append("\n");
        sb.append("    ipContent: ").append(toIndentedString(ipContent)).append("\n");
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
