package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** MemberInfo */
public class MemberInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_backup")

    private Boolean isBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_name")

    private String ecsName;

    public MemberInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /** 后端服务器地址 后端实例类型为ip时生效
     * 
     * @return host */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public MemberInfo withWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    /** 权重值。 允许您对云服务器进行评级，权重值越大，转发到该云服务的请求数量越多。权重只对加权轮询和加权最小连接算法生效 仅VPC通道类型为2时有效。 minimum: 0 maximum: 100
     * 
     * @return weight */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public MemberInfo withIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
        return this;
    }

    /** 是否备节点。 开启后对应后端服务为备用节点，仅当非备用节点全部故障时工作。 实例需要升级到对应版本才支持此功能，若不支持请联系技术支持。
     * 
     * @return isBackup */
    public Boolean getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }

    public MemberInfo withEcsId(String ecsId) {
        this.ecsId = ecsId;
        return this;
    }

    /** 后端云服务器的编号。 后端实例类型为instance时生效，支持英文，数字，“-”,“_”，1 ~ 64字符。
     * 
     * @return ecsId */
    public String getEcsId() {
        return ecsId;
    }

    public void setEcsId(String ecsId) {
        this.ecsId = ecsId;
    }

    public MemberInfo withEcsName(String ecsName) {
        this.ecsName = ecsName;
        return this;
    }

    /** 后端云服务器的名称。 后端实例类型为instance时生效，支持汉字，英文，数字，“-”,“_”,“.”，1 ~ 64字符。
     * 
     * @return ecsName */
    public String getEcsName() {
        return ecsName;
    }

    public void setEcsName(String ecsName) {
        this.ecsName = ecsName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberInfo memberInfo = (MemberInfo) o;
        return Objects.equals(this.host, memberInfo.host) && Objects.equals(this.weight, memberInfo.weight)
            && Objects.equals(this.isBackup, memberInfo.isBackup) && Objects.equals(this.ecsId, memberInfo.ecsId)
            && Objects.equals(this.ecsName, memberInfo.ecsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, weight, isBackup, ecsId, ecsName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberInfo {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isBackup: ").append(toIndentedString(isBackup)).append("\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
