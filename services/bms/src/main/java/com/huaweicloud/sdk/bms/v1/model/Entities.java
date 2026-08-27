package com.huaweicloud.sdk.bms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * entities字段数据结构说明
 */
public class Entities {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nic_id")

    private String nicId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs_total")

    private Integer subJobsTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_jobs")

    private List<SubJobs> subJobs = null;

    public Entities withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 裸金属服务器相关操作显示server_id
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public Entities withNicId(String nicId) {
        this.nicId = nicId;
        return this;
    }

    /**
     * 网卡相关操作显示nic_id
     * @return nicId
     */
    public String getNicId() {
        return nicId;
    }

    public void setNicId(String nicId) {
        this.nicId = nicId;
    }

    public Entities withSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
        return this;
    }

    /**
     * 子任务数量。没有子任务时为0
     * @return subJobsTotal
     */
    public Integer getSubJobsTotal() {
        return subJobsTotal;
    }

    public void setSubJobsTotal(Integer subJobsTotal) {
        this.subJobsTotal = subJobsTotal;
    }

    public Entities withSubJobs(List<SubJobs> subJobs) {
        this.subJobs = subJobs;
        return this;
    }

    public Entities addSubJobsItem(SubJobs subJobsItem) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        this.subJobs.add(subJobsItem);
        return this;
    }

    public Entities withSubJobs(Consumer<List<SubJobs>> subJobsSetter) {
        if (this.subJobs == null) {
            this.subJobs = new ArrayList<>();
        }
        subJobsSetter.accept(this.subJobs);
        return this;
    }

    /**
     * 每个子任务的执行信息。没有子任务时为空列表
     * @return subJobs
     */
    public List<SubJobs> getSubJobs() {
        return subJobs;
    }

    public void setSubJobs(List<SubJobs> subJobs) {
        this.subJobs = subJobs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Entities that = (Entities) obj;
        return Objects.equals(this.serverId, that.serverId) && Objects.equals(this.nicId, that.nicId)
            && Objects.equals(this.subJobsTotal, that.subJobsTotal) && Objects.equals(this.subJobs, that.subJobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverId, nicId, subJobsTotal, subJobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Entities {\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    nicId: ").append(toIndentedString(nicId)).append("\n");
        sb.append("    subJobsTotal: ").append(toIndentedString(subJobsTotal)).append("\n");
        sb.append("    subJobs: ").append(toIndentedString(subJobs)).append("\n");
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
