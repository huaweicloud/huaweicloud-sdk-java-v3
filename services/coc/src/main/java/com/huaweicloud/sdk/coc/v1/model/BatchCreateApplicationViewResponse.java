package com.huaweicloud.sdk.coc.v1.model;

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
public class BatchCreateApplicationViewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_ids")

    private List<String> applicationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_ids")

    private List<String> componentIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    private List<String> groupIds = null;

    public BatchCreateApplicationViewResponse withApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
        return this;
    }

    public BatchCreateApplicationViewResponse addApplicationIdsItem(String applicationIdsItem) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        this.applicationIds.add(applicationIdsItem);
        return this;
    }

    public BatchCreateApplicationViewResponse withApplicationIds(Consumer<List<String>> applicationIdsSetter) {
        if (this.applicationIds == null) {
            this.applicationIds = new ArrayList<>();
        }
        applicationIdsSetter.accept(this.applicationIds);
        return this;
    }

    /**
     * **参数解释：** 应用id列表。 **取值范围：** 不涉及。
     * @return applicationIds
     */
    public List<String> getApplicationIds() {
        return applicationIds;
    }

    public void setApplicationIds(List<String> applicationIds) {
        this.applicationIds = applicationIds;
    }

    public BatchCreateApplicationViewResponse withComponentIds(List<String> componentIds) {
        this.componentIds = componentIds;
        return this;
    }

    public BatchCreateApplicationViewResponse addComponentIdsItem(String componentIdsItem) {
        if (this.componentIds == null) {
            this.componentIds = new ArrayList<>();
        }
        this.componentIds.add(componentIdsItem);
        return this;
    }

    public BatchCreateApplicationViewResponse withComponentIds(Consumer<List<String>> componentIdsSetter) {
        if (this.componentIds == null) {
            this.componentIds = new ArrayList<>();
        }
        componentIdsSetter.accept(this.componentIds);
        return this;
    }

    /**
     * **参数解释：** 组件id列表。 **取值范围：** 不涉及。
     * @return componentIds
     */
    public List<String> getComponentIds() {
        return componentIds;
    }

    public void setComponentIds(List<String> componentIds) {
        this.componentIds = componentIds;
    }

    public BatchCreateApplicationViewResponse withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public BatchCreateApplicationViewResponse addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public BatchCreateApplicationViewResponse withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * **参数解释：** 分组id列表。 **取值范围：** 不涉及。
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateApplicationViewResponse that = (BatchCreateApplicationViewResponse) obj;
        return Objects.equals(this.applicationIds, that.applicationIds)
            && Objects.equals(this.componentIds, that.componentIds) && Objects.equals(this.groupIds, that.groupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationIds, componentIds, groupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateApplicationViewResponse {\n");
        sb.append("    applicationIds: ").append(toIndentedString(applicationIds)).append("\n");
        sb.append("    componentIds: ").append(toIndentedString(componentIds)).append("\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
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
