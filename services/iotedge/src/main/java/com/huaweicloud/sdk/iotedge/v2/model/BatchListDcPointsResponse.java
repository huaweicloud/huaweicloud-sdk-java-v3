package com.huaweicloud.sdk.iotedge.v2.model;

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
public class BatchListDcPointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDTO pageInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "points")

    private List<CreateDcPointRespDTO> points = null;

    public BatchListDcPointsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 总记录数
     * minimum: 0
     * maximum: 1000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BatchListDcPointsResponse withPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public BatchListDcPointsResponse withPageInfo(Consumer<PageInfoDTO> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDTO();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDTO getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDTO pageInfo) {
        this.pageInfo = pageInfo;
    }

    public BatchListDcPointsResponse withPoints(List<CreateDcPointRespDTO> points) {
        this.points = points;
        return this;
    }

    public BatchListDcPointsResponse addPointsItem(CreateDcPointRespDTO pointsItem) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        this.points.add(pointsItem);
        return this;
    }

    public BatchListDcPointsResponse withPoints(Consumer<List<CreateDcPointRespDTO>> pointsSetter) {
        if (this.points == null) {
            this.points = new ArrayList<>();
        }
        pointsSetter.accept(this.points);
        return this;
    }

    /**
     * 每页记录数
     * @return points
     */
    public List<CreateDcPointRespDTO> getPoints() {
        return points;
    }

    public void setPoints(List<CreateDcPointRespDTO> points) {
        this.points = points;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchListDcPointsResponse that = (BatchListDcPointsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.pageInfo, that.pageInfo)
            && Objects.equals(this.points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, pageInfo, points);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchListDcPointsResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
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
