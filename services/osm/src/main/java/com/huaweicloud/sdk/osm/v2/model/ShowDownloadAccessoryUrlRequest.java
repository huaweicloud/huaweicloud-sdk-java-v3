package com.huaweicloud.sdk.osm.v2.model;

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
public class ShowDownloadAccessoryUrlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accessory_id")

    private String accessoryId;

    /**
     * - DEFAULT:  - NO_RELATION:  - NOTIFICATION:  - INCIDENT:  - MESSAGE:  - INSPECTION:  - CONNECT:  
     */
    public static final class RelationTypeEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final RelationTypeEnum DEFAULT = new RelationTypeEnum("DEFAULT");

        /**
         * Enum NO_RELATION for value: "NO_RELATION"
         */
        public static final RelationTypeEnum NO_RELATION = new RelationTypeEnum("NO_RELATION");

        /**
         * Enum NOTIFICATION for value: "NOTIFICATION"
         */
        public static final RelationTypeEnum NOTIFICATION = new RelationTypeEnum("NOTIFICATION");

        /**
         * Enum INCIDENT for value: "INCIDENT"
         */
        public static final RelationTypeEnum INCIDENT = new RelationTypeEnum("INCIDENT");

        /**
         * Enum MESSAGE for value: "MESSAGE"
         */
        public static final RelationTypeEnum MESSAGE = new RelationTypeEnum("MESSAGE");

        /**
         * Enum INSPECTION for value: "INSPECTION"
         */
        public static final RelationTypeEnum INSPECTION = new RelationTypeEnum("INSPECTION");

        /**
         * Enum CONNECT for value: "CONNECT"
         */
        public static final RelationTypeEnum CONNECT = new RelationTypeEnum("CONNECT");

        private static final Map<String, RelationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RelationTypeEnum> createStaticFields() {
            Map<String, RelationTypeEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("NO_RELATION", NO_RELATION);
            map.put("NOTIFICATION", NOTIFICATION);
            map.put("INCIDENT", INCIDENT);
            map.put("MESSAGE", MESSAGE);
            map.put("INSPECTION", INSPECTION);
            map.put("CONNECT", CONNECT);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RelationTypeEnum(String value) {
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
        public static RelationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            RelationTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RelationTypeEnum(value);
            }
            return result;
        }

        public static RelationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            RelationTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RelationTypeEnum) {
                return this.value.equals(((RelationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_type")

    private RelationTypeEnum relationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_id")

    private String relationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incident_id")

    private String incidentId;

    public ShowDownloadAccessoryUrlRequest withAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
        return this;
    }

    /**
     * 附件id
     * @return accessoryId
     */
    public String getAccessoryId() {
        return accessoryId;
    }

    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    public ShowDownloadAccessoryUrlRequest withRelationType(RelationTypeEnum relationType) {
        this.relationType = relationType;
        return this;
    }

    /**
     * - DEFAULT:  - NO_RELATION:  - NOTIFICATION:  - INCIDENT:  - MESSAGE:  - INSPECTION:  - CONNECT:  
     * @return relationType
     */
    public RelationTypeEnum getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationTypeEnum relationType) {
        this.relationType = relationType;
    }

    public ShowDownloadAccessoryUrlRequest withRelationId(String relationId) {
        this.relationId = relationId;
        return this;
    }

    /**
     * 关联id
     * @return relationId
     */
    public String getRelationId() {
        return relationId;
    }

    public void setRelationId(String relationId) {
        this.relationId = relationId;
    }

    public ShowDownloadAccessoryUrlRequest withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * 工单id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDownloadAccessoryUrlRequest showDownloadAccessoryUrlRequest = (ShowDownloadAccessoryUrlRequest) o;
        return Objects.equals(this.accessoryId, showDownloadAccessoryUrlRequest.accessoryId)
            && Objects.equals(this.relationType, showDownloadAccessoryUrlRequest.relationType)
            && Objects.equals(this.relationId, showDownloadAccessoryUrlRequest.relationId)
            && Objects.equals(this.incidentId, showDownloadAccessoryUrlRequest.incidentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessoryId, relationType, relationId, incidentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDownloadAccessoryUrlRequest {\n");
        sb.append("    accessoryId: ").append(toIndentedString(accessoryId)).append("\n");
        sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
        sb.append("    relationId: ").append(toIndentedString(relationId)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
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
