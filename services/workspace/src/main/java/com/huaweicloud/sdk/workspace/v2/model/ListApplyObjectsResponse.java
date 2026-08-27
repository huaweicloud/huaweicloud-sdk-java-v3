package com.huaweicloud.sdk.workspace.v2.model;

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
public class ListApplyObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_objects")

    private List<ApplyObjectDetailInfo> applyObjects = null;

    public ListApplyObjectsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数量
     * minimum: 0
     * maximum: 2147483647
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListApplyObjectsResponse withApplyObjects(List<ApplyObjectDetailInfo> applyObjects) {
        this.applyObjects = applyObjects;
        return this;
    }

    public ListApplyObjectsResponse addApplyObjectsItem(ApplyObjectDetailInfo applyObjectsItem) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        this.applyObjects.add(applyObjectsItem);
        return this;
    }

    public ListApplyObjectsResponse withApplyObjects(Consumer<List<ApplyObjectDetailInfo>> applyObjectsSetter) {
        if (this.applyObjects == null) {
            this.applyObjects = new ArrayList<>();
        }
        applyObjectsSetter.accept(this.applyObjects);
        return this;
    }

    /**
     * 应用对象列表
     * @return applyObjects
     */
    public List<ApplyObjectDetailInfo> getApplyObjects() {
        return applyObjects;
    }

    public void setApplyObjects(List<ApplyObjectDetailInfo> applyObjects) {
        this.applyObjects = applyObjects;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListApplyObjectsResponse that = (ListApplyObjectsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount) && Objects.equals(this.applyObjects, that.applyObjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, applyObjects);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListApplyObjectsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    applyObjects: ").append(toIndentedString(applyObjects)).append("\n");
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
