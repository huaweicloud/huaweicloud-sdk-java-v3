package com.huaweicloud.sdk.osm.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListOrderIncidentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchKey")

    private List<String> searchKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelIdList")

    private List<Integer> labelIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appKey")

    private String appKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incidentId")

    private String incidentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryStartTime")

    private String queryStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queryEndTime")

    private String queryEndTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "incidentStatus")

    private String incidentStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xCustomerName")

    private String xCustomerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "groupId")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "productCategoryId")

    private String productCategoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "businessTypeId")

    private String businessTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageNo")

    private Integer pageNo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xCustomerId")

    private String xCustomerId;

    public ListOrderIncidentRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public ListOrderIncidentRequest withSearchKey(List<String> searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    public ListOrderIncidentRequest addSearchKeyItem(String searchKeyItem) {
        if (this.searchKey == null) {
            this.searchKey = new ArrayList<>();
        }
        this.searchKey.add(searchKeyItem);
        return this;
    }

    public ListOrderIncidentRequest withSearchKey(Consumer<List<String>> searchKeySetter) {
        if (this.searchKey == null) {
            this.searchKey = new ArrayList<>();
        }
        searchKeySetter.accept(this.searchKey);
        return this;
    }

    /**
     * 关键字
     * @return searchKey
     */
    public List<String> getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(List<String> searchKey) {
        this.searchKey = searchKey;
    }

    public ListOrderIncidentRequest withLabelIdList(List<Integer> labelIdList) {
        this.labelIdList = labelIdList;
        return this;
    }

    public ListOrderIncidentRequest addLabelIdListItem(Integer labelIdListItem) {
        if (this.labelIdList == null) {
            this.labelIdList = new ArrayList<>();
        }
        this.labelIdList.add(labelIdListItem);
        return this;
    }

    public ListOrderIncidentRequest withLabelIdList(Consumer<List<Integer>> labelIdListSetter) {
        if (this.labelIdList == null) {
            this.labelIdList = new ArrayList<>();
        }
        labelIdListSetter.accept(this.labelIdList);
        return this;
    }

    /**
     * 标签列表
     * @return labelIdList
     */
    public List<Integer> getLabelIdList() {
        return labelIdList;
    }

    public void setLabelIdList(List<Integer> labelIdList) {
        this.labelIdList = labelIdList;
    }

    public ListOrderIncidentRequest withAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }

    /**
     * appKey
     * @return appKey
     */
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public ListOrderIncidentRequest withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    /**
     * incidentId
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public ListOrderIncidentRequest withQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
        return this;
    }

    /**
     * 查询开始时间
     * @return queryStartTime
     */
    public String getQueryStartTime() {
        return queryStartTime;
    }

    public void setQueryStartTime(String queryStartTime) {
        this.queryStartTime = queryStartTime;
    }

    public ListOrderIncidentRequest withQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
        return this;
    }

    /**
     * 查询结束时间
     * @return queryEndTime
     */
    public String getQueryEndTime() {
        return queryEndTime;
    }

    public void setQueryEndTime(String queryEndTime) {
        this.queryEndTime = queryEndTime;
    }

    public ListOrderIncidentRequest withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * minimum: 0
     * maximum: 100
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ListOrderIncidentRequest withIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
        return this;
    }

    /**
     * 工单状态
     * @return incidentStatus
     */
    public String getIncidentStatus() {
        return incidentStatus;
    }

    public void setIncidentStatus(String incidentStatus) {
        this.incidentStatus = incidentStatus;
    }

    public ListOrderIncidentRequest withXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
        return this;
    }

    /**
     * 用户名称
     * @return xCustomerName
     */
    public String getXCustomerName() {
        return xCustomerName;
    }

    public void setXCustomerName(String xCustomerName) {
        this.xCustomerName = xCustomerName;
    }

    public ListOrderIncidentRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 分组
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ListOrderIncidentRequest withProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
        return this;
    }

    /**
     * 产品分类
     * @return productCategoryId
     */
    public String getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(String productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public ListOrderIncidentRequest withBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
        return this;
    }

    /**
     * 类型
     * @return businessTypeId
     */
    public String getBusinessTypeId() {
        return businessTypeId;
    }

    public void setBusinessTypeId(String businessTypeId) {
        this.businessTypeId = businessTypeId;
    }

    public ListOrderIncidentRequest withPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }

    /**
     * 页码
     * minimum: 1
     * maximum: 65535
     * @return pageNo
     */
    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public ListOrderIncidentRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListOrderIncidentRequest withXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
        return this;
    }

    /**
     * 客户id
     * @return xCustomerId
     */
    public String getXCustomerId() {
        return xCustomerId;
    }

    public void setXCustomerId(String xCustomerId) {
        this.xCustomerId = xCustomerId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListOrderIncidentRequest listOrderIncidentRequest = (ListOrderIncidentRequest) o;
        return Objects.equals(this.version, listOrderIncidentRequest.version)
            && Objects.equals(this.searchKey, listOrderIncidentRequest.searchKey)
            && Objects.equals(this.labelIdList, listOrderIncidentRequest.labelIdList)
            && Objects.equals(this.appKey, listOrderIncidentRequest.appKey)
            && Objects.equals(this.incidentId, listOrderIncidentRequest.incidentId)
            && Objects.equals(this.queryStartTime, listOrderIncidentRequest.queryStartTime)
            && Objects.equals(this.queryEndTime, listOrderIncidentRequest.queryEndTime)
            && Objects.equals(this.status, listOrderIncidentRequest.status)
            && Objects.equals(this.incidentStatus, listOrderIncidentRequest.incidentStatus)
            && Objects.equals(this.xCustomerName, listOrderIncidentRequest.xCustomerName)
            && Objects.equals(this.groupId, listOrderIncidentRequest.groupId)
            && Objects.equals(this.productCategoryId, listOrderIncidentRequest.productCategoryId)
            && Objects.equals(this.businessTypeId, listOrderIncidentRequest.businessTypeId)
            && Objects.equals(this.pageNo, listOrderIncidentRequest.pageNo)
            && Objects.equals(this.pageSize, listOrderIncidentRequest.pageSize)
            && Objects.equals(this.xCustomerId, listOrderIncidentRequest.xCustomerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(version,
            searchKey,
            labelIdList,
            appKey,
            incidentId,
            queryStartTime,
            queryEndTime,
            status,
            incidentStatus,
            xCustomerName,
            groupId,
            productCategoryId,
            businessTypeId,
            pageNo,
            pageSize,
            xCustomerId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListOrderIncidentRequest {\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    labelIdList: ").append(toIndentedString(labelIdList)).append("\n");
        sb.append("    appKey: ").append(toIndentedString(appKey)).append("\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    queryStartTime: ").append(toIndentedString(queryStartTime)).append("\n");
        sb.append("    queryEndTime: ").append(toIndentedString(queryEndTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    incidentStatus: ").append(toIndentedString(incidentStatus)).append("\n");
        sb.append("    xCustomerName: ").append(toIndentedString(xCustomerName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    productCategoryId: ").append(toIndentedString(productCategoryId)).append("\n");
        sb.append("    businessTypeId: ").append(toIndentedString(businessTypeId)).append("\n");
        sb.append("    pageNo: ").append(toIndentedString(pageNo)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    xCustomerId: ").append(toIndentedString(xCustomerId)).append("\n");
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
