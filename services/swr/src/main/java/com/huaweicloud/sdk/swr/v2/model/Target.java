package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Target
 */
public class Target {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address")

    private String address;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_header")

    private String authHeader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skip_cert_verify")

    private Boolean skipCertVerify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "address_type")

    private String addressType;

    public Target withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 触发器类型，可选http
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Target withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * 触发地址，不可修改
     * @return address
     */
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Target withAuthHeader(String authHeader) {
        this.authHeader = authHeader;
        return this;
    }

    /**
     * 请求头，格式为key1:value1;key2:value2
     * @return authHeader
     */
    public String getAuthHeader() {
        return authHeader;
    }

    public void setAuthHeader(String authHeader) {
        this.authHeader = authHeader;
    }

    public Target withSkipCertVerify(Boolean skipCertVerify) {
        this.skipCertVerify = skipCertVerify;
        return this;
    }

    /**
     * 是否跳过证书认证
     * @return skipCertVerify
     */
    public Boolean getSkipCertVerify() {
        return skipCertVerify;
    }

    public void setSkipCertVerify(Boolean skipCertVerify) {
        this.skipCertVerify = skipCertVerify;
    }

    public Target withAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }

    /**
     * 触发地址类型，可选internal(内网)，internet(公网)。internal必须为内网ip形式。
     * @return addressType
     */
    public String getAddressType() {
        return addressType;
    }

    public void setAddressType(String addressType) {
        this.addressType = addressType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Target that = (Target) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.address, that.address)
            && Objects.equals(this.authHeader, that.authHeader)
            && Objects.equals(this.skipCertVerify, that.skipCertVerify)
            && Objects.equals(this.addressType, that.addressType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, authHeader, skipCertVerify, addressType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Target {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    authHeader: ").append(toIndentedString(authHeader)).append("\n");
        sb.append("    skipCertVerify: ").append(toIndentedString(skipCertVerify)).append("\n");
        sb.append("    addressType: ").append(toIndentedString(addressType)).append("\n");
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
