package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * WhiteBlackIpResponseBody
 */
public class WhiteBlackIpResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_group")

    private IpGroup ipGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_mode")

    private String timeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "terminal")

    private Long terminal;

    public WhiteBlackIpResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public WhiteBlackIpResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 黑白名单规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WhiteBlackIpResponseBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public WhiteBlackIpResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则的时间戳（毫秒）
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public WhiteBlackIpResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WhiteBlackIpResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 规则状态标识，用于指定规则的启用或关闭状态 **约束限制：** 不涉及 **取值范围：**  - 0：关闭  - 1：开启 **默认取值：** 不涉及
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public WhiteBlackIpResponseBody withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * Ip/Ip段
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public WhiteBlackIpResponseBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 防护动作：  - 0拦截  - 1放行  - 2仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    public WhiteBlackIpResponseBody withIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public WhiteBlackIpResponseBody withIpGroup(Consumer<IpGroup> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new IpGroup();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public IpGroup getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
    }

    public WhiteBlackIpResponseBody withTimeMode(String timeMode) {
        this.timeMode = timeMode;
        return this;
    }

    /**
     * 生效模式，默认为permanent（立即生效）
     * @return timeMode
     */
    public String getTimeMode() {
        return timeMode;
    }

    public void setTimeMode(String timeMode) {
        this.timeMode = timeMode;
    }

    public WhiteBlackIpResponseBody withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * 规则生效的开始时间，生效模式为自定义时，此字段才有效
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public WhiteBlackIpResponseBody withTerminal(Long terminal) {
        this.terminal = terminal;
        return this;
    }

    /**
     * 规则生效的结束时间，生效模式为自定义时，此字段才有效
     * @return terminal
     */
    public Long getTerminal() {
        return terminal;
    }

    public void setTerminal(Long terminal) {
        this.terminal = terminal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WhiteBlackIpResponseBody that = (WhiteBlackIpResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.timestamp, that.timestamp)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.addr, that.addr) && Objects.equals(this.white, that.white)
            && Objects.equals(this.ipGroup, that.ipGroup) && Objects.equals(this.timeMode, that.timeMode)
            && Objects.equals(this.start, that.start) && Objects.equals(this.terminal, that.terminal);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, policyid, timestamp, description, status, addr, white, ipGroup, timeMode, start, terminal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WhiteBlackIpResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
        sb.append("    timeMode: ").append(toIndentedString(timeMode)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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
