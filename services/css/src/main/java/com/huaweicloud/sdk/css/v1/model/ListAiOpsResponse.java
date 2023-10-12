package com.huaweicloud.sdk.css.v1.model;

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
public class ListAiOpsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Integer totalSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aiops_list")

    private List<ListAiOpsRequestBodyAiopsList> aiopsList = null;

    public ListAiOpsResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 检测任务个数。
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }

    public ListAiOpsResponse withAiopsList(List<ListAiOpsRequestBodyAiopsList> aiopsList) {
        this.aiopsList = aiopsList;
        return this;
    }

    public ListAiOpsResponse addAiopsListItem(ListAiOpsRequestBodyAiopsList aiopsListItem) {
        if (this.aiopsList == null) {
            this.aiopsList = new ArrayList<>();
        }
        this.aiopsList.add(aiopsListItem);
        return this;
    }

    public ListAiOpsResponse withAiopsList(Consumer<List<ListAiOpsRequestBodyAiopsList>> aiopsListSetter) {
        if (this.aiopsList == null) {
            this.aiopsList = new ArrayList<>();
        }
        aiopsListSetter.accept(this.aiopsList);
        return this;
    }

    /**
     * 创建一个集群检测任务。
     * @return aiopsList
     */
    public List<ListAiOpsRequestBodyAiopsList> getAiopsList() {
        return aiopsList;
    }

    public void setAiopsList(List<ListAiOpsRequestBodyAiopsList> aiopsList) {
        this.aiopsList = aiopsList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAiOpsResponse that = (ListAiOpsResponse) obj;
        return Objects.equals(this.totalSize, that.totalSize) && Objects.equals(this.aiopsList, that.aiopsList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalSize, aiopsList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiOpsResponse {\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
        sb.append("    aiopsList: ").append(toIndentedString(aiopsList)).append("\n");
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
