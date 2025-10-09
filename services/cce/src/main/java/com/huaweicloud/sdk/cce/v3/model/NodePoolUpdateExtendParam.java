package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * **参数解释**： 节点池更新时支持的扩展参数。 **约束限制**： 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
 */
public class NodePoolUpdateExtendParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/preInstall")

    private String alphaCcePreInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/postInstall")

    private String alphaCcePostInstall;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spotPrice")

    private String spotPrice;

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。[详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。](tag:hws) 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： - 空值：表示不开启等保加固 - cybersecurity：表示开启等保加固  **默认取值**： 不涉及
     */
    public static final class SecurityReinforcementTypeEnum {

        /**
         * Enum NULL for value: "null"
         */
        public static final SecurityReinforcementTypeEnum NULL = new SecurityReinforcementTypeEnum("null");

        /**
         * Enum CYBERSECURITY for value: "cybersecurity"
         */
        public static final SecurityReinforcementTypeEnum CYBERSECURITY =
            new SecurityReinforcementTypeEnum("cybersecurity");

        private static final Map<String, SecurityReinforcementTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SecurityReinforcementTypeEnum> createStaticFields() {
            Map<String, SecurityReinforcementTypeEnum> map = new HashMap<>();
            map.put("null", NULL);
            map.put("cybersecurity", CYBERSECURITY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SecurityReinforcementTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SecurityReinforcementTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new SecurityReinforcementTypeEnum(value));
        }

        public static SecurityReinforcementTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SecurityReinforcementTypeEnum) {
                return this.value.equals(((SecurityReinforcementTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "securityReinforcementType")

    private SecurityReinforcementTypeEnum securityReinforcementType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alpha.cce/NodeImageID")

    private String alphaCceNodeImageID;

    public NodePoolUpdateExtendParam withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**： 委托的名称。 委托是由租户管理员在统一身份认证服务（Identity and AccessManagement，IAM）上创建的，可以为CCE节点提供访问云服务器的临时凭证。 **约束限制**： 作为响应参数仅在创建节点传入时返回该字段。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public NodePoolUpdateExtendParam withAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
        return this;
    }

    /**
     * **参数解释**： 安装前执行脚本。 输入的值需要经过Base64编码，方法如下：   ```   echo -n \"待编码内容\" | base64   ```   **约束限制**：  安装前/后执行脚本统一计算字符，转码后的字符总数不能超过10240。  **取值范围：**  不涉及  **默认取值：**  不涉及
     * @return alphaCcePreInstall
     */
    public String getAlphaCcePreInstall() {
        return alphaCcePreInstall;
    }

    public void setAlphaCcePreInstall(String alphaCcePreInstall) {
        this.alphaCcePreInstall = alphaCcePreInstall;
    }

    public NodePoolUpdateExtendParam withAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
        return this;
    }

    /**
     * **参数解释**： 安装后执行脚本。 输入的值需要经过Base64编码，方法如下：   ```   echo -n \"待编码内容\" | base64   ```  **约束限制**： 安装前/后执行脚本统一计算字符，转码后的字符总数不能超过10240。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return alphaCcePostInstall
     */
    public String getAlphaCcePostInstall() {
        return alphaCcePostInstall;
    }

    public void setAlphaCcePostInstall(String alphaCcePostInstall) {
        this.alphaCcePostInstall = alphaCcePostInstall;
    }

    public NodePoolUpdateExtendParam withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * **参数解释**： 用户愿意为竞价实例每小时支付的最高价格。 **约束限制**： - 仅billingMode=0且marketType=spot时，该参数设置后生效。 - 当billingMode=0且marketType=spot时，如果不传递spotPrice，默认使用按需购买的价格作为竞价。 - spotPrice需要小于等于按需价格并大于等于云服务器市场价格。  **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return spotPrice
     */
    public String getSpotPrice() {
        return spotPrice;
    }

    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public NodePoolUpdateExtendParam withSecurityReinforcementType(
        SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
        return this;
    }

    /**
     * **参数解释**： 指定节点安全加固类型，当前仅支持HCE2.0镜像等保2.0三级安全加固。 等保加固会对身份鉴别、访问控制、安全审计、入侵防范、恶意代码防范进行检查并加固。[详情请参见[Huawei Cloud EulerOS 2.0等保2.0三级版镜像概述](https://support.huaweicloud.com/productdesc-hce/hce_sec_0001.html)。](tag:hws) 若未指定此参数，则尝试用原有的值补全。如：原先HCE2.0镜像已配置安全加固，更新节点池时未指定此参数，则仍旧保持安全加固配置，若要取消，需显式指定参数值为\"null\"。 **约束限制**： 不涉及 **取值范围**： - 空值：表示不开启等保加固 - cybersecurity：表示开启等保加固  **默认取值**： 不涉及
     * @return securityReinforcementType
     */
    public SecurityReinforcementTypeEnum getSecurityReinforcementType() {
        return securityReinforcementType;
    }

    public void setSecurityReinforcementType(SecurityReinforcementTypeEnum securityReinforcementType) {
        this.securityReinforcementType = securityReinforcementType;
    }

    public NodePoolUpdateExtendParam withAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
        return this;
    }

    /**
     * **参数解释**： 节点自定义镜像ID，从IMS控制台获取，需要使用自定义镜像时用此参数。 **约束限制**： 不涉及 [> - 若指定了extendParam中的securityReinforcementType参数为cybersecurity，节点将开启安全等保加固功能，则节点的操作系统类型必须使用HCE2.0。](tag:hws)  **取值范围**： 不涉及 **默认取值**： 不涉及
     * @return alphaCceNodeImageID
     */
    public String getAlphaCceNodeImageID() {
        return alphaCceNodeImageID;
    }

    public void setAlphaCceNodeImageID(String alphaCceNodeImageID) {
        this.alphaCceNodeImageID = alphaCceNodeImageID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodePoolUpdateExtendParam that = (NodePoolUpdateExtendParam) obj;
        return Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.alphaCcePreInstall, that.alphaCcePreInstall)
            && Objects.equals(this.alphaCcePostInstall, that.alphaCcePostInstall)
            && Objects.equals(this.spotPrice, that.spotPrice)
            && Objects.equals(this.securityReinforcementType, that.securityReinforcementType)
            && Objects.equals(this.alphaCceNodeImageID, that.alphaCceNodeImageID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName,
            alphaCcePreInstall,
            alphaCcePostInstall,
            spotPrice,
            securityReinforcementType,
            alphaCceNodeImageID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodePoolUpdateExtendParam {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    alphaCcePreInstall: ").append(toIndentedString(alphaCcePreInstall)).append("\n");
        sb.append("    alphaCcePostInstall: ").append(toIndentedString(alphaCcePostInstall)).append("\n");
        sb.append("    spotPrice: ").append(toIndentedString(spotPrice)).append("\n");
        sb.append("    securityReinforcementType: ").append(toIndentedString(securityReinforcementType)).append("\n");
        sb.append("    alphaCceNodeImageID: ").append(toIndentedString(alphaCceNodeImageID)).append("\n");
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
