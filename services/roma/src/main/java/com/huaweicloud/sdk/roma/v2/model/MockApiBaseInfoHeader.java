package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * MockApiBaseInfoHeader
 */
public class MockApiBaseInfoHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    @JacksonXmlProperty(localName = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    @JacksonXmlProperty(localName = "value")

    private String value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remark")

    @JacksonXmlProperty(localName = "remark")

    private String remark;

    public MockApiBaseInfoHeader withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * mock后端自定义响应头header key
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public MockApiBaseInfoHeader withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * mock后端自定义响应头header value
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public MockApiBaseInfoHeader withRemark(String remark) {
        this.remark = remark;
        return this;
    }

    /**
     * mock后端自定义响应头header remark
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MockApiBaseInfoHeader mockApiBaseInfoHeader = (MockApiBaseInfoHeader) o;
        return Objects.equals(this.key, mockApiBaseInfoHeader.key)
            && Objects.equals(this.value, mockApiBaseInfoHeader.value)
            && Objects.equals(this.remark, mockApiBaseInfoHeader.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, remark);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MockApiBaseInfoHeader {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    remark: ").append(toIndentedString(remark)).append("\n");
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
