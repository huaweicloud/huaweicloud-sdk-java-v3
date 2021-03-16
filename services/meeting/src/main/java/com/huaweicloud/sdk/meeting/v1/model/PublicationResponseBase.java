package com.huaweicloud.sdk.meeting.v1.model;




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
 * 发布响应信息
 */
public class PublicationResponseBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lastUpdatedBy")
    
    private String lastUpdatedBy;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="createTime")
    
    private Long createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updateTime")
    
    private Long updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publishName")
    
    private String publishName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publishScope")
    
    private String publishScope;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    private Long startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    private Long endTime;
    /**
     * 根据当前时间确定发布状态 - NOT_ONLINE-未上线 - PUBLISHING-发布中 - ALREADY_OFFLINE-已下线
     */
    public static final class PublishStatusEnum {

        
        /**
         * Enum NOT_ONLINE for value: "NOT_ONLINE"
         */
        public static final PublishStatusEnum NOT_ONLINE = new PublishStatusEnum("NOT_ONLINE");
        
        /**
         * Enum PUBLISHING for value: "PUBLISHING"
         */
        public static final PublishStatusEnum PUBLISHING = new PublishStatusEnum("PUBLISHING");
        
        /**
         * Enum ALREADY_OFFLINE for value: "ALREADY_OFFLINE"
         */
        public static final PublishStatusEnum ALREADY_OFFLINE = new PublishStatusEnum("ALREADY_OFFLINE");
        

        private static final Map<String, PublishStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PublishStatusEnum> createStaticFields() {
            Map<String, PublishStatusEnum> map = new HashMap<>();
            map.put("NOT_ONLINE", NOT_ONLINE);
            map.put("PUBLISHING", PUBLISHING);
            map.put("ALREADY_OFFLINE", ALREADY_OFFLINE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PublishStatusEnum(String value) {
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
        public static PublishStatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            PublishStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new PublishStatusEnum(value);
            }
            return result;
        }

        public static PublishStatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            PublishStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof PublishStatusEnum) {
                return this.value.equals(((PublishStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="publishStatus")
    
    private PublishStatusEnum publishStatus;

    public PublicationResponseBase withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 发布ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public PublicationResponseBase withLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
        return this;
    }

    


    /**
     * 更新者
     * @return lastUpdatedBy
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    

    public PublicationResponseBase withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    

    public PublicationResponseBase withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    


    /**
     * 更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    

    public PublicationResponseBase withPublishName(String publishName) {
        this.publishName = publishName;
        return this;
    }

    


    /**
     * 发布名称
     * @return publishName
     */
    public String getPublishName() {
        return publishName;
    }

    public void setPublishName(String publishName) {
        this.publishName = publishName;
    }

    

    public PublicationResponseBase withPublishScope(String publishScope) {
        this.publishScope = publishScope;
        return this;
    }

    


    /**
     * 发布范围
     * @return publishScope
     */
    public String getPublishScope() {
        return publishScope;
    }

    public void setPublishScope(String publishScope) {
        this.publishScope = publishScope;
    }

    

    public PublicationResponseBase withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public PublicationResponseBase withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public PublicationResponseBase withPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
        return this;
    }

    


    /**
     * 根据当前时间确定发布状态 - NOT_ONLINE-未上线 - PUBLISHING-发布中 - ALREADY_OFFLINE-已下线
     * @return publishStatus
     */
    public PublishStatusEnum getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(PublishStatusEnum publishStatus) {
        this.publishStatus = publishStatus;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicationResponseBase publicationResponseBase = (PublicationResponseBase) o;
        return Objects.equals(this.id, publicationResponseBase.id) &&
            Objects.equals(this.lastUpdatedBy, publicationResponseBase.lastUpdatedBy) &&
            Objects.equals(this.createTime, publicationResponseBase.createTime) &&
            Objects.equals(this.updateTime, publicationResponseBase.updateTime) &&
            Objects.equals(this.publishName, publicationResponseBase.publishName) &&
            Objects.equals(this.publishScope, publicationResponseBase.publishScope) &&
            Objects.equals(this.startTime, publicationResponseBase.startTime) &&
            Objects.equals(this.endTime, publicationResponseBase.endTime) &&
            Objects.equals(this.publishStatus, publicationResponseBase.publishStatus);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, lastUpdatedBy, createTime, updateTime, publishName, publishScope, startTime, endTime, publishStatus);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicationResponseBase {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    publishName: ").append(toIndentedString(publishName)).append("\n");
        sb.append("    publishScope: ").append(toIndentedString(publishScope)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
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

