package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 请求成功返回的数据。
 */
public class RegisterResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_type")

    private Integer portType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sign")

    private List<String> sign = null;

    public RegisterResult withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 通道号。 
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public RegisterResult withPortType(Integer portType) {
        this.portType = portType;
        return this;
    }

    /**
     * 通道号类型。 - 1：普通 - 3：前缀号段 - 5：后缀号段 
     * @return portType
     */
    public Integer getPortType() {
        return portType;
    }

    public void setPortType(Integer portType) {
        this.portType = portType;
    }

    public RegisterResult withSign(List<String> sign) {
        this.sign = sign;
        return this;
    }

    public RegisterResult addSignItem(String signItem) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        this.sign.add(signItem);
        return this;
    }

    public RegisterResult withSign(Consumer<List<String>> signSetter) {
        if (this.sign == null) {
            this.sign = new ArrayList<>();
        }
        signSetter.accept(this.sign);
        return this;
    }

    /**
     * 签名列表，最大长度为5。
     * @return sign
     */
    public List<String> getSign() {
        return sign;
    }

    public void setSign(List<String> sign) {
        this.sign = sign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterResult that = (RegisterResult) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.portType, that.portType)
            && Objects.equals(this.sign, that.sign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, portType, sign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterResult {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    portType: ").append(toIndentedString(portType)).append("\n");
        sb.append("    sign: ").append(toIndentedString(sign)).append("\n");
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
