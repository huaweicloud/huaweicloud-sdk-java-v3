package com.huaweicloud.sdk.roma.v2.model;




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
public class ListProductTemplatesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private Integer id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 产品模板状态 0-启用 1-停用
     */
    public static final class StatusEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final StatusEnum NUMBER_0 = new StatusEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);
        

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return Integer.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_user_name")
    
    private String createdUserName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_start")
    
    private Long createdDateStart;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_date_end")
    
    private Long createdDateEnd;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    private Integer offset;

    public ListProductTemplatesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListProductTemplatesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页显示条目数量，最大数量999，超过999后只返回999
     * minimum: 0
     * maximum: 999
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    public ListProductTemplatesRequest withId(Integer id) {
        this.id = id;
        return this;
    }

    


    /**
     * 产品模板ID
     * minimum: 1
     * maximum: 999999999999999999
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    

    public ListProductTemplatesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 产品模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListProductTemplatesRequest withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 产品模板状态 0-启用 1-停用
     * minimum: 0
     * maximum: 10
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ListProductTemplatesRequest withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    


    /**
     * 创建用户名
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    

    public ListProductTemplatesRequest withCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
        return this;
    }

    


    /**
     * 创建时间起始，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDateStart
     */
    public Long getCreatedDateStart() {
        return createdDateStart;
    }

    public void setCreatedDateStart(Long createdDateStart) {
        this.createdDateStart = createdDateStart;
    }

    

    public ListProductTemplatesRequest withCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
        return this;
    }

    


    /**
     * 创建时间截止，格式timestamp(ms)，使用UTC时区
     * minimum: 1
     * maximum: 999999999999999999
     * @return createdDateEnd
     */
    public Long getCreatedDateEnd() {
        return createdDateEnd;
    }

    public void setCreatedDateEnd(Long createdDateEnd) {
        this.createdDateEnd = createdDateEnd;
    }

    

    public ListProductTemplatesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 偏移量，表示从此偏移量开始查询， offset大于等于0
     * minimum: 0
     * maximum: 999999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListProductTemplatesRequest listProductTemplatesRequest = (ListProductTemplatesRequest) o;
        return Objects.equals(this.instanceId, listProductTemplatesRequest.instanceId) &&
            Objects.equals(this.limit, listProductTemplatesRequest.limit) &&
            Objects.equals(this.id, listProductTemplatesRequest.id) &&
            Objects.equals(this.name, listProductTemplatesRequest.name) &&
            Objects.equals(this.status, listProductTemplatesRequest.status) &&
            Objects.equals(this.createdUserName, listProductTemplatesRequest.createdUserName) &&
            Objects.equals(this.createdDateStart, listProductTemplatesRequest.createdDateStart) &&
            Objects.equals(this.createdDateEnd, listProductTemplatesRequest.createdDateEnd) &&
            Objects.equals(this.offset, listProductTemplatesRequest.offset);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, limit, id, name, status, createdUserName, createdDateStart, createdDateEnd, offset);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListProductTemplatesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    createdDateStart: ").append(toIndentedString(createdDateStart)).append("\n");
        sb.append("    createdDateEnd: ").append(toIndentedString(createdDateEnd)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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

