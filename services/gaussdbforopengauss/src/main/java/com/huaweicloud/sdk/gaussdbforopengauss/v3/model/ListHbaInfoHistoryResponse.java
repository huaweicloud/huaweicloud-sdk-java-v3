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
    @JsonProperty(value = "hba_confs")

    private List<HbaHistoryResult> hbaConfs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ListHbaInfoHistoryResponse withHbaConfs(List<HbaHistoryResult> hbaConfs) {
        this.hbaConfs = hbaConfs;
        return this;
    }

    public ListHbaInfoHistoryResponse addHbaConfsItem(HbaHistoryResult hbaConfsItem) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        this.hbaConfs.add(hbaConfsItem);
        return this;
    }

    public ListHbaInfoHistoryResponse withHbaConfs(Consumer<List<HbaHistoryResult>> hbaConfsSetter) {
        if (this.hbaConfs == null) {
            this.hbaConfs = new ArrayList<>();
        }
        hbaConfsSetter.accept(this.hbaConfs);
        return this;
    }

    /**
     * **参数解释**: hba修改历史信息。
     * @return hbaConfs
     */
    public List<HbaHistoryResult> getHbaConfs() {
        return hbaConfs;
    }

    public void setHbaConfs(List<HbaHistoryResult> hbaConfs) {
        this.hbaConfs = hbaConfs;
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
        return Objects.equals(this.hbaConfs, that.hbaConfs) && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hbaConfs, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHbaInfoHistoryResponse {\n");
        sb.append("    hbaConfs: ").append(toIndentedString(hbaConfs)).append("\n");
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
