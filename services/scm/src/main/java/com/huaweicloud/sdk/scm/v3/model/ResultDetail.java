package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResultDetail
 */
public class ResultDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_id")

    private String certificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployed_resources")

    private List<DeployedResourceDetail> deployedResources = null;

    public ResultDetail withCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }

    /**
     * 证书ID。
     * @return certificateId
     */
    public String getCertificateId() {
        return certificateId;
    }

    public void setCertificateId(String certificateId) {
        this.certificateId = certificateId;
    }

    public ResultDetail withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 当前证书在所查询服务中已部署资源总数。
     * minimum: 0
     * maximum: 1000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ResultDetail withDeployedResources(List<DeployedResourceDetail> deployedResources) {
        this.deployedResources = deployedResources;
        return this;
    }

    public ResultDetail addDeployedResourcesItem(DeployedResourceDetail deployedResourcesItem) {
        if (this.deployedResources == null) {
            this.deployedResources = new ArrayList<>();
        }
        this.deployedResources.add(deployedResourcesItem);
        return this;
    }

    public ResultDetail withDeployedResources(Consumer<List<DeployedResourceDetail>> deployedResourcesSetter) {
        if (this.deployedResources == null) {
            this.deployedResources = new ArrayList<>();
        }
        deployedResourcesSetter.accept(this.deployedResources);
        return this;
    }

    /**
     * 当前证书已部署资源列表，详情请参见DeployedResourceDetail字段数据结构说明。
     * @return deployedResources
     */
    public List<DeployedResourceDetail> getDeployedResources() {
        return deployedResources;
    }

    public void setDeployedResources(List<DeployedResourceDetail> deployedResources) {
        this.deployedResources = deployedResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResultDetail that = (ResultDetail) obj;
        return Objects.equals(this.certificateId, that.certificateId) && Objects.equals(this.totalNum, that.totalNum)
            && Objects.equals(this.deployedResources, that.deployedResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certificateId, totalNum, deployedResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultDetail {\n");
        sb.append("    certificateId: ").append(toIndentedString(certificateId)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    deployedResources: ").append(toIndentedString(deployedResources)).append("\n");
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
