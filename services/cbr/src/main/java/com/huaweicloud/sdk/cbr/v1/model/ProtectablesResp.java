package com.huaweicloud.sdk.cbr.v1.model;




import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cbr.v1.model.ProtectableResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProtectablesResp
 */
public class ProtectablesResp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="children")
    
    private List<Object> children = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private Object detail;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protectable")
    
    private ProtectableResult protectable;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private String size;
    /**
     * 资源状态
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
        
        /**
         * Enum ERROR for value: "error"
         */
        public static final StatusEnum ERROR = new StatusEnum("error");
        

        private static final Map<String, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatusEnum> createStaticFields() {
            Map<String, StatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("deleted", DELETED);
            map.put("error", ERROR);
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
    @JsonProperty(value="type")
    
    private String type;

    public ProtectablesResp withChildren(List<Object> children) {
        this.children = children;
        return this;
    }

    
    public ProtectablesResp addChildrenItem(Object childrenItem) {
        if(this.children == null) {
            this.children = new ArrayList<>();
        }
        this.children.add(childrenItem);
        return this;
    }

    public ProtectablesResp withChildren(Consumer<List<Object>> childrenSetter) {
        if(this.children == null) {
            this.children = new ArrayList<>();
        }
        childrenSetter.accept(this.children);
        return this;
    }

    /**
     * 子资源
     * @return children
     */
    public List<Object> getChildren() {
        return children;
    }

    public void setChildren(List<Object> children) {
        this.children = children;
    }

    

    public ProtectablesResp withDetail(Object detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * 资源详情
     * @return detail
     */
    public Object getDetail() {
        return detail;
    }

    public void setDetail(Object detail) {
        this.detail = detail;
    }

    

    public ProtectablesResp withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ProtectablesResp withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ProtectablesResp withProtectable(ProtectableResult protectable) {
        this.protectable = protectable;
        return this;
    }

    public ProtectablesResp withProtectable(Consumer<ProtectableResult> protectableSetter) {
        if(this.protectable == null ){
            this.protectable = new ProtectableResult();
            protectableSetter.accept(this.protectable);
        }
        
        return this;
    }


    /**
     * Get protectable
     * @return protectable
     */
    public ProtectableResult getProtectable() {
        return protectable;
    }

    public void setProtectable(ProtectableResult protectable) {
        this.protectable = protectable;
    }

    

    public ProtectablesResp withSize(String size) {
        this.size = size;
        return this;
    }

    


    /**
     * 大小，单位GB
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    

    public ProtectablesResp withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 资源状态
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    

    public ProtectablesResp withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 待备份资源的类型, 云服务器: OS::Nova::Server, 云硬盘: OS::Cinder::Volume, 裸金属服务器: OS::Ironic::BareMetalServer, 线下本地服务器: OS::Native::Server, 弹性文件系统: OS::Sfs::Turbo
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectablesResp protectablesResp = (ProtectablesResp) o;
        return Objects.equals(this.children, protectablesResp.children) &&
            Objects.equals(this.detail, protectablesResp.detail) &&
            Objects.equals(this.id, protectablesResp.id) &&
            Objects.equals(this.name, protectablesResp.name) &&
            Objects.equals(this.protectable, protectablesResp.protectable) &&
            Objects.equals(this.size, protectablesResp.size) &&
            Objects.equals(this.status, protectablesResp.status) &&
            Objects.equals(this.type, protectablesResp.type);
    }
    @Override
    public int hashCode() {
        return Objects.hash(children, detail, id, name, protectable, size, status, type);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectablesResp {\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protectable: ").append(toIndentedString(protectable)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

