package com.huaweicloud.sdk.cloudide.v2.model;




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
 * 返回值
 */
public class InstancesResponseInstancesVOResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="link")
    
    private String link;
    /**
     * cpu架构 x86|arm
     */
    public static final class ArchEnum {

        
        /**
         * Enum X86 for value: "x86"
         */
        public static final ArchEnum X86 = new ArchEnum("x86");
        
        /**
         * Enum ARM for value: "arm"
         */
        public static final ArchEnum ARM = new ArchEnum("arm");
        

        private static final Map<String, ArchEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ArchEnum> createStaticFields() {
            Map<String, ArchEnum> map = new HashMap<>();
            map.put("x86", X86);
            map.put("arm", ARM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ArchEnum(String value) {
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
        public static ArchEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ArchEnum(value);
            }
            return result;
        }

        public static ArchEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            ArchEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ArchEnum) {
                return this.value.equals(((ArchEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    private ArchEnum arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="private")
    
    private Boolean _private;

    public InstancesResponseInstancesVOResult withLink(String link) {
        this.link = link;
        return this;
    }

    


    /**
     * 链接
     * @return link
     */
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public InstancesResponseInstancesVOResult withArch(ArchEnum arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * cpu架构 x86|arm
     * @return arch
     */
    public ArchEnum getArch() {
        return arch;
    }

    public void setArch(ArchEnum arch) {
        this.arch = arch;
    }

    public InstancesResponseInstancesVOResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstancesResponseInstancesVOResult withPrivate(Boolean _private) {
        this._private = _private;
        return this;
    }

    


    /**
     * 是否私有平台
     * @return _private
     */
    public Boolean getPrivate() {
        return _private;
    }

    public void setPrivate(Boolean _private) {
        this._private = _private;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InstancesResponseInstancesVOResult instancesResponseInstancesVOResult = (InstancesResponseInstancesVOResult) o;
        return Objects.equals(this.link, instancesResponseInstancesVOResult.link) &&
            Objects.equals(this.arch, instancesResponseInstancesVOResult.arch) &&
            Objects.equals(this.id, instancesResponseInstancesVOResult.id) &&
            Objects.equals(this._private, instancesResponseInstancesVOResult._private);
    }
    @Override
    public int hashCode() {
        return Objects.hash(link, arch, id, _private);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesResponseInstancesVOResult {\n");
        sb.append("    link: ").append(toIndentedString(link)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

