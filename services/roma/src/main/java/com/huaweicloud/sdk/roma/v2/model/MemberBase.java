package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MemberBase
 */
public class MemberBase  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    private Integer weight;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_backup")
    
    private Boolean isBackup;

    public MemberBase withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 后端服务器地址  后端实例类型为ip时生效
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public MemberBase withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    


    /**
     * 权重值。  允许您对云服务器进行评级，权重值越大，转发到该云服务的请求数量越多。权重只对加权轮询和加权最小连接算法生效  仅VPC通道类型为2时有效。
     * minimum: 0
     * maximum: 100
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    public MemberBase withIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
        return this;
    }

    


    /**
     * 是否备节点。  开启后对应后端服务为备用节点，仅当非备用节点全部故障时工作。  实例需要升级到对应版本才支持此功能，若不支持请联系技术支持。
     * @return isBackup
     */
    public Boolean getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberBase memberBase = (MemberBase) o;
        return Objects.equals(this.host, memberBase.host) &&
            Objects.equals(this.weight, memberBase.weight) &&
            Objects.equals(this.isBackup, memberBase.isBackup);
    }
    @Override
    public int hashCode() {
        return Objects.hash(host, weight, isBackup);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberBase {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isBackup: ").append(toIndentedString(isBackup)).append("\n");
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

