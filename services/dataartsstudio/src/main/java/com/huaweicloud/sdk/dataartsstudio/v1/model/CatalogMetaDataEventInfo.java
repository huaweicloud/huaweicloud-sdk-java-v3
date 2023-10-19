package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 元数据实时同步的事件详细信息
 */
public class CatalogMetaDataEventInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_ts")

    private Long eventTs;

    /**
     * 事件类型
     */
    public static final class EventTypeEnum {

        /**
         * Enum ADDFOREIGNKEYEVENT for value: "AddForeignKeyEvent"
         */
        public static final EventTypeEnum ADDFOREIGNKEYEVENT = new EventTypeEnum("AddForeignKeyEvent");

        /**
         * Enum ADDNOTNULLCONSTRAINTEVENT for value: "AddNotNullConstraintEvent"
         */
        public static final EventTypeEnum ADDNOTNULLCONSTRAINTEVENT = new EventTypeEnum("AddNotNullConstraintEvent");

        /**
         * Enum ADDPRIMARYKEYEVENT for value: "AddPrimaryKeyEvent"
         */
        public static final EventTypeEnum ADDPRIMARYKEYEVENT = new EventTypeEnum("AddPrimaryKeyEvent");

        /**
         * Enum ADDUNIQUECONSTRAINTEVENT for value: "AddUniqueConstraintEvent"
         */
        public static final EventTypeEnum ADDUNIQUECONSTRAINTEVENT = new EventTypeEnum("AddUniqueConstraintEvent");

        /**
         * Enum ALTERDATABASEEVENT for value: "AlterDatabaseEvent"
         */
        public static final EventTypeEnum ALTERDATABASEEVENT = new EventTypeEnum("AlterDatabaseEvent");

        /**
         * Enum ADDPARTITIONEVENT for value: "AddPartitionEvent"
         */
        public static final EventTypeEnum ADDPARTITIONEVENT = new EventTypeEnum("AddPartitionEvent");

        /**
         * Enum ALTERPARTITIONEVENT for value: "AlterPartitionEvent"
         */
        public static final EventTypeEnum ALTERPARTITIONEVENT = new EventTypeEnum("AlterPartitionEvent");

        /**
         * Enum ALTERTABLEEVENT for value: "AlterTableEvent"
         */
        public static final EventTypeEnum ALTERTABLEEVENT = new EventTypeEnum("AlterTableEvent");

        /**
         * Enum ALTERCATALOGEVENT for value: "AlterCatalogEvent"
         */
        public static final EventTypeEnum ALTERCATALOGEVENT = new EventTypeEnum("AlterCatalogEvent");

        /**
         * Enum CREATECATALOGEVENT for value: "CreateCatalogEvent"
         */
        public static final EventTypeEnum CREATECATALOGEVENT = new EventTypeEnum("CreateCatalogEvent");

        /**
         * Enum CREATEDATABASEEVENT for value: "CreateDatabaseEvent"
         */
        public static final EventTypeEnum CREATEDATABASEEVENT = new EventTypeEnum("CreateDatabaseEvent");

        /**
         * Enum CREATEFUNCTIONEVENT for value: "CreateFunctionEvent"
         */
        public static final EventTypeEnum CREATEFUNCTIONEVENT = new EventTypeEnum("CreateFunctionEvent");

        /**
         * Enum CREATETABLEEVENT for value: "CreateTableEvent"
         */
        public static final EventTypeEnum CREATETABLEEVENT = new EventTypeEnum("CreateTableEvent");

        /**
         * Enum DROPCONSTRAINTEVENT for value: "DropConstraintEvent"
         */
        public static final EventTypeEnum DROPCONSTRAINTEVENT = new EventTypeEnum("DropConstraintEvent");

        /**
         * Enum DROPDATABASEEVENT for value: "DropDatabaseEvent"
         */
        public static final EventTypeEnum DROPDATABASEEVENT = new EventTypeEnum("DropDatabaseEvent");

        /**
         * Enum DROPFUNCTIONEVENT for value: "DropFunctionEvent"
         */
        public static final EventTypeEnum DROPFUNCTIONEVENT = new EventTypeEnum("DropFunctionEvent");

        /**
         * Enum DROPPARTITIONEVENT for value: "DropPartitionEvent"
         */
        public static final EventTypeEnum DROPPARTITIONEVENT = new EventTypeEnum("DropPartitionEvent");

        /**
         * Enum DROPTABLEEVENT for value: "DropTableEvent"
         */
        public static final EventTypeEnum DROPTABLEEVENT = new EventTypeEnum("DropTableEvent");

        /**
         * Enum DROPCATALOGEVENT for value: "DropCatalogEvent"
         */
        public static final EventTypeEnum DROPCATALOGEVENT = new EventTypeEnum("DropCatalogEvent");

        /**
         * Enum ADDINDEXEVENT for value: "AddIndexEvent"
         */
        public static final EventTypeEnum ADDINDEXEVENT = new EventTypeEnum("AddIndexEvent");

        /**
         * Enum ALTERINDEXEVENT for value: "AlterIndexEvent"
         */
        public static final EventTypeEnum ALTERINDEXEVENT = new EventTypeEnum("AlterIndexEvent");

        /**
         * Enum DROPINDEXEVENT for value: "DropIndexEvent"
         */
        public static final EventTypeEnum DROPINDEXEVENT = new EventTypeEnum("DropIndexEvent");

        /**
         * Enum ALTERSCHEMAEVENT for value: "AlterSchemaEvent"
         */
        public static final EventTypeEnum ALTERSCHEMAEVENT = new EventTypeEnum("AlterSchemaEvent");

        /**
         * Enum CREATESCHEMAEVENT for value: "CreateSchemaEvent"
         */
        public static final EventTypeEnum CREATESCHEMAEVENT = new EventTypeEnum("CreateSchemaEvent");

        /**
         * Enum DROPSCHEMAEVENT for value: "DropSchemaEvent"
         */
        public static final EventTypeEnum DROPSCHEMAEVENT = new EventTypeEnum("DropSchemaEvent");

        /**
         * Enum ALTERCOLUMNEVENT for value: "AlterColumnEvent"
         */
        public static final EventTypeEnum ALTERCOLUMNEVENT = new EventTypeEnum("AlterColumnEvent");

        /**
         * Enum ADDCOLUMNEVENT for value: "AddColumnEvent"
         */
        public static final EventTypeEnum ADDCOLUMNEVENT = new EventTypeEnum("AddColumnEvent");

        /**
         * Enum DROPCOLUMNEVENT for value: "DropColumnEvent"
         */
        public static final EventTypeEnum DROPCOLUMNEVENT = new EventTypeEnum("DropColumnEvent");

        /**
         * Enum ALTERTRIGGEREVENT for value: "AlterTriggerEvent"
         */
        public static final EventTypeEnum ALTERTRIGGEREVENT = new EventTypeEnum("AlterTriggerEvent");

        /**
         * Enum ADDTRIGGEREVENT for value: "AddTriggerEvent"
         */
        public static final EventTypeEnum ADDTRIGGEREVENT = new EventTypeEnum("AddTriggerEvent");

        /**
         * Enum DROPTRIGGEREVENT for value: "DropTriggerEvent"
         */
        public static final EventTypeEnum DROPTRIGGEREVENT = new EventTypeEnum("DropTriggerEvent");

        private static final Map<String, EventTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EventTypeEnum> createStaticFields() {
            Map<String, EventTypeEnum> map = new HashMap<>();
            map.put("AddForeignKeyEvent", ADDFOREIGNKEYEVENT);
            map.put("AddNotNullConstraintEvent", ADDNOTNULLCONSTRAINTEVENT);
            map.put("AddPrimaryKeyEvent", ADDPRIMARYKEYEVENT);
            map.put("AddUniqueConstraintEvent", ADDUNIQUECONSTRAINTEVENT);
            map.put("AlterDatabaseEvent", ALTERDATABASEEVENT);
            map.put("AddPartitionEvent", ADDPARTITIONEVENT);
            map.put("AlterPartitionEvent", ALTERPARTITIONEVENT);
            map.put("AlterTableEvent", ALTERTABLEEVENT);
            map.put("AlterCatalogEvent", ALTERCATALOGEVENT);
            map.put("CreateCatalogEvent", CREATECATALOGEVENT);
            map.put("CreateDatabaseEvent", CREATEDATABASEEVENT);
            map.put("CreateFunctionEvent", CREATEFUNCTIONEVENT);
            map.put("CreateTableEvent", CREATETABLEEVENT);
            map.put("DropConstraintEvent", DROPCONSTRAINTEVENT);
            map.put("DropDatabaseEvent", DROPDATABASEEVENT);
            map.put("DropFunctionEvent", DROPFUNCTIONEVENT);
            map.put("DropPartitionEvent", DROPPARTITIONEVENT);
            map.put("DropTableEvent", DROPTABLEEVENT);
            map.put("DropCatalogEvent", DROPCATALOGEVENT);
            map.put("AddIndexEvent", ADDINDEXEVENT);
            map.put("AlterIndexEvent", ALTERINDEXEVENT);
            map.put("DropIndexEvent", DROPINDEXEVENT);
            map.put("AlterSchemaEvent", ALTERSCHEMAEVENT);
            map.put("CreateSchemaEvent", CREATESCHEMAEVENT);
            map.put("DropSchemaEvent", DROPSCHEMAEVENT);
            map.put("AlterColumnEvent", ALTERCOLUMNEVENT);
            map.put("AddColumnEvent", ADDCOLUMNEVENT);
            map.put("DropColumnEvent", DROPCOLUMNEVENT);
            map.put("AlterTriggerEvent", ALTERTRIGGEREVENT);
            map.put("AddTriggerEvent", ADDTRIGGEREVENT);
            map.put("DropTriggerEvent", DROPTRIGGEREVENT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EventTypeEnum(String value) {
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
        public static EventTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EventTypeEnum(value));
        }

        public static EventTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EventTypeEnum) {
                return this.value.equals(((EventTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_type")

    private EventTypeEnum eventType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_message")

    private Object eventMessage;

    public CatalogMetaDataEventInfo withEventTs(Long eventTs) {
        this.eventTs = eventTs;
        return this;
    }

    /**
     * 事件发生时的时间戳
     * @return eventTs
     */
    public Long getEventTs() {
        return eventTs;
    }

    public void setEventTs(Long eventTs) {
        this.eventTs = eventTs;
    }

    public CatalogMetaDataEventInfo withEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * 事件类型
     * @return eventType
     */
    public EventTypeEnum getEventType() {
        return eventType;
    }

    public void setEventType(EventTypeEnum eventType) {
        this.eventType = eventType;
    }

    public CatalogMetaDataEventInfo withEventMessage(Object eventMessage) {
        this.eventMessage = eventMessage;
        return this;
    }

    /**
     * 事件消息，Map<String,Object>结构
     * @return eventMessage
     */
    public Object getEventMessage() {
        return eventMessage;
    }

    public void setEventMessage(Object eventMessage) {
        this.eventMessage = eventMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CatalogMetaDataEventInfo that = (CatalogMetaDataEventInfo) obj;
        return Objects.equals(this.eventTs, that.eventTs) && Objects.equals(this.eventType, that.eventType)
            && Objects.equals(this.eventMessage, that.eventMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventTs, eventType, eventMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CatalogMetaDataEventInfo {\n");
        sb.append("    eventTs: ").append(toIndentedString(eventTs)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
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
