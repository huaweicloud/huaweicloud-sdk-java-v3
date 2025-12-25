package com.huaweicloud.sdk.versatile.v1.model;

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
public class SearchKnowledgeBaseResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retrieve_result_list")

    private List<RetrievalResultInfo> retrieveResultList = null;

    public SearchKnowledgeBaseResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 检索结果总数。  **取值范围**： 不涉及。
     * maximum: 65535
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public SearchKnowledgeBaseResponse withRetrieveResultList(List<RetrievalResultInfo> retrieveResultList) {
        this.retrieveResultList = retrieveResultList;
        return this;
    }

    public SearchKnowledgeBaseResponse addRetrieveResultListItem(RetrievalResultInfo retrieveResultListItem) {
        if (this.retrieveResultList == null) {
            this.retrieveResultList = new ArrayList<>();
        }
        this.retrieveResultList.add(retrieveResultListItem);
        return this;
    }

    public SearchKnowledgeBaseResponse withRetrieveResultList(
        Consumer<List<RetrievalResultInfo>> retrieveResultListSetter) {
        if (this.retrieveResultList == null) {
            this.retrieveResultList = new ArrayList<>();
        }
        retrieveResultListSetter.accept(this.retrieveResultList);
        return this;
    }

    /**
     * **参数解释**： 检索结果列表。  **取值范围**： 不涉及。
     * @return retrieveResultList
     */
    public List<RetrievalResultInfo> getRetrieveResultList() {
        return retrieveResultList;
    }

    public void setRetrieveResultList(List<RetrievalResultInfo> retrieveResultList) {
        this.retrieveResultList = retrieveResultList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchKnowledgeBaseResponse that = (SearchKnowledgeBaseResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.retrieveResultList, that.retrieveResultList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, retrieveResultList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchKnowledgeBaseResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    retrieveResultList: ").append(toIndentedString(retrieveResultList)).append("\n");
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
