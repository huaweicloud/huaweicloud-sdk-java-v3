package com.huaweicloud.sdk.gaussdb.v3.model;

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
public class ListColdTableMetasResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "meta_info")

    private List<ColdTableMetaInfo> metaInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_data_size")

    private Float totalDataSize;

    public ListColdTableMetasResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**：  冷表元信息记录总数。  **取值范围**：  ≥0。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListColdTableMetasResponse withMetaInfo(List<ColdTableMetaInfo> metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }

    public ListColdTableMetasResponse addMetaInfoItem(ColdTableMetaInfo metaInfoItem) {
        if (this.metaInfo == null) {
            this.metaInfo = new ArrayList<>();
        }
        this.metaInfo.add(metaInfoItem);
        return this;
    }

    public ListColdTableMetasResponse withMetaInfo(Consumer<List<ColdTableMetaInfo>> metaInfoSetter) {
        if (this.metaInfo == null) {
            this.metaInfo = new ArrayList<>();
        }
        metaInfoSetter.accept(this.metaInfo);
        return this;
    }

    /**
     * **参数解释**：  冷表元记录列表。
     * @return metaInfo
     */
    public List<ColdTableMetaInfo> getMetaInfo() {
        return metaInfo;
    }

    public void setMetaInfo(List<ColdTableMetaInfo> metaInfo) {
        this.metaInfo = metaInfo;
    }

    public ListColdTableMetasResponse withTotalDataSize(Float totalDataSize) {
        this.totalDataSize = totalDataSize;
        return this;
    }

    /**
     * **参数解释**：  冷表数据量总大小（MB）。  **取值范围**：  ≥0。
     * @return totalDataSize
     */
    public Float getTotalDataSize() {
        return totalDataSize;
    }

    public void setTotalDataSize(Float totalDataSize) {
        this.totalDataSize = totalDataSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListColdTableMetasResponse that = (ListColdTableMetasResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.metaInfo, that.metaInfo)
            && Objects.equals(this.totalDataSize, that.totalDataSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, metaInfo, totalDataSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListColdTableMetasResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    metaInfo: ").append(toIndentedString(metaInfo)).append("\n");
        sb.append("    totalDataSize: ").append(toIndentedString(totalDataSize)).append("\n");
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
