package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.ListHistoryOperationsResult;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListHistoryOperationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="histories")
    
    
    private List<ListHistoryOperationsResult> histories = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ListHistoryOperationsResponse withHistories(List<ListHistoryOperationsResult> histories) {
        this.histories = histories;
        return this;
    }

    
    public ListHistoryOperationsResponse addHistoriesItem(ListHistoryOperationsResult historiesItem) {
        if(this.histories == null) {
            this.histories = new ArrayList<>();
        }
        this.histories.add(historiesItem);
        return this;
    }

    public ListHistoryOperationsResponse withHistories(Consumer<List<ListHistoryOperationsResult>> historiesSetter) {
        if(this.histories == null) {
            this.histories = new ArrayList<>();
        }
        historiesSetter.accept(this.histories);
        return this;
    }

    /**
     * 参数修改历史的列表记录。
     * @return histories
     */
    public List<ListHistoryOperationsResult> getHistories() {
        return histories;
    }

    public void setHistories(List<ListHistoryOperationsResult> histories) {
        this.histories = histories;
    }

    

    public ListHistoryOperationsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHistoryOperationsResponse listHistoryOperationsResponse = (ListHistoryOperationsResponse) o;
        return Objects.equals(this.histories, listHistoryOperationsResponse.histories) &&
            Objects.equals(this.totalCount, listHistoryOperationsResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(histories, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryOperationsResponse {\n");
        sb.append("    histories: ").append(toIndentedString(histories)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

