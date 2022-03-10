package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class ListL7RulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "l7policy_id")

    private String l7policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_reverse")

    private Boolean pageReverse;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private List<String> id = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_type")

    private List<String> compareType = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provisioning_status")

    private List<String> provisioningStatus = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invert")

    private Boolean invert;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_state_up")

    private Boolean adminStateUp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value")

    private List<String> value = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private List<String> key = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private List<String> type = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private List<String> enterpriseProjectId = null;

    public ListL7RulesRequest withL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
        return this;
    }

    /** 策略ID。
     * 
     * @return l7policyId */
    public String getL7policyId() {
        return l7policyId;
    }

    public void setL7policyId(String l7policyId) {
        this.l7policyId = l7policyId;
    }

    public ListL7RulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的个数。 minimum: 0 maximum: 2000
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListL7RulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /** 上一页最后一条记录的ID。 使用说明： - 必须与limit一起使用。 - 不指定时表示查询第一页。 - 该字段不允许为空或无效的ID。
     * 
     * @return marker */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListL7RulesRequest withPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
        return this;
    }

    /** 分页的顺序，true表示从后往前分页，false表示从前往后分页，默认为false。 使用说明： - 必须与limit一起使用。
     * 
     * @return pageReverse */
    public Boolean getPageReverse() {
        return pageReverse;
    }

    public void setPageReverse(Boolean pageReverse) {
        this.pageReverse = pageReverse;
    }

    public ListL7RulesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    public ListL7RulesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListL7RulesRequest withId(Consumer<List<String>> idSetter) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /** 转发规则ID。 支持多值查询，查询条件格式：*id=xxx&id=xxx*。
     * 
     * @return id */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListL7RulesRequest withCompareType(List<String> compareType) {
        this.compareType = compareType;
        return this;
    }

    public ListL7RulesRequest addCompareTypeItem(String compareTypeItem) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        this.compareType.add(compareTypeItem);
        return this;
    }

    public ListL7RulesRequest withCompareType(Consumer<List<String>> compareTypeSetter) {
        if (this.compareType == null) {
            this.compareType = new ArrayList<>();
        }
        compareTypeSetter.accept(this.compareType);
        return this;
    }

    /** 转发规则的匹配方式。 type为HOST_NAME时可以为EQUAL_TO。 type为PATH时可以为Perl类型的REGEX， STARTS_WITH，EQUAL_TO。
     * 支持多值查询，查询条件格式：*compare_type=xxx&compare_type=xxx*。
     * 
     * @return compareType */
    public List<String> getCompareType() {
        return compareType;
    }

    public void setCompareType(List<String> compareType) {
        this.compareType = compareType;
    }

    public ListL7RulesRequest withProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
        return this;
    }

    public ListL7RulesRequest addProvisioningStatusItem(String provisioningStatusItem) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        this.provisioningStatus.add(provisioningStatusItem);
        return this;
    }

    public ListL7RulesRequest withProvisioningStatus(Consumer<List<String>> provisioningStatusSetter) {
        if (this.provisioningStatus == null) {
            this.provisioningStatus = new ArrayList<>();
        }
        provisioningStatusSetter.accept(this.provisioningStatus);
        return this;
    }

    /** 转发规则的配置状态。取值：ACTIVE 表示正常。 支持多值查询，查询条件格式：*provisioning_status=xxx&provisioning_status=xxx*。
     * 
     * @return provisioningStatus */
    public List<String> getProvisioningStatus() {
        return provisioningStatus;
    }

    public void setProvisioningStatus(List<String> provisioningStatus) {
        this.provisioningStatus = provisioningStatus;
    }

    public ListL7RulesRequest withInvert(Boolean invert) {
        this.invert = invert;
        return this;
    }

    /** 是否反向匹配。固定为false。该字段能更新但不会生效。
     * 
     * @return invert */
    public Boolean getInvert() {
        return invert;
    }

    public void setInvert(Boolean invert) {
        this.invert = invert;
    }

    public ListL7RulesRequest withAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
        return this;
    }

    /** 转发规则的管理状态，默认为true。 不支持该字段，请勿使用。
     * 
     * @return adminStateUp */
    public Boolean getAdminStateUp() {
        return adminStateUp;
    }

    public void setAdminStateUp(Boolean adminStateUp) {
        this.adminStateUp = adminStateUp;
    }

    public ListL7RulesRequest withValue(List<String> value) {
        this.value = value;
        return this;
    }

    public ListL7RulesRequest addValueItem(String valueItem) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        this.value.add(valueItem);
        return this;
    }

    public ListL7RulesRequest withValue(Consumer<List<String>> valueSetter) {
        if (this.value == null) {
            this.value = new ArrayList<>();
        }
        valueSetter.accept(this.value);
        return this;
    }

    /** 匹配内容的值。 支持多值查询，查询条件格式：*value=xxx&value=xxx*。
     * 
     * @return value */
    public List<String> getValue() {
        return value;
    }

    public void setValue(List<String> value) {
        this.value = value;
    }

    public ListL7RulesRequest withKey(List<String> key) {
        this.key = key;
        return this;
    }

    public ListL7RulesRequest addKeyItem(String keyItem) {
        if (this.key == null) {
            this.key = new ArrayList<>();
        }
        this.key.add(keyItem);
        return this;
    }

    public ListL7RulesRequest withKey(Consumer<List<String>> keySetter) {
        if (this.key == null) {
            this.key = new ArrayList<>();
        }
        keySetter.accept(this.key);
        return this;
    }

    /** 匹配内容的键值，用于标识规则。 支持多值查询，查询条件格式：*key=xxx&key=xxx*。 不支持该字段，请勿使用。
     * 
     * @return key */
    public List<String> getKey() {
        return key;
    }

    public void setKey(List<String> key) {
        this.key = key;
    }

    public ListL7RulesRequest withType(List<String> type) {
        this.type = type;
        return this;
    }

    public ListL7RulesRequest addTypeItem(String typeItem) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        this.type.add(typeItem);
        return this;
    }

    public ListL7RulesRequest withType(Consumer<List<String>> typeSetter) {
        if (this.type == null) {
            this.type = new ArrayList<>();
        }
        typeSetter.accept(this.type);
        return this;
    }

    /** 匹配类别，可以为HOST_NAME，PATH。 一个l7policy下创建的l7rule的type不能重复。 支持多值查询，查询条件格式：*type=xxx&type=xxx*。
     * 
     * @return type */
    public List<String> getType() {
        return type;
    }

    public void setType(List<String> type) {
        this.type = type;
    }

    public ListL7RulesRequest withEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    public ListL7RulesRequest addEnterpriseProjectIdItem(String enterpriseProjectIdItem) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        this.enterpriseProjectId.add(enterpriseProjectIdItem);
        return this;
    }

    public ListL7RulesRequest withEnterpriseProjectId(Consumer<List<String>> enterpriseProjectIdSetter) {
        if (this.enterpriseProjectId == null) {
            this.enterpriseProjectId = new ArrayList<>();
        }
        enterpriseProjectIdSetter.accept(this.enterpriseProjectId);
        return this;
    }

    /** 企业项目ID。 支持多值查询，查询条件格式：*enterprise_project_id=xxx&enterprise_project_id=xxx*。
     * [不支持该字段，请勿使用。](tag:dt,dt_test,hcso_dt)
     * 
     * @return enterpriseProjectId */
    public List<String> getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(List<String> enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListL7RulesRequest listL7RulesRequest = (ListL7RulesRequest) o;
        return Objects.equals(this.l7policyId, listL7RulesRequest.l7policyId)
            && Objects.equals(this.limit, listL7RulesRequest.limit)
            && Objects.equals(this.marker, listL7RulesRequest.marker)
            && Objects.equals(this.pageReverse, listL7RulesRequest.pageReverse)
            && Objects.equals(this.id, listL7RulesRequest.id)
            && Objects.equals(this.compareType, listL7RulesRequest.compareType)
            && Objects.equals(this.provisioningStatus, listL7RulesRequest.provisioningStatus)
            && Objects.equals(this.invert, listL7RulesRequest.invert)
            && Objects.equals(this.adminStateUp, listL7RulesRequest.adminStateUp)
            && Objects.equals(this.value, listL7RulesRequest.value) && Objects.equals(this.key, listL7RulesRequest.key)
            && Objects.equals(this.type, listL7RulesRequest.type)
            && Objects.equals(this.enterpriseProjectId, listL7RulesRequest.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(l7policyId,
            limit,
            marker,
            pageReverse,
            id,
            compareType,
            provisioningStatus,
            invert,
            adminStateUp,
            value,
            key,
            type,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListL7RulesRequest {\n");
        sb.append("    l7policyId: ").append(toIndentedString(l7policyId)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    pageReverse: ").append(toIndentedString(pageReverse)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    compareType: ").append(toIndentedString(compareType)).append("\n");
        sb.append("    provisioningStatus: ").append(toIndentedString(provisioningStatus)).append("\n");
        sb.append("    invert: ").append(toIndentedString(invert)).append("\n");
        sb.append("    adminStateUp: ").append(toIndentedString(adminStateUp)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
