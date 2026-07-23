package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListOpsEvaluatorVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<ListOpsEvaluatorVersionsResponseBodyVersions> versions = null;

    public ListOpsEvaluatorVersionsResponse withVersions(List<ListOpsEvaluatorVersionsResponseBodyVersions> versions) {
        this.versions = versions;
        return this;
    }

    public ListOpsEvaluatorVersionsResponse addVersionsItem(ListOpsEvaluatorVersionsResponseBodyVersions versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListOpsEvaluatorVersionsResponse withVersions(
        Consumer<List<ListOpsEvaluatorVersionsResponseBodyVersions>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * **参数解释：** 评估器的版本列表，包含该评估器下所有已发布的历史版本及配置详情。 **取值范围：** 不涉及。 
     * @return versions
     */
    public List<ListOpsEvaluatorVersionsResponseBodyVersions> getVersions() {
        return versions;
    }

    public void setVersions(List<ListOpsEvaluatorVersionsResponseBodyVersions> versions) {
        this.versions = versions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListOpsEvaluatorVersionsResponse that = (ListOpsEvaluatorVersionsResponse) obj;
        return Objects.equals(this.versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOpsEvaluatorVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
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
