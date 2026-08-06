package com.huaweicloud.sdk.kms.v2.model;

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
public class ListAccessPointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private ListAccessPointResponseBodyPageInfo pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_points")

    private List<ListAccessPointResponseBodyAccessPoints> accessPoints = null;

    public ListAccessPointResponse withPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccessPointResponse withPageInfo(Consumer<ListAccessPointResponseBodyPageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new ListAccessPointResponseBodyPageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public ListAccessPointResponseBodyPageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(ListAccessPointResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    public ListAccessPointResponse withAccessPoints(List<ListAccessPointResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
        return this;
    }

    public ListAccessPointResponse addAccessPointsItem(ListAccessPointResponseBodyAccessPoints accessPointsItem) {
        if (this.accessPoints == null) {
            this.accessPoints = new ArrayList<>();
        }
        this.accessPoints.add(accessPointsItem);
        return this;
    }

    public ListAccessPointResponse withAccessPoints(
        Consumer<List<ListAccessPointResponseBodyAccessPoints>> accessPointsSetter) {
        if (this.accessPoints == null) {
            this.accessPoints = new ArrayList<>();
        }
        accessPointsSetter.accept(this.accessPoints);
        return this;
    }

    /**
     * **参数解释：** 接入点列表 **取值范围：** 不涉及
     * @return accessPoints
     */
    public List<ListAccessPointResponseBodyAccessPoints> getAccessPoints() {
        return accessPoints;
    }

    public void setAccessPoints(List<ListAccessPointResponseBodyAccessPoints> accessPoints) {
        this.accessPoints = accessPoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccessPointResponse that = (ListAccessPointResponse) obj;
        return Objects.equals(this.pageInfo, that.pageInfo) && Objects.equals(this.accessPoints, that.accessPoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageInfo, accessPoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPointResponse {\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    accessPoints: ").append(toIndentedString(accessPoints)).append("\n");
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
