package com.huaweicloud.sdk.koomap.v1.model;

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
public class ListMarkPointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "markInfos")

    private List<MarkInfoDetail> markInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListMarkPointsResponse withMarkInfos(List<MarkInfoDetail> markInfos) {
        this.markInfos = markInfos;
        return this;
    }

    public ListMarkPointsResponse addMarkInfosItem(MarkInfoDetail markInfosItem) {
        if (this.markInfos == null) {
            this.markInfos = new ArrayList<>();
        }
        this.markInfos.add(markInfosItem);
        return this;
    }

    public ListMarkPointsResponse withMarkInfos(Consumer<List<MarkInfoDetail>> markInfosSetter) {
        if (this.markInfos == null) {
            this.markInfos = new ArrayList<>();
        }
        markInfosSetter.accept(this.markInfos);
        return this;
    }

    /**
     * 像控点列表。
     * @return markInfos
     */
    public List<MarkInfoDetail> getMarkInfos() {
        return markInfos;
    }

    public void setMarkInfos(List<MarkInfoDetail> markInfos) {
        this.markInfos = markInfos;
    }

    public ListMarkPointsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListMarkPointsResponse withPage(Consumer<Page> pageSetter) {
        if (this.page == null) {
            this.page = new Page();
            pageSetter.accept(this.page);
        }

        return this;
    }

    /**
     * Get page
     * @return page
     */
    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMarkPointsResponse that = (ListMarkPointsResponse) obj;
        return Objects.equals(this.markInfos, that.markInfos) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(markInfos, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMarkPointsResponse {\n");
        sb.append("    markInfos: ").append(toIndentedString(markInfos)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
