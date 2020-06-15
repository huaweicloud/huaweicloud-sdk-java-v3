package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Response Object
 */
public class CreateMigrationTaskResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING
     */
    public static class StatusEnum {

        
        /**
         * Enum SUCCESS for value: "SUCCESS"
         */
        public static final StatusEnum SUCCESS = new StatusEnum("SUCCESS");

        
        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final StatusEnum FAILED = new StatusEnum("FAILED");

        
        /**
         * Enum MIGRATING for value: "MIGRATING"
         */
        public static final StatusEnum MIGRATING = new StatusEnum("MIGRATING");

        

        public static Map<String, StatusEnum> staticFields =
                new HashMap<String, StatusEnum>() {
                    { 
                        put("SUCCESS", SUCCESS);
                        put("FAILED", FAILED);
                        put("MIGRATING", MIGRATING);
                    }
                };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;

    public CreateMigrationTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 迁移任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateMigrationTaskResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 迁移任务名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateMigrationTaskResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 迁移任务状态，这个字段的值包括：SUCCESS, FAILED, MIGRATING
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMigrationTaskResponse createMigrationTaskResponse = (CreateMigrationTaskResponse) o;
        return Objects.equals(this.id, createMigrationTaskResponse.id) &&
            Objects.equals(this.name, createMigrationTaskResponse.name) &&
            Objects.equals(this.status, createMigrationTaskResponse.status);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMigrationTaskResponse {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

