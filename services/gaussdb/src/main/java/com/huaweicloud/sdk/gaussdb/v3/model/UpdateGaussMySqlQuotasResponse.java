package com.huaweicloud.sdk.gaussdb.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdb.v3.model.SetQuota;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateGaussMySqlQuotasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="quota_list")
    
    @JacksonXmlProperty(localName = "quota_list")
    
    private List<SetQuota> quotaList = null;
    
    public UpdateGaussMySqlQuotasResponse withQuotaList(List<SetQuota> quotaList) {
        this.quotaList = quotaList;
        return this;
    }

    
    public UpdateGaussMySqlQuotasResponse addQuotaListItem(SetQuota quotaListItem) {
        if(this.quotaList == null) {
            this.quotaList = new ArrayList<>();
        }
        this.quotaList.add(quotaListItem);
        return this;
    }

    public UpdateGaussMySqlQuotasResponse withQuotaList(Consumer<List<SetQuota>> quotaListSetter) {
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
    public List<SetQuota> getQuotaList() {
        return quotaList;
    }

    public void setQuotaList(List<SetQuota> quotaList) {
        this.quotaList = quotaList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateGaussMySqlQuotasResponse updateGaussMySqlQuotasResponse = (UpdateGaussMySqlQuotasResponse) o;
        return Objects.equals(this.quotaList, updateGaussMySqlQuotasResponse.quotaList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(quotaList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateGaussMySqlQuotasResponse {\n");
        sb.append("    quotaList: ").append(toIndentedString(quotaList)).append("\n");
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

