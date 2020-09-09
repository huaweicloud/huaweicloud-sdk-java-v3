package com.huaweicloud.sdk.dcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AttrsObject
 */
public class AttrsObject  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="capacity")
    
    private String capacity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private String value;

    public AttrsObject withCapacity(String capacity) {
        this.capacity = capacity;
        return this;
    }

    


    /**
     * 缓存容量。
     * @return capacity
     */
    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public AttrsObject withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 额外信息名，取值范围如下： - sharding_num：该规格实例支持的分片数。 - proxy_num：该规格Proxy实例支持的Proxy节点数量。如果不是Proxy实例，该参数为0。 - db_number：该规格实例的DB数量。 - max_memory：实际可使用的最大内存。 - max_connections：该规格支持的最大连接数。 - max_clients：该规格支持的最大客户端数，一般等于最大连接数。 - max_bandwidth：该规格支持的最大带宽。 - max_in_bandwidth：该规格支持的最大接入带宽，一般等于最大带宽。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AttrsObject withValue(String value) {
        this.value = value;
        return this;
    }

    


    /**
     * 额外信息值。
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AttrsObject attrsObject = (AttrsObject) o;
        return Objects.equals(this.capacity, attrsObject.capacity) &&
            Objects.equals(this.name, attrsObject.name) &&
            Objects.equals(this.value, attrsObject.value);
    }
    @Override
    public int hashCode() {
        return Objects.hash(capacity, name, value);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttrsObject {\n");
        sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

