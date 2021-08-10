package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ListRecordCallbackConfigsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private List<RecordCallbackConfig> callbackConfig = null;

    public ListRecordCallbackConfigsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /** 查询结果的总元素数量 minimum: 0
     * 
     * @return total */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRecordCallbackConfigsResponse withCallbackConfig(List<RecordCallbackConfig> callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public ListRecordCallbackConfigsResponse addCallbackConfigItem(RecordCallbackConfig callbackConfigItem) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new ArrayList<>();
        }
        this.callbackConfig.add(callbackConfigItem);
        return this;
    }

    public ListRecordCallbackConfigsResponse withCallbackConfig(
        Consumer<List<RecordCallbackConfig>> callbackConfigSetter) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new ArrayList<>();
        }
        callbackConfigSetter.accept(this.callbackConfig);
        return this;
    }

    /** 回调配置
     * 
     * @return callbackConfig */
    public List<RecordCallbackConfig> getCallbackConfig() {
        return callbackConfig;
    }

    public void setCallbackConfig(List<RecordCallbackConfig> callbackConfig) {
        this.callbackConfig = callbackConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListRecordCallbackConfigsResponse listRecordCallbackConfigsResponse = (ListRecordCallbackConfigsResponse) o;
        return Objects.equals(this.total, listRecordCallbackConfigsResponse.total)
            && Objects.equals(this.callbackConfig, listRecordCallbackConfigsResponse.callbackConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, callbackConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordCallbackConfigsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
