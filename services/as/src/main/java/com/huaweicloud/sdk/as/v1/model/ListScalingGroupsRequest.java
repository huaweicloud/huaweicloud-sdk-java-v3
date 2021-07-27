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
public class ListScalingGroupsRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_name")
    
    private String scalingGroupName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_configuration_id")
    
    private String scalingConfigurationId;
    /**
     * 伸缩组状态，包括INSERVICE，PAUSED，ERROR，DELETING。
     */
    public static final class ScalingGroupStatusEnum {

        
        /**
         * Enum INSERVICE for value: "INSERVICE"
         */
        public static final ScalingGroupStatusEnum INSERVICE = new ScalingGroupStatusEnum("INSERVICE");
        
        /**
         * Enum PAUSED for value: "PAUSED"
         */
        public static final ScalingGroupStatusEnum PAUSED = new ScalingGroupStatusEnum("PAUSED");
        
        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final ScalingGroupStatusEnum ERROR = new ScalingGroupStatusEnum("ERROR");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final ScalingGroupStatusEnum DELETING = new ScalingGroupStatusEnum("DELETING");
        

        private static final Map<String, ScalingGroupStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScalingGroupStatusEnum> createStaticFields() {
            Map<String, ScalingGroupStatusEnum> map = new HashMap<>();
            map.put("INSERVICE", INSERVICE);
            map.put("PAUSED", PAUSED);
            map.put("ERROR", ERROR);
            map.put("DELETING", DELETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScalingGroupStatusEnum(String value) {
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
        public static ScalingGroupStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ScalingGroupStatusEnum(value);
            }
            return result;
        }

        public static ScalingGroupStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ScalingGroupStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScalingGroupStatusEnum) {
                return this.value.equals(((ScalingGroupStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scaling_group_status")
    
    private ScalingGroupStatusEnum scalingGroupStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_number")
    
    private Integer startNumber;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="enterprise_project_id")
    
    private String enterpriseProjectId;

    public ListScalingGroupsRequest withScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
        return this;
    }

    


    /**
     * 伸缩组名称
     * @return scalingGroupName
     */
    public String getScalingGroupName() {
        return scalingGroupName;
    }

    public void setScalingGroupName(String scalingGroupName) {
        this.scalingGroupName = scalingGroupName;
    }

    

    public ListScalingGroupsRequest withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    


    /**
     * 伸缩配置ID，通过查询弹性伸缩配置列表接口获取，详见查询弹性伸缩配置列表。
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    

    public ListScalingGroupsRequest withScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
        return this;
    }

    


    /**
     * 伸缩组状态，包括INSERVICE，PAUSED，ERROR，DELETING。
     * @return scalingGroupStatus
     */
    public ScalingGroupStatusEnum getScalingGroupStatus() {
        return scalingGroupStatus;
    }

    public void setScalingGroupStatus(ScalingGroupStatusEnum scalingGroupStatus) {
        this.scalingGroupStatus = scalingGroupStatus;
    }

    

    public ListScalingGroupsRequest withStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
        return this;
    }

    


    /**
     * 查询的起始行号，默认为0。
     * @return startNumber
     */
    public Integer getStartNumber() {
        return startNumber;
    }

    public void setStartNumber(Integer startNumber) {
        this.startNumber = startNumber;
    }

    

    public ListScalingGroupsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 查询的记录条数，默认为20。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListScalingGroupsRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    


    /**
     * 企业项目ID，当传入all_granted_eps时表示查询该用户所有授权的企业项目下的伸缩组列表
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScalingGroupsRequest listScalingGroupsRequest = (ListScalingGroupsRequest) o;
        return Objects.equals(this.scalingGroupName, listScalingGroupsRequest.scalingGroupName) &&
            Objects.equals(this.scalingConfigurationId, listScalingGroupsRequest.scalingConfigurationId) &&
            Objects.equals(this.scalingGroupStatus, listScalingGroupsRequest.scalingGroupStatus) &&
            Objects.equals(this.startNumber, listScalingGroupsRequest.startNumber) &&
            Objects.equals(this.limit, listScalingGroupsRequest.limit) &&
            Objects.equals(this.enterpriseProjectId, listScalingGroupsRequest.enterpriseProjectId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scalingGroupName, scalingConfigurationId, scalingGroupStatus, startNumber, limit, enterpriseProjectId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScalingGroupsRequest {\n");
        sb.append("    scalingGroupName: ").append(toIndentedString(scalingGroupName)).append("\n");
        sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
        sb.append("    scalingGroupStatus: ").append(toIndentedString(scalingGroupStatus)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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

