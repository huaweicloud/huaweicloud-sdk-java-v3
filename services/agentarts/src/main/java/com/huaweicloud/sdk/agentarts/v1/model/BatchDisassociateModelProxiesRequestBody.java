package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 批量解绑模型代理的请求体。 **取值范围：** 不涉及。 
 */
public class BatchDisassociateModelProxiesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unbindings")

    private List<CoreModelProxyDetails> unbindings = null;

    public BatchDisassociateModelProxiesRequestBody withUnbindings(List<CoreModelProxyDetails> unbindings) {
        this.unbindings = unbindings;
        return this;
    }

    public BatchDisassociateModelProxiesRequestBody addUnbindingsItem(CoreModelProxyDetails unbindingsItem) {
        if (this.unbindings == null) {
            this.unbindings = new ArrayList<>();
        }
        this.unbindings.add(unbindingsItem);
        return this;
    }

    public BatchDisassociateModelProxiesRequestBody withUnbindings(
        Consumer<List<CoreModelProxyDetails>> unbindingsSetter) {
        if (this.unbindings == null) {
            this.unbindings = new ArrayList<>();
        }
        unbindingsSetter.accept(this.unbindings);
        return this;
    }

    /**
     * **参数解释：** 模型提供商和模型代理解绑详情。 **取值范围：** 不涉及。 
     * @return unbindings
     */
    public List<CoreModelProxyDetails> getUnbindings() {
        return unbindings;
    }

    public void setUnbindings(List<CoreModelProxyDetails> unbindings) {
        this.unbindings = unbindings;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDisassociateModelProxiesRequestBody that = (BatchDisassociateModelProxiesRequestBody) obj;
        return Objects.equals(this.unbindings, that.unbindings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(unbindings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDisassociateModelProxiesRequestBody {\n");
        sb.append("    unbindings: ").append(toIndentedString(unbindings)).append("\n");
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
