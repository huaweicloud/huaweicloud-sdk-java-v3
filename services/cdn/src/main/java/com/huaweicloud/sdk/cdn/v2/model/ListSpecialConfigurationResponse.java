package com.huaweicloud.sdk.cdn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListSpecialConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specialConfigurations")

    private List<SpeicialConfiguration> specialConfigurations = null;

    public ListSpecialConfigurationResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总条数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListSpecialConfigurationResponse withSpecialConfigurations(
        List<SpeicialConfiguration> specialConfigurations) {
        this.specialConfigurations = specialConfigurations;
        return this;
    }

    public ListSpecialConfigurationResponse addSpecialConfigurationsItem(
        SpeicialConfiguration specialConfigurationsItem) {
        if (this.specialConfigurations == null) {
            this.specialConfigurations = new ArrayList<>();
        }
        this.specialConfigurations.add(specialConfigurationsItem);
        return this;
    }

    public ListSpecialConfigurationResponse withSpecialConfigurations(
        Consumer<List<SpeicialConfiguration>> specialConfigurationsSetter) {
        if (this.specialConfigurations == null) {
            this.specialConfigurations = new ArrayList<>();
        }
        specialConfigurationsSetter.accept(this.specialConfigurations);
        return this;
    }

    /**
     * 域名特殊配置信息。
     * @return specialConfigurations
     */
    public List<SpeicialConfiguration> getSpecialConfigurations() {
        return specialConfigurations;
    }

    public void setSpecialConfigurations(List<SpeicialConfiguration> specialConfigurations) {
        this.specialConfigurations = specialConfigurations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSpecialConfigurationResponse that = (ListSpecialConfigurationResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.specialConfigurations, that.specialConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, specialConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSpecialConfigurationResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    specialConfigurations: ").append(toIndentedString(specialConfigurations)).append("\n");
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
