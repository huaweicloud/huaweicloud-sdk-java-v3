package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ScrumStatusFlowVo
 */
public class ScrumStatusFlowVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_id")

    private Integer statusId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "direct_to")

    private List<ScrumStatusFlowDirectToVo> directTo = null;

    public ScrumStatusFlowVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流转数据的uuid
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ScrumStatusFlowVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 状态名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ScrumStatusFlowVo withStatusId(Integer statusId) {
        this.statusId = statusId;
        return this;
    }

    /**
     * 状态id
     * @return statusId
     */
    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public ScrumStatusFlowVo withDirectTo(List<ScrumStatusFlowDirectToVo> directTo) {
        this.directTo = directTo;
        return this;
    }

    public ScrumStatusFlowVo addDirectToItem(ScrumStatusFlowDirectToVo directToItem) {
        if (this.directTo == null) {
            this.directTo = new ArrayList<>();
        }
        this.directTo.add(directToItem);
        return this;
    }

    public ScrumStatusFlowVo withDirectTo(Consumer<List<ScrumStatusFlowDirectToVo>> directToSetter) {
        if (this.directTo == null) {
            this.directTo = new ArrayList<>();
        }
        directToSetter.accept(this.directTo);
        return this;
    }

    /**
     * 流转到的数据
     * @return directTo
     */
    public List<ScrumStatusFlowDirectToVo> getDirectTo() {
        return directTo;
    }

    public void setDirectTo(List<ScrumStatusFlowDirectToVo> directTo) {
        this.directTo = directTo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ScrumStatusFlowVo scrumStatusFlowVo = (ScrumStatusFlowVo) o;
        return Objects.equals(this.id, scrumStatusFlowVo.id) && Objects.equals(this.name, scrumStatusFlowVo.name)
            && Objects.equals(this.statusId, scrumStatusFlowVo.statusId)
            && Objects.equals(this.directTo, scrumStatusFlowVo.directTo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, statusId, directTo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrumStatusFlowVo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statusId: ").append(toIndentedString(statusId)).append("\n");
        sb.append("    directTo: ").append(toIndentedString(directTo)).append("\n");
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
