package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SinkFGParameters
 */
public class SinkFGParameters {

    /**
     * 函数执行方式,同步/异步
     */
    public static final class InvokeTypeEnum {

        /**
         * Enum SYNC_ASYNC for value: "SYNC，ASYNC"
         */
        public static final InvokeTypeEnum SYNC_ASYNC = new InvokeTypeEnum("SYNC，ASYNC");

        private static final Map<String, InvokeTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InvokeTypeEnum> createStaticFields() {
            Map<String, InvokeTypeEnum> map = new HashMap<>();
            map.put("SYNC，ASYNC", SYNC_ASYNC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InvokeTypeEnum(String value) {
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
        public static InvokeTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new InvokeTypeEnum(value));
        }

        public static InvokeTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof InvokeTypeEnum) {
                return this.value.equals(((InvokeTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invoke_type")

    private InvokeTypeEnum invokeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "urn")

    private String urn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency")

    private String agency;

    public SinkFGParameters withInvokeType(InvokeTypeEnum invokeType) {
        this.invokeType = invokeType;
        return this;
    }

    /**
     * 函数执行方式,同步/异步
     * @return invokeType
     */
    public InvokeTypeEnum getInvokeType() {
        return invokeType;
    }

    public void setInvokeType(InvokeTypeEnum invokeType) {
        this.invokeType = invokeType;
    }

    public SinkFGParameters withUrn(String urn) {
        this.urn = urn;
        return this;
    }

    /**
     * 函数链接
     * @return urn
     */
    public String getUrn() {
        return urn;
    }

    public void setUrn(String urn) {
        this.urn = urn;
    }

    public SinkFGParameters withAgency(String agency) {
        this.agency = agency;
        return this;
    }

    /**
     * 租户委托
     * @return agency
     */
    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SinkFGParameters that = (SinkFGParameters) obj;
        return Objects.equals(this.invokeType, that.invokeType) && Objects.equals(this.urn, that.urn)
            && Objects.equals(this.agency, that.agency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invokeType, urn, agency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SinkFGParameters {\n");
        sb.append("    invokeType: ").append(toIndentedString(invokeType)).append("\n");
        sb.append("    urn: ").append(toIndentedString(urn)).append("\n");
        sb.append("    agency: ").append(toIndentedString(agency)).append("\n");
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
