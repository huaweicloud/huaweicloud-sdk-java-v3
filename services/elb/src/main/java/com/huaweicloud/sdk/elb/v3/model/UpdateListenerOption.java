package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新监听器请求参数
 */
public class UpdateListenerOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ca_tls_container_ref")

    private String clientCaTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_pool_id")

    private String defaultPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_tls_container_ref")

    private String defaultTlsContainerRef;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2_enable")

    private Boolean http2Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "insert_headers")

    private ListenerInsertHeaders insertHeaders;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni_container_refs")

    private List<String> sniContainerRefs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sni_match_algo")

    private String sniMatchAlgo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tls_ciphers_policy")

    private String tlsCiphersPolicy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_policy_id")

    private String securityPolicyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_member_retry")

    private Boolean enableMemberRetry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "member_timeout")

    private Integer memberTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_timeout")

    private Integer clientTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keepalive_timeout")

    private Integer keepaliveTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private UpdateListenerIpGroupOption ipgroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transparent_client_ip_enable")

    private Boolean transparentClientIpEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxy_protocol_enable")

    private Boolean proxyProtocolEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enhance_l7policy_enable")

    private Boolean enhanceL7policyEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quic_config")

    private UpdateListenerQuicConfigOption quicConfig;

    /**
     * 参数解释：修改保护状态。  取值范围： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     */
    public static final class ProtectionStatusEnum {

        /**
         * Enum NONPROTECTION for value: "nonProtection"
         */
        public static final ProtectionStatusEnum NONPROTECTION = new ProtectionStatusEnum("nonProtection");

        /**
         * Enum CONSOLEPROTECTION for value: "consoleProtection"
         */
        public static final ProtectionStatusEnum CONSOLEPROTECTION = new ProtectionStatusEnum("consoleProtection");

        private static final Map<String, ProtectionStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionStatusEnum> createStaticFields() {
            Map<String, ProtectionStatusEnum> map = new HashMap<>();
            map.put("nonProtection", NONPROTECTION);
            map.put("consoleProtection", CONSOLEPROTECTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionStatusEnum(String value) {
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
        public static ProtectionStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtectionStatusEnum(value));
        }

        public static ProtectionStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionStatusEnum) {
                return this.value.equals(((ProtectionStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_status")

    private ProtectionStatusEnum protectionStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_reason")

    private String protectionReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gzip_enable")

    private Boolean gzipEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_early_data_enable")

    private Boolean sslEarlyDataEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cps")

    private Integer cps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection")

    private Integer connection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nat64_enable")

    private Boolean nat64Enable;

    public UpdateListenerOption withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /**
     * 参数解释：监听器的管理状态。  约束限制：只支持更新为true。  [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * @return adminStateUp
     */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public UpdateListenerOption withClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
        return this;
    }

    /**
     * 参数解释：监听器使用的CA证书ID。  约束限制： - 当且仅当type=client时，才会使用该字段对应的证书。 - 监听器协议为QUIC时不支持该字段。  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt,dt_test)
     * @return clientCaTlsContainerRef
     */
    public String getClientCaTlsContainerRef() {
        return clientCaTlsContainerRef;
    }

    public void setClientCaTlsContainerRef(String clientCaTlsContainerRef) {
        this.clientCaTlsContainerRef = clientCaTlsContainerRef;
    }

    public UpdateListenerOption withDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
        return this;
    }

    /**
     * 参数解释：监听器的默认后端服务器组ID。当请求没有匹配的转发策略时，转发到默认后端服务器上处理。
     * @return defaultPoolId
     */
    public String getDefaultPoolId() {
        return defaultPoolId;
    }

    public void setDefaultPoolId(String defaultPoolId) {
        this.defaultPoolId = defaultPoolId;
    }

    public UpdateListenerOption withDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
        return this;
    }

    /**
     * 参数解释：监听器使用的服务器证书ID。  约束限制：当监听器协议为HTTPS时，该字段必传，且对应的证书的type必须是server类型。
     * @return defaultTlsContainerRef
     */
    public String getDefaultTlsContainerRef() {
        return defaultTlsContainerRef;
    }

    public void setDefaultTlsContainerRef(String defaultTlsContainerRef) {
        this.defaultTlsContainerRef = defaultTlsContainerRef;
    }

    public UpdateListenerOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 参数解释：监听器的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateListenerOption withHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
        return this;
    }

    /**
     * 参数解释：客户端与LB之间的HTTPS请求的HTTP2功能的开启状态。 开启后，可提升客户端与LB间的访问性能，但LB与后端服务器间仍采用HTTP1.X协议。  约束限制： - 仅HTTPS协议监听器有效。 - QUIC监听器不能设置该字段，固定返回为true。 - 其他协议的监听器可设置该字段但无效，无论取值如何都不影响监听器正常运行。  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt,dt_test)
     * @return http2Enable
     */
    public Boolean getHttp2Enable() {
        return http2Enable;
    }

    public void setHttp2Enable(Boolean http2Enable) {
        this.http2Enable = http2Enable;
    }

    public UpdateListenerOption withInsertHeaders(ListenerInsertHeaders insertHeaders) {
        this.insertHeaders = insertHeaders;
        return this;
    }

    public UpdateListenerOption withInsertHeaders(Consumer<ListenerInsertHeaders> insertHeadersSetter) {
        if (this.insertHeaders == null) {
            this.insertHeaders = new ListenerInsertHeaders();
            insertHeadersSetter.accept(this.insertHeaders);
        }

        return this;
    }

    /**
     * Get insertHeaders
     * @return insertHeaders
     */
    public ListenerInsertHeaders getInsertHeaders() {
        return insertHeaders;
    }

    public void setInsertHeaders(ListenerInsertHeaders insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    public UpdateListenerOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释：监听器的名称。  约束限制：若名称为空，则在控制台的监听器列表无法选择并查看监听器详情。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateListenerOption withSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
        return this;
    }

    public UpdateListenerOption addSniContainerRefsItem(String sniContainerRefsItem) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        this.sniContainerRefs.add(sniContainerRefsItem);
        return this;
    }

    public UpdateListenerOption withSniContainerRefs(Consumer<List<String>> sniContainerRefsSetter) {
        if (this.sniContainerRefs == null) {
            this.sniContainerRefs = new ArrayList<>();
        }
        sniContainerRefsSetter.accept(this.sniContainerRefs);
        return this;
    }

    /**
     * 参数解释：监听器使用的SNI证书（带域名的服务器证书）ID列表。  约束限制： - 列表对应的所有SNI证书的域名不允许存在重复。 - 列表对应的所有SNI证书的域名总数不超过50。
     * @return sniContainerRefs
     */
    public List<String> getSniContainerRefs() {
        return sniContainerRefs;
    }

    public void setSniContainerRefs(List<String> sniContainerRefs) {
        this.sniContainerRefs = sniContainerRefs;
    }

    public UpdateListenerOption withSniMatchAlgo(String sniMatchAlgo) {
        this.sniMatchAlgo = sniMatchAlgo;
        return this;
    }

    /**
     * 参数解释：监听器使用的SNI证书泛域名匹配方式。  取值范围： - longest_suffix表示最长尾缀匹配。 - wildcard表示标准域名分级匹配。  默认取值：wildcard。
     * @return sniMatchAlgo
     */
    public String getSniMatchAlgo() {
        return sniMatchAlgo;
    }

    public void setSniMatchAlgo(String sniMatchAlgo) {
        this.sniMatchAlgo = sniMatchAlgo;
    }

    public UpdateListenerOption withTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
        return this;
    }

    /**
     * 参数解释：监听器使用的安全策略。  [约束限制： - 仅对HTTPS协议类型的监听器且关联LB为独享型时有效。 - QUIC监听器不支持该字段。 - 若同时设置了security_policy_id和tls_ciphers_policy，则仅security_policy_id生效。 - 加密套件的优先顺序为ecc套件、rsa套件、tls1.3协议的套件（即支持ecc又支持rsa） ](tag:hws,hws_hk,hws_eu,ocb,tlf,ctc,hcso,ct,sbc,g42,tm,cmcc,hk_g42,dt)  [约束限制： - 仅对HTTPS协议类型的监听器有效](tag:hcso_dt)  [取值范围：tls-1-0-inherit、tls-1-0、tls-1-1、 tls-1-2、tls-1-2-strict、tls-1-2-fs、tls-1-0-with-1-3、 tls-1-2-fs-with-1-3、 hybrid-policy-1-0、tls-1-2-strict-no-cbc，默认：tls-1-2。 ](tag:hws,hws_hk,ocb,tlf,ctc,hcso,ct,sbc,tm,cmcc,dt)  [取值范围：tls-1-0、tls-1-1、tls-1-2、 tls-1-2-strict，默认：tls-1-2。](tag:hws_eu,g42,hk_g42,hcso_dt)  [不支持tls1.3协议的套件。](tag:tm,hws_eu,g42,hk_g42)
     * @return tlsCiphersPolicy
     */
    public String getTlsCiphersPolicy() {
        return tlsCiphersPolicy;
    }

    public void setTlsCiphersPolicy(String tlsCiphersPolicy) {
        this.tlsCiphersPolicy = tlsCiphersPolicy;
    }

    public UpdateListenerOption withSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }

    /**
     * 参数解释：自定义安全策略的ID。  [约束限制： - 仅对HTTPS协议类型的监听器且关联LB为独享型时有效。 - 若同时设置了security_policy_id和tls_ciphers_policy，则仅security_policy_id生效。 - 加密套件的优先顺序为ecc套件、rsa套件、tls1.3协议的套件（即支持ecc又支持rsa） ](tag:hws,hws_hk,hws_eu,ocb,ctc,hcso,g42,tm,cmcc,hk_g42,dt)  [约束限制： - 仅对HTTPS协议类型的监听器有效](tag:hcso_dt)  [不支持tls1.3协议的套件。](tag:hws_eu,g42,hk_g42)
     * @return securityPolicyId
     */
    public String getSecurityPolicyId() {
        return securityPolicyId;
    }

    public void setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
    }

    public UpdateListenerOption withEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
        return this;
    }

    /**
     * 参数解释：是否开启后端服务器的重试。  [约束限制： - 若关联是共享型LB，仅在protocol为HTTP、TERMINATED_HTTPS时才能传入该字段。 - 若关联是独享型LB，仅在protocol为HTTP、HTTPS和QUIC时才能传入该字段。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt)  [约束限制： - 仅在protocol为HTTP、HTTPS时才能传入该字段。](tag:hws_eu,hcso_dt)  取值范围：true 开启重试；false 不开启重试。  默认取值：true。  [不支持QUIC。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt,dt_test)
     * @return enableMemberRetry
     */
    public Boolean getEnableMemberRetry() {
        return enableMemberRetry;
    }

    public void setEnableMemberRetry(Boolean enableMemberRetry) {
        this.enableMemberRetry = enableMemberRetry;
    }

    public UpdateListenerOption withMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
        return this;
    }

    /**
     * 参数解释：等待后端服务器响应超时时间。请求转发后端服务器后，在等待超时member_timeout时长没有响应，负载均衡将终止等待，并返回HTTP504错误码。  约束限制：仅支持协议为HTTP/HTTPS的监听器。  取值范围：1-300s。
     * @return memberTimeout
     */
    public Integer getMemberTimeout() {
        return memberTimeout;
    }

    public void setMemberTimeout(Integer memberTimeout) {
        this.memberTimeout = memberTimeout;
    }

    public UpdateListenerOption withClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
        return this;
    }

    /**
     * 参数解释：等待客户端请求超时时间，仅限协议为HTTP，HTTPS的监听器配置。  约束限制：TCP，UDP协议的监听器不支持此字段。  取值范围：1-300s  默认取值：60s
     * @return clientTimeout
     */
    public Integer getClientTimeout() {
        return clientTimeout;
    }

    public void setClientTimeout(Integer clientTimeout) {
        this.clientTimeout = clientTimeout;
    }

    public UpdateListenerOption withKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
        return this;
    }

    /**
     * 参数解释：客户端连接空闲超时时间。在超过keepalive_timeout时长一直没有请求，负载均衡会暂时中断当前连接，直到下一次请求时重新建立新的连接。  约束限制：共享型实例的UDP监听器不支持此字段。  取值范围： - TCP监听器[和IP监听器](tag:hws_eu)：10-4000s。 - 若为HTTP/HTTPS/TERMINATED_HTTPS监听器，取值范围为（0-4000s）  默认取值：60s。
     * @return keepaliveTimeout
     */
    public Integer getKeepaliveTimeout() {
        return keepaliveTimeout;
    }

    public void setKeepaliveTimeout(Integer keepaliveTimeout) {
        this.keepaliveTimeout = keepaliveTimeout;
    }

    public UpdateListenerOption withIpgroup(UpdateListenerIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public UpdateListenerOption withIpgroup(Consumer<UpdateListenerIpGroupOption> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new UpdateListenerIpGroupOption();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    /**
     * Get ipgroup
     * @return ipgroup
     */
    public UpdateListenerIpGroupOption getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(UpdateListenerIpGroupOption ipgroup) {
        this.ipgroup = ipgroup;
    }

    public UpdateListenerOption withTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
        return this;
    }

    /**
     * 参数解释：是否透传客户端IP地址。开启后客户端IP地址将透传到后端服务器。 [仅作用于共享型LB的TCP/UDP监听器。  约束限制： - 开启特性后，ELB和后端服务器之间直接使用真实的IP访问，需要确保已正确设置服务器的安全组以及访问控制策略。 - 开启特性后，不支持同一台服务器既作为后端服务器又作为客户端的场景。 - 开启特性后，不支持变更后端服务器规格。 ](tag:hws,hws_hk,ocb,ctc,hcs,g42,tm,cmcc,hk_g42,hws_ocb,hk_vdf,srg,fcs,dt)  取值范围： - 共享型LB的TCP/UDP监听器可设置为true或false，不传默认为false。 - 共享型LB的HTTP/HTTPS监听器只支持设置为true，不传默认为true。 - 独享型负载均衡器所有协议的监听器只支持设置为true，不传默认为true。  [只设支持置为true，不传默认为true。](tag:hws_eu,hcso_dt)
     * @return transparentClientIpEnable
     */
    public Boolean getTransparentClientIpEnable() {
        return transparentClientIpEnable;
    }

    public void setTransparentClientIpEnable(Boolean transparentClientIpEnable) {
        this.transparentClientIpEnable = transparentClientIpEnable;
    }

    public UpdateListenerOption withProxyProtocolEnable(Boolean proxyProtocolEnable) {
        this.proxyProtocolEnable = proxyProtocolEnable;
        return this;
    }

    /**
     * 参数解释：是否开启proxy_protocol。  约束限制：仅TLS监听器可指定，其他协议的监听器该字段不生效，proxy_protocol不开启。
     * @return proxyProtocolEnable
     */
    public Boolean getProxyProtocolEnable() {
        return proxyProtocolEnable;
    }

    public void setProxyProtocolEnable(Boolean proxyProtocolEnable) {
        this.proxyProtocolEnable = proxyProtocolEnable;
    }

    public UpdateListenerOption withEnhanceL7policyEnable(Boolean enhanceL7policyEnable) {
        this.enhanceL7policyEnable = enhanceL7policyEnable;
        return this;
    }

    /**
     * 参数解释：是否开启高级转发策略功能。开启高级转发策略后，支持更灵活的转发策略和转发规则设置。  开启后支持如下场景： - 转发策略的action字段支持指定为REDIRECT_TO_URL, FIXED_RESPONSE，即支持URL重定向和响应固定的内容给客户端。 - 转发策略支持指定priority、redirect_url_config、fixed_response_config字段。 - 转发规则rule的type可以指定METHOD, HEADER, QUERY_STRING, SOURCE_IP这几种取值。 - 转发规则rule的type为HOST_NAME时，转发规则rule的value支持通配符*。 - 转发规则支持指定conditions字段。  约束限制： - 开启后不支持关闭。 - 开启高级转发策略后，监听器关联的转发策略的匹配优先级由转发策略的priority字段来决定，不再自动排序。具体说明详见转发策略的priority字段的说明。  取值范围：true开启，false不开启。  [荷兰region不支持该字段，请勿使用。](tag:dt,dt_test)
     * @return enhanceL7policyEnable
     */
    public Boolean getEnhanceL7policyEnable() {
        return enhanceL7policyEnable;
    }

    public void setEnhanceL7policyEnable(Boolean enhanceL7policyEnable) {
        this.enhanceL7policyEnable = enhanceL7policyEnable;
    }

    public UpdateListenerOption withQuicConfig(UpdateListenerQuicConfigOption quicConfig) {
        this.quicConfig = quicConfig;
        return this;
    }

    public UpdateListenerOption withQuicConfig(Consumer<UpdateListenerQuicConfigOption> quicConfigSetter) {
        if (this.quicConfig == null) {
            this.quicConfig = new UpdateListenerQuicConfigOption();
            quicConfigSetter.accept(this.quicConfig);
        }

        return this;
    }

    /**
     * Get quicConfig
     * @return quicConfig
     */
    public UpdateListenerQuicConfigOption getQuicConfig() {
        return quicConfig;
    }

    public void setQuicConfig(UpdateListenerQuicConfigOption quicConfig) {
        this.quicConfig = quicConfig;
    }

    public UpdateListenerOption withProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
        return this;
    }

    /**
     * 参数解释：修改保护状态。  取值范围： - nonProtection: 不保护 - consoleProtection: 控制台修改保护
     * @return protectionStatus
     */
    public ProtectionStatusEnum getProtectionStatus() {
        return protectionStatus;
    }

    public void setProtectionStatus(ProtectionStatusEnum protectionStatus) {
        this.protectionStatus = protectionStatus;
    }

    public UpdateListenerOption withProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
        return this;
    }

    /**
     * 参数解释：设置保护的原因。作为protection_status的转态设置的原因。  约束限制：仅当protection_status为consoleProtection时有效。  取值范围：除'<'和'>'外通用Unicode字符集字符，最大255个字符。
     * @return protectionReason
     */
    public String getProtectionReason() {
        return protectionReason;
    }

    public void setProtectionReason(String protectionReason) {
        this.protectionReason = protectionReason;
    }

    public UpdateListenerOption withGzipEnable(Boolean gzipEnable) {
        this.gzipEnable = gzipEnable;
        return this;
    }

    /**
     * 参数解释：ELB是否开启gzip压缩。  [约束限制：仅HTTP/HTTPS类型监听器支持配置。](tag:tm,hws_eu,g42,hk_g42,hcso_dt,dt,dt_test) [约束限制：仅HTTP/HTTPS/QUIC类型监听器支持配置。](tag:hws,hws_hk,hws_test,hcs,hcs_sm,hcso,hk_vdf,srg,fcs,fcs_vm,mix,ocb,ctc,cmcc,ct,sbc,hws_ocb,hk_sbc)  默认取值：false
     * @return gzipEnable
     */
    public Boolean getGzipEnable() {
        return gzipEnable;
    }

    public void setGzipEnable(Boolean gzipEnable) {
        this.gzipEnable = gzipEnable;
    }

    public UpdateListenerOption withSslEarlyDataEnable(Boolean sslEarlyDataEnable) {
        this.sslEarlyDataEnable = sslEarlyDataEnable;
        return this;
    }

    /**
     * 参数解释：监听器0-RTT能力开关。  约束限制：仅HTTPS类型监听器支持配置，需要依赖TLSv1.3安全策略协议。开启 ssl_early_data 后，有重放攻击的风险，请谨慎开启。  默认取值：false
     * @return sslEarlyDataEnable
     */
    public Boolean getSslEarlyDataEnable() {
        return sslEarlyDataEnable;
    }

    public void setSslEarlyDataEnable(Boolean sslEarlyDataEnable) {
        this.sslEarlyDataEnable = sslEarlyDataEnable;
    }

    public UpdateListenerOption withCps(Integer cps) {
        this.cps = cps;
        return this;
    }

    /**
     * 参数解释：监听器新建限速。  约束限制：当该限速值大于LB的限速值时，以LB的限速值生效。  取值范围：为0-1000000  默认取值：0，表示不限速。
     * minimum: 0
     * maximum: 1000000
     * @return cps
     */
    public Integer getCps() {
        return cps;
    }

    public void setCps(Integer cps) {
        this.cps = cps;
    }

    public UpdateListenerOption withConnection(Integer connection) {
        this.connection = connection;
        return this;
    }

    /**
     * 参数解释：监听器并发限速。  约束限制：当该限速值大于LB的限速值时，以LB的限速值生效。  取值范围：为0-1000000  默认取值：0，表示不限速。
     * minimum: 0
     * maximum: 1000000
     * @return connection
     */
    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public UpdateListenerOption withNat64Enable(Boolean nat64Enable) {
        this.nat64Enable = nat64Enable;
        return this;
    }

    /**
     * 参数解释： 监听器地址族转换能力开关，可以实现客户端通过访问LB的IPv4或者IPv6地址，来访问IPv4后端和IPv6后端。  约束限制： 仅对于TCP、UDP协议类型的监听器生效，与transparent_client_ip_enable，获取客户端ip功能开关互斥，开启地址族转换同时需要保证获取客户端ip功能关闭。  取值范围： - true：开启地址族转换功能。 - false：关闭地址族转换功能。  默认取值：false
     * @return nat64Enable
     */
    public Boolean getNat64Enable() {
        return nat64Enable;
    }

    public void setNat64Enable(Boolean nat64Enable) {
        this.nat64Enable = nat64Enable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateListenerOption that = (UpdateListenerOption) obj;
        return Objects.equals(this.adminStateUp, that.adminStateUp)
            && Objects.equals(this.clientCaTlsContainerRef, that.clientCaTlsContainerRef)
            && Objects.equals(this.defaultPoolId, that.defaultPoolId)
            && Objects.equals(this.defaultTlsContainerRef, that.defaultTlsContainerRef)
            && Objects.equals(this.description, that.description) && Objects.equals(this.http2Enable, that.http2Enable)
            && Objects.equals(this.insertHeaders, that.insertHeaders) && Objects.equals(this.name, that.name)
            && Objects.equals(this.sniContainerRefs, that.sniContainerRefs)
            && Objects.equals(this.sniMatchAlgo, that.sniMatchAlgo)
            && Objects.equals(this.tlsCiphersPolicy, that.tlsCiphersPolicy)
            && Objects.equals(this.securityPolicyId, that.securityPolicyId)
            && Objects.equals(this.enableMemberRetry, that.enableMemberRetry)
            && Objects.equals(this.memberTimeout, that.memberTimeout)
            && Objects.equals(this.clientTimeout, that.clientTimeout)
            && Objects.equals(this.keepaliveTimeout, that.keepaliveTimeout)
            && Objects.equals(this.ipgroup, that.ipgroup)
            && Objects.equals(this.transparentClientIpEnable, that.transparentClientIpEnable)
            && Objects.equals(this.proxyProtocolEnable, that.proxyProtocolEnable)
            && Objects.equals(this.enhanceL7policyEnable, that.enhanceL7policyEnable)
            && Objects.equals(this.quicConfig, that.quicConfig)
            && Objects.equals(this.protectionStatus, that.protectionStatus)
            && Objects.equals(this.protectionReason, that.protectionReason)
            && Objects.equals(this.gzipEnable, that.gzipEnable)
            && Objects.equals(this.sslEarlyDataEnable, that.sslEarlyDataEnable) && Objects.equals(this.cps, that.cps)
            && Objects.equals(this.connection, that.connection) && Objects.equals(this.nat64Enable, that.nat64Enable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminStateUp,
            clientCaTlsContainerRef,
            defaultPoolId,
            defaultTlsContainerRef,
            description,
            http2Enable,
            insertHeaders,
            name,
            sniContainerRefs,
            sniMatchAlgo,
            tlsCiphersPolicy,
            securityPolicyId,
            enableMemberRetry,
            memberTimeout,
            clientTimeout,
            keepaliveTimeout,
            ipgroup,
            transparentClientIpEnable,
            proxyProtocolEnable,
            enhanceL7policyEnable,
            quicConfig,
            protectionStatus,
            protectionReason,
            gzipEnable,
            sslEarlyDataEnable,
            cps,
            connection,
            nat64Enable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateListenerOption {\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    clientCaTlsContainerRef: ").append(toIndentedString(clientCaTlsContainerRef)).append("\n");
        sb.append("    defaultPoolId: ").append(toIndentedString(defaultPoolId)).append("\n");
        sb.append("    defaultTlsContainerRef: ").append(toIndentedString(defaultTlsContainerRef)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    http2Enable: ").append(toIndentedString(http2Enable)).append("\n");
        sb.append("    insertHeaders: ").append(toIndentedString(insertHeaders)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sniContainerRefs: ").append(toIndentedString(sniContainerRefs)).append("\n");
        sb.append("    sniMatchAlgo: ").append(toIndentedString(sniMatchAlgo)).append("\n");
        sb.append("    tlsCiphersPolicy: ").append(toIndentedString(tlsCiphersPolicy)).append("\n");
        sb.append("    securityPolicyId: ").append(toIndentedString(securityPolicyId)).append("\n");
        sb.append("    enableMemberRetry: ").append(toIndentedString(enableMemberRetry)).append("\n");
        sb.append("    memberTimeout: ").append(toIndentedString(memberTimeout)).append("\n");
        sb.append("    clientTimeout: ").append(toIndentedString(clientTimeout)).append("\n");
        sb.append("    keepaliveTimeout: ").append(toIndentedString(keepaliveTimeout)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
        sb.append("    transparentClientIpEnable: ").append(toIndentedString(transparentClientIpEnable)).append("\n");
        sb.append("    proxyProtocolEnable: ").append(toIndentedString(proxyProtocolEnable)).append("\n");
        sb.append("    enhanceL7policyEnable: ").append(toIndentedString(enhanceL7policyEnable)).append("\n");
        sb.append("    quicConfig: ").append(toIndentedString(quicConfig)).append("\n");
        sb.append("    protectionStatus: ").append(toIndentedString(protectionStatus)).append("\n");
        sb.append("    protectionReason: ").append(toIndentedString(protectionReason)).append("\n");
        sb.append("    gzipEnable: ").append(toIndentedString(gzipEnable)).append("\n");
        sb.append("    sslEarlyDataEnable: ").append(toIndentedString(sslEarlyDataEnable)).append("\n");
        sb.append("    cps: ").append(toIndentedString(cps)).append("\n");
        sb.append("    connection: ").append(toIndentedString(connection)).append("\n");
        sb.append("    nat64Enable: ").append(toIndentedString(nat64Enable)).append("\n");
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
