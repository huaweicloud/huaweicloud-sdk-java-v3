package com.huaweicloud.sdk.ges.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v1.model.Metadata;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListMetadatasResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorMessage")
    
    
    private String errorMessage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorCode")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaCount")
    
    
    private Integer schemaCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="schemaList")
    
    
    private List<Metadata> schemaList = null;
    
    public ListMetadatasResponse withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    

    public ListMetadatasResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 系统提示信息，执行成功时，字段可能为空。执行失败时，用于显示错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public ListMetadatasResponse withSchemaCount(Integer schemaCount) {
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

    

    public ListMetadatasResponse withSchemaList(List<Metadata> schemaList) {
        this.schemaList = schemaList;
        return this;
    }

    
    public ListMetadatasResponse addSchemaListItem(Metadata schemaListItem) {
        if(this.schemaList == null) {
            this.schemaList = new ArrayList<>();
        }
        this.schemaList.add(schemaListItem);
        return this;
    }

    public ListMetadatasResponse withSchemaList(Consumer<List<Metadata>> schemaListSetter) {
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
    public List<Metadata> getSchemaList() {
        return schemaList;
    }

    public void setSchemaList(List<Metadata> schemaList) {
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
        ListMetadatasResponse listMetadatasResponse = (ListMetadatasResponse) o;
        return Objects.equals(this.errorMessage, listMetadatasResponse.errorMessage) &&
            Objects.equals(this.errorCode, listMetadatasResponse.errorCode) &&
            Objects.equals(this.schemaCount, listMetadatasResponse.schemaCount) &&
            Objects.equals(this.schemaList, listMetadatasResponse.schemaList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(errorMessage, errorCode, schemaCount, schemaList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetadatasResponse {\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
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

