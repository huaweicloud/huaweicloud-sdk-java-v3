package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class DeployFactoryPackagesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_package_details")

    private List<DeployPackagesResponseDeployPackageDetails> deployPackageDetails = null;

    public DeployFactoryPackagesResponse withDeployPackageDetails(
        List<DeployPackagesResponseDeployPackageDetails> deployPackageDetails) {
        this.deployPackageDetails = deployPackageDetails;
        return this;
    }

    public DeployFactoryPackagesResponse addDeployPackageDetailsItem(
        DeployPackagesResponseDeployPackageDetails deployPackageDetailsItem) {
        if (this.deployPackageDetails == null) {
            this.deployPackageDetails = new ArrayList<>();
        }
        this.deployPackageDetails.add(deployPackageDetailsItem);
        return this;
    }

    public DeployFactoryPackagesResponse withDeployPackageDetails(
        Consumer<List<DeployPackagesResponseDeployPackageDetails>> deployPackageDetailsSetter) {
        if (this.deployPackageDetails == null) {
            this.deployPackageDetails = new ArrayList<>();
        }
        deployPackageDetailsSetter.accept(this.deployPackageDetails);
        return this;
    }

    /**
     * 发布包信息
     * @return deployPackageDetails
     */
    public List<DeployPackagesResponseDeployPackageDetails> getDeployPackageDetails() {
        return deployPackageDetails;
    }

    public void setDeployPackageDetails(List<DeployPackagesResponseDeployPackageDetails> deployPackageDetails) {
        this.deployPackageDetails = deployPackageDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployFactoryPackagesResponse that = (DeployFactoryPackagesResponse) obj;
        return Objects.equals(this.deployPackageDetails, that.deployPackageDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployPackageDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeployFactoryPackagesResponse {\n");
        sb.append("    deployPackageDetails: ").append(toIndentedString(deployPackageDetails)).append("\n");
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
