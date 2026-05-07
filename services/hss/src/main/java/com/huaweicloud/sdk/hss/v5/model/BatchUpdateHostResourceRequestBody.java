package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchUpdateHostResourceRequestBody
 */
public class BatchUpdateHostResourceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_all")

    private Boolean operateAll;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private String mode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_limit")

    private String cpuLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mem_limit")

    private String memLimit;

    public BatchUpdateHostResourceRequestBody withOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
        return this;
    }

    /**
     * **参数解释**: 是否全量处理所有主机Agent，false的时候host_ids有值 **约束限制**: 必填 **取值范围**: - true：是。 - false：否。  **默认取值**: 不涉及 
     * @return operateAll
     */
    public Boolean getOperateAll() {
        return operateAll;
    }

    public void setOperateAll(Boolean operateAll) {
        this.operateAll = operateAll;
    }

    public BatchUpdateHostResourceRequestBody withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public BatchUpdateHostResourceRequestBody addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public BatchUpdateHostResourceRequestBody withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释**: 批量修改的HostId列表。operate_all参数为false时,需要填写此批量查询条件,operate_all参数为true时不处理host_ids参数 **约束限制**： 不涉及 **取值范围**: 最小值0，最大值200 **默认取值**： 不涉及 
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public BatchUpdateHostResourceRequestBody withMode(String mode) {
        this.mode = mode;
        return this;
    }

    /**
     * **参数解释**： 资源限制类型：默认规则or自定义or自适应 **约束限制**： 不涉及 **取值范围**： - default：默认类型。 - customized：用户自定义类型。 - adaptive：自适应类型。  **默认取值**： 不涉及 
     * @return mode
     */
    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public BatchUpdateHostResourceRequestBody withCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
        return this;
    }

    /**
     * **参数解释**: cpu最大值 **约束限制**: 不涉及 **取值范围**: 字符长度0-32位 **默认取值**: 不涉及 
     * @return cpuLimit
     */
    public String getCpuLimit() {
        return cpuLimit;
    }

    public void setCpuLimit(String cpuLimit) {
        this.cpuLimit = cpuLimit;
    }

    public BatchUpdateHostResourceRequestBody withMemLimit(String memLimit) {
        this.memLimit = memLimit;
        return this;
    }

    /**
     * **参数解释**: 内存最大值 **约束限制**: 不涉及 **取值范围**: 字符长度0-32位 **默认取值**: 不涉及 
     * @return memLimit
     */
    public String getMemLimit() {
        return memLimit;
    }

    public void setMemLimit(String memLimit) {
        this.memLimit = memLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdateHostResourceRequestBody that = (BatchUpdateHostResourceRequestBody) obj;
        return Objects.equals(this.operateAll, that.operateAll) && Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.mode, that.mode) && Objects.equals(this.cpuLimit, that.cpuLimit)
            && Objects.equals(this.memLimit, that.memLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operateAll, hostIds, mode, cpuLimit, memLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateHostResourceRequestBody {\n");
        sb.append("    operateAll: ").append(toIndentedString(operateAll)).append("\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    cpuLimit: ").append(toIndentedString(cpuLimit)).append("\n");
        sb.append("    memLimit: ").append(toIndentedString(memLimit)).append("\n");
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
