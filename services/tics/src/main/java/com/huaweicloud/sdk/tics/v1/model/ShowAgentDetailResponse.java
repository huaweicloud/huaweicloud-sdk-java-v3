package com.huaweicloud.sdk.tics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAgentDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_deploy")

    private TicsAgentDeploy agentDeploy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_deploy_bcs")

    private TicsAgentDeployBcs agentDeployBcs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_deploy_detail")

    private TicsAgentDeployDetail agentDeployDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_deploy_nat")

    private TicsAgentNatCommonInfo agentDeployNat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_deploy_node")

    private TicsAgentNodeInfo agentDeployNode;

    public ShowAgentDetailResponse withAgentDeploy(TicsAgentDeploy agentDeploy) {
        this.agentDeploy = agentDeploy;
        return this;
    }

    public ShowAgentDetailResponse withAgentDeploy(Consumer<TicsAgentDeploy> agentDeploySetter) {
        if (this.agentDeploy == null) {
            this.agentDeploy = new TicsAgentDeploy();
            agentDeploySetter.accept(this.agentDeploy);
        }

        return this;
    }

    /**
     * Get agentDeploy
     * @return agentDeploy
     */
    public TicsAgentDeploy getAgentDeploy() {
        return agentDeploy;
    }

    public void setAgentDeploy(TicsAgentDeploy agentDeploy) {
        this.agentDeploy = agentDeploy;
    }

    public ShowAgentDetailResponse withAgentDeployBcs(TicsAgentDeployBcs agentDeployBcs) {
        this.agentDeployBcs = agentDeployBcs;
        return this;
    }

    public ShowAgentDetailResponse withAgentDeployBcs(Consumer<TicsAgentDeployBcs> agentDeployBcsSetter) {
        if (this.agentDeployBcs == null) {
            this.agentDeployBcs = new TicsAgentDeployBcs();
            agentDeployBcsSetter.accept(this.agentDeployBcs);
        }

        return this;
    }

    /**
     * Get agentDeployBcs
     * @return agentDeployBcs
     */
    public TicsAgentDeployBcs getAgentDeployBcs() {
        return agentDeployBcs;
    }

    public void setAgentDeployBcs(TicsAgentDeployBcs agentDeployBcs) {
        this.agentDeployBcs = agentDeployBcs;
    }

    public ShowAgentDetailResponse withAgentDeployDetail(TicsAgentDeployDetail agentDeployDetail) {
        this.agentDeployDetail = agentDeployDetail;
        return this;
    }

    public ShowAgentDetailResponse withAgentDeployDetail(Consumer<TicsAgentDeployDetail> agentDeployDetailSetter) {
        if (this.agentDeployDetail == null) {
            this.agentDeployDetail = new TicsAgentDeployDetail();
            agentDeployDetailSetter.accept(this.agentDeployDetail);
        }

        return this;
    }

    /**
     * Get agentDeployDetail
     * @return agentDeployDetail
     */
    public TicsAgentDeployDetail getAgentDeployDetail() {
        return agentDeployDetail;
    }

    public void setAgentDeployDetail(TicsAgentDeployDetail agentDeployDetail) {
        this.agentDeployDetail = agentDeployDetail;
    }

    public ShowAgentDetailResponse withAgentDeployNat(TicsAgentNatCommonInfo agentDeployNat) {
        this.agentDeployNat = agentDeployNat;
        return this;
    }

    public ShowAgentDetailResponse withAgentDeployNat(Consumer<TicsAgentNatCommonInfo> agentDeployNatSetter) {
        if (this.agentDeployNat == null) {
            this.agentDeployNat = new TicsAgentNatCommonInfo();
            agentDeployNatSetter.accept(this.agentDeployNat);
        }

        return this;
    }

    /**
     * Get agentDeployNat
     * @return agentDeployNat
     */
    public TicsAgentNatCommonInfo getAgentDeployNat() {
        return agentDeployNat;
    }

    public void setAgentDeployNat(TicsAgentNatCommonInfo agentDeployNat) {
        this.agentDeployNat = agentDeployNat;
    }

    public ShowAgentDetailResponse withAgentDeployNode(TicsAgentNodeInfo agentDeployNode) {
        this.agentDeployNode = agentDeployNode;
        return this;
    }

    public ShowAgentDetailResponse withAgentDeployNode(Consumer<TicsAgentNodeInfo> agentDeployNodeSetter) {
        if (this.agentDeployNode == null) {
            this.agentDeployNode = new TicsAgentNodeInfo();
            agentDeployNodeSetter.accept(this.agentDeployNode);
        }

        return this;
    }

    /**
     * Get agentDeployNode
     * @return agentDeployNode
     */
    public TicsAgentNodeInfo getAgentDeployNode() {
        return agentDeployNode;
    }

    public void setAgentDeployNode(TicsAgentNodeInfo agentDeployNode) {
        this.agentDeployNode = agentDeployNode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAgentDetailResponse that = (ShowAgentDetailResponse) obj;
        return Objects.equals(this.agentDeploy, that.agentDeploy)
            && Objects.equals(this.agentDeployBcs, that.agentDeployBcs)
            && Objects.equals(this.agentDeployDetail, that.agentDeployDetail)
            && Objects.equals(this.agentDeployNat, that.agentDeployNat)
            && Objects.equals(this.agentDeployNode, that.agentDeployNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agentDeploy, agentDeployBcs, agentDeployDetail, agentDeployNat, agentDeployNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAgentDetailResponse {\n");
        sb.append("    agentDeploy: ").append(toIndentedString(agentDeploy)).append("\n");
        sb.append("    agentDeployBcs: ").append(toIndentedString(agentDeployBcs)).append("\n");
        sb.append("    agentDeployDetail: ").append(toIndentedString(agentDeployDetail)).append("\n");
        sb.append("    agentDeployNat: ").append(toIndentedString(agentDeployNat)).append("\n");
        sb.append("    agentDeployNode: ").append(toIndentedString(agentDeployNode)).append("\n");
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
