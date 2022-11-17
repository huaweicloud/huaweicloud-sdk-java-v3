package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建托管专线对象信息
 */
public class CreateHostedDirectConnectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect")

    private CreateHostedDirectConnect hostedConnect;

    public CreateHostedDirectConnectRequestBody withHostedConnect(CreateHostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
        return this;
    }

    public CreateHostedDirectConnectRequestBody withHostedConnect(
        Consumer<CreateHostedDirectConnect> hostedConnectSetter) {
        if (this.hostedConnect == null) {
            this.hostedConnect = new CreateHostedDirectConnect();
            hostedConnectSetter.accept(this.hostedConnect);
        }

        return this;
    }

    /**
     * Get hostedConnect
     * @return hostedConnect
     */
    public CreateHostedDirectConnect getHostedConnect() {
        return hostedConnect;
    }

    public void setHostedConnect(CreateHostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateHostedDirectConnectRequestBody createHostedDirectConnectRequestBody =
            (CreateHostedDirectConnectRequestBody) o;
        return Objects.equals(this.hostedConnect, createHostedDirectConnectRequestBody.hostedConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateHostedDirectConnectRequestBody {\n");
        sb.append("    hostedConnect: ").append(toIndentedString(hostedConnect)).append("\n");
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
