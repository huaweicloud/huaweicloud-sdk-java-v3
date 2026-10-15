package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：更新Ray联邦端点请求。 **约束限制**：不涉及。
 */
public class UpdateRayFederationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_name")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ray_cluster_list")

    private List<RayFederationRayClusterRequest> rayClusterList = null;

    public UpdateRayFederationRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：Ray联邦端点名称。 **约束限制**：不能修改。该字段将被忽略，仅用于响应一致性展示，更新对象由路径参数ray_federation_id标识。 **取值范围**：支持小写字母、数字、中划线，必须字母开头、字母或数字结尾，长度为1~63个字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateRayFederationRequestBody withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**：Ray联邦端点显示名称。 **约束限制**：不涉及。 **取值范围**：长度为1~63个字符，支持字母、数字、中划线、汉字。 **默认取值**：不涉及。
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public UpdateRayFederationRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：Ray联邦端点描述。 **约束限制**：不涉及。 **取值范围**：不允许输入感叹号、小于号、大于号、等号、与号、双引号、单引号、艾特符、井号、百分号、分号、左括号、右括号、竖线、星号、反斜杠。长度为0~1024个字符。 **默认取值**：不涉及。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateRayFederationRequestBody withRayClusterList(List<RayFederationRayClusterRequest> rayClusterList) {
        this.rayClusterList = rayClusterList;
        return this;
    }

    public UpdateRayFederationRequestBody addRayClusterListItem(RayFederationRayClusterRequest rayClusterListItem) {
        if (this.rayClusterList == null) {
            this.rayClusterList = new ArrayList<>();
        }
        this.rayClusterList.add(rayClusterListItem);
        return this;
    }

    public UpdateRayFederationRequestBody withRayClusterList(
        Consumer<List<RayFederationRayClusterRequest>> rayClusterListSetter) {
        if (this.rayClusterList == null) {
            this.rayClusterList = new ArrayList<>();
        }
        rayClusterListSetter.accept(this.rayClusterList);
        return this;
    }

    /**
     * **参数解释**：RayCluster端点列表。输入后，将覆盖原有列表。 **约束限制**：每个RayCluster只能属于一个Ray联邦端点。 **取值范围**：0~50个RayCluster端点。 **默认取值**：不涉及。
     * @return rayClusterList
     */
    public List<RayFederationRayClusterRequest> getRayClusterList() {
        return rayClusterList;
    }

    public void setRayClusterList(List<RayFederationRayClusterRequest> rayClusterList) {
        this.rayClusterList = rayClusterList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateRayFederationRequestBody that = (UpdateRayFederationRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.displayName, that.displayName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.rayClusterList, that.rayClusterList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, displayName, description, rayClusterList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateRayFederationRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    rayClusterList: ").append(toIndentedString(rayClusterList)).append("\n");
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
