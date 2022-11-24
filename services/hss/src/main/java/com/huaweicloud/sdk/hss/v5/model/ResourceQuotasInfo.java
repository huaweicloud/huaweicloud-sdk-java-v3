package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResourceQuotasInfo
 */
public class ResourceQuotasInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_num")

    private Integer totalNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_num")

    private Integer usedNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_num")

    private Integer availableNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "available_resources_list")

    private List<AvailableResourceIdsInfo> availableResourcesList = null;

    public ResourceQuotasInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 主机开通的版本，包含如下6种输入。   - hss.version.null ：无。   - hss.version.basic ：基础版。   - hss.version.enterprise ：企业版。   - hss.version.premium ：旗舰版。   - hss.version.wtp ：网页防篡改版。   - hss.version.container.enterprise：容器版。
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ResourceQuotasInfo withTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * 总配额数
     * minimum: 0
     * maximum: 2000000
     * @return totalNum
     */
    public Integer getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(Integer totalNum) {
        this.totalNum = totalNum;
    }

    public ResourceQuotasInfo withUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
        return this;
    }

    /**
     * 已使用配额数
     * minimum: 0
     * maximum: 2000000
     * @return usedNum
     */
    public Integer getUsedNum() {
        return usedNum;
    }

    public void setUsedNum(Integer usedNum) {
        this.usedNum = usedNum;
    }

    public ResourceQuotasInfo withAvailableNum(Integer availableNum) {
        this.availableNum = availableNum;
        return this;
    }

    /**
     * 总配额数
     * minimum: 0
     * maximum: 2000000
     * @return availableNum
     */
    public Integer getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(Integer availableNum) {
        this.availableNum = availableNum;
    }

    public ResourceQuotasInfo withAvailableResourcesList(List<AvailableResourceIdsInfo> availableResourcesList) {
        this.availableResourcesList = availableResourcesList;
        return this;
    }

    public ResourceQuotasInfo addAvailableResourcesListItem(AvailableResourceIdsInfo availableResourcesListItem) {
        if (this.availableResourcesList == null) {
            this.availableResourcesList = new ArrayList<>();
        }
        this.availableResourcesList.add(availableResourcesListItem);
        return this;
    }

    public ResourceQuotasInfo withAvailableResourcesList(
        Consumer<List<AvailableResourceIdsInfo>> availableResourcesListSetter) {
        if (this.availableResourcesList == null) {
            this.availableResourcesList = new ArrayList<>();
        }
        availableResourcesListSetter.accept(this.availableResourcesList);
        return this;
    }

    /**
     * 可用资源列表
     * @return availableResourcesList
     */
    public List<AvailableResourceIdsInfo> getAvailableResourcesList() {
        return availableResourcesList;
    }

    public void setAvailableResourcesList(List<AvailableResourceIdsInfo> availableResourcesList) {
        this.availableResourcesList = availableResourcesList;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceQuotasInfo resourceQuotasInfo = (ResourceQuotasInfo) o;
        return Objects.equals(this.version, resourceQuotasInfo.version)
            && Objects.equals(this.totalNum, resourceQuotasInfo.totalNum)
            && Objects.equals(this.usedNum, resourceQuotasInfo.usedNum)
            && Objects.equals(this.availableNum, resourceQuotasInfo.availableNum)
            && Objects.equals(this.availableResourcesList, resourceQuotasInfo.availableResourcesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version, totalNum, usedNum, availableNum, availableResourcesList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceQuotasInfo {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("    usedNum: ").append(toIndentedString(usedNum)).append("\n");
        sb.append("    availableNum: ").append(toIndentedString(availableNum)).append("\n");
        sb.append("    availableResourcesList: ").append(toIndentedString(availableResourcesList)).append("\n");
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
