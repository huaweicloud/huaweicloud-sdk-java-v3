package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例规格详情。
 */
public class CreateInstanceFlavorOption {

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

    public CreateInstanceFlavorOption withNum(String num) {
        this.num = num;
        return this;
    }

    /**
     * **参数解释：** 节点数量。 **约束限制：** 不涉及。 **取值范围：** - GeminiDB Cassandra实例的节点数量可取3~60。 - GeminiDB Mongo 4.0版本副本集实例的节点数量为3。 - GeminiDB Influx集群实例的节点数量可取3~16。 - GeminiDB Influx单节点实例的节点数量可取1。 - GeminiDB Redis实例的节点数量可取3~12。 **默认取值：** 不涉及。
     * @return num
     */
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public CreateInstanceFlavorOption withStorage(String storage) {
        this.storage = storage;
        return this;
    }

    /**
     * **参数解释：** 磁盘类型。 **约束限制：** 不涉及。 **取值范围：** 取值为“ULTRAHIGH”，表示SSD盘。 **默认取值：** 不涉及。
     * @return storage
     */
    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public CreateInstanceFlavorOption withSize(String size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释：** 磁盘大小。必须为整数，单位为GB。 **约束限制：** GeminiDB Cassandra，GeminiDB Mongo，GeminiDB Influx的最小磁盘容量100GB，最大磁盘容量与实例的性能规格有关。GeminiDB Redis的最大和最小磁盘容量与节点数和实例的性能规格有关。 **取值范围：** - GeminiDB Cassandra请参见数据库实例规格。 - GeminiDB Mongo请参见数据库实例规格。 - GeminiDB Influx请参见数据库实例规格。 - GeminiDB Redis请参见数据库实例规格。 **默认取值：** 不涉及。
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public CreateInstanceFlavorOption withSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }

    /**
     * -| **参数解释：** 资源规格编码。 **约束限制：** 不涉及。 **取值范围：** 获取方法请参见查询数据库规格 - QueryingInstanceSpecifications中响应参数“spec_code”的值。 **默认取值：** 不涉及。
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
        CreateInstanceFlavorOption that = (CreateInstanceFlavorOption) obj;
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
