package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新托管专线对象参数
 */
public class UpdateHostedDirectConnectRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hosted_connect")

    private UpdateHostedDirectConnect hostedConnect;

    public UpdateHostedDirectConnectRequestBody withHostedConnect(UpdateHostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
        return this;
    }

    public UpdateHostedDirectConnectRequestBody withHostedConnect(
        Consumer<UpdateHostedDirectConnect> hostedConnectSetter) {
        if (this.hostedConnect == null) {
            this.hostedConnect = new UpdateHostedDirectConnect();
            hostedConnectSetter.accept(this.hostedConnect);
        }

        return this;
    }

    /**
     * Get hostedConnect
     * @return hostedConnect
     */
    public UpdateHostedDirectConnect getHostedConnect() {
        return hostedConnect;
    }

    public void setHostedConnect(UpdateHostedDirectConnect hostedConnect) {
        this.hostedConnect = hostedConnect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateHostedDirectConnectRequestBody that = (UpdateHostedDirectConnectRequestBody) obj;
        return Objects.equals(this.hostedConnect, that.hostedConnect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostedConnect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHostedDirectConnectRequestBody {\n");
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
