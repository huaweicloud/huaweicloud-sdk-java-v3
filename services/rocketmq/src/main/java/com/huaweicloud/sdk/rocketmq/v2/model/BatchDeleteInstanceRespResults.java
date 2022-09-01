package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * BatchDeleteInstanceRespResults
 */
public class BatchDeleteInstanceRespResults {

    /**
     * 操作结果。
     */
    public static final class ResultEnum {

        /**
         * Enum SUCCESS for value: "success"
         */
        public static final ResultEnum SUCCESS = new ResultEnum("success");

        /**
         * Enum FAILED for value: "failed"
         */
        public static final ResultEnum FAILED = new ResultEnum("failed");

        private static final Map<String, ResultEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResultEnum> createStaticFields() {
            Map<String, ResultEnum> map = new HashMap<>();
            map.put("success", SUCCESS);
            map.put("failed", FAILED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResultEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResultEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResultEnum(value);
            }
            return result;
        }

        public static ResultEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ResultEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ResultEnum) {
                return this.value.equals(((ResultEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    @JacksonXmlProperty(localName = "result")

    private ResultEnum result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance")

    @JacksonXmlProperty(localName = "instance")

    private String instance;

    public BatchDeleteInstanceRespResults withResult(ResultEnum result) {
        this.result = result;
        return this;
    }

    /**
     * 操作结果。
     * @return result
     */
    public ResultEnum getResult() {
        return result;
    }

    public void setResult(ResultEnum result) {
        this.result = result;
    }

    public BatchDeleteInstanceRespResults withInstance(String instance) {
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
        BatchDeleteInstanceRespResults batchDeleteInstanceRespResults = (BatchDeleteInstanceRespResults) o;
        return Objects.equals(this.result, batchDeleteInstanceRespResults.result)
            && Objects.equals(this.instance, batchDeleteInstanceRespResults.instance);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, instance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteInstanceRespResults {\n");
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
