package com.huaweicloud.sdk.aom.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AgentInfoParam
 */
public class AgentInfoParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Long page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ecs_id_list")

    private List<String> ecsIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id_list")

    private List<String> agentIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "coc_cmdb_id_list")

    private List<String> cocCmdbIdList = null;

    public AgentInfoParam withPage(Long page) {
        this.page = page;
        return this;
    }

    /**
     * 分页查询的起始页数（第几页）。默认值：1。
     * @return page
     */
    public Long getPage() {
        return page;
    }

    public void setPage(Long page) {
        this.page = page;
    }

    public AgentInfoParam withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页查询数量，默认20。
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public AgentInfoParam withEcsIdList(List<String> ecsIdList) {
        this.ecsIdList = ecsIdList;
        return this;
    }

    public AgentInfoParam addEcsIdListItem(String ecsIdListItem) {
        if (this.ecsIdList == null) {
            this.ecsIdList = new ArrayList<>();
        }
        this.ecsIdList.add(ecsIdListItem);
        return this;
    }

    public AgentInfoParam withEcsIdList(Consumer<List<String>> ecsIdListSetter) {
        if (this.ecsIdList == null) {
            this.ecsIdList = new ArrayList<>();
        }
        ecsIdListSetter.accept(this.ecsIdList);
        return this;
    }

    /**
     * ecs ID列表信息。
     * @return ecsIdList
     */
    public List<String> getEcsIdList() {
        return ecsIdList;
    }

    public void setEcsIdList(List<String> ecsIdList) {
        this.ecsIdList = ecsIdList;
    }

    public AgentInfoParam withAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }

    public AgentInfoParam addAgentIdListItem(String agentIdListItem) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        this.agentIdList.add(agentIdListItem);
        return this;
    }

    public AgentInfoParam withAgentIdList(Consumer<List<String>> agentIdListSetter) {
        if (this.agentIdList == null) {
            this.agentIdList = new ArrayList<>();
        }
        agentIdListSetter.accept(this.agentIdList);
        return this;
    }

    /**
     * agent ID列表信息。
     * @return agentIdList
     */
    public List<String> getAgentIdList() {
        return agentIdList;
    }

    public void setAgentIdList(List<String> agentIdList) {
        this.agentIdList = agentIdList;
    }

    public AgentInfoParam withCocCmdbIdList(List<String> cocCmdbIdList) {
        this.cocCmdbIdList = cocCmdbIdList;
        return this;
    }

    public AgentInfoParam addCocCmdbIdListItem(String cocCmdbIdListItem) {
        if (this.cocCmdbIdList == null) {
            this.cocCmdbIdList = new ArrayList<>();
        }
        this.cocCmdbIdList.add(cocCmdbIdListItem);
        return this;
    }

    public AgentInfoParam withCocCmdbIdList(Consumer<List<String>> cocCmdbIdListSetter) {
        if (this.cocCmdbIdList == null) {
            this.cocCmdbIdList = new ArrayList<>();
        }
        cocCmdbIdListSetter.accept(this.cocCmdbIdList);
        return this;
    }

    /**
     * cmdb  ID列表信息。
     * @return cocCmdbIdList
     */
    public List<String> getCocCmdbIdList() {
        return cocCmdbIdList;
    }

    public void setCocCmdbIdList(List<String> cocCmdbIdList) {
        this.cocCmdbIdList = cocCmdbIdList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentInfoParam that = (AgentInfoParam) obj;
        return Objects.equals(this.page, that.page) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.ecsIdList, that.ecsIdList) && Objects.equals(this.agentIdList, that.agentIdList)
            && Objects.equals(this.cocCmdbIdList, that.cocCmdbIdList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(page, pageSize, ecsIdList, agentIdList, cocCmdbIdList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentInfoParam {\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    ecsIdList: ").append(toIndentedString(ecsIdList)).append("\n");
        sb.append("    agentIdList: ").append(toIndentedString(agentIdList)).append("\n");
        sb.append("    cocCmdbIdList: ").append(toIndentedString(cocCmdbIdList)).append("\n");
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
