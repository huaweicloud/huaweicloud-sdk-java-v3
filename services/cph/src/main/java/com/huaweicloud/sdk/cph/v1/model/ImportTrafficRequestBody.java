package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ImportTrafficRequestBody
 */
public class ImportTrafficRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "traffic_type")

    private String trafficType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_ids")

    private List<String> phoneIds = null;

    public ImportTrafficRequestBody withTrafficType(String trafficType) {
        this.trafficType = trafficType;
        return this;
    }

    /**
     * 手机路由类型 direct：默认路由 routing：路由到编码容器
     * @return trafficType
     */
    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType;
    }

    public ImportTrafficRequestBody withPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
        return this;
    }

    public ImportTrafficRequestBody addPhoneIdsItem(String phoneIdsItem) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        this.phoneIds.add(phoneIdsItem);
        return this;
    }

    public ImportTrafficRequestBody withPhoneIds(Consumer<List<String>> phoneIdsSetter) {
        if (this.phoneIds == null) {
            this.phoneIds = new ArrayList<>();
        }
        phoneIdsSetter.accept(this.phoneIds);
        return this;
    }

    /**
     * 手机id列表 一次调用最多支持100个
     * @return phoneIds
     */
    public List<String> getPhoneIds() {
        return phoneIds;
    }

    public void setPhoneIds(List<String> phoneIds) {
        this.phoneIds = phoneIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImportTrafficRequestBody that = (ImportTrafficRequestBody) obj;
        return Objects.equals(this.trafficType, that.trafficType) && Objects.equals(this.phoneIds, that.phoneIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trafficType, phoneIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportTrafficRequestBody {\n");
        sb.append("    trafficType: ").append(toIndentedString(trafficType)).append("\n");
        sb.append("    phoneIds: ").append(toIndentedString(phoneIds)).append("\n");
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
