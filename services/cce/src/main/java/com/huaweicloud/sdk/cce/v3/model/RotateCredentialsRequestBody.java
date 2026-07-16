package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RotateCredentialsRequestBody
 */
public class RotateCredentialsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component")

    private String component;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificateExpirationTime")

    private Integer certificateExpirationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certContent")

    private AuthenticatingProxy certContent;

    public RotateCredentialsRequestBody withComponent(String component) {
        this.component = component;
        return this;
    }

    /**
     * **参数解释：**  需要轮转的组件名称。 **约束限制：** 不涉及 **取值范围：** - all：轮转CCE集群证书。 - service-account-controller：轮转ServiceAccount token相关证书。 - custom：轮转用户自有证书，指定此参数时，需同时指定certContent参数。  **默认取值：** 不涉及 
     * @return component
     */
    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public RotateCredentialsRequestBody withCertificateExpirationTime(Integer certificateExpirationTime) {
        this.certificateExpirationTime = certificateExpirationTime;
        return this;
    }

    /**
     * **参数解释：**  轮转证书后，用于验证ServiceAccount Token签名的旧证书保留时间。  为了保证基于旧证书签发的ServiceAccount Token在证书轮转后能验签通过，CCE会保留老证书一段时间，具体规则如下： - 首次轮转时，CCE会保留创建集群时生成的证书； - 从第二次轮转开始，CCE会保留老证书一段时间，默认24小时。用户可以通过当前参数配置保留的时间。  **约束限制：** 不涉及 **取值范围：** 0-8784（小时） **默认取值：** 24（小时） 
     * minimum: 0
     * maximum: 8784
     * @return certificateExpirationTime
     */
    public Integer getCertificateExpirationTime() {
        return certificateExpirationTime;
    }

    public void setCertificateExpirationTime(Integer certificateExpirationTime) {
        this.certificateExpirationTime = certificateExpirationTime;
    }

    public RotateCredentialsRequestBody withCertContent(AuthenticatingProxy certContent) {
        this.certContent = certContent;
        return this;
    }

    public RotateCredentialsRequestBody withCertContent(Consumer<AuthenticatingProxy> certContentSetter) {
        if (this.certContent == null) {
            this.certContent = new AuthenticatingProxy();
            certContentSetter.accept(this.certContent);
        }

        return this;
    }

    /**
     * Get certContent
     * @return certContent
     */
    public AuthenticatingProxy getCertContent() {
        return certContent;
    }

    public void setCertContent(AuthenticatingProxy certContent) {
        this.certContent = certContent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RotateCredentialsRequestBody that = (RotateCredentialsRequestBody) obj;
        return Objects.equals(this.component, that.component)
            && Objects.equals(this.certificateExpirationTime, that.certificateExpirationTime)
            && Objects.equals(this.certContent, that.certContent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(component, certificateExpirationTime, certContent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RotateCredentialsRequestBody {\n");
        sb.append("    component: ").append(toIndentedString(component)).append("\n");
        sb.append("    certificateExpirationTime: ").append(toIndentedString(certificateExpirationTime)).append("\n");
        sb.append("    certContent: ").append(toIndentedString(certContent)).append("\n");
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
