package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
public class ShowFactoryFullTextResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_details")

    private List<SearchDetailV2> searchDetails = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_hits")

    private Integer totalHits;

    public ShowFactoryFullTextResponse withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小限制。 取值范围[1,100]。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ShowFactoryFullTextResponse withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 当前所在分页。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ShowFactoryFullTextResponse withSearchDetails(List<SearchDetailV2> searchDetails) {
        this.searchDetails = searchDetails;
        return this;
    }

    public ShowFactoryFullTextResponse addSearchDetailsItem(SearchDetailV2 searchDetailsItem) {
        if (this.searchDetails == null) {
            this.searchDetails = new ArrayList<>();
        }
        this.searchDetails.add(searchDetailsItem);
        return this;
    }

    public ShowFactoryFullTextResponse withSearchDetails(Consumer<List<SearchDetailV2>> searchDetailsSetter) {
        if (this.searchDetails == null) {
            this.searchDetails = new ArrayList<>();
        }
        searchDetailsSetter.accept(this.searchDetails);
        return this;
    }

    /**
     * 查询成功，返回搜索结果。
     * @return searchDetails
     */
    public List<SearchDetailV2> getSearchDetails() {
        return searchDetails;
    }

    public void setSearchDetails(List<SearchDetailV2> searchDetails) {
        this.searchDetails = searchDetails;
    }

    public ShowFactoryFullTextResponse withTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
        return this;
    }

    /**
     * 成功命中数量。
     * @return totalHits
     */
    public Integer getTotalHits() {
        return totalHits;
    }

    public void setTotalHits(Integer totalHits) {
        this.totalHits = totalHits;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFactoryFullTextResponse that = (ShowFactoryFullTextResponse) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.searchDetails, that.searchDetails) && Objects.equals(this.totalHits, that.totalHits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, offset, searchDetails, totalHits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFactoryFullTextResponse {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    searchDetails: ").append(toIndentedString(searchDetails)).append("\n");
        sb.append("    totalHits: ").append(toIndentedString(totalHits)).append("\n");
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
