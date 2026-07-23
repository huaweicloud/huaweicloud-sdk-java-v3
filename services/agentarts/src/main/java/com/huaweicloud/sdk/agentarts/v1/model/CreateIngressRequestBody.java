package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 创建Ingress请求体。 
 */
public class CreateIngressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_public_network")

    private Boolean enablePublicNetwork;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc")

    private CoreIngressVpcConfig vpc;

    public CreateIngressRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： Ingress名称，同一账号下名称不可重复。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateIngressRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： Ingress描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateIngressRequestBody withEnablePublicNetwork(Boolean enablePublicNetwork) {
        this.enablePublicNetwork = enablePublicNetwork;
        return this;
    }

    /**
     * **参数解释**： 是否启用公网访问。
     * @return enablePublicNetwork
     */
    public Boolean getEnablePublicNetwork() {
        return enablePublicNetwork;
    }

    public void setEnablePublicNetwork(Boolean enablePublicNetwork) {
        this.enablePublicNetwork = enablePublicNetwork;
    }

    public CreateIngressRequestBody withVpc(CoreIngressVpcConfig vpc) {
        this.vpc = vpc;
        return this;
    }

    public CreateIngressRequestBody withVpc(Consumer<CoreIngressVpcConfig> vpcSetter) {
        if (this.vpc == null) {
            this.vpc = new CoreIngressVpcConfig();
            vpcSetter.accept(this.vpc);
        }

        return this;
    }

    /**
     * Get vpc
     * @return vpc
     */
    public CoreIngressVpcConfig getVpc() {
        return vpc;
    }

    public void setVpc(CoreIngressVpcConfig vpc) {
        this.vpc = vpc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateIngressRequestBody that = (CreateIngressRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enablePublicNetwork, that.enablePublicNetwork) && Objects.equals(this.vpc, that.vpc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, enablePublicNetwork, vpc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateIngressRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enablePublicNetwork: ").append(toIndentedString(enablePublicNetwork)).append("\n");
        sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
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
