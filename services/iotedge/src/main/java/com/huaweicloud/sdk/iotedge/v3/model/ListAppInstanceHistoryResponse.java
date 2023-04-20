package com.huaweicloud.sdk.iotedge.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.QueryAppInstanceHistoryResponseDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListAppInstanceHistoryResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="history")
    
    private List<QueryAppInstanceHistoryResponseDTO> history = null;
    
    public ListAppInstanceHistoryResponse withHistory(List<QueryAppInstanceHistoryResponseDTO> history) {
        this.history = history;
        return this;
    }

    
    public ListAppInstanceHistoryResponse addHistoryItem(QueryAppInstanceHistoryResponseDTO historyItem) {
        if(this.history == null) {
            this.history = new ArrayList<>();
        }
        this.history.add(historyItem);
        return this;
    }

    public ListAppInstanceHistoryResponse withHistory(Consumer<List<QueryAppInstanceHistoryResponseDTO>> historySetter) {
        if(this.history == null) {
            this.history = new ArrayList<>();
        }
        historySetter.accept(this.history);
        return this;
    }

    /**
     * 应用实例历史版本列表
     * @return history
     */
    public List<QueryAppInstanceHistoryResponseDTO> getHistory() {
        return history;
    }

    public void setHistory(List<QueryAppInstanceHistoryResponseDTO> history) {
        this.history = history;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAppInstanceHistoryResponse listAppInstanceHistoryResponse = (ListAppInstanceHistoryResponse) o;
        return Objects.equals(this.history, listAppInstanceHistoryResponse.history);
    }
    @Override
    public int hashCode() {
        return Objects.hash(history);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAppInstanceHistoryResponse {\n");
        sb.append("    history: ").append(toIndentedString(history)).append("\n");
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

