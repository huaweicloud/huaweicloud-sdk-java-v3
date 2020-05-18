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
public class ListInstancesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * Gets or Sets mode
     */
    public static class ModeEnum {

        
        /**
         * Enum SHARDING for value: "Sharding"
         */
        public static final ModeEnum SHARDING = new ModeEnum("Sharding");

        
        /**
         * Enum REPLICASET for value: "ReplicaSet"
         */
        public static final ModeEnum REPLICASET = new ModeEnum("ReplicaSet");

        
        /**
         * Enum SINGLE for value: "Single"
         */
        public static final ModeEnum SINGLE = new ModeEnum("Single");

        

        public static Map<String, ModeEnum> staticFields =
                new HashMap<String, ModeEnum>() {
                    { 
                        put("Sharding", SHARDING);
                        put("ReplicaSet", REPLICASET);
                        put("Single", SINGLE);
                    }
                };

        private String value;

        ModeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ModeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            ModeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ModeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ModeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ModeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mode")
    
    private ModeEnum mode;
    /**
     * Gets or Sets datastoreType
     */
    public static class DatastoreTypeEnum {

        
        /**
         * Enum DDS_COMMUNITY for value: "DDS-Community"
         */
        public static final DatastoreTypeEnum DDS_COMMUNITY = new DatastoreTypeEnum("DDS-Community");

        
        /**
         * Enum DDS_ENHANCED for value: "DDS-Enhanced"
         */
        public static final DatastoreTypeEnum DDS_ENHANCED = new DatastoreTypeEnum("DDS-Enhanced");

        

        public static Map<String, DatastoreTypeEnum> staticFields =
                new HashMap<String, DatastoreTypeEnum>() {
                    { 
                        put("DDS-Community", DDS_COMMUNITY);
                        put("DDS-Enhanced", DDS_ENHANCED);
                    }
                };

        private String value;

        DatastoreTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DatastoreTypeEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DatastoreTypeEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DatastoreTypeEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DatastoreTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DatastoreTypeEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DatastoreTypeEnum) {
                return this.value.equals(((DatastoreTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="datastore_type")
    
    private DatastoreTypeEnum datastoreType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_id")
    
    private String vpcId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="subnet_id")
    
    private String subnetId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public ListInstancesRequest withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInstancesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesRequest withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    


    /**
     * Get mode
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public ListInstancesRequest withDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
        return this;
    }

    


    /**
     * Get datastoreType
     * @return datastoreType
     */
    public DatastoreTypeEnum getDatastoreType() {
        return datastoreType;
    }

    public void setDatastoreType(DatastoreTypeEnum datastoreType) {
        this.datastoreType = datastoreType;
    }

    public ListInstancesRequest withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    


    /**
     * Get vpcId
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public ListInstancesRequest withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    


    /**
     * Get subnetId
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ListInstancesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * Get offset
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListInstancesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesRequest listInstancesRequest = (ListInstancesRequest) o;
        return Objects.equals(this.id, listInstancesRequest.id) &&
            Objects.equals(this.name, listInstancesRequest.name) &&
            Objects.equals(this.mode, listInstancesRequest.mode) &&
            Objects.equals(this.datastoreType, listInstancesRequest.datastoreType) &&
            Objects.equals(this.vpcId, listInstancesRequest.vpcId) &&
            Objects.equals(this.subnetId, listInstancesRequest.subnetId) &&
            Objects.equals(this.offset, listInstancesRequest.offset) &&
            Objects.equals(this.limit, listInstancesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, mode, datastoreType, vpcId, subnetId, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesRequest {\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
            sb.append("    datastoreType: ").append(toIndentedString(datastoreType)).append("\n");
            sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
            sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
            sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
            sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

