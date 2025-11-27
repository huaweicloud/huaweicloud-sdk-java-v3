package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 下载联邦kubeconfig请求体
 */
public class CreateFederationCertRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectID")

    private String projectID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpcID")

    private String vpcID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnetID")

    private String subnetID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    public CreateFederationCertRequestBody withProjectID(String projectID) {
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

    public CreateFederationCertRequestBody withVpcID(String vpcID) {
        this.vpcID = vpcID;
        return this;
    }

    /**
     * VPC id，必须属于上述项目
     * @return vpcID
     */
    public String getVpcID() {
        return vpcID;
    }

    public void setVpcID(String vpcID) {
        this.vpcID = vpcID;
    }

    public CreateFederationCertRequestBody withSubnetID(String subnetID) {
        this.subnetID = subnetID;
        return this;
    }

    /**
     * 子网id，必须属于上述vpc
     * @return subnetID
     */
    public String getSubnetID() {
        return subnetID;
    }

    public void setSubnetID(String subnetID) {
        this.subnetID = subnetID;
    }

    public CreateFederationCertRequestBody withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * kubeconfig证书有效期，单位为天
     * minimum: 1
     * maximum: 1825
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateFederationCertRequestBody that = (CreateFederationCertRequestBody) obj;
        return Objects.equals(this.projectID, that.projectID) && Objects.equals(this.vpcID, that.vpcID)
            && Objects.equals(this.subnetID, that.subnetID) && Objects.equals(this.duration, that.duration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectID, vpcID, subnetID, duration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateFederationCertRequestBody {\n");
        sb.append("    projectID: ").append(toIndentedString(projectID)).append("\n");
        sb.append("    vpcID: ").append(toIndentedString(vpcID)).append("\n");
        sb.append("    subnetID: ").append(toIndentedString(subnetID)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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
