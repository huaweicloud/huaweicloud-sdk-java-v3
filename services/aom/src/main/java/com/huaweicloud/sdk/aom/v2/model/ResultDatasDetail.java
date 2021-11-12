package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.ALSDatasDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResultDatasDetail object，查询结果元数据信息，包括返回总数及结果。
 */
public class ResultDatasDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="data")
    
    
    private List<ALSDatasDetail> data = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    
    private Integer total;

    public ResultDatasDetail withData(List<ALSDatasDetail> data) {
        this.data = data;
        return this;
    }

    
    public ResultDatasDetail addDataItem(ALSDatasDetail dataItem) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        this.data.add(dataItem);
        return this;
    }

    public ResultDatasDetail withData(Consumer<List<ALSDatasDetail>> dataSetter) {
        if(this.data == null) {
            this.data = new ArrayList<>();
        }
        dataSetter.accept(this.data);
        return this;
    }

    /**
     * Array of ALSDatasDetail object  数据数组。
     * @return data
     */
    public List<ALSDatasDetail> getData() {
        return data;
    }

    public void setData(List<ALSDatasDetail> data) {
        this.data = data;
    }

    

    public ResultDatasDetail withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 当前返回结果条数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResultDatasDetail resultDatasDetail = (ResultDatasDetail) o;
        return Objects.equals(this.data, resultDatasDetail.data) &&
            Objects.equals(this.total, resultDatasDetail.total);
    }
    @Override
    public int hashCode() {
        return Objects.hash(data, total);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResultDatasDetail {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

