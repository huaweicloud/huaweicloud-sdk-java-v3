package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowOutputInfoRequest {

    /**
     * true
     */
    public static final class DataDisplayEnum {

        /**
         * Enum TRUE for value: "true"
         */
        public static final DataDisplayEnum TRUE = new DataDisplayEnum("true");

        private static final Map<String, DataDisplayEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DataDisplayEnum> createStaticFields() {
            Map<String, DataDisplayEnum> map = new HashMap<>();
            map.put("true", TRUE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DataDisplayEnum(String value) {
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
        public static DataDisplayEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DataDisplayEnum(value));
        }

        public static DataDisplayEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DataDisplayEnum) {
                return this.value.equals(((DataDisplayEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_display")

    private DataDisplayEnum dataDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow_id")

    private String flowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_name")

    private String outputName;

    public ShowOutputInfoRequest withDataDisplay(DataDisplayEnum dataDisplay) {
        this.dataDisplay = dataDisplay;
        return this;
    }

    /**
     * true
     * @return dataDisplay
     */
    public DataDisplayEnum getDataDisplay() {
        return dataDisplay;
    }

    public void setDataDisplay(DataDisplayEnum dataDisplay) {
        this.dataDisplay = dataDisplay;
    }

    public ShowOutputInfoRequest withFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }

    /**
     * 流id
     * @return flowId
     */
    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId;
    }

    public ShowOutputInfoRequest withOutputName(String outputName) {
        this.outputName = outputName;
        return this;
    }

    /**
     * 输出名称
     * @return outputName
     */
    public String getOutputName() {
        return outputName;
    }

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowOutputInfoRequest that = (ShowOutputInfoRequest) obj;
        return Objects.equals(this.dataDisplay, that.dataDisplay) && Objects.equals(this.flowId, that.flowId)
            && Objects.equals(this.outputName, that.outputName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataDisplay, flowId, outputName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowOutputInfoRequest {\n");
        sb.append("    dataDisplay: ").append(toIndentedString(dataDisplay)).append("\n");
        sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
        sb.append("    outputName: ").append(toIndentedString(outputName)).append("\n");
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
