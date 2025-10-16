package com.huaweicloud.sdk.cpcs.v1.model;

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
public class DeleteClusterPortRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    /**
     * DELETE_DB 仅删除CPCS数据库中的记录，不删除elb资源。 TRY_DELETE 当被删除的端口的wrong字段为false时，删除elb资源。不为false时仅删除数据库。 FORCE_DELETE 删除cpcs数据库和elb资源
     */
    public static final class TypeEnum {

        /**
         * Enum DELETE_DB for value: "DELETE_DB"
         */
        public static final TypeEnum DELETE_DB = new TypeEnum("DELETE_DB");

        /**
         * Enum TRY_DELETE for value: "TRY_DELETE"
         */
        public static final TypeEnum TRY_DELETE = new TypeEnum("TRY_DELETE");

        /**
         * Enum FORCE_DELETE for value: "FORCE_DELETE"
         */
        public static final TypeEnum FORCE_DELETE = new TypeEnum("FORCE_DELETE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("DELETE_DB", DELETE_DB);
            map.put("TRY_DELETE", TRY_DELETE);
            map.put("FORCE_DELETE", FORCE_DELETE);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    public DeleteClusterPortRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public DeleteClusterPortRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 端口的id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeleteClusterPortRequest withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * DELETE_DB 仅删除CPCS数据库中的记录，不删除elb资源。 TRY_DELETE 当被删除的端口的wrong字段为false时，删除elb资源。不为false时仅删除数据库。 FORCE_DELETE 删除cpcs数据库和elb资源
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteClusterPortRequest that = (DeleteClusterPortRequest) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, id, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteClusterPortRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
