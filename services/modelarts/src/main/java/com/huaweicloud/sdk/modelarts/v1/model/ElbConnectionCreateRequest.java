package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ElbConnectionCreateRequest
 */
public class ElbConnectionCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "m_tls")

    private Boolean mTls;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca_cert_id")

    private String caCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_cert_id")

    private String serverCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni_cert_ids")

    private List<String> sniCertIds = null;

    public ElbConnectionCreateRequest withElbId(String elbId) {
        this.elbId = elbId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器ID。 **约束限制：**  不涉及。 **取值范围：** 不涉及。 **默认取值：**  不涉及。
     * @return elbId
     */
    public String getElbId() {
        return elbId;
    }

    public void setElbId(String elbId) {
        this.elbId = elbId;
    }

    public ElbConnectionCreateRequest withMTls(Boolean mTls) {
        this.mTls = mTls;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器的HTTPS监听器是否开启双向认证。 **约束限制：** 仅推理服务协议为HTTPS或WSS时可配置为true，否则忽略该配置 **取值范围：** 不涉及。 **默认取值：** false
     * @return mTls
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "m_tls")
    public Boolean getMTls() {
        return mTls;
    }

    public void setMTls(Boolean mTls) {
        this.mTls = mTls;
    }

    public ElbConnectionCreateRequest withCaCertId(String caCertId) {
        this.caCertId = caCertId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器的HTTPS监听器配置的客户端证书ID。 **约束限制：** 仅推理服务协议为HTTPS或WSS时可配置，否则忽略该配置 **取值范围：** 不涉及。 **默认取值：**  不涉及。
     * @return caCertId
     */
    public String getCaCertId() {
        return caCertId;
    }

    public void setCaCertId(String caCertId) {
        this.caCertId = caCertId;
    }

    public ElbConnectionCreateRequest withServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器的HTTPS监听器配置的服务端证书ID。 **约束限制：** 仅推理服务协议为HTTPS或WSS时可配置，否则忽略该配置。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return serverCertId
     */
    public String getServerCertId() {
        return serverCertId;
    }

    public void setServerCertId(String serverCertId) {
        this.serverCertId = serverCertId;
    }

    public ElbConnectionCreateRequest withSniCertIds(List<String> sniCertIds) {
        this.sniCertIds = sniCertIds;
        return this;
    }

    public ElbConnectionCreateRequest addSniCertIdsItem(String sniCertIdsItem) {
        if (this.sniCertIds == null) {
            this.sniCertIds = new ArrayList<>();
        }
        this.sniCertIds.add(sniCertIdsItem);
        return this;
    }

    public ElbConnectionCreateRequest withSniCertIds(Consumer<List<String>> sniCertIdsSetter) {
        if (this.sniCertIds == null) {
            this.sniCertIds = new ArrayList<>();
        }
        sniCertIdsSetter.accept(this.sniCertIds);
        return this;
    }

    /**
     * **参数解释：** 负载均衡器的HTTPS监听器配置的SNI（服务器名称指示）证书ID列表。 **约束限制：** 仅推理服务协议为HTTPS或WSS时可配置，否则忽略该配置。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return sniCertIds
     */
    public List<String> getSniCertIds() {
        return sniCertIds;
    }

    public void setSniCertIds(List<String> sniCertIds) {
        this.sniCertIds = sniCertIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElbConnectionCreateRequest that = (ElbConnectionCreateRequest) obj;
        return Objects.equals(this.elbId, that.elbId) && Objects.equals(this.mTls, that.mTls)
            && Objects.equals(this.caCertId, that.caCertId) && Objects.equals(this.serverCertId, that.serverCertId)
            && Objects.equals(this.sniCertIds, that.sniCertIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elbId, mTls, caCertId, serverCertId, sniCertIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElbConnectionCreateRequest {\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
        sb.append("    mTls: ").append(toIndentedString(mTls)).append("\n");
        sb.append("    caCertId: ").append(toIndentedString(caCertId)).append("\n");
        sb.append("    serverCertId: ").append(toIndentedString(serverCertId)).append("\n");
        sb.append("    sniCertIds: ").append(toIndentedString(sniCertIds)).append("\n");
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
