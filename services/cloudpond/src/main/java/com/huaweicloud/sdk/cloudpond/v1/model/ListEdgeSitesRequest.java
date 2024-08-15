package com.huaweicloud.sdk.cloudpond.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListEdgeSitesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private List<String> sortKey = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_dir")

    private List<String> sortDir = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private List<String> name = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "availability_zone_id")

    private List<String> availabilityZoneId = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private List<SiteStatus> status = null;

    public ListEdgeSitesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页的数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEdgeSitesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 分页标识
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListEdgeSitesRequest withSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    public ListEdgeSitesRequest addSortKeyItem(String sortKeyItem) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        this.sortKey.add(sortKeyItem);
        return this;
    }

    public ListEdgeSitesRequest withSortKey(Consumer<List<String>> sortKeySetter) {
        if (this.sortKey == null) {
            this.sortKey = new ArrayList<>();
        }
        sortKeySetter.accept(this.sortKey);
        return this;
    }

    /**
     * 排序字段
     * @return sortKey
     */
    public List<String> getSortKey() {
        return sortKey;
    }

    public void setSortKey(List<String> sortKey) {
        this.sortKey = sortKey;
    }

    public ListEdgeSitesRequest withSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
        return this;
    }

    public ListEdgeSitesRequest addSortDirItem(String sortDirItem) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        this.sortDir.add(sortDirItem);
        return this;
    }

    public ListEdgeSitesRequest withSortDir(Consumer<List<String>> sortDirSetter) {
        if (this.sortDir == null) {
            this.sortDir = new ArrayList<>();
        }
        sortDirSetter.accept(this.sortDir);
        return this;
    }

    /**
     * 排序方向，取值范围： - desc：降序 - acs：升序
     * @return sortDir
     */
    public List<String> getSortDir() {
        return sortDir;
    }

    public void setSortDir(List<String> sortDir) {
        this.sortDir = sortDir;
    }

    public ListEdgeSitesRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListEdgeSitesRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListEdgeSitesRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /**
     * 企业项目ID。可以使用该字段过滤某个企业项目下的边缘小站。 最大长度36字节，带“-”连字符的UUID格式，或者是字符串“0”。“0”表示默认企业项目。 若需要查询当前用户所有企业项目绑定的边缘小站，请传参all_granted_eps。 不传则查询全部。
     * @return enterpriseProjectId
     */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListEdgeSitesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListEdgeSitesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListEdgeSitesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * 根据边缘小站ID查询，支持排序
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListEdgeSitesRequest withName(List<String> name) {
        this.name = name;
        return this;
    }

    public ListEdgeSitesRequest addNameItem(String nameItem) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        this.name.add(nameItem);
        return this;
    }

    public ListEdgeSitesRequest withName(Consumer<List<String>> nameSetter) {
        if (this.name == null) {
            this.name = new ArrayList<>();
        }
        nameSetter.accept(this.name);
        return this;
    }

    /**
     * 根据边缘小站名称查询（精确），支持排序
     * @return name
     */
    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public ListEdgeSitesRequest withAvailabilityZoneId(List<String> availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
        return this;
    }

    public ListEdgeSitesRequest addAvailabilityZoneIdItem(String availabilityZoneIdItem) {
        if (this.availabilityZoneId == null) {
            this.availabilityZoneId = new ArrayList<>();
        }
        this.availabilityZoneId.add(availabilityZoneIdItem);
        return this;
    }

    public ListEdgeSitesRequest withAvailabilityZoneId(Consumer<List<String>> availabilityZoneIdSetter) {
        if (this.availabilityZoneId == null) {
            this.availabilityZoneId = new ArrayList<>();
        }
        availabilityZoneIdSetter.accept(this.availabilityZoneId);
        return this;
    }

    /**
     * 根据边缘可用区ID查询
     * @return availabilityZoneId
     */
    public List<String> getAvailabilityZoneId() {
        return availabilityZoneId;
    }

    public void setAvailabilityZoneId(List<String> availabilityZoneId) {
        this.availabilityZoneId = availabilityZoneId;
    }

    public ListEdgeSitesRequest withStatus(List<SiteStatus> status) {
        this.status = status;
        return this;
    }

    public ListEdgeSitesRequest addStatusItem(SiteStatus statusItem) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        this.status.add(statusItem);
        return this;
    }

    public ListEdgeSitesRequest withStatus(Consumer<List<SiteStatus>> statusSetter) {
        if (this.status == null) {
            this.status = new ArrayList<>();
        }
        statusSetter.accept(this.status);
        return this;
    }

    /**
     * 根据边缘小站部署状态查询
     * @return status
     */
    public List<SiteStatus> getStatus() {
        return status;
    }

    public void setStatus(List<SiteStatus> status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgeSitesRequest that = (ListEdgeSitesRequest) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.marker, that.marker)
            && Objects.equals(this.sortKey, that.sortKey) && Objects.equals(this.sortDir, that.sortDir)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.availabilityZoneId, that.availabilityZoneId)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, sortKey, sortDir, enterpriseProjectId, id, name, availabilityZoneId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeSitesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortDir: ").append(toIndentedString(sortDir)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    availabilityZoneId: ").append(toIndentedString(availabilityZoneId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
