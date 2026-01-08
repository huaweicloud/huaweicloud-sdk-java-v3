package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 复制域名请求体 **约束限制：** 不涉及
 */
public class DuplicateDomainRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reference_domain_name")

    private String referenceDomainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public DuplicateDomainRequestBody withReferenceDomainName(String referenceDomainName) {
        this.referenceDomainName = referenceDomainName;
        return this;
    }

    /**
     * **参数解释：** 存量加速域名，将该域名的配置复制给新添加的域名。  **约束限制：** 已经在CDN添加成功的域名。 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return referenceDomainName
     */
    public String getReferenceDomainName() {
        return referenceDomainName;
    }

    public void setReferenceDomainName(String referenceDomainName) {
        this.referenceDomainName = referenceDomainName;
    }

    public DuplicateDomainRequestBody withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数解释：** 需要添加到CDN控制台加速的域名 > 添加泛域名后，该泛域名所有次级域名均默认接入CDN加速。  **约束限制：** 加速域名不允许重复添加 **取值范围：** - 域名长度不能超过200个字符 - 支持大小写字母、数字、\"-\"、\".\"，首尾字符不能是\"-\"或\".\" - 泛域名场景下支持\"*\"，且\"*\"必须为首字符 - 域名单节点长度不超过63个字符，即：xxx.xxx.com中，xxx的字符数不超过63个字符  **默认取值：** 不涉及
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DuplicateDomainRequestBody that = (DuplicateDomainRequestBody) obj;
        return Objects.equals(this.referenceDomainName, that.referenceDomainName)
            && Objects.equals(this.domainName, that.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(referenceDomainName, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DuplicateDomainRequestBody {\n");
        sb.append("    referenceDomainName: ").append(toIndentedString(referenceDomainName)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
