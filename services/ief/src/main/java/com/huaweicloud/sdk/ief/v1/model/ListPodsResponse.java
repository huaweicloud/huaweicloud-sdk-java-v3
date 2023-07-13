package com.huaweicloud.sdk.ief.v1.model;

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
public class ListPodsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pods")

    private List<PodResp> pods = null;

    public ListPodsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 应用实例总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListPodsResponse withPods(List<PodResp> pods) {
        this.pods = pods;
        return this;
    }

    public ListPodsResponse addPodsItem(PodResp podsItem) {
        if (this.pods == null) {
            this.pods = new ArrayList<>();
        }
        this.pods.add(podsItem);
        return this;
    }

    public ListPodsResponse withPods(Consumer<List<PodResp>> podsSetter) {
        if (this.pods == null) {
            this.pods = new ArrayList<>();
        }
        podsSetter.accept(this.pods);
        return this;
    }

    /**
     * 应用实例列表
     * @return pods
     */
    public List<PodResp> getPods() {
        return pods;
    }

    public void setPods(List<PodResp> pods) {
        this.pods = pods;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPodsResponse that = (ListPodsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pods, that.pods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pods);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPodsResponse {\n");
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
