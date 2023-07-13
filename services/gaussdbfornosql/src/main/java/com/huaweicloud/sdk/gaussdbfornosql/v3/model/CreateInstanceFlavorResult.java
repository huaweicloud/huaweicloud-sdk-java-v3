package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例规格详情，与请求参数相同。
 */
public class CreateInstanceFlavorResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "num")

    private String num;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage")

    private String storage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private String size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec_code")

    private String specCode;

    public CreateInstanceFlavorResult withNum(String num) {
        this.num = num;
        return this;
    }

    /**
     * 节点数量。   - GaussDB(for Cassandra)实例的节点数量可取3~12。   - GaussDB(for Mongo)4.0版本副本集实例的节点数量可取3。   - GaussDB(for Influx)实例的节点数量可取3~16。
     * @return num
     */
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public CreateInstanceFlavorResult withStorage(String storage) {
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

    public CreateInstanceFlavorResult withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * 磁盘大小。必须为10的整数倍。单位为GB。最小磁盘容量100GB，最大磁盘容量与实例的性能规格有关，详见数据库实例规格。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public CreateInstanceFlavorResult withSpecCode(String specCode) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInstanceFlavorResult that = (CreateInstanceFlavorResult) obj;
        return Objects.equals(this.num, that.num) && Objects.equals(this.storage, that.storage)
            && Objects.equals(this.size, that.size) && Objects.equals(this.specCode, that.specCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, storage, size, specCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInstanceFlavorResult {\n");
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
