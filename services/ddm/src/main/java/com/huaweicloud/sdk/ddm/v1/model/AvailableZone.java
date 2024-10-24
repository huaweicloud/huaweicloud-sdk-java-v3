package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AvailableZone
 */
public class AvailableZone {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_ipv6")

    private Boolean supportIpv6;

    public AvailableZone withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * 可用区CODE
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public AvailableZone withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 可用区描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AvailableZone withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 可用区状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AvailableZone withSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
        return this;
    }

    /**
     * 是否支持IPV6
     * @return supportIpv6
     */
    public Boolean getSupportIpv6() {
        return supportIpv6;
    }

    public void setSupportIpv6(Boolean supportIpv6) {
        this.supportIpv6 = supportIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AvailableZone that = (AvailableZone) obj;
        return Objects.equals(this.code, that.code) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.supportIpv6, that.supportIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, description, status, supportIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvailableZone {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    supportIpv6: ").append(toIndentedString(supportIpv6)).append("\n");
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
