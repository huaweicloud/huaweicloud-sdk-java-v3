package com.huaweicloud.sdk.elb.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListHealthmonitorsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "healthmonitors")

    @JacksonXmlProperty(localName = "healthmonitors")

    private List<HealthmonitorResp> healthmonitors = null;

    public ListHealthmonitorsResponse withHealthmonitors(List<HealthmonitorResp> healthmonitors) {
        this.healthmonitors = healthmonitors;
        return this;
    }

    public ListHealthmonitorsResponse addHealthmonitorsItem(HealthmonitorResp healthmonitorsItem) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        this.healthmonitors.add(healthmonitorsItem);
        return this;
    }

    public ListHealthmonitorsResponse withHealthmonitors(Consumer<List<HealthmonitorResp>> healthmonitorsSetter) {
        if (this.healthmonitors == null) {
            this.healthmonitors = new ArrayList<>();
        }
        healthmonitorsSetter.accept(this.healthmonitors);
        return this;
    }

    /**
     * 健康检查对象的列表
     * @return healthmonitors
     */
    public List<HealthmonitorResp> getHealthmonitors() {
        return healthmonitors;
    }

    public void setHealthmonitors(List<HealthmonitorResp> healthmonitors) {
        this.healthmonitors = healthmonitors;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListHealthmonitorsResponse listHealthmonitorsResponse = (ListHealthmonitorsResponse) o;
        return Objects.equals(this.healthmonitors, listHealthmonitorsResponse.healthmonitors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(healthmonitors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHealthmonitorsResponse {\n");
        sb.append("    healthmonitors: ").append(toIndentedString(healthmonitors)).append("\n");
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
