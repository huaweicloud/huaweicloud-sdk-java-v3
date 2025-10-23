package com.huaweicloud.sdk.bcc.v1.model;

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
public class ShowVaultSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "list_vault_summary")

    private List<BccVaultDaySummary> listVaultSummary = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ShowVaultSummaryResponse withListVaultSummary(List<BccVaultDaySummary> listVaultSummary) {
        this.listVaultSummary = listVaultSummary;
        return this;
    }

    public ShowVaultSummaryResponse addListVaultSummaryItem(BccVaultDaySummary listVaultSummaryItem) {
        if (this.listVaultSummary == null) {
            this.listVaultSummary = new ArrayList<>();
        }
        this.listVaultSummary.add(listVaultSummaryItem);
        return this;
    }

    public ShowVaultSummaryResponse withListVaultSummary(Consumer<List<BccVaultDaySummary>> listVaultSummarySetter) {
        if (this.listVaultSummary == null) {
            this.listVaultSummary = new ArrayList<>();
        }
        listVaultSummarySetter.accept(this.listVaultSummary);
        return this;
    }

    /**
     * 列举vault的summary
     * @return listVaultSummary
     */
    public List<BccVaultDaySummary> getListVaultSummary() {
        return listVaultSummary;
    }

    public void setListVaultSummary(List<BccVaultDaySummary> listVaultSummary) {
        this.listVaultSummary = listVaultSummary;
    }

    public ShowVaultSummaryResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 存储库数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVaultSummaryResponse that = (ShowVaultSummaryResponse) obj;
        return Objects.equals(this.listVaultSummary, that.listVaultSummary) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listVaultSummary, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVaultSummaryResponse {\n");
        sb.append("    listVaultSummary: ").append(toIndentedString(listVaultSummary)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
