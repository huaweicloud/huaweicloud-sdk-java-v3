package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.MemberInfo;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * VpcMemberInfo
 */
public class VpcMemberInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="weight")
    
    private Integer weight;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecs_id")
    
    private String ecsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ecs_name")
    
    private String ecsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private BigDecimal status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="vpc_channel_id")
    
    private String vpcChannelId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    private OffsetDateTime createTime;

    public VpcMemberInfo withHost(String host) {
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

    

    public VpcMemberInfo withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    


    /**
     * 权重值。  允许您对云服务器进行评级，权重值越大，转发到该云服务的请求数量越多。权重只对加权轮询和加权最小连接算法生效  仅VPC通道类型为2时有效。
     * @return weight
     */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    

    public VpcMemberInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    


    /**
     * 后端云服务器的编号。  后端实例类型为instance时生效，支持英文，数字，“-”,“_”，1 ~ 64字符。
     * @return ecsId
     */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    

    public VpcMemberInfo withEcsName(String ecsName) {
        this.ecsName = ecsName;
        return this;
    }

    


    /**
     * 后端云服务器的名称。  后端实例类型为instance时生效，支持汉字，英文，数字，“-”,“_”,“.”，1 ~ 64字符。
     * @return ecsName
     */
    public String getEcsName() {
        return ecsName;
    }

    public void setEcsName(String ecsName) {
        this.ecsName = ecsName;
    }

    

    public VpcMemberInfo withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 后端实例对象的编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public VpcMemberInfo withStatus(BigDecimal status) {
        this.status = status;
        return this;
    }

    


    /**
     * 后端实例对象的状态   - 1： 有效
     * @return status
     */
    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    

    public VpcMemberInfo withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    


    /**
     * VPC通道的编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    

    public VpcMemberInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    


    /**
     * 后端实例增加到VPC通道的时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VpcMemberInfo vpcMemberInfo = (VpcMemberInfo) o;
        return Objects.equals(this.host, vpcMemberInfo.host) &&
            Objects.equals(this.weight, vpcMemberInfo.weight) &&
            Objects.equals(this.ecsId, vpcMemberInfo.ecsId) &&
            Objects.equals(this.ecsName, vpcMemberInfo.ecsName) &&
            Objects.equals(this.id, vpcMemberInfo.id) &&
            Objects.equals(this.status, vpcMemberInfo.status) &&
            Objects.equals(this.vpcChannelId, vpcMemberInfo.vpcChannelId) &&
            Objects.equals(this.createTime, vpcMemberInfo.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(host, weight, ecsId, ecsName, id, status, vpcChannelId, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcMemberInfo {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

