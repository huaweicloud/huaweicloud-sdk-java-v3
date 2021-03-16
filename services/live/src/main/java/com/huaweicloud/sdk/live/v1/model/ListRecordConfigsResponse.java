package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.RecordConfigInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListRecordConfigsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total")
    
    private Integer total;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_config")
    
    private List<RecordConfigInfo> recordConfig = null;
    
    public ListRecordConfigsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    


    /**
     * 查询结果的总元素数量
     * minimum: 0
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    

    public ListRecordConfigsResponse withRecordConfig(List<RecordConfigInfo> recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }

    
    public ListRecordConfigsResponse addRecordConfigItem(RecordConfigInfo recordConfigItem) {
        this.recordConfig.add(recordConfigItem);
        return this;
    }

    public ListRecordConfigsResponse withRecordConfig(Consumer<List<RecordConfigInfo>> recordConfigSetter) {
        if(this.recordConfig == null ){
            this.recordConfig = new ArrayList<>();
        }
        recordConfigSetter.accept(this.recordConfig);
        return this;
    }

    /**
     * 录制配置数组
     * @return recordConfig
     */
    public List<RecordConfigInfo> getRecordConfig() {
        return recordConfig;
    }

    public void setRecordConfig(List<RecordConfigInfo> recordConfig) {
        this.recordConfig = recordConfig;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordConfigsResponse listRecordConfigsResponse = (ListRecordConfigsResponse) o;
        return Objects.equals(this.total, listRecordConfigsResponse.total) &&
            Objects.equals(this.recordConfig, listRecordConfigsResponse.recordConfig);
    }
    @Override
    public int hashCode() {
        return Objects.hash(total, recordConfig);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordConfigsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    recordConfig: ").append(toIndentedString(recordConfig)).append("\n");
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

