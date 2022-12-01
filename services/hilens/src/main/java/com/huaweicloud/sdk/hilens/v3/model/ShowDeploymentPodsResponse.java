package com.huaweicloud.sdk.hilens.v3.model;

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
public class ShowDeploymentPodsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pods")

    private List<Pod> pods = null;

    public ShowDeploymentPodsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * pod总个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ShowDeploymentPodsResponse withPods(List<Pod> pods) {
        this.pods = pods;
        return this;
    }

    public ShowDeploymentPodsResponse addPodsItem(Pod podsItem) {
        if (this.pods == null) {
            this.pods = new ArrayList<>();
        }
        this.pods.add(podsItem);
        return this;
    }

    public ShowDeploymentPodsResponse withPods(Consumer<List<Pod>> podsSetter) {
        if (this.pods == null) {
            this.pods = new ArrayList<>();
        }
        podsSetter.accept(this.pods);
        return this;
    }

    /**
     * pod 列表
     * @return pods
     */
    public List<Pod> getPods() {
        return pods;
    }

    public void setPods(List<Pod> pods) {
        this.pods = pods;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDeploymentPodsResponse showDeploymentPodsResponse = (ShowDeploymentPodsResponse) o;
        return Objects.equals(this.count, showDeploymentPodsResponse.count)
            && Objects.equals(this.pods, showDeploymentPodsResponse.pods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeploymentPodsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
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
