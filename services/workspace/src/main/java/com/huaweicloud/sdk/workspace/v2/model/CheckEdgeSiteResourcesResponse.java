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
public class CheckEdgeSiteResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_enough")

    private Integer isEnough;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_remainder")

    private List<ResourceRemainderData> resourceRemainder = null;

    public CheckEdgeSiteResourcesResponse withIsEnough(Integer isEnough) {
        this.isEnough = isEnough;
        return this;
    }

    /**
     * 配额是否足够1：足够 0 ：不足。
     * minimum: 0
     * maximum: 1
     * @return isEnough
     */
    public Integer getIsEnough() {
        return isEnough;
    }

    public void setIsEnough(Integer isEnough) {
        this.isEnough = isEnough;
    }

    public CheckEdgeSiteResourcesResponse withResourceRemainder(List<ResourceRemainderData> resourceRemainder) {
        this.resourceRemainder = resourceRemainder;
        return this;
    }

    public CheckEdgeSiteResourcesResponse addResourceRemainderItem(ResourceRemainderData resourceRemainderItem) {
        if (this.resourceRemainder == null) {
            this.resourceRemainder = new ArrayList<>();
        }
        this.resourceRemainder.add(resourceRemainderItem);
        return this;
    }

    public CheckEdgeSiteResourcesResponse withResourceRemainder(
        Consumer<List<ResourceRemainderData>> resourceRemainderSetter) {
        if (this.resourceRemainder == null) {
            this.resourceRemainder = new ArrayList<>();
        }
        resourceRemainderSetter.accept(this.resourceRemainder);
        return this;
    }

    /**
     * 资源剩余数量信息。
     * @return resourceRemainder
     */
    public List<ResourceRemainderData> getResourceRemainder() {
        return resourceRemainder;
    }

    public void setResourceRemainder(List<ResourceRemainderData> resourceRemainder) {
        this.resourceRemainder = resourceRemainder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckEdgeSiteResourcesResponse that = (CheckEdgeSiteResourcesResponse) obj;
        return Objects.equals(this.isEnough, that.isEnough)
            && Objects.equals(this.resourceRemainder, that.resourceRemainder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEnough, resourceRemainder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckEdgeSiteResourcesResponse {\n");
        sb.append("    isEnough: ").append(toIndentedString(isEnough)).append("\n");
        sb.append("    resourceRemainder: ").append(toIndentedString(resourceRemainder)).append("\n");
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
