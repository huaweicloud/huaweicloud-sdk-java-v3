package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchChangeNodeToPeriodReqBody
 */
public class BatchChangeNodeToPeriodReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeList")

    private List<String> nodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodOrderParam")

    private PeriodOrderParam periodOrderParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includeResources")

    private List<String> includeResources = null;

    public BatchChangeNodeToPeriodReqBody withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： API类型 **约束限制**： 该值不可修改 **取值范围**： 不涉及 **默认取值**： Node 
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public BatchChangeNodeToPeriodReqBody withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本 **约束限制**： 该值不可修改 **取值范围**： 不涉及 **默认取值**： v3 
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public BatchChangeNodeToPeriodReqBody withNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
        return this;
    }

    public BatchChangeNodeToPeriodReqBody addNodeListItem(String nodeListItem) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        this.nodeList.add(nodeListItem);
        return this;
    }

    public BatchChangeNodeToPeriodReqBody withNodeList(Consumer<List<String>> nodeListSetter) {
        if (this.nodeList == null) {
            this.nodeList = new ArrayList<>();
        }
        nodeListSetter.accept(this.nodeList);
        return this;
    }

    /**
     * **参数解释**： 要进行按需转包的CCE节点ID列表，示例如下： ``` \"nodeList\": [\"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\", \"xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx\"] ``` **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return nodeList
     */
    public List<String> getNodeList() {
        return nodeList;
    }

    public void setNodeList(List<String> nodeList) {
        this.nodeList = nodeList;
    }

    public BatchChangeNodeToPeriodReqBody withPeriodOrderParam(PeriodOrderParam periodOrderParam) {
        this.periodOrderParam = periodOrderParam;
        return this;
    }

    public BatchChangeNodeToPeriodReqBody withPeriodOrderParam(Consumer<PeriodOrderParam> periodOrderParamSetter) {
        if (this.periodOrderParam == null) {
            this.periodOrderParam = new PeriodOrderParam();
            periodOrderParamSetter.accept(this.periodOrderParam);
        }

        return this;
    }

    /**
     * Get periodOrderParam
     * @return periodOrderParam
     */
    public PeriodOrderParam getPeriodOrderParam() {
        return periodOrderParam;
    }

    public void setPeriodOrderParam(PeriodOrderParam periodOrderParam) {
        this.periodOrderParam = periodOrderParam;
    }

    public BatchChangeNodeToPeriodReqBody withIncludeResources(List<String> includeResources) {
        this.includeResources = includeResources;
        return this;
    }

    public BatchChangeNodeToPeriodReqBody addIncludeResourcesItem(String includeResourcesItem) {
        if (this.includeResources == null) {
            this.includeResources = new ArrayList<>();
        }
        this.includeResources.add(includeResourcesItem);
        return this;
    }

    public BatchChangeNodeToPeriodReqBody withIncludeResources(Consumer<List<String>> includeResourcesSetter) {
        if (this.includeResources == null) {
            this.includeResources = new ArrayList<>();
        }
        includeResourcesSetter.accept(this.includeResources);
        return this;
    }

    /**
     * **参数解释**： 需要一起转包周期的资源类型列表，示例如下： ``` \"includeResources\": [\"eip\"] ``` **约束限制**： 当前仅支持eip（弹性公网IP）资源 **取值范围**： - \"eip\"：弹性公网IP **默认取值**： 不涉及
     * @return includeResources
     */
    public List<String> getIncludeResources() {
        return includeResources;
    }

    public void setIncludeResources(List<String> includeResources) {
        this.includeResources = includeResources;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchChangeNodeToPeriodReqBody that = (BatchChangeNodeToPeriodReqBody) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.nodeList, that.nodeList)
            && Objects.equals(this.periodOrderParam, that.periodOrderParam)
            && Objects.equals(this.includeResources, that.includeResources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, nodeList, periodOrderParam, includeResources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchChangeNodeToPeriodReqBody {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    nodeList: ").append(toIndentedString(nodeList)).append("\n");
        sb.append("    periodOrderParam: ").append(toIndentedString(periodOrderParam)).append("\n");
        sb.append("    includeResources: ").append(toIndentedString(includeResources)).append("\n");
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
