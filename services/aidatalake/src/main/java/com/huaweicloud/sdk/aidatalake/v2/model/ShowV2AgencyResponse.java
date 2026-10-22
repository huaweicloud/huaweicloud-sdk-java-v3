package com.huaweicloud.sdk.aidatalake.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowV2AgencyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorized")

    private Boolean authorized;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_policies")

    private List<V2AgencyPolicy> agencyPolicies = null;

    public ShowV2AgencyResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**：委托名称。 **取值范围**：固定值ai_datalake_admin_trust。
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowV2AgencyResponse withAuthorized(Boolean authorized) {
        this.authorized = authorized;
        return this;
    }

    /**
     * **参数解释**：授权与否。如果用户的服务委托权限包含系统所需要的委托权限则返回true，否则返回false。 **取值范围**：   - true：已授权。   - false：未授权。
     * @return authorized
     */
    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public ShowV2AgencyResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：资源创建时间。 **取值范围**：ISO 8601格式，yyyy-MM-dd'T'HH:mm:ss.SSSZ，UTC时间。 
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowV2AgencyResponse withAgencyPolicies(List<V2AgencyPolicy> agencyPolicies) {
        this.agencyPolicies = agencyPolicies;
        return this;
    }

    public ShowV2AgencyResponse addAgencyPoliciesItem(V2AgencyPolicy agencyPoliciesItem) {
        if (this.agencyPolicies == null) {
            this.agencyPolicies = new ArrayList<>();
        }
        this.agencyPolicies.add(agencyPoliciesItem);
        return this;
    }

    public ShowV2AgencyResponse withAgencyPolicies(Consumer<List<V2AgencyPolicy>> agencyPoliciesSetter) {
        if (this.agencyPolicies == null) {
            this.agencyPolicies = new ArrayList<>();
        }
        agencyPoliciesSetter.accept(this.agencyPolicies);
        return this;
    }

    /**
     * **参数解释**：委托策略列表。
     * @return agencyPolicies
     */
    public List<V2AgencyPolicy> getAgencyPolicies() {
        return agencyPolicies;
    }

    public void setAgencyPolicies(List<V2AgencyPolicy> agencyPolicies) {
        this.agencyPolicies = agencyPolicies;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowV2AgencyResponse that = (ShowV2AgencyResponse) obj;
        return Objects.equals(this.agencyName, that.agencyName) && Objects.equals(this.authorized, that.authorized)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.agencyPolicies, that.agencyPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyName, authorized, createTime, agencyPolicies);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowV2AgencyResponse {\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    authorized: ").append(toIndentedString(authorized)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    agencyPolicies: ").append(toIndentedString(agencyPolicies)).append("\n");
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
