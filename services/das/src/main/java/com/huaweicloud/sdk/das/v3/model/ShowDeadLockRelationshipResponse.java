package com.huaweicloud.sdk.das.v3.model;

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
public class ShowDeadLockRelationshipResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_list")

    private List<DeadLockProcess> processList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_list")

    private List<DeadLockResource> resourceList = null;

    public ShowDeadLockRelationshipResponse withProcessList(List<DeadLockProcess> processList) {
        this.processList = processList;
        return this;
    }

    public ShowDeadLockRelationshipResponse addProcessListItem(DeadLockProcess processListItem) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        this.processList.add(processListItem);
        return this;
    }

    public ShowDeadLockRelationshipResponse withProcessList(Consumer<List<DeadLockProcess>> processListSetter) {
        if (this.processList == null) {
            this.processList = new ArrayList<>();
        }
        processListSetter.accept(this.processList);
        return this;
    }

    /**
     * 会话列表
     * @return processList
     */
    public List<DeadLockProcess> getProcessList() {
        return processList;
    }

    public void setProcessList(List<DeadLockProcess> processList) {
        this.processList = processList;
    }

    public ShowDeadLockRelationshipResponse withResourceList(List<DeadLockResource> resourceList) {
        this.resourceList = resourceList;
        return this;
    }

    public ShowDeadLockRelationshipResponse addResourceListItem(DeadLockResource resourceListItem) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        this.resourceList.add(resourceListItem);
        return this;
    }

    public ShowDeadLockRelationshipResponse withResourceList(Consumer<List<DeadLockResource>> resourceListSetter) {
        if (this.resourceList == null) {
            this.resourceList = new ArrayList<>();
        }
        resourceListSetter.accept(this.resourceList);
        return this;
    }

    /**
     * 资源列表
     * @return resourceList
     */
    public List<DeadLockResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<DeadLockResource> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockRelationshipResponse that = (ShowDeadLockRelationshipResponse) obj;
        return Objects.equals(this.processList, that.processList)
            && Objects.equals(this.resourceList, that.resourceList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processList, resourceList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockRelationshipResponse {\n");
        sb.append("    processList: ").append(toIndentedString(processList)).append("\n");
        sb.append("    resourceList: ").append(toIndentedString(resourceList)).append("\n");
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
