package com.huaweicloud.sdk.drs.v3.model;

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
public class ListObejectLevelCompareDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_detail")

    private List<ObjectsCompareDetailInfo> compareDetail = null;

    public ListObejectLevelCompareDetailResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 对比数量。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListObejectLevelCompareDetailResponse withCompareDetail(List<ObjectsCompareDetailInfo> compareDetail) {
        this.compareDetail = compareDetail;
        return this;
    }

    public ListObejectLevelCompareDetailResponse addCompareDetailItem(ObjectsCompareDetailInfo compareDetailItem) {
        if (this.compareDetail == null) {
            this.compareDetail = new ArrayList<>();
        }
        this.compareDetail.add(compareDetailItem);
        return this;
    }

    public ListObejectLevelCompareDetailResponse withCompareDetail(
        Consumer<List<ObjectsCompareDetailInfo>> compareDetailSetter) {
        if (this.compareDetail == null) {
            this.compareDetail = new ArrayList<>();
        }
        compareDetailSetter.accept(this.compareDetail);
        return this;
    }

    /**
     * 对象级对比详情。
     * @return compareDetail
     */
    public List<ObjectsCompareDetailInfo> getCompareDetail() {
        return compareDetail;
    }

    public void setCompareDetail(List<ObjectsCompareDetailInfo> compareDetail) {
        this.compareDetail = compareDetail;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListObejectLevelCompareDetailResponse that = (ListObejectLevelCompareDetailResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.compareDetail, that.compareDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, compareDetail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListObejectLevelCompareDetailResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    compareDetail: ").append(toIndentedString(compareDetail)).append("\n");
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
