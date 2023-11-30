package com.huaweicloud.sdk.eip.v2.model;

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
public class BatchModifyBandwidthResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_resources")

    private List<SuccessResources> successResources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_resources")

    private List<FailureResources> failureResources = null;

    public BatchModifyBandwidthResponse withSuccessResources(List<SuccessResources> successResources) {
        this.successResources = successResources;
        return this;
    }

    public BatchModifyBandwidthResponse addSuccessResourcesItem(SuccessResources successResourcesItem) {
        if (this.successResources == null) {
            this.successResources = new ArrayList<>();
        }
        this.successResources.add(successResourcesItem);
        return this;
    }

    public BatchModifyBandwidthResponse withSuccessResources(Consumer<List<SuccessResources>> successResourcesSetter) {
        if (this.successResources == null) {
            this.successResources = new ArrayList<>();
        }
        successResourcesSetter.accept(this.successResources);
        return this;
    }

    /**
     * 成功资源
     * @return successResources
     */
    public List<SuccessResources> getSuccessResources() {
        return successResources;
    }

    public void setSuccessResources(List<SuccessResources> successResources) {
        this.successResources = successResources;
    }

    public BatchModifyBandwidthResponse withFailureResources(List<FailureResources> failureResources) {
        this.failureResources = failureResources;
        return this;
    }

    public BatchModifyBandwidthResponse addFailureResourcesItem(FailureResources failureResourcesItem) {
        if (this.failureResources == null) {
            this.failureResources = new ArrayList<>();
        }
        this.failureResources.add(failureResourcesItem);
        return this;
    }

    public BatchModifyBandwidthResponse withFailureResources(Consumer<List<FailureResources>> failureResourcesSetter) {
        if (this.failureResources == null) {
            this.failureResources = new ArrayList<>();
        }
        failureResourcesSetter.accept(this.failureResources);
        return this;
    }

    /**
     * 失败资源
     * @return failureResources
     */
    public List<FailureResources> getFailureResources() {
        return failureResources;
    }

    public void setFailureResources(List<FailureResources> failureResources) {
        this.failureResources = failureResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchModifyBandwidthResponse that = (BatchModifyBandwidthResponse) obj;
        return Objects.equals(this.successResources, that.successResources)
            && Objects.equals(this.failureResources, that.failureResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(successResources, failureResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchModifyBandwidthResponse {\n");
        sb.append("    successResources: ").append(toIndentedString(successResources)).append("\n");
        sb.append("    failureResources: ").append(toIndentedString(failureResources)).append("\n");
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
