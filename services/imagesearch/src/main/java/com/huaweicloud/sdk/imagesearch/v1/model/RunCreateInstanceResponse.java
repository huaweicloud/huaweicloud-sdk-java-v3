package com.huaweicloud.sdk.imagesearch.v1.model;





import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunCreateInstanceResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="desc")
    

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="registerDate")
    

    private Long registerDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="expiredDate")
    

    private Long expiredDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="level")
    

    private Integer level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="tags")
    
    private List<String> tags = null;
        /**
     * 实例的状态，有以下状态信息：   - NORMAL：正常。   - ARREARAGE：欠费。   - CREATION：创建中。   - CREATION_FAILD：创建失败。   - DELETING：删除中。   - DELETING_FAILED：删除失败。   - ABNORMAL：异常。
     */
    public static final class StatusEnum {

        
        /**
         * Enum NORMAL for value: "NORMAL"
         */
        public static final StatusEnum NORMAL = new StatusEnum("NORMAL");
        
        /**
         * Enum ARREARAGE for value: "ARREARAGE"
         */
        public static final StatusEnum ARREARAGE = new StatusEnum("ARREARAGE");
        
        /**
         * Enum CREATION for value: "CREATION"
         */
        public static final StatusEnum CREATION = new StatusEnum("CREATION");
        
        /**
         * Enum CREATION_FAILD for value: "CREATION_FAILD"
         */
        public static final StatusEnum CREATION_FAILD = new StatusEnum("CREATION_FAILD");
        
        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StatusEnum DELETING = new StatusEnum("DELETING");
        
        /**
         * Enum DELETING_FAILED for value: "DELETING_FAILED"
         */
        public static final StatusEnum DELETING_FAILED = new StatusEnum("DELETING_FAILED");
        
        /**
         * Enum ABNORMAL for value: "ABNORMAL"
         */
        public static final StatusEnum ABNORMAL = new StatusEnum("ABNORMAL");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("NORMAL", NORMAL);
            map.put("ARREARAGE", ARREARAGE);
            map.put("CREATION", CREATION);
            map.put("CREATION_FAILD", CREATION_FAILD);
            map.put("DELETING", DELETING);
            map.put("DELETING_FAILED", DELETING_FAILED);
            map.put("ABNORMAL", ABNORMAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
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
            if (obj instanceof StatusEnum) {
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
    @JsonProperty(value="instanceName")
    

    private String instanceName;

    public RunCreateInstanceResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 模型展示名或领域名称。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    

    public RunCreateInstanceResponse withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    


    /**
     * 描述。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    

    public RunCreateInstanceResponse withRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
        return this;
    }

    


    /**
     * 注册时间。
     * @return registerDate
     */
    public Long getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Long registerDate) {
        this.registerDate = registerDate;
    }

    

    public RunCreateInstanceResponse withExpiredDate(Long expiredDate) {
        this.expiredDate = expiredDate;
        return this;
    }

    


    /**
     * 过期时间，-1表示永不过期。
     * @return expiredDate
     */
    public Long getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Long expiredDate) {
        this.expiredDate = expiredDate;
    }

    

    public RunCreateInstanceResponse withLevel(Integer level) {
        this.level = level;
        return this;
    }

    


    /**
     * 规格，即实例的图片数量规格，默认为30000000（单位：张）。
     * @return level
     */
    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    

    public RunCreateInstanceResponse withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    
    public RunCreateInstanceResponse addTagsItem(String tagsItem) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public RunCreateInstanceResponse withTags(Consumer<List<String>> tagsSetter) {
        if(this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 图片自定义标签。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    

    public RunCreateInstanceResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 实例的状态，有以下状态信息：   - NORMAL：正常。   - ARREARAGE：欠费。   - CREATION：创建中。   - CREATION_FAILD：创建失败。   - DELETING：删除中。   - DELETING_FAILED：删除失败。   - ABNORMAL：异常。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public RunCreateInstanceResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    


    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunCreateInstanceResponse runCreateInstanceResponse = (RunCreateInstanceResponse) o;
        return Objects.equals(this.domain, runCreateInstanceResponse.domain) &&
            Objects.equals(this.desc, runCreateInstanceResponse.desc) &&
            Objects.equals(this.registerDate, runCreateInstanceResponse.registerDate) &&
            Objects.equals(this.expiredDate, runCreateInstanceResponse.expiredDate) &&
            Objects.equals(this.level, runCreateInstanceResponse.level) &&
            Objects.equals(this.tags, runCreateInstanceResponse.tags) &&
            Objects.equals(this.status, runCreateInstanceResponse.status) &&
            Objects.equals(this.instanceName, runCreateInstanceResponse.instanceName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domain, desc, registerDate, expiredDate, level, tags, status, instanceName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunCreateInstanceResponse {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    registerDate: ").append(toIndentedString(registerDate)).append("\n");
        sb.append("    expiredDate: ").append(toIndentedString(expiredDate)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
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

