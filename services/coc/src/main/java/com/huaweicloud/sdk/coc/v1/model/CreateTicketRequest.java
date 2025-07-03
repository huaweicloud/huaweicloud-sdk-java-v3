package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreateTicketRequest {

    /**
     * **参数解释：** 需要创建的工单类型，如需创建变更单传值change，如需创建问题单传值issues_mgmt。 **约束限制：** 不涉及 **取值范围：** 枚举值：change/issues_mgmt 当前支持的工单类型：变更单传值change，问题单传值issues_mgmt **默认取值：** incident
     */
    public static final class TicketTypeEnum {

        /**
         * Enum CHANGE for value: "change"
         */
        public static final TicketTypeEnum CHANGE = new TicketTypeEnum("change");

        /**
         * Enum ISSUES_MGMT for value: "issues_mgmt"
         */
        public static final TicketTypeEnum ISSUES_MGMT = new TicketTypeEnum("issues_mgmt");

        private static final Map<String, TicketTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TicketTypeEnum> createStaticFields() {
            Map<String, TicketTypeEnum> map = new HashMap<>();
            map.put("change", CHANGE);
            map.put("issues_mgmt", ISSUES_MGMT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TicketTypeEnum(String value) {
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
        public static TicketTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TicketTypeEnum(value));
        }

        public static TicketTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TicketTypeEnum) {
                return this.value.equals(((TicketTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket_type")

    private TicketTypeEnum ticketType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private CreateCocTicketRequestBody body;

    public CreateTicketRequest withTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
        return this;
    }

    /**
     * **参数解释：** 需要创建的工单类型，如需创建变更单传值change，如需创建问题单传值issues_mgmt。 **约束限制：** 不涉及 **取值范围：** 枚举值：change/issues_mgmt 当前支持的工单类型：变更单传值change，问题单传值issues_mgmt **默认取值：** incident
     * @return ticketType
     */
    public TicketTypeEnum getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketTypeEnum ticketType) {
        this.ticketType = ticketType;
    }

    public CreateTicketRequest withBody(CreateCocTicketRequestBody body) {
        this.body = body;
        return this;
    }

    public CreateTicketRequest withBody(Consumer<CreateCocTicketRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new CreateCocTicketRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public CreateCocTicketRequestBody getBody() {
        return body;
    }

    public void setBody(CreateCocTicketRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTicketRequest that = (CreateTicketRequest) obj;
        return Objects.equals(this.ticketType, that.ticketType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTicketRequest {\n");
        sb.append("    ticketType: ").append(toIndentedString(ticketType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
