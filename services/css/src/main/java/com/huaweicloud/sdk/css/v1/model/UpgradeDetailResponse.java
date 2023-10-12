package com.huaweicloud.sdk.css.v1.model;

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
public class UpgradeDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalSize")

    private Integer totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detailList")

    private List<GetUpgradeDetailInfo> detailList = null;

    public UpgradeDetailResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 下发执行接口次数。
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public UpgradeDetailResponse withDetailList(List<GetUpgradeDetailInfo> detailList) {
        this.detailList = detailList;
        return this;
    }

    public UpgradeDetailResponse addDetailListItem(GetUpgradeDetailInfo detailListItem) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        this.detailList.add(detailListItem);
        return this;
    }

    public UpgradeDetailResponse withDetailList(Consumer<List<GetUpgradeDetailInfo>> detailListSetter) {
        if (this.detailList == null) {
            this.detailList = new ArrayList<>();
        }
        detailListSetter.accept(this.detailList);
        return this;
    }

    /**
     * Get detailList
     * @return detailList
     */
    public List<GetUpgradeDetailInfo> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<GetUpgradeDetailInfo> detailList) {
        this.detailList = detailList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpgradeDetailResponse that = (UpgradeDetailResponse) obj;
        return Objects.equals(this.totalSize, that.totalSize) && Objects.equals(this.detailList, that.detailList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSize, detailList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpgradeDetailResponse {\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    detailList: ").append(toIndentedString(detailList)).append("\n");
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
