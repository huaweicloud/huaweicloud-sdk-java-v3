package com.huaweicloud.sdk.secmaster.v2.model;

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

/**
 * CreateAlertRuleSimulationRequestBody
 */
public class CreateAlertRuleSimulationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipe_id")

    private String pipeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    /**
     * query_type. SQL, CBSL.
     */
    public static final class QueryTypeEnum {

        /**
         * Enum SQL for value: "SQL"
         */
        public static final QueryTypeEnum SQL = new QueryTypeEnum("SQL");

        /**
         * Enum CBSL for value: "CBSL"
         */
        public static final QueryTypeEnum CBSL = new QueryTypeEnum("CBSL");

        private static final Map<String, QueryTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, QueryTypeEnum> createStaticFields() {
            Map<String, QueryTypeEnum> map = new HashMap<>();
            map.put("SQL", SQL);
            map.put("CBSL", CBSL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        QueryTypeEnum(String value) {
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
        public static QueryTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            QueryTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new QueryTypeEnum(value);
            }
            return result;
        }

        public static QueryTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            QueryTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof QueryTypeEnum) {
                return this.value.equals(((QueryTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query_type")

    private QueryTypeEnum queryType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_grouping")

    private Boolean eventGrouping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<AlertRuleTrigger> triggers = null;

    public CreateAlertRuleSimulationRequestBody withPipeId(String pipeId) {
        this.pipeId = pipeId;
        return this;
    }

    /**
     * pipe_id
     * @return pipeId
     */
    public String getPipeId() {
        return pipeId;
    }

    public void setPipeId(String pipeId) {
        this.pipeId = pipeId;
    }

    public CreateAlertRuleSimulationRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * query
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public CreateAlertRuleSimulationRequestBody withQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
        return this;
    }

    /**
     * query_type. SQL, CBSL.
     * @return queryType
     */
    public QueryTypeEnum getQueryType() {
        return queryType;
    }

    public void setQueryType(QueryTypeEnum queryType) {
        this.queryType = queryType;
    }

    public CreateAlertRuleSimulationRequestBody withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * from
     * minimum: 0
     * maximum: 9223372036854775807
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public CreateAlertRuleSimulationRequestBody withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * from
     * minimum: 0
     * maximum: 9223372036854775807
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public CreateAlertRuleSimulationRequestBody withEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
        return this;
    }

    /**
     * event_grouping
     * @return eventGrouping
     */
    public Boolean getEventGrouping() {
        return eventGrouping;
    }

    public void setEventGrouping(Boolean eventGrouping) {
        this.eventGrouping = eventGrouping;
    }

    public CreateAlertRuleSimulationRequestBody withTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public CreateAlertRuleSimulationRequestBody addTriggersItem(AlertRuleTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public CreateAlertRuleSimulationRequestBody withTriggers(Consumer<List<AlertRuleTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * triggers
     * @return triggers
     */
    public List<AlertRuleTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<AlertRuleTrigger> triggers) {
        this.triggers = triggers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAlertRuleSimulationRequestBody createAlertRuleSimulationRequestBody =
            (CreateAlertRuleSimulationRequestBody) o;
        return Objects.equals(this.pipeId, createAlertRuleSimulationRequestBody.pipeId)
            && Objects.equals(this.query, createAlertRuleSimulationRequestBody.query)
            && Objects.equals(this.queryType, createAlertRuleSimulationRequestBody.queryType)
            && Objects.equals(this.from, createAlertRuleSimulationRequestBody.from)
            && Objects.equals(this.to, createAlertRuleSimulationRequestBody.to)
            && Objects.equals(this.eventGrouping, createAlertRuleSimulationRequestBody.eventGrouping)
            && Objects.equals(this.triggers, createAlertRuleSimulationRequestBody.triggers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipeId, query, queryType, from, to, eventGrouping, triggers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAlertRuleSimulationRequestBody {\n");
        sb.append("    pipeId: ").append(toIndentedString(pipeId)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    queryType: ").append(toIndentedString(queryType)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    eventGrouping: ").append(toIndentedString(eventGrouping)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
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
