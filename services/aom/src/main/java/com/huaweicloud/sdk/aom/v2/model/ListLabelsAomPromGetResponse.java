package com.huaweicloud.sdk.aom.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListLabelsAomPromGetResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    
    private List<String> data = null;
    
    public ListLabelsAomPromGetResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 响应状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    

    public ListLabelsAomPromGetResponse withData(List<String> data) {
        this.data = data;
        return this;
    }

    
    public ListLabelsAomPromGetResponse addDataItem(String dataItem) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ListLabelsAomPromGetResponse withData(Consumer<List<String>> dataSetter) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * 标签值信息。
     * @return data
     */
    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLabelsAomPromGetResponse listLabelsAomPromGetResponse = (ListLabelsAomPromGetResponse) o;
        return Objects.equals(this.status, listLabelsAomPromGetResponse.status) &&
            Objects.equals(this.data, listLabelsAomPromGetResponse.data);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, data);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelsAomPromGetResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

