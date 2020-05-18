package com.huaweicloud.sdk.dds.v3.model;

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
public class ListFlavorsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="region")
    
    private String region;
    /**
     * Gets or Sets engineName
     */
    public static class EngineNameEnum {

        
        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final EngineNameEnum DDS_COMMUNITY = new EngineNameEnum("DDS-Community");

        
        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final EngineNameEnum DDS_ENHANCED = new EngineNameEnum("DDS-Enhanced");

        

        public static Map<String, EngineNameEnum> staticFields =
                new HashMap<String, EngineNameEnum>() {
                    { 
                        put("DDS-Community", DDS_COMMUNITY);
                        put("DDS-Enhanced", DDS_ENHANCED);
                    }
                };

        private String value;

        EngineNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EngineNameEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            EngineNameEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new EngineNameEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static EngineNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineNameEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineNameEnum) {
                return this.value.equals(((EngineNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_name")
    
    private EngineNameEnum engineName;

    public ListFlavorsRequest withRegion(String region) {
        this.region = region;
        return this;
    }

    


    /**
     * Get region
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ListFlavorsRequest withEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
        return this;
    }

    


    /**
     * Get engineName
     * @return engineName
     */
    public EngineNameEnum getEngineName() {
        return engineName;
    }

    public void setEngineName(EngineNameEnum engineName) {
        this.engineName = engineName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFlavorsRequest listFlavorsRequest = (ListFlavorsRequest) o;
        return Objects.equals(this.region, listFlavorsRequest.region) &&
            Objects.equals(this.engineName, listFlavorsRequest.engineName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(region, engineName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFlavorsRequest {\n");
            sb.append("    region: ").append(toIndentedString(region)).append("\n");
            sb.append("    engineName: ").append(toIndentedString(engineName)).append("\n");
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

