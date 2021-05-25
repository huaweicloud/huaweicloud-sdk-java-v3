package com.huaweicloud.sdk.sms.v3.model;




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
 * 任务关联的源端信息
 */
public class SourceServerAssociatedWithTask  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     */
    public static final class OsTypeEnum {

        
        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");
        
        /**
         * Enum LINUX for value: "LINUX"
         */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");
        

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private OsTypeEnum osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="oem_system")
    
    private Boolean oemSystem;
    /**
     * 当前源端服务器状态
     */
    public static final class StateEnum {

        
        /**
         * Enum UNAVAILABLE_ for value: "unavailable:环境校验不通过"
         */
        public static final StateEnum UNAVAILABLE_ = new StateEnum("unavailable:环境校验不通过");
        
        /**
         * Enum WAITING_ for value: "waiting:等待"
         */
        public static final StateEnum WAITING_ = new StateEnum("waiting:等待");
        
        /**
         * Enum INITIALIZE_ for value: "initialize:初始化"
         */
        public static final StateEnum INITIALIZE_ = new StateEnum("initialize:初始化");
        
        /**
         * Enum REPLICATE_ for value: "replicate:复制"
         */
        public static final StateEnum REPLICATE_ = new StateEnum("replicate:复制");
        
        /**
         * Enum SYNCING_ for value: "syncing:持续同步"
         */
        public static final StateEnum SYNCING_ = new StateEnum("syncing:持续同步");
        
        /**
         * Enum STOPPING_ for value: "stopping:暂停中"
         */
        public static final StateEnum STOPPING_ = new StateEnum("stopping:暂停中");
        
        /**
         * Enum STOPPED_ for value: "stopped:已暂停"
         */
        public static final StateEnum STOPPED_ = new StateEnum("stopped:已暂停");
        
        /**
         * Enum DELETING_ for value: "deleting:删除中"
         */
        public static final StateEnum DELETING_ = new StateEnum("deleting:删除中");
        
        /**
         * Enum ERROR_ for value: "error:错误"
         */
        public static final StateEnum ERROR_ = new StateEnum("error:错误");
        
        /**
         * Enum CLONING_ for value: "cloning:等待克隆完成"
         */
        public static final StateEnum CLONING_ = new StateEnum("cloning:等待克隆完成");
        
        /**
         * Enum TESTING_ for value: "testing:启动目的端中"
         */
        public static final StateEnum TESTING_ = new StateEnum("testing:启动目的端中");
        
        /**
         * Enum _FINISHED_ for value: " finished:启动目的端完成"
         */
        public static final StateEnum _FINISHED_ = new StateEnum(" finished:启动目的端完成");
        

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("unavailable:环境校验不通过", UNAVAILABLE_);
            map.put("waiting:等待", WAITING_);
            map.put("initialize:初始化", INITIALIZE_);
            map.put("replicate:复制", REPLICATE_);
            map.put("syncing:持续同步", SYNCING_);
            map.put("stopping:暂停中", STOPPING_);
            map.put("stopped:已暂停", STOPPED_);
            map.put("deleting:删除中", DELETING_);
            map.put("error:错误", ERROR_);
            map.put("cloning:等待克隆完成", CLONING_);
            map.put("testing:启动目的端中", TESTING_);
            map.put(" finished:启动目的端完成", _FINISHED_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    private StateEnum state;

    public SourceServerAssociatedWithTask withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 源端在SMS数据库中的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public SourceServerAssociatedWithTask withIp(String ip) {
        this.ip = ip;
        return this;
    }

    


    /**
     * 源端服务器ip，注册源端时必选，更新非必选
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    

    public SourceServerAssociatedWithTask withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 用来区分不同源端服务器的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SourceServerAssociatedWithTask withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    

    public SourceServerAssociatedWithTask withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 操作系统版本，注册必选，更新非必选
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    

    public SourceServerAssociatedWithTask withOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
        return this;
    }

    


    /**
     * 是否是OEM操作系统(Windows)
     * @return oemSystem
     */
    public Boolean getOemSystem() {
        return oemSystem;
    }

    public void setOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
    }

    

    public SourceServerAssociatedWithTask withState(StateEnum state) {
        this.state = state;
        return this;
    }

    


    /**
     * 当前源端服务器状态
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceServerAssociatedWithTask sourceServerAssociatedWithTask = (SourceServerAssociatedWithTask) o;
        return Objects.equals(this.id, sourceServerAssociatedWithTask.id) &&
            Objects.equals(this.ip, sourceServerAssociatedWithTask.ip) &&
            Objects.equals(this.name, sourceServerAssociatedWithTask.name) &&
            Objects.equals(this.osType, sourceServerAssociatedWithTask.osType) &&
            Objects.equals(this.osVersion, sourceServerAssociatedWithTask.osVersion) &&
            Objects.equals(this.oemSystem, sourceServerAssociatedWithTask.oemSystem) &&
            Objects.equals(this.state, sourceServerAssociatedWithTask.state);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ip, name, osType, osVersion, oemSystem, state);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceServerAssociatedWithTask {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    oemSystem: ").append(toIndentedString(oemSystem)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

