package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateConfTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private TokenInfo data;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addressToken")

    private String addressToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gloablPublicIP")

    private String gloablPublicIP;

    public CreateConfTokenResponse withData(TokenInfo data) {
        this.data = data;
        return this;
    }

    public CreateConfTokenResponse withData(Consumer<TokenInfo> dataSetter) {
        if (this.data == null) {
            this.data = new TokenInfo();
            dataSetter.accept(this.data);
        }

        return this;
    }

    /** Get data
     * 
     * @return data */
    public TokenInfo getData() {
        return data;
    }

    public void setData(TokenInfo data) {
        this.data = data;
    }

    public CreateConfTokenResponse withAddressToken(String addressToken) {
        this.addressToken = addressToken;
        return this;
    }

    /** 地址本查询临时Token。
     * 
     * @return addressToken */
    public String getAddressToken() {
        return addressToken;
    }

    public void setAddressToken(String addressToken) {
        this.addressToken = addressToken;
    }

    public CreateConfTokenResponse withGloablPublicIP(String gloablPublicIP) {
        this.gloablPublicIP = gloablPublicIP;
        return this;
    }

    /** global外网IP。
     * 
     * @return gloablPublicIP */
    public String getGloablPublicIP() {
        return gloablPublicIP;
    }

    public void setGloablPublicIP(String gloablPublicIP) {
        this.gloablPublicIP = gloablPublicIP;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateConfTokenResponse createConfTokenResponse = (CreateConfTokenResponse) o;
        return Objects.equals(this.data, createConfTokenResponse.data)
            && Objects.equals(this.addressToken, createConfTokenResponse.addressToken)
            && Objects.equals(this.gloablPublicIP, createConfTokenResponse.gloablPublicIP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, addressToken, gloablPublicIP);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateConfTokenResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    addressToken: ").append(toIndentedString(addressToken)).append("\n");
        sb.append("    gloablPublicIP: ").append(toIndentedString(gloablPublicIP)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
