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
public class ListSpurPointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spurInfos")

    private List<SpurInfoDetail> spurInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListSpurPointsResponse withSpurInfos(List<SpurInfoDetail> spurInfos) {
        this.spurInfos = spurInfos;
        return this;
    }

    public ListSpurPointsResponse addSpurInfosItem(SpurInfoDetail spurInfosItem) {
        if (this.spurInfos == null) {
            this.spurInfos = new ArrayList<>();
        }
        this.spurInfos.add(spurInfosItem);
        return this;
    }

    public ListSpurPointsResponse withSpurInfos(Consumer<List<SpurInfoDetail>> spurInfosSetter) {
        if (this.spurInfos == null) {
            this.spurInfos = new ArrayList<>();
        }
        spurInfosSetter.accept(this.spurInfos);
        return this;
    }

    /**
     * 刺点信息列表。
     * @return spurInfos
     */
    public List<SpurInfoDetail> getSpurInfos() {
        return spurInfos;
    }

    public void setSpurInfos(List<SpurInfoDetail> spurInfos) {
        this.spurInfos = spurInfos;
    }

    public ListSpurPointsResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListSpurPointsResponse withPage(Consumer<Page> pageSetter) {
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
        ListSpurPointsResponse that = (ListSpurPointsResponse) obj;
        return Objects.equals(this.spurInfos, that.spurInfos) && Objects.equals(this.page, that.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spurInfos, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpurPointsResponse {\n");
        sb.append("    spurInfos: ").append(toIndentedString(spurInfos)).append("\n");
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
