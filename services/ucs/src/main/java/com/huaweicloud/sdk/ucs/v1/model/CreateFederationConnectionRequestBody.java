package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建联邦网络连接请求体
 */
public class CreateFederationConnectionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcID")

    private String vpcID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetID")

    private String subnetID;

    public CreateFederationConnectionRequestBody withProjectID(String projectID) {
        this.projectID = projectID;
        return this;
    }

    /**
     * 项目id
     * @return projectID
     */
    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }

    public CreateFederationConnectionRequestBody withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * 虚拟私有云id，必须位于上述项目中
     * @return vpcID
     */
    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public CreateFederationConnectionRequestBody withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * 子网的网络id，必须位于上述虚拟私有云中
     * @return subnetID
     */
    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFederationConnectionRequestBody that = (CreateFederationConnectionRequestBody) obj;
        return Objects.equals(this.projectID, that.projectID) && Objects.equals(this.vpcID, that.vpcID)
            && Objects.equals(this.subnetID, that.subnetID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, vpcID, subnetID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFederationConnectionRequestBody {\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
        sb.append("    subnetID: ").append(toIndentedString(subnetID)).append("\n");
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
