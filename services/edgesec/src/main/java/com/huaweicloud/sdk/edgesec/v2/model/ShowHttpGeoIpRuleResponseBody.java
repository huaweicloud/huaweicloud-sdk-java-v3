package com.huaweicloud.sdk.edgesec.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ShowHttpGeoIpRuleResponseBody
 */
public class ShowHttpGeoIpRuleResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyid")

    private String policyid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo_ip")

    private String geoIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "geo_tag_list")

    private List<String> geoTagList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white")

    private Integer white;

    public ShowHttpGeoIpRuleResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 规则id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowHttpGeoIpRuleResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 规则名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowHttpGeoIpRuleResponseBody withPolicyid(String policyid) {
        this.policyid = policyid;
        return this;
    }

    /**
     * 规则所在策略id
     * @return policyid
     */
    public String getPolicyid() {
        return policyid;
    }

    public void setPolicyid(String policyid) {
        this.policyid = policyid;
    }

    public ShowHttpGeoIpRuleResponseBody withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 规则所在策略名称
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public ShowHttpGeoIpRuleResponseBody withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 创建规则时间戳
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ShowHttpGeoIpRuleResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowHttpGeoIpRuleResponseBody withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 规则开关状态
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowHttpGeoIpRuleResponseBody withGeoIp(String geoIp) {
        this.geoIp = geoIp;
        return this;
    }

    /**
     * 地理位置
     * @return geoIp
     */
    public String getGeoIp() {
        return geoIp;
    }

    public void setGeoIp(String geoIp) {
        this.geoIp = geoIp;
    }

    public ShowHttpGeoIpRuleResponseBody withGeoTagList(List<String> geoTagList) {
        this.geoTagList = geoTagList;
        return this;
    }

    public ShowHttpGeoIpRuleResponseBody addGeoTagListItem(String geoTagListItem) {
        if (this.geoTagList == null) {
            this.geoTagList = new ArrayList<>();
        }
        this.geoTagList.add(geoTagListItem);
        return this;
    }

    public ShowHttpGeoIpRuleResponseBody withGeoTagList(Consumer<List<String>> geoTagListSetter) {
        if (this.geoTagList == null) {
            this.geoTagList = new ArrayList<>();
        }
        geoTagListSetter.accept(this.geoTagList);
        return this;
    }

    /**
     * 地理位置列表
     * @return geoTagList
     */
    public List<String> getGeoTagList() {
        return geoTagList;
    }

    public void setGeoTagList(List<String> geoTagList) {
        this.geoTagList = geoTagList;
    }

    public ShowHttpGeoIpRuleResponseBody withWhite(Integer white) {
        this.white = white;
        return this;
    }

    /**
     * 拦截/放行/仅记录
     * @return white
     */
    public Integer getWhite() {
        return white;
    }

    public void setWhite(Integer white) {
        this.white = white;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowHttpGeoIpRuleResponseBody that = (ShowHttpGeoIpRuleResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.policyid, that.policyid) && Objects.equals(this.policyName, that.policyName)
            && Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.description, that.description)
            && Objects.equals(this.status, that.status) && Objects.equals(this.geoIp, that.geoIp)
            && Objects.equals(this.geoTagList, that.geoTagList) && Objects.equals(this.white, that.white);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, policyid, policyName, timestamp, description, status, geoIp, geoTagList, white);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowHttpGeoIpRuleResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    policyid: ").append(toIndentedString(policyid)).append("\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    geoIp: ").append(toIndentedString(geoIp)).append("\n");
        sb.append("    geoTagList: ").append(toIndentedString(geoTagList)).append("\n");
        sb.append("    white: ").append(toIndentedString(white)).append("\n");
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
