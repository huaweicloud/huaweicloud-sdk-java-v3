package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVgwRequestBodyContent
 */
public class UpdateVgwRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_subnets")

    private List<String> localSubnets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id_1")

    private String eipId1;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eip_id_2")

    private String eipId2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_template")

    private UpdateRequestPolicyTemplate policyTemplate;

    public UpdateVgwRequestBodyContent withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 网关名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateVgwRequestBodyContent withLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
        return this;
    }

    public UpdateVgwRequestBodyContent addLocalSubnetsItem(String localSubnetsItem) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        this.localSubnets.add(localSubnetsItem);
        return this;
    }

    public UpdateVgwRequestBodyContent withLocalSubnets(Consumer<List<String>> localSubnetsSetter) {
        if (this.localSubnets == null) {
            this.localSubnets = new ArrayList<>();
        }
        localSubnetsSetter.accept(this.localSubnets);
        return this;
    }

    /**
     * 本端子网
     * @return localSubnets
     */
    public List<String> getLocalSubnets() {
        return localSubnets;
    }

    public void setLocalSubnets(List<String> localSubnets) {
        this.localSubnets = localSubnets;
    }

    public UpdateVgwRequestBodyContent withEipId1(String eipId1) {
        this.eipId1 = eipId1;
        return this;
    }

    /**
     * 主eip的ID。用于给VPN网关绑定新的主EIP，需要先解绑当前的主EIP
     * @return eipId1
     */
    public String getEipId1() {
        return eipId1;
    }

    public void setEipId1(String eipId1) {
        this.eipId1 = eipId1;
    }

    public UpdateVgwRequestBodyContent withEipId2(String eipId2) {
        this.eipId2 = eipId2;
        return this;
    }

    /**
     * 备eip的ID。用于给VPN网关绑定新的备EIP，需要先解绑当前的备EIP
     * @return eipId2
     */
    public String getEipId2() {
        return eipId2;
    }

    public void setEipId2(String eipId2) {
        this.eipId2 = eipId2;
    }

    public UpdateVgwRequestBodyContent withPolicyTemplate(UpdateRequestPolicyTemplate policyTemplate) {
        this.policyTemplate = policyTemplate;
        return this;
    }

    public UpdateVgwRequestBodyContent withPolicyTemplate(Consumer<UpdateRequestPolicyTemplate> policyTemplateSetter) {
        if (this.policyTemplate == null) {
            this.policyTemplate = new UpdateRequestPolicyTemplate();
            policyTemplateSetter.accept(this.policyTemplate);
        }

        return this;
    }

    /**
     * Get policyTemplate
     * @return policyTemplate
     */
    public UpdateRequestPolicyTemplate getPolicyTemplate() {
        return policyTemplate;
    }

    public void setPolicyTemplate(UpdateRequestPolicyTemplate policyTemplate) {
        this.policyTemplate = policyTemplate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVgwRequestBodyContent that = (UpdateVgwRequestBodyContent) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.localSubnets, that.localSubnets)
            && Objects.equals(this.eipId1, that.eipId1) && Objects.equals(this.eipId2, that.eipId2)
            && Objects.equals(this.policyTemplate, that.policyTemplate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, localSubnets, eipId1, eipId2, policyTemplate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVgwRequestBodyContent {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    localSubnets: ").append(toIndentedString(localSubnets)).append("\n");
        sb.append("    eipId1: ").append(toIndentedString(eipId1)).append("\n");
        sb.append("    eipId2: ").append(toIndentedString(eipId2)).append("\n");
        sb.append("    policyTemplate: ").append(toIndentedString(policyTemplate)).append("\n");
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
