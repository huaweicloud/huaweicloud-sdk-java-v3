package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ListAvailableZonesElements
 */
public class ListAvailableZonesElements {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "soldOut")

    private Boolean soldOut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_availability")

    private String resourceAvailability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_az")

    private Boolean defaultAz;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_time")

    private Long remainTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope")

    private String scope;

    public ListAvailableZonesElements withSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
        return this;
    }

    /**
     * **参数解释**： 是否售罄。 **约束限制**： 不涉及。 **取值范围**： - true：售罄。 - false：未售罄。 **默认取值**： 不涉及。
     * @return soldOut
     */
    public Boolean getSoldOut() {
        return soldOut;
    }

    public void setSoldOut(Boolean soldOut) {
        this.soldOut = soldOut;
    }

    public ListAvailableZonesElements withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 可用区ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListAvailableZonesElements withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * **参数解释**： 可用区编码。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ListAvailableZonesElements withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 可用区名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListAvailableZonesElements withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**： 可用区端口号。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public ListAvailableZonesElements withResourceAvailability(String resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
        return this;
    }

    /**
     * **参数解释**： 分区上是否还有可用资源。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return resourceAvailability
     */
    public String getResourceAvailability() {
        return resourceAvailability;
    }

    public void setResourceAvailability(String resourceAvailability) {
        this.resourceAvailability = resourceAvailability;
    }

    public ListAvailableZonesElements withDefaultAz(Boolean defaultAz) {
        this.defaultAz = defaultAz;
        return this;
    }

    /**
     * **参数解释**： 是否为默认可用区。 **约束限制**： 不涉及。 **取值范围**： - true：默认可用区 - false：不是默认可用区 **默认取值**： 不涉及。
     * @return defaultAz
     */
    public Boolean getDefaultAz() {
        return defaultAz;
    }

    public void setDefaultAz(Boolean defaultAz) {
        this.defaultAz = defaultAz;
    }

    public ListAvailableZonesElements withRemainTime(Long remainTime) {
        this.remainTime = remainTime;
        return this;
    }

    /**
     * **参数解释**： 剩余时间。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return remainTime
     */
    public Long getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(Long remainTime) {
        this.remainTime = remainTime;
    }

    public ListAvailableZonesElements withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * **参数解释**： 是否支持IPv6。[华为云Stack不支持此参数。](tag:hcs,hcs_oemout) **约束限制**： 不涉及。 **取值范围**： - true：支持 - false：不支持 **默认取值**： 不涉及。
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public ListAvailableZonesElements withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： AZ模式。 **取值范围**： - dedicated：边缘AZ - shared：本地AZ - center：中心AZ
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public ListAvailableZonesElements withScope(String scope) {
        this.scope = scope;
        return this;
    }

    /**
     * **参数解释**： 可用区分组。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return scope
     */
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAvailableZonesElements that = (ListAvailableZonesElements) obj;
        return Objects.equals(this.soldOut, that.soldOut) && Objects.equals(this.id, that.id)
            && Objects.equals(this.code, that.code) && Objects.equals(this.name, that.name)
            && Objects.equals(this.port, that.port)
            && Objects.equals(this.resourceAvailability, that.resourceAvailability)
            && Objects.equals(this.defaultAz, that.defaultAz) && Objects.equals(this.remainTime, that.remainTime)
            && Objects.equals(this.ipv6Enable, that.ipv6Enable) && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(soldOut, id, code, name, port, resourceAvailability, defaultAz, remainTime, ipv6Enable, mode, scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAvailableZonesElements {\n");
        sb.append("    soldOut: ").append(toIndentedString(soldOut)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    resourceAvailability: ").append(toIndentedString(resourceAvailability)).append("\n");
        sb.append("    defaultAz: ").append(toIndentedString(defaultAz)).append("\n");
        sb.append("    remainTime: ").append(toIndentedString(remainTime)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
