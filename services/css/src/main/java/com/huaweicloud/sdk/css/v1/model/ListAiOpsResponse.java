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
    @JsonProperty(value = "aiops_list")

    private List<AiOps> aiopsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size")

    private Integer totalSize;

    public ListAiOpsResponse withAiopsList(List<AiOps> aiopsList) {
        this.aiopsList = aiopsList;
        return this;
    }

    public ListAiOpsResponse addAiopsListItem(AiOps aiopsListItem) {
        if (this.aiopsList == null) {
            this.aiopsList = new ArrayList<>();
        }
        this.aiopsList.add(aiopsListItem);
        return this;
    }

    public ListAiOpsResponse withAiopsList(Consumer<List<AiOps>> aiopsListSetter) {
        if (this.aiopsList == null) {
            this.aiopsList = new ArrayList<>();
        }
        aiopsListSetter.accept(this.aiopsList);
        return this;
    }

    /**
     * Get aiopsList
     * @return aiopsList
     */
    public List<AiOps> getAiopsList() {
        return aiopsList;
    }

    public void setAiopsList(List<AiOps> aiopsList) {
        this.aiopsList = aiopsList;
    }

    public ListAiOpsResponse withTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }

    /**
     * 参数解释： 集群风险检测任务总数。 取值范围： 不涉及
     * @return totalSize
     */
    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
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
        return Objects.equals(this.aiopsList, that.aiopsList) && Objects.equals(this.totalSize, that.totalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aiopsList, totalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAiOpsResponse {\n");
        sb.append("    aiopsList: ").append(toIndentedString(aiopsList)).append("\n");
        sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
