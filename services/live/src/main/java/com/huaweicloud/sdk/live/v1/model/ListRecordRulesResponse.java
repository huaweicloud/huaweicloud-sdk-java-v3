package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRecordRulesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_config")

    @JacksonXmlProperty(localName = "record_config")

    private List<RecordRule> recordConfig = null;

    public ListRecordRulesResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 查询结果的总元素数量
     * minimum: 0
     * maximum: 1024000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRecordRulesResponse withRecordConfig(List<RecordRule> recordConfig) {
        this.recordConfig = recordConfig;
        return this;
    }

    public ListRecordRulesResponse addRecordConfigItem(RecordRule recordConfigItem) {
        if (this.recordConfig == null) {
            this.recordConfig = new ArrayList<>();
        }
        this.recordConfig.add(recordConfigItem);
        return this;
    }

    public ListRecordRulesResponse withRecordConfig(Consumer<List<RecordRule>> recordConfigSetter) {
        if (this.recordConfig == null) {
            this.recordConfig = new ArrayList<>();
        }
        recordConfigSetter.accept(this.recordConfig);
        return this;
    }

    /**
     * 录制配置数组
     * @return recordConfig
     */
    public List<RecordRule> getRecordConfig() {
        return recordConfig;
    }

    public void setRecordConfig(List<RecordRule> recordConfig) {
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
        ListRecordRulesResponse listRecordRulesResponse = (ListRecordRulesResponse) o;
        return Objects.equals(this.total, listRecordRulesResponse.total)
            && Objects.equals(this.recordConfig, listRecordRulesResponse.recordConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, recordConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRecordRulesResponse {\n");
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
