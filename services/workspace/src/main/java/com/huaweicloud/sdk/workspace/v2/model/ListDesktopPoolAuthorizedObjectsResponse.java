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
public class ListDesktopPoolAuthorizedObjectsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "objects")

    private List<AuthorizedObjects> objects = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public ListDesktopPoolAuthorizedObjectsResponse withObjects(List<AuthorizedObjects> objects) {
        this.objects = objects;
        return this;
    }

    public ListDesktopPoolAuthorizedObjectsResponse addObjectsItem(AuthorizedObjects objectsItem) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        this.objects.add(objectsItem);
        return this;
    }

    public ListDesktopPoolAuthorizedObjectsResponse withObjects(Consumer<List<AuthorizedObjects>> objectsSetter) {
        if (this.objects == null) {
            this.objects = new ArrayList<>();
        }
        objectsSetter.accept(this.objects);
        return this;
    }

    /**
     * 授权对象。
     * @return objects
     */
    public List<AuthorizedObjects> getObjects() {
        return objects;
    }

    public void setObjects(List<AuthorizedObjects> objects) {
        this.objects = objects;
    }

    public ListDesktopPoolAuthorizedObjectsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 满足条件的用户、用户组总数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDesktopPoolAuthorizedObjectsResponse that = (ListDesktopPoolAuthorizedObjectsResponse) obj;
        return Objects.equals(this.objects, that.objects) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(objects, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopPoolAuthorizedObjectsResponse {\n");
        sb.append("    objects: ").append(toIndentedString(objects)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
