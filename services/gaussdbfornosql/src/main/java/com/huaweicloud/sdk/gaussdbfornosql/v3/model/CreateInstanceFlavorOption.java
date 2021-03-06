package com.huaweicloud.sdk.gaussdbfornosql.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 实例规格详情。
 */
public class CreateInstanceFlavorOption  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="num")
    
    private Integer num;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage")
    
    private String storage;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Integer size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="spec_code")
    
    private String specCode;

    public CreateInstanceFlavorOption withNum(Integer num) {
        this.num = num;
        return this;
    }

    


    /**
     * 节点数量。   - GaussDB(for Cassandra)实例的节点数量可取3~12。   - GaussDB(for Mongo)3.4版本集群实例的节点数量可取3~16。   - GaussDB(for Mongo)4.0版本副本集实例的节点数量可取3。   - GaussDB(for Influx)实例的节点数量可取3~16。
     * @return num
     */
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    

    public CreateInstanceFlavorOption withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    


    /**
     * 磁盘类型。 取值为“ULTRAHIGH”，表示SSD盘。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    

    public CreateInstanceFlavorOption withSize(Integer size) {
        this.size = size;
        return this;
    }

    


    /**
     * 磁盘大小。必须为10的整数倍。单位为GB。最小磁盘容量100GB，最大磁盘容量与实例的性能规格有关，详见数据库实例规格。
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    

    public CreateInstanceFlavorOption withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    


    /**
     * 资源规格编码。获取方法请参见查询所有实例规格信息中响应参数“spec_code”的值。
     * @return specCode
     */
    public String getSpecCode() {
        return specCode;
    }

    public void setSpecCode(String specCode) {
        this.specCode = specCode;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInstanceFlavorOption createInstanceFlavorOption = (CreateInstanceFlavorOption) o;
        return Objects.equals(this.num, createInstanceFlavorOption.num) &&
            Objects.equals(this.storage, createInstanceFlavorOption.storage) &&
            Objects.equals(this.size, createInstanceFlavorOption.size) &&
            Objects.equals(this.specCode, createInstanceFlavorOption.specCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(num, storage, size, specCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceFlavorOption {\n");
        sb.append("    num: ").append(toIndentedString(num)).append("\n");
        sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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

