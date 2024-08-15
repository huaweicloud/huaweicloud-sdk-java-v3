package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CdmClusterEnterpriseProject
 */
public class CdmClusterEnterpriseProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SysTags> sysTags = null;

    public CdmClusterEnterpriseProject withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public CdmClusterEnterpriseProject withSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public CdmClusterEnterpriseProject addSysTagsItem(SysTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public CdmClusterEnterpriseProject withSysTags(Consumer<List<SysTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 企业项目列表
     * @return sysTags
     */
    public List<SysTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SysTags> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CdmClusterEnterpriseProject that = (CdmClusterEnterpriseProject) obj;
        return Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterId, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CdmClusterEnterpriseProject {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
