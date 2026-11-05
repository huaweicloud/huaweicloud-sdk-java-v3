package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ModelArtsAgencyRequest
 */
public class ModelArtsAgencyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name_suffix")

    private String agencyNameSuffix;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_services")

    private List<AgencyServices> agencyServices = null;

    public ModelArtsAgencyRequest withAgencyNameSuffix(String agencyNameSuffix) {
        this.agencyNameSuffix = agencyNameSuffix;
        return this;
    }

    /**
     * 委托名称后缀。  长度不大于50位。  委托名称前缀固定为ma_agency。  如该字段为iam-user01，则创建出来的委托名称为ma_agency_iam-user01。  默认为空，表示创建名称为modelarts_agency的委托。
     * @return agencyNameSuffix
     */
    public String getAgencyNameSuffix() {
        return agencyNameSuffix;
    }

    public void setAgencyNameSuffix(String agencyNameSuffix) {
        this.agencyNameSuffix = agencyNameSuffix;
    }

    public ModelArtsAgencyRequest withAgencyServices(List<AgencyServices> agencyServices) {
        this.agencyServices = agencyServices;
        return this;
    }

    public ModelArtsAgencyRequest addAgencyServicesItem(AgencyServices agencyServicesItem) {
        if (this.agencyServices == null) {
            this.agencyServices = new ArrayList<>();
        }
        this.agencyServices.add(agencyServicesItem);
        return this;
    }

    public ModelArtsAgencyRequest withAgencyServices(Consumer<List<AgencyServices>> agencyServicesSetter) {
        if (this.agencyServices == null) {
            this.agencyServices = new ArrayList<>();
        }
        agencyServicesSetter.accept(this.agencyServices);
        return this;
    }

    /**
     * **参数解释**：细粒度权限列表。
     * @return agencyServices
     */
    public List<AgencyServices> getAgencyServices() {
        return agencyServices;
    }

    public void setAgencyServices(List<AgencyServices> agencyServices) {
        this.agencyServices = agencyServices;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelArtsAgencyRequest that = (ModelArtsAgencyRequest) obj;
        return Objects.equals(this.agencyNameSuffix, that.agencyNameSuffix)
            && Objects.equals(this.agencyServices, that.agencyServices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencyNameSuffix, agencyServices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelArtsAgencyRequest {\n");
        sb.append("    agencyNameSuffix: ").append(toIndentedString(agencyNameSuffix)).append("\n");
        sb.append("    agencyServices: ").append(toIndentedString(agencyServices)).append("\n");
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
