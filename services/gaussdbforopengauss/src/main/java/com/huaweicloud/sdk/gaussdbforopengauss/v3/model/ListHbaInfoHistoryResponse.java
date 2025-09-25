package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListHbaInfoHistoryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hba_histories")

    private List<HbaHistoryResult> hbaHistories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ListHbaInfoHistoryResponse withHbaHistories(List<HbaHistoryResult> hbaHistories) {
        this.hbaHistories = hbaHistories;
        return this;
    }

    public ListHbaInfoHistoryResponse addHbaHistoriesItem(HbaHistoryResult hbaHistoriesItem) {
        if (this.hbaHistories == null) {
            this.hbaHistories = new ArrayList<>();
        }
        this.hbaHistories.add(hbaHistoriesItem);
        return this;
    }

    public ListHbaInfoHistoryResponse withHbaHistories(Consumer<List<HbaHistoryResult>> hbaHistoriesSetter) {
        if (this.hbaHistories == null) {
            this.hbaHistories = new ArrayList<>();
        }
        hbaHistoriesSetter.accept(this.hbaHistories);
        return this;
    }

    /**
     * **参数解释**: hba修改历史信息。
     * @return hbaHistories
     */
    public List<HbaHistoryResult> getHbaHistories() {
        return hbaHistories;
    }

    public void setHbaHistories(List<HbaHistoryResult> hbaHistories) {
        this.hbaHistories = hbaHistories;
    }

    public ListHbaInfoHistoryResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: hba配置总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
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
        ListHbaInfoHistoryResponse that = (ListHbaInfoHistoryResponse) obj;
        return Objects.equals(this.hbaHistories, that.hbaHistories) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hbaHistories, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHbaInfoHistoryResponse {\n");
        sb.append("    hbaHistories: ").append(toIndentedString(hbaHistories)).append("\n");
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
