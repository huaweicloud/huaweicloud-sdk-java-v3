package com.huaweicloud.sdk.sfsturbo.v1.model;

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
public class ListBackendTargetsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<ShowBackendTargetInfoResponseBody> targets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ListBackendTargetsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 文件系统后端存储库列表元素个数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListBackendTargetsResponse withTargets(List<ShowBackendTargetInfoResponseBody> targets) {
        this.targets = targets;
        return this;
    }

    public ListBackendTargetsResponse addTargetsItem(ShowBackendTargetInfoResponseBody targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ListBackendTargetsResponse withTargets(Consumer<List<ShowBackendTargetInfoResponseBody>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 文件系统后端存储库列表
     * @return targets
     */
    public List<ShowBackendTargetInfoResponseBody> getTargets() {
        return targets;
    }

    public void setTargets(List<ShowBackendTargetInfoResponseBody> targets) {
        this.targets = targets;
    }

    public ListBackendTargetsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListBackendTargetsResponse that = (ListBackendTargetsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.targets, that.targets)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, targets, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBackendTargetsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
