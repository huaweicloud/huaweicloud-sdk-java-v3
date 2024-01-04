package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PrecheckSpec
 */
public class PrecheckSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterID")

    private String clusterID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusterVersion")

    private String clusterVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targetVersion")

    private String targetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "skippedCheckItemList")

    private List<SkippedCheckItemList> skippedCheckItemList = null;

    public PrecheckSpec withClusterID(String clusterID) {
        this.clusterID = clusterID;
        return this;
    }

    /**
     * 集群ID
     * @return clusterID
     */
    public String getClusterID() {
        return clusterID;
    }

    public void setClusterID(String clusterID) {
        this.clusterID = clusterID;
    }

    public PrecheckSpec withClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
        return this;
    }

    /**
     * 集群版本
     * @return clusterVersion
     */
    public String getClusterVersion() {
        return clusterVersion;
    }

    public void setClusterVersion(String clusterVersion) {
        this.clusterVersion = clusterVersion;
    }

    public PrecheckSpec withTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }

    /**
     * 升级目标版本
     * @return targetVersion
     */
    public String getTargetVersion() {
        return targetVersion;
    }

    public void setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
    }

    public PrecheckSpec withSkippedCheckItemList(List<SkippedCheckItemList> skippedCheckItemList) {
        this.skippedCheckItemList = skippedCheckItemList;
        return this;
    }

    public PrecheckSpec addSkippedCheckItemListItem(SkippedCheckItemList skippedCheckItemListItem) {
        if (this.skippedCheckItemList == null) {
            this.skippedCheckItemList = new ArrayList<>();
        }
        this.skippedCheckItemList.add(skippedCheckItemListItem);
        return this;
    }

    public PrecheckSpec withSkippedCheckItemList(Consumer<List<SkippedCheckItemList>> skippedCheckItemListSetter) {
        if (this.skippedCheckItemList == null) {
            this.skippedCheckItemList = new ArrayList<>();
        }
        skippedCheckItemListSetter.accept(this.skippedCheckItemList);
        return this;
    }

    /**
     * 跳过检查的项目列表
     * @return skippedCheckItemList
     */
    public List<SkippedCheckItemList> getSkippedCheckItemList() {
        return skippedCheckItemList;
    }

    public void setSkippedCheckItemList(List<SkippedCheckItemList> skippedCheckItemList) {
        this.skippedCheckItemList = skippedCheckItemList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrecheckSpec that = (PrecheckSpec) obj;
        return Objects.equals(this.clusterID, that.clusterID)
            && Objects.equals(this.clusterVersion, that.clusterVersion)
            && Objects.equals(this.targetVersion, that.targetVersion)
            && Objects.equals(this.skippedCheckItemList, that.skippedCheckItemList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterID, clusterVersion, targetVersion, skippedCheckItemList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrecheckSpec {\n");
        sb.append("    clusterID: ").append(toIndentedString(clusterID)).append("\n");
        sb.append("    clusterVersion: ").append(toIndentedString(clusterVersion)).append("\n");
        sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
        sb.append("    skippedCheckItemList: ").append(toIndentedString(skippedCheckItemList)).append("\n");
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
