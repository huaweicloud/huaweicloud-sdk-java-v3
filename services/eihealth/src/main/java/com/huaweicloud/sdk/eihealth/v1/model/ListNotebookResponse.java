package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ListNotebookResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notebooks")

    private List<NotebookEntity> notebooks = null;

    public ListNotebookResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * notebook总数
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListNotebookResponse withNotebooks(List<NotebookEntity> notebooks) {
        this.notebooks = notebooks;
        return this;
    }

    public ListNotebookResponse addNotebooksItem(NotebookEntity notebooksItem) {
        if (this.notebooks == null) {
            this.notebooks = new ArrayList<>();
        }
        this.notebooks.add(notebooksItem);
        return this;
    }

    public ListNotebookResponse withNotebooks(Consumer<List<NotebookEntity>> notebooksSetter) {
        if (this.notebooks == null) {
            this.notebooks = new ArrayList<>();
        }
        notebooksSetter.accept(this.notebooks);
        return this;
    }

    /**
     * notebook详情列表
     * @return notebooks
     */
    public List<NotebookEntity> getNotebooks() {
        return notebooks;
    }

    public void setNotebooks(List<NotebookEntity> notebooks) {
        this.notebooks = notebooks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNotebookResponse listNotebookResponse = (ListNotebookResponse) o;
        return Objects.equals(this.count, listNotebookResponse.count)
            && Objects.equals(this.notebooks, listNotebookResponse.notebooks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, notebooks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNotebookResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    notebooks: ").append(toIndentedString(notebooks)).append("\n");
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
