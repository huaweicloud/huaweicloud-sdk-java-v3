package com.huaweicloud.sdk.vod.v1.model;

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
public class ShowRefreshResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_results")

    private List<RefreshResult> refreshResults = null;

    public ShowRefreshResultResponse withRefreshResults(List<RefreshResult> refreshResults) {
        this.refreshResults = refreshResults;
        return this;
    }

    public ShowRefreshResultResponse addRefreshResultsItem(RefreshResult refreshResultsItem) {
        if (this.refreshResults == null) {
            this.refreshResults = new ArrayList<>();
        }
        this.refreshResults.add(refreshResultsItem);
        return this;
    }

    public ShowRefreshResultResponse withRefreshResults(Consumer<List<RefreshResult>> refreshResultsSetter) {
        if (this.refreshResults == null) {
            this.refreshResults = new ArrayList<>();
        }
        refreshResultsSetter.accept(this.refreshResults);
        return this;
    }

    /**
     * 刷新任务结果
     * @return refreshResults
     */
    public List<RefreshResult> getRefreshResults() {
        return refreshResults;
    }

    public void setRefreshResults(List<RefreshResult> refreshResults) {
        this.refreshResults = refreshResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRefreshResultResponse that = (ShowRefreshResultResponse) obj;
        return Objects.equals(this.refreshResults, that.refreshResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(refreshResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRefreshResultResponse {\n");
        sb.append("    refreshResults: ").append(toIndentedString(refreshResults)).append("\n");
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
