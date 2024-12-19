package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新global-dc-gateway的请求体。
 */
public class UpdateGlobalDcGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway")

    private UpdateGlobalDcGateway globalDcGateway;

    public UpdateGlobalDcGatewayRequestBody withGlobalDcGateway(UpdateGlobalDcGateway globalDcGateway) {
        this.globalDcGateway = globalDcGateway;
        return this;
    }

    public UpdateGlobalDcGatewayRequestBody withGlobalDcGateway(Consumer<UpdateGlobalDcGateway> globalDcGatewaySetter) {
        if (this.globalDcGateway == null) {
            this.globalDcGateway = new UpdateGlobalDcGateway();
            globalDcGatewaySetter.accept(this.globalDcGateway);
        }

        return this;
    }

    /**
     * Get globalDcGateway
     * @return globalDcGateway
     */
    public UpdateGlobalDcGateway getGlobalDcGateway() {
        return globalDcGateway;
    }

    public void setGlobalDcGateway(UpdateGlobalDcGateway globalDcGateway) {
        this.globalDcGateway = globalDcGateway;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateGlobalDcGatewayRequestBody that = (UpdateGlobalDcGatewayRequestBody) obj;
        return Objects.equals(this.globalDcGateway, that.globalDcGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(globalDcGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGlobalDcGatewayRequestBody {\n");
        sb.append("    globalDcGateway: ").append(toIndentedString(globalDcGateway)).append("\n");
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
