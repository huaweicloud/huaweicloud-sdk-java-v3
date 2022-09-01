package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * MemberBase
 */
public class MemberBase {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    @JacksonXmlProperty(localName = "host")

    private String host;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "weight")

    @JacksonXmlProperty(localName = "weight")

    private Integer weight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_backup")

    @JacksonXmlProperty(localName = "is_backup")

    private Boolean isBackup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_group_name")

    @JacksonXmlProperty(localName = "member_group_name")

    private String memberGroupName;

    /**
     * 后端服务器状态   - 1：可用   - 2：不可用
     */
    public static final class StatusEnum {

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final StatusEnum NUMBER_1 = new StatusEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
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

    @JacksonXmlProperty(localName = "status")

    private StatusEnum status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    @JacksonXmlProperty(localName = "port")

    private Integer port;

    public MemberBase withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * 后端服务器地址  后端实例类型为ip时必填
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
     * 权重值。  允许您对后端服务进行评级，权重值越大，转发到该云服务的请求数量越多。
     * minimum: 0
     * maximum: 10000
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
     * 是否备用节点。  开启后对应后端服务为备用节点，仅当非备用节点全部故障时工作。  实例需要升级到对应版本才支持此功能，若不支持请联系技术支持。
     * @return isBackup
     */
    public Boolean getIsBackup() {
        return isBackup;
    }

    public void setIsBackup(Boolean isBackup) {
        this.isBackup = isBackup;
    }

    public MemberBase withMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
        return this;
    }

    /**
     * 后端服务器组名称。为后端服务地址选择服务器组，便于统一修改对应服务器组的后端地址。  暂不支持
     * @return memberGroupName
     */
    public String getMemberGroupName() {
        return memberGroupName;
    }

    public void setMemberGroupName(String memberGroupName) {
        this.memberGroupName = memberGroupName;
    }

    public MemberBase withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * 后端服务器状态   - 1：可用   - 2：不可用
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public MemberBase withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 后端服务器端口
     * minimum: 0
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
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
        return Objects.equals(this.host, memberBase.host) && Objects.equals(this.weight, memberBase.weight)
            && Objects.equals(this.isBackup, memberBase.isBackup)
            && Objects.equals(this.memberGroupName, memberBase.memberGroupName)
            && Objects.equals(this.status, memberBase.status) && Objects.equals(this.port, memberBase.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(host, weight, isBackup, memberGroupName, status, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberBase {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
        sb.append("    isBackup: ").append(toIndentedString(isBackup)).append("\n");
        sb.append("    memberGroupName: ").append(toIndentedString(memberGroupName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
