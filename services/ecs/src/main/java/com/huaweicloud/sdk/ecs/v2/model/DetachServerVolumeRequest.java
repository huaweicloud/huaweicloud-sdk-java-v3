package com.huaweicloud.sdk.ecs.v2.model;

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
public class DetachServerVolumeRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="server_id")
    
    private String serverId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_id")
    
    private String volumeId;
    /**
     * Gets or Sets deleteFlag
     */
    public static class DeleteFlagEnum {

        
        /**
         * Enum _0 for value: "0"
         */
        public static final DeleteFlagEnum _0 = new DeleteFlagEnum("0");

        
        /**
         * Enum _1 for value: "1"
         */
        public static final DeleteFlagEnum _1 = new DeleteFlagEnum("1");

        

        public static Map<String, DeleteFlagEnum> staticFields =
                new HashMap<String, DeleteFlagEnum>() {
                    { 
                        put("0", _0);
                        put("1", _1);
                    }
                };

        private String value;

        DeleteFlagEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DeleteFlagEnum fromValue(String value) {
           if( value == null ){
                return null;
            }
            DeleteFlagEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new DeleteFlagEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static DeleteFlagEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            DeleteFlagEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof DeleteFlagEnum) {
                return this.value.equals(((DeleteFlagEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="delete_flag")
    
    private DeleteFlagEnum deleteFlag = DeleteFlagEnum._0;

    public DetachServerVolumeRequest withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    


    /**
     * Get serverId
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public DetachServerVolumeRequest withVolumeId(String volumeId) {
        this.volumeId = volumeId;
        return this;
    }

    


    /**
     * Get volumeId
     * @return volumeId
     */
    public String getVolumeId() {
        return volumeId;
    }

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    public DetachServerVolumeRequest withDeleteFlag(DeleteFlagEnum deleteFlag) {
        this.deleteFlag = deleteFlag;
        return this;
    }

    


    /**
     * Get deleteFlag
     * @return deleteFlag
     */
    public DeleteFlagEnum getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(DeleteFlagEnum deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DetachServerVolumeRequest detachServerVolumeRequest = (DetachServerVolumeRequest) o;
        return Objects.equals(this.serverId, detachServerVolumeRequest.serverId) &&
            Objects.equals(this.volumeId, detachServerVolumeRequest.volumeId) &&
            Objects.equals(this.deleteFlag, detachServerVolumeRequest.deleteFlag);
    }
    @Override
    public int hashCode() {
        return Objects.hash(serverId, volumeId, deleteFlag);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetachServerVolumeRequest {\n");
            sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
            sb.append("    volumeId: ").append(toIndentedString(volumeId)).append("\n");
            sb.append("    deleteFlag: ").append(toIndentedString(deleteFlag)).append("\n");
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

