package com.huaweicloud.sdk.evs.v2.model;

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
 * Request Object
 */
public class CinderListQuotasRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="target_project_id")
    
    private String targetProjectId;
    /**
     * Gets or Sets usage
     */
    public static class UsageEnum {

        
        /**
         * Enum TRUE for value: "true"
         */
        public static final UsageEnum TRUE = new UsageEnum("true");

        

        public static Map<String, UsageEnum> staticFields =
                new HashMap<String, UsageEnum>() {
                    { 
                        put("true", TRUE);
                    }
                };

        private String value;

        UsageEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static UsageEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            UsageEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new UsageEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static UsageEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            UsageEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof UsageEnum) {
                return this.value.equals(((UsageEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="usage")
    
    private UsageEnum usage;

    public CinderListQuotasRequest withTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }

    


    /**
     * Get targetProjectId
     * @return targetProjectId
     */
    public String getTargetProjectId() {
        return targetProjectId;
    }

    public void setTargetProjectId(String targetProjectId) {
        this.targetProjectId = targetProjectId;
    }

    public CinderListQuotasRequest withUsage(UsageEnum usage) {
        this.usage = usage;
        return this;
    }

    


    /**
     * Get usage
     * @return usage
     */
    public UsageEnum getUsage() {
        return usage;
    }

    public void setUsage(UsageEnum usage) {
        this.usage = usage;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinderListQuotasRequest cinderListQuotasRequest = (CinderListQuotasRequest) o;
        return Objects.equals(this.targetProjectId, cinderListQuotasRequest.targetProjectId) &&
            Objects.equals(this.usage, cinderListQuotasRequest.usage);
    }
    @Override
    public int hashCode() {
        return Objects.hash(targetProjectId, usage);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinderListQuotasRequest {\n");
            sb.append("    targetProjectId: ").append(toIndentedString(targetProjectId)).append("\n");
            sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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

