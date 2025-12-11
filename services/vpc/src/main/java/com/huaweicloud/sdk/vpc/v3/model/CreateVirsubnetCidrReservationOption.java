package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateVirsubnetCidrReservationOption
 */
public class CreateVirsubnetCidrReservationOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virsubnet_id")

    private String virsubnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cidr")

    private String cidr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mask")

    private Integer mask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateVirsubnetCidrReservationOption withVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段所属的子网ID。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return virsubnetId
     */
    public String getVirsubnetId() {
        return virsubnetId;
    }

    public void setVirsubnetId(String virsubnetId) {
        this.virsubnetId = virsubnetId;
    }

    public CreateVirsubnetCidrReservationOption withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的IP版本，支持IPv4和IPv6。 **约束限制**： 不涉及。 **取值范围**： - 4：表示IPv4。 - 6：表示IPv6。 **默认取值**： 不涉及。
     * @return ipVersion
     */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    public CreateVirsubnetCidrReservationOption withCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的IP网段。 **约束限制**： - CIDR格式，掩码长度最小值为“所属子网的网段掩码 + 2”，最大值为32（IPv4）或128（IPv6）。 - cidr和mask参数必须输入一个，两者同时输入时不能冲突。 - 子网预留网段不能包含所属子网的已使用的地址和系统预留地址（子网的第1个和最后2个地址）。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return cidr
     */
    public String getCidr() {
        return cidr;
    }

    public void setCidr(String cidr) {
        this.cidr = cidr;
    }

    public CreateVirsubnetCidrReservationOption withMask(Integer mask) {
        this.mask = mask;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的IP网段掩码长度。 **约束限制**： - 整数，预留网段的掩码长度最小值为“所属子网的网段掩码 + 2”，最大值为32（IPv4）或128（IPv6）。 - cidr和mask参数必须输入一个，两者同时输入时不能冲突。 - 子网预留网段不能包含所属子网的已使用的地址和系统预留地址（子网的第1个和最后2个地址）。 - 指定掩码长度创建预留网段，最后mask与子网掩码的差值长度的bit位由系统自动分配，例如子网cidr为192.168.21.0/24，子网掩码长度24，指定预留网段长度为27，差值长度27 - 24 = 3，即第25,26,27这3个bit位由系统自动分配。例如：   - 第25-27的bit位分配为011，最终创建出的子网预留网段cidr是192.168.21.96/27，其中96转为二进制是0110 0000；   - 第25-27的bit位分配为110，最终创建出的子网预留网段cidr是192.168.21.192/27，其中192转为二进制是1100 0000。  **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return mask
     */
    public Integer getMask() {
        return mask;
    }

    public void setMask(Integer mask) {
        this.mask = mask;
    }

    public CreateVirsubnetCidrReservationOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的名称。 **约束限制**： 1-64个字符，支持数字、字母、中文、_(下划线)、-（中划线）、.（点）。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateVirsubnetCidrReservationOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 子网预留网段的描述信息。 **约束限制**： 0-255个字符，不能包含“<”和“>”。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVirsubnetCidrReservationOption that = (CreateVirsubnetCidrReservationOption) obj;
        return Objects.equals(this.virsubnetId, that.virsubnetId) && Objects.equals(this.ipVersion, that.ipVersion)
            && Objects.equals(this.cidr, that.cidr) && Objects.equals(this.mask, that.mask)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(virsubnetId, ipVersion, cidr, mask, name, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVirsubnetCidrReservationOption {\n");
        sb.append("    virsubnetId: ").append(toIndentedString(virsubnetId)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
        sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
