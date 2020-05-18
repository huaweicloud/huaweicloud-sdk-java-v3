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
public class ListDatastoreVersionsRequest  {

    /**
     * Gets or Sets datastoreName
     */
    public static class DatastoreNameEnum {

        
        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final DatastoreNameEnum DDS_COMMUNITY = new DatastoreNameEnum("DDS-Community");

        
        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final DatastoreNameEnum DDS_ENHANCED = new DatastoreNameEnum("DDS-Enhanced");

        

        public static Map<String, DatastoreNameEnum> staticFields =
                new HashMap<String, DatastoreNameEnum>() {
                    { 
                        put("DDS-Community", DDS_COMMUNITY);
                        put("DDS-Enhanced", DDS_ENHANCED);
                    }
                };

        private String value;

        DatastoreNameEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DatastoreNameEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DatastoreNameEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DatastoreNameEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DatastoreNameEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DatastoreNameEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DatastoreNameEnum) {
                return this.value.equals(((DatastoreNameEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_name")
    
    private DatastoreNameEnum datastoreName;

    public ListDatastoreVersionsRequest withDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
        return this;
    }

    


    /**
     * Get datastoreName
     * @return datastoreName
     */
    public DatastoreNameEnum getDatastoreName() {
        return datastoreName;
    }

    public void setDatastoreName(DatastoreNameEnum datastoreName) {
        this.datastoreName = datastoreName;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListDatastoreVersionsRequest listDatastoreVersionsRequest = (ListDatastoreVersionsRequest) o;
        return Objects.equals(this.datastoreName, listDatastoreVersionsRequest.datastoreName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(datastoreName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatastoreVersionsRequest {\n");
            sb.append("    datastoreName: ").append(toIndentedString(datastoreName)).append("\n");
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

