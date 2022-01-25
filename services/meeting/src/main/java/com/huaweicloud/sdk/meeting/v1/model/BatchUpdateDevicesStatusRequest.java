package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class BatchUpdateDevicesStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept-Language")

    private String acceptLanguage;

    /** 状态。 * 0、启用 * 1、停用 */
    public static final class ValueEnum {

        /** Enum NUMBER_0 for value: 0 */
        public static final ValueEnum NUMBER_0 = new ValueEnum(0);

        /** Enum NUMBER_1 for value: 1 */
        public static final ValueEnum NUMBER_1 = new ValueEnum(1);

        private static final Map<Integer, ValueEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, ValueEnum> createStaticFields() {
            Map<Integer, ValueEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        ValueEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ValueEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            ValueEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ValueEnum(value);
            }
            return result;
        }

        public static ValueEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            ValueEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ValueEnum) {
                return this.value.equals(((ValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private ValueEnum value;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private List<String> body = null;

    public BatchUpdateDevicesStatusRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /** 请求requestId，用来标识一路请求，用于问题跟踪定位，建议使用uuId，若不携带，则后台自动生成
     * 
     * @return xRequestId */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public BatchUpdateDevicesStatusRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** 语言参数，默认为中文zh-CN, 英文为en-US
     * 
     * @return acceptLanguage */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public BatchUpdateDevicesStatusRequest withValue(ValueEnum value) {
        this.value = value;
        return this;
    }

    /** 状态。 * 0、启用 * 1、停用
     * 
     * @return value */
    public ValueEnum getValue() {
        return value;
    }

    public void setValue(ValueEnum value) {
        this.value = value;
    }

    public BatchUpdateDevicesStatusRequest withBody(List<String> body) {
        this.body = body;
        return this;
    }

    public BatchUpdateDevicesStatusRequest addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public BatchUpdateDevicesStatusRequest withBody(Consumer<List<String>> bodySetter) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /** 终端序列号列表，当SN对应的终端状态一致的，则忽略该记录 maxLength：100 minLength：1
     * 
     * @return body */
    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateDevicesStatusRequest batchUpdateDevicesStatusRequest = (BatchUpdateDevicesStatusRequest) o;
        return Objects.equals(this.xRequestId, batchUpdateDevicesStatusRequest.xRequestId)
            && Objects.equals(this.acceptLanguage, batchUpdateDevicesStatusRequest.acceptLanguage)
            && Objects.equals(this.value, batchUpdateDevicesStatusRequest.value)
            && Objects.equals(this.body, batchUpdateDevicesStatusRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, value, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateDevicesStatusRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
