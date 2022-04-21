package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ORACLE集群地址
 */
public class MultiOracleAddress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oracle_address")

    private String oracleAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oracle_port")

    private String oraclePort;

    public MultiOracleAddress withOracleAddress(String oracleAddress) {
        this.oracleAddress = oracleAddress;
        return this;
    }

    /**
     * ORACLE地址
     * @return oracleAddress
     */
    public String getOracleAddress() {
        return oracleAddress;
    }

    public void setOracleAddress(String oracleAddress) {
        this.oracleAddress = oracleAddress;
    }

    public MultiOracleAddress withOraclePort(String oraclePort) {
        this.oraclePort = oraclePort;
        return this;
    }

    /**
     * ORACLE端口
     * @return oraclePort
     */
    public String getOraclePort() {
        return oraclePort;
    }

    public void setOraclePort(String oraclePort) {
        this.oraclePort = oraclePort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MultiOracleAddress multiOracleAddress = (MultiOracleAddress) o;
        return Objects.equals(this.oracleAddress, multiOracleAddress.oracleAddress)
            && Objects.equals(this.oraclePort, multiOracleAddress.oraclePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oracleAddress, oraclePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiOracleAddress {\n");
        sb.append("    oracleAddress: ").append(toIndentedString(oracleAddress)).append("\n");
        sb.append("    oraclePort: ").append(toIndentedString(oraclePort)).append("\n");
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
