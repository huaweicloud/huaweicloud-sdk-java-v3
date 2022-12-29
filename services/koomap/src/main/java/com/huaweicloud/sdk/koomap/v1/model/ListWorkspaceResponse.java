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
public class ListWorkspaceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data")

    private List<WorkSpaceVo> data = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Page page;

    public ListWorkspaceResponse withData(List<WorkSpaceVo> data) {
        this.data = data;
        return this;
    }

    public ListWorkspaceResponse addDataItem(WorkSpaceVo dataItem) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListWorkspaceResponse withData(Consumer<List<WorkSpaceVo>> dataSetter) {
        if (this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 工作共享空间列表信息。
     * @return data
     */
    public List<WorkSpaceVo> getData() {
        return data;
    }

    public void setData(List<WorkSpaceVo> data) {
        this.data = data;
    }

    public ListWorkspaceResponse withPage(Page page) {
        this.page = page;
        return this;
    }

    public ListWorkspaceResponse withPage(Consumer<Page> pageSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListWorkspaceResponse listWorkspaceResponse = (ListWorkspaceResponse) o;
        return Objects.equals(this.data, listWorkspaceResponse.data)
            && Objects.equals(this.page, listWorkspaceResponse.page);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, page);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspaceResponse {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
