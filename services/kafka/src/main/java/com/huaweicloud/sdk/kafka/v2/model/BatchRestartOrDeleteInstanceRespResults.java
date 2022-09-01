package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * BatchRestartOrDeleteInstanceRespResults
 */
public class BatchRestartOrDeleteInstanceRespResults {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private String result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    @JacksonXmlProperty(localName = "instance")

    private String instance;

    public BatchRestartOrDeleteInstanceRespResults withResult(String result) {
        this.result = result;
        return this;
    }

    /**
     * 操作结果。   - success: 操作成功   - failed: 操作失败 
     * @return result
     */
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public BatchRestartOrDeleteInstanceRespResults withInstance(String instance) {
        this.instance = instance;
        return this;
    }

    /**
     * 实例ID。
     * @return instance
     */
    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchRestartOrDeleteInstanceRespResults batchRestartOrDeleteInstanceRespResults =
            (BatchRestartOrDeleteInstanceRespResults) o;
        return Objects.equals(this.result, batchRestartOrDeleteInstanceRespResults.result)
            && Objects.equals(this.instance, batchRestartOrDeleteInstanceRespResults.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRestartOrDeleteInstanceRespResults {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    instance: ").append(toIndentedString(instance)).append("\n");
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
