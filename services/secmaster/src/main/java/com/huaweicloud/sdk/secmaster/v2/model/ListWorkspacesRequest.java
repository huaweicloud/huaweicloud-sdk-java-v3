package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * Request Object
 */
public class ListWorkspacesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private BigDecimal offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private BigDecimal limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_bind_id")

    private String viewBindId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_bind_name")

    private String viewBindName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_start")

    private String createTimeStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_end")

    private String createTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_view")

    private Boolean isView;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ids")

    private String ids;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "normal_project_id")

    private String normalProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public ListWorkspacesRequest withOffset(BigDecimal offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 偏移量 指定返回记录的开始位置，必须为数字，取值范围为大于或等于0，
     * minimum: 0
     * maximum: 999
     * @return offset
     */
    public BigDecimal getOffset() {
        return offset;
    }

    public void setOffset(BigDecimal offset) {
        this.offset = offset;
    }

    public ListWorkspacesRequest withLimit(BigDecimal limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示个数
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }

    public ListWorkspacesRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 区域id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public ListWorkspacesRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称查询
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListWorkspacesRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述查询
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListWorkspacesRequest withViewBindId(String viewBindId) {
        this.viewBindId = viewBindId;
        return this;
    }

    /**
     * 视图绑定的空间id
     * @return viewBindId
     */
    public String getViewBindId() {
        return viewBindId;
    }

    public void setViewBindId(String viewBindId) {
        this.viewBindId = viewBindId;
    }

    public ListWorkspacesRequest withViewBindName(String viewBindName) {
        this.viewBindName = viewBindName;
        return this;
    }

    /**
     * 视图绑定的空间名称
     * @return viewBindName
     */
    public String getViewBindName() {
        return viewBindName;
    }

    public void setViewBindName(String viewBindName) {
        this.viewBindName = viewBindName;
    }

    public ListWorkspacesRequest withCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
        return this;
    }

    /**
     * 创建时间开始，例如2024-04-26T16:08:09Z+0800
     * @return createTimeStart
     */
    public String getCreateTimeStart() {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart) {
        this.createTimeStart = createTimeStart;
    }

    public ListWorkspacesRequest withCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
        return this;
    }

    /**
     * 创建时间结束，例如2024-04-2T16:08:09Z+0800
     * @return createTimeEnd
     */
    public String getCreateTimeEnd() {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd) {
        this.createTimeEnd = createTimeEnd;
    }

    public ListWorkspacesRequest withIsView(Boolean isView) {
        this.isView = isView;
        return this;
    }

    /**
     * 是否查询视图 true or false
     * @return isView
     */
    public Boolean getIsView() {
        return isView;
    }

    public void setIsView(Boolean isView) {
        this.isView = isView;
    }

    public ListWorkspacesRequest withIds(String ids) {
        this.ids = ids;
        return this;
    }

    /**
     * 工作空间id数组，英文逗号分隔
     * @return ids
     */
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    public ListWorkspacesRequest withNormalProjectId(String normalProjectId) {
        this.normalProjectId = normalProjectId;
        return this;
    }

    /**
     * 普通项目的项目id
     * @return normalProjectId
     */
    public String getNormalProjectId() {
        return normalProjectId;
    }

    public void setNormalProjectId(String normalProjectId) {
        this.normalProjectId = normalProjectId;
    }

    public ListWorkspacesRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目的项目id
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListWorkspacesRequest that = (ListWorkspacesRequest) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.viewBindId, that.viewBindId)
            && Objects.equals(this.viewBindName, that.viewBindName)
            && Objects.equals(this.createTimeStart, that.createTimeStart)
            && Objects.equals(this.createTimeEnd, that.createTimeEnd) && Objects.equals(this.isView, that.isView)
            && Objects.equals(this.ids, that.ids) && Objects.equals(this.normalProjectId, that.normalProjectId)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset,
            limit,
            regionId,
            name,
            description,
            viewBindId,
            viewBindName,
            createTimeStart,
            createTimeEnd,
            isView,
            ids,
            normalProjectId,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListWorkspacesRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    viewBindId: ").append(toIndentedString(viewBindId)).append("\n");
        sb.append("    viewBindName: ").append(toIndentedString(viewBindName)).append("\n");
        sb.append("    createTimeStart: ").append(toIndentedString(createTimeStart)).append("\n");
        sb.append("    createTimeEnd: ").append(toIndentedString(createTimeEnd)).append("\n");
        sb.append("    isView: ").append(toIndentedString(isView)).append("\n");
        sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
        sb.append("    normalProjectId: ").append(toIndentedString(normalProjectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
