package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.Quota;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowMysqlQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_list")
    
    
    private List<Quota> quotaList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    
    private Integer totalCount;

    public ShowMysqlQuotasResponse withQuotaList(List<Quota> quotaList) {
        this.quotaList = quotaList;
        return this;
    }

    
    public ShowMysqlQuotasResponse addQuotaListItem(Quota quotaListItem) {
        if(this.quotaList == null) {
            this.quotaList = new ArrayList<>();
        }
        this.quotaList.add(quotaListItem);
        return this;
    }

    public ShowMysqlQuotasResponse withQuotaList(Consumer<List<Quota>> quotaListSetter) {
        if(this.quotaList == null) {
            this.quotaList = new ArrayList<>();
        }
        quotaListSetter.accept(this.quotaList);
        return this;
    }

    /**
     * 资源列表对象。
     * @return quotaList
     */
    public List<Quota> getQuotaList() {
        return quotaList;
    }

    public void setQuotaList(List<Quota> quotaList) {
        this.quotaList = quotaList;
    }

    

    public ShowMysqlQuotasResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 配额记录的条数。
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
        ShowMysqlQuotasResponse showMysqlQuotasResponse = (ShowMysqlQuotasResponse) o;
        return Objects.equals(this.quotaList, showMysqlQuotasResponse.quotaList) &&
            Objects.equals(this.totalCount, showMysqlQuotasResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaList, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMysqlQuotasResponse {\n");
        sb.append("    quotaList: ").append(toIndentedString(quotaList)).append("\n");
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

