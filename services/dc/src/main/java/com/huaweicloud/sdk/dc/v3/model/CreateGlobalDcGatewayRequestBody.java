package com.huaweicloud.sdk.dc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 全球接入网关响应体
 */
public class CreateGlobalDcGatewayRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dry_run")

    private Boolean dryRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "global_dc_gateway")

    private CreateGlobalDcGatewayRequestBodyGlobalDcGateway globalDcGateway;

    public CreateGlobalDcGatewayRequestBody withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * 空运行 - true 是 - false 否
     * @return dryRun
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    public CreateGlobalDcGatewayRequestBody withGlobalDcGateway(
        CreateGlobalDcGatewayRequestBodyGlobalDcGateway globalDcGateway) {
        this.globalDcGateway = globalDcGateway;
        return this;
    }

    public CreateGlobalDcGatewayRequestBody withGlobalDcGateway(
        Consumer<CreateGlobalDcGatewayRequestBodyGlobalDcGateway> globalDcGatewaySetter) {
        if (this.globalDcGateway == null) {
            this.globalDcGateway = new CreateGlobalDcGatewayRequestBodyGlobalDcGateway();
            globalDcGatewaySetter.accept(this.globalDcGateway);
        }

        return this;
    }

    /**
     * Get globalDcGateway
     * @return globalDcGateway
     */
    public CreateGlobalDcGatewayRequestBodyGlobalDcGateway getGlobalDcGateway() {
        return globalDcGateway;
    }

    public void setGlobalDcGateway(CreateGlobalDcGatewayRequestBodyGlobalDcGateway globalDcGateway) {
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
        CreateGlobalDcGatewayRequestBody that = (CreateGlobalDcGatewayRequestBody) obj;
        return Objects.equals(this.dryRun, that.dryRun) && Objects.equals(this.globalDcGateway, that.globalDcGateway);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dryRun, globalDcGateway);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateGlobalDcGatewayRequestBody {\n");
        sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
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
