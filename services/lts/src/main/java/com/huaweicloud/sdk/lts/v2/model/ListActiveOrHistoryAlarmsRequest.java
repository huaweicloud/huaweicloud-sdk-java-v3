package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListActiveOrHistoryAlarmsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    /** 是活动告警还是历史告警 */
    public static final class TypeEnum {

        /** Enum ACTIVE_ALERT for value: "active_alert" */
        public static final TypeEnum ACTIVE_ALERT = new TypeEnum("active_alert");

        /** Enum HISTORY_ALERT for value: "history_alert" */
        public static final TypeEnum HISTORY_ALERT = new TypeEnum("history_alert");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("active_alert", ACTIVE_ALERT);
            map.put("history_alert", HISTORY_ALERT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ListActiveOrHistoryAlarmsRequestBody body;

    public ListActiveOrHistoryAlarmsRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /** domainId
     * 
     * @return domainId */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ListActiveOrHistoryAlarmsRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 是活动告警还是历史告警
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ListActiveOrHistoryAlarmsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 取值为上一页数据的最后一条记录的id(填写上一页数据返回得previous_marker或者next_marker值。)
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListActiveOrHistoryAlarmsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页数据量 minimum: 0 maximum: 1000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListActiveOrHistoryAlarmsRequest withBody(ListActiveOrHistoryAlarmsRequestBody body) {
        this.body = body;
        return this;
    }

    public ListActiveOrHistoryAlarmsRequest withBody(Consumer<ListActiveOrHistoryAlarmsRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ListActiveOrHistoryAlarmsRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public ListActiveOrHistoryAlarmsRequestBody getBody() {
        return body;
    }

    public void setBody(ListActiveOrHistoryAlarmsRequestBody body) {
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
        ListActiveOrHistoryAlarmsRequest listActiveOrHistoryAlarmsRequest = (ListActiveOrHistoryAlarmsRequest) o;
        return Objects.equals(this.domainId, listActiveOrHistoryAlarmsRequest.domainId)
            && Objects.equals(this.type, listActiveOrHistoryAlarmsRequest.type)
            && Objects.equals(this.marker, listActiveOrHistoryAlarmsRequest.marker)
            && Objects.equals(this.limit, listActiveOrHistoryAlarmsRequest.limit)
            && Objects.equals(this.body, listActiveOrHistoryAlarmsRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainId, type, marker, limit, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActiveOrHistoryAlarmsRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
