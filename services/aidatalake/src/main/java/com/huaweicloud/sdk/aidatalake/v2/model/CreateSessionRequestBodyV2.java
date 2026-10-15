package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：创建session请求体。 **约束限制**：不涉及。
 */
public class CreateSessionRequestBodyV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_name")

    private String endpointName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_context")

    private CatalogContext catalogContext;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wait_timeout")

    private Integer waitTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retry_times")

    private Integer maxRetryTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Long cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    public CreateSessionRequestBodyV2 withEndpointName(String endpointName) {
        this.endpointName = endpointName;
        return this;
    }

    /**
     * **参数解释**：Endpoint名称。 **约束限制**：不涉及。 **取值范围**：长度为1~128个字符，支持大小写英文字母、数字、连字符。 **默认取值**：不涉及。
     * @return endpointName
     */
    public String getEndpointName() {
        return endpointName;
    }

    public void setEndpointName(String endpointName) {
        this.endpointName = endpointName;
    }

    public CreateSessionRequestBodyV2 withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：委托名称。 **约束限制**：具体请参见[[配置Aura委托](https://support.huaweicloud.com/usermanual-aidatalake/aidatalake_01_0078.html#section4)](tag:HEC)[[配置Aura委托](https://support.huaweicloud.com/intl/zh-cn/usermanual-aidatalake/aidatalake_01_0078.html#section4)](tag:hws_hk)。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public CreateSessionRequestBodyV2 withCatalogContext(CatalogContext catalogContext) {
        this.catalogContext = catalogContext;
        return this;
    }

    public CreateSessionRequestBodyV2 withCatalogContext(Consumer<CatalogContext> catalogContextSetter) {
        if (this.catalogContext == null) {
            this.catalogContext = new CatalogContext();
            catalogContextSetter.accept(this.catalogContext);
        }

        return this;
    }

    /**
     * Get catalogContext
     * @return catalogContext
     */
    public CatalogContext getCatalogContext() {
        return catalogContext;
    }

    public void setCatalogContext(CatalogContext catalogContext) {
        this.catalogContext = catalogContext;
    }

    public CreateSessionRequestBodyV2 withWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
        return this;
    }

    /**
     * **参数解释**：创建session排队等待时间，单位：秒。 **约束限制**：不涉及。 **取值范围**：300~86400。 **默认取值**：不涉及。
     * minimum: 300
     * maximum: 86400
     * @return waitTimeout
     */
    public Integer getWaitTimeout() {
        return waitTimeout;
    }

    public void setWaitTimeout(Integer waitTimeout) {
        this.waitTimeout = waitTimeout;
    }

    public CreateSessionRequestBodyV2 withMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
        return this;
    }

    /**
     * **参数解释**：资源不足时重试次数。 **约束限制**：不涉及。 **取值范围**：1~2147483647。 **默认取值**：不涉及。
     * minimum: 1
     * @return maxRetryTimes
     */
    public Integer getMaxRetryTimes() {
        return maxRetryTimes;
    }

    public void setMaxRetryTimes(Integer maxRetryTimes) {
        this.maxRetryTimes = maxRetryTimes;
    }

    public CreateSessionRequestBodyV2 withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * **参数解释**：优先级（1~9，9为最高优先级）。 **约束限制**：不涉及。 **取值范围**：1~9。 **默认取值**：5。
     * minimum: 1
     * maximum: 9
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateSessionRequestBodyV2 withCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * **参数解释**：会话维度指定的 CN（计算节点）CPU 资源规格，单位：毫核（millicores）。 **约束限制**：可选；不传时回退到全局配置 getCnCpuLimit； INNER_SESSION/维护语句场景不消费该字段，资源规格继承父会话 CN； 上限 48000 毫核（48 核），超上限返回 400 INVALID_PARAMETER。 **取值范围**：(0, 48000] 毫核。 **默认取值**：不传时取全局配置兜底值（如 4000 毫核）。
     * minimum: 0
     * maximum: 48000
     * @return cpu
     */
    public Long getCpu() {
        return cpu;
    }

    public void setCpu(Long cpu) {
        this.cpu = cpu;
    }

    public CreateSessionRequestBodyV2 withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * **参数解释**：会话维度指定的 CN（计算节点）Memory 资源规格，单位：MB。 **约束限制**：可选；不传时回退到全局配置 getCnMemoryLimit； INNER_SESSION/维护语句场景不消费该字段，资源规格继承父会话 CN； 上限 393216 MB（384 GB），超上限返回 400 INVALID_PARAMETER。 **取值范围**：(0, 393216] MB。 **默认取值**：不传时取全局配置兜底值（如 16384 MB）。
     * minimum: 0
     * maximum: 393216
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSessionRequestBodyV2 that = (CreateSessionRequestBodyV2) obj;
        return Objects.equals(this.endpointName, that.endpointName) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.catalogContext, that.catalogContext)
            && Objects.equals(this.waitTimeout, that.waitTimeout)
            && Objects.equals(this.maxRetryTimes, that.maxRetryTimes) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.cpu, that.cpu) && Objects.equals(this.memory, that.memory);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(endpointName, agencyName, catalogContext, waitTimeout, maxRetryTimes, priority, cpu, memory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSessionRequestBodyV2 {\n");
        sb.append("    endpointName: ").append(toIndentedString(endpointName)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    catalogContext: ").append(toIndentedString(catalogContext)).append("\n");
        sb.append("    waitTimeout: ").append(toIndentedString(waitTimeout)).append("\n");
        sb.append("    maxRetryTimes: ").append(toIndentedString(maxRetryTimes)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
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
