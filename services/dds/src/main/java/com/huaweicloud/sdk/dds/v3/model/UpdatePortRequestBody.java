package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * UpdatePortRequestBody
 */
public class UpdatePortRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    @JacksonXmlProperty(localName = "port")

    private Integer port;

    public UpdatePortRequestBody withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 新端口号。端口号有效范围为2100~9500，27017，27018，27019。
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdatePortRequestBody updatePortRequestBody = (UpdatePortRequestBody) o;
        return Objects.equals(this.port, updatePortRequestBody.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePortRequestBody {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
