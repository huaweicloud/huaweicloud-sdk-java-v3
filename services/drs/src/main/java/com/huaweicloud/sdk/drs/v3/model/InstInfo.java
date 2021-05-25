package com.huaweicloud.sdk.drs.v3.model;




import java.util.Collections;

import java.util.Collections;

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
 * 迁移实例信息体
 */
public class InstInfo  {

    /**
     * 引擎类型
     */
    public static final class EngineTypeEnum {

        
        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineTypeEnum MYSQL = new EngineTypeEnum("mysql");
        
        /**
         * Enum MONGODB for value: "mongodb"
         */
        public static final EngineTypeEnum MONGODB = new EngineTypeEnum("mongodb");
        
        /**
         * Enum CLOUDDATAGUARD_MYSQL for value: "cloudDataGuard-mysql"
         */
        public static final EngineTypeEnum CLOUDDATAGUARD_MYSQL = new EngineTypeEnum("cloudDataGuard-mysql");
        

        private static final Map<String, EngineTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineTypeEnum> createStaticFields() {
            Map<String, EngineTypeEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("mongodb", MONGODB);
            map.put("cloudDataGuard-mysql", CLOUDDATAGUARD_MYSQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineTypeEnum(String value) {
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
        public static EngineTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EngineTypeEnum(value);
            }
            return result;
        }

        public static EngineTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            EngineTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof EngineTypeEnum) {
                return this.value.equals(((EngineTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="engine_type")
    
    private EngineTypeEnum engineType;
    /**
     * 实例类型
     */
    public static final class InstTypeEnum {

        
        /**
         * Enum HIGH for value: "high"
         */
        public static final InstTypeEnum HIGH = new InstTypeEnum("high");
        

        private static final Map<String, InstTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, InstTypeEnum> createStaticFields() {
            Map<String, InstTypeEnum> map = new HashMap<>();
            map.put("high", HIGH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        InstTypeEnum(String value) {
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
        public static InstTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            InstTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new InstTypeEnum(value);
            }
            return result;
        }

        public static InstTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            InstTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof InstTypeEnum) {
                return this.value.equals(((InstTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="inst_type")
    
    private InstTypeEnum instType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="public_ip")
    
    private String publicIp;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;
    /**
     * 迁移实例的状态
     */
    public static final class StatusEnum {

        
        /**
         * Enum ACTIVE for value: "active"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("active");
        
        /**
         * Enum DELETED for value: "deleted"
         */
        public static final StatusEnum DELETED = new StatusEnum("deleted");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("deleted", DELETED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatusEnum(String value) {
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
    @JsonProperty(value="volume_size")
    
    private Integer volumeSize;

    public InstInfo withEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
        return this;
    }

    


    /**
     * 引擎类型
     * @return engineType
     */
    public EngineTypeEnum getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineTypeEnum engineType) {
        this.engineType = engineType;
    }

    

    public InstInfo withInstType(InstTypeEnum instType) {
        this.instType = instType;
        return this;
    }

    


    /**
     * 实例类型
     * @return instType
     */
    public InstTypeEnum getInstType() {
        return instType;
    }

    public void setInstType(InstTypeEnum instType) {
        this.instType = instType;
    }

    

    public InstInfo withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * 迁移实例所在的私有IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    public InstInfo withPublicIp(String publicIp) {
        this.publicIp = publicIp;
        return this;
    }

    


    /**
     * 迁移实例所在的公网IP
     * @return publicIp
     */
    public String getPublicIp() {
        return publicIp;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    

    public InstInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 迁移实例任务定时启动时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    

    public InstInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 迁移实例的状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public InstInfo withVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    


    /**
     * 迁移实例的磁盘大小
     * @return volumeSize
     */
    public Integer getVolumeSize() {
        return volumeSize;
    }

    public void setVolumeSize(Integer volumeSize) {
        this.volumeSize = volumeSize;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstInfo instInfo = (InstInfo) o;
        return Objects.equals(this.engineType, instInfo.engineType) &&
            Objects.equals(this.instType, instInfo.instType) &&
            Objects.equals(this.ip, instInfo.ip) &&
            Objects.equals(this.publicIp, instInfo.publicIp) &&
            Objects.equals(this.startTime, instInfo.startTime) &&
            Objects.equals(this.status, instInfo.status) &&
            Objects.equals(this.volumeSize, instInfo.volumeSize);
    }
    @Override
    public int hashCode() {
        return Objects.hash(engineType, instType, ip, publicIp, startTime, status, volumeSize);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstInfo {\n");
        sb.append("    engineType: ").append(toIndentedString(engineType)).append("\n");
        sb.append("    instType: ").append(toIndentedString(instType)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    publicIp: ").append(toIndentedString(publicIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    volumeSize: ").append(toIndentedString(volumeSize)).append("\n");
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

