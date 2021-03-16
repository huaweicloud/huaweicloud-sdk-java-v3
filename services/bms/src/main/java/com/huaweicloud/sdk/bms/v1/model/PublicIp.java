package com.huaweicloud.sdk.bms.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bms.v1.model.Eip;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * publicip字段数据结构说明
 */
public class PublicIp  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private UUID id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="eip")
    
    private Eip eip;

    public PublicIp withId(UUID id) {
        this.id = id;
        return this;
    }

    


    /**
     * 创建裸金属服务器分配已有弹性公网IP时，分配的弹性公网IP的ID，UUID格式。弹性公网IP的ID可以从网络控制台或者参考《虚拟私有云API参考》的“查询弹性公网IP列表”章节获取。约束：只能分配状态（status）为DOWN的弹性公网IP。批量创建裸金属服务器时，不能使用已有弹性公网IP，即不支持此参数。
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    

    public PublicIp withEip(Eip eip) {
        this.eip = eip;
        return this;
    }

    public PublicIp withEip(Consumer<Eip> eipSetter) {
        if(this.eip == null ){
            this.eip = new Eip();
            eipSetter.accept(this.eip);
        }
        
        return this;
    }


    /**
     * Get eip
     * @return eip
     */
    public Eip getEip() {
        return eip;
    }

    public void setEip(Eip eip) {
        this.eip = eip;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicIp publicIp = (PublicIp) o;
        return Objects.equals(this.id, publicIp.id) &&
            Objects.equals(this.eip, publicIp.eip);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, eip);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PublicIp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    eip: ").append(toIndentedString(eip)).append("\n");
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

