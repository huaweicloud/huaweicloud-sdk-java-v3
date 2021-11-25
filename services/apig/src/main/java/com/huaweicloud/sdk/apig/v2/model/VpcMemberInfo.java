package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** VpcMemberInfo */
public class VpcMemberInfo {

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
    @JsonProperty(value = "member_group_name")

    private String memberGroupName;

    /** 后端服务器状态 - 1：可用 - 2：不可用 */
    public static final class StatusEnum {

        /** Enum NUMBER_1 for value: 1 */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /** Enum NUMBER_2 for value: 2 */
        public static final StatusEnum NUMBER_2 = new StatusEnum(2);

        private static final Map<Integer, StatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, StatusEnum> createStaticFields() {
            Map<Integer, StatusEnum> map = new HashMap<>();
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        StatusEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            StatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StatusEnum(value);
            }
            return result;
        }

        public static StatusEnum valueOf(Integer value) {
            if (value == null) {
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
    @JsonProperty(value = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id")

    private String ecsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_name")

    private String ecsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_id")

    private String memberGroupId;

    public VpcMemberInfo withHost(String host) {
        this.host = host;
        return this;
    }

    /** 后端服务器地址 后端实例类型为ip时必填
     * 
     * @return host */
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

    /** 权重值。 允许您对后端服务进行评级，权重值越大，转发到该云服务的请求数量越多。 minimum: 0 maximum: 10000
     * 
     * @return weight */
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public VpcMemberInfo withIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
        return this;
    }

    /** 是否备用节点。 开启后对应后端服务为备用节点，仅当非备用节点全部故障时工作。 实例需要升级到对应版本才支持此功能，若不支持请联系技术支持。
     * 
     * @return isBackup */
    public Boolean getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }

    public VpcMemberInfo withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /** 后端服务器组名称。为后端服务地址选择服务器组，便于统一修改对应服务器组的后端地址。 暂不支持
     * 
     * @return memberGroupName */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public VpcMemberInfo withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /** 后端服务器状态 - 1：可用 - 2：不可用
     * 
     * @return status */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public VpcMemberInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 后端服务器端口 minimum: 0 maximum: 65535
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public VpcMemberInfo withEcsId(String ecsId) {
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

    public VpcMemberInfo withEcsName(String ecsName) {
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

    public VpcMemberInfo withId(String id) {
        this.id = id;
        return this;
    }

    /** 后端实例对象的编号
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VpcMemberInfo withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /** VPC通道的编号
     * 
     * @return vpcChannelId */
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

    /** 后端实例增加到VPC通道的时间
     * 
     * @return createTime */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public VpcMemberInfo withMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
        return this;
    }

    /** 后端服务器组编号 暂不支持
     * 
     * @return memberGroupId */
    public String getMemberGroupId() {
        return memberGroupId;
    }

    public void setMemberGroupId(String memberGroupId) {
        this.memberGroupId = memberGroupId;
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
        return Objects.equals(this.host, vpcMemberInfo.host) && Objects.equals(this.weight, vpcMemberInfo.weight)
            && Objects.equals(this.isBackup, vpcMemberInfo.isBackup)
            && Objects.equals(this.memberGroupName, vpcMemberInfo.memberGroupName)
            && Objects.equals(this.status, vpcMemberInfo.status) && Objects.equals(this.port, vpcMemberInfo.port)
            && Objects.equals(this.ecsId, vpcMemberInfo.ecsId) && Objects.equals(this.ecsName, vpcMemberInfo.ecsName)
            && Objects.equals(this.id, vpcMemberInfo.id)
            && Objects.equals(this.vpcChannelId, vpcMemberInfo.vpcChannelId)
            && Objects.equals(this.createTime, vpcMemberInfo.createTime)
            && Objects.equals(this.memberGroupId, vpcMemberInfo.memberGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host,
            weight,
            isBackup,
            memberGroupName,
            status,
            port,
            ecsId,
            ecsName,
            id,
            vpcChannelId,
            createTime,
            memberGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcMemberInfo {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isBackup: ").append(toIndentedString(isBackup)).append("\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    ecsId: ").append(toIndentedString(ecsId)).append("\n");
        sb.append("    ecsName: ").append(toIndentedString(ecsName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    memberGroupId: ").append(toIndentedString(memberGroupId)).append("\n");
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
