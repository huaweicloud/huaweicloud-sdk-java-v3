package com.huaweicloud.sdk.as.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListScalingTagInfosByResourceIdRequest  {

    /**
     * Gets or Sets resourceType
     */
    public static final class ResourceTypeEnum {

        
        /**
         * Enum SCALING_GROUP_TAG for value: "scaling_group_tag"
         */
        public static final ResourceTypeEnum SCALING_GROUP_TAG = new ResourceTypeEnum("scaling_group_tag");
        

        private static final Map<String, ResourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ResourceTypeEnum> createStaticFields() {
            Map<String, ResourceTypeEnum> map = new HashMap<>();
            map.put("scaling_group_tag", SCALING_GROUP_TAG);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ResourceTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ResourceTypeEnum(value);
            }
            return result;
        }

        public static ResourceTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ResourceTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ResourceTypeEnum) {
                return this.value.equals(((ResourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_type")
    
    private ResourceTypeEnum resourceType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_id")
    
    private String resourceId;

    public ListScalingTagInfosByResourceIdRequest withResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    


    /**
     * Get resourceType
     * @return resourceType
     */
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListScalingTagInfosByResourceIdRequest withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    


    /**
     * Get resourceId
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingTagInfosByResourceIdRequest listScalingTagInfosByResourceIdRequest = (ListScalingTagInfosByResourceIdRequest) o;
        return Objects.equals(this.resourceType, listScalingTagInfosByResourceIdRequest.resourceType) &&
            Objects.equals(this.resourceId, listScalingTagInfosByResourceIdRequest.resourceId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(resourceType, resourceId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingTagInfosByResourceIdRequest {\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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

