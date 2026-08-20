package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ElbConnectionResponse
 */
public class ElbConnectionResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "elb_id")

    private String elbId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "listener_id")

    private String listenerId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "residual_resources")

    private ResidualResources residualResources;

    public ElbConnectionResponse withElbId(String elbId) {
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

    public ElbConnectionResponse withListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }

    /**
     * **参数解释：** 负载均衡器的监听器ID。 **约束限制：**  不涉及。 **取值范围：** 不涉及。 **默认取值：**  不涉及。
     * @return listenerId
     */
    public String getListenerId() {
        return listenerId;
    }

    public void setListenerId(String listenerId) {
        this.listenerId = listenerId;
    }

    public ElbConnectionResponse withMTls(Boolean mTls) {
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

    public ElbConnectionResponse withCaCertId(String caCertId) {
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

    public ElbConnectionResponse withServerCertId(String serverCertId) {
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

    public ElbConnectionResponse withSniCertIds(List<String> sniCertIds) {
        this.sniCertIds = sniCertIds;
        return this;
    }

    public ElbConnectionResponse addSniCertIdsItem(String sniCertIdsItem) {
        if (this.sniCertIds == null) {
            this.sniCertIds = new ArrayList<>();
        }
        this.sniCertIds.add(sniCertIdsItem);
        return this;
    }

    public ElbConnectionResponse withSniCertIds(Consumer<List<String>> sniCertIdsSetter) {
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

    public ElbConnectionResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** ELB连接状态。 **约束限制：** 仅在响应中返回，请求中传入不生效。 **取值范围：** - CONNECTING：连接中。 - CONNECTED：已连接。 - CONNECT_FAILED：连接失败。 - DISCONNECTING：断开中 - DISCONNET_FAILED：断开失败 **默认取值：** 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ElbConnectionResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** ELB连接失败时的错误信息。 **约束限制：** 仅在响应中返回，请求中传入不生效；仅当ELB连接状态为CONNECT_FAILED时返回。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ElbConnectionResponse withResidualResources(ResidualResources residualResources) {
        this.residualResources = residualResources;
        return this;
    }

    public ElbConnectionResponse withResidualResources(Consumer<ResidualResources> residualResourcesSetter) {
        if (this.residualResources == null) {
            this.residualResources = new ResidualResources();
            residualResourcesSetter.accept(this.residualResources);
        }

        return this;
    }

    /**
     * Get residualResources
     * @return residualResources
     */
    public ResidualResources getResidualResources() {
        return residualResources;
    }

    public void setResidualResources(ResidualResources residualResources) {
        this.residualResources = residualResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ElbConnectionResponse that = (ElbConnectionResponse) obj;
        return Objects.equals(this.elbId, that.elbId) && Objects.equals(this.listenerId, that.listenerId)
            && Objects.equals(this.mTls, that.mTls) && Objects.equals(this.caCertId, that.caCertId)
            && Objects.equals(this.serverCertId, that.serverCertId) && Objects.equals(this.sniCertIds, that.sniCertIds)
            && Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.residualResources, that.residualResources);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(elbId, listenerId, mTls, caCertId, serverCertId, sniCertIds, status, message, residualResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ElbConnectionResponse {\n");
        sb.append("    elbId: ").append(toIndentedString(elbId)).append("\n");
        sb.append("    listenerId: ").append(toIndentedString(listenerId)).append("\n");
        sb.append("    mTls: ").append(toIndentedString(mTls)).append("\n");
        sb.append("    caCertId: ").append(toIndentedString(caCertId)).append("\n");
        sb.append("    serverCertId: ").append(toIndentedString(serverCertId)).append("\n");
        sb.append("    sniCertIds: ").append(toIndentedString(sniCertIds)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    residualResources: ").append(toIndentedString(residualResources)).append("\n");
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
