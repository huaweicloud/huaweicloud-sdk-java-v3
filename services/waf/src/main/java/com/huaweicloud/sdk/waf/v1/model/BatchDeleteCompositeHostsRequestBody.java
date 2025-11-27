package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchDeleteCompositeHostsRequestBody
 */
public class BatchDeleteCompositeHostsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ids")

    private List<String> hostIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_policy_enable")

    private Boolean keepPolicyEnable;

    public BatchDeleteCompositeHostsRequestBody withHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
        return this;
    }

    public BatchDeleteCompositeHostsRequestBody addHostIdsItem(String hostIdsItem) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        this.hostIds.add(hostIdsItem);
        return this;
    }

    public BatchDeleteCompositeHostsRequestBody withHostIds(Consumer<List<String>> hostIdsSetter) {
        if (this.hostIds == null) {
            this.hostIds = new ArrayList<>();
        }
        hostIdsSetter.accept(this.hostIds);
        return this;
    }

    /**
     * **参数解释：** 域名id数组，包含待批量删除的租户域名唯一标识，从查询租户域名列表接口获取。 **约束限制：** 不涉及 **取值范围：** 数组内元素为字符串类型，每个元素对应一个域名ID **默认取值：** 不涉及
     * @return hostIds
     */
    public List<String> getHostIds() {
        return hostIds;
    }

    public void setHostIds(List<String> hostIds) {
        this.hostIds = hostIds;
    }

    public BatchDeleteCompositeHostsRequestBody withKeepPolicyEnable(Boolean keepPolicyEnable) {
        this.keepPolicyEnable = keepPolicyEnable;
        return this;
    }

    /**
     * **参数解释：** 保留域名的防护策略，标识删除域名后是否保留其关联的防护策略（true表示保留，false表示不保留）。 **约束限制：** 不涉及 **取值范围：** 仅支持true、false两个布尔值 **默认取值：** false
     * @return keepPolicyEnable
     */
    public Boolean getKeepPolicyEnable() {
        return keepPolicyEnable;
    }

    public void setKeepPolicyEnable(Boolean keepPolicyEnable) {
        this.keepPolicyEnable = keepPolicyEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteCompositeHostsRequestBody that = (BatchDeleteCompositeHostsRequestBody) obj;
        return Objects.equals(this.hostIds, that.hostIds)
            && Objects.equals(this.keepPolicyEnable, that.keepPolicyEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostIds, keepPolicyEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteCompositeHostsRequestBody {\n");
        sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
        sb.append("    keepPolicyEnable: ").append(toIndentedString(keepPolicyEnable)).append("\n");
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
