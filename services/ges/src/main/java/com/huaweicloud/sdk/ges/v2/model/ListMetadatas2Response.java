package com.huaweicloud.sdk.ges.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ListMetadatasRespSchemaList;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMetadatas2Response extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema_count")
    

    private Integer schemaCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schema_list")
    
    private List<ListMetadatasRespSchemaList> schemaList = null;
    
    public ListMetadatas2Response withSchemaCount(Integer schemaCount) {
        this.schemaCount = schemaCount;
        return this;
    }

    


    /**
     * 元数据返回个数。请求失败时，字段为空。
     * @return schemaCount
     */
    public Integer getSchemaCount() {
        return schemaCount;
    }

    public void setSchemaCount(Integer schemaCount) {
        this.schemaCount = schemaCount;
    }

    

    public ListMetadatas2Response withSchemaList(List<ListMetadatasRespSchemaList> schemaList) {
        this.schemaList = schemaList;
        return this;
    }

    
    public ListMetadatas2Response addSchemaListItem(ListMetadatasRespSchemaList schemaListItem) {
        if(this.schemaList == null) {
            this.schemaList = new ArrayList<>();
        }
        this.schemaList.add(schemaListItem);
        return this;
    }

    public ListMetadatas2Response withSchemaList(Consumer<List<ListMetadatasRespSchemaList>> schemaListSetter) {
        if(this.schemaList == null) {
            this.schemaList = new ArrayList<>();
        }
        schemaListSetter.accept(this.schemaList);
        return this;
    }

    /**
     * 当前projectId下的所有元数据列表。请求失败时，字段为空。
     * @return schemaList
     */
    public List<ListMetadatasRespSchemaList> getSchemaList() {
        return schemaList;
    }

    public void setSchemaList(List<ListMetadatasRespSchemaList> schemaList) {
        this.schemaList = schemaList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListMetadatas2Response listMetadatas2Response = (ListMetadatas2Response) o;
        return Objects.equals(this.schemaCount, listMetadatas2Response.schemaCount) &&
            Objects.equals(this.schemaList, listMetadatas2Response.schemaList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(schemaCount, schemaList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetadatas2Response {\n");
        sb.append("    schemaCount: ").append(toIndentedString(schemaCount)).append("\n");
        sb.append("    schemaList: ").append(toIndentedString(schemaList)).append("\n");
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

