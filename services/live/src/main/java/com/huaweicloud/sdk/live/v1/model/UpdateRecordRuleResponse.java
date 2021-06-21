package com.huaweicloud.sdk.live.v1.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.live.v1.model.DefaultRecordConfig;
import com.huaweicloud.sdk.live.v1.model.PlanRecordTime;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class UpdateRecordRuleResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publish_domain")
    
    private String publishDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app")
    
    private String app;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;
    /**
     * 录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD, ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD: 持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD: 命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。命令控制的接口参考/v1/{project_id}/record/control - PLAN_RECORD: 计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD: 按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。租户提供的接口定义参考：/customer-record-ondemand-url 
     */
    public static final class RecordTypeEnum {

        
        /**
         * Enum CONTINUOUS_RECORD for value: "CONTINUOUS_RECORD"
         */
        public static final RecordTypeEnum CONTINUOUS_RECORD = new RecordTypeEnum("CONTINUOUS_RECORD");
        
        /**
         * Enum COMMAND_RECORD for value: "COMMAND_RECORD"
         */
        public static final RecordTypeEnum COMMAND_RECORD = new RecordTypeEnum("COMMAND_RECORD");
        
        /**
         * Enum PLAN_RECORD for value: "PLAN_RECORD"
         */
        public static final RecordTypeEnum PLAN_RECORD = new RecordTypeEnum("PLAN_RECORD");
        
        /**
         * Enum ON_DEMAND_RECORD for value: "ON_DEMAND_RECORD"
         */
        public static final RecordTypeEnum ON_DEMAND_RECORD = new RecordTypeEnum("ON_DEMAND_RECORD");
        

        private static final Map<String, RecordTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RecordTypeEnum> createStaticFields() {
            Map<String, RecordTypeEnum> map = new HashMap<>();
            map.put("CONTINUOUS_RECORD", CONTINUOUS_RECORD);
            map.put("COMMAND_RECORD", COMMAND_RECORD);
            map.put("PLAN_RECORD", PLAN_RECORD);
            map.put("ON_DEMAND_RECORD", ON_DEMAND_RECORD);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RecordTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RecordTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new RecordTypeEnum(value);
            }
            return result;
        }

        public static RecordTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            RecordTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof RecordTypeEnum) {
                return this.value.equals(((RecordTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_type")
    
    private RecordTypeEnum recordType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="plan_record_time")
    
    private PlanRecordTime planRecordTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="default_record_config")
    
    private DefaultRecordConfig defaultRecordConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private LocalDate createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    private LocalDate updateTime;

    public UpdateRecordRuleResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 规则id，由服务端返回。创建或修改的时候不携带
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public UpdateRecordRuleResponse withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    


    /**
     * 直播推流域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    

    public UpdateRecordRuleResponse withApp(String app) {
        this.app = app;
        return this;
    }

    


    /**
     * 应用名，如果任意应用填写*。录制规则匹配的时候，优先精确app匹配，如果匹配不到，则匹配*
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    

    public UpdateRecordRuleResponse withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * 录制的流名，如果任意流名则填写*。录制规则匹配的时候，优先精确stream匹配，如果匹配不到，则匹配*
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    

    public UpdateRecordRuleResponse withRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
        return this;
    }

    


    /**
     * 录制类型，包括：CONTINUOUS_RECORD，COMMAND_RECORD，PLAN_RECORD, ON_DEMAND_RECORD。默认CONTINUOUS_RECORD。 - CONTINUOUS_RECORD: 持续录制，在该规则类型配置后，只要有流到推送到录制系统，就触发录制。 - COMMAND_RECORD: 命令录制，在该规则类型配置后，在流推送到录制系统后，租户需要通过命令控制该流的录制开始和结束。命令控制的接口参考/v1/{project_id}/record/control - PLAN_RECORD: 计划录制，在该规则类型配置后，推的流如果在计划录制的时间区间则触发录制。 - ON_DEMAND_RECORD: 按需录制，在该规则类型配置后，录制系统收到推流后，需要调用租户提供的接口查询录制规则，并根据规则录制。租户提供的接口定义参考：/customer-record-ondemand-url 
     * @return recordType
     */
    public RecordTypeEnum getRecordType() {
        return recordType;
    }

    public void setRecordType(RecordTypeEnum recordType) {
        this.recordType = recordType;
    }

    

    public UpdateRecordRuleResponse withPlanRecordTime(PlanRecordTime planRecordTime) {
        this.planRecordTime = planRecordTime;
        return this;
    }

    public UpdateRecordRuleResponse withPlanRecordTime(Consumer<PlanRecordTime> planRecordTimeSetter) {
        if(this.planRecordTime == null ){
            this.planRecordTime = new PlanRecordTime();
            planRecordTimeSetter.accept(this.planRecordTime);
        }
        
        return this;
    }


    /**
     * Get planRecordTime
     * @return planRecordTime
     */
    public PlanRecordTime getPlanRecordTime() {
        return planRecordTime;
    }

    public void setPlanRecordTime(PlanRecordTime planRecordTime) {
        this.planRecordTime = planRecordTime;
    }

    

    public UpdateRecordRuleResponse withDefaultRecordConfig(DefaultRecordConfig defaultRecordConfig) {
        this.defaultRecordConfig = defaultRecordConfig;
        return this;
    }

    public UpdateRecordRuleResponse withDefaultRecordConfig(Consumer<DefaultRecordConfig> defaultRecordConfigSetter) {
        if(this.defaultRecordConfig == null ){
            this.defaultRecordConfig = new DefaultRecordConfig();
            defaultRecordConfigSetter.accept(this.defaultRecordConfig);
        }
        
        return this;
    }


    /**
     * Get defaultRecordConfig
     * @return defaultRecordConfig
     */
    public DefaultRecordConfig getDefaultRecordConfig() {
        return defaultRecordConfig;
    }

    public void setDefaultRecordConfig(DefaultRecordConfig defaultRecordConfig) {
        this.defaultRecordConfig = defaultRecordConfig;
    }

    

    public UpdateRecordRuleResponse withCreateTime(LocalDate createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。 在查询的时候返回
     * @return createTime
     */
    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    

    public UpdateRecordRuleResponse withUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 修改时间，格式：yyyy-mm-ddThh:mm:ssZ，UTC时间。 在查询的时候返回
     * @return updateTime
     */
    public LocalDate getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDate updateTime) {
        this.updateTime = updateTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateRecordRuleResponse updateRecordRuleResponse = (UpdateRecordRuleResponse) o;
        return Objects.equals(this.id, updateRecordRuleResponse.id) &&
            Objects.equals(this.publishDomain, updateRecordRuleResponse.publishDomain) &&
            Objects.equals(this.app, updateRecordRuleResponse.app) &&
            Objects.equals(this.stream, updateRecordRuleResponse.stream) &&
            Objects.equals(this.recordType, updateRecordRuleResponse.recordType) &&
            Objects.equals(this.planRecordTime, updateRecordRuleResponse.planRecordTime) &&
            Objects.equals(this.defaultRecordConfig, updateRecordRuleResponse.defaultRecordConfig) &&
            Objects.equals(this.createTime, updateRecordRuleResponse.createTime) &&
            Objects.equals(this.updateTime, updateRecordRuleResponse.updateTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, publishDomain, app, stream, recordType, planRecordTime, defaultRecordConfig, createTime, updateTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRecordRuleResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    planRecordTime: ").append(toIndentedString(planRecordTime)).append("\n");
        sb.append("    defaultRecordConfig: ").append(toIndentedString(defaultRecordConfig)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

