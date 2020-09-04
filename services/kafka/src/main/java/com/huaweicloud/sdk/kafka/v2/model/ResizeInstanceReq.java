package com.huaweicloud.sdk.kafka.v2.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ResizeInstanceReq
 */
public class ResizeInstanceReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_spec_code")
    
    private String newSpecCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="new_storage_space")
    
    private Integer newStorageSpace;

    public ResizeInstanceReq withNewSpecCode(String newSpecCode) {
        this.newSpecCode = newSpecCode;
        return this;
    }

    


    /**
     * 规格变更后的规格ID。  若只扩展磁盘大小，则规格ID保持和原实例不变。  规格ID请参考[查询实例的扩容规格列表](https://support.huaweicloud.com/api-kafka/ShowInstanceExtendProductInfo.html)接口。
     * @return newSpecCode
     */
    public String getNewSpecCode() {
        return newSpecCode;
    }

    public void setNewSpecCode(String newSpecCode) {
        this.newSpecCode = newSpecCode;
    }

    public ResizeInstanceReq withNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
        return this;
    }

    


    /**
     * 规格变更后的消息存储空间，单位：GB。  若扩展实例基准带宽，则new_storage_space不能低于基准带宽规定的最小磁盘大小。  磁盘空间大小请参考[查询实例的扩容规格列表](https://support.huaweicloud.com/api-kafka/ShowInstanceExtendProductInfo.html)接口。
     * @return newStorageSpace
     */
    public Integer getNewStorageSpace() {
        return newStorageSpace;
    }

    public void setNewStorageSpace(Integer newStorageSpace) {
        this.newStorageSpace = newStorageSpace;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeInstanceReq resizeInstanceReq = (ResizeInstanceReq) o;
        return Objects.equals(this.newSpecCode, resizeInstanceReq.newSpecCode) &&
            Objects.equals(this.newStorageSpace, resizeInstanceReq.newStorageSpace);
    }
    @Override
    public int hashCode() {
        return Objects.hash(newSpecCode, newStorageSpace);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeInstanceReq {\n");
        sb.append("    newSpecCode: ").append(toIndentedString(newSpecCode)).append("\n");
        sb.append("    newStorageSpace: ").append(toIndentedString(newStorageSpace)).append("\n");
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

